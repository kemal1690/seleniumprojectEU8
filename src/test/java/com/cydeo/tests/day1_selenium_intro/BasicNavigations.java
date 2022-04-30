package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1. set up the browser driver

        WebDriverManager.chromedriver().setup();

        //2.Create instance of the Selenium WebDriver
        //This line opens an empty browser

        WebDriver driver = new ChromeDriver();

        //this command maximizes the browser size
        driver.manage().window().maximize();

       // driver.manage().window().fullscreen();this is for mac user

        //3.Lets go to https://www.tesla.com

        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle = driver.getTitle();

        System.out.println("currentTitle = " + currentTitle);//currentTitle = Electric Cars, Solar & Clean Energy | Tesla

        //get the current URL using selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to(): same as .get() method
        driver.navigate().to("https://www.google.com");

        //get the current title after getting google page
        currentTitle = driver.getTitle();

        //System.out.println("driver.getTitle = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);//currentTitle = Google

        //get the current URL using selenium
       currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);// currentURL = https://www.google.com

        //this will close currently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();


    }
}
