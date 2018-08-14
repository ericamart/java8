package com.java8.methodReferences;

import java.util.Arrays;

public class MethodReferencesApp2 {

    public void referenciarMetodoInstanciaObjetoArbitrario() {
        String[] nombres = { "Juan", "Ana", "David" };

        /*
         * Arrays.sort(nombres, new Comparator<String>() {
         *
         * @Override public int compare(String o1, String o2) { return
         * o1.compareToIgnoreCase(o2); } });
         */

        // Arrays.sort(nombres, (s1,s2) -> s1.compareToIgnoreCase(s2));
        // System.out.println(Arrays.toString(nombres));

        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
    }

    public static void main(String[] args) {
        MethodReferencesApp2 app = new MethodReferencesApp2();
        app.referenciarMetodoInstanciaObjetoArbitrario();
    }
}
