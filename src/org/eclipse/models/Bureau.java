package org.eclipse.models;

public class Bureau {
	private int code;
	private String nom;
	private Chercheur[] chercheur;
	public Bureau(int code, String nom, Chercheur[] chercheur) {
		super();
		this.code = code;
		this.nom = nom;
		this.chercheur = chercheur;
	}
	public Bureau() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Chercheur[] getChercheur() {
		return chercheur;
	}
	public void setChercheur(Chercheur[] chercheur) {
		this.chercheur = chercheur;
	}
	@Override
	public String toString() {
		return "Bureau [code=" + code + ", nom=" + nom + ", chercheur=" + chercheur + "]";
	}
	
	

}
