package com.example.ejercicio3.service;

import com.example.ejercicio3.model.RandomNumber;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class RandomNumberService { //clase que genera números aleatorios


    // GET URL: http://localhost:8080/random/numbers
    public List<RandomNumber> generateRandomNumbers(int count) { //método que genera una lista de números aleatorios
        return IntStream.range(0, count)
                .mapToObj(i -> new RandomNumber(new Random().nextInt()))
                .collect(Collectors.toList());
    }


    //  GET http://localhost:8080/random/number/5. El número 5 es el número de dígitos que se desea que tenga el número aleatorio
    public int generateNumberWithDigits(int d) { //método que genera un número aleatorio
        int min = (int) Math.pow(10, d - 1);
        return min + new Random().nextInt(9 * min);
    }
// PUT URL: http://localhost:8080/random/number
    public int generateNumberWithSameDigits(int number) { //método que genera un número aleatorio con la misma cantidad de dígitos que el número ingresado
        int digits = (int) Math.log10(number) + 1;
        return generateNumberWithDigits(digits);
    }
}
