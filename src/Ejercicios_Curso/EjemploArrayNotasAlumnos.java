package Ejercicios_Curso;

import java.util.Scanner;

public class EjemploArrayNotasAlumnos {
    public static void main(String[] args) {

        //Definimos 3 array para las clases
        double[] claseMatematicas, claseHistoria, claseQuimica;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseQuimica = new double[7];

        //Clase Scanner para llenar los array
        Scanner s = new Scanner(System.in);

        //Llenamos cada array con la clase Scanner
        System.out.println("Ingresa 7 calificaciones para la clase de Matemáticas: ");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingresa 7 calificaciones para la clase de Historia: ");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingresa 7 calificaciones para la clase de Quimica: ");
        for (int i = 0; i < claseQuimica.length; i++){
            claseQuimica[i] = s.nextDouble();
        }

        //Para sacar la suma de cada materia
        double sumCalMatematicas = 0, sumCalHistoria = 0, sumCalQuimica =0;

        //For para guardar y sumar el array
        for (int i = 0; i < 7; i++){
            sumCalMatematicas += claseMatematicas[i];
            sumCalHistoria += claseHistoria[i];
            sumCalQuimica += claseQuimica[i];
        }

        //Calculamos le promedio
        double promClaseMatematicas = sumCalMatematicas / claseMatematicas.length;
        double promClaseHistoria = sumCalHistoria / claseHistoria.length;
        double promClaseQuimica = sumCalQuimica / claseQuimica.length;


        //Imprimimos el promedio de la clase
        System.out.println("El promedio para la clase de Matemáticas es: " + promClaseMatematicas);
        System.out.println("El promedio para la clase de Historia es: " + promClaseHistoria);
        System.out.println("El promedio para la clase de Quimica es: " + promClaseQuimica);

        //Calculamos el promedio del curso:
        double promCurso = (promClaseHistoria + promClaseQuimica +promClaseQuimica) / 3;

        //Imprimimos el promedio del curso
        System.out.println("El promedio del curso es: " + promCurso);

        //Para un unico índice en todas materias
        System.out.println("Ingrese el identificador del alumno (de 0 a 6): ");

        //Asignamos id para el alumno
        int idAlum = s.nextInt();

        //Calculamos el promedio con el id
        double promIdAlumnoCurso = (claseMatematicas[idAlum] + claseHistoria[idAlum]+ claseQuimica[idAlum]) / 3;

        //Imprimimos el promedio
        System.out.println("El promedio del alumno con ID:" + idAlum + " es: "+ promIdAlumnoCurso);



    }
}
