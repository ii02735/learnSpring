package com.ii02735.springmvcdemo.model.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdentificationNumberConstraintValidator implements ConstraintValidator<CheckIdentificationNumber, String>{
	

	@Override
	public void initialize(CheckIdentificationNumber constraintAnnotation) {
		
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value != null)
		{
			if(!value.startsWith("ISBN") || (value.length() != 17))
				return false;
			value = value.replace("ISBN","");
			try {
				Integer.parseInt(value);
				return true;
			}catch(NumberFormatException e) {
				return false;
			}
		}
		return false;
	}

}
