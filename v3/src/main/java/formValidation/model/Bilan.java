package formValidation.model;

public class Bilan {

    private int bilanID;
    private String bilanText;
    private int bilanPaID;

    public Bilan() {

    }
    public Bilan(int bilanID, String bilanText, int bilanPaID) {
        this.bilanID = bilanID;
        this.bilanText = bilanText;
        this.bilanPaID = bilanPaID;
    }

    public int getBilanID() {
        return bilanID;
    }

    public void setBilanID(int bilanID) {
        this.bilanID = bilanID;
    }

    public String getBilanText() {
        return bilanText;
    }

    public void setBilanText(String bilanText) {
        this.bilanText = bilanText;
    }

    public int getBilanPaID() {
        return bilanPaID;
    }

    public void setBilanPaID(int bilanPaID) {
        this.bilanPaID = bilanPaID;
    }
}
