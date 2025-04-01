package com.mayara.e_commerce.dtos;

import com.mayara.e_commerce.entities.Category;

public class CatergoryDTO {
    private Long id;
    private String name;

    public CatergoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public CatergoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
