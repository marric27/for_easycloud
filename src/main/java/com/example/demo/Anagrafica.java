package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anagrafica {
	
	public Anagrafica(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Anagrafica() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	public String getCognome() { return cognome; }
	public void setCognome(String cognome) { this.cognome = cognome; }
	public boolean isDeleted() { return deleted; }
	public void setDeleted(boolean deleted) { this.deleted = deleted; }
	
	@Override
	public String toString() {
		return "Anagrafica [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", deleted=" + deleted + "]";
	}

	String nome, cognome;
	boolean deleted;
}
