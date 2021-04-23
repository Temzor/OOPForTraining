package java.repeatOOP.profession;

public class Engineer extends Profession {
    private String industry;
    private String project;


    public Engineer(String industry, String name, String surName, String education, String birthday, String project) {
        super(name, surName, education, birthday);
        this.industry = industry;
        this.project = project;
    }

    public Project project(Project project) {
        return new Project();
    }
}
