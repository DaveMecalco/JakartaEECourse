package Section1;

public class EjemploString {
    public static void main(String[] args) {

        //Maneras de crear un String
        //Forma 1 (Corta), crear el objeto de forma implicita
        String curso = "Programación Java";

        //Forma 2 (Mediante objeto), crear el objeto manualmente
        String curso2 = new String("programación java");

        //Comprar dos String por la forma
        //Mediante ==, comparamos el objeto
        boolean igualString = curso==curso2;
        System.out.println("¿Son igual las cadenas de String por su declaración?: " + igualString);
        //Es falso porque una es creada mediante un objeto y la otra es creada de forma automática

        //Mediante el método equals(), comparamos el atributo
        System.out.println("¿Son igual las cadenas de String por su contenido?: " + curso.equals(curso2));

        //Comparación de Mayúsculas y Minúsculas
        //Mediante el método equalsIgnoreCase()
        System.out.println("¿Son igual las cadenas de String por su contenido ignorando las mayúsculas y minúsculas?: " + curso.equalsIgnoreCase(curso2));


        //Concatenación de Strings
        //Existen dos métodos para concatenar String

        String nombre = "David";
        String apellido = "Mecalco";
        String nombreCompleto = nombre + " " + apellido;

        //Método 1: mediante +
        System.out.println(nombre + apellido);

        //Método 2: mediante el método concat()
        System.out.println(nombre.concat(apellido));



        //Gerarquia de concatenación
        //Se evalúan las concatenaciones de izquierda a derecha

        //Concatenación de números y string
        int a = 1;
        int b = 2;

        System.out.println(nombreCompleto + a + b);
        //El resultado es: David Mecalco12
        //Primero reconoce la variable nombreCompleto que es un String y después cocatena la variable a y luego la b
        //David Mecalco12

        System.out.println(nombreCompleto + (a + b));
        //El resultado es: David Mecalco3
        //Primero reconoce el string y luego suma las variables numericas (a y b)
        //David Mecalco + (1 + 2) = David Mecalco3

        System.out.println(a + b + nombreCompleto);
        //El resultado es: 3David Mecalco
        //Primero reconoce la variable int a y suma b, después concactena el String


        //Inmutabilidad de Strings


    }
}
