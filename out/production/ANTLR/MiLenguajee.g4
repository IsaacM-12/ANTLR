grammar MiLenguajee;

programa       : declaraciones cuerpo EOF;

declaraciones  : declaracion declaraciones | /* epsilon */ ;

declaracion    : tipo IDENTIFICADOR ';' ;

tipo           : 'entero' | 'caracter' | 'booleano' ;

cuerpo         : 'inicio' sentencias 'fin' ;

sentencias     : (sentencia)* ;

sentencia      : asignacion
               | control
               | llamado
               ;

asignacion     : IDENTIFICADOR '=' expresion ';' ;

expresion      : expresion '+' termino
               | expresion '-' termino
               | termino
               ;

termino        : termino '*' factor
               | termino '/' factor
               | factor
               ;

factor         : '(' expresion ')'
               | IDENTIFICADOR
               | NUMERO
               | CARACTER
               ;

control        : 'si' condicion 'entonces' sentencias 'fin_si'
               | 'si' condicion 'entonces' sentencias 'sino' sentencias 'fin_si'
               ;

condicion      : expresion '<' expresion
               | expresion '>' expresion
               | expresion '==' expresion
               | 'verdadero'
               | 'falso'
               ;

llamado        : 'llamar' IDENTIFICADOR ';' ;

procedimiento  : 'procedimiento' IDENTIFICADOR '()' cuerpo ;

funcion        : tipo 'funcion' IDENTIFICADOR '()' cuerpo ;

// Lexical rules

IDENTIFICADOR  : [a-zA-Z] [a-zA-Z0-9]* ;

NUMERO         : [0-9]+ ;

VERDADERO : 'verdadero';

FALSO : 'falso';

CARACTER : '\'' . '\'' ;

ESPACIO        : [ \t\r\n]+ -> skip ;

