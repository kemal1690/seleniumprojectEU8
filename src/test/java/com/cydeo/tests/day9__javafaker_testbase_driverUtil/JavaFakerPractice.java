package com.cydeo.tests.day9__javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        //Creating Faker object to reach methods
        Faker faker = new Faker();
        //Faker faker = new Faker(new Locale("fr"));
        //This change the language.fr=French

        System.out.println("faker.name().firstName() = " + faker.name().firstName());//generates fake name each time

        System.out.println("faker.name().lastName() = " + faker.name().lastName());//generates fake last name each time

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //numerify() method will generate random numbers in the format we want to get

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));//this can be phone or credit card number

        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("312-###-####"));

        //letterify() method will return random letters where we pass "?"
        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???????"));

        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = " + faker.bothify("##?#-##?#-#?#?#-##??"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-",""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris","Muhtar"));
        //Chuck Norris can access the DB from the UI.












    }
}
