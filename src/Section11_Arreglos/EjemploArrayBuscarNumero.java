package Section11_Arreglos;

import java.util.Scanner;

public class EjemploArrayBuscarNumero {
    public static void main(String[] args) {

        //Inicializamos el array
        int[] numeros = new int[10];

        //Clase Scanner para poblar el array
        Scanner s = new Scanner(System.in);

        //Poblamos el array con un for
        for (int i = 0; i < numeros.length; i++){
            //Llenamos el array con el indice y le asignamos la variable s de Scanner
            System.out.print("Ingrese un número: ");
            numeros[i] = s.nextInt();
        }

        //Declaramos una variable para guardar el elemento a buscar
        System.out.print("\r\nIngrese un número a buscar: ");
        int buscar = s.nextInt();

        //Para buscar el elemento, utilizamos un ciclo while con dos condiciones
        int i = 0;
        while ((i < numeros.length) && (numeros[i] != buscar)){
            i++;
        }

        //If para encontrar el número
        if (i == numeros.length){
            System.out.println("\nEl número " + buscar + "no fue encontrado");
        } else if (numeros[i] == buscar) {
            System.out.println("\nNúmero " + buscar +" encontrado en la posición: " + i);
        }


    }
}
