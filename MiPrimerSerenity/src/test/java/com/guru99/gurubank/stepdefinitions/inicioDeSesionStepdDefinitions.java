package com.guru99.gurubank.stepdefinitions;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;

import com.guru99.gurubank.models.Usuario;
import com.guru99.gurubank.steps.InicioDeSesionSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class inicioDeSesionStepdDefinitions {
	
	@Steps
	InicioDeSesionSteps inicioSesionSteps;

	@Dado("^que estoy en la pagina de inicio de GuruBank$")
	public void queEstoyEnLaPaginaDeInicioDeGuruBank() {
	    
		inicioSesionSteps.abrirAplicacionGuruBank();
	}

	@Cuando("^ingreso mis credenciales$")
	public void ingresoMisCredenciales(List<Usuario> listaUsuario) {
		inicioSesionSteps.escribirUsuario(listaUsuario.get(0).getUsuario());
		inicioSesionSteps.escribirClave(listaUsuario.get(0).getClave());
		inicioSesionSteps.escribirEnLogin();
	}

	@Entonces("^valido la presencia de una alerta$")
	public void validoLaPresenciaDeUnaAlerta() {
    assertThat(inicioSesionSteps.obtenerTextoDeAlerta(), Matchers.is("User is not valid"));
		}
}
