# Curso de Java de Cero a Experto

    public static void main(String[] args) {  
	    System.out.println("Bienvenido al mundo de Java");
    }

> *Repositorio especifico de Java, creado para plasmar los conocimientos adquiridos en el curso Master Complete Java 2022

Para este curso utilizamos el editor IntelliJ IDEA Community Edition.

![Imagén de referencia](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/100px-IntelliJ_IDEA_Icon.svg.png)

Descargarlo [aquí](https://www.jetbrains.com/es-es/idea/)


## Definiciones y Conceptos

**¿Qué es una variable?**

Son los más importantes de un lenguaje, son las entidades entidades, contienen valores o datos.

Una declaración de una variable siempre contiene dos partes, el tipo de dato de la variable y su nombre:

    TipoDato nombreVaribale;

Reglas para definir una variable: 

 1. Por convención, los nombres de las variables empiezan con una letra minúscula.
 2. Debe ser un juego de caracteres comprendido en la codificación UNICODE.
 3. No puede ser el mismo que una palabra clave (reservadas del lenguaje Java).
 4. No debe tener el mismo nombre que otras variables cuyas declaraciones aparezcan en el mismo ámbito.
 5. Si una variable está compuesta de más de una palabra, como 'nombreDato', las palabras se ponen juntas y cada palabra después de la primera empieza con una letra mayúscula.
 6. Pueden comenzar por una letra, un guión bajo o un símbolo de dolar, siendo los siguientes caracteres letras o dígitos.

| Tipos de Variables Primitivas | Descripción | Tamaño en Memoria | Clase equivalente |
|--|--|--|--|
| boolean | Valor lógico | 1 bit | Boolean
| char | Carácter | 16 bits | Character
| byte | Entero muy pequeño | 8 bits | Byte
| short | Entero pequeño | 16 bits | Short
| int | Entero | 32 bits | Integer
| long | Entero Grande | 64 bits | Long 
| float | Número real precisión simple | 32 bits | Float
| double | Número real precisión doble | 64 bits | Double


## Strings

Los String son objetos de java, del tipo de referencia. Aunque también los String se pueden representar con una sintaxis especialmente cómoda.

El tipo String tiene una característica especial, permite crear objetos también en la literal entre comillas doble.

Métodos de la clase String:

 - método length para retornar el número de caracteres:
``` 
System.out.println("Número de caracteres  = " + nombre.length()); 
```
 - método toUpperCase para convertir los caracteres a mayúsculas:
```
System.out.println("Nombre en mayúsculas = " + nombre.toUpperCase());
```
 - método toLowerCase para convertir los caracteres en minúsculas:
```
 System.out.println("Nombre en minúsculas = " + nombre.toLowerCase());
 ```
 - método equals para comparar si es igual a una cadena de caracteres:
```
System.out.println("nombre.equals(\"David Mecalco Alejo\") = " + nombre.equals("David Mecalco Alejo"));
```
- método equalsIgnoreCase para comparar si es igual a una cadena de caracteres omitiendo mayúsculas y minúsculas:
```
System.out.println("nombre.equals(\"David Mecalco Alejo\") = " + nombre.equalsIgnoreCase("david mecalco alejo"));
```
- método compareTo que sirve para comparar los caracteres de manera lexicográfico y retorna un int en el orden que aparecen en la tabla UNICODE:
```
System.out.println("nombre.compareTo(\"David Mecalco Alejo\") = " + nombre.compareTo("David Mecalco Alejo"));
```
- método charAT retorna el caracter en la posición indicada en número:
```
System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
//Para obtener el ultimo caracter de forma dinámica sin importar el tipo de cadena
System.out.println("nombre.charAt(nombre.length() -1) = " + nombre.charAt(nombre.length() -1));
```
- método subString retorna el resto de la cadena desde de la posición indicada: 
```
System.out.println("nombre.substring(5) = " + nombre.substring(5));
//También puede tener segundo parametro separado por una coma (hasta)
System.out.println("nombre.substring(5,13) = " + nombre.substring(5,13));
```
- método replace() para remplazar caracteres, el caracter que queremos remplazar (target), remplazo del caracter (replacement):
```
System.out.println("trabalengua.replace(\"a\",\".\") = " + trabalengua.replace("a","."));
```
- método indexOf() para devolver la posición exacta en entero del caracter deseado, solamente a primera coincidencia:
```
System.out.println("trabalengua.indexOf('g') = " + trabalengua.indexOf('g'));
```
- método indexOf() para devolver la posición exacta en entero del caracter deseado, solamente a ultima coincidencia:
```
System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
```
- método contains() muestra el valor booleano si se encuentra el caracter en la secuencia o no, su argumento es con comillas dobles "":
```
System.out.println("trabalengua.contains(\"b\") = " + trabalengua.contains("b"));
```
- método starWith() compara si empieza con y una secuencia de caracteres, retorna un booleano:
```
System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));
```
- método endWith(), lo contrario al método startsWith():
```
System.out.println("trabalengua.endsWith(\"lenguas\") = " + trabalengua.endsWith("lenguas"));
```
- método trim() elimina los espacios en blanco de ambos lados, izquierda y derecha:
```
System.out.println("  trabalenguas  ");
System.out.println("  trabalenguas  ".trim());
```


## Introducción a Operadores.

Java proporciona muchos tipos de operadores que se pueden usar según la necesidad. Se clasifican según la funcionalidad que brindan.

Sirven para realizar cálculos matemáticos, comparar valores, para unir identificadores y literales, para formar expresiones lógica, toma de decisión etc.

Tipos de Operadores:
 - Aritméticos.
 - Relacionales.
 - Lógicos.
 - Asignación.

### Operadores Aritmeticos.

Se utilizan para realizar operaciones aritméticas simples en tipos de datos primitivos

| Descripción | Símbolo |
|--|--|
| Multiplicación | * |
| División | / |
| Modulo | % |
| Suma | + |
| Resta | - |
| Incremento | ++ |
| Decremento | -- |
| Menos Unario | - |

### Operadores Relacionales

Se utilizan para comprobar relaciones de igualdad, mayor que, menor que. Devuelven un resultado booleano después de la comparación, true si la comparación fue exitosa y false en caso contrario.

Se usan ampliamente en las sentencias if/else, así como en bucles.


| Operador | Utilización |
|--|--|
| > | a > b |
| >= | a >= b |
| < | a < b |
| <= | a <= b |
| == | a == b |
| != | a != b |



## Operadores Lógicos


