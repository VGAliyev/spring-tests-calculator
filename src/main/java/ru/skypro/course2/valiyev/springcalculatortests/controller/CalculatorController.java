package ru.skypro.course2.valiyev.springcalculatortests.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.course2.valiyev.springcalculatortests.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping
    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @RequestMapping("plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @RequestMapping("minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @RequestMapping("multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @RequestMapping("divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
