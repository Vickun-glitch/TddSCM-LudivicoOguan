package org.example;
public class FizzBuzz {
    public String convert(int num) {
        boolean BuzzCondition = num % 5 ==0;
        boolean FizzCondition = num % 3 ==0;
        boolean fizzBuzzCondition = BuzzCondition && FizzCondition;
        if (fizzBuzzCondition) return "FizzBuzz";
        if (BuzzCondition) return "Buzz";
        if (FizzCondition) return "Fizz";
        return String.valueOf(num);
    }
}