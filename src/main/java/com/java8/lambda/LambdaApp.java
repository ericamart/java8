package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class LambdaApp {

    public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        Collections.sort(lista, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public void ordenarConLambda() {
        List<String> lista = new ArrayList<>();
        lista.add("cuatro");
        lista.add("cinco");
        lista.add("seis");

        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public void calcular() {
        Operacion operacion = (double x, double y) -> (x+y)/2;
        System.out.println(operacion.calcular(3,4));
    }

    public static void main( String... args ) {
        LambdaApp lambdaApp = new LambdaApp();
        lambdaApp.ordenar();
        lambdaApp.ordenarConLambda();
        lambdaApp.calcular();
    }
}
