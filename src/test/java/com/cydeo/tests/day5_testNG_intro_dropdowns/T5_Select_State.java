package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Select_State {

    WebDriver driver;

    @BeforeMethod

    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void stateTest() throws InterruptedException {

        Select state = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        state.selectByVisibleText("Illinois");
        Thread.sleep(3000);
        state.selectByValue("VA");
        Thread.sleep(3000);
        state.selectByIndex(5);



    }





}
