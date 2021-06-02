package org.eclipse.models;

public class Test {
	
	//private String adresse;
	private Adresse adresse;
	// 10- créer un chercheur dans la classe Test
	private Chercheur chercheur;

	public Test(Adresse adresse) {
		super();
		this.adresse = adresse;
		this.chercheur = chercheur;
	}
	
	public Test() {
		super();
	}	

	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	@Override
	public String toString() {
		return "Test [adresse=" + adresse + "]";
	}

//	public Test(String adresse) {
//		super();
//		this.adresse = adresse;
//	}
	

//	@Override
//	public String toString() {
//		return "Test [adresse=" + adresse + "]";
//	}
	
//	@Override
//	public void modifierVilleAdresse() {
//		System.out.println(this.setVille("Paris 15"));
//	}
	
	
	
	

}
