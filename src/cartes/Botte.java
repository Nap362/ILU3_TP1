package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
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
	
	public String toString() {
		String toString;
		switch (super.getType()) {
		case FEU: {
			toString = "Vehicule Prioritaire";
			break;
		}
		case ACCIDENT: {
			toString = "As Du Volant";
			break;
		}
		case CREVAISON: {
			toString = "Increvable";
			break;
		}
		default: {
			toString = "Citerne D'Essence";
			break;
		}
		}

		return toString;
	}

}
