package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_Alert_Practice {

    WebDriver driver;

    @BeforeMethod

    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void promptTest(){

        WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        confirmButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

        WebElement helloText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(helloText.isDisplayed(), "text is not displayed");

        String expectedText = "You entered: hello";
        String actualText = helloText.getText();

        Assert.assertEquals(actualText,expectedText,"actual text is not as expected");




    }



}
