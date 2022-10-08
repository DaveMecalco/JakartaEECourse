package Section11_Arreglos;

public class EjemploOrdenamietoBurbujaModificado {

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


        //Asignamos el largo del array
        int total = productos.length;
        //Implementamos un variable para resgistrar el número de iteraciones del arreglo
        int contador = 0;

        //algoritmo de ordenamiento de burbuja
        for (int x = 0; x < total - 1; x++){

            //Para mejorarlo debemos incrementar y en la segunda variable, para que no vuelva a recorrer
            // todo el arreglo
            for (int y = 0; y < total - 1 - x; y++){
                if (productos[y + 1].compareTo(productos[y]) < 0){
                    String auxiliar = productos[y];
                    productos[y] = productos[y + 1];
                    productos[y + 1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);

        //Implementación del método
        //arregloInverso(productos);

        //Imprimimos el arreglo
        System.out.println("======= Ciclo For =======");
        for (int i = 0; i < total; i++){
            System.out.println("productos = " + productos[i]);
        }


    }
}
