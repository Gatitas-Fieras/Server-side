package com.example.ilenguageapi.cucumber.stepdefinitions;

import com.example.ilenguageapi.cucumber.seleniumConfig.SeleniumWebDriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class TutorLogs {

    SeleniumWebDriverConfig myDriver;

    public TutorLogs() {
        myDriver = new SeleniumWebDriverConfig();
    }


    @Given("que un nuevo profesor desee registrarse")
    public void queUnNuevoProfesorDeseeRegistrarse() {
    }

    @When("de click en registrarse como profesor")
    public void deClickEnRegistrarseComoProfesor() throws InterruptedException {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/a[2]")).click();
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/app-register-role/div/div[2]/mat-card/mat-card-actions/button")).click();

    }

    @Then("la aplicación muestra el formulario de registro donde se llenarán datos personales como nombre, apellido, fecha de nacimiento, DNI, dirección, teléfono y email, adicional a esto se pide un comprobante de estudios")
    public void laAplicaciónMuestraElFormularioDeRegistroDondeSeLlenaránDatosPersonalesComoNombreApellidoFechaDeNacimientoDNIDirecciónTeléfonoYEmailAdicionalAEstoSePideUnComprobanteDeEstudios() throws InterruptedException {
        sleep(3000);
        myDriver.closeWindow();
    }

    @Given("que un profesor nuevo se encuentra en el formulario de registro")
    public void queUnProfesorNuevoSeEncuentraEnElFormularioDeRegistro() throws InterruptedException {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/a[2]")).click();
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/app-register-role/div/div[2]/mat-card/mat-card-actions/button")).click();

    }

    @When("llena algún campo incorrectamente debido al formato del campo")
    public void llenaAlgúnCampoIncorrectamenteDebidoAlFormatoDelCampo() {
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("sdfsafsa");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("sdsdsasafcxzcz");

    }

    @Then("el sistema no habilitará el boton de registro")
    public void elSistemaNoHabilitaráElBotonDeRegistro() throws InterruptedException {
        sleep(2000);
        myDriver.closeWindow();
    }

    @Given("que un profesor ha llenado correctamente el formulario de registro")
    public void queUnProfesorHaLlenadoCorrectamenteElFormularioDeRegistro() throws InterruptedException {

        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-toolbar/div[3]/a[2]")).click();
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/app-register-role/div/div[1]/mat-card/mat-card-actions/button")).click();
        sleep(2000);

        WebDriverWait firstWait = new WebDriverWait(myDriver.driver, 10);
        WebElement element = firstWait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-1\"]")));
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("pinocho");

       /* WebDriverWait secondWait = new WebDriverWait(myDriver.driver, 10);
        WebElement username = secondWait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-input-6\"]")));
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("robertito");*/

        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).click();
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-option-0\"]/span")).click();
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div/div[2]")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-option-3\"]/span")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Hey there!");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span[1]")).click();
        sleep(2000);
      /*  myDriver.driver.findElement(By.id("tutor_username_2021")).sendKeys("Roberto");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("payasito123");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("robertototo@gmail.com");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-select-4\"]/div/div[2]/div")).click();

        WebDriverWait wait = new WebDriverWait(myDriver.driver, 10);
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-input-5\"]")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys("123");



        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-option-5\"]/span")).click();
        sleep(500);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-select-6\"]/div/div[2]/div")).click();
        sleep(500);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-option-8\"]/span")).click();
        sleep(500);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("Hey there!");
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span[1]")).click();
*/
    }

    @When("de click a registrar")
    public void deClickARegistrar() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/app-tuthor-register/div/mat-card/mat-card-actions/button[2]")).click();

    }

    @Then("el sistema muestra un snackbar que indica que se registró de forma satisfactioria")
    public void elSistemaMuestraUnSnackbarQueIndicaQueSeRegistróDeFormaSatisfactioria() throws InterruptedException {
        sleep(2000);
        myDriver.closeWindow();
    }
}
