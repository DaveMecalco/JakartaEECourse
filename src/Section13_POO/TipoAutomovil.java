package Section13_POO;

class TipoAutomovil {

    //Para quitar la visibilidad de un atributo lo modificamos con la palabra private
    private String marca;
    private String color;
    String fabricante;
    double cilindros;
    int capacidadTanque = 40;


    //Para leer un atributo protegido, debemos emplear dos metedos el get y set
    //get para leer
    public String getMarca(){
        return this.marca;
    }

    public String getColor(){
        return this.color;
    }

    //set para modificar
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setColor(String color){
        this.color = color;
    }

    //Para agregar métodos
    //Necesitamos un modificador de acceso public, static, private, final, default
    public String detalle(){

        //String Builder es para crear un objeto de tipo String

        //Para acceder a los propios atributos de clase utilizamos this

        //La palabra return nos permite reportar objetos o valore primitivos de la clase
        return "\n" + this.fabricante +
                "\n" + this.cilindros;
    }


    //Método con atributos
    public String acelerar(int rpm){
        return "El auto " + this.marca + " de " + this.cilindros + " cilindros " + " esta acelerando a " + rpm + " rpm";
    }

    public float calcularConsumo(int km, float porcetanjeGasolina){
        return km/(this.capacidadTanque * porcetanjeGasolina);
    }

    //Sobrecarga de métodos es cuando tenemos el mismo método pero con diferentes parametros
    public float calcularConsumo(int km, int porcetanjeGasolina){
        return km/(this.capacidadTanque * (porcetanjeGasolina / 100f));
    }

}
