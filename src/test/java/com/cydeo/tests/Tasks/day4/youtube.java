package com.cydeo.tests.Tasks.day4;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class youtube {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://youtube.com");

        //driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")).click();


        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[6]/div/ytd-guide-entry-renderer[1]/a/tp-yt-paper-item")).click();

    }
}
