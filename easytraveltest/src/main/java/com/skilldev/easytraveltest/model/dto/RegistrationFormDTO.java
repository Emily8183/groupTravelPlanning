package com.skilldev.easytraveltest.model.dto;

public class RegistrationFormDTO extends LoginFormDTO{

    @NotNull(message = "Password is required")
    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 30, message = "Password must be 6-30 characters long.")
    private String verifyPassword;
}
