package com.DavidMecalco.Section5_Wrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        //Retorna una instancia del método class

        String texto = "Hola que tal";

        Class strClass = texto.getClass();

        System.out.println("sterClass.getName()= " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        //Para enlistar todos los métodos de la clase Class
        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName()= " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass.getName());
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());

        //Mostar todos los métodos de clase Integer
        for(Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName()= " + metodo.getName());
        }
    }
}
