Feature:
  Scenario: Show profile
  Given que el profesor esta iniciado sesión en la aplicación
  When le dé clic a la sección de mi perfil
  Then el sistema le muestra el perfil de usuario con información como foto de perfil, datos personales, experiencia (por el sistema)


  Scenario: Edit profile
    Given que el profesor se encuentra en la sección de perfil
    When cuando le da clic a la opción de editar mi perfil
    Then el sistema le permite editar los campos como datos personales

  Scenario: Edit profile Bad request
    Given que el profesor se encuentra en la sección de perfil
    When cuando le da clic a la opción de editar mi perfil e ingrese datos erroneos
    Then el sistema no podrá realizar la modificacion