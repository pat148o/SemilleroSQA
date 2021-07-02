package com.guru99.gurubank.steps;
import com.guru99.gurubank.pagesobjects.InicioDeSesionPageObject;

import net.thucydides.core.annotations.Step;


public class InicioDeSesionSteps {

	InicioDeSesionPageObject inicioDeSesionPOM= new InicioDeSesionPageObject();
	
	
	
	@Step
	public void abrirAplicacionGuruBank() {
		inicioDeSesionPOM.open();
	}
	@Step
	public void escribirUsuario(String Usuario) {
		inicioDeSesionPOM.escribirUsuario("usuario");		
	}
	@Step
	public void escribirClave(String clave) {
		inicioDeSesionPOM.escribirClave("clave");
		
	}
	@Step
	public void escribirEnLogin() {
		inicioDeSesionPOM.clickEnLogin();
		
		
	}
	@Step
	public String obtenerTextoDeAlerta() {
	return inicioDeSesionPOM.obtenerTextoDeAlerta();
		
	}
}

