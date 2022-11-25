package com.DavidMecalco.Section3_OperadoresAritmeticos;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        //Siempre utilizar parentesis para realizar la precedencia de los operadores adecuadamente
        double promedio = (i + j + k) / 3d;
        System.out.println(promedio);

        promedio = i + j + k / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10;
        System.out.println("promedio = " + promedio);

    }
}
