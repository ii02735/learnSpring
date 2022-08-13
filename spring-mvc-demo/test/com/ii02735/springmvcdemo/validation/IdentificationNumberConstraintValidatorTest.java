package com.ii02735.springmvcdemo.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import javax.validation.ConstraintValidatorContext;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ii02735.springmvcdemo.model.IdentificationType;
import com.ii02735.springmvcdemo.model.validator.CheckIdentificationNumber;
import com.ii02735.springmvcdemo.model.validator.IdentificationNumberConstraintValidator;

@ExtendWith(MockitoExtension.class)
public class IdentificationNumberConstraintValidatorTest {
	
	// Mock les dépendances de IdentificationNumberConstraintValidator
	
	// L'annotation
	@Mock
	private CheckIdentificationNumber checkIdentificationNumber;
	
	// Le contexte de validation, la méthode isValid en a besoin
	@Mock
	private ConstraintValidatorContext constraintValidatorContext ;
	
	
	@Test
	void testISBNDoesNotHave17Length() {
		
		// C'est à nous de préciser la valeur du préfixe à retourner (elle ne peut pas être injectée)
		when(checkIdentificationNumber.idPrefix()).thenReturn(IdentificationType.ISBN);
		
		// Instanciation de la classe de validation
		
		IdentificationNumberConstraintValidator validator = new IdentificationNumberConstraintValidator();
		validator.initialize(checkIdentificationNumber);
		
		
		boolean validationResult = validator.isValid("ISBN000", constraintValidatorContext);
		assertFalse(validationResult);
	}

	@Test
	void testISBNDoesNotBeginBy978Or979() {
		
		// C'est à nous de préciser la valeur du préfixe à retourner (elle ne peut pas être injectée)
		when(checkIdentificationNumber.idPrefix()).thenReturn(IdentificationType.ISBN);
		
		// Instanciation de la classe de validation
		
		IdentificationNumberConstraintValidator validator = new IdentificationNumberConstraintValidator();
		validator.initialize(checkIdentificationNumber);
		
		
		boolean validationResult = validator.isValid("ISBN0010000000000", constraintValidatorContext);
		assertFalse(validationResult);
	}
	
	@Test
	void testISBNIsValid() {
		
		// C'est à nous de préciser la valeur du préfixe à retourner (elle ne peut pas être injectée)
		when(checkIdentificationNumber.idPrefix()).thenReturn(IdentificationType.ISBN);
		
		// Instanciation de la classe de validation
		
		IdentificationNumberConstraintValidator validator = new IdentificationNumberConstraintValidator();
		validator.initialize(checkIdentificationNumber);
		
		
		boolean validationResult = validator.isValid("ISBN9790000000000", constraintValidatorContext);
		assertTrue(validationResult);
	}
	
	@Test
	void testEANDoesNotHave16Length() {
		
		// C'est à nous de préciser la valeur du préfixe à retourner (elle ne peut pas être injectée)
		when(checkIdentificationNumber.idPrefix()).thenReturn(IdentificationType.EAN);
		
		// Instanciation de la classe de validation
		
		IdentificationNumberConstraintValidator validator = new IdentificationNumberConstraintValidator();
		validator.initialize(checkIdentificationNumber);
		
		
		boolean validationResult = validator.isValid("EAN0", constraintValidatorContext);
		assertFalse(validationResult);
	}
	
	@Test
	void testEANDoesNotBeginBy978Or979() {
		
		// C'est à nous de préciser la valeur du préfixe à retourner (elle ne peut pas être injectée)
		when(checkIdentificationNumber.idPrefix()).thenReturn(IdentificationType.EAN);
		
		// Instanciation de la classe de validation
		
		IdentificationNumberConstraintValidator validator = new IdentificationNumberConstraintValidator();
		validator.initialize(checkIdentificationNumber);
		
		
		boolean validationResult = validator.isValid("EAN0010000000000", constraintValidatorContext);
		assertFalse(validationResult);
	}
	
	@Test
	void testEANIsValid() {
		
		// C'est à nous de préciser la valeur du préfixe à retourner (elle ne peut pas être injectée)
		when(checkIdentificationNumber.idPrefix()).thenReturn(IdentificationType.EAN);
		
		// Instanciation de la classe de validation
		
		IdentificationNumberConstraintValidator validator = new IdentificationNumberConstraintValidator();
		validator.initialize(checkIdentificationNumber);
		
		
		boolean validationResult = validator.isValid("EAN9790000000000", constraintValidatorContext);
		assertTrue(validationResult);
	}
	
	

}
