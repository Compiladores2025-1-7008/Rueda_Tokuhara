/**
 * Escáner que detecta el lenguaje C_1
*/

package main.jflex;

import main.java.ClaseLexica;
import main.java.Token;

%%

%{

public Token actual;

%}

%public
%class Lexer
%standalone
%unicode

letra=[a-zA-Z]
numero=[0-9|.|e]
palabra={letra}+
espacio=[ \t\n]
pyc=(";")
coma=(",")
int=(int)
float=(float)
if=(if)
else=(else)
while=(while)
lpar=("(")
rpar=(")")
id=({palabra}|_){1}({palabra}|_|{numero}){0,31}

%%

//Antes no hacia nada con espacios, ahora los imprime en pantalla
{espacio} {}
{numero}+ {Token token = new Token(ClaseLexica.NUMERO,yytext()); System.out.println(token.toString());}
{int} {Token token = new Token(ClaseLexica.INT,yytext()); System.out.println(token.toString());}
{float} {Token token = new Token(ClaseLexica.FLOAT,yytext()); System.out.println(token.toString());}
{if} {Token token = new Token(ClaseLexica.IF,yytext()); System.out.println(token.toString());}
{else} {Token token = new Token(ClaseLexica.ELSE,yytext()); System.out.println(token.toString());}
{while} {Token token = new Token(ClaseLexica.WHILE,yytext()); System.out.println(token.toString());}
{lpar} {Token token = new Token(ClaseLexica.LPAR,yytext()); System.out.println(token.toString());}
{rpar} {Token token = new Token(ClaseLexica.RPAR,yytext()); System.out.println(token.toString());}
{pyc} {Token token = new Token(ClaseLexica.PYC,yytext()); System.out.println(token.toString());}
{coma} {Token token = new Token(ClaseLexica.COMA,yytext()); System.out.println(token.toString());}
{id} {Token token = new Token(ClaseLexica.ID,yytext()); System.out.println(token.toString());}
