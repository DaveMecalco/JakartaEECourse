package com.DavidMecalco.Ejercicios_Curso;

import java.util.Scanner;

public class Tarea17 {
    public static void main(String[] args) {

        //Inicializamos el array
        int[] histograma = new int[20];
        //Clase Scanner
        Scanner s = new Scanner(System.in);
        //Ciclo for para recorrer el array y poblarlo
        for(int i = 0; i < histograma.length; i++){
            System.out.print("Ingrese un número entre 1 y 6: ");
            histograma[i] = s.nextInt();
        }
        System.out.println();
        //Mostramos el histograma
        for (int i = 0; i < histograma.length; i++){
            System.out.print(histograma[i] + "\t");
        }
        System.out.println();
        //Creamos otro Arreglo para mostrar el índice que indica el ejemplo;
        String[] indiceHistograma = new String[6];
        //Ciclo para iterar el array de Strings
        for (int i = 0; i < indiceHistograma.length; i++){
            //Contador para mostrar el índice de la gráfica
            int formato = i + 1;
            //Guardamos el índice de 1 a 6
            String grafica = formato + ": ";
            //Iteramos el primer array y sumamos el string * a la cadena del segundo array
            for (int j = 0; j < histograma.length; j++){
                if(formato == histograma[j]){
                    //Sí coincide el indice de la iteracion y el de arreglo de suma un * al array de String
                    grafica += " *";
                }
            }
            //Se asigna la concatenación de String a índice en turno del ciclo
            indiceHistograma[i] = grafica;
        }
        //Mostramos la gráfica
        for (int i = 0; i < indiceHistograma.length; i++){
            //Mostramos la impresion del segundo array
            System.out.println(indiceHistograma[i]);
        }

    }
}
