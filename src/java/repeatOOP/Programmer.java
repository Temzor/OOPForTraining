package java.repeatOOP;

public class Programmer extends Engineer {
    private String languageOfCoding;

    public Programmer(String industry, String name, String surName, String education, String birthday, String project, String languageOfCoding) {
        super(industry, name, surName, education, birthday, project);
        this.languageOfCoding =languageOfCoding;
    }
}
