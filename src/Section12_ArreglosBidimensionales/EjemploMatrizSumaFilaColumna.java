package Section12_ArreglosBidimensionales;

public class EjemploMatrizSumaFilaColumna {
    public static void main(String[] args) {

        //Definimos dos variables para la suma fila y columna
        int sumaFila, sumaColumna;

        //Inicializamos la matriz
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Ciclo for para iterar y guardar los datos en la matriz suma
        for (int i = 0; i < a.length; i++){

            //Asignamos valor a la fila y la columna
            sumaFila = 0;
            sumaColumna = 0;

            for (int j = 0; j < a[i].length; j++){
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
            }

            //Imprimimos los valores del resultado de la suma
            System.out.println("Total de la fila " + i + " : " + sumaFila);
            System.out.println("Total de la columna " + i + " : " +sumaColumna);
        }

    }
}
