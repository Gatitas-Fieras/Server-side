Feature:
  Scenario: Mostrar perfil
    Given que el Cliente está iniciando sesión en la aplicación
    When selecciona la sección de mi perfil
    Then el sistema le muestra el perfil de usuario con información como foto de perfil, datos personales y métodos de pago guardados

  Scenario: Editar perfil
    Given que el Cliente se encuentra en la sección de perfil
    When selecciona la opción de editar mi perfil
    Then el sistema le permite editar los campos como foto de perfil, datos personales y métodos de pago

  Scenario: Error del sistema por credenciales
    Given que el Cliente se encuentra editando los campos del perfil
    When edita un campo con el formato equivocado
    Then el sistema le notifica un error y no permite guardar los cambios

  Scenario: Agregar o quitar método de pago
    Given que el Cliente se encuentra en sección mi perfil
    When selecciona mis métodos de pago
    Then va a ver los detalles de las tarjetas guardadas por él y, además, visualiza las opciones de quitar o agregar tarjeta