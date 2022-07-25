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

        //método equalsIgnoreCase para comparar si es igual a una cadena de caracteres omitiendo mayúsculas y minúsculas
        System.out.println("nombre.equals(\"David Mecalco Alejo\") = " + nombre.equalsIgnoreCase("david mecalco alejo"));
        
        //método compareTo que sirve para comparar los caracteres de manera lexicográfico y retorna un int en el orden que aparecen en la tabla UNICOde
        System.out.println("nombre.compareTo(\"David Mecalco Alejo\") = " + nombre.compareTo("David Mecalco Alejo"));
        System.out.println("nombre.compareTo(\"Saul Quiroz Vazques\") = " + nombre.compareTo("Saul Quiroz Vazques"));

        //método charAT retorna el caracter en la posición indicada en número
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        //Para obtener el ultimo caracter de forma dinámica sin importar el tipo de cadena
        System.out.println("nombre.charAt(nombre.length() -1) = " + nombre.charAt(nombre.length() -1));

        //método subString retorna el resto de la cadena desde de la posición indicada
        System.out.println("nombre.substring(5) = " + nombre.substring(5));
        //También puede tener segundo parametro separado por una coma (hasta)
        System.out.println("nombre.substring(5,13) = " + nombre.substring(5,13));

        String trabalengua = "trabalenguas";
        
        //método replace() para remplazar caracteres, el caracter que queremos remplazar (target), remplazo del caracter (replacement)
        System.out.println("trabalengua.replace(\"a\",\".\") = " + trabalengua.replace("a","."));
        
        //método indexOf() para devolver la posición exacta en entero del caracter deseado, solamente a primera coincidencia
        System.out.println("trabalengua.indexOf('g') = " + trabalengua.indexOf('g'));

        //método indexOf() para devolver la posición exacta en entero del caracter deseado, solamente a ultima coincidencia
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));

        //método contains() muestra el valor booleano si se encuentra el caracter en la secuencia o no, su argumento es con comillas dobles "" adiferencia de index que es con comillas simples ''
        System.out.println("trabalengua.contains(\"b\") = " + trabalengua.contains("b"));

        //método starWith() compara si empieza con y una secuencia de caracteres, retorna un booleano
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));
        
        //método endWith()
        System.out.println("trabalengua.endsWith(\"lenguas\") = " + trabalengua.endsWith("lenguas"));

        //método trim() elimina los espacios en blanco de ambos lados, izquierda y derecha
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());
    }
}
