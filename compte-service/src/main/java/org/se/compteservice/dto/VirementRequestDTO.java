package org.se.compteservice.dto;

public class VirementRequestDTO {
	
	private Long codeSource;
	private Long codeDestination;
	private double montant;
	public Long getCodeSource() {
		return codeSource;
	}
	public void setCodeSource(Long codeSource) {
		this.codeSource = codeSource;
	}
	public Long getCodeDestination() {
		return codeDestination;
	}
	public void setCodeDestination(Long codeDestination) {
		this.codeDestination = codeDestination;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	

}
