package pageObject;

import org.openqa.selenium.By;

public class DekosasPages {
    private static By txtBoton = By.xpath("//a [@href = 'https://dekosas.com/co/especiales/home-office']");
    private static By lblproducto = By.xpath("//a[contains(text(),'Organizador De Escritorio Oro Rosa Poprun - Dks Worldwide ')]");
    private static By txtNovedades = By.xpath("//a[@href=\"https://dekosas.com/co/nuevos?product_list_order=created_at\"]");
    private static By lblInfo = By.xpath("//a[contains(text(),'Davi Negra')]");
    private static By lblmenu = By.xpath("//img[@src=\"https://dekosas.com/co/pub/media/logo/stores/1/micro_logo.png\"]");
    private static By txtbarrabusqueda = By.xpath("//input[@id=\"search\"]");
    private static By lblvalidacion= By.xpath("//span[contains(text(),'555.900')]");

    public static By getLblvalidacion() {
        return lblvalidacion;
    }

    public static By getLblmenu() {
        return lblmenu;
    }

    public static By getTxtbarrabusqueda() {
        return txtbarrabusqueda;
    }

    public static By getTxtBoton() {

        return txtBoton;
    }

    public static By getLblproducto() {
        return lblproducto;
    }

    public static By getTxtNovedades() {

        return txtNovedades;
    }

    public static By getLblInfo() {

        return lblInfo;
    }
}
