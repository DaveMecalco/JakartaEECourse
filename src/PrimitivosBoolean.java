public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datologico = true;
        System.out.println("datologico = " + datologico);

        //Boolean de Referencia
        Boolean datologico2 = true;
        //Se crea una instancia de forma automática cuando son de refenrecia
        System.out.println("datologico2 = " + datologico2);

        //Boolean de asignación
        boolean datologico3 = Boolean.FALSE.booleanValue();
        System.out.println("datologico3 = " + datologico3);

    }
}
