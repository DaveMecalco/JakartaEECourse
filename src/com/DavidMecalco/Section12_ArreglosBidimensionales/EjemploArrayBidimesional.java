package com.DavidMecalco.Section12_ArreglosBidimensionales;

public class EjemploArrayBidimesional {
    public static void main(String[] args) {

        //Inicializamos una matris de 2x4
        int[][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 5;
        numeros[1][1] = 6;
        numeros[1][2] = 7;
        numeros[1][3] = 8;



        //Para saber el número de filas de una matriz
        System.out.println("Número de filas: " + numeros.length);

        //Para saber el número de columnas de una matriz
        System.out.println("Número de columnas: " + numeros[0].length);

        //Primer elemento de la matriz
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);

        //Ultimo elemento de la matriz
        System.out.println("Ultimo elemento de la matriz: " + numeros[numeros.length - 1][numeros[1].length - 1]);

        //Guardar valores de la matriz en variables

        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        //Imprimiendo valores
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);






    }
}
