package Ejercicios_Curso;

import java.util.Scanner;

public class Tarea14 {
    public static void main(String[] args) {

        //Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
        //(de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.

        //Inicializamos el array
        int[] numeros = new int[7];

        //Clase Scanner para poblar el array
        Scanner s = new Scanner(System.in);

        //Ciclo for para llenar el array con la clase Scanner
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un número: ");
            numeros[i] = s.nextInt();
        }
        //Variable para guardar el número más grande
        int mayor = 0;
        //Ciclo for e if para iterar y comparar los índices del array
        for (int i = 0; i < numeros. length; i++){
            mayor = (numeros[mayor] > numeros[i]) ? mayor : i;
        }

        System.out.println("El número mayor es: " + numeros[mayor]);

    }
}
