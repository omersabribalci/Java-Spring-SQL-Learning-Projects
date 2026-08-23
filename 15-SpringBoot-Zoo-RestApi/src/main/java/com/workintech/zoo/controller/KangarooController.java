package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.exceptions.ZooException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/kangaroos")
public class KangarooController {
    private Map<Integer, Kangaroo> kangaroos;

    @PostConstruct
    public void init() {
        kangaroos = new HashMap<>();
        kangaroos.put(1, new Kangaroo(1, "Kango", 200, 120, "Male", true));
    }

    @GetMapping("")
    public List<Kangaroo> getAllKangaroos() {
        if(kangaroos.isEmpty()) throw new ZooException("There is no any kangaroo in the zoo.", HttpStatus.NOT_FOUND);
        return kangaroos.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Kangaroo getKangarooById(@PathVariable int id) {
        if (id <= 0) throw new ZooException("ID cannot be zero and below!", HttpStatus.BAD_REQUEST);

        if (!kangaroos.containsKey(id))
            throw new ZooException("Kangaroo with this ID does not exist." + " ID: " + id, HttpStatus.NOT_FOUND);

        return kangaroos.get(id);
    }

    @PostMapping("")
    public Kangaroo newKangaroo(@RequestBody Kangaroo kangaroo) {
        if (kangaroo.getName() == null || kangaroo.getName().isBlank())
            throw new ZooException("Kangaroo name cannot be empty.", HttpStatus.BAD_REQUEST);

        kangaroos.put(kangaroo.getId(), kangaroo);
        return kangaroo;
    }

    @PutMapping("/{id}")
    public Kangaroo updateKangaroo(@PathVariable int id, @RequestBody Kangaroo kangaroo) {
        if (id <= 0)
            throw new ZooException("ID cannot be zero and below!", HttpStatus.BAD_REQUEST);

        if (!kangaroos.containsKey(id))
            throw new ZooException("Kangaroo with this ID does not exist. ID: " + id, HttpStatus.NOT_FOUND);

        kangaroo.setId(id);
        kangaroos.put(id, kangaroo);
        return kangaroo;
    }

    @DeleteMapping("/{id}")
    public Kangaroo deleteKangaroo(@PathVariable int id) {
        if (id <= 0)
            throw new ZooException("ID cannot be zero and below!", HttpStatus.BAD_REQUEST);

        if (!kangaroos.containsKey(id))
            throw new ZooException("Kangaroo with this ID does not exist. ID: " + id, HttpStatus.NOT_FOUND);


        Kangaroo kangaroo = kangaroos.get(id);
        kangaroos.remove(id);
        return kangaroo;
    }


}
