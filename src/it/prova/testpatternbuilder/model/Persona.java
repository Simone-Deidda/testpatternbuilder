package it.prova.testpatternbuilder.model;

public class Persona {
	private Long id;
	private String nome;
	private String cognome;
	private Sesso sesso = null;
	private Integer altezzaInCM;
	private Integer peso;
	private String coloreOcchi;
	private String coloreCapelli;
	private Integer numeroScarpa;

	public Persona() {
	}

	public Persona(Long id, String nome, String cognome, Sesso sesso, Integer altezza, Integer peso, String coloreOcchi,
			String coloreCapelli, Integer numeroScarpa) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.altezzaInCM = altezza;
		this.peso = peso;
		this.coloreOcchi = coloreOcchi;
		this.coloreCapelli = coloreCapelli;
		this.numeroScarpa = numeroScarpa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	public Integer getAltezzaInCM() {
		return altezzaInCM;
	}

	public void setAltezzaInCM(Integer altezza) {
		this.altezzaInCM = altezza;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getColoreOcchi() {
		return coloreOcchi;
	}

	public void setColoreOcchi(String coloreOcchi) {
		this.coloreOcchi = coloreOcchi;
	}

	public String getColoreCapelli() {
		return coloreCapelli;
	}

	public void setColoreCapelli(String coloreCapelli) {
		this.coloreCapelli = coloreCapelli;
	}

	public Integer getNumeroScarpa() {
		return numeroScarpa;
	}

	public void setNumeroScarpa(Integer numeroScarpa) {
		this.numeroScarpa = numeroScarpa;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", sesso=" + sesso + ", altezza="
				+ altezzaInCM + ", peso=" + peso + ", coloreOcchi=" + coloreOcchi + ", coloreCapelli=" + coloreCapelli
				+ ", numeroScarpa=" + numeroScarpa + "]";
	}

	
}
