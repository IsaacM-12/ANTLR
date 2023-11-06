import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import mycompiler.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String code = "entero x;";
        //String code = "int x; int y;";
        //String code = "int x = 10; int y = 20;";
        //String code = "int x = 10; double y = 3.14; String name = \"John\";";
        //String code = "int       x     =   10;     double  y = 3.14;";
        //String code = "int x; double y int z;"; // Error: falta punto y coma después de "double y"

        MiLenguajeeLexer lexer = new MiLenguajeeLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiLenguajeeParser parser = new MiLenguajeeParser(tokens);

        ParseTree tree = parser.programa();

        System.out.println("Entrada: " + code);
        System.out.println("Salida: " + tree.toStringTree(parser));
    }
}
