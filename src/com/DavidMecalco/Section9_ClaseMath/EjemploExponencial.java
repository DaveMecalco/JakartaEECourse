package com.DavidMecalco.Section9_ClaseMath;

public class EjemploExponencial {
    public static void main(String[] args) {

        //exponencial e
        double exp = Math.exp(2);
        //e=2.17
        System.out.println("exp = " + exp);

        //logaritmo natural
        double log = Math.log(10);
        System.out.println("log = " + log);

        //potencia
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        //raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        //Convertir radianes a grados

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        //Convertir grados a radianes
        double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " + radianes);



    }
}
