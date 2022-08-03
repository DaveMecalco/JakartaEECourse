package Ejercicios_Curso;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "davidmecalco";
        String password = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del usuario: ");
        String u = scanner.next();
        System.out.println("Ingrese la contraseña del usuario: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        if(username.equals(u) && password.equals(p)){
            esAutenticado = true;
        }

        if (esAutenticado){
            System.out.println("Bienvenido : ".concat(username).concat("!"));
        }
        else {
            System.out.println("No coinciden las credenciales");
        }

    }
}
