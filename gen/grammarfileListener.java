// Generated from D:/yapis/ListCompiler/src/main/resources\grammarfile.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarfileParser}.
 */
public interface grammarfileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(grammarfileParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(grammarfileParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#blockOfCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockOfCode(grammarfileParser.BlockOfCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#blockOfCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockOfCode(grammarfileParser.BlockOfCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#returnBlockOfCode}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlockOfCode(grammarfileParser.ReturnBlockOfCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#returnBlockOfCode}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlockOfCode(grammarfileParser.ReturnBlockOfCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grammarfileParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grammarfileParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(grammarfileParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(grammarfileParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(grammarfileParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(grammarfileParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(grammarfileParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(grammarfileParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(grammarfileParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(grammarfileParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#callClear}.
	 * @param ctx the parse tree
	 */
	void enterCallClear(grammarfileParser.CallClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#callClear}.
	 * @param ctx the parse tree
	 */
	void exitCallClear(grammarfileParser.CallClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#callAdd}.
	 * @param ctx the parse tree
	 */
	void enterCallAdd(grammarfileParser.CallAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#callAdd}.
	 * @param ctx the parse tree
	 */
	void exitCallAdd(grammarfileParser.CallAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#callGet}.
	 * @param ctx the parse tree
	 */
	void enterCallGet(grammarfileParser.CallGetContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#callGet}.
	 * @param ctx the parse tree
	 */
	void exitCallGet(grammarfileParser.CallGetContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#callRemove}.
	 * @param ctx the parse tree
	 */
	void enterCallRemove(grammarfileParser.CallRemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#callRemove}.
	 * @param ctx the parse tree
	 */
	void exitCallRemove(grammarfileParser.CallRemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#callIsEmpty}.
	 * @param ctx the parse tree
	 */
	void enterCallIsEmpty(grammarfileParser.CallIsEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#callIsEmpty}.
	 * @param ctx the parse tree
	 */
	void exitCallIsEmpty(grammarfileParser.CallIsEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#callSize}.
	 * @param ctx the parse tree
	 */
	void enterCallSize(grammarfileParser.CallSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#callSize}.
	 * @param ctx the parse tree
	 */
	void exitCallSize(grammarfileParser.CallSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#callContains}.
	 * @param ctx the parse tree
	 */
	void enterCallContains(grammarfileParser.CallContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#callContains}.
	 * @param ctx the parse tree
	 */
	void exitCallContains(grammarfileParser.CallContainsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementDeclaration(grammarfileParser.ElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementDeclaration(grammarfileParser.ElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(grammarfileParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(grammarfileParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#callPrint}.
	 * @param ctx the parse tree
	 */
	void enterCallPrint(grammarfileParser.CallPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#callPrint}.
	 * @param ctx the parse tree
	 */
	void exitCallPrint(grammarfileParser.CallPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void enterForCycle(grammarfileParser.ForCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void exitForCycle(grammarfileParser.ForCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(grammarfileParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(grammarfileParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(grammarfileParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(grammarfileParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(grammarfileParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(grammarfileParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarfileParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(grammarfileParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarfileParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(grammarfileParser.ContentContext ctx);
}