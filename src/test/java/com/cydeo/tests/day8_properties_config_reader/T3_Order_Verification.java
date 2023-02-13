package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Order_Verification {


    @Test
    public void orderVerification(){

        //TC#3: Smartbear software order verification
        //1. Open browser and login to Smartbear software
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username = Driver.getDriver().findElement(By.id("ctl00_MainContent_username"));
        username.click();
        username.sendKeys("Tester");
        //4. Enter password: “test”
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
        //5. Click to Login button
        WebElement loginButton=Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        //2. Click on View all orders

        WebElement viewAllOrder= Driver.getDriver().findElement(By.xpath("//a[text()='View all orders']"));


        //3. Verify Susan McLaren has order on date “01/05/2010”

        WebElement order=Driver.getDriver().findElement(By.xpath("//table/tbody/tr[6]/td[.='Susan McLaren']"));

        WebElement date=Driver.getDriver().findElement(By.xpath("//table/tbody/tr[6]/td[.='Susan McLaren']/following-sibling::td[3]"));
        String expectedDate="01/05/2010";
        String actualDate=date.getText();
        Assert.assertEquals(expectedDate,actualDate);



    }
}
