package com.client.services;

import com.client.models.Client;
import com.client.models.Compte;

public interface ClientService {
	
	Client findClientById(Long id);
	
	Compte findCompteById(Integer id);

}
