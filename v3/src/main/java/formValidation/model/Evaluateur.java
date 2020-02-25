package formValidation.model;

public class Evaluateur {
    private Long evalId;
    private String userName;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String encrytedPassword;
    private int typeEvaluateur ;
    private String countryCode;

    public Evaluateur() {

    }

    public Evaluateur(Long evalId, String userName, String firstName, String lastName, //
                   int typeEvaluateur, String gender, //
                   String email,String countryCode, String encrytedPassword) {
        super();
        this.evalId = evalId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeEvaluateur = typeEvaluateur;
        this.gender = gender;
        this.email = email;
        this.countryCode= countryCode;
        this.encrytedPassword = encrytedPassword;
    }

    public Long getUserId() {
        return evalId;
    }

    public void setUserId(Long evalId) {
        this.evalId = evalId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTypeEvaluateur(int typeEvaluateur) {
        this.typeEvaluateur = typeEvaluateur;
    }

    public int getTypeEvaluateur() {
        return typeEvaluateur ;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}

