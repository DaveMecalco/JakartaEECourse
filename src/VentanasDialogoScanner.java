import javax.swing.*;

public class VentanasDialogoScanner {
    public static void main(String[] args) {
        //Utilizamos swing para hacer interactivas las aplicaciones
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número decimal: ");
        //Por defecto InputDialog es un String, por lo que debemos convertirlo a un entero
        //Con la clase Integger y con el metodo parseInt convertimos un String a un Entero

        //Para manejar excepciones debemos utilizar try
        int numeroInt = 0;

        //Para inicializar un manejo de errores debemos declarar la variable fuera del contexto
        //Try significa intentar
        try {
            //Dentro de try debemos asignar la variable que deseamos manejar con errores
            numeroInt =Integer.parseInt(numeroStr);
            //Catch es donde manejaremos el error y daremos solución a excepción
        }catch (NumberFormatException e){
            //NumberFormatException es el tipo de error que se maneja y e es nombre de la excepción
            //Después mostramos un mensaje para manejar el error
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            //Demos hacer una acción para volver a intentar manejar el error, esto es regresar al main
            main(args);
            //Después de regresar, para no caer en recursividad, debemos salir de este bucle
            System.exit(0);
        };

        //Conversión a diferentes bases
        //Para optimizar este fragmento, debemos guardarlo en variables diferentes y después concatenarlas
        String strDec = "En decimal es: " +numeroInt;
        //System.out.println("En decimal es: " +numeroInt);
        String strOct = "En octal es: " + Integer.toOctalString(numeroInt);
        //System.out.println("En octal es: " + Integer.toOctalString(numeroInt));
        String strHex = "En hexadecimal es: " + Integer.toHexString(numeroInt);
        //System.out.println("En hexadecimal es: " + Integer.toHexString(numeroInt));
        String strBin = "En binario es: " + Integer.toBinaryString(numeroInt);
        //System.out.println("En binario es: " + Integer.toBinaryString(numeroInt));

        //Para mostrar ventanas de mensajes Utilizamos el ShowMensageDialog de la Swing
        //String mensajeResultado = "En decimal es: " +numeroInt + "\n En octal es: " + Integer.toOctalString(numeroInt) + "\n En hexamdecimal es: " + Integer.toHexString(numeroInt) + "\n En binario es: " + Integer.toBinaryString(numeroInt);
        //Linea mejor optimizadas en memoria
        String mensajeResultado = strDec +"\n" + strOct + "\n" + strHex + "\n" + strBin;
        JOptionPane.showMessageDialog(null, mensajeResultado);
    }
}
