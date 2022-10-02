package com.demoqa.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Random;

public class RandomDate {

    private String[] generateRandomDate() {

        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2100, 12, 31).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().
                appendPattern("dd LLLL yyyy").
                toFormatter(Locale.US);

        String changedFormatRandomBirthDate = randomBirthDate.format(formatter);

        String[] componentsOfBirthDate = changedFormatRandomBirthDate.split(" ");

        return componentsOfBirthDate;
    }

    public String getRandomDay() {
        String randomDay = generateRandomDate()[0];
        return randomDay;
    }

    public String getRandomMonth() {
        String randomMonth = generateRandomDate()[1];
        return randomMonth;
    }

    public String getRandomYear() {
        String randomYear = generateRandomDate()[2];
        return randomYear;
    }

}
