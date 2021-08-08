package com.jankowski.fooddiary.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 20, message = "Wprowadź nazwę")
    private String name;

    private String recipe;

    @OneToOne
    private Cuisine cuisine;

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="meal", cascade = CascadeType.REMOVE)
    private Set<Product> productList;



}
