package com.java8.functionalInterface;

public class FunctionalInterfaceApp {

    public void calcular(double n1, double n2) {
        Operacion op = (x, y) -> x + y;
        double resultado = op.calcular(n1, n2);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        FunctionalInterfaceApp app = new FunctionalInterfaceApp();
        app.calcular(3, 5);
    }
}