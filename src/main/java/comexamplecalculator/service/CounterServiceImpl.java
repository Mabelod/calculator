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

    public Boolean authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException();
        } else if (password.length() >= 20) {
            return false;
        } else if (login.matches("[A-z0-9._]+") && password.length() < 20 && password.equals(confirmPassword) && password.matches("[A-z0-9._]+")) {
            return true;
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        return false;
    }
}
