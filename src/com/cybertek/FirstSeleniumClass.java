package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\tamirov\\Documents\\Selenium dependencies\\Drivers\\geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get("https://google.com");
    }
}
