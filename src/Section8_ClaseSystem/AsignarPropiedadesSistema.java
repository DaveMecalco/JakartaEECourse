package Section8_ClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesSistema {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Para configurar o realizar propiedades del sistema personalizadas debemos creamos un archivo con la terminación .properties
        aquí escribimos nuestra configuración
        Las palabras compuestas van separadas por puntos y en minúsculas "este.es.un.ejemplo"
        Y se deben asignar con un = seguido de lo que queremos que sea el resultado
         */

        //Utilizamos una variable de tipo FileInputStream y se asigna al objeto properties

        try{
            //Cargamos el archivo de configuraciones
            FileInputStream archivo = new FileInputStream("src/Section8_ClaseSystem/config.properties");

            //Caramos las demás propiedades del sistema
            Properties p = new Properties(System.getProperties());

            //Agregamos nuestra propiedades personalizadas
            p.load(archivo);

            //Para agregar una nueva propiedad
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            //Para combinar las propiedades del sistema y las personalizadas
            System.setProperties(p);

            //Para mostrar todas las propiedades
            System.getProperties().list(System.out);
        } catch (Exception e){
            System.out.println("No existe el archivo");
        }


    }
}
