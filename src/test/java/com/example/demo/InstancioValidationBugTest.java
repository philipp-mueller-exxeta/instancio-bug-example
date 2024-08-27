package com.example.demo;

import static org.hibernate.validator.internal.util.Contracts.assertTrue;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;
import org.instancio.junit.Given;
import org.instancio.junit.InstancioExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InstancioExtension.class)
public class InstancioValidationBugTest {

    @Test
    void generateExampleEntity(@Given ExampleEntity exampleEntity) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<ExampleEntity>> violationsExampleEntity = validator.validate(exampleEntity);
        assertTrue(violationsExampleEntity.isEmpty(), "Instancio generated an ExampleEntity bean that violates validation constraints");
    }
}
