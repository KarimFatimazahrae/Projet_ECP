package formValidation.model;

public class Note {

    private int idNote;
    private String note;
    private int itIdNote;

    public Note(){

    }

    public Note(int idNote, String note, int itIdNote) {
        this.idNote = idNote;
        this.note = note;
        this.itIdNote = itIdNote;
    }

    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getItIdNote() {
        return itIdNote;
    }

    public void setItIdNote(int itIdNote) {
        this.itIdNote = itIdNote;
    }
}
