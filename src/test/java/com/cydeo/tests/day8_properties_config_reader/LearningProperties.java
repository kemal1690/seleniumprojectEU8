package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {


    @Test
    public void java_properties_reading_test(){

        //we provide key = os.name
        //value = Windows 10
        //key = user.name
        //value=hp
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        //System.getProperty("os.name") = Windows 10
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
       // System.getProperty("user.name") = hp

    }









}
