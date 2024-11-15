package co2123.hw1.controller;

import co2123.hw1.domain.Gym;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import static co2123.hw1.Hw1Application.gyms;

@Component
public class GymValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Gym gym = (Gym) target;

        // loops through gym lists and gets and checks previously used ids
        for(Gym g : gyms){
            if(g.getId() == gym.getId()){
                errors.rejectValue("id", "id.used", "Gym ID already exists");
            }
        }

        // rejects if classes or website is empty
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "classes", "classes.empty", "Classes cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "website", "website.empty", "Website cannot be empty");
    }
}
