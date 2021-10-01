package com.example.ilenguageapi.cucumber.seleniumConfig;

import org.openqa.selenium.WebDriver;

public class SeleniumWebDriverConfig {
    public WebDriver driver;
    public  String API_URL = "https://homehealthy.netlify.app";
    public static String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";

}
