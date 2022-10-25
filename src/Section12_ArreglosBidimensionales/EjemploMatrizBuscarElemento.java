package Section12_ArreglosBidimensionales;

import java.util.Scanner;

public class EjemploMatrizBuscarElemento {
    public static void main(String[] args) {

        //Inicializamos la matriz
        int[][] matriz = {
                {1, 2, 3, 4},
                {1997, 1996, 45, 6},
                {50, 60, 70, 80}
        };

        //Variable para buscar
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número a buscar: ");

        int buscar = s.nextInt();
        boolean encontrado = false;
        buscar: for (int i= 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == buscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado){
            System.out.println("El numero ha sido encontrado en la matriz");
        }else {
            System.out.println("El numero NO ha sido encontrado en la matriz");
        }

    }
}
