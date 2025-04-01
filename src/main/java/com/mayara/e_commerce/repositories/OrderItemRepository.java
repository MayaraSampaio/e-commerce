package com.mayara.e_commerce.repositories;

import com.mayara.e_commerce.entities.OrderItem;
import com.mayara.e_commerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
