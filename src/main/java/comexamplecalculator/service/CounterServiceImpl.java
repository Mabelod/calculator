package comexamplecalculator.service;

import comexamplecalculator.exception.WrongLoginException;
import comexamplecalculator.exception.WrongPasswordException;
import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {

    public int addition (int a, int b){
        return a + b;
    }

    public int subtraction (int a, int b){
        return a - b;
    }
    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        return (a * 1.0) / b;
    }

    public String authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException();
        } else if (password.length() >= 20) {
            return "Пароль должен быть меньше 20 символов";
        } else if (login.matches("[A-z1-9._]+") && password.length() < 20 && password.equals(confirmPassword) && password.matches("[A-z1-9._]+")) {
            return "Логин - " + login + "; Пароль - " + password;
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        return "Неверные символы логина / пароля";
    }
}
