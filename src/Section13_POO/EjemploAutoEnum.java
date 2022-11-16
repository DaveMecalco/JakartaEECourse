package Section13_POO;

public class EjemploAutoEnum {
    public static void main(String[] args) {

        TipoAutomovil automovil = new TipoAutomovil();

        automovil.setCategoria(CategoriaAuto.DEPORTIVO);
        CategoriaAuto tipoa = automovil.getCategoria();
        System.out.println(tipoa.getNombre());
        System.out.println(tipoa.getDescripcion());

        automovil.setCategoria(CategoriaAuto.MAZDA);
        CategoriaAuto tipob = automovil.getCategoria();

        //Iterar un enum con switch case


        switch (tipob){
            case DEPORTIVO :
                System.out.println("El auto es deportivo");
                break;
            case PICKUP:
                System.out.println("El auto es un pickup");
                break;
            case CONVERTIBLE:
                System.out.println("El auto es un convertible");
                break;
            case SEDAN:
                System.out.println("El auto es un sedan");
                break;
            case NISAN:
                System.out.println("El auto es un nissan");
                break;
            case MAZDA:
                System.out.println("El auto es mazda 3");
            case AUDI:
                break;
            default:
                System.out.println("No se encuentra el automobile seleccionado");
        }

        //Iterar un enum con un foreach
        CategoriaAuto[] catAut = CategoriaAuto.values();
        for (CategoriaAuto tipo1: catAut){
            System.out.print(tipo1 + " => " + tipo1.name() + " " +
                    tipo1.getNombre() + " " +
                    tipo1.getDescripcion() + " " +
                    tipo1.getNumeroPuertas());

            System.out.println();
        }


    }
}
