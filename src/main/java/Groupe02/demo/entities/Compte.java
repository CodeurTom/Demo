package Groupe02.demo.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class Compte {
    private String numeroCompte;
    private String typeCompte;
    private LocalDate dateCreation;
    private float solde;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client proprietaire;
}
