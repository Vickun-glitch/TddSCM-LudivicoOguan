package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    //Given when pattern
    @Test
    @DisplayName("Given a num divisible by 3 => return String \"Fizz\"")
    public void GivenNumberIsDivisibleBy3(){
        //Given
        int num = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Act
        String result = fizzBuzz.convert(num);
        //Assert
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Given a num divisible by 5 => return String \"Buzz\"")
    public void GivenNumberIsDivisibleBy5(){
        //Given
        int num = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Act
        String result = fizzBuzz.convert(num);
        //Assert
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Given a num divisible by 3 and 5 => return String FizzBuzz")
    public void GivenNumberIsDivisibleBy3And5(){
        //Given
        int num = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Act
        String result = fizzBuzz.convert(num);
        //Assert
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Given a num not divisible by 3 or 5 => return String value of num")
    public void GivenNumberIsNotDivisibleBy3And5(){
        //Given
        int num = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Act
        String result = fizzBuzz.convert(num);
        //Assert
        String expected = "2";
        assertEquals(expected, result);
    }
}
