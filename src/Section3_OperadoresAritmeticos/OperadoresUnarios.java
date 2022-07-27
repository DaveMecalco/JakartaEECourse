package Section3_OperadoresAritmeticos;

public class OperadoresUnarios {
    public static void main(String[] args) {

        //Los operadores Unarios no son más que la ley de signos

        //Declaramos un entero negativo
        int i = -5;

        //Lo multiplicamos por más; j = +1*(-5) = -5
        int j = +i;
        //Imprimimos el resultado
        System.out.println("j = " + j);

        int k = -i;
        //Lo multiplicamos por menos; j = -1*(-5) = 5
        System.out.println("k = " + k);
    }
}
