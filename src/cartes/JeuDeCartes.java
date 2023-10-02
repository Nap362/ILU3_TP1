package cartes;

import cartes.Probleme.Type;
import jeu.Sabot;

public class JeuDeCartes{
	private Carte[] typesDeCartes = new Carte[19];
	public Sabot listeCartes;
	
	public JeuDeCartes() {
		Carte prioritaire = new Botte(1, Type.FEU);
		typesDeCartes[0] = prioritaire;
		Carte citerne = new Botte(1, Type.ESSENCE);
		typesDeCartes[1] = citerne;
		Carte increvable = new Botte(1, Type.CREVAISON);
		typesDeCartes[2] = increvable;
		Carte asVolant = new Botte(1, Type.ACCIDENT);
		typesDeCartes[3] = asVolant;
		Carte feuRouge = new Attaque(5, Type.FEU);
		typesDeCartes[4] = feuRouge;
		Carte panne = new Attaque(3, Type.ESSENCE);
		typesDeCartes[5] = panne;
		Carte crevaison = new Attaque(3, Type.CREVAISON);
		typesDeCartes[6] = crevaison;
		Carte accident = new Attaque(3, Type.ACCIDENT);
		typesDeCartes[7] = accident;
		Carte debLimite = new DebutLimite(4);
		typesDeCartes[8] = debLimite;
		Carte feuVert = new Parade(14, Type.FEU);
		typesDeCartes[9] = feuVert;
		Carte essence = new Parade(6, Type.ESSENCE);
		typesDeCartes[10] = essence;
		Carte roueSecours = new Parade(6, Type.CREVAISON);
		typesDeCartes[11] = roueSecours;
		Carte reparation = new Parade(6, Type.ACCIDENT);
		typesDeCartes[12] = reparation;
		Carte finLimite = new FinLimite(6);
		typesDeCartes[13] = finLimite;
		Carte borne25 = new Borne(10, 25);
		typesDeCartes[14] = borne25;
		Carte borne50 = new Borne(10, 50);
		typesDeCartes[15] = borne50;
		Carte borne75 = new Borne(10, 75);
		typesDeCartes[16] = borne75;
		Carte borne100 = new Borne(12, 100);
		typesDeCartes[17] = borne100;
		Carte borne200 = new Borne(4, 200);
		typesDeCartes[18] = borne200;
		listeCartes = new Sabot(106);
		listeCartes.ajouterFamillesCarte(typesDeCartes);
	}
	
	public boolean checkCount() {
		for (Carte carteType : typesDeCartes) {
			int nbrExemplaires = 0;
			for (Carte carte : listeCartes) {
				if (carteType.equals(carte)) {
					nbrExemplaires++;
				}
			}
			if (nbrExemplaires!=carteType.getNombre()) {
				return false;
			}
		}
		return true;
	}
}
