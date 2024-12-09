import java_cup.runtime.*;

%%

%cup
%class scanner

FimDeLinha         = \r|\n|\r\n
CaractereEntrada   = [^\r\n]
EspacoBranco       = {FimDeLinha} | [ \t\f]


Inteiro            = [0-9]+
Float              = {Inteiro}"."{Inteiro}?
Tipo               = "float" | "int" | "bool"
Identificador      = [a-zA-Z_][a-zA-Z0-9_]*


%%

"if"                { return new Symbol(sym.SE, yytext()); }
"else"              { return new Symbol(sym.SENAO, yytext()); }
"while"             { return new Symbol(sym.ENQUANTO, yytext()); }
"for"               { return new Symbol(sym.PARA, yytext()); }
"return"            { return new Symbol(sym.RETORNO, yytext()); }

{Tipo}              { return new Symbol(sym.TIPO, yytext()); }

{Identificador}     { return new Symbol(sym.IDENTIFICADOR, yytext()); }

{Inteiro}           { return new Symbol(sym.INTEIRO, yytext()); }
{Float}             { return new Symbol(sym.PONTO_FLUTUANTE, yytext()); }

"+"                 { return new Symbol(sym.MAIS, yytext()); }
"-"                 { return new Symbol(sym.MENOS, yytext()); }
"*"                 { return new Symbol(sym.MULTIPLICACAO, yytext()); }
"/"                 { return new Symbol(sym.DIVISAO, yytext()); }

"<"                 { return new Symbol(sym.MENOR, yytext()); }
">"                 { return new Symbol(sym.MAIOR, yytext()); }
"<="                { return new Symbol(sym.MENOR_IGUAL, yytext()); }
">="                { return new Symbol(sym.MAIOR_IGUAL, yytext()); }

"="                 { return new Symbol(sym.ATRIBUICAO, yytext()); }

"=="                { return new Symbol(sym.IGUALDADE, yytext()); }
"!="                { return new Symbol(sym.DIFERENTE, yytext()); }

"!"                 { return new Symbol(sym.NEGACAO, yytext()); }

"("                 { return new Symbol(sym.ABRE_PARENTESE, yytext()); }
")"                 { return new Symbol(sym.FECHA_PARENTESE, yytext()); }
";"                 { return new Symbol(sym.PONTO_VIRGULA, yytext()); }
","                 { return new Symbol(sym.VIRGULA, yytext()); }
"{"                 { return new Symbol(sym.ABRE_CHAVE, yytext()); }
"}"                 { return new Symbol(sym.FECHA_CHAVE, yytext()); }


{EspacoBranco}      { /* Ignorar espaços em branco */ }

[^]                 { System.err.println("TOKEN NAO ESPECIFICO PARA ISSO: " + yytext()); }