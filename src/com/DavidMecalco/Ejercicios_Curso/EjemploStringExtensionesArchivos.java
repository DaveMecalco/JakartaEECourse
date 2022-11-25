package com.DavidMecalco.Ejercicios_Curso;

public class EjemploStringExtensionesArchivos {
    public static void main(String[] args) {
        //Poder arreglar una cade de caracteres de un archivo con cualquier terminación, aplicando los diferentes métodos existentes vistos en la sección 2

        //Declaramos la variable del nombre del archivo
        String nombreArchivo = "nombre_documento.json";
        //Imprimimos el nombre del archivo
        System.out.println("Nombre del archivo = " + nombreArchivo);

        //Imprimimos el largo de la cadena con length()
        System.out.println("Número de caracteres en el nombre del archivo = " + nombreArchivo.length());

        //Para obtener la extensión del archivo, implementamos el lastIndexOf() para tener la posición del .
        //Por si hay un archivo que tengo otro punto en su nombre, ejemplo: nombre.archivo.jpeg
        int i = nombreArchivo.lastIndexOf(".");
        //Imprimimos con subString a partir del punto
        System.out.println("Extensión del archivo : " + nombreArchivo.substring(i + 1));


    }
}
