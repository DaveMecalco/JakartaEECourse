package Section2;

public class TestRendimiento {
    public static void main(String[] args) {
        //Para realizar pruebas de rendimiento con los concat, debemos medir el procesamiento en tiempo (mls)

        //Declaramos los String para realizar un loop
        String a = "a";
        String b = "b";
        String c = a;

        //Declaramos un StringBuilder para la 3er forma de concatenar strings
        StringBuilder sb = new StringBuilder(a);

        //Para medir el tiempo debemos utilizar la clase System y el método currentTimeMillis para medir el tiempo de procesamiento con milisegundos
        long tiempoInicio = System.currentTimeMillis();



        for (int i =0; i < 500; i++){
            //Tiempo de Procesamiento para el método concact es de: 2 milisegundos
            //c = c.concat(a).concat(b).concat("\n");

            //Tiempo de Procesamiento para el operador + es de: 17 milisegundos
            //c += a + b + "\n";

            //Tiempo de Procesamiento pata el constructor StringBuilder es de: 0 milisegundos
            sb.append(a);
            sb.append(b);
            sb.append("\n");



        }

        long tiempoFin = System.currentTimeMillis();
        long tiempoResultado = tiempoFin - tiempoInicio;

        //Imprimimos los resultados
        //Tiempo
        System.out.println("Tiempo de Procesamiento: " + tiempoResultado + " milisegundos");
        //Bucle
        System.out.println("c = " + c);

        //Imprimir el StringBuilder
        System.out.println("sb = " + sb.toString());

        //Conclusión:
        //StringBuilder es más eficiente para concatenar grandes cantidades de Strings
        //Concat es más eficiente sirve para concatenar pequeñas cantidades de Strings
        //+ es un intermedio, es menos eficiente para concatenar pequeñas cantidades de String en comparación de un concat
        //+ es un intermedio, es más eficiente para concatenar grandes cantidades de String en comparación de un concat
        //+ es un intermedio, es menos eficiente para concatenar grandes cantidades de String en comparación de un StringBuilder




    }
}
