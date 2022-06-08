package it.prova.testpatternbuilder.builder;

import it.prova.testpatternbuilder.model.Persona;
import it.prova.testpatternbuilder.model.Sesso;

public final class PersonaBuilder {
	private Long id;
	private String nome;
	private String cognome;
	private Sesso sesso;
	private Integer altezzaInCM;
	private Integer peso;
	private String coloreOcchi;
	private String coloreCapelli;
	private Integer numeroScarpa;

	public static PersonaBuilder newBuilder() {
		return new PersonaBuilder();
	}

	public PersonaBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}

	public PersonaBuilder cognome(String cognome) {
		this.cognome = cognome;
		return this;
	}

	public PersonaBuilder sesso(Sesso sesso) {
		this.sesso = sesso;
		return this;
	}

	public PersonaBuilder altezzaInCM(Integer altezzaInCM) {
		this.altezzaInCM = altezzaInCM;
		return this;
	}

	public PersonaBuilder peso(Integer peso) {
		this.peso = peso;
		return this;
	}

	public PersonaBuilder coloreOcchi(String coloreOcchi) {
		this.coloreOcchi = coloreOcchi;
		return this;
	}

	public PersonaBuilder coloreCapelli(String coloreCapelli) {
		this.coloreCapelli = coloreCapelli;
		return this;
	}

	public PersonaBuilder numeroScarpa(Integer numeroScarpa) {
		this.numeroScarpa = numeroScarpa;
		return this;
	}

	public PersonaBuilder id(Long id) {
		this.id = id;
		return this;
	}

	public Persona build() {
		if (sesso == null) {
			throw new IllegalArgumentException("Sesso deve essere inizializzato.");
		}
		
		return new Persona(id, nome, cognome, sesso, altezzaInCM, peso, coloreOcchi, coloreCapelli, numeroScarpa);
	}
}
