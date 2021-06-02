package org.eclipse.models;

public class Adresse {
	
	private String region;
	private String ville;
	private String codePostal;
	public Adresse(String region, String ville, String codePostal) {
		super();
		this.region = region;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	public Adresse() {
		super();
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	@Override
	public String toString() {
		return "Adresse [region=" + region + ", ville=" + ville + ", codePostal=" + codePostal + "]";
	}
	
	

}
