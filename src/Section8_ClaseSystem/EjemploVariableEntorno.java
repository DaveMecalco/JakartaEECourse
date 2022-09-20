package Section8_ClaseSystem;

import java.util.Map;

public class EjemploVariableEntorno {
    public static void main(String[] args) {

        //Para desplegar las variables de ambiente del sistema utilizamos Map y le asignamos System.getenv
        Map<String, String > varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema: " + varEnv);

        //Pasar una variable de ambiente por argumento
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);

        //Variable JavaHome
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        //Variable Path
        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        //Variable Temp
        String temp = System.getenv("Temp");
        System.out.println("temp = " + temp);

        //Método 2 para desplegar una variable de entorno
        String path2 = varEnv.get("PATH");
        System.out.println("path2 = " + path2);

        //Para enlistar todas las variables de ambiete del sistema:
        System.out.println("<__________________ Lista de variables de ambiente del sistema __________________>");
        for (String key : varEnv.keySet()){
            System.out.println(key + " = " + varEnv.get(key));
        }


    }
}
