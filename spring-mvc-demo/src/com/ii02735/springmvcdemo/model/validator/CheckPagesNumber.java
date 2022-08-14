package com.ii02735.springmvcdemo.model.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PagesNumberConstraintValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckPagesNumber {

    String message() default "La spécification choisie n'est pas compatible avec le nombre de pages";
    // OBLIGATOIRE À PARTIR DE HIBERNATE VALIDATOR 4.2
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
