package com.example.ilenguageapi.cucumber.stepdefinitions;

import com.example.ilenguageapi.cucumber.seleniumConfig.SeleniumWebDriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class EditProfile {

    SeleniumWebDriverConfig myDriver;

    public EditProfile() {
        myDriver = new SeleniumWebDriverConfig();
    }

    @Given("que el profesor esta iniciado sesión en la aplicación")
    public void queElProfesorEstaIniciadoSesiónEnLaAplicación() throws InterruptedException {
        myDriver.logInAsTutor();

    }

    @When("le dé clic a la sección de mi perfil")
    public void leDéClicALaSecciónDeMiPerfil() {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-session/mat-drawer-container/mat-drawer/div/button[2]")).click();
    }

    @Then("el sistema le muestra el perfil de usuario con información como foto de perfil, datos personales, experiencia \\(por el sistema)")
    public void elSistemaLeMuestraElPerfilDeUsuarioConInformaciónComoFotoDePerfilDatosPersonalesExperienciaPorElSistema() throws InterruptedException {
        sleep(2000);
        myDriver.closeWindow();
    }

    @Given("que el profesor se encuentra en la sección de perfil")
    public void queElProfesorSeEncuentraEnLaSecciónDePerfil() throws InterruptedException {
        myDriver.logInAsTutor();
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-session/mat-drawer-container/mat-drawer/div/button[2]")).click();
    }

    @When("cuando le da clic a la opción de editar mi perfil")
    public void cuandoLeDaClicALaOpciónDeEditarMiPerfil() {
    }

    @Then("el sistema le permite editar los campos como datos personales")
    public void elSistemaLePermiteEditarLosCamposComoDatosPersonales() {
    }

    @When("cuando le da clic a la opción de editar mi perfil e ingrese datos erroneos")
    public void cuandoLeDaClicALaOpciónDeEditarMiPerfilEIngreseDatosErroneos() {
    }

    @Then("el sistema no podrá realizar la modificacion")
    public void elSistemaNoPodráRealizarLaModificacion() {
    }
}
