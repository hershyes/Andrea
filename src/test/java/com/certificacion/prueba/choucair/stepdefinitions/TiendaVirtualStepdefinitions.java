package com.certificacion.prueba.choucair.stepdefinitions;


import com.certificacion.prueba.choucair.tasks.AbrirNavegador;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class TiendaVirtualStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver chrome;
    private Actor andrea = Actor.named("andrea");

    @Before
    public void setUpOnStage() {
        andrea.can(BrowseTheWeb.with(chrome));
    }

    @Dado("^que el usuario ingresa al portal$")
    public void queElUsuarioIngresaAlPortal() {
        andrea.attemptsTo(AbrirNavegador.chrome());
    }

    @Cuando("^el usuario inicia sesion$")
    public void elUsuarioIniciaSesion() throws InterruptedException {
    }

    @Entonces("^el usuario puede ver el menu de la cuenta$")
    public void elUsuarioPuedeVerElMenuDeLaCuenta() {
    }
}
