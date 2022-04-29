package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        //1.Setting up the web driver manager
        // We create our "Browser Driver"
        WebDriverManager.chromedriver().setup();//bonigarcia located im pom.xml

        //2.Create instance of the chrome driver

        WebDriver driver = new ChromeDriver();//This is our first selenium line and opens browser

        //3.Test if driver is working as expected

        driver.get("https://www.google.com");//selenium method











    }
}
