package com.java8.highOrderFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class HighOrderApp3 {

    public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud, String cadena){
        //lista.stream().filter(this.establecerLogicaFiltro(longitud)).forEach(consumidor);
        lista.stream().filter(this.establecerLogicaFiltro(cadena)).forEach(consumidor);
    }

    public Predicate<String> establecerLogicaFiltro(int longitud){
        return texto -> texto.length() < longitud;
    }

    public Predicate<String> establecerLogicaFiltro(String cadena){
        return texto -> texto.contains(cadena);
    }


    public static void main(String[] args) {
        HighOrderApp3 app = new HighOrderApp3();
        List<String> lista = new ArrayList<>();
        lista.add("Amor");
        lista.add("Amorfa");
        lista.add("Formador");

        //app.filtrar(lista, System.out::println, 5, null);
        app.filtrar(lista, System.out::println, 0, "Amor");
    }
}