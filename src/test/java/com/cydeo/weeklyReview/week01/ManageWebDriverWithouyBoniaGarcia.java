package com.cydeo.weeklyReview.week01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ManageWebDriverWithouyBoniaGarcia {


        public static void main(String[] args) {

            // without Bonie Garcia
        /*
        Get the driver which is suitable for your OS, and browser version
        Then give the path to Java System settings
         */
            System.setProperty("webdriver.chrome.driver","C:/Users/Oscar/Desktop/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.demoblaze.com/index.html");

            driver.close();
        }
}
