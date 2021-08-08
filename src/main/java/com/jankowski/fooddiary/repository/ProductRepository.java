package com.jankowski.fooddiary.repository;

import com.jankowski.fooddiary.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

 @Query(value = "select sum(calories) from product where meal_id=?1", nativeQuery = true)
 Integer sumCalories (Long id);

 @Query(value = "select sum(protein) from product where meal_id=?1", nativeQuery = true)
 Integer sumProtein (Long id);

 @Query(value = "select sum(carbohydrates) from product where meal_id=?1", nativeQuery = true)
 Integer sumCarbohydrates (Long id);

 @Query(value = "select sum(fat) from product where meal_id=?1", nativeQuery = true)
 Integer sumFat (Long id);

 @Query(value = "select sum(weight) from product where meal_id=?1", nativeQuery = true)
 Integer sumWeight (Long id);


 }
