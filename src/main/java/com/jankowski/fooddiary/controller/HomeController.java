package com.jankowski.fooddiary.controller;

import com.jankowski.fooddiary.service.MealService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final MealService mealService;

    public HomeController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/")
    public String homePage(){
        return "/homePage";
    }
}
