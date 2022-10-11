package Section11_Arreglos;

public class EjemploArreglosOrdenPrincipio {
    public static void main(String[] args) {
        
        //Inicializamos el array
        int[] numeros = new int[10];

        //Asignamos los valores del array
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }
        
        //Imprimimos el array con e i-esimo primero y el i-esimo final
        for (int i = 0; i < numeros.length - i; i++){
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i]);
        }

        //Para llenar un nuevo arreglo con los valores utilizados
        int[] a = new int[10];

        //Varibale auxiliar para guardar los valores en la posición adecuada
        int aux = 0;

        //Guardamos los valores en el arreglo
        for (int i = 0; i < numeros.length - i; i++){
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 -i];
        }

        //Imprimimos el nuevo arreglo
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
