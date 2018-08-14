package com.java8.methodReferences;

public class MethodReferencesApp3 {

    public void saludarDesdeMetodoInstanciaObjetoParticular() {
        System.out.println("Hola desde un método referido instancia de objeto en particular");
    }

    public static void main(String[] args) {
        MethodReferencesApp3 app = new MethodReferencesApp3();
        Operacion op = app::saludarDesdeMetodoInstanciaObjetoParticular;
        op.saludar();
    }
}