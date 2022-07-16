package comexamplecalculator.service;

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
}
