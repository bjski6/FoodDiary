package com.jankowski.fooddiary.service;

import com.jankowski.fooddiary.model.Cuisine;
import com.jankowski.fooddiary.repository.CuisineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuisineService {

    private final CuisineRepository cuisineRepository;

    public CuisineService(CuisineRepository cuisineRepository) {
        this.cuisineRepository = cuisineRepository;
    }

    public List<Cuisine> findAll(){
        return cuisineRepository.findAll();
    }

    public List<Cuisine> findAllSortedByName() {
        List<Cuisine> cuisineList = cuisineRepository.findAll();
        cuisineList.sort((c1, c2)->c1.getName().compareToIgnoreCase(c2.getName()));
        return cuisineList;
    }
}
