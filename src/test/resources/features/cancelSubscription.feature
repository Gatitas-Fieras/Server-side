Feature:
  Scenario: Cancelo exitosamente
    Given el cliente se encuentra en los planes de su perfil
    When selecciona la opción “Cancelar suscripción”, confirma su contraseña
    Then el sistema muestra el siguiente mensaje: “El plan ha sido cancelado satisfactoriamente”

  Scenario: Perdio conexion
    Given el cliente se encuentra en los planes de su perfil
    When selecciona la opción “Cancelar suscripción” y pierde la conexión de internet
    Then el estudiante podrá volver a conectarse y retomar la acción desde donde se quedó

  Scenario: Excedio tiempo de la sesion
    Given el cliente se encuentra en los planes de su perfil
    When selecciona la opción “Cancelar suscripción” y no confirma su contraseña en 10 minutos
    Then el sistema muestra el siguiente mensaje: “Se ha excedido el tiempo límite”

  Scenario: Ingresar contraseña denuevo
    Given el cliente se encuentra en los planes de su perfil
    When selecciona la opción “Cancelar suscripción” y la contraseña es incorrecta
    Then el sistema muestra el siguiente mensaje: “Ingrese la contraseña de nuevo para cancelar la suscripción”

