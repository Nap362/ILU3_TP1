package cartes;

public class DebutLimite extends Limite {

	public DebutLimite(int nombre) {
		super(nombre);
	}

	@Override
	public int getNombre() {
		return super.getNombre();
	}
	
	@Override
	public String toString() {
		return "Limite de vitesse";
	}
	
	public boolean equals(Object objet) {
		if (objet instanceof DebutLimite) {
			DebutLimite carte = (DebutLimite) objet;
			return carte.toString() == toString();
		}
		return false;
	}

}
