package com.example.testing.spy;

public interface MyInterface {

    String someMethod();

    default String someDefaultMethod() {
        return "I'm a default method!";
    }

}
