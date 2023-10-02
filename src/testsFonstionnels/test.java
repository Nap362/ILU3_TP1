package testsFonstionnels;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import cartes.Attaque;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.FinLimite;
import cartes.JeuDeCartes;
import cartes.Parade;
import cartes.Probleme.Type;
import jeu.Sabot;

public class test {
	public static void main(String[] args) {
		Carte accident = new Attaque(3, Type.ACCIDENT);
		Carte reparation = new Parade(3, Type.ACCIDENT);
		Carte asDuVolant = new Botte(1, Type.ACCIDENT);
		Sabot sabot = new Sabot(10);
		sabot.ajouterFamillesCarte(accident, reparation, asDuVolant);
		StringBuilder affichage =new StringBuilder();
		for(Iterator<Carte> iterateur = sabot.iterator(); iterateur.hasNext();) {
			affichage.append("Je pioche " + iterateur.next().toString() + "\n");
			iterateur.remove();
//			sabot.piocher();
//			sabot.ajouterFamilleCarte(asDuVolant);
		}
//		while (!sabot.estVide()) {
//			affichage.append("Je pioche " + sabot.next().toString() + "\n");
//			
//		}
		System.out.println(affichage.toString());
		
		
		JeuDeCartes jeu = new JeuDeCartes();
		StringBuilder affichage2 =new StringBuilder();
		affichage2.append("Jeu de cartes complet :\n");
		for (Carte carte : jeu.listeCartes) {
			affichage2.append(carte.toString() + "\n");
		}
		System.out.println(affichage2.toString());
		
		System.out.println("CheckCount = " + jeu.checkCount() + "\n");
	}
}
