public class Primitivos_carateres {
    public static void main(String[] args) {
        char caracter1 = 'a';
        System.out.println("caracter1 = " + caracter1);

        //caracter en unicode
        char ucaracter = '\u0040';
        System.out.println("Char u0040 en unicode en es: " +ucaracter);

        char caracter_especial = '@';
        System.out.println("caracter_especial es = " + caracter_especial);

        char caracter_decimal = 64;
        System.out.println("caracter_decimal 64 es = " + caracter_decimal);

        //Caracteres especiales en Unicode y númericos

        char car2 = '\u0020';
        //Tabulación
        char car3 = '\t';
        //Regreso
        char car4 =  '\b';
        //Salto de linea
        char car5 = '\n';
        //Salto de linea limpio
        char car6 = '\r';
        //Agregamos otra linea
    }
}
