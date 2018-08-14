package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsApp {

    private List<Integer> numeros;

    public void llenar() {

        numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
    }

    public void probarStream() {
        numeros.stream().forEach(System.out::println);
    }

    public void probarParalelo() {
        numeros.parallelStream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        ParallelStreamsApp app = new ParallelStreamsApp();
        app.llenar();
        //app.probarStream();
        app.probarParalelo();

    }

}