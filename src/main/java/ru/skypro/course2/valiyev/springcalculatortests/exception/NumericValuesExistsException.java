package ru.skypro.course2.valiyev.springcalculatortests.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NumericValuesExistsException extends RuntimeException {
    public NumericValuesExistsException(String message) {
        super(message);
    }
}
