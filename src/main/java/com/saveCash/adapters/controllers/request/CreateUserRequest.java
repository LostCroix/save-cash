package com.saveCash.adapters.controllers.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

public class CreateUserRequest {

    @NotNull(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    @Schema(description = "User name")
    private String name;

    @NotNull(message = "Surname is required")
    @Size(min = 2, max = 50, message = "Surname must be between 2 and 50 characters")
    @Schema(description = "The last name")
    private String surname;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    @Schema(description = "Email user")
    private String email;

    @NotNull(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    @Schema(description = "User password")
    private String password;

    public @NotNull(message = "Name is required") @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters") String getName() {
        return name;
    }

    public void setName(@NotNull(message = "Name is required") @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters") String name) {
        this.name = name;
    }

    public @NotNull(message = "Surname is required") @Size(min = 2, max = 50, message = "Surname must be between 2 and 50 characters") String getSurname() {
        return surname;
    }

    public void setSurname(@NotNull(message = "Surname is required") @Size(min = 2, max = 50, message = "Surname must be between 2 and 50 characters") String surname) {
        this.surname = surname;
    }

    public @NotNull(message = "Email is required") @Email(message = "Invalid email format") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "Email is required") @Email(message = "Invalid email format") String email) {
        this.email = email;
    }

    public @NotNull(message = "Password is required") @Size(min = 8, message = "Password must be at least 8 characters long") String getPassword() {
        return password;
    }

    public void setPassword(@NotNull(message = "Password is required") @Size(min = 8, message = "Password must be at least 8 characters long") String password) {
        this.password = password;
    }
}
