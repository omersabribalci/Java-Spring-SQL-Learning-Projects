package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Burger", schema = "public")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Boolean isVegan;
    @Enumerated(EnumType.STRING)
    private BreadType breadType;
    private String contents;

    public void setIsVegan(boolean vegan) {
        isVegan = vegan;
    }

    public Boolean getIsVegan() {
        return isVegan;
    }
}
