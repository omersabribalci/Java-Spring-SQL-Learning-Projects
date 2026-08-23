package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    @Query("SELECT v FROM Vegetable v ORDER BY v.price DESC")
    public List<Vegetable> orderVegetableByPriceDesc();

    @Query("SELECT v FROM Vegetable v ORDER BY v.price ASC")
    public List<Vegetable> orderVegetableByPriceAsc();

    @Query("SELECT v FROM Vegetable v WHERE LOWER(v.name) LIKE LOWER(CONCAT('%', :text, '%'))")
    List<Vegetable> searchVegetable(@Param("text") String text);
}
