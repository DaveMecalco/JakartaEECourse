package Section1;

public class EjemploString {
    public static void main(String[] args) {

        //Maneras de crear un String
        //Forma 1 (Corta), crear el objeto de forma implicita
        String curso = "Programación Java";

        //Forma 2 (Mediante objeto), crear el objeto manualmente
        String curso2 = new String("Programación Java");

        //Comprar dos String por la forma
        //Mediante ==
        boolean igualString = curso==curso2;
        System.out.println("¿Son igual las cadenas de String por su declaración?: " + igualString);
        //Es falso porque una es creada mediante un objeto y la otra es creada de forma automática

        //Mediante el método equals()
        System.out.println("¿Son igual las cadenas de String por su contenido?: " + curso.equals(curso2));

    }
}
