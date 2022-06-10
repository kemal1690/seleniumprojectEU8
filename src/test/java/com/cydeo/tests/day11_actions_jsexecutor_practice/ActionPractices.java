package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void task_4_and_5_test() {
        //TC #4: Scroll practice
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        //Create object of Actions and pass our "driver" instance

        Actions actions = new Actions(Driver.getDriver());
        //Locating cydeo link to be able to pass in the actions method
        //a[@href='https://cydeo.com/']

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();//This is first way for scrolling

        //5- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();//This is the second way for scrolling.This doesnt page up not much
                                                                //Thats why Key.PAGE_UP/DOWN is not preferable

        //Driver.getDriver().quit();
        //Driver.getDriver().close();
        //These give exceptions. Because quit() and close() methods work with driver. like driver.quit()

        //Driver.getDriver().quit();
        Driver.closeDriver();//By using this we can do another test

    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test4(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }


    }
    /*
    How to handle Closing or Quitting driver with Driver utility class?

        --> When we created a new .getDriver() method in Driver utility class and implemeted Singleton design pattern.

        --> This design pattern requires my driver to be "driver == null (true)" to be able to generate a new driver.

        --> When we use default driver.quit() method that is coming from Selenium library, we terminate the existing driver session completely.

        --> This creates issue for our existing structure. Since driver is not null or session is completely deleted/terminated, we cannot continue with our execution of following tests.

        --> To solve this issue, we created Driver.closeDriver() method.
        --> In this method 2 thing are happening:
        #1- We use driver.quit() to terminate the session and close browsers.
        #2- Set the driver session value back to "null", so rest of our tests can be executed.



    This method will make sure our driver value is always null after using quit() method

public static void closeDriver(){
        if (driver != null){
        driver.quit(); // this line will terminate the existing session. value will not even be null
        driver = null;
        }
        }

     */


