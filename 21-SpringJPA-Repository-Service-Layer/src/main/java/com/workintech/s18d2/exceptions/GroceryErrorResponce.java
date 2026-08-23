package com.workintech.s18d2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroceryErrorResponce {
    private int status;
    private String message;
    private Long timestamp;

    public GroceryErrorResponce(String message) {
        this.message = message;
    }
}
