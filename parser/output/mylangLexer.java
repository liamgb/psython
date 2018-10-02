// $ANTLR null C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g 2018-09-18 11:35:32

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int BOOL=4;
	public static final int CHAR=5;
	public static final int ENDL=6;
	public static final int ESC_SEQ=7;
	public static final int HEX_DIGIT=8;
	public static final int ID=9;
	public static final int INT=10;
	public static final int OCTAL_ESC=11;
	public static final int PASS=12;
	public static final int STRING=13;
	public static final int TAB=14;
	public static final int UNICODE_ESC=15;
	public static final int WS=16;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylangLexer() {} 
	public mylangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g"; }

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:2:7: ( '(' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:3:7: ( ')' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:4:7: ( '*' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:5:7: ( '+' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:6:7: ( ',' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:6:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:7:7: ( '-' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:8:7: ( '/' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:8:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:9:7: ( ':' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:9:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:10:7: ( '<' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:10:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:11:7: ( '<=' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:11:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:12:7: ( '=' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:12:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:13:7: ( '==' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:13:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:14:7: ( '>' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:14:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:15:7: ( '>=' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:15:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:16:7: ( 'and' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:16:9: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:17:7: ( 'def' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:17:9: 'def'
			{
			match("def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:18:7: ( 'elif' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:18:9: 'elif'
			{
			match("elif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:19:7: ( 'else' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:19:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:20:7: ( 'if' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:20:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:21:7: ( 'not' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:21:9: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:22:7: ( 'or' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:22:9: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:23:7: ( 'print' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:23:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:24:7: ( 'return' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:24:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:25:7: ( 'while' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:25:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "PASS"
	public final void mPASS() throws RecognitionException {
		try {
			int _type = PASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:96:7: ( 'pass' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:96:9: 'pass'
			{
			match("pass"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PASS"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:99:7: ( 'True' | 'False' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='T') ) {
				alt1=1;
			}
			else if ( (LA1_0=='F') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:99:9: 'True'
					{
					match("True"); 

					}
					break;
				case 2 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:99:18: 'False'
					{
					match("False"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:102:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:102:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:102:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:105:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:105:7: ( '0' .. '9' )+
			{
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:105:7: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:108:5: ( ( ' ' | '\\r' ) )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:108:9: ( ' ' | '\\r' )
			{
			if ( input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:116:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:116:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:116:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\\') ) {
					alt4=1;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:116:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:116:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:119:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:119:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:119:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\\') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:119:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:119:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "TAB"
	public final void mTAB() throws RecognitionException {
		try {
			int _type = TAB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:122:6: ( '\\t' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:122:8: '\\t'
			{
			match('\t'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAB"

	// $ANTLR start "ENDL"
	public final void mENDL() throws RecognitionException {
		try {
			int _type = ENDL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:128:7: ( '\\n' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:128:9: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDL"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:136:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:140:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt6=3;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt6=1;
					}
					break;
				case 'u':
					{
					alt6=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt6=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:140:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:141:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:142:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:147:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\\') ) {
				int LA7_1 = input.LA(2);
				if ( ((LA7_1 >= '0' && LA7_1 <= '3')) ) {
					int LA7_2 = input.LA(3);
					if ( ((LA7_2 >= '0' && LA7_2 <= '7')) ) {
						int LA7_4 = input.LA(4);
						if ( ((LA7_4 >= '0' && LA7_4 <= '7')) ) {
							alt7=1;
						}

						else {
							alt7=2;
						}

					}

					else {
						alt7=3;
					}

				}
				else if ( ((LA7_1 >= '4' && LA7_1 <= '7')) ) {
					int LA7_3 = input.LA(3);
					if ( ((LA7_3 >= '0' && LA7_3 <= '7')) ) {
						alt7=2;
					}

					else {
						alt7=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:147:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:148:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:149:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:154:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:154:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | PASS | BOOL | ID | INT | WS | STRING | CHAR | TAB | ENDL )
		int alt8=33;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:10: T__17
				{
				mT__17(); 

				}
				break;
			case 2 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:16: T__18
				{
				mT__18(); 

				}
				break;
			case 3 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:22: T__19
				{
				mT__19(); 

				}
				break;
			case 4 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:28: T__20
				{
				mT__20(); 

				}
				break;
			case 5 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:34: T__21
				{
				mT__21(); 

				}
				break;
			case 6 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:40: T__22
				{
				mT__22(); 

				}
				break;
			case 7 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:46: T__23
				{
				mT__23(); 

				}
				break;
			case 8 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:52: T__24
				{
				mT__24(); 

				}
				break;
			case 9 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:58: T__25
				{
				mT__25(); 

				}
				break;
			case 10 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:64: T__26
				{
				mT__26(); 

				}
				break;
			case 11 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:70: T__27
				{
				mT__27(); 

				}
				break;
			case 12 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:76: T__28
				{
				mT__28(); 

				}
				break;
			case 13 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:82: T__29
				{
				mT__29(); 

				}
				break;
			case 14 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:88: T__30
				{
				mT__30(); 

				}
				break;
			case 15 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:94: T__31
				{
				mT__31(); 

				}
				break;
			case 16 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:100: T__32
				{
				mT__32(); 

				}
				break;
			case 17 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:106: T__33
				{
				mT__33(); 

				}
				break;
			case 18 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:112: T__34
				{
				mT__34(); 

				}
				break;
			case 19 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:118: T__35
				{
				mT__35(); 

				}
				break;
			case 20 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:124: T__36
				{
				mT__36(); 

				}
				break;
			case 21 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:130: T__37
				{
				mT__37(); 

				}
				break;
			case 22 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:136: T__38
				{
				mT__38(); 

				}
				break;
			case 23 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:142: T__39
				{
				mT__39(); 

				}
				break;
			case 24 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:148: T__40
				{
				mT__40(); 

				}
				break;
			case 25 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:154: PASS
				{
				mPASS(); 

				}
				break;
			case 26 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:159: BOOL
				{
				mBOOL(); 

				}
				break;
			case 27 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:164: ID
				{
				mID(); 

				}
				break;
			case 28 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:167: INT
				{
				mINT(); 

				}
				break;
			case 29 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:171: WS
				{
				mWS(); 

				}
				break;
			case 30 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:174: STRING
				{
				mSTRING(); 

				}
				break;
			case 31 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:181: CHAR
				{
				mCHAR(); 

				}
				break;
			case 32 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:186: TAB
				{
				mTAB(); 

				}
				break;
			case 33 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\parser\\mylang.g:1:190: ENDL
				{
				mENDL(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\11\uffff\1\37\1\41\1\43\13\27\15\uffff\3\27\1\64\1\27\1\66\6\27\1\75"+
		"\1\76\2\27\1\uffff\1\101\1\uffff\6\27\2\uffff\1\110\1\111\1\uffff\1\27"+
		"\1\113\2\27\1\116\1\27\2\uffff\1\120\1\uffff\1\27\1\122\1\uffff\1\116"+
		"\1\uffff\1\123\2\uffff";
	static final String DFA8_eofS =
		"\124\uffff";
	static final String DFA8_minS =
		"\1\11\10\uffff\3\75\1\156\1\145\1\154\1\146\1\157\1\162\1\141\1\145\1"+
		"\150\1\162\1\141\15\uffff\1\144\1\146\1\151\1\60\1\164\1\60\1\151\1\163"+
		"\1\164\1\151\1\165\1\154\2\60\1\146\1\145\1\uffff\1\60\1\uffff\1\156\1"+
		"\163\1\165\1\154\1\145\1\163\2\uffff\2\60\1\uffff\1\164\1\60\1\162\1\145"+
		"\1\60\1\145\2\uffff\1\60\1\uffff\1\156\1\60\1\uffff\1\60\1\uffff\1\60"+
		"\2\uffff";
	static final String DFA8_maxS =
		"\1\172\10\uffff\3\75\1\156\1\145\1\154\1\146\1\157\2\162\1\145\1\150\1"+
		"\162\1\141\15\uffff\1\144\1\146\1\163\1\172\1\164\1\172\1\151\1\163\1"+
		"\164\1\151\1\165\1\154\2\172\1\146\1\145\1\uffff\1\172\1\uffff\1\156\1"+
		"\163\1\165\1\154\1\145\1\163\2\uffff\2\172\1\uffff\1\164\1\172\1\162\1"+
		"\145\1\172\1\145\2\uffff\1\172\1\uffff\1\156\1\172\1\uffff\1\172\1\uffff"+
		"\1\172\2\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\16\uffff\1\33\1\34\1\35\1\36"+
		"\1\37\1\40\1\41\1\12\1\11\1\14\1\13\1\16\1\15\20\uffff\1\23\1\uffff\1"+
		"\25\6\uffff\1\17\1\20\2\uffff\1\24\6\uffff\1\21\1\22\1\uffff\1\31\2\uffff"+
		"\1\32\1\uffff\1\26\1\uffff\1\30\1\27";
	static final String DFA8_specialS =
		"\124\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\34\1\35\2\uffff\1\31\22\uffff\1\31\1\uffff\1\32\4\uffff\1\33\1\1\1"+
			"\2\1\3\1\4\1\5\1\6\1\uffff\1\7\12\30\1\10\1\uffff\1\11\1\12\1\13\2\uffff"+
			"\5\27\1\26\15\27\1\25\6\27\4\uffff\1\27\1\uffff\1\14\2\27\1\15\1\16\3"+
			"\27\1\17\4\27\1\20\1\21\1\22\1\27\1\23\4\27\1\24\3\27",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"\1\40",
			"\1\42",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\53\20\uffff\1\52",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62\11\uffff\1\63",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\65",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\77",
			"\1\100",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\112",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\114",
			"\1\115",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\117",
			"",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\121",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | PASS | BOOL | ID | INT | WS | STRING | CHAR | TAB | ENDL );";
		}
	}

}
