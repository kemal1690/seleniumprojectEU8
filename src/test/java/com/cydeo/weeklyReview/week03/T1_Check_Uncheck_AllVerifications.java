package com.cydeo.weeklyReview.week03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_Check_Uncheck_AllVerifications {

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
    public void checkAllVerification() {
        WebElement checkAllButton = driver.findElement(By.xpath("//a[.='Check All']"));
        checkAllButton.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement eachCheckBox : checkBoxes) {
            Assert.assertTrue(eachCheckBox.isSelected());
        }
    }

    @Test
    public void uncheckAllVerification() {
        WebElement uncheckAllButton = driver.findElement(By.xpath("//a[.='Uncheck All']"));
        uncheckAllButton.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement eachCheckBox : checkBoxes) {
            Assert.assertFalse(eachCheckBox.isSelected());
        }
    }
}
/*
1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
2.    Login with-----Username: Tester, password: test

3.    Click on check all button verify all the checkboxes are checked
4.    Click on uncheck all button verify that all the checkboxes are unchecked
 */

