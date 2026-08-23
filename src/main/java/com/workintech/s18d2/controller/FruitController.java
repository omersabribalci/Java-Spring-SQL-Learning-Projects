package com.workintech.s18d2.controller;


import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import jakarta.validation.constraints.Positive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/fruit")
@CrossOrigin(origins = "*")
public class FruitController {
    private FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping("")
    public List<Fruit> getByPriceAsc() {
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public Fruit getById(@Positive @PathVariable Long id) {
        return fruitService.getById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> getByPriceDesc() {
        return fruitService.getByPriceDesc();
    }

    @PostMapping("")
    public Fruit save(@RequestBody Fruit fruit) {
        return fruitService.save(fruit);
    }

    @GetMapping("/name/{name}")
    public List<Fruit> searchByName(@PathVariable String name) {
        return fruitService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Fruit delete(@Positive @PathVariable Long id) {
        return fruitService.delete(id);
    }

}

