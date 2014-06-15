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
            COMMA = 16, LE = 17, GE = 18, EE = 19, NE = 20, LESS = 21, MORE = 22, REL_OP = 23, OR = 24,
            AND = 25, NEW = 26, IF = 27, ELSE = 28, FOR = 29, WHILE = 30, BREAK = 31, CONTINUE = 32,
            LENGTH = 33, SEMICOLON = 34, DOT = 35, NUM_INT = 36, IDENT = 37, LITERAL = 38, WS = 39;
    public static final String[] tokenNames = {
            "<INVALID>", "'void'", "'int'", "'List'", "'return'", "'{'", "'}'", "'('",
            "')'", "'['", "']'", "'='", "'+'", "'-'", "'*'", "'/'", "','", "'<='",
            "'>='", "'=='", "'!='", "'<'", "'>'", "REL_OP", "'||'", "'&&'", "'new'",
            "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", "'length'",
            "';'", "'.'", "NUM_INT", "IDENT", "LITERAL", "WS"
    };
    public static final int
            RULE_compilationUnit = 0, RULE_globalVariableDeclaration = 1, RULE_functionDeclaration = 2,
            RULE_functionParameters = 3, RULE_functionBody = 4, RULE_block = 5, RULE_blockStatement = 6,
            RULE_statement = 7, RULE_forStatement = 8, RULE_forControl = 9, RULE_forInit = 10,
            RULE_forUpdate = 11, RULE_parExpression = 12, RULE_jumpStatement = 13,
            RULE_arrayInitializer = 14, RULE_expression = 15, RULE_funcCall = 16,
            RULE_logicalOr = 17, RULE_logicalAnd = 18, RULE_relationalExpr = 19, RULE_simpleExpression = 20,
            RULE_arrayIdent = 21, RULE_expressionList = 22, RULE_variableList = 23,
            RULE_typeIdentifier = 24, RULE_variableType = 25, RULE_variable = 26,
            RULE_variableDeclarationStatement = 27, RULE_variableDeclaration = 28,
            RULE_variableDeclarators = 29, RULE_variableDeclarator = 30, RULE_variableInitializer = 31,
            RULE_ariphExpression = 32, RULE_ariphTerm = 33, RULE_ariphFactor = 34;
    public static final String[] ruleNames = {
            "compilationUnit", "globalVariableDeclaration", "functionDeclaration",
            "functionParameters", "functionBody", "block", "blockStatement", "statement",
            "forStatement", "forControl", "forInit", "forUpdate", "parExpression",
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
                setState(74);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << LIST))) != 0)) {
                    {
                        setState(72);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(70);
                                functionDeclaration();
                            }
                            break;
                            case 2: {
                                setState(71);
                                globalVariableDeclaration();
                            }
                            break;
                        }
                    }
                    setState(76);
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
                setState(77);
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
                setState(79);
                typeIdentifier();
                setState(80);
                match(IDENT);
                setState(81);
                functionParameters();
                setState(82);
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
                setState(84);
                match(LPAREN);
                setState(86);
                _la = _input.LA(1);
                if (_la == INT || _la == LIST) {
                    {
                        setState(85);
                        variableList();
                    }
                }

                setState(88);
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
                setState(90);
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
                setState(92);
                match(LCURLY);
                setState(96);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LIST) | (1L << RETURN) | (1L << LCURLY) | (1L << LPAREN) | (1L << MINUS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << SEMICOLON) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                    {
                        {
                            setState(93);
                            blockStatement();
                        }
                    }
                    setState(98);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(99);
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
            setState(103);
            switch (_input.LA(1)) {
                case INT:
                case LIST:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(101);
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
                    setState(102);
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
            setState(123);
            switch (_input.LA(1)) {
                case LCURLY:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(105);
                    block();
                }
                break;
                case LPAREN:
                case MINUS:
                case SEMICOLON:
                case NUM_INT:
                case IDENT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(107);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                        {
                            setState(106);
                            expression();
                        }
                    }

                    setState(109);
                    match(SEMICOLON);
                }
                break;
                case IF:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(110);
                    match(IF);
                    setState(111);
                    parExpression();
                    setState(112);
                    statement();
                    setState(115);
                    switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                        case 1: {
                            setState(113);
                            match(ELSE);
                            setState(114);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case FOR:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(117);
                    forStatement();
                }
                break;
                case WHILE:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(118);
                    match(WHILE);
                    setState(119);
                    parExpression();
                    setState(120);
                    statement();
                }
                break;
                case RETURN:
                case BREAK:
                case CONTINUE:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(122);
                    jumpStatement();
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
        enterRule(_localctx, 16, RULE_forStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(125);
                match(FOR);
                setState(126);
                match(LPAREN);
                setState(127);
                forControl();
                setState(128);
                match(RPAREN);
                setState(129);
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

        public ForUpdateContext forUpdate() {
            return getRuleContext(ForUpdateContext.class, 0);
        }

        public ForInitContext forInit() {
            return getRuleContext(ForInitContext.class, 0);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(SimpleDartWithArraysParser.SEMICOLON, i);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
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
        enterRule(_localctx, 18, RULE_forControl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(132);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LIST) | (1L << LPAREN) | (1L << MINUS) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                    {
                        setState(131);
                        forInit();
                    }
                }

                setState(134);
                match(SEMICOLON);
                setState(136);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                    {
                        setState(135);
                        expression();
                    }
                }

                setState(138);
                match(SEMICOLON);
                setState(140);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                    {
                        setState(139);
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

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
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
        enterRule(_localctx, 20, RULE_forInit);
        try {
            setState(144);
            switch (_input.LA(1)) {
                case INT:
                case LIST:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(142);
                    variableDeclaration();
                }
                break;
                case LPAREN:
                case MINUS:
                case NUM_INT:
                case IDENT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(143);
                    expressionList();
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

    public static class ForUpdateContext extends ParserRuleContext {
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
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
        enterRule(_localctx, 22, RULE_forUpdate);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                expressionList();
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
        enterRule(_localctx, 24, RULE_parExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(148);
                match(LPAREN);
                setState(149);
                logicalOr();
                setState(150);
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
        enterRule(_localctx, 26, RULE_jumpStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(158);
                switch (_input.LA(1)) {
                    case CONTINUE: {
                        setState(152);
                        ((JumpStatementContext) _localctx).continueSt = match(CONTINUE);
                    }
                    break;
                    case BREAK: {
                        setState(153);
                        ((JumpStatementContext) _localctx).breakSt = match(BREAK);
                    }
                    break;
                    case RETURN: {
                        setState(154);
                        ((JumpStatementContext) _localctx).returnSt = match(RETURN);
                        setState(156);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << NUM_INT) | (1L << IDENT))) != 0)) {
                            {
                                setState(155);
                                expression();
                            }
                        }

                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(160);
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
        enterRule(_localctx, 28, RULE_arrayInitializer);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(162);
                match(LSQUARE);
                setState(163);
                expressionList();
                setState(164);
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

        public FuncCallContext funcCall() {
            return getRuleContext(FuncCallContext.class, 0);
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
        enterRule(_localctx, 30, RULE_expression);
        try {
            setState(168);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(166);
                    funcCall();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(167);
                    ariphExpression(0);
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
        enterRule(_localctx, 32, RULE_funcCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(170);
                match(IDENT);
                setState(171);
                match(LPAREN);
                setState(172);
                expressionList();
                setState(173);
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
        enterRule(_localctx, 34, RULE_logicalOr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(175);
                logicalAnd();
                setState(178);
                _la = _input.LA(1);
                if (_la == OR) {
                    {
                        setState(176);
                        match(OR);
                        setState(177);
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
        enterRule(_localctx, 36, RULE_logicalAnd);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(180);
                relationalExpr();
                {
                    setState(181);
                    match(AND);
                    setState(182);
                    relationalExpr();
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
        public List<AriphExpressionContext> ariphExpression() {
            return getRuleContexts(AriphExpressionContext.class);
        }

        public TerminalNode REL_OP() {
            return getToken(SimpleDartWithArraysParser.REL_OP, 0);
        }

        public AriphExpressionContext ariphExpression(int i) {
            return getRuleContext(AriphExpressionContext.class, i);
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
        enterRule(_localctx, 38, RULE_relationalExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(184);
                ariphExpression(0);
                setState(185);
                match(REL_OP);
                setState(186);
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

    public static class SimpleExpressionContext extends ParserRuleContext {
        public Token ident;
        public Token newExpr;

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
        enterRule(_localctx, 40, RULE_simpleExpression);
        try {
            setState(196);
            switch (_input.LA(1)) {
                case IDENT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(188);
                    ((SimpleExpressionContext) _localctx).ident = match(IDENT);
                    setState(190);
                    switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                        case 1: {
                            setState(189);
                            arrayIdent();
                        }
                        break;
                    }
                }
                break;
                case LPAREN:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(192);
                    ((SimpleExpressionContext) _localctx).newExpr = match(LPAREN);
                    setState(193);
                    expression();
                    setState(194);
                    match(RPAREN);
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

    public static class ArrayIdentContext extends ParserRuleContext {
        public TerminalNode RSQUARE() {
            return getToken(SimpleDartWithArraysParser.RSQUARE, 0);
        }

        public TerminalNode LSQUARE() {
            return getToken(SimpleDartWithArraysParser.LSQUARE, 0);
        }

        public TerminalNode NUM_INT() {
            return getToken(SimpleDartWithArraysParser.NUM_INT, 0);
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
        enterRule(_localctx, 42, RULE_arrayIdent);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(198);
                match(LSQUARE);
                setState(199);
                match(NUM_INT);
                setState(200);
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
        enterRule(_localctx, 44, RULE_expressionList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(202);
                expression();
                setState(207);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(203);
                            match(COMMA);
                            setState(204);
                            expression();
                        }
                    }
                    setState(209);
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
        enterRule(_localctx, 46, RULE_variableList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(210);
                variable();
                setState(215);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(211);
                            match(COMMA);
                            setState(212);
                            variable();
                        }
                    }
                    setState(217);
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
        enterRule(_localctx, 48, RULE_typeIdentifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(218);
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
        enterRule(_localctx, 50, RULE_variableType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(220);
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
        enterRule(_localctx, 52, RULE_variable);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(222);
                variableType();
                setState(223);
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
        enterRule(_localctx, 54, RULE_variableDeclarationStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(225);
                variableDeclaration();
                setState(226);
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
        enterRule(_localctx, 56, RULE_variableDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                variableType();
                setState(229);
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
        enterRule(_localctx, 58, RULE_variableDeclarators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(231);
                variableDeclarator();
                setState(236);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(232);
                            match(COMMA);
                            setState(233);
                            variableDeclarator();
                        }
                    }
                    setState(238);
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
        enterRule(_localctx, 60, RULE_variableDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                match(IDENT);
                setState(242);
                _la = _input.LA(1);
                if (_la == EQUAL) {
                    {
                        setState(240);
                        match(EQUAL);
                        setState(241);
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
        enterRule(_localctx, 62, RULE_variableInitializer);
        try {
            setState(246);
            switch (_input.LA(1)) {
                case LSQUARE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(244);
                    arrayInitializer();
                }
                break;
                case LPAREN:
                case MINUS:
                case NUM_INT:
                case IDENT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(245);
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
        int _startState = 64;
        enterRecursionRule(_localctx, 64, RULE_ariphExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(249);
                    ariphTerm(0);
                }
                _ctx.stop = _input.LT(-1);
                setState(256);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new AriphExpressionContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_ariphExpression);
                                setState(251);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(252);
                                ((AriphExpressionContext) _localctx).sign = _input.LT(1);
                                _la = _input.LA(1);
                                if (!(_la == PLUS || _la == MINUS)) {
                                    ((AriphExpressionContext) _localctx).sign = (Token) _errHandler.recoverInline(this);
                                }
                                consume();
                                setState(253);
                                ariphTerm(0);
                            }
                        }
                    }
                    setState(258);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
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
        int _startState = 66;
        enterRecursionRule(_localctx, 66, RULE_ariphTerm, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(260);
                    ariphFactor();
                }
                _ctx.stop = _input.LT(-1);
                setState(267);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new AriphTermContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_ariphTerm);
                                setState(262);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(263);
                                ((AriphTermContext) _localctx).sign = _input.LT(1);
                                _la = _input.LA(1);
                                if (!(_la == STAR || _la == SLASH)) {
                                    ((AriphTermContext) _localctx).sign = (Token) _errHandler.recoverInline(this);
                                }
                                consume();
                                setState(264);
                                ariphFactor();
                            }
                        }
                    }
                    setState(269);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
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
        enterRule(_localctx, 68, RULE_ariphFactor);
        try {
            setState(274);
            switch (_input.LA(1)) {
                case NUM_INT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(270);
                    ((AriphFactorContext) _localctx).num = match(NUM_INT);
                }
                break;
                case MINUS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(271);
                    ((AriphFactorContext) _localctx).unary = match(MINUS);
                    setState(272);
                    ariphFactor();
                }
                break;
                case LPAREN:
                case IDENT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(273);
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
            case 32:
                return ariphExpression_sempred((AriphExpressionContext) _localctx, predIndex);
            case 33:
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0117\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\3\3\3\3\4\3" +
                    "\4\3\4\3\4\3\4\3\5\3\5\5\5Y\n\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7a\n\7\f\7\16" +
                    "\7d\13\7\3\7\3\7\3\b\3\b\5\bj\n\b\3\t\3\t\5\tn\n\t\3\t\3\t\3\t\3\t\3\t" +
                    "\3\t\5\tv\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\n\3\n\3\n\3\n" +
                    "\3\13\5\13\u0087\n\13\3\13\3\13\5\13\u008b\n\13\3\13\3\13\5\13\u008f\n" +
                    "\13\3\f\3\f\5\f\u0093\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3" +
                    "\17\5\17\u009f\n\17\5\17\u00a1\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21" +
                    "\3\21\5\21\u00ab\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00b5" +
                    "\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00c1\n\26" +
                    "\3\26\3\26\3\26\3\26\5\26\u00c7\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30" +
                    "\7\30\u00d0\n\30\f\30\16\30\u00d3\13\30\3\31\3\31\3\31\7\31\u00d8\n\31" +
                    "\f\31\16\31\u00db\13\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3" +
                    "\35\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u00ed\n\37\f\37\16\37\u00f0\13" +
                    "\37\3 \3 \3 \5 \u00f5\n \3!\3!\5!\u00f9\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"" +
                    "\u0101\n\"\f\"\16\"\u0104\13\"\3#\3#\3#\3#\3#\3#\7#\u010c\n#\f#\16#\u010f" +
                    "\13#\3$\3$\3$\3$\5$\u0115\n$\3$\2\4BD%\2\4\6\b\n\f\16\20\22\24\26\30\32" +
                    "\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\6\3\2\3\5\3\2\4\5\3\2\16\17\3\2" +
                    "\20\21\u0113\2L\3\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\bV\3\2\2\2\n\\\3\2\2\2\f" +
                    "^\3\2\2\2\16i\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24\u0086\3\2\2\2\26\u0092" +
                    "\3\2\2\2\30\u0094\3\2\2\2\32\u0096\3\2\2\2\34\u00a0\3\2\2\2\36\u00a4\3" +
                    "\2\2\2 \u00aa\3\2\2\2\"\u00ac\3\2\2\2$\u00b1\3\2\2\2&\u00b6\3\2\2\2(\u00ba" +
                    "\3\2\2\2*\u00c6\3\2\2\2,\u00c8\3\2\2\2.\u00cc\3\2\2\2\60\u00d4\3\2\2\2" +
                    "\62\u00dc\3\2\2\2\64\u00de\3\2\2\2\66\u00e0\3\2\2\28\u00e3\3\2\2\2:\u00e6" +
                    "\3\2\2\2<\u00e9\3\2\2\2>\u00f1\3\2\2\2@\u00f8\3\2\2\2B\u00fa\3\2\2\2D" +
                    "\u0105\3\2\2\2F\u0114\3\2\2\2HK\5\6\4\2IK\5\4\3\2JH\3\2\2\2JI\3\2\2\2" +
                    "KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\3\3\2\2\2NL\3\2\2\2OP\58\35\2P\5\3\2\2" +
                    "\2QR\5\62\32\2RS\7\'\2\2ST\5\b\5\2TU\5\n\6\2U\7\3\2\2\2VX\7\t\2\2WY\5" +
                    "\60\31\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\n\2\2[\t\3\2\2\2\\]\5\f\7\2" +
                    "]\13\3\2\2\2^b\7\7\2\2_a\5\16\b\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2" +
                    "\2\2ce\3\2\2\2db\3\2\2\2ef\7\b\2\2f\r\3\2\2\2gj\58\35\2hj\5\20\t\2ig\3" +
                    "\2\2\2ih\3\2\2\2j\17\3\2\2\2k~\5\f\7\2ln\5 \21\2ml\3\2\2\2mn\3\2\2\2n" +
                    "o\3\2\2\2o~\7$\2\2pq\7\35\2\2qr\5\32\16\2ru\5\20\t\2st\7\36\2\2tv\5\20" +
                    "\t\2us\3\2\2\2uv\3\2\2\2v~\3\2\2\2w~\5\22\n\2xy\7 \2\2yz\5\32\16\2z{\5" +
                    "\20\t\2{~\3\2\2\2|~\5\34\17\2}k\3\2\2\2}m\3\2\2\2}p\3\2\2\2}w\3\2\2\2" +
                    "}x\3\2\2\2}|\3\2\2\2~\21\3\2\2\2\177\u0080\7\37\2\2\u0080\u0081\7\t\2" +
                    "\2\u0081\u0082\5\24\13\2\u0082\u0083\7\n\2\2\u0083\u0084\5\20\t\2\u0084" +
                    "\23\3\2\2\2\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2" +
                    "\2\u0087\u0088\3\2\2\2\u0088\u008a\7$\2\2\u0089\u008b\5 \21\2\u008a\u0089" +
                    "\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\7$\2\2\u008d" +
                    "\u008f\5\30\r\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\25\3\2\2" +
                    "\2\u0090\u0093\5:\36\2\u0091\u0093\5.\30\2\u0092\u0090\3\2\2\2\u0092\u0091" +
                    "\3\2\2\2\u0093\27\3\2\2\2\u0094\u0095\5.\30\2\u0095\31\3\2\2\2\u0096\u0097" +
                    "\7\t\2\2\u0097\u0098\5$\23\2\u0098\u0099\7\n\2\2\u0099\33\3\2\2\2\u009a" +
                    "\u00a1\7\"\2\2\u009b\u00a1\7!\2\2\u009c\u009e\7\6\2\2\u009d\u009f\5 \21" +
                    "\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009a" +
                    "\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2" +
                    "\u00a3\7$\2\2\u00a3\35\3\2\2\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\5.\30" +
                    "\2\u00a6\u00a7\7\f\2\2\u00a7\37\3\2\2\2\u00a8\u00ab\5\"\22\2\u00a9\u00ab" +
                    "\5B\"\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab!\3\2\2\2\u00ac\u00ad" +
                    "\7\'\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00af\5.\30\2\u00af\u00b0\7\n\2\2\u00b0" +
                    "#\3\2\2\2\u00b1\u00b4\5&\24\2\u00b2\u00b3\7\32\2\2\u00b3\u00b5\5&\24\2" +
                    "\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5%\3\2\2\2\u00b6\u00b7\5" +
                    "(\25\2\u00b7\u00b8\7\33\2\2\u00b8\u00b9\5(\25\2\u00b9\'\3\2\2\2\u00ba" +
                    "\u00bb\5B\"\2\u00bb\u00bc\7\31\2\2\u00bc\u00bd\5B\"\2\u00bd)\3\2\2\2\u00be" +
                    "\u00c0\7\'\2\2\u00bf\u00c1\5,\27\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2" +
                    "\2\2\u00c1\u00c7\3\2\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\5 \21\2\u00c4" +
                    "\u00c5\7\n\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c2\3\2" +
                    "\2\2\u00c7+\3\2\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\7&\2\2\u00ca\u00cb" +
                    "\7\f\2\2\u00cb-\3\2\2\2\u00cc\u00d1\5 \21\2\u00cd\u00ce\7\22\2\2\u00ce" +
                    "\u00d0\5 \21\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2" +
                    "\2\2\u00d1\u00d2\3\2\2\2\u00d2/\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d9" +
                    "\5\66\34\2\u00d5\u00d6\7\22\2\2\u00d6\u00d8\5\66\34\2\u00d7\u00d5\3\2" +
                    "\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da" +
                    "\61\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\t\2\2\2\u00dd\63\3\2\2\2\u00de" +
                    "\u00df\t\3\2\2\u00df\65\3\2\2\2\u00e0\u00e1\5\64\33\2\u00e1\u00e2\7\'" +
                    "\2\2\u00e2\67\3\2\2\2\u00e3\u00e4\5:\36\2\u00e4\u00e5\7$\2\2\u00e59\3" +
                    "\2\2\2\u00e6\u00e7\5\64\33\2\u00e7\u00e8\5<\37\2\u00e8;\3\2\2\2\u00e9" +
                    "\u00ee\5> \2\u00ea\u00eb\7\22\2\2\u00eb\u00ed\5> \2\u00ec\u00ea\3\2\2" +
                    "\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef=" +
                    "\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\7\'\2\2\u00f2\u00f3\7\r\2\2\u00f3" +
                    "\u00f5\5@!\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5?\3\2\2\2\u00f6" +
                    "\u00f9\5\36\20\2\u00f7\u00f9\5 \21\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3" +
                    "\2\2\2\u00f9A\3\2\2\2\u00fa\u00fb\b\"\1\2\u00fb\u00fc\5D#\2\u00fc\u0102" +
                    "\3\2\2\2\u00fd\u00fe\f\4\2\2\u00fe\u00ff\t\4\2\2\u00ff\u0101\5D#\2\u0100" +
                    "\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2" +
                    "\2\2\u0103C\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\b#\1\2\u0106\u0107" +
                    "\5F$\2\u0107\u010d\3\2\2\2\u0108\u0109\f\4\2\2\u0109\u010a\t\5\2\2\u010a" +
                    "\u010c\5F$\2\u010b\u0108\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2" +
                    "\2\u010d\u010e\3\2\2\2\u010eE\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0115" +
                    "\7&\2\2\u0111\u0112\7\17\2\2\u0112\u0115\5F$\2\u0113\u0115\5*\26\2\u0114" +
                    "\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0113\3\2\2\2\u0115G\3\2\2\2" +
                    "\34JLXbimu}\u0086\u008a\u008e\u0092\u009e\u00a0\u00aa\u00b4\u00c0\u00c6" +
                    "\u00d1\u00d9\u00ee\u00f4\u00f8\u0102\u010d\u0114";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}