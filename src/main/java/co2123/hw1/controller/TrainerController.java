package co2123.hw1.controller;

import co2123.hw1.domain.Gym;
import co2123.hw1.domain.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

import static co2123.hw1.Hw1Application.gyms;

@Controller
public class TrainerController {

    @Autowired
    private TrainerValidator trainerValidator;

    @GetMapping("/trainers")
    public String listTrainers(@RequestParam("gym") int id, Model model) {

        // loops through gyms list and finds the gym with the same id given
        for(Gym gym : gyms){
            if(gym.getId() == id){
                model.addAttribute("gym", gym);
                return "trainers/list"; // return trainers.jsp
            }
        }
        return "redirect:gyms"; // if there is no gym with the id given, it will be redirected back to list.jsp
    }

    @GetMapping(value = "/newTrainer/{id}")
    // takes gym id as a parameter and will add it to the form and create new trainer
    public String newTrainer(@PathVariable("id") int id, Model model) {
        model.addAttribute("trainer", new Trainer());
        model.addAttribute("id", id);
        return "trainers/form";
    }

    @PostMapping("/addTrainer")
    public String addTrainer(@ModelAttribute Trainer trainer, @RequestParam("gym") int id, BindingResult result, Model model) {
        trainerValidator.validate(trainer, result);

        if(result.hasErrors()) {
            model.addAttribute("id", id);
            return "trainers/form";
        }

        // loop through gyms and checks if the id matches a gym which it will always
        for(Gym gym : gyms){
            if(gym.getId() == id){
                List<Trainer> newTrainers = new ArrayList<>();
                if (gym.getTrainers() != null) { // checks if gym has trainers
                    List<Trainer> previousTrainers = gym.getTrainers(); // gets existing trainers in gym
                    newTrainers.addAll(previousTrainers);
                    newTrainers.add(trainer);
                } else { // if gym has no trainers it cant copy a previous array of trainers, will just make a new list
                    newTrainers.add(trainer);
                }
                gym.setTrainers(newTrainers); // sets trainers despite bool
            }
        }
        return "redirect:gyms"; // Redirect to gym list
    }
}
