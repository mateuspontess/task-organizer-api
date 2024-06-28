package br.com.mateus.taskorganizer.application.dto.user.input;

import jakarta.validation.constraints.NotBlank;

public record AuthenticationDTO(
    
    @NotBlank
    String login, 
    
    @NotBlank
    String password
) {}