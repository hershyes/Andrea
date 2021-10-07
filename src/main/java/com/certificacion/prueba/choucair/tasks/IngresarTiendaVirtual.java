package com.certificacion.prueba.choucair.tasks;

import com.certificacion.prueba.choucair.userinterfaces.IngresarUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class IngresarTiendaVirtual implements Task {

	private String usuario;
	private String contrasena;

	public IngresarTiendaVirtual(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(IngresarUserInterfaces.INICIA_SESION));
	}

	public static IngresarTiendaVirtual conDatos(String usuario, String contrasena){
		return new IngresarTiendaVirtual(usuario, contrasena);
	}
	    
}
