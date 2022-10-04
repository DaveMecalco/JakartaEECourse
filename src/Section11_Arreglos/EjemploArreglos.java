package Section11_Arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {

        //Definición del arreglo
        int[] numeros = new int[4];

        //Asignación del arreglo
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        //Inicialización del arreglo
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        //Imprimimos las variables asignadas
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("k = " + l);

        //Imprimir un arreglo
        for (Integer num: numeros
             ) {
            System.out.println(num);
        }

    }
}
