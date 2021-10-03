package com.example.ilenguageapi.cucumber.stepdefinitions;

import com.example.ilenguageapi.cucumber.seleniumConfig.SeleniumWebDriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class ReserveSession {

    SeleniumWebDriverConfig myDriver;

    public ReserveSession() {
        myDriver = new SeleniumWebDriverConfig();
    }

    @Given("the client is on the home page")
    public void theClientIsOnTheHomePage() throws InterruptedException {
        myDriver.logInAsUser();
    }

    @When("the client clicks on the button to see tutors")
    public void theClientClicksOnTheButtonToSeeTutors() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-session/mat-drawer-container/mat-drawer/div/button[3]")).click();
    }

    @Then("the client sees tutor's list")
    public void theClientSeesTutorSList() {
    }

    @When("the client clicks on the button to see profile")
    public void theClientClicksOnTheButtonToSeeProfile() {
    }

    @Then("the client sees selected tutor's profile")
    public void theClientSeesSelectedTutorSProfile() {
    }

    @When("the client clicks on the button to reserve")
    public void theClientClicksOnTheButtonToReserve() {
    }

    @Then("the client completes the form")
    public void theClientCompletesTheForm() {
    }

    @When("the client clicks on the button to confirm")
    public void theClientClicksOnTheButtonToConfirm() {
    }

    @Then("the system displays a message indicating that the session has been reserved")
    public void theSystemDisplaysAMessageIndicatingThatTheSessionHasBeenReserved() {
    }

    @Given("the client completes incorrectly the form")
    public void theClientCompletesIncorrectlyTheForm() {
    }

    @Then("the system displays a message indicating that the session has not been reserved and the reason for rejection")
    public void theSystemDisplaysAMessageIndicatingThatTheSessionHasNotBeenReservedAndTheReasonForRejection() {
    }
}
