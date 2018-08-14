package com.java8.methodReferences;

public class Meth4ferencesApp3 {

    public void referenciarConstructor() {
        /*
         * IPersona iper = new IPersona(){
         *
         * @Override public Persona crear(int id, String nombre) { return new
         * Persona(id, nombre); }
         *
         * }; iper.crear(1, "Juan");
         */

        /*
         * IPersona iper2 = (x,y)->(new Persona(x,y)); Persona per =
         * iper2.crear(1, "Juan");
         * System.out.println(per.getId()+" - "+per.getNombre());
         */

        IPersona iper3 = Persona::new;
        Persona per = iper3.crear(1, "Juan");
        System.out.println(per.getId() + " - " + per.getNombre());
    }

    public static void main(String[] args) {
        Meth4ferencesApp3 app = new Meth4ferencesApp3();
        app.referenciarConstructor();
    }
}