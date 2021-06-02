package org.eclipse.models;

public class Laboratoire {
	private String nom;
	private String specialite;
	private Bureau[] bureau;
	private Adresse adresse;
	public Laboratoire(String nom, String specialite, Bureau[] bureau, Adresse adresse) {
		super();
		this.nom = nom;
		this.specialite = specialite;
		this.bureau = bureau;
		this.adresse = adresse;
	}
	public Laboratoire() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public Bureau[] getBureau() {
		return bureau;
	}
	public void setBureau(Bureau[] bureau) {
		this.bureau = bureau;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "Laboratoire [nom=" + nom + ", specialite=" + specialite + ", bureau=" + bureau + ", adresse=" + adresse
				+ "]";
	}
	
	

}

