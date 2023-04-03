package Groupe02.demo.repositories;

import Groupe02.demo.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository <Compte, String>{
}
