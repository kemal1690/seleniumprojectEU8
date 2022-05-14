package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocatorsPractice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("http://practice.cydeo.com/multiple_buttons  ");

        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        button1 = driver.findElement(By.cssSelector("p[id='result']"));
        String actualText = button1.getText();

        System.out.println("actualText = " + actualText);

        String expectedText = "Clicked on button one!";

        if(actualText.equals(expectedText)){

            System.out.println("passed");
        }else{
            System.out.println("failed");
        }












    }
}
