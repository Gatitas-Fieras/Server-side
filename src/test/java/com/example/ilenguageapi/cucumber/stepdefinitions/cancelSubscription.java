package com.example.ilenguageapi.cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cancelSubscription {
    @Given("el cliente se encuentra en los planes de su perfil")
    public void elClienteSeEncuentraEnLosPlanesDeSuPerfil() {
    }

    @When("selecciona la opción “Cancelar suscripción”, confirma su contraseña")
    public void seleccionaLaOpciónCancelarSuscripciónConfirmaSuContraseña() {
    }

    @Then("el sistema muestra el siguiente mensaje: “El plan ha sido cancelado satisfactoriamente”")
    public void elSistemaMuestraElSiguienteMensajeElPlanHaSidoCanceladoSatisfactoriamente() {
    }

    @When("selecciona la opción “Cancelar suscripción” y pierde la conexión de internet")
    public void seleccionaLaOpciónCancelarSuscripciónYPierdeLaConexiónDeInternet() {
    }

    @Then("el estudiante podrá volver a conectarse y retomar la acción desde donde se quedó")
    public void elEstudiantePodráVolverAConectarseYRetomarLaAcciónDesdeDondeSeQuedó() {
    }

    @When("selecciona la opción “Cancelar suscripción” y no confirma su contraseña en {int} minutos")
    public void seleccionaLaOpciónCancelarSuscripciónYNoConfirmaSuContraseñaEnMinutos(int arg0) {
    }

    @Then("el sistema muestra el siguiente mensaje: “Se ha excedido el tiempo límite”")
    public void elSistemaMuestraElSiguienteMensajeSeHaExcedidoElTiempoLímite() {
    }

    @When("selecciona la opción “Cancelar suscripción” y la contraseña es incorrecta")
    public void seleccionaLaOpciónCancelarSuscripciónYLaContraseñaEsIncorrecta() {
    }

    @Then("el sistema muestra el siguiente mensaje: “Ingrese la contraseña de nuevo para cancelar la suscripción”")
    public void elSistemaMuestraElSiguienteMensajeIngreseLaContraseñaDeNuevoParaCancelarLaSuscripción() {
    }
}
