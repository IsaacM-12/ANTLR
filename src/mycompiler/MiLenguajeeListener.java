// Generated from MiLenguajee.g4 by ANTLR 4.13.0
package mycompiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeeParser}.
 */
public interface MiLenguajeeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiLenguajeeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiLenguajeeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(MiLenguajeeParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(MiLenguajeeParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(MiLenguajeeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(MiLenguajeeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MiLenguajeeParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MiLenguajeeParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(MiLenguajeeParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(MiLenguajeeParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(MiLenguajeeParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(MiLenguajeeParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiLenguajeeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiLenguajeeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiLenguajeeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiLenguajeeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(MiLenguajeeParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(MiLenguajeeParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(MiLenguajeeParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(MiLenguajeeParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiLenguajeeParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiLenguajeeParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(MiLenguajeeParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(MiLenguajeeParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(MiLenguajeeParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(MiLenguajeeParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#llamado}.
	 * @param ctx the parse tree
	 */
	void enterLlamado(MiLenguajeeParser.LlamadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#llamado}.
	 * @param ctx the parse tree
	 */
	void exitLlamado(MiLenguajeeParser.LlamadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(MiLenguajeeParser.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(MiLenguajeeParser.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(MiLenguajeeParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(MiLenguajeeParser.FuncionContext ctx);
}