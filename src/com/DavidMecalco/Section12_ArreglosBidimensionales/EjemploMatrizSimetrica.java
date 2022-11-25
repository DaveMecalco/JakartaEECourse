package com.DavidMecalco.Section12_ArreglosBidimensionales;

public class EjemploMatrizSimetrica {
    public static void main(String[] args) {
        boolean simentrica = true;

        //Inicializamos la matriz simetrica
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        //Ciclo while
        int i, j;
        i = 0;
        salir : while (i < matriz.length){
            j = 0;
            while (j < i){
                if (matriz[i][j] != matriz[j][i]){
                    simentrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }

        //Ciclo for
        salir2 : for (i = 0; i < matriz.length; i++){
            for (j = 0; j < i; i++){
                if (matriz[i][j] != matriz[j][i]){
                    simentrica = false;
                    break salir2;
                }
            }
        }

        if(simentrica){
            System.out.println("La matriz es simétrica");
        }else{
            System.out.println("La matriz no es simétrica");
        }

    }
}
