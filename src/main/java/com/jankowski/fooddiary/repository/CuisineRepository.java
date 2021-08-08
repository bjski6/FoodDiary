package com.jankowski.fooddiary.repository;

import com.jankowski.fooddiary.model.Cuisine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuisineRepository extends JpaRepository <Cuisine, Long> {

}
