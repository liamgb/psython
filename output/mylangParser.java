// $ANTLR null C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g 2018-09-15 11:44:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class mylangParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "CHAR", "ENDL", "ESC_SEQ", 
		"HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", "TAB", "UNICODE_ESC", 
		"WS", "'('", "')'", "','", "':'", "'='", "'arithmetic'", "'def'", "'if_then_else'", 
		"'logical'", "'print'", "'realtional'", "'return'", "'while'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "statement", "return", "arglist", "arithmetic", "function", 
		"assignment", "idlist", "logical", "expression", "tabs", "relational", 
		"explist", "print", "program", "function_call", "endls", "argument", "if_then_else", 
		"while", "operation", "definition", "literal", "functionbody"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public mylangParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public mylangParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public mylangParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return mylangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g"; }



	// $ANTLR start "program"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:3:1: program : explist ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(3, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:3:9: ( explist )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:3:12: explist
			{
			dbg.location(3,12);
			pushFollow(FOLLOW_explist_in_program11);
			explist();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(4, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "explist"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:6:1: explist : ( expression endls explist |);
	public final void explist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "explist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:6:9: ( expression endls explist |)
			int alt1=2;
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			try {
				isCyclicDecision = true;
				alt1 = dfa1.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:6:11: expression endls explist
					{
					dbg.location(6,11);
					pushFollow(FOLLOW_expression_in_explist21);
					expression();
					state._fsp--;
					dbg.location(6,22);
					pushFollow(FOLLOW_endls_in_explist23);
					endls();
					state._fsp--;
					dbg.location(6,28);
					pushFollow(FOLLOW_explist_in_explist25);
					explist();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:8:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(8, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "explist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "explist"



	// $ANTLR start "expression"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:10:1: expression : ( function_call | definition | operation | statement | ID | literal );
	public final void expression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:11:2: ( function_call | definition | operation | statement | ID | literal )
			int alt2=6;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			try {
				isCyclicDecision = true;
				alt2 = dfa2.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:11:4: function_call
					{
					dbg.location(11,4);
					pushFollow(FOLLOW_function_call_in_expression42);
					function_call();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:12:5: definition
					{
					dbg.location(12,5);
					pushFollow(FOLLOW_definition_in_expression48);
					definition();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:13:4: operation
					{
					dbg.location(13,4);
					pushFollow(FOLLOW_operation_in_expression53);
					operation();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:14:5: statement
					{
					dbg.location(14,5);
					pushFollow(FOLLOW_statement_in_expression59);
					statement();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:15:4: ID
					{
					dbg.location(15,4);
					match(input,ID,FOLLOW_ID_in_expression64); 
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:16:4: literal
					{
					dbg.location(16,4);
					pushFollow(FOLLOW_literal_in_expression69);
					literal();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "function_call"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:19:1: function_call : tabs ID '(' arglist ')' ;
	public final void function_call() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function_call");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:20:2: ( tabs ID '(' arglist ')' )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:20:4: tabs ID '(' arglist ')'
			{
			dbg.location(20,4);
			pushFollow(FOLLOW_tabs_in_function_call81);
			tabs();
			state._fsp--;
			dbg.location(20,9);
			match(input,ID,FOLLOW_ID_in_function_call83); dbg.location(20,12);
			match(input,16,FOLLOW_16_in_function_call85); dbg.location(20,16);
			pushFollow(FOLLOW_arglist_in_function_call87);
			arglist();
			state._fsp--;
			dbg.location(20,24);
			match(input,17,FOLLOW_17_in_function_call89); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(21, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function_call");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_call"



	// $ANTLR start "definition"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:23:1: definition : ( function | assignment );
	public final void definition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:24:2: ( function | assignment )
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			try {
				isCyclicDecision = true;
				alt3 = dfa3.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:24:4: function
					{
					dbg.location(24,4);
					pushFollow(FOLLOW_function_in_definition102);
					function();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:25:5: assignment
					{
					dbg.location(25,5);
					pushFollow(FOLLOW_assignment_in_definition108);
					assignment();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(26, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "definition"



	// $ANTLR start "operation"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:28:1: operation : ( arithmetic | relational | logical );
	public final void operation() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "operation");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:29:2: ( arithmetic | relational | logical )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			switch ( input.LA(1) ) {
			case 21:
				{
				alt4=1;
				}
				break;
			case 26:
				{
				alt4=2;
				}
				break;
			case 24:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:29:4: arithmetic
					{
					dbg.location(29,4);
					pushFollow(FOLLOW_arithmetic_in_operation120);
					arithmetic();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:30:4: relational
					{
					dbg.location(30,4);
					pushFollow(FOLLOW_relational_in_operation125);
					relational();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:31:5: logical
					{
					dbg.location(31,5);
					pushFollow(FOLLOW_logical_in_operation131);
					logical();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(32, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "operation");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "operation"



	// $ANTLR start "statement"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:34:1: statement : ( print | if_then_else | while | return );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:35:2: ( print | if_then_else | while | return )
			int alt5=4;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			try {
				isCyclicDecision = true;
				alt5 = dfa5.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:35:4: print
					{
					dbg.location(35,4);
					pushFollow(FOLLOW_print_in_statement143);
					print();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:36:5: if_then_else
					{
					dbg.location(36,5);
					pushFollow(FOLLOW_if_then_else_in_statement149);
					if_then_else();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:37:4: while
					{
					dbg.location(37,4);
					pushFollow(FOLLOW_while_in_statement154);
					while();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:38:4: return
					{
					dbg.location(38,4);
					pushFollow(FOLLOW_return_in_statement159);
					return();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(39, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "literal"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:41:1: literal : ( tabs | STRING | CHAR | INT | BOOL );
	public final void literal() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "literal");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:42:2: ( tabs | STRING | CHAR | INT | BOOL )
			int alt6=5;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case ENDL:
			case ID:
			case TAB:
			case 18:
			case 22:
			case 25:
			case 27:
				{
				alt6=1;
				}
				break;
			case STRING:
				{
				alt6=2;
				}
				break;
			case CHAR:
				{
				alt6=3;
				}
				break;
			case INT:
				{
				alt6=4;
				}
				break;
			case BOOL:
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:42:4: tabs
					{
					dbg.location(42,4);
					pushFollow(FOLLOW_tabs_in_literal173);
					tabs();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:43:4: STRING
					{
					dbg.location(43,4);
					match(input,STRING,FOLLOW_STRING_in_literal178); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:44:4: CHAR
					{
					dbg.location(44,4);
					match(input,CHAR,FOLLOW_CHAR_in_literal183); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:45:4: INT
					{
					dbg.location(45,4);
					match(input,INT,FOLLOW_INT_in_literal188); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:46:4: BOOL
					{
					dbg.location(46,4);
					match(input,BOOL,FOLLOW_BOOL_in_literal193); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "literal");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "literal"



	// $ANTLR start "return"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:49:1: return : tabs 'return' argument ;
	public final void return() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "return");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:49:9: ( tabs 'return' argument )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:49:11: tabs 'return' argument
			{
			dbg.location(49,11);
			pushFollow(FOLLOW_tabs_in_return205);
			tabs();
			state._fsp--;
			dbg.location(49,16);
			match(input,27,FOLLOW_27_in_return207); dbg.location(49,25);
			pushFollow(FOLLOW_argument_in_return209);
			argument();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(50, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "return");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "return"



	// $ANTLR start "argument"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:52:1: argument : ( ID | literal );
	public final void argument() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "argument");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:53:2: ( ID | literal )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= BOOL && LA7_0 <= ENDL)||LA7_0==INT||(LA7_0 >= STRING && LA7_0 <= TAB)||LA7_0==18) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:53:4: ID
					{
					dbg.location(53,4);
					match(input,ID,FOLLOW_ID_in_argument222); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:53:9: literal
					{
					dbg.location(53,9);
					pushFollow(FOLLOW_literal_in_argument226);
					literal();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(54, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "argument");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "argument"



	// $ANTLR start "arglist"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:56:1: arglist : ( argument ',' arglist |);
	public final void arglist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arglist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:56:9: ( argument ',' arglist |)
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= BOOL && LA8_0 <= ENDL)||(LA8_0 >= ID && LA8_0 <= INT)||(LA8_0 >= STRING && LA8_0 <= TAB)||LA8_0==18||LA8_0==22||LA8_0==25||LA8_0==27) ) {
				alt8=1;
			}
			else if ( (LA8_0==17) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:56:11: argument ',' arglist
					{
					dbg.location(56,11);
					pushFollow(FOLLOW_argument_in_arglist237);
					argument();
					state._fsp--;
					dbg.location(56,20);
					match(input,18,FOLLOW_18_in_arglist239); dbg.location(56,24);
					pushFollow(FOLLOW_arglist_in_arglist241);
					arglist();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:58:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(58, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arglist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arglist"



	// $ANTLR start "idlist"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:60:1: idlist : ( ID ',' idlist |);
	public final void idlist() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "idlist");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:60:9: ( ID ',' idlist |)
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			else if ( (LA9_0==17) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:60:11: ID ',' idlist
					{
					dbg.location(60,11);
					match(input,ID,FOLLOW_ID_in_idlist256); dbg.location(60,14);
					match(input,18,FOLLOW_18_in_idlist258); dbg.location(60,18);
					pushFollow(FOLLOW_idlist_in_idlist260);
					idlist();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:62:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(62, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idlist");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "idlist"



	// $ANTLR start "function"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:64:1: function : tabs 'def' ID '(' idlist ')' ':' endls functionbody ;
	public final void function() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:65:2: ( tabs 'def' ID '(' idlist ')' ':' endls functionbody )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:65:4: tabs 'def' ID '(' idlist ')' ':' endls functionbody
			{
			dbg.location(65,4);
			pushFollow(FOLLOW_tabs_in_function276);
			tabs();
			state._fsp--;
			dbg.location(65,9);
			match(input,22,FOLLOW_22_in_function278); dbg.location(65,15);
			match(input,ID,FOLLOW_ID_in_function280); dbg.location(65,18);
			match(input,16,FOLLOW_16_in_function282); dbg.location(65,22);
			pushFollow(FOLLOW_idlist_in_function284);
			idlist();
			state._fsp--;
			dbg.location(65,29);
			match(input,17,FOLLOW_17_in_function286); dbg.location(65,33);
			match(input,19,FOLLOW_19_in_function288); dbg.location(65,37);
			pushFollow(FOLLOW_endls_in_function290);
			endls();
			state._fsp--;
			dbg.location(66,3);
			pushFollow(FOLLOW_functionbody_in_function294);
			functionbody();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(67, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function"



	// $ANTLR start "functionbody"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:69:1: functionbody : explist return ;
	public final void functionbody() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionbody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:70:2: ( explist return )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:70:4: explist return
			{
			dbg.location(70,4);
			pushFollow(FOLLOW_explist_in_functionbody306);
			explist();
			state._fsp--;
			dbg.location(70,12);
			pushFollow(FOLLOW_return_in_functionbody308);
			return();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(71, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionbody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionbody"



	// $ANTLR start "assignment"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:73:1: assignment : tabs ID '=' ( literal | operation ) ;
	public final void assignment() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:74:2: ( tabs ID '=' ( literal | operation ) )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:74:4: tabs ID '=' ( literal | operation )
			{
			dbg.location(74,4);
			pushFollow(FOLLOW_tabs_in_assignment320);
			tabs();
			state._fsp--;
			dbg.location(74,9);
			match(input,ID,FOLLOW_ID_in_assignment322); dbg.location(74,12);
			match(input,20,FOLLOW_20_in_assignment324); dbg.location(74,16);
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:74:16: ( literal | operation )
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= BOOL && LA10_0 <= ENDL)||(LA10_0 >= ID && LA10_0 <= INT)||(LA10_0 >= STRING && LA10_0 <= TAB)||LA10_0==18||LA10_0==22||LA10_0==25||LA10_0==27) ) {
				alt10=1;
			}
			else if ( (LA10_0==21||LA10_0==24||LA10_0==26) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:74:17: literal
					{
					dbg.location(74,17);
					pushFollow(FOLLOW_literal_in_assignment327);
					literal();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:74:27: operation
					{
					dbg.location(74,27);
					pushFollow(FOLLOW_operation_in_assignment331);
					operation();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assignment"



	// $ANTLR start "arithmetic"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:77:1: arithmetic : 'arithmetic' ;
	public final void arithmetic() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arithmetic");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:78:2: ( 'arithmetic' )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:78:4: 'arithmetic'
			{
			dbg.location(78,4);
			match(input,21,FOLLOW_21_in_arithmetic344); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(79, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arithmetic");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arithmetic"



	// $ANTLR start "relational"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:81:1: relational : 'realtional' ;
	public final void relational() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "relational");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:82:2: ( 'realtional' )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:82:4: 'realtional'
			{
			dbg.location(82,4);
			match(input,26,FOLLOW_26_in_relational355); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relational");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "relational"



	// $ANTLR start "logical"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:85:1: logical : 'logical' ;
	public final void logical() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "logical");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:86:2: ( 'logical' )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:86:4: 'logical'
			{
			dbg.location(86,4);
			match(input,24,FOLLOW_24_in_logical366); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(87, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logical");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "logical"



	// $ANTLR start "print"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:89:1: print : tabs 'print' argument ;
	public final void print() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "print");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:90:2: ( tabs 'print' argument )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:90:4: tabs 'print' argument
			{
			dbg.location(90,4);
			pushFollow(FOLLOW_tabs_in_print378);
			tabs();
			state._fsp--;
			dbg.location(90,9);
			match(input,25,FOLLOW_25_in_print380); dbg.location(90,17);
			pushFollow(FOLLOW_argument_in_print382);
			argument();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(91, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "print");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "print"



	// $ANTLR start "if_then_else"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:93:1: if_then_else : 'if_then_else' ;
	public final void if_then_else() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "if_then_else");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:94:2: ( 'if_then_else' )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:94:4: 'if_then_else'
			{
			dbg.location(94,4);
			match(input,23,FOLLOW_23_in_if_then_else394); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(95, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if_then_else");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "if_then_else"



	// $ANTLR start "while"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:97:1: while : 'while' ;
	public final void while() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "while");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:98:2: ( 'while' )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:98:4: 'while'
			{
			dbg.location(98,4);
			match(input,28,FOLLOW_28_in_while405); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(99, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "while");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "while"



	// $ANTLR start "tabs"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:128:1: tabs : ( TAB )* ;
	public final void tabs() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "tabs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:128:6: ( ( TAB )* )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:128:8: ( TAB )*
			{
			dbg.location(128,8);
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:128:8: ( TAB )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==TAB) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:128:8: TAB
					{
					dbg.location(128,8);
					match(input,TAB,FOLLOW_TAB_in_tabs630); 
					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(129, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "tabs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "tabs"



	// $ANTLR start "endls"
	// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:134:1: endls : ( ENDL )+ ;
	public final void endls() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "endls");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(134, 0);

		try {
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:134:8: ( ( ENDL )+ )
			dbg.enterAlt(1);

			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:134:10: ( ENDL )+
			{
			dbg.location(134,10);
			// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:134:10: ( ENDL )+
			int cnt12=0;
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==ENDL) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\mocli\\Downloads\\_cs686\\mylang\\mylang.g:134:10: ENDL
					{
					dbg.location(134,10);
					match(input,ENDL,FOLLOW_ENDL_in_endls653); 
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt12++;
			}
			} finally {dbg.exitSubRule(12);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(135, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "endls");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "endls"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA2 dfa2 = new DFA2(this);
	protected DFA3 dfa3 = new DFA3(this);
	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA1_eotS =
		"\5\uffff";
	static final String DFA1_eofS =
		"\1\4\4\uffff";
	static final String DFA1_minS =
		"\1\4\1\6\3\uffff";
	static final String DFA1_maxS =
		"\1\34\1\33\3\uffff";
	static final String DFA1_acceptS =
		"\2\uffff\2\1\1\2";
	static final String DFA1_specialS =
		"\5\uffff}>";
	static final String[] DFA1_transitionS = {
			"\3\3\2\uffff\1\2\1\3\1\uffff\1\3\1\1\7\uffff\6\2\1\3\1\2",
			"\1\3\2\uffff\1\3\3\uffff\1\1\10\uffff\1\3\2\uffff\1\3\1\uffff\1\3",
			"",
			"",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "6:1: explist : ( expression endls explist |);";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA2_eotS =
		"\12\uffff";
	static final String DFA2_eofS =
		"\12\uffff";
	static final String DFA2_minS =
		"\1\4\2\6\4\uffff\1\20\2\uffff";
	static final String DFA2_maxS =
		"\1\34\1\33\1\24\4\uffff\1\24\2\uffff";
	static final String DFA2_acceptS =
		"\3\uffff\1\2\1\3\1\4\1\6\1\uffff\1\1\1\5";
	static final String DFA2_specialS =
		"\12\uffff}>";
	static final String[] DFA2_transitionS = {
			"\3\6\2\uffff\1\2\1\6\1\uffff\1\6\1\1\7\uffff\1\4\1\3\1\5\1\4\1\5\1\4"+
			"\2\5",
			"\1\6\2\uffff\1\7\3\uffff\1\1\10\uffff\1\3\2\uffff\1\5\1\uffff\1\5",
			"\1\11\11\uffff\1\10\3\uffff\1\3",
			"",
			"",
			"",
			"",
			"\1\10\3\uffff\1\3",
			"",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "10:1: expression : ( function_call | definition | operation | statement | ID | literal );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA3_eotS =
		"\4\uffff";
	static final String DFA3_eofS =
		"\4\uffff";
	static final String DFA3_minS =
		"\2\11\2\uffff";
	static final String DFA3_maxS =
		"\2\26\2\uffff";
	static final String DFA3_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA3_specialS =
		"\4\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\3\3\uffff\1\1\10\uffff\1\2",
			"\1\3\3\uffff\1\1\10\uffff\1\2",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "23:1: definition : ( function | assignment );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA5_eotS =
		"\6\uffff";
	static final String DFA5_eofS =
		"\6\uffff";
	static final String DFA5_minS =
		"\2\15\4\uffff";
	static final String DFA5_maxS =
		"\1\34\1\33\4\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\1\1\2\1\3\1\4";
	static final String DFA5_specialS =
		"\6\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\1\11\uffff\1\3\1\uffff\1\2\1\uffff\1\5\1\4",
			"\1\1\13\uffff\1\2\1\uffff\1\5",
			"",
			"",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "34:1: statement : ( print | if_then_else | while | return );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_explist_in_program11 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_explist21 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_endls_in_explist23 = new BitSet(new long[]{0x000000001FE03630L});
	public static final BitSet FOLLOW_explist_in_explist25 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call_in_expression42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_expression48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operation_in_expression53 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_expression59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expression64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_expression69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tabs_in_function_call81 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_function_call83 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_function_call85 = new BitSet(new long[]{0x0000000000023630L});
	public static final BitSet FOLLOW_arglist_in_function_call87 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_function_call89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_definition102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_definition108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_operation120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relational_in_operation125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_in_operation131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_else_in_statement149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tabs_in_literal173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literal178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_literal183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literal188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_literal193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tabs_in_return205 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_return207 = new BitSet(new long[]{0x0000000000003630L});
	public static final BitSet FOLLOW_argument_in_return209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_argument222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_argument226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_in_arglist237 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_arglist239 = new BitSet(new long[]{0x0000000000003630L});
	public static final BitSet FOLLOW_arglist_in_arglist241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idlist256 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_idlist258 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_idlist_in_idlist260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tabs_in_function276 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_function278 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_function280 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_function282 = new BitSet(new long[]{0x0000000000020200L});
	public static final BitSet FOLLOW_idlist_in_function284 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_function286 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_function288 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_endls_in_function290 = new BitSet(new long[]{0x000000001FE03630L});
	public static final BitSet FOLLOW_functionbody_in_function294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_explist_in_functionbody306 = new BitSet(new long[]{0x0000000008002000L});
	public static final BitSet FOLLOW_return_in_functionbody308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tabs_in_assignment320 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_assignment322 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assignment324 = new BitSet(new long[]{0x0000000005203430L});
	public static final BitSet FOLLOW_literal_in_assignment327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operation_in_assignment331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_arithmetic344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_relational355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_logical366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tabs_in_print378 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_print380 = new BitSet(new long[]{0x0000000000003630L});
	public static final BitSet FOLLOW_argument_in_print382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_if_then_else394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_while405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAB_in_tabs630 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ENDL_in_endls653 = new BitSet(new long[]{0x0000000000000042L});
}
