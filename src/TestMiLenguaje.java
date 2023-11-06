import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import mycompiler.*;

public class TestMiLenguaje {
    /*
    public static void main(String[] args) throws Exception {
        // Verifica que se ha proporcionado un archivo de entrada.
        if (args.length != 1) {
            System.err.println("Uso: java TestMiLenguaje <archivo de entrada>");
            System.exit(1);
        }

        // Crea un input stream de ANTLR para procesar el archivo de entrada.
        CharStream input = CharStreams.fromFileName(args[0]);

        // Crea un lexer que procesará la entrada.
        MiLenguajeLexer lexer = new MiLenguajeLexer(input);

        // Crea un buffer de tokens provenientes del lexer.
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crea un parser que procesará los tokens.
        MiLenguajeParser parser = new MiLenguajeParser(tokens);

        // Comienza el análisis en la regla inicial 'programa'.
        // Reemplaza 'programa' con la regla de inicio real de tu gramática.
        ParseTree tree = parser.programa();

        // Puedes imprimir el árbol en formato LISP para depuración si lo deseas
        System.out.println(tree.toStringTree(parser));

        // Si quieres caminar por el árbol, puedes usar un ParseTreeWalker y un listener
        // Por ejemplo:
        // ParseTreeWalker walker = new ParseTreeWalker();
        // MiLenguajeBaseListener listener = new MiLenguajeBaseListener();
        // walker.walk(listener, tree);
    }*/
}
