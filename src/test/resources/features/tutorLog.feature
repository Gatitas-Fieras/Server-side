Feature: Tutor quiere iniciar en ILanguage
  Scenario:asdasd
    Given que un nuevo profesor desee registrarse
    When de click en registrarse como profesor
    Then la aplicación muestra el formulario de registro donde se llenarán datos personales como nombre, apellido, fecha de nacimiento, DNI, dirección, teléfono y email, adicional a esto se pide un comprobante de estudios

  Scenario  sdnsjdsad
    Given que un profesor nuevo se encuentra en el formulario de registro
    When llena algún campo incorrectamente debido al formato del campo
    Then el sistema no habilitará el boton de registro


  Scenario fddsadadsa
    Given que un profesor ha llenado correctamente el formulario de registro
    When de click a registrar
    Then el sistema muestra un snackbar que indica que se registró de forma satisfactioria