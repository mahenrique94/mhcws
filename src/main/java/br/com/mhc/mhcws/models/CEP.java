package br.com.mhc.mhcws.models;

import java.io.Serializable;

import br.com.mhc.mhcws.util.States;

public class CEP implements Serializable {

	private Integer codibge;
	private Integer codestado;
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
	public CEP() {
		// TODO Auto-generated constructor stub
	}
	public CEP(Integer codibge, Integer codestado, String cep, String logradouro, String complemento, String bairro, String cidade, String estado) {
		this.codibge = codibge;
		this.codestado = codestado;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public Integer getCodibge() {
		return codibge;
	}
	public void setCodibge(Integer codibge) {
		this.codibge = codibge;
	}
	public Integer getCodestado() {
		return codestado;
	}
	public void setCodestado(Integer codestado) {
		this.codestado = codestado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public CEP toUpper() {
		setCep(getCep().toUpperCase());
		setLogradouro(getLogradouro().toUpperCase());
		setComplemento(getComplemento().toUpperCase());
		setBairro(getBairro().toUpperCase());
		setCidade(getCidade().toUpperCase());
		setEstado(getEstado().toUpperCase());
		return this;
	}
	
	public CEP addCodEstado() {
		setCodestado(States.FIND.getStateCod(getEstado()));
		return this;
	}
	
}
