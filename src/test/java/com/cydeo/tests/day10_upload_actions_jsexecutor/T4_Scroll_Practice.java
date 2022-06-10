package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Scroll_Practice {

    @Test
    public void scroll_test(){


        Driver.getDriver().get("https://practice.cydeo.com/ ");

        JavascriptExecutor js =  (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }


        WebElement poweredByCydeoText = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));
        Assert.assertTrue(poweredByCydeoText.isDisplayed());

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");
        }

        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        Assert.assertTrue(homeLink.isDisplayed());



        }



    }



