package Section5_Wrapper;

public class WrapperOperadoresRelacionales {

    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //Son el mismo valor y el ismo objeto
        System.out.println("Son el mismo objeto: " + (num1 == num2));

        num2 = 1000;

        //Son el mismo valor pero no el mismo objeto
        System.out.println("Son el mismo objeto num1 y num2: " + (num1 == num2));

        //Para comparar el mismo valor es con el método equals()
        System.out.println("Son el mismo valor num1 y num2: " + (num1.equals(num2)));
        //Otra forma para comparar el valor es con el intValue
        System.out.println("Son el mismo valor num1 y num2: " + (num1.intValue() == num2.intValue()));

        //Java hasta el número 127 lo compara de forma automática
        //Después del 128 debemos comprar con el equals y con intValue

        //Podemos comprar los objetos con primitivos gracias al Autoboxing
        num2 = 500;
        
        boolean condicion = num1.intValue() > num2.intValue();
        System.out.println("condicion = " + condicion);
    }

}
