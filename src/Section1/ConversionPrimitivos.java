package Section1;

public class ConversionPrimitivos {
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


        //Conversiones de String a Primitivo

        String numeroStr = "50";
        //Para convertir un string en int debemos utilizar parseInt de la clase Integger
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String numeroStr1 = "4556.33";
        //Para convertir un string en un double utilizamos parseDouble de la clase Double
        double numeroDouble = Double.parseDouble(numeroStr1);
        System.out.println("numeroDobule = " + numeroDouble);

        String numeroStr2 = "4565.98e-3";
        //Para convertir un string con notación cientifica en un double utilizamos parseDouble de la clase Double
        double numeroDouble2 = Double.parseDouble(numeroStr2);
        System.out.println("numeroDouble2 = " + numeroDouble2);

        String numeroStr3 = "true";
        //También podemos convertir string en booleanos
        boolean varBoolean = Boolean.parseBoolean(numeroStr3);
        System.out.println("varBoolean = " + varBoolean);

        String numeroStr4 = "0";
        //También podemos convertir string en booleanos
        boolean varBoolean2 = Boolean.parseBoolean(numeroStr4);
        System.out.println("varBoolean = " + varBoolean2);


        //Primitivos a String


        int numInt = 20;
        //Método 1 para convertir un int a String se realiza con la clase Integer y el atributo toString()
        String varStr1 = Integer.toString(numInt);
        System.out.println("varStr1 = " + varStr1);


        //Método 2 para convertir un int a String se realiza con la clase String y el atributo valueOf()
        //Sobrecarga de método
        String varStr2 = String.valueOf(numInt);
        System.out.println("varStr1 = " + varStr2);

        double numDouble1 = 1.23456;
        //Método 1 para convertir un double a String es con la clase Double y el atributo toString()
        String varStr3 = Double.toString(numDouble1);
        System.out.println("varStr3 = " + varStr3);

        double numDouble2 = 1.23456;
        //Método 1 para convertir un double a String es con la clase String y el atributo valueOf()
        varStr3 = String.valueOf(numDouble2);
        System.out.println("varStr3 = " + varStr3);


        //Para

    }
}
