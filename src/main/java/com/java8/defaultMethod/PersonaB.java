package com.java8.defaultMethod;

public interface PersonaB {

    default public void saludar(){
        System.out.println("PersonaB dice ¡hola!");
    }
}