package Section3_OperadoresAritmeticos;

public class OperadorInstanceof {
    public static void main(String[] args) {
        //El operador instanceof nos permite validar las instancias de los objetos

        String texto = "Creando un objeto de la instancias String.. que tal";
        Integer numero = 7;

        boolean b1 = texto instanceof String;
        System.out.println("b1 = " + b1);
        
        boolean b2 = numero instanceof Integer;
        System.out.println("b2 = " + b2);

        boolean b3 = texto instanceof Object;
        System.out.println("b3 = " + b3);
        
        boolean b4 = numero instanceof Number;
        System.out.println("b4 = " + b4);

        boolean b5 = numero instanceof Object;
        System.out.println("b5 = " + b5);

        
    }
}
