package com.DavidMecalco.Section11_Arreglos;

import java.util.Arrays;

public class EjemploArrayString {
    public static void main(String[] args) {

        //Al instance los arreglos String, su valor asignado por defecto será null

        String[] arregloStrin = new String[7];

        //Asignar valores al array
        arregloStrin[0] = "Kingston Pendrive 64GB";
        arregloStrin[1] = "Samsung Galaxy";
        arregloStrin[2] = "Disco Duro SSD";
        arregloStrin[3] = "Asus Notebook";
        arregloStrin[4] = "Macbook air";
        arregloStrin[5] = "Amazon Alexa";
        arregloStrin[6] = "Bicicleta Oxford";

        //Ordenar de manera alphabetical  un arreglo mediante la clase Arrays y su método sort

        Arrays.sort(arregloStrin);

        //Pasar el contenido de un String a un variable intermedia

        String arrString0 = arregloStrin[0];
        String arrString1 = arregloStrin[1];
        String arrString2 = arregloStrin[2];
        String arrString3 = arregloStrin[3];
        String arrString4 = arregloStrin[4];
        String arrString5 = arregloStrin[5];
        String arrString6 = arregloStrin[6];



        //Imprimiendo la asignación de la variable intermedia

        System.out.println("arrString0 = " + arrString0);
        System.out.println("arrString1 = " + arrString1);
        System.out.println("arrString2 = " + arrString2);
        System.out.println("arrString3 = " + arrString3);
        System.out.println("arrString4 = " + arrString4);
        System.out.println("arrString5 = " + arrString5);
        System.out.println("arrString6 = " + arrString6);






    }
}
