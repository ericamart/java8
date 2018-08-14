package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

    private List<String> nombres;
    private List<String> numeros;

    public StreamsApp(){
        nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Carmen");
        nombres.add("Diego");
        nombres.add("Ramón");
        nombres.add("David");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
    }

    public void filtrar(){
        nombres.stream().filter(x -> x.startsWith("D")).forEach(System.out::println);
    }

    public void ordenar(){
        //lista.stream().sorted().forEach(System.out::println);
        nombres.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
    }

    public void transformar(){
        nombres.stream().map(String::toUpperCase).forEach(System.out::println);
		/*for(String x : numeros){
			int num = Integer.parseInt(x) + 1;
			System.out.println(num);
		}*/
        numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
    }

    public void limitar(){
        nombres.stream().limit(2).forEach(System.out::println);
    }

    public void contar(){
        long x = nombres.stream().count();
        System.out.println(x);
    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();

        System.out.println("-- Filtrar --");
        app.filtrar();

        System.out.println("-- Ordenar --");
        app.ordenar();

        System.out.println("-- Transformar --");
        app.transformar();

        System.out.println("-- Limitar --");
        app.limitar();

        System.out.println("-- Contar --");
        app.contar();

    }
}