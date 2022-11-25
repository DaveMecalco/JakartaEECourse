package com.DavidMecalco.Ejercicios_Curso;

import java.util.Scanner;

public class Tarea16 {
    public static void main(String[] args) {

        //Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
        //Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir
        //la cantidad de veces que aparece en el arreglo.

        //Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

        //Inicializamos el array
        int[] numeros = new int[10];

        //Clase Scanner para ingresar los datos al array
        Scanner s = new Scanner(System.in);

        //Ciclo for para poblar el array
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un número: ");
            numeros[i] = s.nextInt();
        }

        //Imprimos el array
        System.out.println("El arreglo es: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + "\t");
        }

        System.out.println();
        //Algoritmo para imprimir la concurrencia y la cantidad de veces que aparece
        int concurrencia = 0, vecesrepetido = 0;

        for (int i = 0; i < numeros.length - 1; i++){
            if (numeros[i] == numeros[i + 1]){
                concurrencia++;
                vecesrepetido = numeros[i];
            }
        }

        System.out.println("La mayor ocurrencias es: " + concurrencia);
        System.out.println("El elemento que mas se repite es: " + vecesrepetido);

    }
}
