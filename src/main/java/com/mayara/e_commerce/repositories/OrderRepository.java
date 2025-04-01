package com.mayara.e_commerce.repositories;

import com.mayara.e_commerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> {



}
