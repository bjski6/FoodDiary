package com.jankowski.fooddiary.service;

import com.jankowski.fooddiary.model.Cuisine;
import com.jankowski.fooddiary.model.Meal;
import com.jankowski.fooddiary.model.Product;
import com.jankowski.fooddiary.repository.MealRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class MealService {

    private final MealRepository mealRepository;

    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public void save(Meal meal) {
        mealRepository.save(meal);
    }

    public void delete(Long id){
        mealRepository.deleteById(id);
    }

    public List<Meal> findAll() {
        return mealRepository.findAll();
    }

    public List<Meal> findAllSortedByName() {
        List<Meal> mealList = mealRepository.findAll();
        mealList.sort((m1, m2)->m1.getName().compareToIgnoreCase(m2.getName()));
        return mealList;
    }

    public Meal findById(Long id) {
        return mealRepository.findById(id).orElseThrow(() -> new NoSuchElementException("not found"));
    }

    public void addProductToList(Product product, Meal meal) {
        meal.getProductList().add(product);
    }



}
