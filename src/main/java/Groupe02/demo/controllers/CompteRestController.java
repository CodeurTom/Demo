package Groupe02.demo.controllers;

import Groupe02.demo.entities.Compte;
import Groupe02.demo.services.CompteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
