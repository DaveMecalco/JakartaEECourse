package Section11_Arreglos;

import java.util.Scanner;

public class EjemploArrayDectarOrden {
    public static void main(String[] args) {

        //Inicializamos el array
        int[] arreglo = new int[7];

        //Invocamos la clase scanner par guardar datos en el array
        Scanner s = new Scanner(System.in);

        //Poblamos el array con un bucle
        System.out.println("Ingresa 7 enteros: ");
        for (int i =0; i < arreglo.length; i++){
            arreglo[i] = s.nextInt();
        }

        //Imprimimos el arreglo
        System.out.println("El arreglo guardado es: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }

        //Algoritmo para saber si es ascendente o descendente
        //Declaramos dos banderas para saber el estado interno del arreglo
        boolean ascendente = false;
        boolean descendente = false;
        //Recorremos el arreglo con dos condiocnes
        for (int i = 0; i < arreglo.length - 1; i++){
            //Comparamos la posición con la siguiente
            if (arreglo[i] > arreglo[i + 1]){
                descendente = true;
            }
            if (arreglo[i] < arreglo[i +1]){
                ascendente = true;
            }
        }

        //Comparamos las condiciones
        if (ascendente == true && descendente == true){
            System.out.println("El arreglo esta desordenado");
        }
        if (ascendente == false && descendente == false){
            System.out.println("El arreglo es el mismo");
        }
        if (ascendente == true && descendente == false){
            System.out.println("El arreglo es ascendente");
        }
        if (ascendente == false && descendente == true){
            System.out.println("El arreglo es descendente");
        }


    }
}
