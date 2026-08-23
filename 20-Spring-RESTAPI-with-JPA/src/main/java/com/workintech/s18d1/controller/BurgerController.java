package com.workintech.s18d1.controller;

import com.workintech.s18d1.dao.BurgerDao;
import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.exceptions.BurgerException;
import com.workintech.s18d1.util.BurgerValidation;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/burger")
@CrossOrigin(origins = "*")
public class BurgerController {
    private BurgerDao burgerDao;

    @Autowired
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }

    @PostMapping("")
    public Burger save(@RequestBody Burger burger) {


        return burgerDao.save(burger);
    }

    @GetMapping("/{id}")
    public Burger getBurgerById(@PathVariable Long id) {

        return burgerDao.findById(id);
    }

    @GetMapping("")
    public List<Burger> getAllBurgers() {
        return burgerDao.findAll();
    }

    @GetMapping("/price/{price}")
    public List<Burger> getBurgerByPrice(@PathVariable Integer price) {
        return burgerDao.findByPrice(price);
    }

    @GetMapping("/breadType/{breadType}")
    public List<Burger> getBurgerByBreadType(@PathVariable("breadType") String breadType) {
        BreadType btEnum = BreadType.valueOf(breadType);
        return burgerDao.findByBreadType(btEnum);
    }

    @GetMapping("/content/{content}")
    public List<Burger> getBurgerByContent(@PathVariable String content) {
        return burgerDao.findByContent(content);
    }

    @PutMapping("")
    public Burger update(@RequestBody Burger updatedBurger) {
        return burgerDao.update(updatedBurger);
    }

    @DeleteMapping("/{id}")
    public Burger remove(@PathVariable Long id) {
        return burgerDao.remove(id);
    }


}

