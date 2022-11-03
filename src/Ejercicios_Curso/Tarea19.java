package Ejercicios_Curso;

import java.util.Scanner;

public class Tarea19 {
    public static void main(String[] args) {

        //N para definir el tamaño de la matriz
        int n;

        //Scanner para leer por consola el tamaño de la matriz
        Scanner s = new Scanner(System.in);

        //Asignamos s a n
        System.out.println("Ingrese el tamaño de la matriz n x n: ");
        n = s.nextInt();

        //Validamos que la Matriz sea mayor a 0
        if (n == 0){
            System.err.println("ERROR");
            System.exit(1);
        }

        //Inicializamos el array de Strings
        int[][] matrizX = new int[n][n];

        //Ciclo flor para poblar la matriz con _
        for (int i = 0; i < matrizX.length; i++){
            for (int j = 0; j < matrizX[i].length; j++){
                if (j == 0 || (i == n / 2) || (j == (matrizX[i].length - 1) && i >= n/2)){
                    matrizX[i][j] = 1;
                }else {
                    matrizX[i][j] = 0;
                }
            }
        }

        //Ciclo for para imprimir la matriz resultante
        for (int i = 0; i < matrizX.length; i++){
            for (int j = 0; j < matrizX[i].length; j++){
                System.out.print(matrizX[i][j]);
            }
            System.out.println();
        }

    }
}
