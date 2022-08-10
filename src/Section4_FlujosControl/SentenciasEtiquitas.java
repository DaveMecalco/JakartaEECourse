package Section4_FlujosControl;

public class SentenciasEtiquitas {
    public static void main(String[] args) {

        //Definimos el arreglo de Strings
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        //Para realizar saltos entre los bucles con etiquetas
        //Definimos etiquetas

        bucle:
        for (String dia: dias){
            int j = 0;
            while (j <= 8){
                if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo")){
                    System.out.println(dia.concat("- DESCANSO"));

                    //Como se invocan las etiquetas
                    continue bucle;
                }
                System.out.println(dia.concat("- Jornada laboral de " + j + " hrs."));
                j++;
            }
        }

    }
}
