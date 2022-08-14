package com.ii02735.springmvcdemo.model.validator;

import com.ii02735.springmvcdemo.model.Book;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class PagesNumberConstraintValidator implements ConstraintValidator<CheckPagesNumber, Book> {

    private String checkPagesNumberMessage;

    @Override
    public void initialize(CheckPagesNumber constraintAnnotation) {
        this.checkPagesNumberMessage = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(Book value, ConstraintValidatorContext context) {
        if(value.getPagesNumber() < 100) {
             final boolean isValid = !Arrays.asList(value.getSpecifications()).contains("Plus de 100 pages");
             if(!isValid) {
                 context.disableDefaultConstraintViolation();
                 context.buildConstraintViolationWithTemplate(this.checkPagesNumberMessage)
                         .addPropertyNode("pagesNumber").addConstraintViolation();
                 return false;
             }
        }
        return true;
    }
}
