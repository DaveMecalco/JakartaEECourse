package com.DavidMecalco.Section12_ArreglosBidimensionales;

import java.util.Scanner;

public class EjemploMatrizColumnasVariable {
    public static void main(String[] args) {

        //Inicializamos la matriz 
        int[][] matriz = new int[3][];

        //Asignamos el valor a cada fila de columnas
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        //Mostramos los length de cada fila
        System.out.println("Length de la matriz = " + matriz.length);
        
        //Length de la fila 0
        System.out.println("matriz[0].length = " + matriz[0].length);
        
        //Length de la fila 1
        System.out.println("matriz[1].length = " + matriz[1].length);
        
        //Length de la fila 2
        System.out.println("matriz[2].length = " + matriz[2].length);

        //Llenamos la matriz
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <matriz[i].length; j++){
                System.out.println("Ingrese el número en la posición " + i + "," + j + " : ");
                matriz[i][j] = s.nextInt();
            }
        }

        //Iteración de la matriz con for
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
