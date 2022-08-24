package Section7_ClaseDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        //Para imprimir la fecha solo debemos imprimir la variable fecha
        System.out.println("fecha = " + fecha);

        //Para imprimir la fecha con un formato normal debemos importar SimpleDateFormat
        //Estandar para la fecha
        // dd = día
        // MM = més en número
        // MMM = més con nombre corto
        // MMMM = més en letra
        // yy = año, ultimo dos digits
        // yyyy = año
        // HH = hora
        // mm = minuto
        // ss = segundo
        // z = zona horaria
        SimpleDateFormat fecha2 = new SimpleDateFormat("dd");
        String diaStr = fecha2.format(fecha);
        System.out.println("diaStr = " + diaStr);

        //Imprimir día y mes con número

        fecha2 = new SimpleDateFormat("dd/MM");
        diaStr = fecha2.format(fecha);
        System.out.println("diaStr = " + diaStr);

        //Imprimir día y mes con nombre corto

        fecha2 = new SimpleDateFormat("dd MMM");
        diaStr = fecha2.format(fecha);
        System.out.println("diaStr = " + diaStr);

        //Imprimir día y mes con nombre largo

        fecha2 = new SimpleDateFormat("dd/MMMM");
        diaStr = fecha2.format(fecha);
        System.out.println("diaStr = " + diaStr);

        //Imprimir día y mes y año

        fecha2 = new SimpleDateFormat("dd/MMMM/yy");
        diaStr = fecha2.format(fecha);
        System.out.println("diaStr = " + diaStr);

    }
}
