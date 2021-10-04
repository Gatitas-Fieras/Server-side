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

public class cancelSubscription {

    SeleniumWebDriverConfig myDriver;

    public cancelSubscription() {
        myDriver = new SeleniumWebDriverConfig();
    }

    @Given("el cliente se encuentra en los planes de su perfil")
    public void elClienteSeEncuentraEnLosPlanesDeSuPerfil() throws InterruptedException {
        myDriver.logInAsUser();
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-session/mat-drawer-container/mat-drawer/div/button[2]")).click();
    }

    @When("selecciona la opción “Cancelar suscripción”, confirma su contraseña")
    public void seleccionaLaOpciónCancelarSuscripciónConfirmaSuContraseña() throws InterruptedException {
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-profile/mat-drawer-container/mat-drawer/div/button[4]]")).click();
    }

    @Then("el sistema muestra el siguiente mensaje: “El plan ha sido cancelado satisfactoriamente”")
    public void elSistemaMuestraElSiguienteMensajeElPlanHaSidoCanceladoSatisfactoriamente() throws InterruptedException{
        sleep(2000);
        myDriver.closeWindow();
    }

    @When("selecciona la opción “Cancelar suscripción” y pierde la conexión de internet")
    public void seleccionaLaOpciónCancelarSuscripciónYPierdeLaConexiónDeInternet() throws InterruptedException{
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-profile/mat-drawer-container/mat-drawer/div/button[4]]")).click();
    }

    @Then("el estudiante podrá volver a conectarse y retomar la acción desde donde se quedó")
    public void elEstudiantePodráVolverAConectarseYRetomarLaAcciónDesdeDondeSeQuedó() throws InterruptedException{
        sleep(2000);
        myDriver.closeWindow();
    }

    @When("selecciona la opción “Cancelar suscripción” y no confirma su contraseña en {int} minutos")
    public void seleccionaLaOpciónCancelarSuscripciónYNoConfirmaSuContraseñaEnMinutos(int arg0) throws InterruptedException{
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-profile/mat-drawer-container/mat-drawer/div/button[4]]")).click();
    }

    @Then("el sistema muestra el siguiente mensaje: “Se ha excedido el tiempo límite”")
    public void elSistemaMuestraElSiguienteMensajeSeHaExcedidoElTiempoLímite() throws InterruptedException{
        sleep(2000);
        myDriver.closeWindow();
    }

    @When("selecciona la opción “Cancelar suscripción” y la contraseña es incorrecta")
    public void seleccionaLaOpciónCancelarSuscripciónYLaContraseñaEsIncorrecta() throws InterruptedException{
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-profile/mat-drawer-container/mat-drawer/div/button[4]]")).click();
    }

    @Then("el sistema muestra el siguiente mensaje: “Ingrese la contraseña de nuevo para cancelar la suscripción”")
    public void elSistemaMuestraElSiguienteMensajeIngreseLaContraseñaDeNuevoParaCancelarLaSuscripción() throws InterruptedException{
        sleep(2000);
        myDriver.closeWindow();
    }
}
