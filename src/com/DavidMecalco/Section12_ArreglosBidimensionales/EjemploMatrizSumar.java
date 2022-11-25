package com.DavidMecalco.Section12_ArreglosBidimensionales;

public class EjemploMatrizSumar {
    public static void main(String[] args) {

        //Inicializamos la matriz
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] b = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        //Definimos una tercera matriz para guardar la suma de a y b
        int[][]suma = new int[3][3];

        //Ciclo for para iterar y guardar los datos en la matriz suma
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        //Ciclo for para imprimir la matriz suma
        for (int i = 0; i < suma.length; i++){
            for (int j = 0; j < suma[i].length; j++){
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
