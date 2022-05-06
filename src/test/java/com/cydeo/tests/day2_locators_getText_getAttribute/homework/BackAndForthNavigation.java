package com.cydeo.tests.day2_locators_getText_getAttribute.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BackAndForthNavigation {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.google.com ");

        WebElement gMail = driver.findElement(By.linkText("Gmail"));
        gMail.click();

        String expectedTitle = "Gmail: Ücretsiz, Gizli ve Güvenli E-posta | Google Workspace";

        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.contains("Gmail")){

            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.navigate().back();

        expectedTitle = "Google";
         actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){

            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }





















    }
}
