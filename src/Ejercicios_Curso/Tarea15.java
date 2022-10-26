package Ejercicios_Curso;

import java.util.Scanner;

public class Tarea15 {
    public static void main(String[] args) {

        //eer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
        //el promedio de los negativos y contar el número de ceros.

        //Inicializamos el array
        int[] numeros = new int[7];

        //Clase Scanner para ingresar los números al array
        Scanner s = new Scanner(System.in);

        //Ciclo for para llenar el array
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingresa un número: ");
            numeros[i] = s.nextInt();
        }

        //Promedio del arreglo
        double sumaArray = 0;

        //Variables para guardar el promedio
        double sumaPositivo = 0, sumaNegativo = 0;

        //Variables para guardar la cantidad de números positivos, negativos y cero
        double cantPositivos = 0, cantNegativos = 0, cantCeros = 0;

        //Ciclo for e if para sumar y separar los números en cero, positivo y negativo
        for (int i = 0; i < numeros.length; i++){
            sumaArray += numeros[i];
            if (numeros[i] > 0){
                sumaPositivo += numeros[i];
                cantPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativo += numeros[i];
                cantNegativos++;
            }else {
                cantCeros++;
            }
        }

        //Calculamos el promedio
        double promArray = sumaArray / numeros.length;
        double promPositivo = sumaPositivo / cantPositivos;
        double promNegativo = sumaNegativo / cantNegativos;

        //Imprimimos el promedio
        System.out.println("El promedio del array es: " + promArray);
        System.out.println("El promedio de los números positivos es: " + promPositivo);
        System.out.println("El promedio de los números negativos es: " + promNegativo);
        System.out.println("La cantidad de ceros en el array es: " + cantCeros);
    }
}
