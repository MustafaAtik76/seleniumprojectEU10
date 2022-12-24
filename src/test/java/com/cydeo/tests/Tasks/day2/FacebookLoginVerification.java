package com.cydeo.tests.Tasks.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginVerification {

    public static void main(String[] args) throws InterruptedException {
        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com ");

        //3. Enter incorrect username

        WebElement usernameInput = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));

        usernameInput.sendKeys("incorrect@gmail.com");

        //4. Enter incorrect password

        WebElement passwordInput = driver.findElement(By.id("pass"));

        passwordInput.sendKeys("incorrect");

        //5. Verify title changed to:
        //Expected: “Log into Facebook”

        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();

       Thread.sleep(10000);

       //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).click();



        String expectedTitle = "Log into Facebook";

        String actualTitle = driver.getTitle();


        System.out.println("title = " + actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
    }
}
