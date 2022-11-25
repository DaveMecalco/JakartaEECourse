package com.DavidMecalco.Section5_Wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = Boolean.TRUE;

        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean3 = " + objBoolean3);

        System.out.println("Comprando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comprando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comprando dos objetos boolean: " + (objBoolean == objBoolean3));

        //Para retornar un valor primitivo de un objeto

        //Forma explicita
        //Boolean primBoolean3 = objBoolean.booleanValue();

        //Forma implicita
        Boolean primBoolean2 = objBoolean2;



    }
}
