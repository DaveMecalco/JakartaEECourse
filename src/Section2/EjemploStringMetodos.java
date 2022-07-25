package Section2;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        //Esta clase es para prácticar todos los metodos de la clase String
        String nombre = "David Mecalco Alejo";

        //método length para retornar el número de caracteres
        System.out.println("Número de caracteres  = " + nombre.length());

        //método toUpperCase para convertir los caracteres a mayúsculas
        System.out.println("Nombre en mayúsculas = " + nombre.toUpperCase());

        //método toLowerCase para convertir los caracteres en minúsculas
        System.out.println("Nombre en minúsculas = " + nombre.toLowerCase());

        //método equals para comparar si es igual a una cadena de caracteres
        System.out.println("nombre.equals(\"David Mecalco Alejo\") = " + nombre.equals("David Mecalco Alejo"));
        System.out.println("nombre.equals(\"David Mecalco Alejo\") = " + nombre.equals("david mecalco alejo"));
    }
}
