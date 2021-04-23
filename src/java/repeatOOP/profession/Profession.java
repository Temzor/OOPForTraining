package java.repeatOOP.profession;

public class Profession {
    private String name;
    private String surName;
    private String education;
    private String birthday;

    public Profession(String name, String surName, String education, String birthday) {
        this.name = name;
        this.surName = surName;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
