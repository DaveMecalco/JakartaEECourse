package Section9_ClaseMath;

public class EjemploMetodoRandom {
    public static void main(String[] args) {

        //El método random devuelve un número aleatorio entre 0 y 1 en donde no se incluye el 0 y el 1
        double random = Math.random();
        double random2 = Math.random();
        System.out.println("random = " + random);

        //Para asignar un limite, hay que multiplicarlo

        random *= 7;
        System.out.println("random = " + random);

        //Para redondear un random
        random = Math.floor(random);
        System.out.println("random = " + random);


        //Ejemplo colores aleatorios
        String[] colores = {"blanco", "verde", "rojo", "azul", "morado", "negro", "amarillo", "cafe", "naranja"};
        random2 *= colores.length;
        random2 = Math.floor(random2);


        System.out.println("random2 = " + random2);
        System.out.println("El color elegito es: " +colores[(int) random2]);

    }
}
