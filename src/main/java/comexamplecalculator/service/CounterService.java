package comexamplecalculator.service;

public interface CounterService {
    int addition (int a, int b);

    int subtraction(int a, int b);

    int multiplication(int a, int b);

    double division(int a, int b);

    String authorization(String login, String password, String confirmPassword);

}
