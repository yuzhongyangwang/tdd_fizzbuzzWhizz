package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzWhizzTest {

    @Test
    public void should_return_num(){
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.fizzBuzz(4);
        assertThat(result,is("4"));
    }

    @Test
    public void should_return_Fizz(){
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.fizzBuzz(3);
        assertThat(result,is("Fizz"));
    }

    @Test
    public void should_return_Buzz(){
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.fizzBuzz(5);
        assertThat(result,is("Buzz"));
    }

    @Test
    public void should_return_Whizz(){
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.fizzBuzz(7);
        assertThat(result,is("Whizz"));
    }

    @Test
    public void should_return_FizzBuzz(){
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.fizzBuzz(15);
        assertThat(result,is("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz(){
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.fizzBuzz(21);
        assertThat(result,is("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz(){
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.fizzBuzz(35);
        assertThat(result,is("BuzzWhizz"));
    }
    @Test
    public void should_return_FizzBuzzWhizz(){
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.fizzBuzz(105);
        assertThat(result,is("BuzzWhizz"));
    }

}
