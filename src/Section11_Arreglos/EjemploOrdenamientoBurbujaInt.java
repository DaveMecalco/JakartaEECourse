package Section11_Arreglos;

public class EjemploOrdenamientoBurbujaInt {
    public static void main(String[] args) {

        //Inicializamos el array de int

        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 9;
        numeros[2] = 6;
        numeros[3] = 0;
        numeros[4] = -2;


        //Inicializamos el algoritmo de burbuja

        int contador = 0;

        for (int x = 0; x < numeros.length - 1; x++){

            //Para mejorarlo debemos incrementar y en la segunda variable, para que no vuelva a recorrer
            for (int y = 0; y < numeros.length - 1 - x; y++){
                if ( ((Comparable<Integer>) numeros[y + 1]).compareTo(numeros[y]) < 0){
                    int auxiliar = numeros[y];
                    numeros[y] = numeros[y + 1];
                    numeros[y + 1] = auxiliar;
                }
                contador++;
            }
        }

        //Imprimimos el número de iteraciones
        System.out.println("contador = " + contador);

        //Imprimimos el arreglo
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }


    }
}
