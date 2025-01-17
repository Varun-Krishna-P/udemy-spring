package org.example;

import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class NumberGeneratorImpl implements  NumberGenerator{
    private  final Random random = new Random();

    private int maxNumber = 100;

    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
