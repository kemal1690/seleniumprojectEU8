package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) {

        //1. set up the browser driver

        WebDriverManager.chromedriver().setup();

        //2.Create instance of the Selenium WebDriver
        //This line opens an empty browser

        WebDriver driver = new ChromeDriver();

        //3.Lets go to https://www.tesla.com

        driver.get("https://www.tesla.com");

















    }
}
