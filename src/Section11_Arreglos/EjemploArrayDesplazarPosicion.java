package Section11_Arreglos;

import java.util.Scanner;

public class EjemploArrayDesplazarPosicion {
    public static void main(String[] args) {

        //Definimos el array
        int[] arreglo = new int[10];

        //Clase Scanner para poblar el array
        Scanner s = new Scanner(System.in);

        //Ciclo for para poblar el array
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese un número: ");
            arreglo[i] = s.nextInt();
        }

        //Para desplazar el ultimo elemento debemos guardar en una variable:
        int ultimo = arreglo[arreglo.length - 1];

        for (int i = arreglo.length - 2; i>=0; i--){
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0] = ultimo;


        //Imprimimos el arreglo
        System.out.println("Arreglo desplazado: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }




    }
}
