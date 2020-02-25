package formValidation.model;

public class SousEchelle {
    private int sousEchelleID;
    private String sousEchelleNom;
    private int sousEchelleScoreTotal;
    private int sousEchelleNSP;
    private int sousEchelleLMP;

    public SousEchelle(){

    }

    public SousEchelle(int sousEchelleID, String sousEchelleNom, int sousEchelleScoreTotal, int sousEchelleNSP, int sousEchelleLMP) {
        this.sousEchelleID = sousEchelleID;
        this.sousEchelleNom = sousEchelleNom;
        this.sousEchelleScoreTotal = sousEchelleScoreTotal;
        this.sousEchelleNSP = sousEchelleNSP;
        this.sousEchelleLMP = sousEchelleLMP;
    }

    public int getSousEchelleID() {
        return sousEchelleID;
    }

    public void setSousEchelleID(int sousEchelleID) {
        this.sousEchelleID = sousEchelleID;
    }

    public String getSousEchelleNom() {
        return sousEchelleNom;
    }

    public void setSousEchelleNom(String sousEchelleNom) {
        this.sousEchelleNom = sousEchelleNom;
    }

    public int getSousEchelleScoreTotal() {
        return sousEchelleScoreTotal;
    }

    public void setSousEchelleScoreTotal(int sousEchelleScoreTotal) {
        this.sousEchelleScoreTotal = sousEchelleScoreTotal;
    }

    public int getSousEchelleNSP() {
        return sousEchelleNSP;
    }

    public void setSousEchelleNSP(int sousEchelleNSP) {
        this.sousEchelleNSP = sousEchelleNSP;
    }

    public int getSousEchelleLMP() {
        return sousEchelleLMP;
    }

    public void setSousEchelleLMP(int sousEchelleLMP) {
        this.sousEchelleLMP = sousEchelleLMP;
    }
}
