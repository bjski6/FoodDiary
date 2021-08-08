package com.jankowski.fooddiary.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing calories depending on macronutrients")
class ProductTest {
    private Product product = new Product();

    @Test
    @DisplayName("Should return 170kcal")
    void setCalories() {
        //given
        Integer kcalExpected = 170;
        //when
        product.setName("product");
        product.setWeight(100);
        product.setProtein(10);
        product.setCarbohydrates(10);
        product.setFat(10);
        product.setCalories();
        //then
        assertEquals(kcalExpected, product.getCalories());

    }
}