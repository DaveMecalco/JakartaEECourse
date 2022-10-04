package Section11_Arreglos;

public class EjemploArrayString {
    public static void main(String[] args) {

        //Al instance los arreglos String, su valor asignado por defecto será null

        String[] arregloStrin = new String[7];
        System.out.println("arregloStrin = " + arregloStrin[0]);
        System.out.println("arregloStrin = " + arregloStrin[1]);
        System.out.println("arregloStrin = " + arregloStrin[2]);
        System.out.println("arregloStrin = " + arregloStrin[3]);
        System.out.println("arregloStrin = " + arregloStrin[4]);

        //Asignar valores al array
        arregloStrin[0] = "Kingston Pendrive 64GB";
        arregloStrin[1] = "Samsung Galaxy";
        arregloStrin[2] = "Disco Duro SSD";
        arregloStrin[3] = "Asus Notebook";
        arregloStrin[4] = "Macbook air";
        arregloStrin[5] = "Amazon Alexa";
        arregloStrin[6] = "Bicicleta Oxford";


    }
}
