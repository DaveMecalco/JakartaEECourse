package com.DavidMecalco.Section11_Arreglos;

import java.util.Scanner;

public class EjemploArrayDesplazarPosicionOrdenado {
    public static void main(String[] args) {

        //Inicializamos el array
        int[] a = new int[7];

        //Clase Scanner para ingresar los datos al array
        Scanner s = new Scanner(System.in);

        //Poblamos el array con un ciclo for
        for (int i = 0; i < a.length - 1; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }

        //Variables de control para encontrar la posición adecuada
        int posicion, elemento;
        System.out.println("Ingrese el elemento que desea insertar en el array: ");
        elemento = s.nextInt();

        posicion = 0;
        //Condicion para buscar la posición
        while ((posicion < 6) && (elemento > a[posicion])){
            posicion++;
        }

        //Desplazamos los elementos de abajo hacía arriba
        for (int i = a.length - 2; i >= posicion; i--){
            //Guardamos el elemento actual en el siguente
            a[i + 1] = a[i];
        }

        //Asginamos la posicion adecuada del elemento en el array
        a[posicion] = elemento;

        //Imprimimos el array
        System.out.println("Arreglo ordenado queda de la siguiente manera: ");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
