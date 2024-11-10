package co2123.hw1.domain;

public class Trainer {
    private String name;
    private String skills;
    private String expertise;
    private int duration;

    public Trainer(String name, String skills, String expertise, int duration) {
        this.name = name;
        this.skills = skills;
        this.expertise = expertise;
        this.duration = duration;
    }

    public String getName(){
        return name;
    }

    public String getSkills() {
        return skills;
    }

    public String getExpertise(){
        return expertise;
    }

    public int getDuration(){
        return duration;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSkills(String skills){
        this.skills = skills;
    }

    public void setExpertise(String expertise){
        this.expertise = expertise;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }
}
