package com.cydeo.weeklyReview.week03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_VerifyCheckBox {

    WebDriver driver;
    @BeforeMethod
         public void loginToWeb(){

            driver = WebDriverFactory.getDriver("chrome");

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get(" http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        }
        @Test

        public void testMethod() throws InterruptedException {

            WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
            userName.sendKeys("Tester");

            WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
            password.sendKeys("test");

            WebElement logIn = driver.findElement(By.xpath("//input[@type='submit']"));
            logIn.click();


            WebElement checkAll = driver.findElement(By.xpath("//a[.='Check All']"));

            checkAll.click();

            Thread.sleep(3000);





        }
















    }

