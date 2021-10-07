package com.certificacion.prueba.choucair.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/tienda_virtual.feature",
        glue = "com.certificacion.prueba.choucair.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class TiendaVirtualRunner {
}
