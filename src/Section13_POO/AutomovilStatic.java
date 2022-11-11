package Section13_POO;

public class AutomovilStatic {
    public static void main(String[] args) {

        //Constructor de la clase TipoAutomovil
        TipoAutomovil automovil = new TipoAutomovil();

        //Para traer atributos estáticos
        TipoAutomovil.colorMarca = "Verde";

        //Se puede realizar mediante el objeto, pero no es recomendable
        // automovil.colorMarca = "Azul";

        System.out.println(automovil);

        //Para acceder a los métodos static
        TipoAutomovil.setColorMarca2("Guinda");
        System.out.println(TipoAutomovil.getColorMarca2());

    }
}
