package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot implements Iterable<Carte> {
	private Carte[] cartes;
	private int nbCartes = 0;

	public Sabot(int capacite) {
		this.cartes = new Carte[capacite];
	}

	public boolean estVide() {
		return nbCartes == 0;
	}

	private void ajouterCarte(Carte carte) {
		if (nbCartes < cartes.length) {
			cartes[nbCartes] = carte;
			nbCartes++;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void ajouterFamilleCarte(Carte carte) {
		for (int i = 0; i < carte.getNombre(); i++) {
			ajouterCarte(carte);
		}
	}

	public void ajouterFamilleCarte(Carte... cartes) {
		for (Carte carte : cartes) {
			ajouterFamilleCarte(carte);
		}
	}

	private class Iterateur implements Iterator<Carte> {
		private int indiceIt = 0;
		private int nombreOperationsReference = nbCartes;
		private int nombreOperations = nombreOperationsReference;
		private boolean nextEffectue = false;


		@Override
		public boolean hasNext() {
			return indiceIt < nbCartes;
		}

		@Override
		public Carte next() {
			verificationConcurrence();
			if (hasNext()) {
				Carte next = cartes[indiceIt];
				indiceIt++;
				nextEffectue=true;
				return next;
			} else {
				throw new NoSuchElementException();
			}
		}

		public void remove() {
			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			verificationConcurrence();
			for (int i = indiceIt - 1; i < nbCartes - 1; i++) {
				cartes[i] = cartes[i + 1];
			}
			nbCartes--;
			indiceIt--;
			nombreOperations++;
			nombreOperationsReference++;
			nextEffectue=false;
		}
		
		private void verificationConcurrence(){
			 if (nombreOperations != nombreOperationsReference) {
				 throw new ConcurrentModificationException();
			 }
		}


	}

	@Override
	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	public Carte piocher() {
		Iterator<Carte> iterateur = iterator();
		Carte carte = iterateur.next();
		iterateur.remove();
		return carte;
	}
}
