package org.se.compteservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.se.compteservice.enums.TypeCompte;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Compte {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
	private double solde;
	private Date dateCreation;
	
	@Enumerated(EnumType.STRING)
	private TypeCompte type;

	
	
	public Compte() {
		super();
	}

	public Compte(Long code, double solde, Date dateCreation, TypeCompte type) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.type = type;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public TypeCompte getType() {
		return type;
	}

	public void setType(TypeCompte type) {
		this.type = type;
	}
	
	

	
	
}
