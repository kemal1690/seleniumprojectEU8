package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {

        //TC#3: Google search
        //1- Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Write “apple” in search box
        //4- PRESS ENTER using Keys.ENTER
        WebElement googleSearchBox = driver.findElement(By.name("q"));//to locate the searchbox
        //name="q" we get that from google search box incele in the write side we find name end locate q
        //this checks the "name" attribute and returns the first value
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);//writes "apple" to the search box and hit the ENTER



        //5- Verify title:
        //Expected: Title should start with “apple” word

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){

            System.out.println("Title Verification PASSED!");
        }else{

            System.out.println("Title Verification FAILED!");
        }







    }
}
