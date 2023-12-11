package ru.skypro.course2.valiyev.springcalculatortests.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.skypro.course2.valiyev.springcalculatortests.constants.TestConstants.*;


public class CalculatorServiceImplParameterizedTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("providePlusParamsForTests")
    public void plus(int num1, int num2, int expected) {
        int result = out.plus(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideMinusParamsForTests")
    public void minus(int num1, int num2, int expected) {
        int result = out.minus(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideMultiplyParamsForTests")
    public void multiply(int num1, int num2, int expected) {
        int result = out.multiply(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideDivideParamsForTests")
    public void divide(int num1, int num2, float expected) {
        float result = out.divide(num1, num2);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> providePlusParamsForTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, PLUS1),
                Arguments.of(NUM3, NUM4, PLUS2)
        );
    }

    public static Stream<Arguments> provideMinusParamsForTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, MINUS1),
                Arguments.of(NUM3, NUM4, MINUS2)
        );
    }

    public static Stream<Arguments> provideMultiplyParamsForTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, MULTIPLY1),
                Arguments.of(NUM3, NUM4, MULTIPLY2)
        );
    }

    public static Stream<Arguments> provideDivideParamsForTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, DIVIDE1),
                Arguments.of(NUM3, NUM4, DIVIDE2)
        );
    }
}