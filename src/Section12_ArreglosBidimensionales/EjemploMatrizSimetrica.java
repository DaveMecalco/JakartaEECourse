package Section12_ArreglosBidimensionales;

public class EjemploMatrizSimetrica {
    public static void main(String[] args) {
        boolean simentrica = true;

        //Inicializamos la matriz simetrica
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        int i, j;
        i = 0;
        salir : while (i < matriz.length){
            j = 0;
            while (j < i){
                if (matriz[i][j] != matriz[j][i]){
                    simentrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }

        if(simentrica == true){
            System.out.println("La matriz es simétrica");
        }else{
            System.out.println("La matriz no es simétrica");
        }

    }
}
