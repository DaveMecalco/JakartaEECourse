package com.DavidMecalco.Section10_Terminal;

public class EjemploTerminal {
    public static void main(String[] args) {

        //Para compilar y ejecutar mediante la linea de comandos debemos utilizar javac para generar el archivo .class (Bytecode)

        if(args.length == 0){
            //El exit -1 es un error de estado
            //El exit 1 es que se ha compilado bien y ejecutado
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos nro " + i + " : " + args[i]);
        }

        //Después de ejecutar el comando javac (Java compiler) debemos utilizar java y el nombre del archivo

        //Para pasar parámetros para la ejecución, debemos realizar edicion de parameremtros en IDE

    }
}
