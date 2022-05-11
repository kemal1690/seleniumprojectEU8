package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes  ");

        WebElement logInButton = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));

        logInButton.sendKeys("incorrect");

        WebElement resetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));

        resetPassword.click();

        WebElement logInFault = driver.findElement(By.cssSelector("div[class='errortext']"));

        String expectedText = "Login or E-mail not found";
        String actualText = logInFault.getText();

        System.out.println("actualText = " + actualText);

        if(expectedText.equals(actualText)){

            System.out.println("Passed");
        }else{
            System.out.println("failed");
        }





    }
}
