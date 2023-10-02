package cartes;

public class FinLimite extends Limite {

	public FinLimite(int nombre) {
		super(nombre);
	}

	@Override
	public int getNombre() {
		return super.getNombre();
	}
	
	@Override
	public String toString() {
		return "Fin de limite de vitesse";
	}
	
	public boolean equals(Object objet) {
		if (objet instanceof FinLimite) {
			FinLimite carte = (FinLimite) objet;
			return carte.toString() == toString();
		}
		return false;
	}

}
