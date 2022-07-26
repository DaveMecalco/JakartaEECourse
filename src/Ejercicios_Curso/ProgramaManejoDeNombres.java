package Ejercicios_Curso;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {

        /*
         * La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
         * Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
         * Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
         * Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
         * Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
         * N.es_A.ia_E.pe
         */

        //Implementamos Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del primer familiar: ");
        //Recogemos el primer nombre de en la variable String nombre1
        String nombre1 = scanner.nextLine();
        //Imprimimos el nombre de la primera persona
        //Con toUpperCase hacemos mayúscula la posición que retornar el charAt, la segunda letra y con substring devolvemos la cadena restante desde la posición indidcada
        String nombreArreglado1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
        System.out.println("nombreArreglado = " + nombreArreglado1);

        //Recogemos el primer nombre de en la variable String nombre1
        String nombre2 = scanner.nextLine();
        System.out.println("Ingresa el nombre del segundo familiar: ");
        //Imprimimos el nombre del segundo persona
        //Con toUpperCase hacemos mayúscula la posición que retornar el charAt, la segunda letra y con substring devolvemos la cadena restante desde la posición indidcada
        String nombreArreglado2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        System.out.println("nombreArreglado = " + nombreArreglado2);

        //Recogemos el primer nombre de en la variable String nombre1
        String nombre3 = scanner.nextLine();
        System.out.println("Ingresa el nombre del tercer familiar: ");
        //Imprimimos el nombre del tercer familiar
        //Con toUpperCase hacemos mayúscula la posición que retornar el charAt, la segunda letra y con substring devolvemos la cadena restante desde la posición indidcada
        String nombreArreglado3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);
        System.out.println("nombreArreglado = " + nombreArreglado3);

        //Imprimimos el resultado completo para el ejercicio
        System.out.println("El resultado final es:");
        System.out.println(nombreArreglado1 + "_" + nombreArreglado2 + "_" + nombreArreglado3);

    }
}
