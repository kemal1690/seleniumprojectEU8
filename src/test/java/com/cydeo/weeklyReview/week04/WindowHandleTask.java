package com.cydeo.weeklyReview.week04;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleTask {
 /*
    automate the following scenarios for this website https://shino.de/parkcalc/
Scenario 1)
-  Using the Valet parking lot, set today as the entry date & time and tomorrow as the exit giving a full 24 hour window (you can attempt to use the DatePicker).
     */

    /*
    When we have more than one window is opened how can we switch to different windows
    getWindowHandles() ----> Set of Strings : we want to take out any duplicate values
    driver.switchTo().window(string of windowHandle)
     */

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void window_handle_test() {

        driver.get("https://shino.de/parkcalc/");

        String mainWindowHandle = driver.getWindowHandle();

        WebElement calendar1 = driver.findElement(By.xpath("//img[@src='cal.gif'][1]"));
        calendar1.click();

        Set<String> windowHandles = driver.getWindowHandles();


        for (String windowHandle : windowHandles) {

            driver.switchTo().window(windowHandle);

            if (driver.getCurrentUrl().contains("Pick a Date")) {

                break;
            }


        }

        driver.findElement(By.xpath("//a[.='24']")).click();

        driver.switchTo().window(mainWindowHandle);

        BrowserUtils.sleep(3);

            WebElement calendar2 = driver.findElement(By.xpath("//input[@name='LeavingTime']/..//img"));
            calendar2.click();

            driver.findElement(By.xpath("//a[.='25']")).click();
            driver.quit();



    }
}