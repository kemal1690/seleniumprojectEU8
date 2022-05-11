package com.cydeo.weeklyReview.week2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);

        WebElement UserNameLocate = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$username'"));
        UserNameLocate.sendKeys("Tester");

        WebElement passwordLocate = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordLocate.sendKeys("test");

        WebElement logInButton = driver.findElement(By.className("button"));
        logInButton.click();










    }
}
