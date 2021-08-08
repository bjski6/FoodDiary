package com.jankowski.fooddiary.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NoSuchElementException.class)
    public String noSuchElementException() {
        return "noElement";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String illegalArgumentException() {
        return "wrongValues";
    }
}
