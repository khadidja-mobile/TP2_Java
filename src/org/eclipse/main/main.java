package org.eclipse.main;

import org.eclipse.models.Adresse;
import org.eclipse.models.Bureau;
import org.eclipse.models.Chercheur;
import org.eclipse.models.Laboratoire;
import org.eclipse.models.Test;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Test adresse1 = new Test("5rue de paris 7500 Paris");
		
		// 2- instancier
		Adresse adresse2 = new Adresse("Ile-de-France", "Paris", "75000");
		
		//System.out.println(adresse1);
		// 3- afficher
		System.out.println(adresse2);
		
		// 4- modifier code postal 
		adresse2.setCodePostal("75017");
		// 5- afficher la modif
		System.out.println(adresse2);
		
		// 6- adresse de la classe Test
		// 7- modifier la ville
		
		adresse2.setVille("Paris 17ème arrondissement");
		
		// 8- afficher adresse modifiée
		System.out.println(adresse2);
		
		// 10- 11- Affecter des valeurs à un chercheur
		Chercheur chercheur1 = new Chercheur("Benjamin SeeLake", "DSI", 1);
		Chercheur chercheur2 = new Chercheur("Renald Well", "Chef de Projet", 2);
		//Chercheur chercheur3 = new Chercheur("Camilya ROZILLA", "Analyse Programmeur", 3);
		Chercheur chercheur4 = new Chercheur("Renald Well", "Chef de Projet", 4);
		Chercheur chercheur5 = new Chercheur("Renald Well", "Chef de Projet", 5);
		Chercheur chercheur6 = new Chercheur("Renald Well", "Chef de Projet", 6);
		Chercheur chercheur7 = new Chercheur("Renald Well", "Chef de Projet", 7);
		Chercheur chercheur8 = new Chercheur("Renald Well", "Chef de Projet", 8);
		
		// 13- un nouveau paramètre pour la classe Chercheur
		chercheur1.setDomaine("Informatique");
		chercheur2.setDomaine("Informatique");
		//chercheur3.setDomaine("Informatique");
		chercheur4.setDomaine("Informatique");
		chercheur5.setDomaine("Informatique");
		chercheur6.setDomaine("Informatique");
		chercheur7.setDomaine("Informatique");
		chercheur8.setDomaine("Informatique");
		// 14- Afficher les infos du chercheur 
		System.out.println(chercheur1);
		
		//15- Afficher le nb chercheur créés
		
		//16- méthode comparer chercheur
		
		// 17- modifier num ordi chercheur 1
		chercheur1.setNumOrdinateur(2);
		
		// 18- 
		Chercheur chercheur3 = new Chercheur();
		
		// 19- Ajouter un nom, un poste et un numéro de l’ordinateur à l’objet chercheur3
		chercheur3.setNom("Theodor Jimmy");
		chercheur3.setNumOrdinateur(4);
		
		 Chercheur[] tabChercheurs = new Chercheur[3];
		 tabChercheurs[0] = new Chercheur("Renald Well", "Chef de Projet", 8);
		 tabChercheurs[1] = new Chercheur("Renald Well", "Chef de Projet", 8);
		 tabChercheurs[2] = new Chercheur("Renald Well", "Chef de Projet", 8);
		
		// 20- Créer deux Bureaux bureau1 et bureau2, chaque bureau contient 3 chercheurs
		Bureau bureau1 = new Bureau(123456, "BR1", tabChercheurs);
		//Bureau bureau2 = new Bureau(987421, "BR1", chercheur1);
		
		// 21- Créer un Laboratoire laboratoire1 qui contient deux bureaux.
		Bureau[] tabBureau = new Bureau[2];
		tabBureau[0] = new Bureau(123456, "BR1", tabChercheurs);
		tabBureau[1] = new Bureau(453445, "BR2", tabChercheurs);
		Laboratoire laboratoire1 = new Laboratoire("labo1", "spe1", tabBureau, adresse2);
		
		// 22- Afficher les caractéristiques de l’objet laboratoire1.
		System.out.println(laboratoire1);
		
		
		
	
	}

}
