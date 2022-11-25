package com.DavidMecalco.Section7_ClaseDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MetedoGetTime {

    public static void main(String[] args) {

        //Inicializamos el paquete Date

        Date fecha =  new Date();
        System.out.println(fecha);

        //Damos formato a la fecha con la el constructor SimpleDateFormat
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM");

        //Imprimimos el formato de fecha asignándola a una variable
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        int j = 0;
        for (int i = 0; i < 1000000000; i++){
            j += 1;
        }

        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();

        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);

    }

}
