package Section13_POO;

public class Automovil {
    public static void main(String[] args) {

        //Creamos el objeto de la clase tipoAutomovil de la clase TipoAutomovil
        TipoAutomovil mazda = new TipoAutomovil();

        //Para traer los atributos de otra clase necesitamos llamar a la instancia, seguido de un punto y su atributo
        mazda.asignarMarca("Mazda3");
        mazda.asignarColor("Gris");
        mazda.fabricante = "Mazada";
        mazda.cilindros = 2.0;

        //Podemos hacer varios objetos apartir de la clase que estamos instanciando
        TipoAutomovil audi = new TipoAutomovil();

        //Igual podemos traer sus atributos y modificar sus valores para este objeto
        audi.asignarMarca("A3");
        audi.asignarColor("Azul");
        audi.fabricante = "Audi";
        audi.cilindros = 4.0;

        //Podemos imprimir en pantalla los valores del objeto
        System.out.println("Para Audi: ");
        System.out.println("audi.fabricante = " + audi.fabricante);
        System.out.println("audi.cilindros = " + audi.cilindros);

        //Para llamar al método de otra clase, necesitamos le objeto instanciado seguido de un punto y después el método
        System.out.println(audi.leerMarca());
        System.out.println(mazda.leerColor());
        System.out.println(audi.detalle());
        System.out.println(mazda.leerMarca());
        System.out.println(mazda.leerColor());
        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerar(300));

        //Método calcularConsumo
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 0.75f));

        //Sobrecarga del método calcularConsumo
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 75));

    }
}
