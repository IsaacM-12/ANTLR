// Generated from MiLenguajee.g4 by ANTLR 4.13.0
package mycompiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MiLenguajeeParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(MiLenguajeeParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(MiLenguajeeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MiLenguajeeParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(MiLenguajeeParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(MiLenguajeeParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(MiLenguajeeParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MiLenguajeeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(MiLenguajeeParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(MiLenguajeeParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiLenguajeeParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(MiLenguajeeParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(MiLenguajeeParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#llamado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamado(MiLenguajeeParser.LlamadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimiento(MiLenguajeeParser.ProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeeParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(MiLenguajeeParser.FuncionContext ctx);
}