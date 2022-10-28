package Section12_ArreglosBidimensionales;

public class EjemploTransponerMatriz {
    public static void main(String[] args) {

        //Inicializamos el array
        int[][] a, b;
        a = new int[8][4];
        b = new int[4][8];

        System.out.println("Matriz a: ");
       for(int i = 0; i < a.length; i++){
           for(int j = 0; j < a[i].length; j++){
               a[i][j] = (i + j) * 3;
               System.out.print(a[i][j] + "\t");
           }
           System.out.println();
       }

       for (int i = 0; i < a.length; i++){
           for (int j = 0; j < a[i].length; j++){
               b[j][i] = a[i][j];
           }
       }

        System.out.println("Matriz transpuesta de a: ");
       for (int i = 0; i < b.length; i++){
           for (int j = 0; j < b[i].length; j++){
               System.out.print(b[i][j] + "\t");
           }
           System.out.println();
       }


    }
}
