package Section1;

public class VariablesPrimitivas {
    public static void main(String[] args) {

        //Primitivos Numericos
        byte num1 = 1;
        System.out.println("num1 = " + num1);
        System.out.println("Un byte en bYts es = " + Byte.BYTES);
        System.out.println("Un byte en bYts es = " + Byte.SIZE);
        System.out.println("El número máximo de byte es = " + Byte.MAX_VALUE);
        System.out.println("El número máximo de byte es = " + Byte.MIN_VALUE);

        short num2 = 34;
        System.out.println("num2 = " + num2);
        System.out.println("Un short en byts es:  = " + Short.BYTES);
        System.out.println("Un short en bits es = " + Short.SIZE);
        System.out.println("El número máximo para un short es: " + Short.MAX_VALUE);
        System.out.println("El número minimo para un short es: " + Short.MIN_VALUE);

        int num3 = 555;
        System.out.println("num3 = " + num3);
        System.out.println("Un int en byts es: " + Integer.BYTES);
        System.out.println("Un int en bits es: " + Integer.SIZE);
        System.out.println("El número máximo para int es: " + Integer.MAX_VALUE);
        System.out.println("El número mínimo para int es: " + Integer.MIN_VALUE);

        long num4 = 56465456L;
        System.out.println("num4 = " + num4);
        System.out.println("Un long en bits es: " + Long.BYTES);
        System.out.println("Un long en un bit es: " + Long.SIZE);
        System.out.println("El número máximo para long es: " + Long.MAX_VALUE);
        System.out.println("El número mínimo para long es: " + Long.MIN_VALUE);

        var num5 = 56465;
        System.out.println("num5 = " + num5);
        System.out.println("Un int en byts es: " + Integer.BYTES);
        System.out.println("Un int en bits es: " + Integer.SIZE);
        System.out.println("El número máximo para int es: " + Integer.MAX_VALUE);
        System.out.println("El número mínimo para int es: " + Integer.MIN_VALUE);

        //Primitivos Caracteres
        char caracter1 = 'a';
        System.out.println("caracter1 = " + caracter1);

        //caracter en unicode
        char ucaracter = '\u0040';
        System.out.println("Char u0040 en unicode en es: " +ucaracter);

        char caracter_especial = '@';
        System.out.println("caracter_especial es = " + caracter_especial);

        char caracter_decimal = 64;
        System.out.println("caracter_decimal 64 es = " + caracter_decimal);

        //Caracteres especiales en Unicode y númericos

        char car2 = '\u0020';
        //Tabulación
        char car3 = '\t';
        //Regreso
        char car4 =  '\b';
        //Salto de linea
        char car5 = '\n';
        //Salto de linea limpio
        char car6 = '\r';

        //Primitivos Booleanos
        boolean datologico = true;
        System.out.println("datologico = " + datologico);

        //Boolean de Referencia
        Boolean datologico2 = true;
        //Se crea una instancia de forma automática cuando son de refenrecia
        System.out.println("datologico2 = " + datologico2);

        //Boolean de asignación
        boolean datologico3 = Boolean.FALSE.booleanValue();
        System.out.println("datologico3 = " + datologico3);

        boolean datologico4 = 5 - 4 == 1;
        System.out.println("El resultado lógico de la operación 5-4 = 1 es : " + datologico4);

        //Primitivos Flotantes
        float  num7 = 1.5554F;
        System.out.println("num7 = " + num7);
        System.out.println("Un float en bits es: " + Float.BYTES);
        System.out.println("Un float en bit es: " + Float.SIZE);
        System.out.println("El número máximo para float es: " + Float.MAX_VALUE);
        System.out.println("El número mínimo para float es: " + Float.MIN_VALUE);

        double num8 = 551.0;
        System.out.println("num8 = " + num8);
        System.out.println("Un double en bits es: " + Double.BYTES);
        System.out.println("Un double en bit es: " + Double.SIZE);
        System.out.println("El número máximo para double es: " + Double.MAX_VALUE);
        System.out.println("El número mínimo para double es: " + Double.MIN_VALUE);



    }
}
