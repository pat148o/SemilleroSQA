package com.guru99.gurubank.pagesobjects;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http:demo.guru99.com/v1/index.php")
public class InicioDeSesionPageObject extends PageObject {
	
	By txtUsuario=By.name("uid");
	By txtClave=By.name("password");
	By btnLogin=By.xpath("//input[@type='submit']");

	public void escribirUsuario(String usuario) {
	getDriver().findElement(txtUsuario).sendKeys(usuario);
	
	}

	public void escribirClave(String clave) {
		getDriver().findElement(txtClave).sendKeys(clave);
		
		}
	
	public void clickEnLogin() {
		getDriver().findElement(btnLogin).click();
		
		}
	
	public String obtenerTextoDeAlerta() {
		return getAlert().getText();
	}
}
