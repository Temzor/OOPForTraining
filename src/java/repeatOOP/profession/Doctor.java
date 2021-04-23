package java.repeatOOP.profession;

public class Doctor extends Profession {
    private String qualification;
    private String patient;

    public Doctor(String name, String surName, String education, String birthday, String qualification, String patient) {
        super(name, surName, education, birthday);
        this.qualification = qualification;
        this.patient = patient;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}
