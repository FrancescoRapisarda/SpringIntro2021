package com.spring2021.SpringInitializr2021.models;

public class Studente {
	
	private String id;
	private String nome;
	private String cognome;
	private String facolta;
	private String codMatricola;
	
	public Studente() {
		
	}
	
	
	public Studente(String varNome, String varCognome, String varFacolta, String varCodMatricola) {
		
		this.nome = varNome;
		this.cognome = varCognome;
		this.facolta = varFacolta;
		this.codMatricola = varCodMatricola;
		
	}


	
	
	//GET AND SET
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getFacolta() {
		return facolta;
	}


	public void setFacolta(String facolta) {
		this.facolta = facolta;
	}


	public String getCodMatricola() {
		return codMatricola;
	}


	public void setCodMatricola(String codMatricola) {
		this.codMatricola = codMatricola;
	}


	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", facolta=" + facolta
				+ ", codMatricola=" + codMatricola + "]";
	}
	
	
}
