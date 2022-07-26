package Ejercicios_Curso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        /*
        * La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
        * Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
        * Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
        * Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
        * Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
        *
        * Por ejemplo, el resultado podría ser algo así:
        * La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
        * */

        //Inicializamos el constructor de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        //Damos la instrucción al usuario de la acción a realizar
        System.out.println("Ingrese el nombre de la factura o descripción de ella: ");
        //Recogemos la información puesta
        String detalleFactura = scanner.nextLine();
        //System.out.println("detalleFactura = " + detalleFactura);

        //Ingresamos el precio del producto bruto
        System.out.println("Ingrese el precio bruto del producto: ");
        //Globalizamos la variable precioBruto
        double precioBruto = 0;

        try {
            //Dentro de try debemos asignar la variable que deseamos manejar con errores
            precioBruto = scanner.nextDouble();
            //Catch es donde manejaremos el error y daremos solución a excepción
        }catch (InputMismatchException e){
            //NumberFormatException es el tipo de error que se maneja y es nombre de la excepción
            //Después mostramos un mensaje para manejar el error
            System.out.println("¡Error, debe ingresar un número entero o con decimales!");
            //Demos hacer una acción para volver a intentar manejar el error, esto es regresar al main
            main(args);
            //Después de regresar, para no caer en recursividad, debemos salir de este bucle
            System.exit(0);
        }

        //Calculamos el segundo precio con el impuesto dado por el 19%
        double precioImpuesto = precioBruto * 0.19;
        //Imprimimos el precioImpuesto para corroborar que este correcto
        //System.out.println("El precio del impuesto es de tu factura es de: " + precioImpuesto);

        //Calculamos el precioNeto = precioBruto - precioImpuesto
        double precioNeto = precioBruto + precioImpuesto;

        //Imprimimos el precioImpuesto para corroborar que este correcto
        //System.out.println("El precio neto es de: " + precioNeto);

        //Damos formato al mensajeResultado

        String mensajeFinal = "La factura " + detalleFactura + " tiene un total bruto de " + precioBruto;
        mensajeFinal += ", con un impuesto de " + precioImpuesto + " y el monto después de impuesto es de " + precioNeto;

        //Imprimimos el mensaje final con el formato dado
        System.out.println(mensajeFinal);

    }
}
