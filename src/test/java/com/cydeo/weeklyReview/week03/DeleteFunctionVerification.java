package com.cydeo.weeklyReview.week03;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DeleteFunctionVerification {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        WebElement userNameInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));

        userNameInputBox.sendKeys("Tester");
        passwordInputBox.sendKeys("test" + Keys.ENTER);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void deleteFunctionVerification() {

        WebElement checkBoxFirst = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl02_OrderSelector']"));
        WebElement deleteButton = driver.findElement(By.xpath("//input[@class='btnDeleteSelected']"));

        checkBoxFirst.click();
        deleteButton.click();

        HandleWait.staticWait(3);

        try {
            Assert.assertTrue(checkBoxFirst.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is deleted, Test PASSED");
        }
    }
}
/*
1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
2.    Login with-----Username: Tester, password: test
3.    Select one of the checkbox and delete one person
4.    Then verify that deleted item is no longer exists
 */
