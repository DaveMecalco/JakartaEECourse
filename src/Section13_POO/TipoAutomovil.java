package Section13_POO;

class TipoAutomovil {

    String marca;
    String color;
    String fabricante;
    double cilindros;

    //Para agregar métodos
    //Necesitamos un modificador de acceso public, static, private, final, default
    public String detalle(){

        //String Builder es para crear un objeto de tipo String

        //Para acceder a los propios atributos de clase utilizamos this

        //La palabra return nos permite reportar objetos o valore primitivos de la clase
        return "\n" + this.marca +
                "\n" + this.color +
                "\n" + this.fabricante +
                "\n" + this.cilindros;
    }


    //Método con atributos

}
