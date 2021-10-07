package com.certificacion.prueba.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IngresarUserInterfaces {

    public static final Target INICIA_SESION = Target
            .the("Inicia sesion")
            .locatedBy("//a[@class='login']");

}
