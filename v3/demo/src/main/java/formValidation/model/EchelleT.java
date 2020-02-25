package formValidation.model;

import java.util.Set;

public class EchelleT {
    private int echelleId;
    private int nomEchelle;
    private Set<SousEchelle> sousEchelles;


    public EchelleT(int echelleId, int nomEchelle, Set<SousEchelle> sousEchelles) {
        this.echelleId = echelleId;
        this.nomEchelle = nomEchelle;
        this.sousEchelles = sousEchelles;
    }

    public int getEchelleId() {
        return echelleId;
    }

    public void setEchelleId(int echelleId) {
        this.echelleId = echelleId;
    }

    public int getNomEchelle() {
        return nomEchelle;
    }

    public void setNomEchelle(int nomEchelle) {
        this.nomEchelle = nomEchelle;
    }

    public Set<SousEchelle> getSousEchelles() {
        return sousEchelles;
    }

    public void setSousEchelles(Set<SousEchelle> sousEchelles) {
        this.sousEchelles = sousEchelles;
    }
}
