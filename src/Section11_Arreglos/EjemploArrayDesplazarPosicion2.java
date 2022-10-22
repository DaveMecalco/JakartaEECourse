package Section11_Arreglos;

import java.util.Scanner;

public class EjemploArrayDesplazarPosicion2 {
    public static void main(String[] args) {

        //Definimos el array
        int[] arreglo = new int[10];

        //Clase Scanner para poblar el array
        Scanner s = new Scanner(System.in);

        //Ciclo for para poblar el array
        for (int i = 0; i < arreglo.length - 1; i++){
            System.out.print("Ingrese un número: ");
            arreglo[i] = s.nextInt();
        }

        //Para desplazar elemento debemos guardar en una variable la posicion en el array y el elmento a guardar
        int posicion, elemento;
        System.out.println("Ingrese el elemento a ingresar: ");
        elemento = s.nextInt();
        System.out.println("Ingrese la posición para ingresar el elemento: ");
        posicion = s.nextInt();


        for (int i = arreglo.length - 2; i>= posicion; i--){
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[posicion] = elemento;


        //Imprimimos el arreglo
        System.out.println("Arreglo desplazado: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }




    }
}
