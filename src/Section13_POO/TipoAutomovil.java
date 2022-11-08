package Section13_POO;

class TipoAutomovil {

    String marca;
    String color;
    String fabricante;
    double cilindros;
    int capacidadTanque = 40;

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
