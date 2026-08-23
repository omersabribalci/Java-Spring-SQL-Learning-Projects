package com.workintech.s18d1.util;

import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.exceptions.BurgerException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
public class BurgerValidation {
    public static void checkBurgerExist(Burger burger) {
        if (burger == null) {
            log.error("Bu id ile burger yok!");
            throw new BurgerException("Bu id ile burger yok!", HttpStatus.NOT_FOUND);
        }
    }
}
