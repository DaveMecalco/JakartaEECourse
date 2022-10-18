package Section11_Arreglos;

import java.util.Scanner;

public class EjemploArrayParImpar {
    public static void main(String[] args) {

        //Inicializamos el arrays
        int[] a, pares, impares;
        a = new int[10];

        //clase Scanner para llenar el arrelgo
        Scanner s = new Scanner(System.in);


        System.out.println("Ingrese 10 números: ");
        //Ciclo for para llenar el array
        for (int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        //Definimos dos variables para contar los pares e impares
        int totalPares = 0, totalImpares = 0;

        //for para saber si es par o impar
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }

        //Definimos el array de par e impar
        pares = new int[totalPares];
        impares =  new int[totalImpares];

        //Variables para el flujo de control
        int j = 0;
        int k = 0;

        //for para dividir los números y asignarlos a su array
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                pares[j++] = a[i];
            }else{
                impares[k++] = a[i];
            }
        }

        //Imprimir los array
        System.out.println("Pares: ");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }

        //Imprimir impares
        System.out.println("\r\nImpares:");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }


    }
}
