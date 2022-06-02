package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {

        //1- Create the object of Properties
        Properties properties = new Properties();//this object can read the properties file

        //2- We need to open the file in java memory:FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");//gives FileNotFoundException

        //3- Load the properties object using FileInputStream object
        properties.load(file);//throws IOException(Input output exception)

        //4- Use "properties" object to read value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));//properties.getProperty("browser") = chrome
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
    }
























}
