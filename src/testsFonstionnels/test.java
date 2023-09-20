package testsFonstionnels;

import cartes.Attaque;
import cartes.Botte;
import cartes.Carte;
import cartes.Parade;
import cartes.Probleme.Type;
import jeu.Sabot;

public class test {
	public static void main(String[] args) {
		Carte accident = new Attaque(3, Type.ACCIDENT);
		Carte reparation = new Parade(3, Type.ACCIDENT);
		Carte asDuVolant = new Botte(1, Type.ACCIDENT);
		Sabot sabot = new Sabot(10);
		sabot.ajouterFamilleCarte(accident, reparation, asDuVolant);
		StringBuilder affichage =new StringBuilder();
		while (!sabot.estVide()) {
			affichage.append("Je pioche " + sabot.piocher().toString() + "\n");
			
		}
		System.out.println(affichage.toString());
	}
}
