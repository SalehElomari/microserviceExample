package org.se.compteservice.repositories;

import org.se.compteservice.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository  extends JpaRepository<Compte, Long>{

}
