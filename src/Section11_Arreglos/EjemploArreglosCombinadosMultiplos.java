package Section11_Arreglos;

public class EjemploArreglosCombinadosMultiplos {
    public static void main(String[] args) {

        //Inicializamos los array
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Poblamos los array

        //Para el array a
        for (int i = 0; i < a.length; i++){
            a[i]= i + 1;
        }

        //Para el array b
        for (int i = 0; i < b.length; i++){
            b[i] = ((i + 1) * 5);
        }

        //Guardamos los varores de los array en c
        int aux = 0;
        for (int i = 0; i < a.length; i+=2){
            for (int j = 0; j < 2; j++){
                c[aux++] = a[i + j];
            }
            for (int j = 0; j < 2; j++){
                c[aux++] = b[i + j];
            }
        }

        //Imprimimos el array c
        for (int i = 0; i < c.length; i++){

            System.out.println(c[i]);

        }



    }
}
