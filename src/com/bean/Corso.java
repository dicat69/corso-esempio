package com.bean;

public class Corso {
	
	private String codice;
	private String titolo;
	private String sede;
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	protected Corso() {
		
	}
	
	public Corso(String codice, String sede, String titolo) {
		this.sede=sede;
		this.titolo=titolo;
		this.codice=codice;
		}
	
	@Override
	public String toString() {
		return "Corso [codice=" + codice + ", titolo=" + titolo + ", sede=" + sede + "]";
	}
	
	
	
}
