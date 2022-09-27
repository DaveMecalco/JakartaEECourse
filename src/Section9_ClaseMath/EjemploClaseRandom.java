package Section9_ClaseMath;

import java.util.Random;

public class EjemploClaseRandom {
    public static void main(String[] args) {

        //Para llamar a la clase Random, debemos crear el objeto Random
        //Es más flexible llamar la clase que el método, ya que nos permite generar int y double
        //Lo contrario al método, porque solo puedo retorno una double
        Random objRandom = new Random();


        //Para generar números aleatorios
        //Sin parametros genera números muy grandes positivos tanto como negativos
        int radonInt = objRandom.nextInt();
        System.out.println("radonInt = " + radonInt);

        //Establecer rangos para generar números aleatorios
        int randomInt = objRandom.nextInt(7);
        System.out.println("randomInt = " + randomInt);

        //Establecer un nimo y un máximo
        int randomInt2 = 10 + objRandom.nextInt(20 - 10);
        System.out.println("randomInt2 = " + randomInt2);

    }
}
