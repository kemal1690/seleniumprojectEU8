package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FindElements1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(" https://practice.cydeo.com/dropdown  ");
    }


    @Test

    public void SimpleDropdownTest() {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String expectedText = "Please select an option";

        String actualText = dropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedText, actualText);

    }


}

