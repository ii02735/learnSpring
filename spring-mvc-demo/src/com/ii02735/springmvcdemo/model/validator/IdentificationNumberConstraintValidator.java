package com.ii02735.springmvcdemo.model.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.ii02735.springmvcdemo.model.IdentificationType;

public class IdentificationNumberConstraintValidator implements ConstraintValidator<CheckIdentificationNumber, String>{
	
	
	private IdentificationType idPrefix;
	
	@Override
	public void initialize(CheckIdentificationNumber constraintAnnotation) {
		this.idPrefix = constraintAnnotation.idPrefix();
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean validationResult = false;
		int validLength = idPrefix.equals(IdentificationType.EAN) ? 16 : 17;
		System.out.println(value);
		if(value.length() > 0)
		{
			boolean validStarts = value.startsWith(String.format("%s978",idPrefix.toString())) || value.startsWith(String.format("%s979",idPrefix.toString()));

			if(!validStarts || (value.length() != validLength))
				return false;
			value = value.replace(this.idPrefix.toString(),"");
			validationResult = value.matches("\\d+");
		}
		return validationResult;
	}

}
