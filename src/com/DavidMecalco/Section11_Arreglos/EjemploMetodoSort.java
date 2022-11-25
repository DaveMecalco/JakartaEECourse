package com.DavidMecalco.Section11_Arreglos;

public class EjemploMetodoSort {

    //Definimos el método sort para acomodar el arreglo de forma ascendente
    public static void sortArreglos(Object[] arreglo){

        //Inicializamos el algoritmo de burbuja
        int totalarreglo = arreglo.length;
        int contador = 0;

        for (int x = 0; x < totalarreglo - 1; x++){

            //Para mejorarlo debemos incrementar y en la segunda variable, para que no vuelva a recorrer
            for (int y = 0; y < totalarreglo - 1 - x; y++){
                if ( ((Comparable<Object>) arreglo[y + 1]).compareTo(arreglo[y]) < 0){
                    Object auxiliar = arreglo[y];
                    arreglo[y] = arreglo[y + 1];
                    arreglo[y + 1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("Iteraciones = " + contador);

    }

    public static void floorArreglos(Object[] arreglo){

        //Inicializamos el algoritmo de burbuja
        int totalarreglo = arreglo.length;
        int contador = 0;

        for (int x = 0; x < totalarreglo - 1; x++){

            //Para mejorarlo debemos incrementar y en la segunda variable, para que no vuelva a recorrer
            for (int y = 0; y < totalarreglo - 1 - x; y++){
                if ( ((Comparable<Object>) arreglo[y + 1]).compareTo(arreglo[y]) > 0){
                    Object auxiliar = arreglo[y];
                    arreglo[y] = arreglo[y + 1];
                    arreglo[y + 1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("Iteraciones = " + contador);

    }

    public static void main(String[] args) {

        //Inicializamos el arreglo
        Integer[] num = {1,9,4,6,2,5,3,8,7};

        //Llamamos al método y pasamos por argumento el array
        sortArreglos(num);


        //Imprimimos el arreglo
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        //Probamos el método generic con un string
        String[] nom = {"David", "Anahi", "Saul", "Juan", "Ismael", "Oscar"};

        //Llamamos al método
        sortArreglos(nom);

        //Imprimimos el arreglo
        for (int i = 0; i < nom.length; i++){
            System.out.println(nom[i]);
        }

        //Llamamos al método floor
        floorArreglos(num);

        //Imprimimos el arreglo
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }





    }
}
