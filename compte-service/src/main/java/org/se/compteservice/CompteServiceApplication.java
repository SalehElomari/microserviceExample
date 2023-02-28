package org.se.compteservice;

import java.util.Date;

import org.se.compteservice.entities.Compte;
import org.se.compteservice.enums.TypeCompte;
import org.se.compteservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class CompteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompteServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start (CompteRepository compteRepository) {
		return args->{
			
			compteRepository.save(new Compte(null,98000, new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null,12000, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null,200, new Date(), TypeCompte.COURANT));
			
			compteRepository.findAll().forEach(cp->{
				System.out.println(cp.getType());
				System.out.println(cp.getSolde());
			});
		};
	}
	
	
}
