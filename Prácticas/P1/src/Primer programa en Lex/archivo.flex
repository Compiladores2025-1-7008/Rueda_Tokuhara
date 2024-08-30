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
//Un hexadecimal seran una combinacion de 6 caracteres de 0-9, a-f o A-F.
hexadecimal=[0-9a-fA-F]{6}
// Si hay una de esas 5 palabras las tomara como reservadas
reservada=(public|private|class|main|static)
//
identificadores=({palabra}|_){1}({palabra}|_|{digito}){0,31}

%%

//Antes no hacia nada con espacios, ahora los imprime en pantalla
{espacio} { System.out.print("Encontré un espacio: "+yytext()+"\n"); }
{digito}+ { System.out.print("Encontré un número: "+yytext()+"\n"); }
{hexadecimal} { System.out.print("Encontré un hexadecimal: "+yytext()+"\n"); }
{reservada} { System.out.print("Encontré una palabra reservada: "+yytext()+"\n"); }
{palabra} { System.out.print("Encontré una palabra y tambien identificador valido para java: "+yytext()+"\n"); }
{identificadores} { System.out.print("Encontré un identificador valido para java: "+yytext()+"\n"); }

