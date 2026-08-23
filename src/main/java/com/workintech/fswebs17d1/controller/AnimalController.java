package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AnimalController {
    Map<Integer, Animal> animals = new HashMap<>();

    public AnimalController() {
        animals.put(2, new Animal(2, "Cat"));
        animals.put(3, new Animal(3, "Bird"));
        animals.put(4, new Animal(4, "Lion"));
    }

    @GetMapping("/workintech/animal")
    public List<Animal> getAnimals() {
        return animals.values().stream().toList();
    }

    @GetMapping("/workintech/animal/{id}")
    public Animal getAnimalById(@PathVariable int id) {
        if (!animals.containsKey(id)) {
            System.out.println("Animal not found.");
            return null;
        }
        return animals.get(id);
    }

    @PostMapping("/workintech/animal")
    public void addAnimal(@RequestBody Animal animal) {
        if (animals.containsValue(animal)) {
            System.out.println("Animal already exist!");
            return;
        }
        animals.put(animal.getId(), animal);
        System.out.println("Animal added! " + animal.getName());
    }

    @PutMapping("/workintech/animal/{id}")
    public void updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
        if (!animals.containsKey(id)) {
            System.out.println("Animal not found.");
            return;
        }
        animals.put(id, animal);
        System.out.println("Animal updated!");
    }

    @DeleteMapping("/workintech/animal/{id}")
    public void deleteAnimal(@PathVariable int id) {
        if (!animals.containsKey(id)) {
            System.out.println("Animal not found.");
            return;
        }
        animals.remove(id);
        System.out.println("Animal removed from list.");

    }

    @PostConstruct
    public void init() {
        animals.put(2, new Animal(2, "Cat"));
        animals.put(3, new Animal(3, "Bird"));
        animals.put(4, new Animal(4, "Lion"));
    }

}
