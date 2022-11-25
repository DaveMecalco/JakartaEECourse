package com.DavidMecalco.Section3_OperadoresAritmeticos;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        //Inicializamos las variables para este clase

        int i = 3;
        byte j = 7;

        //Operador de igualdad ==
        boolean op1 = i == j;
        System.out.println("i == j : " + op1);

        //Operador negación
        boolean op2 = !op1;
        System.out.println("!op1 = " + op2);

        //Operador diferenciador
        boolean op3 = i != j; //<>
        System.out.println("op3 = " + op3);

        //Operador mayor que
        boolean op4 = i > j;
        System.out.println("op4 = " + op4);

        //Operador menor que
        boolean op5 = i < j;
        System.out.println("op5 = " + op5);

        //Operador mayor igual que
        boolean op6 = i >= j;
        System.out.println("op6 = " + op6);

        //Operador menor igual que
        boolean op7 = i <= j;
        System.out.println("op7 = " + op7);




    }
}
