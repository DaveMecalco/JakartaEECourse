package com.DavidMecalco.Section11_Arreglos;

import java.util.Scanner;

public class EjemploArrayAgregarElemento {
    public static void main(String[] args) {

        //Inicializamos el array
        int[] a = new int[10];

        //Clase Scanner para llenar el elemento
        Scanner s = new Scanner(System.in);

        //Ciclo for para poblar el array
        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] =  s.nextInt();
        }

        //Varibale de control para aumentar el tamaño
        int posicion, elemento, ultimo;
        System.out.println();

        //Asignamos el elemento a ingresar
        System.out.println("Ingrese el elemento a ingresar al array: ");
        elemento = s.nextInt();

        //Posición a ingresar el elemnto
        System.out.println("Ingrese la posición el la que quiere ingresar el elemento: ");
        posicion = s.nextInt();

        //Respaldamos el ultimo elemnto del array para que no se pierda
        ultimo = a[a.length -1];

        //Ciclo for para desplazar los elementos
        for (int i = a.length - 2; i >= posicion; i--){
            a[i + 1] = a[i];
        }

        //Copias el array en uno nuevo
        int[] b = new int[a.length + 1];
        System.arraycopy(a,0,b,0, a.length);

        //Asignamos el elemento y la posición al nuevo arreglo
        b[posicion] = elemento;

        //Asignamos el último elemento de a
        b[b.length - 1] = ultimo;

        //Imprimiendo
        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }

    }
}
