package Section13_POO;

public class AutomovilStatic {
    public static void main(String[] args) {

        //Constructor de la clase TipoAutomovil
        TipoAutomovil automovil = new TipoAutomovil();
        TipoAutomovil automovil2 = new TipoAutomovil();
        TipoAutomovil automovil3 = new TipoAutomovil();
        TipoAutomovil automovil4 = new TipoAutomovil();

        //Para traer atributos estáticos
        TipoAutomovil.colorMarca = "Verde";

        //Se puede realizar mediante el objeto, pero no es recomendable
        // automovil.colorMarca = "Azul";

        //Para acceder a los métodos static
        TipoAutomovil.setColorMarca2("Azul");
        System.out.println(TipoAutomovil.getColorMarca2());

        //Imprimos el ID del objeto con los atributos estáticos
        System.out.println(automovil);
        System.out.println(automovil2);
        System.out.println(automovil3);
        System.out.println(automovil4);

        //Imprimir una variable final
        System.out.println(TipoAutomovil.VELOCIDAD_MAXIMA);

        //Imprimir los argumentos del enum
        System.out.println();


    }
}
