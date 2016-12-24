package br.com.mhc.mhcws.models;

import java.io.Serializable;

public class CPF implements Serializable {
	
	private String formatado;
	private String desformatado;
	private int primeiroDigito;
	private int segundoDigito;
	private boolean valido;
	
	public CPF(br.com.mhc.cpf.CPF cpf) {
		setFormatado(cpf.format());
		setDesformatado(cpf.unformat());
		setPrimeiroDigito(cpf.getFirstDigit());
		setSegundoDigito(cpf.getSecondDigit());
		setValido(cpf.isValid());
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
