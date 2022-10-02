package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.utils.RandomArray;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

import java.util.*;

public class TestBase {

    Faker faker = new Faker(new Locale("en"));

    String firstName = faker.name().firstName(),
           lastName = faker.name().lastName(),
           email = faker.internet().emailAddress(),
           phoneNumber = faker.phoneNumber().subscriberNumber(10),
           monthOfBirth = "January",
           yearOfBirth = "1995",
           dayOfBirth = "12",
           pictureName = "raccoon.jpeg",
           currentAddress = faker.address().fullAddress();
           //state = "NCR",
           //city = "Delhi";

    private RandomArray randomArray = new RandomArray();

    String[] genderList = {"Male","Female","Other"};
    String gender = randomArray.chooseOneRandomValueFromArray(genderList);

    String[] hobbiesList = {"Sports", "Reading", "Music"};
    String[] hobbies = randomArray.chooseFewRandomValuesFromArray(hobbiesList);


    String[] subjectsList = {"Accounting","Arts","Biology","Civics","Chemistry",
            "Computer Science","Commerce","Economics","English","Hindi",
            "History","Maths","Physics","Social Studies"};
    String[] subjects = randomArray.chooseFewRandomValuesFromArray(subjectsList);

    String[] statesList = {"NCR","Uttar Pradesh","Haryana","Rajasthan"};
    String[] citiesNCRList = {"Delhi","Gurgaon","Noida"};
    String[] citiesUttarPradeshList = {"Agra","Lucknow","Merrut"};
    String[] citiesHaryanaList = {"Karnal","Panipat"};
    String[] citiesRajasthan = {"Jaipur","Jaiselmer"};

    String state = randomArray.chooseOneRandomValueFromArray(statesList);
    String city = chooseCity();

    public String chooseCity() {
        switch (state) {
            case ("NCR"):
                city = randomArray.chooseOneRandomValueFromArray(citiesNCRList);
                break;
            case ("Uttar Pradesh"):
                city = randomArray.chooseOneRandomValueFromArray(citiesUttarPradeshList);
                break;
            case ("Haryana"):
                city = randomArray.chooseOneRandomValueFromArray(citiesHaryanaList);
                break;
            case ("Rajasthan"):
                city = randomArray.chooseOneRandomValueFromArray(citiesRajasthan);
                break;
        }
        return city;
    }



    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }
}
