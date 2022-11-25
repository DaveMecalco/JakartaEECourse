package com.DavidMecalco.Section4_FlujosControl;

import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu promedio: ");
        float promedio = scanner.nextFloat();

        if(promedio == 10){
            System.out.println("Felicitaciones, tu promedio es excelente");
        } else if (promedio >= 9) {
            System.out.println("Tu promedio es muy bueno");
        } else if (promedio >= 8) {
            System.out.println("Tu promedio es bueno");
        } else if (promedio >= 7) {
            System.out.println("Tu promedio es regular");
        } else if (promedio >= 6) {
            System.out.println("Tu promedio es malo, necesitas esforzarte más");
        } else if (promedio >= 5) {
            System.out.println("Tu promedio es reprobatorio");
        }

        System.out.println("promedio = " + promedio);

    }
}
