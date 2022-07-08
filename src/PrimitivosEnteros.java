import java.awt.*;

public class PrimitivosEnteros {
    public static void main(String[] args) {
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



    }
}
