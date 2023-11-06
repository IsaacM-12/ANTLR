grammar MiLenguaje;

// Reglas léxicas
ENTERO      : 'entero';
CARACTER    : 'caracter';
BOOLEANO    : 'booleano';
INICIO      : 'inicio';
FIN         : 'fin';
SI          : 'si';
ENTONCES    : 'entonces';
FIN_SI      : 'fin_si';
SINO        : 'sino';
LLAMAR      : 'llamar';
PROCEDIMIENTO : 'procedimiento';
FUNCION     : 'funcion';



// Operadores y símbolos especiales
MAS         : '+';
MENOS       : '-';
MUL         : '*';
DIV         : '/';
IGUAL       : '=';
MENOR       : '<';
MAYOR       : '>';
DOBLE_IGUAL : '==';
PARENTESIS_ABIERTO : '(';
PARENTESIS_CERRADO : ')';
PUNTO_Y_COMA: ';';

// Elementos del lenguaje
IDENTIFICADOR : [a-zA-Z][a-zA-Z0-9]*;
NUMERO        : [0-9]+;

// Palabras clave booleanas
VERDADERO    : 'verdadero';
FALSO        : 'falso';

// Espacios en blanco
WS           : [ \t\r\n]+ -> skip;

// Reglas sintácticas

// Regla principal del programa
programa       : declaraciones cuerpo ;

// Declaraciones y tipos
declaraciones  : declaracion declaraciones | ;
declaracion    : tipo IDENTIFICADOR PUNTO_Y_COMA ;
tipo           : ENTERO | CARACTER | BOOLEANO ;

// Cuerpo y sentencias del programa
cuerpo         : INICIO sentencias FIN ;
sentencias     : sentencia sentencias | ;

// Definiciones de sentencias
control        : SI condicion ENTONCES sentencias FIN_SI
                | SI condicion ENTONCES sentencias SINO sentencias FIN_SI
                ;

llamado        : LLAMAR IDENTIFICADOR ;

condicion      : expresion MENOR expresion
                | expresion MAYOR expresion
                | expresion DOBLE_IGUAL expresion
                | VERDADERO
                | FALSO
                ;

sentencia      : asignacion
                | control
                | llamado PUNTO_Y_COMA
                ;

asignacion     : IDENTIFICADOR IGUAL expresion PUNTO_Y_COMA ;

expresion      : expresion MAS termino
                | expresion MENOS termino
                | termino
                ;

termino        : termino MUL factor
                | termino DIV factor
                | factor
                ;

factor         : PARENTESIS_ABIERTO expresion PARENTESIS_CERRADO
                | IDENTIFICADOR
                | NUMERO
                ;