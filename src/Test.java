import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import mycompiler.*;

import java.io.IOException;

public class Test {

    private static final String EXTENSION = "txt"; // Asumiendo que la extensión del archivo es .txt

    public static void main(String[] args) throws IOException {
        String program = args.length > 0 ? args[0] : "C:\\actualmenteU\\compiladores\\ANTLR\\ANTLR\\src\\MiProgramaFuente." + EXTENSION; // args[0] debería ser el primer argumento

        System.out.println("Interpreting file " + program);

        // Utiliza CharStreams en lugar de ANTLRFileStream
        MiLenguajeeLexer lexer = new MiLenguajeeLexer(CharStreams.fromFileName(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiLenguajeeParser parser = new MiLenguajeeParser(tokens);

        // Se asume que el símbolo inicial de tu gramática es 'programa'
        ParseTree tree = parser.programa(); // Reemplaza 'start' por el nombre de la regla inicial de tu gramática

        // Se asume que tienes un visitor llamado MiLenguajeCustomVisitor en el paquete mycompiler
        MiLenguajeeBaseVisitor visitor = new MiLenguajeeBaseVisitor();
        visitor.visit(tree);

        System.out.println("Interpretation finished");
    }

}

