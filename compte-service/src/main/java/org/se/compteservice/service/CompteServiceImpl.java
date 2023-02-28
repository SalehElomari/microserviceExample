package org.se.compteservice.service;

import javax.transaction.Transactional;

import org.se.compteservice.entities.Compte;
import org.se.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CompteServiceImpl implements CompteService{
	
	
	@Autowired
	CompteRepository compteRepository;

	@Override
	public void virement(Long codeSource, Long codeDestination, double montant) {
         Compte c1=	compteRepository.findById(codeSource).get();
         Compte c2=	compteRepository.findById(codeDestination).get();
         c1.setSolde(c1.getSolde()-montant);
         c2.setSolde(c2.getSolde()+montant);
         
         compteRepository.save(c1);
         compteRepository.save(c2);
         
	}

	
}
