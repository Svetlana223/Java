package org.example.sem6.cw4.model;

public class Farenheit implements Converter {
    @Override
    public Double convert(Double inputValue) {
        return inputValue * 9 / 5 + 32;
    }
}
