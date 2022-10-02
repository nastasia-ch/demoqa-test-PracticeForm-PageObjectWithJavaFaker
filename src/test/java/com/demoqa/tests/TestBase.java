package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.utils.RandomArray;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TestBase {

    Faker faker = new Faker(new Locale("en"));

    String firstName = faker.name().firstName(),
           lastName = faker.name().lastName(),
           email = faker.internet().emailAddress(),
           //gender = "Female",
           phoneNumber = faker.phoneNumber().subscriberNumber(10),
           monthOfBirth = "January",
           yearOfBirth = "1995",
           dayOfBirth = "12",
           pictureName = "raccoon.jpeg",
           currentAddress = faker.address().fullAddress(),
           state = "NCR",
           city = "Delhi";

    ThreadLocalRandom random = ThreadLocalRandom.current();

    List<String> genderList = Arrays.asList("Male","Female","Other");
    String gender = genderList.get(random.nextInt(genderList.size()));

    private RandomArray randomArray = new RandomArray();
    String[] hobbiesList = {"Sports", "Reading", "Music"};
    String[] hobbies = randomArray.generateRandomArray(hobbiesList);


    String[] subjectsList = {"Accounting","Arts","Biology","Civics","Chemistry",
            "Computer Science","Commerce","Economics","English","Hindi",
            "History","Maths","Physics","Social Studies"};
    String[] subjects = randomArray.generateRandomArray(subjectsList);

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }
}
