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

        //Significa que no se puede modificar el valor del String o del objeto creado mediante estos mismos
        //Ejemplo 1: si modificamos un string y queremos cambiar su argumento mediante objetos, esto no cambiara el valor asignado por defecto, pero si afectará a la instancia

        String nombreComida = "Enchiladas";
        String nombreComida2 = " con queso y crema";

        //Estamos concatenando dos Strings con el método concact()
        nombreComida.concat(nombreComida2);

        System.out.println("nombreComida = " + nombreComida);
        //El resultado es nombreComida = Enchiladas, solo se concatena en la instancia, pero el valor no se modifica, para ver la concatenación debemos crear una nueva variable que guarde esa instancia para observar el resultado

        //Asignamos la concatenación para una variable nueva
        String nombreCompletoComida = nombreComida.concat(nombreComida2);
        //Imprimimos el resultado
        System.out.println("Resultado mediante concat() = " + nombreCompletoComida);

        //Ejemplo 2, mediante lambdas
        //Con el método transform(), convertimos el string la literal y retornamos el valor nuevo, concatenando otro string
        nombreComida.transform(c ->{
            return c + nombreComida2;
        });

        //Imprimimos la varibale
        System.out.println("nombreComida = " + nombreComida);

        //Al igual que en el ejemplo pasado, no podemos visualizar el resultado completo porque no se modifica el valor del String, solo la instancia interna de la viarable
        //Demos crear otra variable para que se le asigne la instancia del método
        String nombreCompletoComida2 = nombreComida.transform(c1 -> {
           return c1 + nombreComida2;
        });

        //Imprimimos el resultado
        System.out.println("Resultado mediante lambdas = " + nombreCompletoComida2);

    }
}
