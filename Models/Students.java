package Models;

public class Students {
    
    private int id;
    private String studentID, surName, firstName, middleName, section;

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSection() {
        return section;
    }

}
