import java.util.InputMismatchException;
import java.util.Scanner;

public class VentanasDialogoScanner {
    public static void main(String[] args) {
        //Para definir entradas de texto en consola debemos instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);
        //Mostramos un mensaje para dar la instrucción a realizar
        System.out.println("Ingrese un número decimal: ");
        //La variable scanner con el atributo nextLine() recibirá la información del usuario en String
        //String numeroStr = scanner.nextLine();
        //Para manejar excepciones debemos utilizar try
        int numeroInt = 0;
        //Para inicializar un manejo de errores debemos declarar la variable fuera del contexto
        //Try significa intentar
        try {
            //Dentro de try debemos asignar la variable que deseamos manejar con errores
            //numeroInt =Integer.parseInt(numeroStr);
            //Para convertir directamente una linea String a Entero utilizamos scanner.nextInt()
            numeroInt = scanner.nextInt();
            //Catch es donde manejaremos el error y daremos solución a excepción
            //Para manejar errores con scanner.nextInt() debemos importar el paquete InputMismatchException
        }catch (InputMismatchException e){
            //NumberFormatException es el tipo de error que se maneja y es nombre de la excepción
            //Después mostramos un mensaje para manejar el error
            System.out.println("Error, debe ingresar un número entero");
            //Demos hacer una acción para volver a intentar manejar el error, esto es regresar al main
            main(args);
            //Después de regresar, para no caer en recursividad, debemos salir de este bucle
            System.exit(0);
        }

        //Conversión a diferentes bases
        //Para optimizar este fragmento, debemos guardarlo en variables diferentes y después concatenarlas
        String mensajeResultado = " En decimal es: " +numeroInt;
        //System.out.println("En decimal es: " +numeroInt);
        mensajeResultado += "\n En octal es: " + Integer.toOctalString(numeroInt);
        //System.out.println("En octal es: " + Integer.toOctalString(numeroInt));
        mensajeResultado += "\n En hexadecimal es: " + Integer.toHexString(numeroInt);
        //System.out.println("En hexadecimal es: " + Integer.toHexString(numeroInt));
        mensajeResultado += "\n En binario es: " + Integer.toBinaryString(numeroInt);
        //System.out.println("En binario es: " + Integer.toBinaryString(numeroInt));

        //Para concatenar la misma variable debemos utilizar la variable y al asignar el valor debemos poner un +=
        //Así reutilizamos la misma variable, cambiando el valor, en este caso, agregando más información.

        //Mostramos el resultado con salida en consola
        System.out.println(mensajeResultado);
    }
}
