package com.java8.functionalInterface;

@FunctionalInterface
public interface Operacion {

    /*
    Las interfaces funcionales solo pueden tener un método
    Si tuvieran mas de uno la clase que hace uso de esta interfaz
    con una expresión lambda no sabría que método está implementando
     */

    double calcular (double x, double y);
}
