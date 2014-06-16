// Generated from D:\workspace\DartTranslator\src\ru\ifmo\larionov\dart\grammar\SimpleDartWithArrays.g4 by ANTLR 4.x
package ru.ifmo.larionov.dart.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleDartWithArraysParser extends Parser {
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            VOID = 1, INT = 2, LIST = 3, RETURN = 4, LCURLY = 5, RCURLY = 6, LPAREN = 7, RPAREN = 8,
            LSQUARE = 9, RSQUARE = 10, EQUAL = 11, PLUS = 12, MINUS = 13, STAR = 14, SLASH = 15,
            COMMA = 16, LE = 17, GE = 18, EE = 19, NE = 20, LESS = 21, MORE = 22, NOT = 23, TRUE = 24,
            FALSE = 25, OR = 26, AND = 27, IF = 28, ELSE = 29, FOR = 30, WHILE = 31, BREAK = 32, CONTINUE = 33,
            SEMICOLON = 34, DOT = 35, NUM_INT = 36, IDENT = 37, LITERAL = 38, WS = 39;
    public static final String[] tokenNames = {
            "<INVALID>", "'void'", "'int'", "'List'", "'return'", "'{'", "'}'", "'('",
            "')'", "'['", "']'", "'='", "'+'", "'-'", "'*'", "'/'", "','", "'<='",
            "'>='", "'=='", "'!='", "'<'", "'>'", "'!'", "'true'", "'false'", "'||'",
            "'&&'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'",
            "';'", "'.'", "NUM_INT", "IDENT", "LITERAL", "WS"
    };
    public static final int
            RULE_compilationUnit = 0, RULE_globalVariableDeclaration = 1, RULE_functionDeclaration = 2,
            RULE_functionParameters = 3, RULE_functionBody = 4, RULE_block = 5, RULE_blockStatement = 6,
            RULE_statement = 7, RULE_assignment = 8, RULE_forStatement = 9, RULE_forControl = 10,
            RULE_forInit = 11, RULE_forUpdate = 12, RULE_parExpression = 13, RULE_jumpStatement = 14,
            RULE_arrayInitializer = 15, RULE_expression = 16, RULE_funcCall = 17,
            RULE_logicalOr = 18, RULE_logicalAnd = 19, RULE_relationalExpr = 20, RULE_simpleExpression = 21,
            RULE_arrayIdent = 22, RULE_expressionList = 23, RULE_variableList = 24,
            RULE_typeIdentifier = 25, RULE_variableType = 26, RULE_variable = 27,
            RULE_variableDeclarationStatement = 28, RULE_variableDeclaration = 29,
            RULE_variableDeclarators = 30, RULE_variableDeclarator = 31, RULE_variableInitializer = 32,
            RULE_ariphExpression = 33, RULE_ariphTerm = 34, RULE_ariphFactor = 35;
    public static final String[] ruleNames = {
            "compilationUnit", "globalVariableDeclaration", "functionDeclaration",
            "functionParameters", "functionBody", "block", "blockStatement", "statement",
            "assignment", "forStatement", "forControl", "forInit", "forUpdate", "parExpression",
            "jumpStatement", "arrayInitializer", "expression", "funcCall", "logicalOr",
            "logicalAnd", "relationalExpr", "simpleExpression", "arrayIdent", "expressionList",
            "variableList", "typeIdentifier", "variableType", "variable", "variableDeclarationStatement",
            "variableDeclaration", "variableDeclarators", "variableDeclarator", "variableInitializer",
            "ariphExpression", "ariphTerm", "ariphFactor"
    };

    @Override
    public String getGrammarFileName() {
        return "SimpleDartWithArrays.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public SimpleDartWithArraysParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class CompilationUnitContext extends ParserRuleContext {
        public List<FunctionDeclarationContext> functionDeclaration() {
            return getRuleContexts(FunctionDeclarationContext.class);
        }

        public FunctionDeclarationContext functionDeclaration(int i) {
            return getRuleContext(FunctionDeclarationContext.class, i);
        }

        public GlobalVariableDeclarationContext globalVariableDeclaration(int i) {
            return getRuleContext(GlobalVariableDeclarationContext.class, i);
        }

        public List<GlobalVariableDeclarationContext> globalVariableDeclaration() {
            return getRuleContexts(GlobalVariableDeclarationContext.class);
        }

        public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compilationUnit;
        }
    }

    public final CompilationUnitContext compilationUnit() throws RecognitionException {
        CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_compilationUnit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(76);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << LIST))) != 0)) {
                    {
                        setState(74);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(72);
                                functionDeclaration();
                            }
                            break;
                            case 2: {
                                setState(73);
                                globalVariableDeclaration();
                            }
                            break;
                        }
                    }
                    setState(78);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GlobalVariableDeclarationContext extends ParserRuleContext {
        public VariableDeclarationStatementContext variableDeclarationStatement() {
            return getRuleContext(VariableDeclarationStatementContext.class, 0);
        }

        public GlobalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_globalVariableDeclaration;
        }
    }

    public final GlobalVariableDeclarationContext globalVariableDeclaration() throws RecognitionException {
        GlobalVariableDeclarationContext _localctx = new GlobalVariableDeclarationContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_globalVariableDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                variableDeclarationStatement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionDeclarationContext extends ParserRuleContext {
        public FunctionBodyContext functionBody() {
            return getRuleContext(FunctionBodyContext.class, 0);
        }

        public TypeIdentifierContext typeIdentifier() {
            return getRuleContext(TypeIdentifierContext.class, 0);
        }

        public FunctionParametersContext functionParameters() {
            return getRuleContext(FunctionParametersContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(SimpleDartWithArraysParser.IDENT, 0);
        }

        public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDeclaration;
        }
    }

    public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
        FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_functionDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                typeIdentifier();
                setState(82);
                match(IDENT);
                setState(83);
                functionParameters();
                setState(84);
                functionBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionParametersContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(SimpleDartWithArraysParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(SimpleDartWithArraysParser.RPAREN, 0);
        }

        public VariableListContext variableList() {
            return getRuleContext(VariableListContext.class, 0);
        }

        public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionParameters;
        }
    }

    public final FunctionParametersContext functionParameters() throws RecognitionException {
        FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_functionParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(86);
                match(LPAREN);
                setState(88);
                _la = _input.LA(1);
                if (_la == INT || _la == LIST) {
                    {
                        setState(87);
                        variableList();
                    }
                }

                setState(90);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionBodyContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionBody;
        }
    }

    public final FunctionBodyContext functionBody() throws RecognitionException {
        FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_functionBody);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BlockContext extends ParserRuleContext {
        public TerminalNode RCURLY() {
            return getToken(SimpleDartWithArraysParser.RCURLY, 0);
        }

        public TerminalNode LCURLY() {
            return getToken(SimpleDartWithArraysParser.LCURLY, 0);
        }

        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }

        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class, i);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(94);
                match(LCURLY);
                setState(98);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LIST) | (1L << RETURN) | (1L << LCURLY) | (1L << LPAREN) | (1L << MINUS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << SEMICOLON) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                    {
                        {
                            setState(95);
                            blockStatement();
                        }
                    }
                    setState(100);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(101);
                match(RCURLY);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BlockStatementContext extends ParserRuleContext {
        public VariableDeclarationStatementContext variableDeclarationStatement() {
            return getRuleContext(VariableDeclarationStatementContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public BlockStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_blockStatement;
        }
    }

    public final BlockStatementContext blockStatement() throws RecognitionException {
        BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_blockStatement);
        try {
            setState(105);
            switch (_input.LA(1)) {
                case INT:
                case LIST:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(103);
                    variableDeclarationStatement();
                }
                break;
                case RETURN:
                case LCURLY:
                case LPAREN:
                case MINUS:
                case IF:
                case FOR:
                case WHILE:
                case BREAK:
                case CONTINUE:
                case SEMICOLON:
                case NUM_INT:
                case IDENT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(104);
                    statement();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {
        public TerminalNode SEMICOLON() {
            return getToken(SimpleDartWithArraysParser.SEMICOLON, 0);
        }

        public TerminalNode ELSE() {
            return getToken(SimpleDartWithArraysParser.ELSE, 0);
        }

        public TerminalNode IF() {
            return getToken(SimpleDartWithArraysParser.IF, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public JumpStatementContext jumpStatement() {
            return getRuleContext(JumpStatementContext.class, 0);
        }

        public ForStatementContext forStatement() {
            return getRuleContext(ForStatementContext.class, 0);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode WHILE() {
            return getToken(SimpleDartWithArraysParser.WHILE, 0);
        }

        public ParExpressionContext parExpression() {
            return getRuleContext(ParExpressionContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_statement);
        int _la;
        try {
            setState(128);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(107);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(108);
                    assignment();
                    setState(109);
                    match(SEMICOLON);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(112);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                        {
                            setState(111);
                            expression();
                        }
                    }

                    setState(114);
                    match(SEMICOLON);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(115);
                    match(IF);
                    setState(116);
                    parExpression();
                    setState(117);
                    statement();
                    setState(120);
                    switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                        case 1: {
                            setState(118);
                            match(ELSE);
                            setState(119);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(122);
                    forStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(123);
                    match(WHILE);
                    setState(124);
                    parExpression();
                    setState(125);
                    statement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(127);
                    jumpStatement();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentContext extends ParserRuleContext {
        public TerminalNode EQUAL() {
            return getToken(SimpleDartWithArraysParser.EQUAL, 0);
        }

        public ArrayInitializerContext arrayInitializer() {
            return getRuleContext(ArrayInitializerContext.class, 0);
        }

        public ArrayIdentContext arrayIdent() {
            return getRuleContext(ArrayIdentContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(SimpleDartWithArraysParser.IDENT, 0);
        }

        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }
    }

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_assignment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                match(IDENT);
                setState(132);
                _la = _input.LA(1);
                if (_la == LSQUARE) {
                    {
                        setState(131);
                        arrayIdent();
                    }
                }

                setState(134);
                match(EQUAL);
                setState(137);
                switch (_input.LA(1)) {
                    case LPAREN:
                    case MINUS:
                    case NUM_INT:
                    case IDENT: {
                        setState(135);
                        expression();
                    }
                    break;
                    case LSQUARE: {
                        setState(136);
                        arrayInitializer();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForStatementContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(SimpleDartWithArraysParser.LPAREN, 0);
        }

        public ForControlContext forControl() {
            return getRuleContext(ForControlContext.class, 0);
        }

        public TerminalNode FOR() {
            return getToken(SimpleDartWithArraysParser.FOR, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(SimpleDartWithArraysParser.RPAREN, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public ForStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forStatement;
        }
    }

    public final ForStatementContext forStatement() throws RecognitionException {
        ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_forStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(139);
                match(FOR);
                setState(140);
                match(LPAREN);
                setState(141);
                forControl();
                setState(142);
                match(RPAREN);
                setState(143);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForControlContext extends ParserRuleContext {
        public List<TerminalNode> SEMICOLON() {
            return getTokens(SimpleDartWithArraysParser.SEMICOLON);
        }

        public LogicalOrContext logicalOr() {
            return getRuleContext(LogicalOrContext.class, 0);
        }

        public ForUpdateContext forUpdate() {
            return getRuleContext(ForUpdateContext.class, 0);
        }

        public ForInitContext forInit() {
            return getRuleContext(ForInitContext.class, 0);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(SimpleDartWithArraysParser.SEMICOLON, i);
        }

        public ForControlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forControl;
        }
    }

    public final ForControlContext forControl() throws RecognitionException {
        ForControlContext _localctx = new ForControlContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_forControl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                _la = _input.LA(1);
                if (_la == INT || _la == LIST) {
                    {
                        setState(145);
                        forInit();
                    }
                }

                setState(148);
                match(SEMICOLON);
                setState(150);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                    {
                        setState(149);
                        logicalOr();
                    }
                }

                setState(152);
                match(SEMICOLON);
                setState(154);
                _la = _input.LA(1);
                if (_la == IDENT) {
                    {
                        setState(153);
                        forUpdate();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForInitContext extends ParserRuleContext {
        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class, 0);
        }

        public ForInitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forInit;
        }
    }

    public final ForInitContext forInit() throws RecognitionException {
        ForInitContext _localctx = new ForInitContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_forInit);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(156);
                variableDeclaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForUpdateContext extends ParserRuleContext {
        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public ForUpdateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forUpdate;
        }
    }

    public final ForUpdateContext forUpdate() throws RecognitionException {
        ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_forUpdate);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(158);
                assignment();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParExpressionContext extends ParserRuleContext {
        public LogicalOrContext logicalOr() {
            return getRuleContext(LogicalOrContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(SimpleDartWithArraysParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(SimpleDartWithArraysParser.RPAREN, 0);
        }

        public ParExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parExpression;
        }
    }

    public final ParExpressionContext parExpression() throws RecognitionException {
        ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_parExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(160);
                match(LPAREN);
                setState(161);
                logicalOr();
                setState(162);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class JumpStatementContext extends ParserRuleContext {
        public Token continueSt;
        public Token breakSt;
        public Token returnSt;

        public TerminalNode SEMICOLON() {
            return getToken(SimpleDartWithArraysParser.SEMICOLON, 0);
        }

        public TerminalNode RETURN() {
            return getToken(SimpleDartWithArraysParser.RETURN, 0);
        }

        public TerminalNode BREAK() {
            return getToken(SimpleDartWithArraysParser.BREAK, 0);
        }

        public TerminalNode CONTINUE() {
            return getToken(SimpleDartWithArraysParser.CONTINUE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public JumpStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jumpStatement;
        }
    }

    public final JumpStatementContext jumpStatement() throws RecognitionException {
        JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_jumpStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(170);
                switch (_input.LA(1)) {
                    case CONTINUE: {
                        setState(164);
                        ((JumpStatementContext) _localctx).continueSt = match(CONTINUE);
                    }
                    break;
                    case BREAK: {
                        setState(165);
                        ((JumpStatementContext) _localctx).breakSt = match(BREAK);
                    }
                    break;
                    case RETURN: {
                        setState(166);
                        ((JumpStatementContext) _localctx).returnSt = match(RETURN);
                        setState(168);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                            {
                                setState(167);
                                expression();
                            }
                        }

                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(172);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayInitializerContext extends ParserRuleContext {
        public TerminalNode RSQUARE() {
            return getToken(SimpleDartWithArraysParser.RSQUARE, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public TerminalNode LSQUARE() {
            return getToken(SimpleDartWithArraysParser.LSQUARE, 0);
        }

        public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayInitializer;
        }
    }

    public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
        ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_arrayInitializer);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(174);
                match(LSQUARE);
                setState(176);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                    {
                        setState(175);
                        expressionList();
                    }
                }

                setState(178);
                match(RSQUARE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public AriphExpressionContext ariphExpression() {
            return getRuleContext(AriphExpressionContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(180);
                ariphExpression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FuncCallContext extends ParserRuleContext {
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(SimpleDartWithArraysParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(SimpleDartWithArraysParser.RPAREN, 0);
        }

        public TerminalNode IDENT() {
            return getToken(SimpleDartWithArraysParser.IDENT, 0);
        }

        public FuncCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcCall;
        }
    }

    public final FuncCallContext funcCall() throws RecognitionException {
        FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_funcCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(182);
                match(IDENT);
                setState(183);
                match(LPAREN);
                setState(185);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                    {
                        setState(184);
                        expressionList();
                    }
                }

                setState(187);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LogicalOrContext extends ParserRuleContext {
        public List<LogicalAndContext> logicalAnd() {
            return getRuleContexts(LogicalAndContext.class);
        }

        public TerminalNode OR() {
            return getToken(SimpleDartWithArraysParser.OR, 0);
        }

        public LogicalAndContext logicalAnd(int i) {
            return getRuleContext(LogicalAndContext.class, i);
        }

        public LogicalOrContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_logicalOr;
        }
    }

    public final LogicalOrContext logicalOr() throws RecognitionException {
        LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_logicalOr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(189);
                logicalAnd();
                setState(192);
                _la = _input.LA(1);
                if (_la == OR) {
                    {
                        setState(190);
                        match(OR);
                        setState(191);
                        logicalAnd();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LogicalAndContext extends ParserRuleContext {
        public RelationalExprContext relationalExpr(int i) {
            return getRuleContext(RelationalExprContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(SimpleDartWithArraysParser.AND, 0);
        }

        public List<RelationalExprContext> relationalExpr() {
            return getRuleContexts(RelationalExprContext.class);
        }

        public LogicalAndContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_logicalAnd;
        }
    }

    public final LogicalAndContext logicalAnd() throws RecognitionException {
        LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_logicalAnd);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                relationalExpr();
                setState(197);
                _la = _input.LA(1);
                if (_la == AND) {
                    {
                        setState(195);
                        match(AND);
                        setState(196);
                        relationalExpr();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RelationalExprContext extends ParserRuleContext {
        public Token id;
        public Token relOp;

        public TerminalNode LESS() {
            return getToken(SimpleDartWithArraysParser.LESS, 0);
        }

        public TerminalNode GE() {
            return getToken(SimpleDartWithArraysParser.GE, 0);
        }

        public LogicalOrContext logicalOr() {
            return getRuleContext(LogicalOrContext.class, 0);
        }

        public TerminalNode FALSE() {
            return getToken(SimpleDartWithArraysParser.FALSE, 0);
        }

        public TerminalNode TRUE() {
            return getToken(SimpleDartWithArraysParser.TRUE, 0);
        }

        public TerminalNode LE() {
            return getToken(SimpleDartWithArraysParser.LE, 0);
        }

        public TerminalNode MORE() {
            return getToken(SimpleDartWithArraysParser.MORE, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(SimpleDartWithArraysParser.RPAREN, 0);
        }

        public TerminalNode NOT() {
            return getToken(SimpleDartWithArraysParser.NOT, 0);
        }

        public List<AriphExpressionContext> ariphExpression() {
            return getRuleContexts(AriphExpressionContext.class);
        }

        public TerminalNode LPAREN() {
            return getToken(SimpleDartWithArraysParser.LPAREN, 0);
        }

        public TerminalNode EE() {
            return getToken(SimpleDartWithArraysParser.EE, 0);
        }

        public AriphExpressionContext ariphExpression(int i) {
            return getRuleContext(AriphExpressionContext.class, i);
        }

        public TerminalNode NE() {
            return getToken(SimpleDartWithArraysParser.NE, 0);
        }

        public RelationalExprContext relationalExpr() {
            return getRuleContext(RelationalExprContext.class, 0);
        }

        public RelationalExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_relationalExpr;
        }
    }

    public final RelationalExprContext relationalExpr() throws RecognitionException {
        RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_relationalExpr);
        int _la;
        try {
            setState(210);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(199);
                    ((RelationalExprContext) _localctx).id = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == TRUE || _la == FALSE)) {
                        ((RelationalExprContext) _localctx).id = (Token) _errHandler.recoverInline(this);
                    }
                    consume();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(200);
                    match(NOT);
                    setState(201);
                    relationalExpr();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(202);
                    ariphExpression(0);
                    setState(203);
                    ((RelationalExprContext) _localctx).relOp = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GE) | (1L << EE) | (1L << NE) | (1L << LESS) | (1L << MORE))) != 0))) {
                        ((RelationalExprContext) _localctx).relOp = (Token) _errHandler.recoverInline(this);
                    }
                    consume();
                    setState(204);
                    ariphExpression(0);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(206);
                    match(LPAREN);
                    setState(207);
                    logicalOr();
                    setState(208);
                    match(RPAREN);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SimpleExpressionContext extends ParserRuleContext {
        public Token ident;
        public Token newExpr;

        public FuncCallContext funcCall() {
            return getRuleContext(FuncCallContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(SimpleDartWithArraysParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(SimpleDartWithArraysParser.RPAREN, 0);
        }

        public ArrayIdentContext arrayIdent() {
            return getRuleContext(ArrayIdentContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(SimpleDartWithArraysParser.IDENT, 0);
        }

        public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simpleExpression;
        }
    }

    public final SimpleExpressionContext simpleExpression() throws RecognitionException {
        SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_simpleExpression);
        try {
            setState(221);
            switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(212);
                    ((SimpleExpressionContext) _localctx).ident = match(IDENT);
                    setState(214);
                    switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                        case 1: {
                            setState(213);
                            arrayIdent();
                        }
                        break;
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(216);
                    ((SimpleExpressionContext) _localctx).newExpr = match(LPAREN);
                    setState(217);
                    expression();
                    setState(218);
                    match(RPAREN);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(220);
                    funcCall();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayIdentContext extends ParserRuleContext {
        public TerminalNode RSQUARE() {
            return getToken(SimpleDartWithArraysParser.RSQUARE, 0);
        }

        public TerminalNode LSQUARE() {
            return getToken(SimpleDartWithArraysParser.LSQUARE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ArrayIdentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayIdent;
        }
    }

    public final ArrayIdentContext arrayIdent() throws RecognitionException {
        ArrayIdentContext _localctx = new ArrayIdentContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_arrayIdent);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(223);
                match(LSQUARE);
                setState(224);
                expression();
                setState(225);
                match(RSQUARE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionListContext extends ParserRuleContext {
        public List<TerminalNode> COMMA() {
            return getTokens(SimpleDartWithArraysParser.COMMA);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SimpleDartWithArraysParser.COMMA, i);
        }

        public ExpressionListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressionList;
        }
    }

    public final ExpressionListContext expressionList() throws RecognitionException {
        ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_expressionList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(227);
                expression();
                setState(232);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(228);
                            match(COMMA);
                            setState(229);
                            expression();
                        }
                    }
                    setState(234);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableListContext extends ParserRuleContext {
        public List<TerminalNode> COMMA() {
            return getTokens(SimpleDartWithArraysParser.COMMA);
        }

        public VariableContext variable(int i) {
            return getRuleContext(VariableContext.class, i);
        }

        public List<VariableContext> variable() {
            return getRuleContexts(VariableContext.class);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SimpleDartWithArraysParser.COMMA, i);
        }

        public VariableListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableList;
        }
    }

    public final VariableListContext variableList() throws RecognitionException {
        VariableListContext _localctx = new VariableListContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_variableList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(235);
                variable();
                setState(240);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(236);
                            match(COMMA);
                            setState(237);
                            variable();
                        }
                    }
                    setState(242);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeIdentifierContext extends ParserRuleContext {
        public TerminalNode LIST() {
            return getToken(SimpleDartWithArraysParser.LIST, 0);
        }

        public TerminalNode VOID() {
            return getToken(SimpleDartWithArraysParser.VOID, 0);
        }

        public TerminalNode INT() {
            return getToken(SimpleDartWithArraysParser.INT, 0);
        }

        public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeIdentifier;
        }
    }

    public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
        TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_typeIdentifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(243);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << LIST))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableTypeContext extends ParserRuleContext {
        public TerminalNode LIST() {
            return getToken(SimpleDartWithArraysParser.LIST, 0);
        }

        public TerminalNode INT() {
            return getToken(SimpleDartWithArraysParser.INT, 0);
        }

        public VariableTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableType;
        }
    }

    public final VariableTypeContext variableType() throws RecognitionException {
        VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_variableType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                _la = _input.LA(1);
                if (!(_la == INT || _la == LIST)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableContext extends ParserRuleContext {
        public VariableTypeContext variableType() {
            return getRuleContext(VariableTypeContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(SimpleDartWithArraysParser.IDENT, 0);
        }

        public VariableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variable;
        }
    }

    public final VariableContext variable() throws RecognitionException {
        VariableContext _localctx = new VariableContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_variable);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(247);
                variableType();
                setState(248);
                match(IDENT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclarationStatementContext extends ParserRuleContext {
        public TerminalNode SEMICOLON() {
            return getToken(SimpleDartWithArraysParser.SEMICOLON, 0);
        }

        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class, 0);
        }

        public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarationStatement;
        }
    }

    public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
        VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_variableDeclarationStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(250);
                variableDeclaration();
                setState(251);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclarationContext extends ParserRuleContext {
        public VariableTypeContext variableType() {
            return getRuleContext(VariableTypeContext.class, 0);
        }

        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class, 0);
        }

        public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclaration;
        }
    }

    public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
        VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_variableDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(253);
                variableType();
                setState(254);
                variableDeclarators();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclaratorsContext extends ParserRuleContext {
        public List<VariableDeclaratorContext> variableDeclarator() {
            return getRuleContexts(VariableDeclaratorContext.class);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SimpleDartWithArraysParser.COMMA);
        }

        public VariableDeclaratorContext variableDeclarator(int i) {
            return getRuleContext(VariableDeclaratorContext.class, i);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SimpleDartWithArraysParser.COMMA, i);
        }

        public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarators;
        }
    }

    public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
        VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_variableDeclarators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(256);
                variableDeclarator();
                setState(261);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(257);
                            match(COMMA);
                            setState(258);
                            variableDeclarator();
                        }
                    }
                    setState(263);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclaratorContext extends ParserRuleContext {
        public TerminalNode EQUAL() {
            return getToken(SimpleDartWithArraysParser.EQUAL, 0);
        }

        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(SimpleDartWithArraysParser.IDENT, 0);
        }

        public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarator;
        }
    }

    public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
        VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_variableDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(264);
                match(IDENT);
                setState(267);
                _la = _input.LA(1);
                if (_la == EQUAL) {
                    {
                        setState(265);
                        match(EQUAL);
                        setState(266);
                        variableInitializer();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableInitializerContext extends ParserRuleContext {
        public ArrayInitializerContext arrayInitializer() {
            return getRuleContext(ArrayInitializerContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableInitializer;
        }
    }

    public final VariableInitializerContext variableInitializer() throws RecognitionException {
        VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_variableInitializer);
        try {
            setState(271);
            switch (_input.LA(1)) {
                case LSQUARE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(269);
                    arrayInitializer();
                }
                break;
                case LPAREN:
                case MINUS:
                case NUM_INT:
                case IDENT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(270);
                    expression();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AriphExpressionContext extends ParserRuleContext {
        public Token sign;

        public AriphExpressionContext ariphExpression() {
            return getRuleContext(AriphExpressionContext.class, 0);
        }

        public AriphTermContext ariphTerm() {
            return getRuleContext(AriphTermContext.class, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SimpleDartWithArraysParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SimpleDartWithArraysParser.MINUS, 0);
        }

        public AriphExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ariphExpression;
        }
    }

    public final AriphExpressionContext ariphExpression() throws RecognitionException {
        return ariphExpression(0);
    }

    private AriphExpressionContext ariphExpression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        AriphExpressionContext _localctx = new AriphExpressionContext(_ctx, _parentState);
        AriphExpressionContext _prevctx = _localctx;
        int _startState = 66;
        enterRecursionRule(_localctx, 66, RULE_ariphExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(274);
                    ariphTerm(0);
                }
                _ctx.stop = _input.LT(-1);
                setState(281);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new AriphExpressionContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_ariphExpression);
                                setState(276);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(277);
                                ((AriphExpressionContext) _localctx).sign = _input.LT(1);
                                _la = _input.LA(1);
                                if (!(_la == PLUS || _la == MINUS)) {
                                    ((AriphExpressionContext) _localctx).sign = (Token) _errHandler.recoverInline(this);
                                }
                                consume();
                                setState(278);
                                ariphTerm(0);
                            }
                        }
                    }
                    setState(283);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class AriphTermContext extends ParserRuleContext {
        public Token sign;

        public TerminalNode SLASH() {
            return getToken(SimpleDartWithArraysParser.SLASH, 0);
        }

        public AriphTermContext ariphTerm() {
            return getRuleContext(AriphTermContext.class, 0);
        }

        public TerminalNode STAR() {
            return getToken(SimpleDartWithArraysParser.STAR, 0);
        }

        public AriphFactorContext ariphFactor() {
            return getRuleContext(AriphFactorContext.class, 0);
        }

        public AriphTermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ariphTerm;
        }
    }

    public final AriphTermContext ariphTerm() throws RecognitionException {
        return ariphTerm(0);
    }

    private AriphTermContext ariphTerm(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        AriphTermContext _localctx = new AriphTermContext(_ctx, _parentState);
        AriphTermContext _prevctx = _localctx;
        int _startState = 68;
        enterRecursionRule(_localctx, 68, RULE_ariphTerm, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(285);
                    ariphFactor();
                }
                _ctx.stop = _input.LT(-1);
                setState(292);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new AriphTermContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_ariphTerm);
                                setState(287);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(288);
                                ((AriphTermContext) _localctx).sign = _input.LT(1);
                                _la = _input.LA(1);
                                if (!(_la == STAR || _la == SLASH)) {
                                    ((AriphTermContext) _localctx).sign = (Token) _errHandler.recoverInline(this);
                                }
                                consume();
                                setState(289);
                                ariphFactor();
                            }
                        }
                    }
                    setState(294);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class AriphFactorContext extends ParserRuleContext {
        public Token num;
        public Token unary;

        public SimpleExpressionContext simpleExpression() {
            return getRuleContext(SimpleExpressionContext.class, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SimpleDartWithArraysParser.MINUS, 0);
        }

        public TerminalNode NUM_INT() {
            return getToken(SimpleDartWithArraysParser.NUM_INT, 0);
        }

        public AriphFactorContext ariphFactor() {
            return getRuleContext(AriphFactorContext.class, 0);
        }

        public AriphFactorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ariphFactor;
        }
    }

    public final AriphFactorContext ariphFactor() throws RecognitionException {
        AriphFactorContext _localctx = new AriphFactorContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_ariphFactor);
        try {
            setState(299);
            switch (_input.LA(1)) {
                case NUM_INT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(295);
                    ((AriphFactorContext) _localctx).num = match(NUM_INT);
                }
                break;
                case MINUS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(296);
                    ((AriphFactorContext) _localctx).unary = match(MINUS);
                    setState(297);
                    ariphFactor();
                }
                break;
                case LPAREN:
                case IDENT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(298);
                    simpleExpression();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 33:
                return ariphExpression_sempred((AriphExpressionContext) _localctx, predIndex);
            case 34:
                return ariphTerm_sempred((AriphTermContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean ariphExpression_sempred(AriphExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 2);
        }
        return true;
    }

    private boolean ariphTerm_sempred(AriphTermContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 2);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0130\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\3\3\3\3" +
                    "\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5[\n\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7c\n\7" +
                    "\f\7\16\7f\13\7\3\7\3\7\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\5\ts\n\t" +
                    "\3\t\3\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n" +
                    "\t\3\n\3\n\5\n\u0087\n\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13" +
                    "\3\13\3\13\3\f\5\f\u0095\n\f\3\f\3\f\5\f\u0099\n\f\3\f\3\f\5\f\u009d\n" +
                    "\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00ab" +
                    "\n\20\5\20\u00ad\n\20\3\20\3\20\3\21\3\21\5\21\u00b3\n\21\3\21\3\21\3" +
                    "\22\3\22\3\23\3\23\3\23\5\23\u00bc\n\23\3\23\3\23\3\24\3\24\3\24\5\24" +
                    "\u00c3\n\24\3\25\3\25\3\25\5\25\u00c8\n\25\3\26\3\26\3\26\3\26\3\26\3" +
                    "\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d5\n\26\3\27\3\27\5\27\u00d9\n\27" +
                    "\3\27\3\27\3\27\3\27\3\27\5\27\u00e0\n\27\3\30\3\30\3\30\3\30\3\31\3\31" +
                    "\3\31\7\31\u00e9\n\31\f\31\16\31\u00ec\13\31\3\32\3\32\3\32\7\32\u00f1" +
                    "\n\32\f\32\16\32\u00f4\13\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3" +
                    "\36\3\36\3\37\3\37\3\37\3 \3 \3 \7 \u0106\n \f \16 \u0109\13 \3!\3!\3" +
                    "!\5!\u010e\n!\3\"\3\"\5\"\u0112\n\"\3#\3#\3#\3#\3#\3#\7#\u011a\n#\f#\16" +
                    "#\u011d\13#\3$\3$\3$\3$\3$\3$\7$\u0125\n$\f$\16$\u0128\13$\3%\3%\3%\3" +
                    "%\5%\u012e\n%\3%\2\4DF&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*" +
                    ",.\60\62\64\668:<>@BDFH\2\b\3\2\32\33\3\2\23\30\3\2\3\5\3\2\4\5\3\2\16" +
                    "\17\3\2\20\21\u0133\2N\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\bX\3\2\2\2\n^\3\2" +
                    "\2\2\f`\3\2\2\2\16k\3\2\2\2\20\u0082\3\2\2\2\22\u0084\3\2\2\2\24\u008d" +
                    "\3\2\2\2\26\u0094\3\2\2\2\30\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00a2\3" +
                    "\2\2\2\36\u00ac\3\2\2\2 \u00b0\3\2\2\2\"\u00b6\3\2\2\2$\u00b8\3\2\2\2" +
                    "&\u00bf\3\2\2\2(\u00c4\3\2\2\2*\u00d4\3\2\2\2,\u00df\3\2\2\2.\u00e1\3" +
                    "\2\2\2\60\u00e5\3\2\2\2\62\u00ed\3\2\2\2\64\u00f5\3\2\2\2\66\u00f7\3\2" +
                    "\2\28\u00f9\3\2\2\2:\u00fc\3\2\2\2<\u00ff\3\2\2\2>\u0102\3\2\2\2@\u010a" +
                    "\3\2\2\2B\u0111\3\2\2\2D\u0113\3\2\2\2F\u011e\3\2\2\2H\u012d\3\2\2\2J" +
                    "M\5\6\4\2KM\5\4\3\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2" +
                    "O\3\3\2\2\2PN\3\2\2\2QR\5:\36\2R\5\3\2\2\2ST\5\64\33\2TU\7\'\2\2UV\5\b" +
                    "\5\2VW\5\n\6\2W\7\3\2\2\2XZ\7\t\2\2Y[\5\62\32\2ZY\3\2\2\2Z[\3\2\2\2[\\" +
                    "\3\2\2\2\\]\7\n\2\2]\t\3\2\2\2^_\5\f\7\2_\13\3\2\2\2`d\7\7\2\2ac\5\16" +
                    "\b\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\b" +
                    "\2\2h\r\3\2\2\2il\5:\36\2jl\5\20\t\2ki\3\2\2\2kj\3\2\2\2l\17\3\2\2\2m" +
                    "\u0083\5\f\7\2no\5\22\n\2op\7$\2\2p\u0083\3\2\2\2qs\5\"\22\2rq\3\2\2\2" +
                    "rs\3\2\2\2st\3\2\2\2t\u0083\7$\2\2uv\7\36\2\2vw\5\34\17\2wz\5\20\t\2x" +
                    "y\7\37\2\2y{\5\20\t\2zx\3\2\2\2z{\3\2\2\2{\u0083\3\2\2\2|\u0083\5\24\13" +
                    "\2}~\7!\2\2~\177\5\34\17\2\177\u0080\5\20\t\2\u0080\u0083\3\2\2\2\u0081" +
                    "\u0083\5\36\20\2\u0082m\3\2\2\2\u0082n\3\2\2\2\u0082r\3\2\2\2\u0082u\3" +
                    "\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082\u0081\3\2\2\2\u0083\21\3\2" +
                    "\2\2\u0084\u0086\7\'\2\2\u0085\u0087\5.\30\2\u0086\u0085\3\2\2\2\u0086" +
                    "\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\7\r\2\2\u0089\u008c\5\"" +
                    "\22\2\u008a\u008c\5 \21\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c" +
                    "\23\3\2\2\2\u008d\u008e\7 \2\2\u008e\u008f\7\t\2\2\u008f\u0090\5\26\f" +
                    "\2\u0090\u0091\7\n\2\2\u0091\u0092\5\20\t\2\u0092\25\3\2\2\2\u0093\u0095" +
                    "\5\30\r\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2" +
                    "\u0096\u0098\7$\2\2\u0097\u0099\5&\24\2\u0098\u0097\3\2\2\2\u0098\u0099" +
                    "\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\7$\2\2\u009b\u009d\5\32\16\2" +
                    "\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\27\3\2\2\2\u009e\u009f" +
                    "\5<\37\2\u009f\31\3\2\2\2\u00a0\u00a1\5\22\n\2\u00a1\33\3\2\2\2\u00a2" +
                    "\u00a3\7\t\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5\7\n\2\2\u00a5\35\3\2\2" +
                    "\2\u00a6\u00ad\7#\2\2\u00a7\u00ad\7\"\2\2\u00a8\u00aa\7\6\2\2\u00a9\u00ab" +
                    "\5\"\22\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2" +
                    "\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\u00ae" +
                    "\3\2\2\2\u00ae\u00af\7$\2\2\u00af\37\3\2\2\2\u00b0\u00b2\7\13\2\2\u00b1" +
                    "\u00b3\5\60\31\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3" +
                    "\2\2\2\u00b4\u00b5\7\f\2\2\u00b5!\3\2\2\2\u00b6\u00b7\5D#\2\u00b7#\3\2" +
                    "\2\2\u00b8\u00b9\7\'\2\2\u00b9\u00bb\7\t\2\2\u00ba\u00bc\5\60\31\2\u00bb" +
                    "\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\n" +
                    "\2\2\u00be%\3\2\2\2\u00bf\u00c2\5(\25\2\u00c0\u00c1\7\34\2\2\u00c1\u00c3" +
                    "\5(\25\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\'\3\2\2\2\u00c4" +
                    "\u00c7\5*\26\2\u00c5\u00c6\7\35\2\2\u00c6\u00c8\5*\26\2\u00c7\u00c5\3" +
                    "\2\2\2\u00c7\u00c8\3\2\2\2\u00c8)\3\2\2\2\u00c9\u00d5\t\2\2\2\u00ca\u00cb" +
                    "\7\31\2\2\u00cb\u00d5\5*\26\2\u00cc\u00cd\5D#\2\u00cd\u00ce\t\3\2\2\u00ce" +
                    "\u00cf\5D#\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2\5&\24" +
                    "\2\u00d2\u00d3\7\n\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00ca" +
                    "\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5+\3\2\2\2\u00d6" +
                    "\u00d8\7\'\2\2\u00d7\u00d9\5.\30\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2" +
                    "\2\2\u00d9\u00e0\3\2\2\2\u00da\u00db\7\t\2\2\u00db\u00dc\5\"\22\2\u00dc" +
                    "\u00dd\7\n\2\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\5$\23\2\u00df\u00d6\3\2" +
                    "\2\2\u00df\u00da\3\2\2\2\u00df\u00de\3\2\2\2\u00e0-\3\2\2\2\u00e1\u00e2" +
                    "\7\13\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00e4\7\f\2\2\u00e4/\3\2\2\2\u00e5" +
                    "\u00ea\5\"\22\2\u00e6\u00e7\7\22\2\2\u00e7\u00e9\5\"\22\2\u00e8\u00e6" +
                    "\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb" +
                    "\61\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f2\58\35\2\u00ee\u00ef\7\22\2" +
                    "\2\u00ef\u00f1\58\35\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0" +
                    "\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\63\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5" +
                    "\u00f6\t\4\2\2\u00f6\65\3\2\2\2\u00f7\u00f8\t\5\2\2\u00f8\67\3\2\2\2\u00f9" +
                    "\u00fa\5\66\34\2\u00fa\u00fb\7\'\2\2\u00fb9\3\2\2\2\u00fc\u00fd\5<\37" +
                    "\2\u00fd\u00fe\7$\2\2\u00fe;\3\2\2\2\u00ff\u0100\5\66\34\2\u0100\u0101" +
                    "\5> \2\u0101=\3\2\2\2\u0102\u0107\5@!\2\u0103\u0104\7\22\2\2\u0104\u0106" +
                    "\5@!\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107" +
                    "\u0108\3\2\2\2\u0108?\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010d\7\'\2\2" +
                    "\u010b\u010c\7\r\2\2\u010c\u010e\5B\"\2\u010d\u010b\3\2\2\2\u010d\u010e" +
                    "\3\2\2\2\u010eA\3\2\2\2\u010f\u0112\5 \21\2\u0110\u0112\5\"\22\2\u0111" +
                    "\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112C\3\2\2\2\u0113\u0114\b#\1\2\u0114" +
                    "\u0115\5F$\2\u0115\u011b\3\2\2\2\u0116\u0117\f\4\2\2\u0117\u0118\t\6\2" +
                    "\2\u0118\u011a\5F$\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119" +
                    "\3\2\2\2\u011b\u011c\3\2\2\2\u011cE\3\2\2\2\u011d\u011b\3\2\2\2\u011e" +
                    "\u011f\b$\1\2\u011f\u0120\5H%\2\u0120\u0126\3\2\2\2\u0121\u0122\f\4\2" +
                    "\2\u0122\u0123\t\7\2\2\u0123\u0125\5H%\2\u0124\u0121\3\2\2\2\u0125\u0128" +
                    "\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127G\3\2\2\2\u0128" +
                    "\u0126\3\2\2\2\u0129\u012e\7&\2\2\u012a\u012b\7\17\2\2\u012b\u012e\5H" +
                    "%\2\u012c\u012e\5,\27\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d" +
                    "\u012c\3\2\2\2\u012eI\3\2\2\2 LNZdkrz\u0082\u0086\u008b\u0094\u0098\u009c" +
                    "\u00aa\u00ac\u00b2\u00bb\u00c2\u00c7\u00d4\u00d8\u00df\u00ea\u00f2\u0107" +
                    "\u010d\u0111\u011b\u0126\u012d";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}