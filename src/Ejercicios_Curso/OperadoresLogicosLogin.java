package Ejercicios_Curso;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "davidmecalco";
        usernames[1] = "admin";

        passwords[0] = "123456";
        passwords[1] = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del usuario: ");
        String u = scanner.next();
        System.out.println("Ingrese la contraseña del usuario: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            if (usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado){
            System.out.println("Bienvenido: ".concat(u));
        }else {
            System.out.println("Vuelva a intentarlo");
        }

    }
}
