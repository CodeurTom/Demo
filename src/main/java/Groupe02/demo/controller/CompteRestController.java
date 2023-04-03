package Groupe02.demo.controller;

import Groupe02.demo.entities.Compte;
import Groupe02.demo.service.CompteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class CompteRestController {
    private CompteService compteService;
    @GetMapping("/comptes")
    public List<Compte> listCompte(){
        return compteService.showCompte();
    }

    @PostMapping("compte/{id}")
    public Compte getCompte(@PathVariable Long id){
        return compteService.getOneCompte(id);
    }

    @GetMapping("/comptes")
    public Compte saveCompte(@RequestBody Long id, Compte compte){
        return compteService.saveCompte(compte);
    }

    @PostMapping("/comptes/{id}")
    public Compte updateCompte(@PathVariable Long id, Compte compte){
        compte.setId(id);
        return compteService.saveCompte(compte);
    }





}
