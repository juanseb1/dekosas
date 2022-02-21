package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObject.DekosasPages;
import utils.Excel;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertEquals;

public class DekosasBusqStep {
    public void escribirEnter(By elemento, String Texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(Texto, Keys.ENTER);

    }

    public void seleccionBoton(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();


    @Step
    public void buscarexcel() {
        try {


            leerExcel = Excel.leerXlsx("Dekosas.xlsx", "Busqueda");

        } catch (IOException e) {
            e.printStackTrace();

        }
        for (int i = 0; i < leerExcel.size(); i++) {
            escribirEnter(DekosasPages.getTxtbarrabusqueda(), leerExcel.get(i).get("muebles"));

        }
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }



     @Step
     public void buscarproducto() throws InterruptedException, AWTException {


        seleccionBoton(DekosasPages.getTxtBoton());
        seleccionBoton(DekosasPages.getLblproducto());
        seleccionBoton(DekosasPages.getTxtNovedades());
        JavascriptExecutor js = (JavascriptExecutor)SeleniumWebDriver.driver;
        js.executeScript("window.scrollBy(0,1000)","");
        seleccionBoton(DekosasPages.getLblInfo());


     }


    private String obtenerTexto(By elemento) {

        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    public void validar(By elemento, String texto) {

        assertEquals(obtenerTexto(elemento), texto);
    }

}
