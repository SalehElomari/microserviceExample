package com.client.models;

public class Client {

	private Long idClient;
	private String name;
	private Integer idCompte;
	private Compte compte;
	

	public Client(Long idClient, String name, Integer idCompte, Compte compte) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.idCompte = idCompte;
		this.compte = compte;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Integer getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Integer idCompte) {
		this.idCompte = idCompte;
	}

}
