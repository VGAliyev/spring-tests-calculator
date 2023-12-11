package ru.skypro.course2.valiyev.springcalculatortests.service;

import org.junit.jupiter.api.Test;
import ru.skypro.course2.valiyev.springcalculatortests.exception.CalculatorIllegalArgumentException;
import ru.skypro.course2.valiyev.springcalculatortests.exception.NumericValuesExistsException;

import static org.junit.jupiter.api.Assertions.*;
import static ru.skypro.course2.valiyev.springcalculatortests.constants.TestConstants.*;

class CalculatorServiceImplTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    void plus() {
        int result1 = out.plus(NUM1, NUM2);
        int result2 = out.plus(NUM3, NUM4);

        assertEquals(result1, PLUS1);
        assertEquals(result2, PLUS2);
    }

    @Test
    void minus() {
        int result1 = out.minus(NUM1, NUM2);
        int result2 = out.minus(NUM3, NUM4);

        assertEquals(result1, MINUS1);
        assertEquals(result2, MINUS2);
    }

    @Test
    void multiply() {
        int result1 = out.multiply(NUM1, NUM2);
        int result2 = out.multiply(NUM3, NUM4);

        assertEquals(result1, MULTIPLY1);
        assertEquals(result2, MULTIPLY2);
    }

    @Test
    void divide() {
        float result1 = out.divide(NUM1, NUM2);
        float result2 = out.divide(NUM3, NUM4);

        assertEquals(result1, DIVIDE1);
        assertEquals(result2, DIVIDE2);
    }

    @Test
    void divideByZero() {
        assertThrows(CalculatorIllegalArgumentException.class, () -> out.divide(2, 0));
    }
}