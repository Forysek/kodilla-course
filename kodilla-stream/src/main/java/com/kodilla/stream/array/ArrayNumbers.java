package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayNumbers {

    public double getAverage(int[] numbers) {
        getAllItems( numbers );
        double averageNumber;
        IntStream intStream = Arrays.stream(numbers);
        averageNumber = intStream
                .average().getAsDouble();
        return averageNumber;
    }

    private void getAllItems(int[] numbers){
        IntStream intStream = Arrays.stream(numbers);
        intStream
                .forEach(System.out::println);
    }




}



