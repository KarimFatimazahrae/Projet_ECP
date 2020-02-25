package formValidation.model;

public class Item {
    private int idItem;
    private String nomItem;
    private String soIdItem;

    public Item(){

    }

    public Item(int idItem, String nomItem, String soIdItem) {
        this.idItem = idItem;
        this.nomItem = nomItem;
        this.soIdItem = soIdItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNomItem() {
        return nomItem;
    }

    public void setNomItem(String nomItem) {
        this.nomItem = nomItem;
    }

    public String getSoIdItem() {
        return soIdItem;
    }

    public void setSoIdItem(String soIdItem) {
        this.soIdItem = soIdItem;
    }
}
