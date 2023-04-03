package Groupe02.demo.service;

import Groupe02.demo.entities.Compte;
import Groupe02.demo.repositories.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompteService {
    public List<Compte> showCompte() {
        return CompteRepository.findAll();
    }
    public Compte saveCompte (Compte compte) {
        return CompteRepository.save (compte);
    }
    public Compte getOneCompte (Long id) {
        return CompteRepository.findById(id).get();
    }
    public void deleteCompte (Long id) {
        CompteRepository.delete ById(id);
    }
}
