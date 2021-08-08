package com.jankowski.fooddiary.service;

import com.jankowski.fooddiary.model.Product;
import com.jankowski.fooddiary.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void save(Product product) {
        int sumMacronutrients = product.getProtein() + product.getFat() + product.getCarbohydrates();
        if (sumMacronutrients > 100 || sumMacronutrients > product.getWeight()) {
            throw new IllegalArgumentException("sum of weight must be <= 100g");
        }
        productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Integer sumWeight(Long id) {
        return productRepository.sumWeight(id);
    }

    public Integer sumProtein(Long id) {
        return productRepository.sumProtein(id);
    }

    public Integer sumCarbohydrates(Long id) {
        return productRepository.sumCarbohydrates(id);
    }

    public Integer sumFat(Long id) {
        return productRepository.sumFat(id);
    }

    public Integer sumCalories(Long id) {
        return productRepository.sumCalories(id);
    }


}
