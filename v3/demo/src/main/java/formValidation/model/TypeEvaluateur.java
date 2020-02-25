package formValidation.model;

import java.util.List;

public class TypeEvaluateur {

    private int typeEvaluateurID;
    private String typeEvaluateurName;

    public TypeEvaluateur(){

    }

    public TypeEvaluateur(int typeEvaluateurID, String typeEvaluateurName) {
        this.typeEvaluateurID = typeEvaluateurID;
        this.typeEvaluateurName = typeEvaluateurName;
    }

    public static int getTypeEvaluateurID() {
        return getTypeEvaluateurID();
    }

    public void setTypeEvaluateurID(int typeEvaluateurID) {
        this.typeEvaluateurID = typeEvaluateurID;
    }

    public String getTypeEvaluateurName() {
        return typeEvaluateurName;
    }

    public void setTypeEvaluateurName(String typeEvaluateurName) {
        this.typeEvaluateurName = typeEvaluateurName;
    }
}
