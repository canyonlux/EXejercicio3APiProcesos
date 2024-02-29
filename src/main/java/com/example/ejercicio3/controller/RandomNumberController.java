package com.example.ejercicio3.controller;

import com.example.ejercicio3.model.RandomNumber;
import com.example.ejercicio3.service.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/random")
public class RandomNumberController { //clase que representa el controlador de la aplicación

    @Autowired
    private RandomNumberService randomNumberService;

    @GetMapping("/numbers")  //método que retorna una lista de números aleatorios
    public List<RandomNumber> getRandomNumbers() {
        return randomNumberService.generateRandomNumbers(100);
    }

    @GetMapping("/number/{d}") //método que retorna un número aleatorio con la cantidad de dígitos ingresada
    public RandomNumber getRandomNumberWithDigits(@PathVariable int d) {
        return new RandomNumber(randomNumberService.generateNumberWithDigits(d));
    }

    @PutMapping("/number") //método que retorna un número aleatorio con la misma cantidad de dígitos que el número ingresado
    public RandomNumber updateRandomNumber(@RequestBody RandomNumber randomNumber) {
        return new RandomNumber(randomNumberService.generateNumberWithSameDigits((int) randomNumber.getRandom()));
    }
}
