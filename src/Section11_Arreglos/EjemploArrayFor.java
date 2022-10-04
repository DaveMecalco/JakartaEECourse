package Section11_Arreglos;

import java.util.Arrays;

public class EjemploArrayFor {
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

        //Ciclo foreach

        System.out.println("======= Ciclo foreach =======");
        for (String produc : productos){
            System.out.println("produc = " + produc);
        }

        //Ciclo for

        System.out.println("======= Ciclo for =======");
        for (int i = 0; i < productos.length; i++){
            System.out.println("producto en el indice " + i + " es :" + productos[i]);
        }

        //Ciclo while
        int j = 0;
        while (j < productos.length){
            System.out.println("productos = " + productos[j]);
            j++;
        }


    }
}
