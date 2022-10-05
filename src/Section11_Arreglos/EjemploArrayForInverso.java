package Section11_Arreglos;

import java.util.Arrays;

public class EjemploArrayForInverso {
    public static void main(String[] args) {

        //Inicializamos un array de 7 espacios
        String[] productos = new String[7];

        //Asignamos valores a los espacios
        productos[0] = "Cuchillo";
        productos[1] = "Tenedor";
        productos[2] = "Cuchara";
        productos[3] = "Plato";
        productos[4] = "Taza";
        productos[5] = "Olla";
        productos[6] = "Comal";

        //Ordenamiento el arreglo
        Arrays.sort(productos);

        //Impresión inversa del arreglo
        System.out.println("======= Ciclo For =======");

        int total = productos.length;
        for (int i = 0; i < total; i++){
            System.out.println("Para el indice: " + (total -1 - i) +  " el valor es: " + productos[total - 1 - i]);

        }

        System.out.println("======= Ciclo For 2 =======");
        for (int i = total - 1; i >= 0; i--){
            System.out.println("Para el indice: " + i + " el valor es: " + productos[i]);
        }



    }
}
