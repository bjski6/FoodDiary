package com.jankowski.fooddiary.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min=2, max = 30, message = "Wprowadź nazwę")
    private String name;

    @NotNull
    @Max(value = 100, message = "wprowadź prawidłową wartość")
    private Integer carbohydrates;
    @NotNull
    @Max(value = 100, message = "wprowadź prawidłową wartość")
    private Integer fat;
    @NotNull
    @Max(value = 100, message = "wprowadź prawidłową wartość")
    private Integer protein;
    @NotNull
    private Integer calories;
    @NotNull
    private Integer weight;

    @ManyToOne
    private Meal meal;


    @Transient
    public Integer setCalories() {
        calories = (carbohydrates * 4) + (protein * 4) + (fat * 9);
        return calories;
    }

}
