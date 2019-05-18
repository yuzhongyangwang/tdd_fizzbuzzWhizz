package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
public class HelloWorld {
    private Dependency dependency;

    public HelloWorld(Dependency dependency) {

        this.dependency = dependency;
    }
    public String beenCalled() {
        return dependency.say();
    }
//    public static void main(String[] args){
//        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
//
//        for( int i = 0; i < 120; i++) {
//            String result = fizzBuzzWhizz.fizzBuzz(i+1);
//            System.out.println(result);
//        }
//    }
}
