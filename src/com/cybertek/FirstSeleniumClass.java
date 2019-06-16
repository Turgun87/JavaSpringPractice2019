package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamirov\\Documents\\Selenium dependencies\\Drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://google.com");
    }
}
