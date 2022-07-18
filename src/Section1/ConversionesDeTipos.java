package Section1;

public class ConversionesDeTipos {
    public static void main(String[] args) {

        //Conversiones de String a Primitivo

        String numeroStr = "50";
        //Para convertir un string en int debemos utilizar parseInt de la clase Integger
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String numeroStr1 = "4556.33";
        //Para convertir un string en un double utilizamos parseDouble de la clase Double
        double numeroDouble = Double.parseDouble(numeroStr1);
        System.out.println("numeroDobule = " + numeroDouble);

        String numeroStr2 = "4565.98e-3";
        //Para convertir un string con notación cientifica en un double utilizamos parseDouble de la clase Double
        double numeroDouble2 = Double.parseDouble(numeroStr2);
        System.out.println("numeroDouble2 = " + numeroDouble2);

        String numeroStr3 = "true";
        //También podemos convertir string en booleanos
        boolean varBoolean = Boolean.parseBoolean(numeroStr3);
        System.out.println("varBoolean = " + varBoolean);

        String numeroStr4 = "0";
        //También podemos convertir string en booleanos
        boolean varBoolean2 = Boolean.parseBoolean(numeroStr4);
        System.out.println("varBoolean = " + varBoolean2);


        //Primitivos a String


        int numInt = 20;
        //Método 1 para convertir un int a String se realiza con la clase Integer y el atributo toString()
        String varStr1 = Integer.toString(numInt);
        System.out.println("varStr1 = " + varStr1);


        //Método 2 para convertir un int a String se realiza con la clase String y el atributo valueOf()
        //Sobrecarga de método
        String varStr2 = String.valueOf(numInt);
        System.out.println("varStr1 = " + varStr2);

        double numDouble1 = 1.23456;
        //Método 1 para convertir un double a String es con la clase Double y el atributo toString()
        String varStr3 = Double.toString(numDouble1);
        System.out.println("varStr3 = " + varStr3);

        double numDouble2 = 1.23456;
        //Método 1 para convertir un double a String es con la clase String y el atributo valueOf()
        varStr3 = String.valueOf(numDouble2);
        System.out.println("varStr3 = " + varStr3);







    }
}