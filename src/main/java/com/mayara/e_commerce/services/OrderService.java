package com.mayara.e_commerce.services;
import com.mayara.e_commerce.dtos.CatergoryDTO;
import com.mayara.e_commerce.dtos.OrderDTO;
import com.mayara.e_commerce.dtos.ProductDTO;
import com.mayara.e_commerce.dtos.ProductMinDTO;
import com.mayara.e_commerce.entities.Category;
import com.mayara.e_commerce.entities.Order;
import com.mayara.e_commerce.entities.Product;
import com.mayara.e_commerce.repositories.OrderRepository;
import com.mayara.e_commerce.repositories.ProductRepository;
import com.mayara.e_commerce.services.exceptions.DatabaseException;
import com.mayara.e_commerce.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                ()->  new ResourceNotFoundException("não encontrado"));
        return new OrderDTO(order);
    }

}
