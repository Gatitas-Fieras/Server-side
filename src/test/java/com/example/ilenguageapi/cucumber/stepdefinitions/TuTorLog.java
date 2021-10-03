package com.example.ilenguageapi.cucumber.stepdefinitions;

import com.example.ilenguageapi.cucumber.seleniumConfig.SeleniumWebDriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class TuTorLog {

    SeleniumWebDriverConfig myDriver;

    public TuTorLog() {
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

    @Then("el sistema muestra un mensaje de error, detallando cual fue el problema")
    public void elSistemaMuestraUnMensajeDeErrorDetallandoCualFueElProblema() throws InterruptedException {
        sleep(2000);
        myDriver.closeWindow();
    }

    @Given("que un profesor ha llenado incorrectamente el formulario de registro")
    public void queUnProfesorHaLlenadoIncorrectamenteElFormularioDeRegistro() {
        
    }

    @When("de click en siguiente")
    public void deClickEnSiguiente() {
    }

    @Then("el sistema muestra un mensaje de error indicando que un campo ha sido llenado incorrectamente")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoQueUnCampoHaSidoLlenadoIncorrectamente() {
    }

    @Given("que un profesor ha llenado correctamente el formulario de registro")
    public void queUnProfesorHaLlenadoCorrectamenteElFormularioDeRegistro() {
    }

    @Then("el sistema muestra el formulario de postulación el cual es un proceso necesario para acceder a sus funciones.")
    public void elSistemaMuestraElFormularioDePostulaciónElCualEsUnProcesoNecesarioParaAccederASusFunciones() {
    }


}
