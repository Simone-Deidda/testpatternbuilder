package it.prova.testpatternbuilder.test;

import it.prova.testpatternbuilder.builder.PersonaBuilder;
import it.prova.testpatternbuilder.model.Persona;
import it.prova.testpatternbuilder.model.Sesso;

public class Test {

	public static void main(String[] args) {
		Persona persona1 = new PersonaBuilder().id(1L).nome("Filippo").cognome("Ferrara").altezzaInCM(170).peso(80)
				.sesso(Sesso.MASCHIO).coloreCapelli("Castani").coloreOcchi("Castani").numeroScarpa(40).build();
		System.out.println(persona1);

		try {
			Persona persona2 = new PersonaBuilder().id(1L).nome("Filippo").cognome("Ferrara").altezzaInCM(170).peso(80)
					.coloreCapelli("Castani").coloreOcchi("Castani").numeroScarpa(40).build();
		} catch (IllegalArgumentException e) {
			System.err.println(e);
		}

	}

}
