Feature: Cuenta Digital BCI

  Scenario: Apertura Cta Digital BCI

      Given Estoy en el Sitio de BCI portal Personas
          And Presiono boton HAZTE CLIENTE
          And Presiono boton ABRIR PLAN CUENTA CORRIENTE

      When Ingreso en el campo Nombre el valor "Domingo"
          And Ingreso en campo ApellidoPaterno el valor "Saavedra"
          And Ingreso en campo ApellidoMaterno el valor "Saavedra"
          And Ingreso en campo Rut el valor "17815251-3"
          And Ingreso en campo TelefonoCelular el valor "68461475"
          And Ingreso en campo Correo el valor "domingo.saa@algo.com"
          And Selecciono casilla de confirmacion de captcha
          And Selecciono casilla de confirmacion de poliza privacidad
          And Presiono boton CONTINUAR

      Then Visualizo el titulo del mensaje

              """
              Al parecer ya iniciaste una solicitud
              """

          And Visualizo la descripcion del mensaje

              """
              Según nuestros registros ya tienes una solicitud en curso. Te invitamos a retomar el proceso ingresando tu código de seguimiento
              """

          And Visualizo el boton RETOMAR

    Scenario: Apertura Cta Digital BCI

        Given Estoy en el Sitio de BCI portal Personas
        And Presiono boton HAZTE CLIENTE
        And Presiono boton ABRIR PLAN CUENTA CORRIENTE

        When Ingreso en el campo Nombre el valor "Domingo"
        And Ingreso en campo ApellidoPaterno el valor "Saavedra"
        And Ingreso en campo ApellidoMaterno el valor "Saavedra"
        And Ingreso en campo Rut el valor "17815251-3"
        And Ingreso en campo TelefonoCelular el valor "68461475"
        And Ingreso en campo Correo el valor "domingo.saa@algo.com"
        And Selecciono casilla de confirmacion de captcha
        And Selecciono casilla de confirmacion de poliza privacidad
        And Presiono boton CONTINUAR

        Then Visualizo el titulo del mensaje

              """
              Al parecer ya iniciaste una solicitud
              """

        And Visualizo la descripcion del mensaje

              """
              Según nuestros registros ya tienes una solicitud en curso. Te invitamos a retomar el proceso ingresando tu código de seguimiento
              """

        And Visualizo el boton RETOMAR