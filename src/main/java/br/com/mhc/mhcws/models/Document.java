package br.com.mhc.mhcws.models;

import java.io.Serializable;

public class Document implements Serializable {
	
	private String formatado;
	private String desformatado;
	private int primeiroDigito;
	private int segundoDigito;
	private boolean valido;
	
	public Document(br.com.mhc.document.Document document) {
		setFormatado(document.format());
		setDesformatado(document.unformat());
		setPrimeiroDigito(document.getFirstDigit());
		setSegundoDigito(document.getSecondDigit());
		setValido(document.isValid());
	}

	public String getFormatado() {
		return formatado;
	}
	public void setFormatado(String formatado) {
		this.formatado = formatado;
	}
	public String getDesformatado() {
		return desformatado;
	}
	public void setDesformatado(String desformatado) {
		this.desformatado = desformatado;
	}
	public int getPrimeiroDigito() {
		return primeiroDigito;
	}
	public void setPrimeiroDigito(int primeiroDigito) {
		this.primeiroDigito = primeiroDigito;
	}
	public int getSegundoDigito() {
		return segundoDigito;
	}
	public void setSegundoDigito(int segundoDigito) {
		this.segundoDigito = segundoDigito;
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}

}
