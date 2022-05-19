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

public class T2_Alert_Ptactice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts ");
    }

    @Test
    public void confirmTest(){

        WebElement confirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

       confirmButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(),"result text is not displayed");

        String expectedTest = "You clicked: Ok";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText,expectedTest,"result text is not as expected!");

    }


}
