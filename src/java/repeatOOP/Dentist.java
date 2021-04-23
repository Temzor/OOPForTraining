package java.repeatOOP;

public class Dentist extends Doctor{
    private String specialization;


    public Dentist(String name, String surName, String education, String birthday, String qualification, String patient, String specialization) {
        super(name, surName, education, birthday, qualification, patient);
        this.specialization = specialization;
    }
}
