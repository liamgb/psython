// $ANTLR null C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g 2018-09-15 11:44:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__16=16;
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
	public static final int BOOL=4;
	public static final int CHAR=5;
	public static final int ENDL=6;
	public static final int ESC_SEQ=7;
	public static final int HEX_DIGIT=8;
	public static final int ID=9;
	public static final int INT=10;
	public static final int OCTAL_ESC=11;
	public static final int STRING=12;
	public static final int TAB=13;
	public static final int UNICODE_ESC=14;
	public static final int WS=15;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g"; }

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:2:7: ( '(' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:2:9: '('
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:3:7: ( ')' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:3:9: ')'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:4:7: ( ',' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:4:9: ','
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:5:7: ( ':' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:5:9: ':'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:6:7: ( '=' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:6:9: '='
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:7:7: ( 'arithmetic' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:7:9: 'arithmetic'
			{
			match("arithmetic"); 

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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:8:7: ( 'def' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:8:9: 'def'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:9:7: ( 'if_then_else' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:9:9: 'if_then_else'
			{
			match("if_then_else"); 

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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:10:7: ( 'logical' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:10:9: 'logical'
			{
			match("logical"); 

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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:11:7: ( 'print' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:11:9: 'print'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:12:7: ( 'realtional' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:12:9: 'realtional'
			{
			match("realtional"); 

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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:13:7: ( 'return' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:13:9: 'return'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:14:7: ( 'while' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:14:9: 'while'
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
	// $ANTLR end "T__28"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:102:7: ( 'True' | 'False' )
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
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:102:9: 'True'
					{
					match("True"); 

					}
					break;
				case 2 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:102:18: 'False'
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:105:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:105:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:105:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:108:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:108:7: ( '0' .. '9' )+
			{
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:108:7: ( '0' .. '9' )+
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
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:111:5: ( ( ' ' | '\\r' ) )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:111:9: ( ' ' | '\\r' )
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:119:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:119:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:119:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:119:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:119:24: ~ ( '\\\\' | '\"' )
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:122:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:122:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:122:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
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
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:122:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:122:25: ~ ( '\\'' | '\\\\' )
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:125:6: ( '\\t' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:125:8: '\\t'
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:131:7: ( '\\n' )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:131:9: '\\n'
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:139:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:143:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:143:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:144:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:145:9: OCTAL_ESC
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:150:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:150:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:151:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:152:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:157:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:157:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
		// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | BOOL | ID | INT | WS | STRING | CHAR | TAB | ENDL )
		int alt8=21;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:46: T__22
				{
				mT__22(); 

				}
				break;
			case 8 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:52: T__23
				{
				mT__23(); 

				}
				break;
			case 9 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:58: T__24
				{
				mT__24(); 

				}
				break;
			case 10 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:64: T__25
				{
				mT__25(); 

				}
				break;
			case 11 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:70: T__26
				{
				mT__26(); 

				}
				break;
			case 12 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:76: T__27
				{
				mT__27(); 

				}
				break;
			case 13 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:82: T__28
				{
				mT__28(); 

				}
				break;
			case 14 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:88: BOOL
				{
				mBOOL(); 

				}
				break;
			case 15 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:93: ID
				{
				mID(); 

				}
				break;
			case 16 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:96: INT
				{
				mINT(); 

				}
				break;
			case 17 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:100: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:103: STRING
				{
				mSTRING(); 

				}
				break;
			case 19 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:110: CHAR
				{
				mCHAR(); 

				}
				break;
			case 20 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:115: TAB
				{
				mTAB(); 

				}
				break;
			case 21 :
				// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:1:119: ENDL
				{
				mENDL(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\6\uffff\11\17\7\uffff\12\17\1\52\11\17\1\uffff\6\17\1\72\4\17\1\77\2"+
		"\17\1\102\1\uffff\1\72\3\17\1\uffff\1\17\1\107\1\uffff\2\17\1\112\1\17"+
		"\1\uffff\2\17\1\uffff\4\17\1\122\1\17\1\124\1\uffff\1\17\1\uffff\1\126"+
		"\1\uffff";
	static final String DFA8_eofS =
		"\127\uffff";
	static final String DFA8_minS =
		"\1\11\5\uffff\1\162\1\145\1\146\1\157\1\162\1\145\1\150\1\162\1\141\7"+
		"\uffff\1\151\1\146\1\137\1\147\1\151\1\141\1\151\1\165\1\154\1\164\1\60"+
		"\1\164\1\151\1\156\1\154\1\165\1\154\1\145\1\163\1\150\1\uffff\1\150\1"+
		"\143\2\164\1\162\1\145\1\60\1\145\1\155\1\145\1\141\1\60\1\151\1\156\1"+
		"\60\1\uffff\1\60\1\145\1\156\1\154\1\uffff\1\157\1\60\1\uffff\1\164\1"+
		"\137\1\60\1\156\1\uffff\1\151\1\145\1\uffff\1\141\1\143\2\154\1\60\1\163"+
		"\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff";
	static final String DFA8_maxS =
		"\1\172\5\uffff\1\162\1\145\1\146\1\157\1\162\1\145\1\150\1\162\1\141\7"+
		"\uffff\1\151\1\146\1\137\1\147\1\151\1\164\1\151\1\165\1\154\1\164\1\172"+
		"\1\164\1\151\1\156\1\154\1\165\1\154\1\145\1\163\1\150\1\uffff\1\150\1"+
		"\143\2\164\1\162\1\145\1\172\1\145\1\155\1\145\1\141\1\172\1\151\1\156"+
		"\1\172\1\uffff\1\172\1\145\1\156\1\154\1\uffff\1\157\1\172\1\uffff\1\164"+
		"\1\137\1\172\1\156\1\uffff\1\151\1\145\1\uffff\1\141\1\143\2\154\1\172"+
		"\1\163\1\172\1\uffff\1\145\1\uffff\1\172\1\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\11\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1"+
		"\25\24\uffff\1\7\17\uffff\1\16\4\uffff\1\12\2\uffff\1\15\4\uffff\1\14"+
		"\2\uffff\1\11\7\uffff\1\6\1\uffff\1\13\1\uffff\1\10";
	static final String DFA8_specialS =
		"\127\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\24\1\25\2\uffff\1\21\22\uffff\1\21\1\uffff\1\22\4\uffff\1\23\1\1\1"+
			"\2\2\uffff\1\3\3\uffff\12\20\1\4\2\uffff\1\5\3\uffff\5\17\1\16\15\17"+
			"\1\15\6\17\4\uffff\1\17\1\uffff\1\6\2\17\1\7\4\17\1\10\2\17\1\11\3\17"+
			"\1\12\1\17\1\13\4\17\1\14\3\17",
			"",
			"",
			"",
			"",
			"",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44\22\uffff\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\100",
			"\1\101",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\103",
			"\1\104",
			"\1\105",
			"",
			"\1\106",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"",
			"\1\110",
			"\1\111",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\113",
			"",
			"\1\114",
			"\1\115",
			"",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\123",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"",
			"\1\125",
			"",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
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
			return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | BOOL | ID | INT | WS | STRING | CHAR | TAB | ENDL );";
		}
	}

}
