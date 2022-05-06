package com.cydeo.tests.day2_locators_getText_getAttribute.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorPractice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/inputs ");

        WebElement homeLink = driver.findElement(By.className("nav-link"));

        homeLink.click();

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);

        if(expectedTitle.equals(actualTitle)){

            System.out.println("Title verification PASSED");
        }else{

            System.out.println("Title verification FAILED");
        }















    }
}
