package comexamplecalculator.controller;

import comexamplecalculator.service.CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class FirstController {

    private final CounterService counterService;

    public FirstController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping()
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String addition(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " + " + b + " = " + counterService.addition(a, b);
    }
    @GetMapping("/minus")
    public String subtraction(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " - " + b + " = " + counterService.subtraction(a, b);
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " * " + b + " = " + counterService.multiplication(a,b);
    }
    @GetMapping("/divide")
    public String division(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        if (b == 0) {
            return "Деление на 0 невозможно";
        }
        return a + " / " + b + " = " + counterService.division(a,b);
    }

}
