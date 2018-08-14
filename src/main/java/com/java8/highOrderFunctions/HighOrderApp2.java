package com.java8.highOrderFunctions;

import java.util.function.Function;

public class HighOrderApp2 {

    public Function<String, String> mostrar(String mensaje) {
        return (String x) -> mensaje + x;
    }

    public static void main(String[] args) {
        HighOrderApp2 app = new HighOrderApp2();
        String rpta = app.mostrar("Hola ").apply("a todos");
        System.out.println(rpta);
    }
}