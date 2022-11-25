package com.DavidMecalco.Ejercicios_Curso;

import java.util.Scanner;

public class SentenciaIfAnioBi {
    public static void main(String[] args) {
        //Preguntamos si un año es bisiesto o no con la sentencia if

        Scanner scanner = new Scanner(System.in);

        System.out.println("Esta calculadora, dice si un año es bisiesto o no");
        System.out.println("Ingresa un año: ");
        int anio = scanner.nextInt();

        //Algoritmo para calcular si un año es bisiesto o no:
        //Cualquier año divisible por 4 es un año bisiesto: por ejemplo, 1988, 1992 y 1996 son años bisiestos.
        //Sin embargo, hay un pequeño error de cálculo que debe tenerse en cuenta.
        //Para eliminar este error, el calendario gregoriano estipula que un año que es divisible por 100 (por ejemplo, 1900) es un año bisiesto solo si también es divisible por 400.
        if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 ==0))){
            System.out.println("El año " + anio + " es bisiesto");
        }else {
            System.out.println("El año " + anio + " no es bisiesto");
        }


    }
}
