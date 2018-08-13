package com.java8.defaultMethod;

public interface PersonaA {

    public void caminar();

    default public void saludar(){
        System.out.println("Persona A dice ¡hola!");
    }

}