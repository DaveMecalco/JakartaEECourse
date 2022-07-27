package Section3_OperadoresAritmeticos;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Declaramos las varibales
        int i = 1;
        int j = 1;

        //Pre Incremento
        int k = ++i; //Primero se incrementa y luego se asigna la variable J
        System.out.println("k = " + k);

        //Post Incremento
        k = j++; //Primero se asigna el valor a variable y después se incrementa
        System.out.println("k = " + k);

        int a = 1;
        int b = 1;

        //Pree decremento
        int c = --a; //Primero se decrementa y después se asigna a la variable
        System.out.println("c = " + c);

        //Post decremento
        c = b--;
        System.out.println("c = " + c);

    }
}
