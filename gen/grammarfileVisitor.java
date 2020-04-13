// Generated from D:/yapis/ListCompiler/src/main/resources\grammarfile.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammarfileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammarfileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(grammarfileParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#blockOfCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOfCode(grammarfileParser.BlockOfCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#returnBlockOfCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlockOfCode(grammarfileParser.ReturnBlockOfCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(grammarfileParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(grammarfileParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#voidFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(grammarfileParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#returnFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(grammarfileParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(grammarfileParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#callClear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallClear(grammarfileParser.CallClearContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#callAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAdd(grammarfileParser.CallAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#callGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallGet(grammarfileParser.CallGetContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#callRemove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallRemove(grammarfileParser.CallRemoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#callIsEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallIsEmpty(grammarfileParser.CallIsEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#callSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSize(grammarfileParser.CallSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#callContains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallContains(grammarfileParser.CallContainsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementDeclaration(grammarfileParser.ElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(grammarfileParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#callPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallPrint(grammarfileParser.CallPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#forCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCycle(grammarfileParser.ForCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(grammarfileParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(grammarfileParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(grammarfileParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarfileParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(grammarfileParser.ContentContext ctx);
}