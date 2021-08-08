package com.jankowski.fooddiary.repository;

import com.jankowski.fooddiary.model.Meal;
import com.jankowski.fooddiary.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface MealRepository extends JpaRepository <Meal, Long> {


}
