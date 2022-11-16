package Section13_POO;

public class EjemploAutoEnum {
    public static void main(String[] args) {

        TipoAutomovil automovil = new TipoAutomovil();

        automovil.setCategoria(CategoriaAuto.DEPORTIVO);
        CategoriaAuto tipoa = automovil.getCategoria();
        System.out.println(tipoa.getNombre());
        System.out.println(tipoa.getDescripcion());

        //Iterar un enum con switch case


        switch (tipoa){
            case DEPORTIVO :
                System.out.println("El auto es deportivo");
                break;
            case PICKUP:
                System.out.println("El auto es un pickup");
                break;
            case CONVERTIBLE:
                System.out.println("El auto es un convertible");
                break;
            case MAZDA:
                System.out.println("El auto es mazda 3");
            default:
                System.out.println("No se encuentra el automobile seleccionado");
        }


    }
}
