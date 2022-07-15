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
    public String addition(@RequestParam("num1") String a, @RequestParam("num2") String b) {
        return a + " + " + b + " = " + counterService.addition(Integer.parseInt(a), Integer.parseInt(b));
    }
    @GetMapping("/minus")
    public String subtraction(@RequestParam("num1") String a, @RequestParam("num2") String b) {
        return a + " - " + b + " = " + counterService.subtraction(Integer.parseInt(a), Integer.parseInt(b));
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam("num1") String a, @RequestParam("num2") String b) {
        return a + " * " + b + " = " + counterService.multiplication(Integer.parseInt(a), Integer.parseInt(b));
    }
    @GetMapping("/divide")
    public String division(@RequestParam("num1") String a, @RequestParam("num2") String b) {
        return a + " / " + b + " = " + counterService.division(Integer.parseInt(a), Integer.parseInt(b));
    }

}
