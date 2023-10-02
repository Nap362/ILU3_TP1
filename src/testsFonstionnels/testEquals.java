package testsFonstionnels;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cartes.Attaque;
import cartes.Botte;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.Probleme.Type;

public class testEquals {
	private Attaque attaque1 = new Attaque(5, Type.ACCIDENT);
	private Attaque attaque2 = new Attaque(3, Type.ACCIDENT);
	private Botte botte1 = new Botte(5, Type.ACCIDENT);
	private Botte botte2 = new Botte(5, Type.CREVAISON);
	private DebutLimite debLimite = new DebutLimite(1);
	private FinLimite finLimite = new FinLimite(1);
	
	@Test
	void testEquals() {
		assertTrue(attaque1.equals(attaque1));
		assertTrue(attaque1.equals(attaque2));
		assertFalse(attaque1.equals(botte1));
		assertFalse(botte2.equals(botte1));
		assertFalse(debLimite.equals(finLimite));
	}

}
