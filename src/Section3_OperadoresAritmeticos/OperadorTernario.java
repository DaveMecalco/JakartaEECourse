package Section3_OperadoresAritmeticos;

import javax.swing.*;

public class OperadorTernario {
    public static void main(String[] args) {
        //El operador ternario está compuesta de 3 partes

        //La primera es una expresión boolnea
        // varibale = condición ? valorVerdadero : valorFalso
/*
        String variable = 7 == 5 ? "es verdadero" : "es falso";
        System.out.println("varibale = " + variable);

        String estado = "";
        double promedio = 6.5;

        estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);*/

        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencas = 0.0;
        double historia = 0.0;

        String estado = "";

        matematicas = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la nota de matemáticas:"));
        System.out.println("matematicas = " + matematicas);
        ciencas = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la nota de ciencias:"));
        System.out.println("ciencas = " + ciencas);
        historia = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la nota de historia:"));
        System.out.println("historia = " + historia);


        promedio = (matematicas + ciencas + historia)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 6 ? "Aprobatorio": "Reprobatorio";

        JOptionPane.showMessageDialog(null,"Tu promedio es: " + promedio);
        JOptionPane.showMessageDialog(null,"Tu situación academica es: " + estado);
    }
}
