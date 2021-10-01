package com.example.ilenguageapi.cucumber.seleniumConfig;

import org.openqa.selenium.WebDriver;

public class SeleniumWebDriverConfig {
    public WebDriver driver;
    public  String API_URL = "http://localhost:4200/home";
    public static String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";

}
