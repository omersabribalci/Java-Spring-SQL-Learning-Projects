package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitService {

    List<Fruit> getByPriceAsc();
    Fruit getById(Long id);
    List<Fruit> getByPriceDesc();

    Fruit save(Fruit fruit);

    List<Fruit> searchByName(String name);

    Fruit delete(Long id);
}


