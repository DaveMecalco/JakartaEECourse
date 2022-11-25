package com.DavidMecalco.Section11_Arreglos;

import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {

        //Inicializamos el array
        int[] a = new int[5];

        //Clase Scanner para ingresar los datos
        Scanner s = new Scanner(System.in);

        //Ingresamos los datos al array con un for
        System.out.println("Ingresa 5 números enteros: ");
        for (int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        int maximo = 0;
        //Algoritmo para el número máximo
        for (int i = 1; i < a.length; i++){
            maximo = (a[maximo] > a[i])? maximo: i;
        }

        System.out.println("El número más grande del arreglo es: " + a[maximo]);

    }
}
