package com.DavidMecalco.Section6_ValorReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10, 11, 12};
        System.out.println("iniciamos el método maín");
        for (int j = 0; j < edad.length ; j++) {
            System.out.println("edad[j]" + edad[j]);
        }
        System.out.println("Antes de invocar al método test: " );
        test(edad);

        System.out.println("Después de invocar al método test: " );

        for (int j = 0; j < edad.length ; j++) {
            System.out.println("edad[j]" + edad[j]);
        }
        //Se pasa el valor de la variable y no el objeto (referencia)

        //Los variabales son inmutbales, retorna una nueva instancia
        System.out.println("finaliza el método main con los datos modificados");

    }

    //Implemetación de un metodo

    public static void test(int[] edadArr){
        System.out.println("iniciamos el método test");
        for (int j = 0; j < edadArr.length ; j++) {
            edadArr[j] = edadArr[j] + 20;
        }
        System.out.println("finaliza el método test");
    }


}
