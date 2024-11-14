// Imports
package co2123.hw1.controller;
import co2123.hw1.domain.Gym;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static co2123.hw1.Hw1Application.gyms;

@Controller
public class GymController {

    @GetMapping(value="/gyms")
    // adds the gyms list to the model which will be viewed with the jsp
    public String listGyms(Model model) {
        model.addAttribute("gyms", gyms);
        return "gyms/list";
    }

    @RequestMapping("/newGym") // Requests
    public String newGym(Model model){
        // adds a new empty gym and the id of that gym to the model
        model.addAttribute("gym", new Gym());
        model.addAttribute("id", gyms.size() + 1);
        return "gyms/form";
    }

    @PostMapping("/addGym") // POST
    public String addGym(@ModelAttribute Gym gym) {
        // Add the new gym to the list
        gym.setId(gyms.size() + 1); // will set ID instead of having user set so there can be no duplicates
        gyms.add(gym); // add new gym to gyms list
        return "redirect:gyms";
    }
}
