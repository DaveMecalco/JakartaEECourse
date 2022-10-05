package Section11_Arreglos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArrayForInversoMutable {

    //Método para invertir el string
    public static void  arregloInverso(String[] arreglo){

        //Modificamos el arreglo con asignaciones para hacerlo inverso
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }

    }

    public static void main(String[] args) {


        //Inicializamos el array en una sola línea
        String[] productos = { "Cuchillo", "Tenedor", "Cuchara", "Plato", "Taza", "Olla", "Comal"};

        //Ordenamiento el arreglo
        Arrays.sort(productos);

        //Asignamos el largo del array
        int total = productos.length;

        //Imprimimos el arreglo
        System.out.println("======= Ciclo For =======");
        for (int i = 0; i < total; i++){
            System.out.println("productos = " + productos[i]);
        }

        //Implementación del método
        //arregloInverso(productos);

        //Para ordenarlo de manera automática utilizamos el API:
        Collections.reverse(Arrays.asList(productos));

        //Imprimimos el arreglo
        System.out.println("======= Ciclo For =======");
        for (int i = 0; i < total; i++){
            System.out.println("productos = " + productos[i]);
        }


    }
}
