package Section13_POO;

public enum Color {
    ROJO("Rojo"),
    AZUL("Azul"),
    AMARILLO("Amarillo"),
    VERDE("Verde"),
    GRIS("Gris");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
