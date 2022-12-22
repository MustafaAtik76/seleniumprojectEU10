package com.cydeo.tests.Tasks.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2- Go to: https://google.com

        driver.navigate().to("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmailButton = driver.findElement(By.className("gb_j"));
        gmailButton.click();

        //4- Verify title contains:

        WebElement titleContains = driver.findElement(By.className("mobile-before-hero-only"));

        //Expected: Gmail
        String expectedTitleContains = "Gmail";
        String actualTitleContains = driver.getTitle();

        System.out.println(actualTitleContains);

        if (actualTitleContains.contains(expectedTitleContains)){
            System.out.println("Title contains verification PASSED");
        }else {
            System.out.println("Title contains verification FAILED");
        }


        //5- Go back to Google by using the .back();

        driver.navigate().back();

        //6- Verify title equals:

        //Expected: Google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }
        driver.close();

    }
}
