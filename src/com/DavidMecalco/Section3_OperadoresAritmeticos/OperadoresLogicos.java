package com.DavidMecalco.Section3_OperadoresAritmeticos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Declaramos las varibales
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        //Compuerta and &&
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);


        //compuerta or ||
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        //Combinación de compuertas lógicas
        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);

        //Las compuertas lógicas se evalúan igual que las aritmeticas, de izquierda a derecha
        boolean b4 = i == j && (k < l || m == false);
        System.out.println("b4 = " + b4);

        //Precedencia de los operadores lógicos
        //Si bien en Java el orden de ejecución de los operadores lógicos es de izquierda a derecha
        //También tiene reglas y preferencias


        //Primero, siempre se evalula la condición and y despues la or, no importando que esta se encuentre al final o enmedio de la asignación
        boolean b5 = i == j && (k < l || m == true);
        System.out.println("b5 = " + b5);

        boolean b6 = i == j || (k < l && m == true);
        System.out.println("b6 = " + b6);

        boolean b7 = true || true && true;
        System.out.println("b7 = " + b7);

        boolean b8 = true || (false && false) || true;
        System.out.println("b8 = " + b8);


    }
}
