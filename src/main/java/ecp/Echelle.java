package ecp;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Echelle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @OneToMany
    private Set<SousEchelle> sousEchelle;

    public Echelle()
    {

    }

    public Echelle(int id, String nom, Set<SousEchelle> sousEchelle) {
        this.id = id;
        this.nom = nom;
        this.sousEchelle = sousEchelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
