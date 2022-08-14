package com.ii02735.springmvcdemo.model.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.ii02735.springmvcdemo.model.IdentificationType;

@Constraint(validatedBy = IdentificationNumberConstraintValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckIdentificationNumber {
	
	// Message de validation par défaut
	String message() default "Le numéro d'identification du livre n'est pas correct";
	
	
	IdentificationType idPrefix() default IdentificationType.ISBN;
	
	// OBLIGATOIRE À PARTIR DE HIBERNATE VALIDATOR 4.2
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
