package com.DavidMecalco.Section9_ClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {

        //Valor absoluto
        int valor1 = Math.abs(-45);
        System.out.println("valor1 = " + valor1);

        int valor2 = Math.abs(84);
        System.out.println("valor2 = " + valor2);

        //Valor menor de dos números
        double min = Math.min(5.56, 5.55);
        System.out.println("min = " + min);

        //Valor mayor
        double max = Math.max(9.99,9.98);
        System.out.println("max = " + max);

        //Redondear hacia arriba
        double redup = Math.ceil(3.5);
        System.out.println("redup = " + redup);

        //Redondear hacia abajo
        double reddown = Math.floor(3.5);
        System.out.println("reddown = " + reddown);

        //Redondear de forma automatica
        double red = Math.round(3.5);
        System.out.println("red = " + red);


        //Imprimir PI
        double pi = Math.PI;
        System.out.println("pi = " + pi);


    }
}
