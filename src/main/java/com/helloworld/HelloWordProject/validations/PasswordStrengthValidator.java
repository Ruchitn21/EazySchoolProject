package com.helloworld.HelloWordProject.validations;

import com.helloworld.HelloWordProject.annotation.PasswordValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class PasswordStrengthValidator implements ConstraintValidator<PasswordValidator, String> {
    
    List<String> weakPasswords;

    @Override
    public void initialize(PasswordValidator passwordValidator) {
        weakPasswords = Arrays.asList("123456", "password", "qwerty");
    }

    @Override
    public boolean isValid(String passwordField, ConstraintValidatorContext cxt) {
        return passwordField != null && 
               passwordField.length() >= 8 && 
               !weakPasswords.contains(passwordField);
    }
} 