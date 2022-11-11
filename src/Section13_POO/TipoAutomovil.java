package Section13_POO;

class TipoAutomovil {

    //Creación de un identificador cuando se cree una instancia
    private int id;

    //Para quitar la visibilidad de un atributo lo modificamos con la palabra prívate
    private String marca;
    private String color;
    String fabricante;
    double cilindros;
    int capacidadTanque = 40;

    private static int ultimoId;


    //Atributos estáticos
    static String colorMarca = "Naranja";

    //Atributo privado y static, se tiene que realizar mediante get y set
    private static String colorMarca2 = "Verde";

    //Para implementar con constructor explícito
    public TipoAutomovil(String marca, String color){
        this();
        this.marca = marca;
        this.color = color;
    }

    public TipoAutomovil(){
        this.id = ++ultimoId;
    }

    public TipoAutomovil(String marca, String color, String fabricante){
        //Para hacer referencia a un constructor se utiliza this(parameters del constructor)
        this(marca, color);
        this.fabricante = fabricante;
    }
    //Para leer un atributo protegido, debemos emplear dos métodos el get y set
    //get para leer


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    //Los métodos static para las variables privadas deben ser publicas
    public static String getColorMarca2(){ return colorMarca2; }

    //El método set para las variables prívate deben ser void y public
    //Debemos referenciar la clase para realizar el set
    public static void setColorMarca2(java.lang.String colorMarca2) { TipoAutomovil.colorMarca2 = colorMarca2;}

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

    //Sobrecarga de métodos es cuando tenemos el mismo método pero con diferentes parámetros
    public float calcularConsumo(int km, int porcetanjeGasolina){
        return km/(this.capacidadTanque * (porcetanjeGasolina / 100f));
    }


    //Polimorfismo de objetos

    //Override es una anotación que indica que se esta sobreescribiendo un método en tiempo de ejecución, sirve para documentar
    @Override
    public boolean equals(Object obj) {

        //Para comparar el mismo objeto
        if (this == obj){
            return true;
        }

        //Realizar una excepción para comprar dos objetos distintos
        if (!(obj instanceof TipoAutomovil)){
            return false;
        }

        //Realizar un cast objeto
        TipoAutomovil a = (TipoAutomovil) obj;

        return (this.marca.equals(a.getMarca()) && this.color.equals(a.getColor()));
    }

    //
    @Override
    public String toString() {
        return "TipoAutomovil{" +
                "Id='" + id + '\'' +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", cilindros=" + cilindros +
                ", capacidadTanque=" + capacidadTanque +
                ", colorMarca=" + colorMarca +
                '}';
    }
}
