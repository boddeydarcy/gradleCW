package co2123.hw1.controller;

import co2123.hw1.domain.Trainer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.List;

@Component
public class TrainerValidator implements Validator {

    private final static List<String> valid_expertise = Arrays.asList("Tai Chi", "Pilates", "Yoga");

    @Override
    public boolean supports(Class<?> clazz) {
        return Trainer.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Trainer trainer = (Trainer) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty", "Name is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "skills", "skills.empty", "Skills cannot be empty");

        if (!valid_expertise.contains(trainer.getExpertise())) {
            errors.rejectValue("expertise", "expertise.invalid", "Expertise isn't valid must be 'Tai Chi', 'Pilates' or 'Yoga'");
        }

        if (trainer.getDuration() < 45 || trainer.getDuration() > 60) {
            errors.rejectValue("duration", "duration.empty", "Duration must be between 45 and 60");
        }
    }
}
