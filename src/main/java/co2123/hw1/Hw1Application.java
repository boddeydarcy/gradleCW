package co2123.hw1;

import co2123.hw1.domain.Gym;
import co2123.hw1.domain.Trainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application {
    public static List<Gym> gyms = new ArrayList<>();

    public static void main(String[] args) {
        // initializing a gym and 2 trainers to that gym
        Trainer trainer1 = new Trainer("Darcy", "Squats", "Legs", 45);
        Trainer trainer2 = new Trainer("Adam", "Bench Press", "Chest", 60);
        Gym gym1 = new Gym(1, "Pilates", "gym.com", List.of(trainer1, trainer2));
        gyms.add(gym1);

        SpringApplication.run(Hw1Application.class, args);
    }

}
