package formValidation.model;

public class Patient {

    private int patientId;
    private String nomPatient;
    private String prenomPatient;
    private String sexePatient;
    private String dateNaissancePatient;

    public Patient(){

    }

    public Patient(int patientId, String nomPatient, String prenomPatient, String sexePatient, String dateNaissancePatient) {
        this.patientId = patientId;
        this.nomPatient = nomPatient;
        this.prenomPatient = prenomPatient;
        this.sexePatient = sexePatient;
        this.dateNaissancePatient = dateNaissancePatient;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public String getPrenomPatient() {
        return prenomPatient;
    }

    public void setPrenomPatient(String prenomPatient) {
        this.prenomPatient = prenomPatient;
    }

    public String getSexePatient() {
        return sexePatient;
    }

    public void setSexePatient(String sexePatient) {
        this.sexePatient = sexePatient;
    }

    public String getDateNaissancePatient() {
        return dateNaissancePatient;
    }

    public void setDateNaissancePatient(String dateNaissancePatient) {
        this.dateNaissancePatient = dateNaissancePatient;
    }
}
