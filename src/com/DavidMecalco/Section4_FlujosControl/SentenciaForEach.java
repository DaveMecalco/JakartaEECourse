package com.DavidMecalco.Section4_FlujosControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1 ,3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};

        //El forEach itera una cadena sin necesidad de declarar variable
        for (int numero: numeros){
            System.out.println("numero = " + numero);
        }

        //Debemos definir al inicio de ciclo el tipo de varibale que vamos a iterar
        String[] nombres = {"David", "Anahi", "Paco", "Saul", "Pepe", "José", "Clara", "Maria", "Ismael", "Juan", "Pedro", "Bea", "Clara"};

        for (String nombre: nombres){
            System.out.println(nombre);
        }

    }
}
