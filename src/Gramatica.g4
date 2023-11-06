grammar Gramatica;

program: statement+;

statement: variableDeclaration;

variableDeclaration: type ID ('=' expression)? ';';

type: 'int' | 'double' | 'String';

expression: INT | DOUBLE | STRING;

ID: [a-zA-Z]+;
INT: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
STRING: '"' ~["]* '"';
WS: [ \t\r\n]+ -> skip;
