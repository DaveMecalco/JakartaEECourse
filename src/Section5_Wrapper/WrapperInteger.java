package Section5_Wrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        //Forma de convertir un entero a un objeto primitivo con clase wrapper
        //A partir de Java JDK 7 no se puede utilizar así:
        //Integer intObj =  new Integer(5);

        //La forma correcta explicita
        Integer intObj = Integer.valueOf(3756);
        System.out.println("intObj = " + intObj);

        //La forma implícita
        Integer intObj2 = 3768;
        System.out.println("intObj2 = " + intObj2);
        //Forma de convertir un objeto a un primitivo

        //Forma explicita

        int num = intObj.intValue();
        System.out.println("num = " + num);

        //Forma implícita
        int num2 = intObj2;
        System.out.println("num2 = " + num2);

        //Convertir un valor String a numerico
        String valorST = "6700";
        Integer valorIn = Integer.valueOf(valorST);
        System.out.println("valorIn = " + valorIn);

        //Si convertimos un valor a uno más pequeño hay perdida de información, por lo tanto, no se debe hacer

        //Convertir un valor Integer a Short
        Short shortObj = intObj.shortValue();
        System.out.println("shortObj = " + shortObj);
        
        //Convertir un valor Int a Byte
        
        Byte byteObj = intObj.byteValue();
        System.out.println("byteObj = " + byteObj);

        //Lo que si se puede hacer, es convertir un valor más pequeño a uno más grande

        Long longObj = intObj.longValue();
        System.out.println("longObj = " + longObj);


    }
}
