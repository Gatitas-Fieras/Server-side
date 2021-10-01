package com.example.ilenguageapi.cucumber.seleniumConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class SeleniumWebDriverConfig {
    public WebDriver driver;
    public static String API_URL = "http://localhost:4200/home";
    public static String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";

    public SeleniumWebDriverConfig() {
        String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", PATH_DRIVER);
    }

    public void logInAsUser() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/a[3]")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("pepe");
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123");
        sleep(500);
        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/div/form/button")).click();
    }

    public void logInAsTutor() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/a[3]")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("roberto");
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123");
        sleep(500);
        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/div/form/button")).click();
    }

    public void closeWindow(){
        driver.quit();
    }
}
