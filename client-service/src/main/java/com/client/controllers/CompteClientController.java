package com.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.client.models.Client;
import com.client.services.ClientService;


@RestController
public class CompteClientController {
	
	
	
	@Autowired
	private ClientService clientService;

	
	
	@GetMapping(path = "/client/{id}")
	public Client getCompte(@PathVariable Long id){
		
		return clientService.findClientById(id);
		
	}
	
	
	

}
