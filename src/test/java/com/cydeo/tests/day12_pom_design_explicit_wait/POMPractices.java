package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//by creating object we remove the posibility of StaleElementReferenceException
//Because everytime webElement location is getting refreshed
public class POMPractices {

    LibraryLoginPage libraryLoginPage;
    //if we use  LibraryLoginPage libraryLoginPage= new LibraryLoginPage(); here
    //it is gonna execute first test then will give NoSuchSession Exception
    //Because we are using the WebDriver through the object.
    //Thats why we must instantiate our object before every single test
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com/");
        libraryLoginPage = new LibraryLoginPage(); //this line calls PageFactory.initElements(Driver.getDriver(), this);-->from LibraryLoginPageClass
    }

    @Test
    public void required_field_error_message_test(){
        //TC #1: Required field error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        //3- Do not enter any information
        //4- Click to “Sign in” button

        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){
        //TC #2: Invalid email format error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        //3- Enter invalid email format

        libraryLoginPage.inputUsername.sendKeys("somethingwrong");

        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void library_negative_login_test(){
        //TC #3: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Enter incorrect username or incorrect password

        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");

        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        //We used isDisplayed(), because our locator has already located the text of the element
        Driver.closeDriver();

    }

}
/*
- How are we going to implement POM Design Pattern?

#1- Every time we create a java class for a new page of our application, we will initialize our driver instance and the object that class.

    - PageFactory.initElements(driver, this);
    - This method basically initializes the driver instance and the object of the class.
    - After this line we will be able to use THE OBJECT of the class, to reach the avaiable web elements.

#2- Instead of using .findElement method we will use @FindBy annotation


regular email format :
    sometext@domain.com
    sometext@domain.gov
    sometext@domain.edu

- When we implement POM Design pattern we solve StaleElementReferenceException by default.

- How it works?
    - Every time we want to use WebElement located using @FindBy annotation, it will be re-located in the line we are using it.
    - Basically it will automatically do a "fressness check" which will eliminate the StaleElementReferenceException
 */
