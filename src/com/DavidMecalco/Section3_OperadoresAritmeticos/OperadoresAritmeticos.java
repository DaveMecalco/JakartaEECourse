package com.DavidMecalco.Section3_OperadoresAritmeticos;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Inicializamos las variables en una sola línea

        int i = 5, j = 4, suma = i + j;
        //Podemos definir diferentes variables del mismo tipo en una sola línea, separadas por una coma

        //Imprimimos el resultado de la suma
        System.out.println("suma = " + suma);

        //Ambiguedades de la concatenación con la suma
        System.out.println("i + j = " + i + j);
        //Si después de un string queremos mostrar el resultado de una suma, debemos incluir parentecis en la suma aritmetica
        //Si no, el programa tomara realiza una concatenación de String y no una adición

        //Forma correcta de:
        System.out.println("i + j = " + (i + j));

        int resta = i - j;

        System.out.println("resta = " + resta);
        System.out.println("i - j =" + (i - j));

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("i * j =" + (i * j));


        //Para mostrar divisiones con punto flotante, la forma correcta de definirlas es:
        float division = (float) i / j;
        //De esta forma solo se realiza una división, pero el resultado siempre será entero:
        int division2 = i / j;

        System.out.println("i / j = " + division );
        System.out.println("division2 = " + division2);

        //Operador modulo
        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        //Ejemplo de modulo

        int esEntero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if(esEntero % 2 == 0){
            JOptionPane.showMessageDialog(null, "Es par el número");
        }else {
            JOptionPane.showMessageDialog(null, "Es impar el número");
        }

    }
}
