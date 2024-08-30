<p  align="center">
  <img  width="200"  src="https://www.fciencias.unam.mx/sites/default/files/logoFC_2.png"  alt="">  <br>Compiladores  2025-1 <br>
  Práctica 1: Analizadores léxicos con Lex (JFlex) <br> Profesora: Ariel Adara Ulises Mercado Martínez
</p>

## Análisis léxico con Flex
### Objetivo:
Que el alumno conozca y utilice los principios para generar analizadores léxicos utilizando Lex.

### Introducción
Lex es una herramienta para generar analizadores léxicos, que se deben describir mediante las expresiones regulares de los tokens que serán reconocidas por el analizador léxico (scanner o lexer). Originalmente fue desarrollado para el sistema operativo Unix, pero con la popularidad de Linux se creo una versión para este sistema llamada Flex.

#### Estructura de un archivo Lex
Un programa en LEX consta de tres secciones:
```
Sección de declaraciones
%%
Sección de expresiones regulares
%%
Sección de código de usuario (código en lenguaje C++)
```

#### Sección de declaraciones
* __Directivas de código.__ Se utilizan para incluir los archivos de biblioteca y definir las variables globales es la siguiente:
```lex
%{
  int contador;
%}
```
* __Macros o definiciones.__ Las macros son variables a las que se les asignar una expresión regular. P. ej. ```letra [a-zA-Z]```, la macro
se llama _letra_, separada por un espacio de la definición de su expresión regular.
* __Directivas de Lex__. Las directivas u opciones de escáner le indican a Lex que realice tareas extras al momento de generar el analizador léxico.
    * ```%public``` Hace pública la clase que genera.
    * ```%class``` Le indica a JFlex qué nombre tendrá la clase generada.
    * ```%state``` o ```%xstate``` es para declarar estados léxicos.

#### Sección de expresiones regulares
* __Estructura__:
```<Expresión Regular>={<Acción Léxica>} ```
   * __Expresión Regular__: debe estar escrita con la sintaxis de Lex
   * __Acción Léxica__: se ejecuta cada vez que se encuentra una cadena que coincida con la expresión regular y es escrita
en lenguaje Java, encerrada por llaves.

#### Metacaracteres

| Caracter | Descripción |
|----------|-------------|
|c         |Cualquier carácter representado por c que no sea un operador|
|\c        |El carácter c literalmente|
|"S"       |La cadena s, literalmente|
|.         |Cualquier carácter excepto el salto de lı́nea|
|∧         |Inicio de línea|
|$         |Fin de lı́nea|
|[s]       |Cualquier carácter incluido dentro de la cadena s|
|[^s]      |Cualquier carácter que no esté dentro de s|
|\n        |Salto de lı́nea|
|*         |Cerradura de Kleene|
|+         |Cerradura positiva|
|\|        |Disyunción|
|?         |Cero o una instancia|
|{m, n}    |Entre m y n instancias de una expresión que le antecede



#### Sección de código de usuario
En esta sección se escriben las funciones auxiliares para realizar el análisis léxico, por lo general es donde se agrega a
main.

## Primer programa en Flex++

### Instalación de flex
* Para Unix:

Obtenemos el archivo de instalación: 
```bash
wget https://github.com/jflex-de/jflex/releases/download/v1.9.1/jflex-1.9.1.tar.gz
```
Descomprimimos en algún directorio pertinente:
```bash
tar -C /usr/share -xvzf jflex-1.9.1.tar.gz
```

Creamos un enlace simbólico a los ejecutables del usuario para poder ejecutar desde cualquier directorio
```bash
ln -s /usr/share/jflex-1.9.1/bin/jflex /usr/bin/jflex
```

### Para comprobar que se ha instalado correctamente:
```jflex −−version```
### Primer programa en lex


```Java
/**
 * Escáner que detecta números y palabras
*/

%%

%public
%class Lexer
%standalone

digito=[0-9]
letra=[a-zA-Z]
palabra={letra}+
espacio=[ \t\n]

%%

{espacio} {/* La acción léxica puede ir vacía si queremos que el escáner ignore la regla*/}
{digito}+ { System.out.print("Encontré un número: "+yytext()+"\n"); }
{palabra} { System.out.print("Encontré una palabra: "+yytext()+"\n"); }
```

#### Pasos
a. Transcribir el código anterior a un archivo con extensión .flex dentro de la carpeta *src/__Primer programa en Lex__/* <br>
b. Compilar mediante la instrucción: ```jflex archivo.flex``` <br>
c. Comprobar se genero el archivo _Lexer.java_ <br>
d. Compilar mediante: ```javac Lexer.java``` <br>
e. Crear un archivo de texto que será la entrada: ```echo "Hay 100 nubes en el cielo hoy" > input.txt``` <br>
f. Ejecutar mediante: ```java Lexer input.txt```

#### Ejercicios 
1. ¿Qué ocurre si en la primera sección se quitan las llaves al nombre de la macro letra? (0.5 pts)
   
   Ya no identifica las palabras completas, solo las letras pero como no tenemos nada definido para letras individuales en la parte de los print, solo pasa las letras una por una y las pone en pantalla.
   
   ![Paso 1](https://github.com/user-attachments/assets/ca766eef-b4fc-4bed-9587-21d1852dc465)


2. ¿Qué ocurre si en la segunda sección se quitan las llaves a las macros? (0.5 pts)
   
   Ya no reconoce ninguna palabra ni digitos y solo pasa el texto plano como lo tenemos en el .txt.
   
   ![Paso 2](https://github.com/user-attachments/assets/be1b3a92-0a7a-499f-809e-d16959c6e130)

3. ¿Cómo se escribe un comentario en flex? (0.5 pts)
   
   Con // para comentarios de una linea y con /* * */ para varias lineas.
   
4. ¿Qué se guarda en yytext? (0.5 pts)
   
   El caracter o conjunto de caracteres que el lexer acaba de analizar y lo busca en nuestras expresiones regulares.
   
5. ¿Qué pasa al ejecutar el programa e introducir cadenas de caracteres y de dígitos sin especios en el archivo de entrada? (0.5 pts)

   Toma como palabra o digito toda la cadena hasta que se encuentra con algo que no pertenece a esa expresion regular, entonces toma como palabra a "Hay", luego como digito a "100" y todo lo que resta como 1 sola  palabra porque no hay espacio que la separe. 
  ![Paso 5](https://github.com/user-attachments/assets/16bea039-16b9-4703-aeb3-25fa2b3fba87)
   
7. ¿Qué ocurre si introducimos caracteres como "\*" en el archivo de entrada? (0.5 pts)
    
   No los toma en cuenta porque no estan definidos en nuestras expresiones regulares, entonces solo las salta y no las imprime en pantalla.
   
8. Modificar al código anterior en un archivo nuevo, de tal manera que reconozca lo siguiente: (2 pts)
    1. La expresión regular para los hexadecimales en lenguaje Java.
    2. 5 palabras reservadas del lenguaje Java.
    3. Los identificadores válidos del lenguaje Java, con longitud máxima de 32 caracteres (**Sugerencia**: use el operador {m,n}).
    4. Los espacios en blanco.
   ![codigo](https://github.com/user-attachments/assets/0f89da37-858e-421a-b8c5-57c19d1113d2)
  ![txt](https://github.com/user-attachments/assets/f383af7e-67af-44c9-9818-f22e6bd98955)
  ![Paso 7](https://github.com/user-attachments/assets/4a64c288-2328-4886-baa1-35bf5f341104)


