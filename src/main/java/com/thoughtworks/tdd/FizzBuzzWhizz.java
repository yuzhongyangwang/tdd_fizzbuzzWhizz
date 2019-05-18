package com.thoughtworks.tdd;

public class FizzBuzzWhizz {
    public String fizzBuzz(int num){
        String result = "";
        if(num % 3 == 0){
            result += "Fizz";
        }
        if(num % 5 == 0){
            result += "Buzz";
        }
        if(num % 7 == 0){
            result += "Whizz";
        }
        if(result.equals("")){
            result += num;
        }
        return result;
    }
}
