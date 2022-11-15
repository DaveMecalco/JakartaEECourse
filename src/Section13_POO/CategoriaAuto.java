package Section13_POO;

public enum CategoriaAuto {
    SEDAN("Sedan", "Auto mediano", 4),
    NISAN("Station", "Auto grande", 4),
    MAZDA("Mazda 3", "Auto mediano", 4),
    AUDI("A3", "Auto mediano", 4),
    PICKUP("Pickup", "Auto grande", 2),
    DEPORTIVO("Deportivo", "Auto mediano", 2),
    CONVERTIBLE("Convetible", "Auto mediano", 4);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    CategoriaAuto(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
