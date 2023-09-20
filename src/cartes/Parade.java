package cartes;

public class Parade extends Bataille {

	public Parade(int nombre, Type type) {
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
			toString = "Feu Vert";
			break;
		}
		case ACCIDENT: {
			toString = "Reparations";
			break;
		}
		case CREVAISON: {
			toString = "Roue De Secours";
			break;
		}
		default: {
			toString = "Essence";
			break;
		}
		}

		return toString;
	}
}
