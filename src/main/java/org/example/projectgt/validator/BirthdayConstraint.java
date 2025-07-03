package org.example.projectgt.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {BirthdayValidator.class})
public @interface BirthdayConstraint {
    String message() default "Invalid date of birth";

    int min();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
