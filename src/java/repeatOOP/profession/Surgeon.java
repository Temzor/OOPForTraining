package java.repeatOOP.profession;

public class Surgeon extends  Doctor {
    private String surgeonType;

    public Surgeon(String name, String surName, String education, String birthday, String qualification, String patient, String surgeonType) {
        super(name, surName, education, birthday, qualification, patient);
        this.surgeonType = surgeonType;
    }
}
