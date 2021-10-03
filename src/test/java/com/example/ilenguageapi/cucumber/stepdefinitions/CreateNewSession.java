package com.example.ilenguageapi.cucumber.stepdefinitions;

import com.example.ilenguageapi.cucumber.seleniumConfig.SeleniumWebDriverConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class CreateNewSession {

    SeleniumWebDriverConfig myDriver;

    public CreateNewSession() {
        myDriver = new SeleniumWebDriverConfig();
    }

    @Given("the tutor is on main page")
    public void theTutorIsOnMainPage() throws InterruptedException {
        myDriver.logInAsTutor();
    }

    @When("the tutor clicks on the create session button")
    public void theTutorClicksOnTheCreateSessionButton() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-button-toggle-0-button\"]/span")).click();
    }

    @And("fill all the information")
    public void fillAllTheInformation() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("DBFKJSDFSDF FSDFHSDFK");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]/div")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span")).click();
        sleep(1000);
        WebElement initialDate =  myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]"));
        initialDate.sendKeys("09252020");
        initialDate.sendKeys(Keys.TAB);
        sleep(500);
        initialDate.sendKeys("0018:50");
        String dateTime ="12/07/201414:25";
        WebElement finalDate= myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]"));
        finalDate.sendKeys("09252020");
        finalDate.sendKeys(Keys.TAB);
        finalDate.sendKeys("0020:50");
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div/div[2]")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-option-5\"]/span")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-create-session/div/form/mat-card/mat-card-actions/button[2]")).click();

    }

    @Then("session is registrated correctly")
    public void sessionIsRegistratedCorrectly() {
        myDriver.closeWindow();
    }
}
