package com.DavidMecalco.Ejercicios_Curso;

import java.util.Scanner;

public class Tarea13 {
    public static void main(String[] args) {

        //Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
        // Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo,
        // el tercero, y así sucesivamente.

        //Inicializamos el array
        int[] numeros = new int[10];

        //Clase Scanner para poblar el array
        Scanner s = new Scanner(System.in);

        //Ciclo for para iterar y llenar el array
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un número: ");
            numeros[i] = s.nextInt();
        }

                System.out.println("El array modificado es: ");
        for (int i = 0; i < numeros.length - 1 -i; i++){
            System.out.println(numeros[numeros.length - 1 - i]);
            System.out.println(numeros[i]);
        }

    }
}
