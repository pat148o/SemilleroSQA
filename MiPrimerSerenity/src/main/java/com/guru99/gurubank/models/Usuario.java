package com.guru99.gurubank.models;

public class Usuario {

	String usuario;
	String clave;
	
	//el constructor es para recibir los datos del feature
	//y almacenarlos en los atributos de la clase(los objetos azules)
	
	public Usuario(String usuario, String clave) {
		
		this.usuario = usuario;
		this.clave = clave;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getClave() {
		return clave;
	}
	
	
	
}
