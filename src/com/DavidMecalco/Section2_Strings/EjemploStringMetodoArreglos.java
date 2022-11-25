package com.DavidMecalco.Section2_Strings;

public class EjemploStringMetodoArreglos {
    public static void main(String[] args) {

        //Declaramos el String
        String trabalenguas = "trabalenguas";

        //Imprimimos el String trabalenguas
        System.out.println("trabalenguas = " + trabalenguas);

        //Para convertir un String a un arreglo de caracteres utilizamos el método toCharArray() para convertirlos en
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        //Para guardar el char en un arreglo necesitamos implicar un for

        char[] arreglo = trabalenguas.toCharArray();
        int largoCadena = arreglo.length;
        System.out.println("largoCadena = " + largoCadena);

        for(int i = 0; i < largoCadena; i++){
            System.out.println("arreglo = " + arreglo[i]);
        }

        //Otra forma para separar String es con el método split()
        //Sirve separar expresiones regulares, damos el índice en caracter de donde queremos separar el string
        //Por ejemplo split("a"), separa la expresión en donde encuentre la coincidencia: tr |a| b |a| lengu |a| s
        String[] arreglo2 = trabalenguas.split("a");
        int largoCadena2 = arreglo2.length;

        for(int j = 0; j < largoCadena2; j++){
            System.out.println("arreglo2 = " + arreglo2[j]);
        }

        String nombreArchivo = "nombre_documento.pdf";
        String[] arreglo3 = nombreArchivo.split("\\.");
        int largoCadena3 = arreglo3.length;
        System.out.println("largoCadena3 = " + largoCadena3);
        for (int j = 0; j <largoCadena3; j++){
            System.out.println("arreglo3 = " + arreglo3[j]);
        }
        System.out.println("Extension = " + arreglo3[largoCadena3 - 1]);


    }
}
