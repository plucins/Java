package com.sda.todotask.demo.model.dto.user;


public class RegisterUserDto {
    private String registerEmail;
    private String registerPassword;

    public RegisterUserDto() {
    }

    public RegisterUserDto(String registerEmail, String registerPassword) {
        this.registerEmail = registerEmail;
        this.registerPassword = registerPassword;
    }

    public String getRegisterEmail() {
        return registerEmail;
    }

    public void setRegisterEmail(String registerEmail) {
        this.registerEmail = registerEmail;
    }

    public String getRegisterPassword() {
        return registerPassword;
    }

    public void setRegisterPassword(String registerPassword) {
        this.registerPassword = registerPassword;
    }
}
