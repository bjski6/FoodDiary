package com.jankowski.fooddiary.controller;

import com.jankowski.fooddiary.model.Cuisine;
import com.jankowski.fooddiary.model.Meal;
import com.jankowski.fooddiary.model.Product;
import com.jankowski.fooddiary.service.CuisineService;
import com.jankowski.fooddiary.service.MealService;
import com.jankowski.fooddiary.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@SessionAttributes("id")
public class MealController {

    private final MealService mealService;
    private final ProductService productService;
    private final CuisineService cuisineService;


    public MealController(MealService mealService, ProductService productService, CuisineService cuisineService) {
        this.mealService = mealService;
        this.productService = productService;
        this.cuisineService = cuisineService;
    }

    @GetMapping("mealAdd")
    public String mealAddForm(Model model) {
        Meal meal = new Meal();
        List<Cuisine> cuisineList = cuisineService.findAllSortedByName();
        model.addAttribute("meal", meal);
        model.addAttribute("cuisineList", cuisineList);
        return "mealAdd";
    }

    @PostMapping("mealAdd")
    public String mealAdd(@ModelAttribute @Valid Meal meal, BindingResult result, Model model) {
        if(result.hasErrors()){
            List<Cuisine> cuisineList = cuisineService.findAllSortedByName();
            model.addAttribute("cuisineList", cuisineList);
            return "mealAdd";
        }
        mealService.save(meal);
        return "redirect:/mealList";
    }


    @GetMapping("mealList")
    public String mealList(Model model) {
        List<Meal> mealList = mealService.findAllSortedByName();
        model.addAttribute("mealList", mealList);
        return "mealList";
    }

    @GetMapping("mealDetails/{id}")
    public String mealDetails(@PathVariable Long id, Model model) {
        Meal meal = mealService.findById(id);
        model.addAttribute("id", id);
        model.addAttribute("meal", meal);
        model.addAttribute("productList", meal.getProductList());
        model.addAttribute("weight", productService.sumWeight(id));
        model.addAttribute("protein", productService.sumProtein(id));
        model.addAttribute("carbohydrates", productService.sumCarbohydrates(id));
        model.addAttribute("fat", productService.sumFat(id));
        model.addAttribute("calories", productService.sumCalories(id));
        return "mealDetails";
    }

    @GetMapping("mealProductAdd")
    public String mealProductAddForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "mealProductAdd";
    }

    @PostMapping("mealProductAdd")
    public String mealProductAdd(@ModelAttribute @Valid Product product, BindingResult result, HttpSession session) {
        if(result.hasErrors()){
            return "mealProductAdd";
        }
        product.setCalories();
        Meal meal = mealService.findById((Long) session.getAttribute("id"));
        product.setCalories();
        product.setMeal(meal);
        productService.save(product);
        mealService.addProductToList(product, meal);
        mealService.save(meal);
        return "redirect:/mealDetails/"+ meal.getId();
    }

    @GetMapping("mealDelete/{id}")
    public String mealDelete(@PathVariable Long id) {
        mealService.delete(id);
        return "redirect:/mealList";
    }

    @GetMapping("mealEdit")
    public String mealEditForm(Model model, HttpSession session) {
        Meal meal = mealService.findById((Long) session.getAttribute("id"));
        List<Cuisine> cuisineList = cuisineService.findAll();
        model.addAttribute("cuisineList",cuisineList);
        model.addAttribute("meal", meal);
        model.addAttribute("productList", meal.getProductList());
        return "mealEdit";
    }

    @PostMapping("mealEdit")
    public String mealEdit (@ModelAttribute @Valid Meal meal, BindingResult result){
            if(result.hasErrors()){
                return "mealEdit";
            }
         mealService.save(meal);
         return "redirect:/mealDetails/"+meal.getId();
    }

    @GetMapping("deleteProduct/{id}")
    public String productDelete(@PathVariable Long id) {
        productService.delete(id);
        return "redirect:/mealEdit";
    }


}
