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
            COMMA = 16, LE = 17, GE = 18, EE = 19, NE = 20, LESS = 21, MORE = 22, REL_OP = 23, OR = 24,
            AND = 25, IF = 26, ELSE = 27, FOR = 28, WHILE = 29, BREAK = 30, CONTINUE = 31, SEMICOLON = 32,
            DOT = 33, NUM_INT = 34, IDENT = 35, LITERAL = 36, WS = 37;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] tokenNames = {
            "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'",
            "'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'",
            "'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
            "'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'",
            "'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'",
            "'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'"
    };
    public static final String[] ruleNames = {
            "VOID", "INT", "LIST", "RETURN", "LCURLY", "RCURLY", "LPAREN", "RPAREN",
            "LSQUARE", "RSQUARE", "EQUAL", "PLUS", "MINUS", "STAR", "SLASH", "COMMA",
            "LE", "GE", "EE", "NE", "LESS", "MORE", "REL_OP", "OR", "AND", "IF", "ELSE",
            "FOR", "WHILE", "BREAK", "CONTINUE", "SEMICOLON", "DOT", "NUM_INT", "IDENT",
            "LITERAL", "WS"
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u00d4\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3" +
                    "\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b" +
                    "\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20" +
                    "\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25" +
                    "\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0091\n\30" +
                    "\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34" +
                    "\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37" +
                    "\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\6#\u00bf\n#\r#" +
                    "\16#\u00c0\3$\3$\3$\3$\7$\u00c7\n$\f$\16$\u00ca\13$\3%\3%\3&\6&\u00cf" +
                    "\n&\r&\16&\u00d0\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13" +
                    "\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61" +
                    "\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\4\4\2C\\c|\5\2\13" +
                    "\f\17\17\"\"\u00dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13" +
                    "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2" +
                    "\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2" +
                    "!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3" +
                    "\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2" +
                    "\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E" +
                    "\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5R\3\2\2\2\7V\3\2" +
                    "\2\2\t[\3\2\2\2\13b\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2" +
                    "\2\2\25l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37v\3" +
                    "\2\2\2!x\3\2\2\2#z\3\2\2\2%}\3\2\2\2\'\u0080\3\2\2\2)\u0083\3\2\2\2+\u0086" +
                    "\3\2\2\2-\u0088\3\2\2\2/\u0090\3\2\2\2\61\u0092\3\2\2\2\63\u0095\3\2\2" +
                    "\2\65\u0098\3\2\2\2\67\u009b\3\2\2\29\u00a0\3\2\2\2;\u00a4\3\2\2\2=\u00aa" +
                    "\3\2\2\2?\u00b0\3\2\2\2A\u00b9\3\2\2\2C\u00bb\3\2\2\2E\u00be\3\2\2\2G" +
                    "\u00c2\3\2\2\2I\u00cb\3\2\2\2K\u00ce\3\2\2\2MN\7x\2\2NO\7q\2\2OP\7k\2" +
                    "\2PQ\7f\2\2Q\4\3\2\2\2RS\7k\2\2ST\7p\2\2TU\7v\2\2U\6\3\2\2\2VW\7N\2\2" +
                    "WX\7k\2\2XY\7u\2\2YZ\7v\2\2Z\b\3\2\2\2[\\\7t\2\2\\]\7g\2\2]^\7v\2\2^_" +
                    "\7w\2\2_`\7t\2\2`a\7p\2\2a\n\3\2\2\2bc\7}\2\2c\f\3\2\2\2de\7\177\2\2e" +
                    "\16\3\2\2\2fg\7*\2\2g\20\3\2\2\2hi\7+\2\2i\22\3\2\2\2jk\7]\2\2k\24\3\2" +
                    "\2\2lm\7_\2\2m\26\3\2\2\2no\7?\2\2o\30\3\2\2\2pq\7-\2\2q\32\3\2\2\2rs" +
                    "\7/\2\2s\34\3\2\2\2tu\7,\2\2u\36\3\2\2\2vw\7\61\2\2w \3\2\2\2xy\7.\2\2" +
                    "y\"\3\2\2\2z{\7>\2\2{|\7?\2\2|$\3\2\2\2}~\7@\2\2~\177\7?\2\2\177&\3\2" +
                    "\2\2\u0080\u0081\7?\2\2\u0081\u0082\7?\2\2\u0082(\3\2\2\2\u0083\u0084" +
                    "\7#\2\2\u0084\u0085\7?\2\2\u0085*\3\2\2\2\u0086\u0087\7>\2\2\u0087,\3" +
                    "\2\2\2\u0088\u0089\7@\2\2\u0089.\3\2\2\2\u008a\u0091\5\'\24\2\u008b\u0091" +
                    "\5)\25\2\u008c\u0091\5%\23\2\u008d\u0091\5#\22\2\u008e\u0091\5+\26\2\u008f" +
                    "\u0091\5-\27\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2" +
                    "\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091" +
                    "\60\3\2\2\2\u0092\u0093\7~\2\2\u0093\u0094\7~\2\2\u0094\62\3\2\2\2\u0095" +
                    "\u0096\7(\2\2\u0096\u0097\7(\2\2\u0097\64\3\2\2\2\u0098\u0099\7k\2\2\u0099" +
                    "\u009a\7h\2\2\u009a\66\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d" +
                    "\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f8\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1" +
                    "\u00a2\7q\2\2\u00a2\u00a3\7t\2\2\u00a3:\3\2\2\2\u00a4\u00a5\7y\2\2\u00a5" +
                    "\u00a6\7j\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7g\2\2" +
                    "\u00a9<\3\2\2\2\u00aa\u00ab\7d\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2" +
                    "\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7m\2\2\u00af>\3\2\2\2\u00b0\u00b1\7" +
                    "e\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5" +
                    "\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7g\2\2\u00b8" +
                    "@\3\2\2\2\u00b9\u00ba\7=\2\2\u00baB\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc" +
                    "D\3\2\2\2\u00bd\u00bf\4\62;\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2" +
                    "\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1F\3\2\2\2\u00c2\u00c8\5" +
                    "I%\2\u00c3\u00c7\5I%\2\u00c4\u00c7\5E#\2\u00c5\u00c7\7a\2\2\u00c6\u00c3" +
                    "\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8" +
                    "\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9H\3\2\2\2\u00ca\u00c8\3\2\2\2" +
                    "\u00cb\u00cc\t\2\2\2\u00ccJ\3\2\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cd\3" +
                    "\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1" +
                    "\u00d2\3\2\2\2\u00d2\u00d3\b&\2\2\u00d3L\3\2\2\2\b\2\u0090\u00c0\u00c6" +
                    "\u00c8\u00d0\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}