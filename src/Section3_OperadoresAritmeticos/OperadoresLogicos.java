package Section3_OperadoresAritmeticos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Declaramos las varibales
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        //Compuerta and &&
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);


        //compuerta or ||
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        //Combinación de compuertas lógicas
        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);

        //Las compuertas lógicas se evalúan igual que las aritmeticas, de izquierda a derecha
        boolean b4 = i == j && (k < l || m == false);
        System.out.println("b4 = " + b4);

    }
}
