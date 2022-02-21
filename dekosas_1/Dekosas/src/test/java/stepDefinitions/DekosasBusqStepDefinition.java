package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pageObject.DekosasPages;
import steps.DekosasBusqStep;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class DekosasBusqStepDefinition {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();
    @Steps
    DekosasBusqStep busquedaStep = new DekosasBusqStep();

    @Given("^Dado que se debe realizar la busqueda por categoria, el home y la barra de busqueda$")
    public void dadoQueSeDebeRealizarLaBusquedaPorCategoriaElHomeYLaBarraDeBusqueda() {
        SeleniumWebDriver.chromeDrive("https://dekosas.com/co/");
    }

    @When("^cuando llamo a los datos en el archivo de excel$")
    public void cuandoLlamoALosDatosEnElArchivoDeExcel() throws InterruptedException, AWTException {
        busquedaStep.buscarproducto();
        busquedaStep.buscarexcel();



    }

    @Then("^hace la busqueda y me muestra resultados$")
    public void haceLaBusquedaYMeMuestraResultados() {
        busquedaStep.validar(DekosasPages.getLblvalidacion(),"$555.900");

    }
}
