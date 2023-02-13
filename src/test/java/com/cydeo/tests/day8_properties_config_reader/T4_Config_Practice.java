package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class T4_Config_Practice {

//    public WebDriver driver;
//
//    @BeforeMethod
//
//    public void setupMethod(){
//
//        String browser = ConfigurationReader.getProperty("browser");
//
//        driver = WebDriverFactory.getDriver(browser);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //TC #1: Web table practice
        // 1. Go to: https://www.google.com



    //}

    @Test
    public void google_search_test(){

    Driver.getDriver().get("https://www.google.com");

        //3- Write “apple” in search box

        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle = "apple - Google'da Ara";

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);


    }


}
