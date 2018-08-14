package com.java8.highOrderFunctions;

import java.util.function.Function;

public class HighOrderApp1 {

    private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
    private Function<String, String> convertirMinusculas = x -> x.toLowerCase();

    public void imprimir(Function<String, String> funcion, String valor) {
        System.out.println(funcion.apply(valor));
    }

    public static void main(String[] args) {
        HighOrderApp1 app = new HighOrderApp1();
        app.imprimir(app.convertirMayusculas, "hola");
        app.imprimir(app.convertirMinusculas, "HOLA");
    }
}