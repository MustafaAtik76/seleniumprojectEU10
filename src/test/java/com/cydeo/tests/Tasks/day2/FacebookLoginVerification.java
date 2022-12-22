package com.cydeo.tests.Tasks.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginVerification {

    public static void main(String[] args) {
        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com ");

        //3. Enter incorrect username

        WebElement usernameInput = driver.findElement(By.id("email"));

        usernameInput.sendKeys("incorrect@gmail.com");

        //4. Enter incorrect password

        WebElement passwordInput = driver.findElement(By.id("pass"));

        passwordInput.sendKeys("incorrect password");

        //5. Verify title changed to:
        //Expected: “Log into Facebook”

        driver.findElement(By.xpath("//button[@class = 'wt-btn wt-btn--filled wt-mb-xs-0']")).click();

        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);

    }
}
