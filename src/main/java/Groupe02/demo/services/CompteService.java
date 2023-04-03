package Groupe02.demo.services;

import Groupe02.demo.entities.Compte;
import Groupe02.demo.repositories.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompteService {
    CompteRepository CR;
    public List<Compte> showCompte() {
        return CR.findAll();
    }
    public Compte saveCompte (Compte compte) {
        return CR.save (compte);
    }
    public Compte getOneCompte (Long id) {
        return CR.findById(id).get();
    }
    public void deleteCompte (Long id) {
        CR.deleteById(id);
    }
}
