package Section7_ClaseDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringParseDate {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


        System.out.println("Ingrese un fecha con el formato: yyyy-mm-dds");

        //Para hacer el parce de un string debemos darle un formato y después utilizgit ar un try
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }



    }
}
