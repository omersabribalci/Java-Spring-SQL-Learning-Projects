package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.entity.Koala;
import com.workintech.zoo.exceptions.ZooException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/koalas")
public class KoalaController {
    private Map<Integer, Koala> koalas;

    @PostConstruct
    public void init() {
        koalas = new HashMap<>();
        koalas.put(1, new Koala(1, "koalacik", 100, 15, "Female"));
    }

    @GetMapping("")
    public List<Koala> getAllKoalas() {
        if(koalas.isEmpty()) throw new ZooException("There is no any koala in the zoo.", HttpStatus.NOT_FOUND);
        return koalas.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Koala getKoalaById(@PathVariable int id) {
        if (id <= 0) throw new ZooException("ID cannot be zero and below!", HttpStatus.BAD_REQUEST);

        if (!koalas.containsKey(id))
            throw new ZooException("Koalas with this ID does not exist." + " ID: " + id, HttpStatus.NOT_FOUND);

        return koalas.get(id);
    }

    @PostMapping("")
    public Koala newKoala(@RequestBody Koala koala) {
        if (koala.getName() == null || koala.getName().isBlank())
            throw new ZooException("Koala name cannot be empty.", HttpStatus.BAD_REQUEST);

        koalas.put(koala.getId(), koala);
        return koala;
    }

    @PutMapping("/{id}")
    public Koala updateKoala(@PathVariable int id, @RequestBody Koala koala) {
        if (id <= 0)
            throw new ZooException("ID cannot be zero and below!", HttpStatus.BAD_REQUEST);

        if (!koalas.containsKey(id))
            throw new ZooException("Koala with this ID does not exist. ID: " + id, HttpStatus.NOT_FOUND);

        koala.setId(id);
        koalas.put(id, koala);
        return koala;
    }

    @DeleteMapping("/{id}")
    public Koala deleteKoala(@PathVariable int id) {
        if (id <= 0)
            throw new ZooException("ID cannot be zero and below!", HttpStatus.BAD_REQUEST);

        if (!koalas.containsKey(id))
            throw new ZooException("Koala with this ID does not exist. ID: " + id, HttpStatus.NOT_FOUND);


        Koala koala = koalas.get(id);
        koalas.remove(id);
        return koala;
    }
}
