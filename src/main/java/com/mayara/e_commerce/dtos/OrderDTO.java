package com.mayara.e_commerce.dtos;

import com.mayara.e_commerce.entities.Order;
import com.mayara.e_commerce.entities.OrderItem;
import com.mayara.e_commerce.entities.OrderStatus;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
    private Long id;
    private Instant moment;
    private OrderStatus status;
    private ClientDTO client;
    private PaymentDTO payment;

    private List<OrderItemDTO> items = new ArrayList<>();

    public OrderDTO(Long id, Instant moment, OrderStatus status, ClientDTO client, PaymentDTO payment) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.payment = payment;
    }
    public OrderDTO(Order entity) {
        id = entity.getId();
        moment= entity.getMoment();
        status = entity.getStatus();
        client = new ClientDTO(entity.getClient());
        payment = (entity.getPayment() == null) ? null : new PaymentDTO(entity.getPayment());
        for (OrderItem item : entity.getItems()) {
            OrderItemDTO orderItem = new OrderItemDTO(item);
            items.add(orderItem);
        }

    }

    public Double getTotal() {
        return items.stream().mapToDouble(OrderItemDTO::getSubTotal).sum();
    }
    public List<OrderItemDTO> getItems() {
        return items;
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public ClientDTO getClient() {
        return client;
    }

    public PaymentDTO getPayment() {
        return payment;
    }
}
