package br.com.mhc.mhcws.models;

import java.io.Serializable;

import br.com.mhc.documenteletronic.CTEMDFENFE;

public class DocumentEletronic implements Serializable {
	
	private boolean valido;
	private String estado;
	private int mes;
	private int ano;
	private String cnpj;
	private int modelo;
	private int serie;
	private int numero;
	private int emissao;
	private int codigo;
	private int digito;
	
	public DocumentEletronic(CTEMDFENFE document) {
		// TODO Auto-generated constructor stub
		setValido(document.isValid());
		setEstado(document.getUF());
		setMes(document.getMonth());
		setAno(document.getYear());
		setCnpj(document.getCnpj().format());
		setModelo(document.getModel());
		setSerie(document.getSerie());
		setNumero(document.getNumber());
		setEmissao(document.getEmissao());
		setCodigo(document.getCode());
		setDigito(document.getDigit());
	}
	
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEmissao() {
		return emissao;
	}
	public void setEmissao(int emissao) {
		this.emissao = emissao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}

}
