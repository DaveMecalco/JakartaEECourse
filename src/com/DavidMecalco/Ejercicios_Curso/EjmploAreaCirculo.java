package com.DavidMecalco.Ejercicios_Curso;
import java.util.Scanner;

public class EjmploAreaCirculo {
    public static void main(String[] args) {

        //Objeto scanner para ingresar el radio
        Scanner scanner = new Scanner(System.in);
        //Instrucción al sistema
        System.out.println("Ingrese el radio del circulo: ");
        //Guardamos el radio en la variable r
        String r = scanner.nextLine();
        //Casteamos el radio de string a double
        double radio = Double.parseDouble(r);
        //Calculamos el área = PI*r^2
        double area = Math.PI * Math.pow(radio, 2);
        //Imprimimos nuestro resultado
        System.out.println("El área del circulo es: " + area);


    }
}
