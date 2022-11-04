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
        StringBuilder sb =  new StringBuilder();

        //Para acceder a los propios atributos de clase utilizamos this
        sb.append("\n" + this.marca);
        sb.append("\n" + this.color);
        sb.append("\n" + this.fabricante);
        sb.append("\n" + this.cilindros);

        //La palabra return nos permite reportar objetos o valore primitivos de la clase
        return sb.toString();

    }

}
