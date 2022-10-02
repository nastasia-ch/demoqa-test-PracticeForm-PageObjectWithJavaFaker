package com.demoqa.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Random;

public class RandomDate {

    private String[] generateRandomDate() {

        // Генерация рандомной даты в пределах календаря из Practice Form
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2100, 12, 31).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

        // Перобразование формата 01-01-2000 в формат 01 January 2000
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().
                appendPattern("dd LLLL yyyy").
                toFormatter(Locale.US);

        String changedFormatRandomBirthDate = randomBirthDate.format(formatter);

        // Разделение даты на компоненты (дата, месяц, год) и запись их в массив
        String[] componentsOfBirthDate = changedFormatRandomBirthDate.split(" ");

        return componentsOfBirthDate;
    }

    // Получение из массива и запись в переменную randomDay значение дня
    public String getRandomDay() {
        String randomDay = generateRandomDate()[0];
        return randomDay;
    }

    // Получение из массива и запись в переменную randomMonth значение месяца
    public String getRandomMonth() {
        String randomMonth = generateRandomDate()[1];
        return randomMonth;
    }

    // Получение из массива и запись в переменную randomYear значение года
    public String getRandomYear() {
        String randomYear = generateRandomDate()[2];
        return randomYear;
    }

}
