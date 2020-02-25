package ecp;

import javax.persistence.*;
import java.util.Set;

@Entity
public class SousEchelle {

    @OneToMany
    private Set<Item> items;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private int scoreTot;
    private int scoreNSP;
    private int scoreImposs;


    public SousEchelle(int id, String nom, int scoreTot, int scoreNSP, int scoreImposs, Set<Item> items) {
        this.id = id;
        this.nom = nom;
        this.scoreTot = scoreTot;
        this.scoreNSP = scoreNSP;
        this.scoreImposs = scoreImposs;
        this.items = items;
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

    public int getScoreTot() {
        return scoreTot;
    }

    public void setScoreTot(int scoreTot) {
        this.scoreTot = scoreTot;
    }

    public int getScoreNSP() {
        return scoreNSP;
    }

    public void setScoreNSP(int scoreNSP) {
        this.scoreNSP = scoreNSP;
    }

    public int getScoreImposs() {
        return scoreImposs;
    }

    public void setScoreImposs(int scoreImposs) {
        this.scoreImposs = scoreImposs;
    }

    @OneToMany(mappedBy="sousEchelle")
    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
