package br.com.mhc.mhcws.models;

import java.io.Serializable;

public class CNPJ implements Serializable {
	
	private String cnpj;
	private String nomefantasia;
	private String razaosocial;
	private String cep;
	private CEP endereco;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomefantasia() {
		return nomefantasia;
	}
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}
	public String getRazaosocial() {
		return razaosocial;
	}
	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	public CEP getEndereco() {
		return endereco;
	}
	public void setEndereco(CEP endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
