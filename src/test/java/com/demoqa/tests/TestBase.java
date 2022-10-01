package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    String firstName = "Anna",
           lastName = "Stone",
           email = "ann-stone@gmail.com",
           gender = "Female",
           phoneNumber = "8000000000",
           monthOfBirth = "January",
           yearOfBirth = "1995",
           dayOfBirth = "12",
           pictureName = "raccoon.jpeg",
           currentAddress = "Current address",
           state = "NCR",
           city = "Delhi";

    String[] subjects = {"Maths","English","Chemistry"},
             hobbies = {"Music","Reading"};

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }

}
