package com.java8.defaultMethod;

public class DefaultMethodApp implements PersonaA, PersonaB {

    @Override
    public void caminar() {
        System.out.println("caminando....");
    }

    @Override
    public void saludar() {
        PersonaA.super.saludar();
    }

    public static void main(String[] args) {
        DefaultMethodApp app = new DefaultMethodApp();
        app.saludar();
    }

}