package co2123.hw1.domain;
import java.util.ArrayList;
import java.util.List;

public class Gym {
    private int id;
    private String classes;
    private String website;
    private List<Trainer> trainers;

    // full gym declaration
    public Gym(int id, String classes, String website, List<Trainer> trainers){
        this.id = id;
        this.classes = classes;
        this.website = website;
        this.trainers = trainers;
    }

    // gym with id, classes and website
    public Gym(int id, String classes, String website) {
        this.id = id;
        this.classes = classes;
        this.website = website;
    }

    // empty gym
    public Gym() {
    }

    // getter and setter methods
    public int getId(){
        return id;
    }

    public String getClasses(){
        return classes;
    }

    public String getWebsite(){
        return website;
    }

    public List<Trainer> getTrainers(){
        return trainers;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setClasses(String classes){
        this.classes = classes;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public void setTrainers(List<Trainer> trainers){
        this.trainers = trainers;
    }

    public void addTrainer(Trainer trainer){
        this.trainers.add(trainer);
    }
}
