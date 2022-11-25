package com.DavidMecalco.Section11_Arreglos;

import java.util.Scanner;

public class EjemploArrayEliminarElemento {
    public static void main(String[] args) {

        //Iniciamos el array
        int[] a = new int[10];

        //Clase Scanner para llenar el array
        Scanner s = new Scanner(System.in);

        //Llenamos el array con un for
        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }

        //Variable de control para eliminar un posicion
        int posicion = 0;
        System.out.println("Ingrese una posición para eliminar (entre 0 y 9): ");
        posicion = s.nextInt();

        //for para buscar la posición a eliminar
        for (int i = posicion; i < a.length -1; i++){
            a[i] = a[i + 1];
        }

        //a[a.length -1] = a[a.length - 2];
        //Imprimimos el array
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        //Copiar un array con la clase System
        //Definimos otro array
        int[] b = new int[a.length -1];

        //Clase system
        System.arraycopy(a, 0, b, 0, b.length);

        //Imprimimos
        System.out.println("EL nuevo array es:");
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }


    }
}
