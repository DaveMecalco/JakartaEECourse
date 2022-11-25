package com.DavidMecalco.Section12_ArreglosBidimensionales;

public class EjemploMatrizTranspuesta {
    public static void main(String[] args) {

        //Inicializamos el array
        int[][] matrizTranspuesta = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };

        //Mostramos la matriz original
        System.out.println("Matiz original: ");
        for(int i = 0; i < matrizTranspuesta.length; i++){
            for (int j = 0; j < matrizTranspuesta[i].length; j++){
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }


        //Algoritmo para convertir a una matriz transpuesta
        int aux = 0;
        for (int i = 0; i < matrizTranspuesta.length; i++){
            for (int j = 0; j < i; j++){
                aux = matrizTranspuesta[i][j];
                matrizTranspuesta[i][j] = matrizTranspuesta[j][i];
                matrizTranspuesta[j][i] =  aux;
            }
        }

        //Mostramos la matriz transpuesta
        System.out.println("Matiz transpuesta: ");
        for(int i = 0; i < matrizTranspuesta.length; i++){
            for (int j = 0; j < matrizTranspuesta[i].length; j++){
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
