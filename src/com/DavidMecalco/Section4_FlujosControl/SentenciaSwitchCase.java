package com.DavidMecalco.Section4_FlujosControl;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número y se te devuelve el mes correspondiente: ");
        int num = scanner.nextInt();

        //Si las sentencias de los casos son en una sola línea de código se puede realizar con ->
        switch (num) {
            case 1 -> System.out.println("ENERO");
            case 2 -> System.out.println("FEBRERO");
            case 3 -> System.out.println("MARZO");
            case 4 -> System.out.println("ABRIL");
            case 5 -> System.out.println("MAYO");
            case 6 -> System.out.println("JUNIO");
            case 7 -> System.out.println("JULIO");
            case 8 -> System.out.println("AGOSTO");
            case 9 -> System.out.println("SEPTIEMBRE");
            case 10 -> System.out.println("OCTUBRE");
            case 11 -> System.out.println("NOVIEMBRE");
            case 12 -> System.out.println("DICIEMBRE");
            default -> System.out.println("NO EXISTE EL MES");
        }

        //Otra forma de implementar el switch con -> {}
        switch (num) {
            case 1 -> {
                System.out.println(num);
                System.out.println("ENERO");
            }
            case 2 -> {
                System.out.println(num);
                System.out.println("FEBRERO");
            }
            case 3 -> {
                System.out.println(num);
                System.out.println("MARZO");
            }
            default -> {
                System.out.println("NO EXISTE EL MES");
            }
        }

        //Otra forma de implementar el switch
        switch (num){
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("no existe el mes");
                break;
        }
    }
}
