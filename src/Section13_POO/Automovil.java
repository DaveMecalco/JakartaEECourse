package Section13_POO;

import java.util.Date;

public class Automovil {
    public static void main(String[] args) {

        //Creamos el objeto de la clase tipoAutomóvil de la clase TipoAutomóvil
        TipoAutomovil mazda = new TipoAutomovil("Mazada3", "Gris");

        Date fecha = new Date();

        //Para traer los atributos de otra clase necesitamos llamar a la instancia, seguido de un punto y su atributo
        mazda.setFabricante("Mazda");
        mazda.setCilindros(2.0);

        //Podemos hacer varios objetos a partir de la clase que estamos instancia
        TipoAutomovil audi = new TipoAutomovil("A3", "Azul");

        TipoAutomovil audi2 = new TipoAutomovil("A3", "Azul");

        //Implementación de equals
        System.out.println(audi == audi2);
        //Equals para comparar objetos y su referencia en memoria
        System.out.println(audi.equals(audi2));

        //Comparación de dos objetos distintos
        System.out.println(audi.equals(fecha));

        //Método toString() para objetos
        //Regresa la clase seguida de un @ y el identificador único
        System.out.println(audi.toString());


        //Igual podemos traer sus atributos y modificar sus valores para este objeto
        audi.setFabricante("Audi");
        audi.setCilindros(2.5);


        TipoAutomovil nisan = new TipoAutomovil();
        nisan.setFabricante("Nisan");
        nisan.setCilindros(2.0);
        nisan.setColor("Rojo");
        nisan.setMarca("Versa 2022");


        //Podemos imprimir en pantalla los valores del objeto
        System.out.println("Para Audi: ");
        System.out.println("audi.fabricante = " + audi.fabricante);
        System.out.println("audi.cilindros = " + audi.cilindros);

        //Para llamar al método de otra clase, necesitamos le objeto instance seguido de un punto y después el método
        System.out.println(audi.getColor());
        System.out.println(mazda.getColor());
        System.out.println(audi.detalle());
        System.out.println(mazda.getMarca());
        System.out.println(mazda.getMarca());
        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerar(300));

        //Método calcularConsumo
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 0.75f));

        //Sobrecarga del método calcularConsumo
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 75));

        //Para nisan utilizando la sobrecarga de constructores
        System.out.println(nisan.getMarca());
        System.out.println(nisan.getFabricante());
        System.out.println(nisan.getColor());
        System.out.println(nisan.getCilindros());

    }
}
