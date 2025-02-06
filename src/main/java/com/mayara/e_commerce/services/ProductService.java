package com.mayara.e_commerce.services;

import com.mayara.e_commerce.dtos.ProductDTO;
import com.mayara.e_commerce.entities.Product;
import com.mayara.e_commerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
