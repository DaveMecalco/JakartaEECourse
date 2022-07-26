package Section2_Strings;

public class ValidacionStrings {
    public static void main(String[] args) {
        //Manejo de errores con NullPointerException
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        //Las variables con referencia nula no pueden ser afectadas por métodos de la clase.
        if (esNulo){
            curso = "Programación Java";
        }

        //Con .length() podemos devolver el número de caracteres que tiene el string

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        //isEmpty evalua si cadena de caracteres esta vacia
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        //isBlank validad que sea distinto a Empty, que este vacio o que contenga espacios, es la mejor alternativa para evaluar estos casos
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            //El método concat solo se puede utilizar con el objeto String cuando tiene una instancia, que tiene un valor asignado
            //Las variables con referencia nula no se pueden concatenar
            //System.out.println(curso.concat(" desde cero!"));
            //El mismo caso, un cadena de caracteres no puede concatenarse con un valor nulo
            //System.out.println("Bienvenido al curso de ".concat(curso));

            //Del lado contrario, el operador + si puede concatenar cadenas de caracteres con valores de referencia nulos
            System.out.println("Bienvenido al curso " + curso);
        }


    }
}
