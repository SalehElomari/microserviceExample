package com.client.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.client.models.Compte;

@FeignClient(name="COMPTE-SERVICE")
public interface CompteClientFeign {
	
	@GetMapping(path = "/comptes/{id}")
    public Compte getCompte(@PathVariable Integer id);

}
