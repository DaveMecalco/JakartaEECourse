package Section13_POO;

class TipoAutomovil {

    //Para quitar la visibilidad de un atributo lo modificamos con la palabra prívate
    private String marca;
    private String color;
    String fabricante;
    double cilindros;
    int capacidadTanque = 40;

    //Para implementar con constructor explícito
    public TipoAutomovil(String marca, String color){
        this.marca = marca;
        this.color = color;
    }

    public TipoAutomovil(){

    }

    public TipoAutomovil(String marca, String color, String fabricante){
        //Para hacer referencia a un constructor se utiliza this(parametros del constructor)
        this(marca, color);
        this.fabricante = fabricante;
    }
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getCilindros() {
        return cilindros;
    }

    public void setCilindros(double cilindros) {
        this.cilindros = cilindros;
    }

    //Para agregar métodos
    //Necesitamos un modificador de acceso public, static, private, final, default
    public String detalle(){

        //String Builder es para crear un objeto de tipo String

        //Para acceder a los propios atributos de clase utilizamos this

        //La palabra return nos permite reportar objetos o valores primitivos de la clase
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


    //Polimorfismo de objetos

    //Override es una anotación que indica que se esta sobreescribiendo un método en tiempo de ejecución, sirve para documentar
    @Override
    public boolean equals(Object obj) {

        //Realizar una excepción para comprar dos objetos distintos
        if (!(obj instanceof TipoAutomovil)){
            return false;
        }

        //Realizar un cast objeto
        TipoAutomovil a = (TipoAutomovil) obj;

        return (this.marca.equals(a.getMarca()) && this.color.equals(a.getColor()));
    }
}
