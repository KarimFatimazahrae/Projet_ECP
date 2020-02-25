package ecp;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Item {
    @ManyToOne
    @JoinColumn(name="It_So_ID")
    private SousEchelle It_So_ID;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int It_ID;
    private String It_Nom;
    @OneToMany
    private Set<Note> notes;




    public Item(int It_ID, String It_Nom, Set<Note> notes) {
        this.It_ID = It_ID;
        this.It_Nom = It_Nom;
        this.notes = notes;
    }

    public Item()
    {

    }

    public int getIt_ID() {
        return It_ID;
    }

    public void setIt_ID(int it_ID) {
        this.It_ID = it_ID;
    }

    public String getIt_Nom() {
        return It_Nom;
    }

    public void setIt_Nom(String it_Nom) {
        this.It_Nom = it_Nom;
    }


    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    public SousEchelle getIt_So_ID() {
        return It_So_ID;
    }

    public void setIt_So_ID(SousEchelle it_So_ID) {
        this.It_So_ID = it_So_ID;
    }
}
