package com.java8.collections;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesApp {

    private List<String> lista;

    public void llenarLista() {
        lista = new ArrayList<>();

        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
    }

    public void usarForEach() {
		/*for(String elemento : lista){
			System.out.println(elemento);
		}*/

        //lista.forEach(x -> System.out.println(x));
        lista.forEach(System.out::println);

    }

    public void usarRemoveIf() {
		/*Iterator<String> it = lista.iterator();
		while(it.hasNext()){
			if(it.next().equalsIgnoreCase("Dos")){
				it.remove();
			}
		}*/

        lista.removeIf(x -> x.equalsIgnoreCase("Dos"));
    }


    public void usarSort() {
        lista.sort((x,y)-> x.compareTo(y));
    }

    public static void main(String... args) {
        ColeccionesApp app = new ColeccionesApp();
        app.llenarLista();
        //app.usarRemoveIf();
        app.usarSort();
        app.usarForEach();
    }

}