package com.thoughtworks.tdd;

public class FizzBuzzWhizz {
    public String fizzBuzz(int num){
        String result = "";
        if(isTimesOf3(num)){
            result += "Fizz";
        }
        if(isTimesOf5(num)){
            result += "Buzz";
        }
        if(isTimesOf7(num)){
            result += "Whizz";
        }
        if(result.equals("")){
            result += num;
        }
        return result;
    }

    public boolean isTimesOf3(int num){
        return num % 3 == 0;
    }
    public boolean isTimesOf5(int num){
        return num % 5 == 0;
    }
    public boolean isTimesOf7(int num){
        return num % 7 == 0;
    }

}
