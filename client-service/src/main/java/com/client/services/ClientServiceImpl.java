package com.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.feignClient.CompteClientFeign;
import com.client.models.Client;
import com.client.models.Compte;


@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private CompteClientFeign clientFeing;

	

	@Override
	public Client findClientById(Long id) {
		Client client= new Client(1L,"EL OMARI Saleh", 1,null);
		Compte compte= findCompteById(client.getIdCompte());
		client.setCompte(compte);
		return client;
	}



	@Override
	public Compte findCompteById(Integer id) {
		
		return clientFeing.getCompte(id);
	}
	

}
