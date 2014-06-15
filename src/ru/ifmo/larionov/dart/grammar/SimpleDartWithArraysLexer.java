// Generated from D:\workspace\DartTranslator\src\ru\ifmo\larionov\dart\grammar\SimpleDartWithArrays.g4 by ANTLR 4.x
package ru.ifmo.larionov.dart.grammar;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleDartWithArraysLexer extends Lexer {
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            VOID = 1, INT = 2, LIST = 3, RETURN = 4, LCURLY = 5, RCURLY = 6, LPAREN = 7, RPAREN = 8,
            LSQUARE = 9, RSQUARE = 10, EQUAL = 11, PLUS = 12, MINUS = 13, STAR = 14, SLASH = 15,
            COMMA = 16, LE = 17, GE = 18, EE = 19, NE = 20, LESS = 21, MORE = 22, NOT = 23, TRUE = 24,
            FALSE = 25, OR = 26, AND = 27, IF = 28, ELSE = 29, FOR = 30, WHILE = 31, BREAK = 32, CONTINUE = 33,
            SEMICOLON = 34, DOT = 35, NUM_INT = 36, IDENT = 37, LITERAL = 38, WS = 39;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] tokenNames = {
            "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'",
            "'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'",
            "'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
            "'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'",
            "'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'",
            "'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''"
    };
    public static final String[] ruleNames = {
            "VOID", "INT", "LIST", "RETURN", "LCURLY", "RCURLY", "LPAREN", "RPAREN",
            "LSQUARE", "RSQUARE", "EQUAL", "PLUS", "MINUS", "STAR", "SLASH", "COMMA",
            "LE", "GE", "EE", "NE", "LESS", "MORE", "NOT", "TRUE", "FALSE", "OR",
            "AND", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "SEMICOLON",
            "DOT", "NUM_INT", "IDENT", "LITERAL", "WS"
    };


    public SimpleDartWithArraysLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

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
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00dd\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2" +
                    "\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3" +
                    "\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16" +
                    "\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24" +
                    "\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31" +
                    "\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35" +
                    "\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3" +
                    " \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3" +
                    "$\3%\6%\u00c8\n%\r%\16%\u00c9\3&\3&\3&\3&\7&\u00d0\n&\f&\16&\u00d3\13" +
                    "&\3\'\3\'\3(\6(\u00d8\n(\r(\16(\u00d9\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7" +
                    "\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25" +
                    ")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O" +
                    ")\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7" +
                    "\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2" +
                    "\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2" +
                    "\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2" +
                    "\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2" +
                    "\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2" +
                    "\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M" +
                    "\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5V\3\2\2\2\7Z\3\2\2\2\t_\3\2\2\2\13f\3" +
                    "\2\2\2\rh\3\2\2\2\17j\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27r" +
                    "\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!|\3\2\2\2#~\3" +
                    "\2\2\2%\u0081\3\2\2\2\'\u0084\3\2\2\2)\u0087\3\2\2\2+\u008a\3\2\2\2-\u008c" +
                    "\3\2\2\2/\u008e\3\2\2\2\61\u0090\3\2\2\2\63\u0095\3\2\2\2\65\u009b\3\2" +
                    "\2\2\67\u009e\3\2\2\29\u00a1\3\2\2\2;\u00a4\3\2\2\2=\u00a9\3\2\2\2?\u00ad" +
                    "\3\2\2\2A\u00b3\3\2\2\2C\u00b9\3\2\2\2E\u00c2\3\2\2\2G\u00c4\3\2\2\2I" +
                    "\u00c7\3\2\2\2K\u00cb\3\2\2\2M\u00d4\3\2\2\2O\u00d7\3\2\2\2QR\7x\2\2R" +
                    "S\7q\2\2ST\7k\2\2TU\7f\2\2U\4\3\2\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\6\3" +
                    "\2\2\2Z[\7N\2\2[\\\7k\2\2\\]\7u\2\2]^\7v\2\2^\b\3\2\2\2_`\7t\2\2`a\7g" +
                    "\2\2ab\7v\2\2bc\7w\2\2cd\7t\2\2de\7p\2\2e\n\3\2\2\2fg\7}\2\2g\f\3\2\2" +
                    "\2hi\7\177\2\2i\16\3\2\2\2jk\7*\2\2k\20\3\2\2\2lm\7+\2\2m\22\3\2\2\2n" +
                    "o\7]\2\2o\24\3\2\2\2pq\7_\2\2q\26\3\2\2\2rs\7?\2\2s\30\3\2\2\2tu\7-\2" +
                    "\2u\32\3\2\2\2vw\7/\2\2w\34\3\2\2\2xy\7,\2\2y\36\3\2\2\2z{\7\61\2\2{ " +
                    "\3\2\2\2|}\7.\2\2}\"\3\2\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080$\3\2\2" +
                    "\2\u0081\u0082\7@\2\2\u0082\u0083\7?\2\2\u0083&\3\2\2\2\u0084\u0085\7" +
                    "?\2\2\u0085\u0086\7?\2\2\u0086(\3\2\2\2\u0087\u0088\7#\2\2\u0088\u0089" +
                    "\7?\2\2\u0089*\3\2\2\2\u008a\u008b\7>\2\2\u008b,\3\2\2\2\u008c\u008d\7" +
                    "@\2\2\u008d.\3\2\2\2\u008e\u008f\7#\2\2\u008f\60\3\2\2\2\u0090\u0091\7" +
                    "v\2\2\u0091\u0092\7t\2\2\u0092\u0093\7w\2\2\u0093\u0094\7g\2\2\u0094\62" +
                    "\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098" +
                    "\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\64\3\2\2\2\u009b\u009c\7~\2\2\u009c" +
                    "\u009d\7~\2\2\u009d\66\3\2\2\2\u009e\u009f\7(\2\2\u009f\u00a0\7(\2\2\u00a0" +
                    "8\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7h\2\2\u00a3:\3\2\2\2\u00a4\u00a5" +
                    "\7g\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8" +
                    "<\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac" +
                    ">\3\2\2\2\u00ad\u00ae\7y\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7k\2\2\u00b0" +
                    "\u00b1\7n\2\2\u00b1\u00b2\7g\2\2\u00b2@\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4" +
                    "\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7m\2\2" +
                    "\u00b8B\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7p\2" +
                    "\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0" +
                    "\7w\2\2\u00c0\u00c1\7g\2\2\u00c1D\3\2\2\2\u00c2\u00c3\7=\2\2\u00c3F\3" +
                    "\2\2\2\u00c4\u00c5\7\60\2\2\u00c5H\3\2\2\2\u00c6\u00c8\4\62;\2\u00c7\u00c6" +
                    "\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca" +
                    "J\3\2\2\2\u00cb\u00d1\5M\'\2\u00cc\u00d0\5M\'\2\u00cd\u00d0\5I%\2\u00ce" +
                    "\u00d0\7a\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2" +
                    "\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2" +
                    "L\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5N\3\2\2\2\u00d6" +
                    "\u00d8\t\3\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2" +
                    "\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b(\2\2\u00dc" +
                    "P\3\2\2\2\7\2\u00c9\u00cf\u00d1\u00d9\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}