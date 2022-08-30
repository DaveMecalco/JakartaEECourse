package Section7_ClaseDate;

import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {
    public static void main(String[] args) {

        //Calendar es una clase abstracta por lo que no necesitamos invocar al constructor, sino que debemos invocar a su instancia getInstance, ya que provienen
        //como el método Data, del mismo paquete
        Calendar calendar = Calendar.getInstance();

        //Para una fecha en específico es con el método get

        calendar.set(2020, 0, 25, 19, 50, 23);

        //Para obtener la fecha
        //Demos inicializar con el método Date y después poner su atributo getTime()
        Date fecha = calendar.getTime();
        System.out.println("fecha = " + fecha);

    }
}
