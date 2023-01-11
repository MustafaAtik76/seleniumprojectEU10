package com.cydeo.tests.Tasks.day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task8 {

    WebDriver driver;

    @BeforeMethod

    public void setup(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void allSelectTest () throws InterruptedException {

        //List <WebElement> select1 = driver.findElements(By.xpath("//select[@name='Languages']"));
        Select select = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        int value = 0;

        List <WebElement> options = select.getOptions();

        for (WebElement element : options ) {

         //select = new Select( element);

         //select.selectByIndex(value++);

         String text = element.getText();

         select.selectByVisibleText(text);
            System.out.println(text);

            Thread.sleep(2000);



        }
    }
}
