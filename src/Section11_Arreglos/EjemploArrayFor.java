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

        System.out.println("======= Ciclo While =======");
        while (j < productos.length){
            System.out.println("productos = " + productos[j]);
            j++;
        }

        //Ciclo do while
        j = 0;
        System.out.println("======= Ciclo Do While =======");
        do {
            System.out.println("productos = " + productos[j]);
            j++;
        }while (j < productos.length);

        //Arreglo de interos

        int[] numeros = new int[10];

        //Llenar automáticamente un arreglo utilizando un for

        for (int k = 0; k < numeros.length; k++){
            numeros[k] = k*2;
        }
        
        //Mostramos el contenido del arreglo
        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }



    }
}
