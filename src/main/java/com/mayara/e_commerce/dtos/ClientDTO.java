package com.mayara.e_commerce.dtos;

import com.mayara.e_commerce.entities.User;

public class ClientDTO {
    private Long Id;
    private String name;


    public ClientDTO(Long id, String name) {
        Id = id;
        this.name = name;
    }

    public ClientDTO(User entity) {
        Id = entity.getId();
        name = entity.getName();
    }
    public Long getId() {
        return Id;
    }


    public String getName() {
        return name;
    }


}
