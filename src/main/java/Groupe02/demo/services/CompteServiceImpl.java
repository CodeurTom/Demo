package Groupe02.demo.services;

import Groupe02.demo.entities.Compte;

import java.util.List;

public interface CompteServiceImpl {
    public List<Compte> showCompte();
    public Compte saveCompte (Compte compte);
    public Compte getOneCompte (Long id);
    public void deleteCompte (Long id);
}
