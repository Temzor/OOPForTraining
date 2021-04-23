package java.repeatOOP.profession;

public class Builder extends Engineer {
    private int workExperience;

    public Builder(String industry, String name, String surName, String education, String birthday, String project, int workExperience) {
        super(industry, name, surName, education, birthday, project);
        this.workExperience = workExperience;
    }
}
