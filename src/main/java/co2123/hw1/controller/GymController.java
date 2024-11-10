package co2123.hw1.controller;

import co2123.hw1.domain.Gym;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static co2123.hw1.Hw1Application.gyms;

@Controller
public class GymController {

    @RequestMapping(value="/gyms")
    public String listGyms(Model model) {
        model.addAttribute("gyms", gyms);
        return "gyms/list";
    }

    @GetMapping("/trainers")
    public String listTrainers(@RequestParam("gym") int id, Model model) {
        Gym gym = gyms.stream()
                .filter(g -> g.getId() == id)
                .findFirst()
                .orElse(null);
        if (gym != null) {
            model.addAttribute("gym", gym);
            return "gyms/trainers"; // return trainers.jsp
        } else { //
            return "redirect:gyms"; // if there is no gym with the id given, it will be redirected back to list.jsp
        }
    }

    @RequestMapping(value = "/newGym", method = RequestMethod.GET)
    public ModelAndView newGymForm(){
        return new ModelAndView("form", new Gym());
    }

}
