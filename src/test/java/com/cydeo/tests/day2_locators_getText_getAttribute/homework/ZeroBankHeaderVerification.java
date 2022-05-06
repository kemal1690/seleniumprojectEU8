package com.cydeo.tests.day2_locators_getText_getAttribute.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZeroBankHeaderVerification {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html ");

        WebElement headerText = driver.findElement(By.tagName("h3"));

        String expectedHeaderText = "Log in to ZeroBank";

        String actualHeaderText = headerText.getText();

        System.out.println("actualHeaderText = " + actualHeaderText);

        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!!!");
        }











    }
}
