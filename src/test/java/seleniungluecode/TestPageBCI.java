package seleniungluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestPageBCI extends TestBase{

    @Given("^Estoy en el Sitio de BCI portal Personas$")
    public void estoy_en_el_Sitio_de_BCI_portal_Personas() throws Throwable {
        Assert.assertEquals(homePage.getTitle(),driver.getTitle());
    }

    @Given("^Presiono boton HAZTE CLIENTE$")
    public void presiono_boton_HAZTE_CLIENTE() throws Throwable {
       homePage.seleccionarHazteCliente();
    }

    @Given("^Presiono boton ABRIR PLAN CUENTA CORRIENTE$")
    public void presiono_boton_ABRIR_PLAN_CUENTA_CORRIENTE() throws Throwable {
        homePage.seleccionarAbrirCtaCte();
    }

    @When("^Ingreso en el campo Nombre el valor \"([^\"]*)\"$")
    public void ingreso_en_el_campo_Nombre_el_valor(String arg1) throws Throwable {
        planCtaCtePage.ingresarNombre(arg1);

    }

    @When("^Ingreso en campo ApellidoPaterno el valor \"([^\"]*)\"$")
    public void ingreso_en_campo_ApellidoPaterno_el_valor(String arg1) throws Throwable {
        planCtaCtePage.ingresarApellidoP(arg1);
    }

    @When("^Ingreso en campo ApellidoMaterno el valor \"([^\"]*)\"$")
    public void ingreso_en_campo_ApellidoMaterno_el_valor(String arg1) throws Throwable {
        planCtaCtePage.ingresarApellidoM(arg1);
    }

    @When("^Ingreso en campo Rut el valor \"([^\"]*)\"$")
    public void ingreso_en_campo_Rut_el_valor(String arg1) throws Throwable {
        planCtaCtePage.ingresarRut(arg1);

    }

    @When("^Ingreso en campo TelefonoCelular el valor \"([^\"]*)\"$")
    public void ingreso_en_campo_TelefonoCelular_el_valor(String arg1) throws Throwable {
        planCtaCtePage.ingresarTelefono(arg1);

    }

    @When("^Ingreso en campo Correo el valor \"([^\"]*)\"$")
    public void ingreso_en_campo_Correo_el_valor(String arg1) throws Throwable {
        planCtaCtePage.ingresarCorreo(arg1);

    }

    @When("^Selecciono casilla de confirmacion de captcha$")
    public void selecciono_casilla_de_confirmacion_de_captcha() throws Throwable {
        planCtaCtePage.esperarXSegundos(15000);
    }

    @When("^Selecciono casilla de confirmacion de poliza privacidad$")
    public void selecciono_casilla_de_confirmacion_de_poliza_privacidad() throws Throwable {
        planCtaCtePage.seleccionarCheckprivacidad();
    }

    @When("^Presiono boton CONTINUAR$")
    public void presiono_boton_CONTINUAR() throws Throwable {
        planCtaCtePage.continuarSolicitud();
    }

    @Then("^Visualizo el titulo del mensaje$")
    public void visualizo_el_titulo_del_mensaje(String arg1) throws Throwable {
         Assert.assertEquals(arg1,planCtaCtePage.obtenerTituloSolicitudRealizada());
    }

    @Then("^Visualizo la descripcion del mensaje$")
    public void visualizo_la_descripcion_del_mensaje(String arg1) throws Throwable {
        Assert.assertEquals(arg1,planCtaCtePage.obtenerDescripcionSolicitudRealizada());
    }

    @Then("^Visualizo el boton RETOMAR$")
    public void visualizo_el_boton_RETOMAR() throws Throwable {
        Assert.assertTrue(planCtaCtePage.validarBtnRetomar());
    }

}
