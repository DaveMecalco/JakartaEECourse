package Section6_ValorReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("iniciamos el método con el valor i = " + i);
        test(i);

        //Se pasa el valor de la variable y no el objeto (referencia)
        System.out.println("finaliza el método main con el valor de i = " + i);

    }

    //Implemetación de un metodo

    public static void test(int i){
        System.out.println("iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("el nuevo valor de i = " + i);
    }

}
