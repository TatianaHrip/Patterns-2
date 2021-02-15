package ru.netology.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserRegistrationData {
    private final String login;
    private final String password;
    private final String status;

    public UserRegistrationData(String login, String password, String status) {
        this.login = login;
        this.password = password;
        this.status = status;
    }
}