package Section13_POO;

public class Automovil {
    public static void main(String[] args) {

        //Creamos el objeto de la clase tipoAutomovil de la clase TipoAutomovil
        TipoAutomovil mazda = new TipoAutomovil();

        //Para traer los atributos de otra clase necesitamos llamar a la instancia, seguido de un punto y su atributo
        mazda.marca = "Mazda 3";
        mazda.color = "Gris";
        mazda.fabricante = "Mazada";
        mazda.cilindros = 2.0;

        //Podemos hacer varios objetos apartir de la clase que estamos instanciando
        TipoAutomovil audi = new TipoAutomovil();

        //Igual podemos traer sus atributos y modificar sus valores para este objeto
        audi.marca = "A3";
        audi.color = "Negro";
        audi.fabricante = "Audi";
        audi.cilindros = 4.0;

        //Podemos imprimir en pantalla los valores del objeto
        System.out.println("Para Audi: ");
        System.out.println("audi.marca = " + audi.marca);
        System.out.println("audi.color = " + audi.color);
        System.out.println("audi.fabricante = " + audi.fabricante);
        System.out.println("audi.cilindros = " + audi.cilindros);

        //Para llamar al método de otra clase, necesitamos le objeto instanciado seguido de un punto y después el método
        System.out.println(audi.detalle());
        System.out.println(mazda.detalle());

    }
}
