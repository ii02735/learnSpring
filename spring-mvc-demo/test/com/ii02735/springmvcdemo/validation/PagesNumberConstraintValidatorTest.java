package com.ii02735.springmvcdemo.validation;

import com.ii02735.springmvcdemo.model.Book;
import com.ii02735.springmvcdemo.model.IdentificationType;
import com.ii02735.springmvcdemo.model.validator.CheckPagesNumber;
import com.ii02735.springmvcdemo.model.validator.IdentificationNumberConstraintValidator;
import com.ii02735.springmvcdemo.model.validator.PagesNumberConstraintValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.validation.ConstraintValidatorContext;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PagesNumberConstraintValidatorTest {
	
	// Mock les dépendances de PagesNumberConstraintValidator
	
	// Le contexte de validation, la méthode isValid en a besoin
	@Mock
	private ConstraintValidatorContext constraintValidatorContext ;

	@Mock
	private CheckPagesNumber checkPagesNumber;

	private PagesNumberConstraintValidator validator;


	/**
	 * Propriétés mockées / imitées pour pouvoir faire fonctionner l'ajout de le contrainte de violation pour PagesNumberConstraintValidator
	 * @see CheckPagesNumber
	 */
	@Mock
	private ConstraintValidatorContext.ConstraintViolationBuilder constraintViolationBuilder;
	@Mock
	private ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext nodeBuilderCustomizableContext;

	private Book book;

	private final String testMessage = "Test invalid pagesNumber message";

	@BeforeEach
	void initialize()
	{
		// Instanciation de la classe de validation
		this.validator = new PagesNumberConstraintValidator();
		when(this.checkPagesNumber.message()).thenReturn(testMessage);
		this.validator.initialize(this.checkPagesNumber);
		this.book = new Book();
	}

	@Test
	void testBookHasLessThan100PagesWithSpecification() {

		book.setPagesNumber(99);
		book.setSpecifications(new String[]{"Plus de 100 pages"});

		when(this.constraintValidatorContext.buildConstraintViolationWithTemplate(testMessage)).thenReturn(this.constraintViolationBuilder);
		when(this.constraintValidatorContext.buildConstraintViolationWithTemplate(testMessage).addPropertyNode("pagesNumber")).thenReturn(this.nodeBuilderCustomizableContext);

		boolean validationResult = validator.isValid(book, constraintValidatorContext);
		assertFalse(validationResult);
	}

	@Test
	void testBookHasMore100PagesWithSpecification()
	{
		book.setPagesNumber(110);
		book.setSpecifications(new String[]{"Plus de 100 pages"});

		boolean validationResult = validator.isValid(book, constraintValidatorContext);
		assertTrue(validationResult);
	}

	@Test
	void testBookHasLess100PagesWithoutSpecification()
	{
		book.setPagesNumber(90);
		boolean validationResult = validator.isValid(book, constraintValidatorContext);
		assertTrue(validationResult);
	}

	@Test
	void testBookHasMore100PagesWithoutSpecification()
	{
		book.setPagesNumber(110);
		boolean validationResult = validator.isValid(book, constraintValidatorContext);
		assertTrue(validationResult);
	}
	

}
