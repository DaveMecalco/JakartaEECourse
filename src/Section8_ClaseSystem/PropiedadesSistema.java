package Section8_ClaseSystem;

import java.util.Properties;

public class PropiedadesSistema {
    public static void main(String[] args) {

        //Muestra el nombre del usuario
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);


        //Ruta principal del sistema
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        //Espacio de trabajo
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        //Version de Java
        String version = System.getProperty("java.version");
        System.out.println("version = " + version);

        //Separador de línea
        String lineseparator = System.getProperty("line.separator");
        System.out.println("lineseparator = " + lineseparator);

        //Separador de linea 2
        String lineseparator2 = System.lineSeparator();

        //Para mostrar todas las configuraciones
        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);



    }
}
