package com.mayara.e_commerce.dtos;

import com.mayara.e_commerce.entities.Category;
import com.mayara.e_commerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;


public class ProductDTO {
    private Long id;
    @Size(min= 3, max= 80, message = "Nome precisa ter no mínimo 3 e no máximo 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;
    @Size(min= 10, message = "Description precisa ter no mínimo 10 caracteres")
    @NotBlank(message = "Campo requerido")
    private String description;
    @Positive(message = "O preço deve ser positivo")
    private Double price;
    private String imgUrl;
    @NotEmpty(message = "Deve conter pelo menos 1 categoria")
    private List<CatergoryDTO> categories = new ArrayList<>();

    public ProductDTO(){}

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description= entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();

        for (Category cat : entity.getCategories()){
            categories.add(new CatergoryDTO(cat));

        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public List<CatergoryDTO> getCategories() {
        return categories;
    }
}
