// Generated from C.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#struct_declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration_statement(@NotNull CParser.Struct_declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#struct_declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration_statement(@NotNull CParser.Struct_declaration_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_specifier(@NotNull CParser.Enum_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_specifier(@NotNull CParser.Enum_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull CParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull CParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(@NotNull CParser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(@NotNull CParser.Struct_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void enterInteger_constant(@NotNull CParser.Integer_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void exitInteger_constant(@NotNull CParser.Integer_constantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExternal_declaration(@NotNull CParser.External_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExternal_declaration(@NotNull CParser.External_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(@NotNull CParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(@NotNull CParser.Expression_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(@NotNull CParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(@NotNull CParser.Iteration_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(@NotNull CParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(@NotNull CParser.Struct_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(@NotNull CParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(@NotNull CParser.Constant_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(@NotNull CParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(@NotNull CParser.Exclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_abstract_declarator(@NotNull CParser.Direct_abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_abstract_declarator(@NotNull CParser.Direct_abstract_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(@NotNull CParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(@NotNull CParser.Cast_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(@NotNull CParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(@NotNull CParser.Function_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_or_union_specifier(@NotNull CParser.Struct_or_union_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_or_union_specifier(@NotNull CParser.Struct_or_union_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#enumeration_constant}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_constant(@NotNull CParser.Enumeration_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumeration_constant}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_constant(@NotNull CParser.Enumeration_constantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#struct_or_union}.
	 * @param ctx the parse tree
	 */
	void enterStruct_or_union(@NotNull CParser.Struct_or_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#struct_or_union}.
	 * @param ctx the parse tree
	 */
	void exitStruct_or_union(@NotNull CParser.Struct_or_unionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(@NotNull CParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(@NotNull CParser.Jump_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(@NotNull CParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(@NotNull CParser.Multiplicative_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(@NotNull CParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(@NotNull CParser.Postfix_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull CParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull CParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull CParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull CParser.Unary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull CParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull CParser.Relational_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull CParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull CParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#entrance}.
	 * @param ctx the parse tree
	 */
	void enterEntrance(@NotNull CParser.EntranceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#entrance}.
	 * @param ctx the parse tree
	 */
	void exitEntrance(@NotNull CParser.EntranceContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifier(@NotNull CParser.Declaration_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifier(@NotNull CParser.Declaration_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(@NotNull CParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(@NotNull CParser.Enumerator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(@NotNull CParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(@NotNull CParser.Init_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#floating_constant}.
	 * @param ctx the parse tree
	 */
	void enterFloating_constant(@NotNull CParser.Floating_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#floating_constant}.
	 * @param ctx the parse tree
	 */
	void exitFloating_constant(@NotNull CParser.Floating_constantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(@NotNull CParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(@NotNull CParser.PointerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(@NotNull CParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(@NotNull CParser.Logical_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#typedef_name}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_name(@NotNull CParser.Typedef_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typedef_name}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_name(@NotNull CParser.Typedef_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(@NotNull CParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(@NotNull CParser.Init_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(@NotNull CParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(@NotNull CParser.Labeled_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull CParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull CParser.EnumeratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_declarator(@NotNull CParser.Direct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_declarator(@NotNull CParser.Direct_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(@NotNull CParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(@NotNull CParser.Assignment_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(@NotNull CParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(@NotNull CParser.Translation_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(@NotNull CParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(@NotNull CParser.Compound_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(@NotNull CParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(@NotNull CParser.Initializer_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(@NotNull CParser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(@NotNull CParser.Struct_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(@NotNull CParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(@NotNull CParser.Inclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull CParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull CParser.InitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(@NotNull CParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(@NotNull CParser.Parameter_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(@NotNull CParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(@NotNull CParser.Type_qualifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(@NotNull CParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(@NotNull CParser.Declaration_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull CParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull CParser.Additive_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#parameter_type_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type_list(@NotNull CParser.Parameter_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameter_type_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type_list(@NotNull CParser.Parameter_type_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator(@NotNull CParser.Abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator(@NotNull CParser.Abstract_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull CParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull CParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(@NotNull CParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(@NotNull CParser.Conditional_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#assignment_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression_list(@NotNull CParser.Assignment_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignment_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression_list(@NotNull CParser.Assignment_expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(@NotNull CParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(@NotNull CParser.Parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull CParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull CParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull CParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull CParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(@NotNull CParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(@NotNull CParser.Logical_and_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(@NotNull CParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(@NotNull CParser.Type_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull CParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull CParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#character_constant}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_constant(@NotNull CParser.Character_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#character_constant}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_constant(@NotNull CParser.Character_constantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#storage_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_specifier(@NotNull CParser.Storage_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#storage_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_specifier(@NotNull CParser.Storage_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(@NotNull CParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(@NotNull CParser.Selection_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull CParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull CParser.Equality_expressionContext ctx);
}