package com.example.App.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class UserDto {
    private Long id;

    @NotEmpty(message = "Ім'я не може бути порожнім")
    private String name;

    private String phone;

    @NotEmpty(message = "Email не може бути порожнім")
    @Email
    private String email;

    @NotEmpty(message = "Пароль не може бути порожнім")
    private String password;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}