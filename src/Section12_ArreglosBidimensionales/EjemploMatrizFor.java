package Section12_ArreglosBidimensionales;

public class EjemploMatrizFor {
    public static void main(String[] args) {

        //Matriz de Strings
        String[][] nombres = new String[3][2];

        nombres[0][0] = "Pepe";
        nombres[0][1] = "Juan";

        nombres[1][0] = "Jose";
        nombres[1][1] = "Anahi";

        nombres[2][0] = "David";
        nombres[2][1] = "Oscar";

        //Iteramos los nombres con un for
        System.out.println("Iteración con ciclo for: ");
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println("");
        }

        //Iteración de nombres con foreach
        System.out.println("Iteración con ciclo foreach: ");
        for (String[] fila: nombres){
            for (String nombre:fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
