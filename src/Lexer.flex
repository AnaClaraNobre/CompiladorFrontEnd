%%

%standalone
%class scanner

Espacos          = [ \t\f]+
QuebraDeLinha    = \r|\n|\r\n
Identificador    = [a-zA-Z_][a-zA-Z0-9_]*
NumeroInteiro    = [0-9]+
NumeroFloat      = {NumeroInteiro}"."{NumeroInteiro}?

%%

"if"             { System.out.println("IF:        " + yytext()); }
"else"           { System.out.println("ELSE:      " + yytext()); }
"while"          { System.out.println("WHILE:     " + yytext()); }
"for"            { System.out.println("FOR:       " + yytext()); }
"return"         { System.out.println("RETURN:    " + yytext()); }

"int"            { System.out.println("TIPO:      " + yytext()); }
"float"          { System.out.println("TIPO:      " + yytext()); }

{Identificador}  { System.out.println("IDENTIFICADOR: " + yytext()); }
{NumeroFloat}    { System.out.println("FLOAT:    " + yytext()); }
{NumeroInteiro}  { System.out.println("INTEIRO:  " + yytext()); }

"+"              { System.out.println("MAIS:      " + yytext()); }
"-"              { System.out.println("MENOS:     " + yytext()); }
"*"              { System.out.println("VEZES:     " + yytext()); }
"/"              { System.out.println("DIVIDIDO:  " + yytext()); }

"<"              { System.out.println("MENOR:     " + yytext()); }
">"              { System.out.println("MAIOR:     " + yytext()); }
"<="             { System.out.println("MENOR_IGUAL: " + yytext()); }
">="             { System.out.println("MAIOR_IGUAL: " + yytext()); }

"="              { System.out.println("ATRIB:     " + yytext()); }
"=="             { System.out.println("IGUAL:     " + yytext()); }
"!="             { System.out.println("DIFERENTE: " + yytext()); }

"("              { System.out.println("ABREPARENTESE: " + yytext()); }
")"              { System.out.println("FECHAPARENTESE: " + yytext()); }
"{"              { System.out.println("ABRECHAVE: " + yytext()); }
"}"              { System.out.println("FECHACHAVE: " + yytext()); }
";"              { System.out.println("PONTOEVIRGULA: " + yytext()); }

{Espacos}        { /* Ignorar */ }
{QuebraDeLinha}  { /* Ignorar */ }

[^]              { System.out.println("TOKEN NÃO ESPECÍFICO PARA ISSO: " + yytext()); }
