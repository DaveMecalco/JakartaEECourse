package Section4_FlujosControl;

public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }


        //Sentencia do while
        //Itera al menos una vez

        int j = 0;
        prueba = true;

        do{
            if(j == 50){
                prueba = false;
            }
            System.out.println(j);
            j++;
        }while (prueba);

    }
}
