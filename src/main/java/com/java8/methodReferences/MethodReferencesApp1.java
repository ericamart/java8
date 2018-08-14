package com.java8.methodReferences;

public class MethodReferencesApp1 {

    public static void saludarDesdeMetodoStatic() {
        System.out.println("Hola desde un método referido static");
    }

    public void operar() {
        // Operacion op = () -> MeRefApp.referenciarMetodoStatic();
        // op.saludar();

        Operacion op2 = MethodReferencesApp1::saludarDesdeMetodoStatic;
        op2.saludar();
    }

    public static void main(String[] args) {
        MethodReferencesApp1 app = new MethodReferencesApp1();
        app.operar();
    }

}
