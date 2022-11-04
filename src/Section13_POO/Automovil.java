package Section13_POO;

public class Automovil {
    public static void main(String[] args) {

        //Creamos el objeto de la clase tipoAutomovil de la clase TipoAutomovil
        TipoAutomovil tipoAutomovil = new TipoAutomovil();

        //Para traer los atributos de otra clase necesitamos llamar a la instancia, seguido de un punto y su atributo
        tipoAutomovil.marca = "Mazda 3";
        tipoAutomovil.color = "Gris";
        tipoAutomovil.fabricante = "Mazada";
        tipoAutomovil.cilindros = 2.0;

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

        System.out.println("Para Mazada: ");
        System.out.println("tipoAutomovil.marca = " + tipoAutomovil.marca);
        System.out.println("tipoAutomovil.color = " + tipoAutomovil.color);
        System.out.println("tipoAutomovil.fabricante = " + tipoAutomovil.fabricante);
        System.out.println("tipoAutomovil.cilindros = " + tipoAutomovil.cilindros);





    }
}
