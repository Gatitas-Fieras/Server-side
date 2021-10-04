package com.example.ilenguageapi.cucumber.stepdefinitions;

import com.example.ilenguageapi.cucumber.seleniumConfig.SeleniumWebDriverConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class signUpAndSignIn {

    SeleniumWebDriverConfig myDriver;

    public signUpAndSignIn() {
        myDriver = new SeleniumWebDriverConfig();
    }

    @Given("the user wants to sign up")
    public void theUserWantsToSignUp() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/a[2]")).isDisplayed();
    }

    @When("the user clicks on the button for sign up")
    public void theUserClicksOnTheButtonForSignUp() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/a[2]")).click();
    }

    @Then("the user sees a registration form")
    public void theUserSeesARegistrationForm() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/app-register-role/div/div[2]/mat-card/mat-card-actions/button")).click();
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/app-student-register/div/form/mat-card")).isDisplayed();
    }

    @Given("the user wants to complete the registration form")
    public void theUserWantsToCompleteTheRegistrationForm() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/a[2]")).click();
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/app-register-role/div/div[2]/mat-card/mat-card-actions/button")).click();
    }

    @When("the user completes incorrectly the form")
    public void theUserCompletesIncorrectlyTheForm() throws InterruptedException {
        sleep(3000);
        WebDriverWait firstWait = new WebDriverWait(myDriver.driver, 10);
        WebElement element = firstWait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-1\"]")));

        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).getText().isEmpty();
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).getText().isEmpty();
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).getText().isEmpty();
    }

    @Then("the system does not enable the button to continue registration.")
    public void theSystemDoesNotEnableTheButtonToContinueRegistration() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/app-student-register/div/form/mat-card/mat-card-actions/button[2]")).isEnabled();
    }

    @When("the user completes the form")
    public void theUserCompletesTheForm() throws InterruptedException {
        sleep(3000);
        WebDriverWait firstWait = new WebDriverWait(myDriver.driver, 10);
        WebElement element = firstWait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-1\"]")));

        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Julissa");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("use2@gmail.com");
        sleep(3000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span")).click();
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-option-0\"]/span")).click();
        sleep(3000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span")).click();
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-option-3\"]/span")).click();
        sleep(3000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Deseo aprender varios idiomas");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span[1]")).click();
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/app-student-register/div/form/mat-card/mat-card-actions/button[2]")).click();
    }

    @Then("the system displays the subscription plan section")
    public void theSystemDisplaysTheSubscriptionPlanSection() {
    }

    @Given("the user wants to sign in")
    public void theUserWantsToSignIn() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/a[3]")).click();
    }

    @When("the user completes the account and the password")
    public void theUserCompletesTheAccountAndThePassword() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("pepe");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123");
    }

    @And("the user clicks on the button for sign in")
    public void theUserClicksOnTheButtonForSignIn() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/div/form/button")).click();
    }

    @Then("the user is on the home page")
    public void theUserIsOnTheHomePage() throws InterruptedException {
    }

    @When("the user completes incorrectly the account or the password")
    public void theUserCompletesIncorrectlyTheAccountOrThePassword() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("pepe");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("12");
    }

    @Then("the system displays a message indicating the reason for the rejection")
    public void theSystemDisplaysAMessageIndicatingTheReasonForTheRejection() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/div[2]")).isEnabled();
    }

    @Given("the user is on the password reset section")
    public void theUserIsOnThePasswordResetSection() {
    }

    @When("the user indicates which is his email address")
    public void theUserIndicatesWhichIsHisEmailAddress() {
    }

    @Then("the user receives his password to the validated email")
    public void theUserReceivesHisPasswordToTheValidatedEmail() {
    }
}
