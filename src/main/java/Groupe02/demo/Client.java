@Entity
@Table(name = "clients")
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "prenom")
    private String prenom;
    
    @Column(name = "date_de_naissance")
    private LocalDate dateNaissance;
    
    @Column(name = "sexe")
    private String sexe;
    
    @Column(name = "adresse")
    private String adresse;
    
    @Column(name = "telephone")
    private String telephone;
    
    @Column(name = "courriel")
    private String courriel;
    
    @Column(name = "nationalite")
    private String nationalite;
    
    @OneToMany(mappedBy = "client")
    private List<Compte> comptes;
    
    // Getters et setters
}
