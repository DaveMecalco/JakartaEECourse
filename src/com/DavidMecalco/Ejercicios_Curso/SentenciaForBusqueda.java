package com.DavidMecalco.Ejercicios_Curso;

import javax.swing.*;

public class SentenciaForBusqueda {
    public static void main(String[] args) {

        //Inicializamos el arreglo
        String[] nombres = {"David", "Anahi", "Jaqueline", "José", "Pedro", "Juan", "Maria", "Lupita", "Saul", "Pepe", "Bea", "Araceli"};
        boolean encontrado = false;

        //Inicializamos la variable para buscar los nombres
        String buscar = JOptionPane.showInputDialog("Ingresa un nombre para buscar en el sistema: ");

        //Inicializamos el arreglo para buscar los nombres
        for (int i = 0; i < nombres.length; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, "El nombre " + buscar + " SI se encuentra en el sistema");
        }else {
            JOptionPane.showMessageDialog(null, "El nombre " + buscar + " NO se encuentra en el sistema");
        }

    }
}
