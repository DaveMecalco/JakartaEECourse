package com.DavidMecalco.Section6_ValorReferencia;

class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){

        this.nombre = nuevoNombre;

    }

    public String leerNombre(){
        return this.nombre;
    }

}

public class PasaPorReferenciaDos {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");


        System.out.println("iniciamos el método maín");

        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de invocar al método test: " );

        System.out.println("Después de invocar al método test: " );

        test(persona);
        //Se pasa el valor de la variable y no el objeto (referencia)

        System.out.println("persona = " + persona.leerNombre());
        //Los variabales son inmutbales, retorna una nueva instancia
        System.out.println("finaliza el método main con los datos modificados");
    }

    //Implemetación de un metodo

    public static void test(Persona nomPersona){
        System.out.println("iniciamos el método test");
       nomPersona.modificarNombre("Pepé");
    }
}
