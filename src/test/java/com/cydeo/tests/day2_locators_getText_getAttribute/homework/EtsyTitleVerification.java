package com.cydeo.tests.day2_locators_getText_getAttribute.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        WebElement searchBox = driver.findElement(By.name("search_query"));

        searchBox.sendKeys("Wooden Spoon"+ Keys.ENTER);

        String expectedTitle = "Wooden spoon | Etsy";

        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){

            System.out.println("Title verification PASSED");
        }else{

            System.out.println("Title verification FAILED");
        }













    }
}
