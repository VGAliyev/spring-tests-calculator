package ru.skypro.course2.valiyev.springcalculatortests.service;

import org.springframework.stereotype.Service;
import ru.skypro.course2.valiyev.springcalculatortests.exception.CalculatorIllegalArgumentException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public float divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new CalculatorIllegalArgumentException("На нуль делить нельзя!");
        }
        return (float)num1 / num2;
    }
}
