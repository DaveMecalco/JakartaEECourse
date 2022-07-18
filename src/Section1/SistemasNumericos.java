package Section1;

public class SistemasNumericos {
    public static void main(String[] args) {

        //Inicializamos una variable con un número decimal
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        //Para convertir números decimales a octales, utilizamos la clase Integer.toOctal()
        System.out.println("Número decimal = " + numeroDecimal + " en Octal es: " + Integer.toBinaryString(numeroDecimal));
        //Las variables int, al convertirlas a otra base, automaticamente se convierten a String, por lo que hay que convertirlas a entero de nuevo para poder realizar operacione

        int numeroBinario = 0b111110100;
        //Para que el compilador entienda que se trata de un número binario, debemos iniciar el valor con 0b para que se interprete correctamente
        System.out.println("numeroBinario = 111110100 en Decimal que: " + numeroBinario);
        //los números binarios en Java no son necesarios convertirlos, ya que aútomaticamente, el compilador los transforma a decimal

        System.out.println("numeroDecimal = " + numeroDecimal + "en Hexadecimal es: " + Integer.toHexString(numeroDecimal));

        //para los números hexadecimales es necesario iniciar el valor con 0x
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
        //Al igual que con los números binarios ya no es necesario la conversión de Hexadecimal a Decimal, ya que automaticamente se realiza en el compilador

        System.out.println("numeroDecimal = " + numeroDecimal + " en Octal es: " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;


        //Para

    }
}
