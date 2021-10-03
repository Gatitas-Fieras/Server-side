Feature: Tutor quiere iniciar en ILanguage
  Scenario:asdasd
    Given que un nuevo profesor desee registrarse
    When de click en registrarse como profesor
    Then la aplicación muestra el formulario de registro donde se llenarán datos personales como nombre, apellido, fecha de nacimiento, DNI, dirección, teléfono y email, adicional a esto se pide un comprobante de estudios

  Scenario  sdnsjdsad
    Given que un profesor nuevo se encuentra en el formulario de registro
    When llena algún campo incorrectamente debido al formato del campo
    Then el sistema muestra un mensaje de error, detallando cual fue el problema


  Scenario fddsadadsa
    Given que un profesor ha llenado correctamente el formulario de registro
    When de click a siguiente
    Then el sistema muestra el formulario de postulación el cual es un proceso necesario para acceder a sus funciones.