package com.demoqa.utils;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArray {

    public String[] generateRandomArray(String[] valuesList) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int randomNumber = random.nextInt(1, valuesList.length)+1;
        String[] values = new String[randomNumber];
        for (int i = 0; i < randomNumber; i++) {
            String value = valuesList[random.nextInt(valuesList.length)];
            if (Arrays.asList(values).contains(value)) {
                i--;
            } else {
                values[i] = value;
            }
        }
        return values;
    }
}
