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

        //Si definimos una varibale con Object en java, nos permite comparar instancias con instance of con cualquier tipo de Primitivo

        Object var1 = "Esta es una variable con Object";
        boolean b6 = var1 instanceof String;
        System.out.println("b6 = " + b6);

        boolean b7 = var1 instanceof Integer;
        System.out.println("b7 = " + b7);

        boolean b8 = var1 instanceof Double;
        System.out.println("b8 = " + b8);

        boolean b9 = var1 instanceof Float;
        System.out.println("b9 = " + b9);

        //Para realziar una instancia de Integer
        Integer num2 = Integer.valueOf(9);

        boolean b10 = num2 instanceof Integer;
        System.out.println("b10 = " + b10);
        
        Double num3 = Double.valueOf(5.6);
        
        boolean b11 = num3 instanceof Double;
        System.out.println("b11 = " + b11);


        
    }
}
