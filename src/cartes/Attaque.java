package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
	}

	@Override
	public int getNombre() {
		return super.getNombre();
	}

	@Override
	public Type getType() {
		return super.getType();
	}

	@Override
	public String toString() {
		String toString;
		switch (super.getType()) {
		case FEU: {
			toString = "Feu Rouge";
			break;
		}
		case ACCIDENT: {
			toString = "Accident";
			break;
		}
		case CREVAISON: {
			toString = "Crevaison";
			break;
		}
		default: {
			toString = "Panne D'Essence";
			break;
		}
		}

		return toString;
	}
	
	public boolean equals(Object objet) {
		if (objet instanceof Attaque) {
			Attaque carte = (Attaque) objet;
			return carte.toString() == toString();
		}
		return false;
	}

}
