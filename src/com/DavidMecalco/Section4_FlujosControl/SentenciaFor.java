package com.DavidMecalco.Section4_FlujosControl;

public class SentenciaFor {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++){
            System.out.println("i = " + i);
        }

        for (int j = 10; j >= 0; j--){
            System.out.println("j = " + j);
        }

        //Imprimir números impares

        for (int i = 0; i <= 10; i++){
            if(i % 2 ==0){
                //Continue se utiliza para que no salga del bucle el for al iterar, entonces solo esca la sentencia if
                continue;
            }
            System.out.println("i = " + i);
        }

        //Imprimir números pares

        for (int i = 0; i <= 10; i++){
            if(i % 2 !=0){
                continue;
            }
            System.out.println("i = " + i);
        }

        //Bucles sobre strings
        String[] nombres = {"David", "Anahi", "Paco", "Saul", "Pepe", "José", "Clara", "Maria", "Ismael", "Juan", "Pedro", "Bea", "Clara"};
        int conunt = nombres.length;
        for (int i = 0; i < conunt; i++){
            System.out.println(i + " - " + nombres[i]);
        }

        System.out.println("");

        //Bucles con saltos
        //Utilizando if dentro d eun for
        String[] nombres2 = {"David", "Anahi", "Paco", "Saul", "Pepe", "José", "Clara", "Maria", "Ismael", "Juan", "Pedro", "Bea", "Clara"};
        int conunt2 = nombres.length;
        for (int i = 0; i < conunt2; i++){
            if(nombres2[i].equalsIgnoreCase("David") || nombres2[i].equalsIgnoreCase("Paco")){
                continue;
            }
            System.out.println(i + " - " + nombres2[i]);
        }

    }
}
