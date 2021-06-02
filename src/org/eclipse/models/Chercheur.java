package org.eclipse.models;

public class Chercheur {
	private String nom;
	private String poste;
	private Integer numOrdinateur;
	
	private String domaine;
	
	public Chercheur(String nom, String poste, Integer numOrdinateur) {
		super();
		this.nom = nom;
		this.poste = poste;
		this.numOrdinateur = numOrdinateur;
	}



	public Chercheur(String domaine) {
		super();
		this.domaine = domaine;
	}



	public String getDomaine() {
		return domaine;
	}



	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}



	public Chercheur() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPoste() {
		return poste;
	}



	public void setPoste(String poste) {
		this.poste = poste;
	}



	public Integer getNumOrdinateur() {
		return numOrdinateur;
	}



	public void setNumOrdinateur(Integer numOrdinateur) {
		this.numOrdinateur = numOrdinateur;
	}



	@Override
	public String toString() {
		return "Chercheur [nom=" + nom + ", poste=" + poste + ", numOrdinateur=" + numOrdinateur + ", domaine="
				+ domaine + "]";
	}
	
	public void comparer(Chercheur ch1, Chercheur ch2) {
		if(ch1.getNom().equals(ch2.getNom())) {
			System.out.println("C'est le même chercheur");
		}
		else {
			System.out.println("Les deux chercheurs ne sont pas identiques");
		}
		
	}
	
	
	
	

}
