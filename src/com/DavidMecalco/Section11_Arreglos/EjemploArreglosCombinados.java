package com.DavidMecalco.Section11_Arreglos;

public class EjemploArreglosCombinados {
    public static void main(String[] args) {

        //Inicializamos los array
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Poblamos los array

        //Para el array a
        for (int i = 0; i < a.length; i++){
            a[i]= i + 1;
        }

        //Para el array b
        for (int i = 0; i < b.length; i++){
            b[i] = ((i +1 )* 2);
        }

        //Guardamos los varores de los array en c
        int aux = 0;
        for (int i = 0; i < a.length; i++){
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        //Imprimimos el array c
        for (int i = 0; i < c.length; i++){

            System.out.println(c[i]);

        }



    }
}
