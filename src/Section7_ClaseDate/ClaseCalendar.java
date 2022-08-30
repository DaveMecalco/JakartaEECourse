package Section7_ClaseDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {
    public static void main(String[] args) {

        //Calendar es una clase abstracta por lo que no necesitamos invocar al constructor, sino que debemos invocar a su instancia getInstance, ya que provienen
        //como el método Data, del mismo paquete
        Calendar calendar = Calendar.getInstance();

        //Para una fecha en específico es con el método get

        //Primera forma
        //calendar.set(2020, 0, 25, 19, 50, 23);

        //Segunda Forma
        //Las constantes son estaticas y en mayúsculas
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, calendar.JANUARY);
        calendar.set(calendar.DAY_OF_MONTH, 31);

        calendar.set(calendar.HOUR_OF_DAY, 15);
        calendar.set(calendar.MINUTE, 30);

        //Para obtener la fecha
        //Demos inicializar con el método Date y después poner su atributo getTime()
        Date fecha = calendar.getTime();
        System.out.println("fecha = " + fecha);

        //Formatear la fecha se hace con SimpleDateFormat

        SimpleDateFormat formato = new SimpleDateFormat("yyyy - MMMM - dd - HH:mm:ss");
        String fechaFromato = formato.format(fecha);

        System.out.println("fechaFromato = " + fechaFromato);
    }
}
