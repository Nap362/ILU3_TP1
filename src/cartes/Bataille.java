package cartes;

public abstract class Bataille extends Probleme {

	public Bataille(int nombre, Type type) {
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
}
