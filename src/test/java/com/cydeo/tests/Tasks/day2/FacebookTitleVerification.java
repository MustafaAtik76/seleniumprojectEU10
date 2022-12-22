package com.cydeo.tests.Tasks.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {
    public static <Sign> void main(String[] args) {


        //TC #1: Facebook title verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com ");

        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”

        String expectedTitle ="Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!!");

        }
        driver.close();





 /*
• Create new class for each task.
• There are some tips in the 2nd page for whoever needs it.
• Please try to solve yourself first before moving to the tips.*/

    }
}
