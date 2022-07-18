import javax.swing.*;

public class VentanasDialogo {
    public static void main(String[] args) {
        //Utilizamos swing para hacer interactivas las aplicaciones
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número decimal: ");
        //Por defecto InputDialog es un String, por lo que debemos convertirlo a un entero
        //Con la clase Integger y con el metodo parseInt convertimos un String a un Entero
        int numeroInt = Integer.parseInt(numeroStr);

        //Conversión a diferentes bases
        System.out.println("En decimal es: " +numeroInt);
        System.out.println("En octal es: " + Integer.toOctalString(numeroInt));
        System.out.println("En hexamdecimal es: " + Integer.toHexString(numeroInt));
        System.out.println("En binario es: " + Integer.toBinaryString(numeroInt));
    }
}
