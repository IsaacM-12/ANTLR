Crear analizador lexico y sintactico

java -jar ../lib/antlr/antlr-4.13.0-complete.jar -o mycompiler -visitor -listener -package mycompiler MiLenguaje.g4

Consola

Ejecutar desde src

javac -cp ../../lib/antlr/antlr-4.13.0-complete.jar TestMiLenguaje.java

java -cp ../../lib/antlr/antlr-4.13.0-complete.jar TestMiLenguaje MiProgramaFuente.txt