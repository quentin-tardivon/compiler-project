// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-03-30 15:26:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS_DEC", "VAR_DEC", "ROOT", "FORMAL_PARAM", "FORMAL_PARAMS", "EFFECTIVE_PARAMS", "BODY", "METHOD", "FOR", "IF", "EGAL", "DO", "PLUS", "DIFF", "THEN", "ELSE", "PRINT", "AFFECT", "MUL", "DIV", "NEG", "RETURN", "WRITE", "READ", "ACCESS", "THIS", "CALL", "SUPER", "BLOCK", "VARS", "METHODS", "CLASS", "IDF", "OPER", "INT", "STRING", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", "'class'", "'inherit'", "'='", "'('", "')'", "'method'", "':'", "'{'", "'}'", "','", "'var'", "';'", "'int'", "'string'", "':='", "'for'", "'in'", "'..'", "'do'", "'end'", "'if'", "'then'", "'else'", "'fi'", "'new'", "'+'", "'-'", "'*'", "'/'", "'.'", "'this'", "'super'", "'write'", "'return'", "'read'"
    };
    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int CLASS_DEC=4;
    public static final int VAR_DEC=5;
    public static final int ROOT=6;
    public static final int FORMAL_PARAM=7;
    public static final int FORMAL_PARAMS=8;
    public static final int EFFECTIVE_PARAMS=9;
    public static final int BODY=10;
    public static final int METHOD=11;
    public static final int FOR=12;
    public static final int IF=13;
    public static final int EGAL=14;
    public static final int DO=15;
    public static final int PLUS=16;
    public static final int DIFF=17;
    public static final int THEN=18;
    public static final int ELSE=19;
    public static final int PRINT=20;
    public static final int AFFECT=21;
    public static final int MUL=22;
    public static final int DIV=23;
    public static final int NEG=24;
    public static final int RETURN=25;
    public static final int WRITE=26;
    public static final int READ=27;
    public static final int ACCESS=28;
    public static final int THIS=29;
    public static final int CALL=30;
    public static final int SUPER=31;
    public static final int BLOCK=32;
    public static final int VARS=33;
    public static final int METHODS=34;
    public static final int CLASS=35;
    public static final int IDF=36;
    public static final int OPER=37;
    public static final int INT=38;
    public static final int STRING=39;
    public static final int WS=40;
    public static final int NEWLINE=41;
    public static final int COMMENT=42;
    public static final int LINE_COMMENT=43;

    // delegates
    // delegators


        public LoocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LoocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LoocParser.tokenNames; }
    public String getGrammarFileName() { return "Looc.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // Looc.g:43:1: program : ( class_decl )* ( var_decl )* ( instruction )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instruction )+ ) ;
    public final LoocParser.program_return program() throws RecognitionException {
        LoocParser.program_return retval = new LoocParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.class_decl_return class_decl1 = null;

        LoocParser.var_decl_return var_decl2 = null;

        LoocParser.instruction_return instruction3 = null;


        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_class_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Looc.g:48:8: ( ( class_decl )* ( var_decl )* ( instruction )+ -> ^( ROOT ( class_decl )* ( var_decl )* ( instruction )+ ) )
            // Looc.g:48:13: ( class_decl )* ( var_decl )* ( instruction )+
            {
            // Looc.g:48:13: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:48:13: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_program163);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    stream_class_decl.add(class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Looc.g:48:25: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==54) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:48:25: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_program166);
            	    var_decl2=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // Looc.g:48:35: ( instruction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==51||LA3_0==59||LA3_0==62||LA3_0==64||(LA3_0>=76 && LA3_0<=78)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Looc.g:48:35: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_program169);
            	    instruction3=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);



            // AST REWRITE
            // elements: class_decl, var_decl, instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:48: -> ^( ROOT ( class_decl )* ( var_decl )* ( instruction )+ )
            {
                // Looc.g:48:51: ^( ROOT ( class_decl )* ( var_decl )* ( instruction )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                // Looc.g:48:58: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // Looc.g:48:70: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class class_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // Looc.g:50:1: class_decl : 'class' CLASS ( 'inherit' CLASS )? '=' '(' class_item_decl ')' -> ^( CLASS_DEC CLASS ( CLASS )? class_item_decl ) ;
    public final LoocParser.class_decl_return class_decl() throws RecognitionException {
        LoocParser.class_decl_return retval = new LoocParser.class_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal4=null;
        Token CLASS5=null;
        Token string_literal6=null;
        Token CLASS7=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token char_literal11=null;
        LoocParser.class_item_decl_return class_item_decl10 = null;


        Object string_literal4_tree=null;
        Object CLASS5_tree=null;
        Object string_literal6_tree=null;
        Object CLASS7_tree=null;
        Object char_literal8_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try {
            // Looc.g:50:11: ( 'class' CLASS ( 'inherit' CLASS )? '=' '(' class_item_decl ')' -> ^( CLASS_DEC CLASS ( CLASS )? class_item_decl ) )
            // Looc.g:50:15: 'class' CLASS ( 'inherit' CLASS )? '=' '(' class_item_decl ')'
            {
            string_literal4=(Token)match(input,44,FOLLOW_44_in_class_decl195);  
            stream_44.add(string_literal4);

            CLASS5=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl197);  
            stream_CLASS.add(CLASS5);

            // Looc.g:50:29: ( 'inherit' CLASS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==45) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Looc.g:50:30: 'inherit' CLASS
                    {
                    string_literal6=(Token)match(input,45,FOLLOW_45_in_class_decl200);  
                    stream_45.add(string_literal6);

                    CLASS7=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl202);  
                    stream_CLASS.add(CLASS7);


                    }
                    break;

            }

            char_literal8=(Token)match(input,46,FOLLOW_46_in_class_decl207);  
            stream_46.add(char_literal8);

            char_literal9=(Token)match(input,47,FOLLOW_47_in_class_decl209);  
            stream_47.add(char_literal9);

            pushFollow(FOLLOW_class_item_decl_in_class_decl210);
            class_item_decl10=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl10.getTree());
            char_literal11=(Token)match(input,48,FOLLOW_48_in_class_decl211);  
            stream_48.add(char_literal11);



            // AST REWRITE
            // elements: CLASS, CLASS, class_item_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:75: -> ^( CLASS_DEC CLASS ( CLASS )? class_item_decl )
            {
                // Looc.g:50:78: ^( CLASS_DEC CLASS ( CLASS )? class_item_decl )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASS_DEC, "CLASS_DEC"), root_1);

                adaptor.addChild(root_1, stream_CLASS.nextNode());
                // Looc.g:50:96: ( CLASS )?
                if ( stream_CLASS.hasNext() ) {
                    adaptor.addChild(root_1, stream_CLASS.nextNode());

                }
                stream_CLASS.reset();
                adaptor.addChild(root_1, stream_class_item_decl.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class class_item_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_item_decl"
    // Looc.g:54:1: class_item_decl : ( var_decl )* ( method_decl )* -> ( ^( VARS ( var_decl )* ) )? ( ^( METHODS ( method_decl )* ) )? ;
    public final LoocParser.class_item_decl_return class_item_decl() throws RecognitionException {
        LoocParser.class_item_decl_return retval = new LoocParser.class_item_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LoocParser.var_decl_return var_decl12 = null;

        LoocParser.method_decl_return method_decl13 = null;


        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Looc.g:54:16: ( ( var_decl )* ( method_decl )* -> ( ^( VARS ( var_decl )* ) )? ( ^( METHODS ( method_decl )* ) )? )
            // Looc.g:54:18: ( var_decl )* ( method_decl )*
            {
            // Looc.g:54:18: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==54) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Looc.g:54:18: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl235);
            	    var_decl12=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl12.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // Looc.g:54:28: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==49) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Looc.g:54:28: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl238);
            	    method_decl13=method_decl();

            	    state._fsp--;

            	    stream_method_decl.add(method_decl13.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: var_decl, method_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:41: -> ( ^( VARS ( var_decl )* ) )? ( ^( METHODS ( method_decl )* ) )?
            {
                // Looc.g:54:44: ( ^( VARS ( var_decl )* ) )?
                if ( stream_var_decl.hasNext() ) {
                    // Looc.g:54:44: ^( VARS ( var_decl )* )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARS, "VARS"), root_1);

                    // Looc.g:54:51: ( var_decl )*
                    while ( stream_var_decl.hasNext() ) {
                        adaptor.addChild(root_1, stream_var_decl.nextTree());

                    }
                    stream_var_decl.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_var_decl.reset();
                // Looc.g:54:63: ( ^( METHODS ( method_decl )* ) )?
                if ( stream_method_decl.hasNext() ) {
                    // Looc.g:54:63: ^( METHODS ( method_decl )* )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODS, "METHODS"), root_1);

                    // Looc.g:54:73: ( method_decl )*
                    while ( stream_method_decl.hasNext() ) {
                        adaptor.addChild(root_1, stream_method_decl.nextTree());

                    }
                    stream_method_decl.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_method_decl.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_item_decl"

    public static class method_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl"
    // Looc.g:57:1: method_decl : 'method' IDF '(' ( method_args )? ')' function_decl -> ^( METHOD IDF ( method_args )? function_decl ) ;
    public final LoocParser.method_decl_return method_decl() throws RecognitionException {
        LoocParser.method_decl_return retval = new LoocParser.method_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;
        Token IDF15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        LoocParser.method_args_return method_args17 = null;

        LoocParser.function_decl_return function_decl19 = null;


        Object string_literal14_tree=null;
        Object IDF15_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_function_decl=new RewriteRuleSubtreeStream(adaptor,"rule function_decl");
        RewriteRuleSubtreeStream stream_method_args=new RewriteRuleSubtreeStream(adaptor,"rule method_args");
        try {
            // Looc.g:57:12: ( 'method' IDF '(' ( method_args )? ')' function_decl -> ^( METHOD IDF ( method_args )? function_decl ) )
            // Looc.g:57:16: 'method' IDF '(' ( method_args )? ')' function_decl
            {
            string_literal14=(Token)match(input,49,FOLLOW_49_in_method_decl267);  
            stream_49.add(string_literal14);

            IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_method_decl269);  
            stream_IDF.add(IDF15);

            char_literal16=(Token)match(input,47,FOLLOW_47_in_method_decl271);  
            stream_47.add(char_literal16);

            // Looc.g:57:33: ( method_args )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Looc.g:57:33: method_args
                    {
                    pushFollow(FOLLOW_method_args_in_method_decl273);
                    method_args17=method_args();

                    state._fsp--;

                    stream_method_args.add(method_args17.getTree());

                    }
                    break;

            }

            char_literal18=(Token)match(input,48,FOLLOW_48_in_method_decl276);  
            stream_48.add(char_literal18);

            pushFollow(FOLLOW_function_decl_in_method_decl278);
            function_decl19=function_decl();

            state._fsp--;

            stream_function_decl.add(function_decl19.getTree());


            // AST REWRITE
            // elements: method_args, function_decl, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:64: -> ^( METHOD IDF ( method_args )? function_decl )
            {
                // Looc.g:57:67: ^( METHOD IDF ( method_args )? function_decl )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // Looc.g:57:80: ( method_args )?
                if ( stream_method_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_args.nextTree());

                }
                stream_method_args.reset();
                adaptor.addChild(root_1, stream_function_decl.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_decl"

    public static class function_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_decl"
    // Looc.g:59:1: function_decl : ( ':' type '{' ( var_decl )* ( instruction )+ '}' -> type ^( BODY ( var_decl )* ( instruction )+ ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( BODY ( var_decl )* ( instruction )+ ) );
    public final LoocParser.function_decl_return function_decl() throws RecognitionException {
        LoocParser.function_decl_return retval = new LoocParser.function_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal29=null;
        LoocParser.type_return type21 = null;

        LoocParser.var_decl_return var_decl23 = null;

        LoocParser.instruction_return instruction24 = null;

        LoocParser.var_decl_return var_decl27 = null;

        LoocParser.instruction_return instruction28 = null;


        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal29_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:59:14: ( ':' type '{' ( var_decl )* ( instruction )+ '}' -> type ^( BODY ( var_decl )* ( instruction )+ ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( BODY ( var_decl )* ( instruction )+ ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==50) ) {
                alt12=1;
            }
            else if ( (LA12_0==51) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // Looc.g:59:18: ':' type '{' ( var_decl )* ( instruction )+ '}'
                    {
                    char_literal20=(Token)match(input,50,FOLLOW_50_in_function_decl300);  
                    stream_50.add(char_literal20);

                    pushFollow(FOLLOW_type_in_function_decl302);
                    type21=type();

                    state._fsp--;

                    stream_type.add(type21.getTree());
                    char_literal22=(Token)match(input,51,FOLLOW_51_in_function_decl303);  
                    stream_51.add(char_literal22);

                    // Looc.g:59:29: ( var_decl )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==54) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Looc.g:59:29: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_function_decl304);
                    	    var_decl23=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl23.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // Looc.g:59:39: ( instruction )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==IDF||LA9_0==51||LA9_0==59||LA9_0==62||LA9_0==64||(LA9_0>=76 && LA9_0<=78)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Looc.g:59:39: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_function_decl307);
                    	    instruction24=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction24.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    char_literal25=(Token)match(input,52,FOLLOW_52_in_function_decl309);  
                    stream_52.add(char_literal25);



                    // AST REWRITE
                    // elements: instruction, type, var_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:55: -> type ^( BODY ( var_decl )* ( instruction )+ )
                    {
                        adaptor.addChild(root_0, stream_type.nextTree());
                        // Looc.g:59:63: ^( BODY ( var_decl )* ( instruction )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        // Looc.g:59:70: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        if ( !(stream_instruction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instruction.hasNext() ) {
                            adaptor.addChild(root_1, stream_instruction.nextTree());

                        }
                        stream_instruction.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:60:7: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    char_literal26=(Token)match(input,51,FOLLOW_51_in_function_decl331);  
                    stream_51.add(char_literal26);

                    // Looc.g:60:10: ( var_decl )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==54) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Looc.g:60:10: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_function_decl332);
                    	    var_decl27=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // Looc.g:60:20: ( instruction )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==IDF||LA11_0==51||LA11_0==59||LA11_0==62||LA11_0==64||(LA11_0>=76 && LA11_0<=78)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Looc.g:60:20: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_function_decl335);
                    	    instruction28=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction28.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    char_literal29=(Token)match(input,52,FOLLOW_52_in_function_decl338);  
                    stream_52.add(char_literal29);



                    // AST REWRITE
                    // elements: instruction, var_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:37: -> ^( BODY ( var_decl )* ( instruction )+ )
                    {
                        // Looc.g:60:40: ^( BODY ( var_decl )* ( instruction )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        // Looc.g:60:47: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        if ( !(stream_instruction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instruction.hasNext() ) {
                            adaptor.addChild(root_1, stream_instruction.nextTree());

                        }
                        stream_instruction.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_decl"

    public static class method_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_args"
    // Looc.g:64:1: method_args : method_arg ( ',' method_arg )* -> ^( FORMAL_PARAMS method_arg ( method_arg )* ) ;
    public final LoocParser.method_args_return method_args() throws RecognitionException {
        LoocParser.method_args_return retval = new LoocParser.method_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal31=null;
        LoocParser.method_arg_return method_arg30 = null;

        LoocParser.method_arg_return method_arg32 = null;


        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_method_arg=new RewriteRuleSubtreeStream(adaptor,"rule method_arg");
        try {
            // Looc.g:64:12: ( method_arg ( ',' method_arg )* -> ^( FORMAL_PARAMS method_arg ( method_arg )* ) )
            // Looc.g:64:15: method_arg ( ',' method_arg )*
            {
            pushFollow(FOLLOW_method_arg_in_method_args360);
            method_arg30=method_arg();

            state._fsp--;

            stream_method_arg.add(method_arg30.getTree());
            // Looc.g:64:26: ( ',' method_arg )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==53) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Looc.g:64:27: ',' method_arg
            	    {
            	    char_literal31=(Token)match(input,53,FOLLOW_53_in_method_args363);  
            	    stream_53.add(char_literal31);

            	    pushFollow(FOLLOW_method_arg_in_method_args365);
            	    method_arg32=method_arg();

            	    state._fsp--;

            	    stream_method_arg.add(method_arg32.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: method_arg, method_arg
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:44: -> ^( FORMAL_PARAMS method_arg ( method_arg )* )
            {
                // Looc.g:64:47: ^( FORMAL_PARAMS method_arg ( method_arg )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMAL_PARAMS, "FORMAL_PARAMS"), root_1);

                adaptor.addChild(root_1, stream_method_arg.nextTree());
                // Looc.g:64:74: ( method_arg )*
                while ( stream_method_arg.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_arg.nextTree());

                }
                stream_method_arg.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_args"

    public static class method_arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_arg"
    // Looc.g:66:1: method_arg : IDF ':' type -> ^( FORMAL_PARAM IDF type ) ;
    public final LoocParser.method_arg_return method_arg() throws RecognitionException {
        LoocParser.method_arg_return retval = new LoocParser.method_arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF33=null;
        Token char_literal34=null;
        LoocParser.type_return type35 = null;


        Object IDF33_tree=null;
        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:66:11: ( IDF ':' type -> ^( FORMAL_PARAM IDF type ) )
            // Looc.g:66:13: IDF ':' type
            {
            IDF33=(Token)match(input,IDF,FOLLOW_IDF_in_method_arg387);  
            stream_IDF.add(IDF33);

            char_literal34=(Token)match(input,50,FOLLOW_50_in_method_arg389);  
            stream_50.add(char_literal34);

            pushFollow(FOLLOW_type_in_method_arg391);
            type35=type();

            state._fsp--;

            stream_type.add(type35.getTree());


            // AST REWRITE
            // elements: type, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:26: -> ^( FORMAL_PARAM IDF type )
            {
                // Looc.g:66:29: ^( FORMAL_PARAM IDF type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMAL_PARAM, "FORMAL_PARAM"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_arg"

    public static class var_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl"
    // Looc.g:68:1: var_decl : 'var' IDF ':' type ';' -> ^( VAR_DEC IDF type ) ;
    public final LoocParser.var_decl_return var_decl() throws RecognitionException {
        LoocParser.var_decl_return retval = new LoocParser.var_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal36=null;
        Token IDF37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        LoocParser.type_return type39 = null;


        Object string_literal36_tree=null;
        Object IDF37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:68:9: ( 'var' IDF ':' type ';' -> ^( VAR_DEC IDF type ) )
            // Looc.g:68:12: 'var' IDF ':' type ';'
            {
            string_literal36=(Token)match(input,54,FOLLOW_54_in_var_decl409);  
            stream_54.add(string_literal36);

            IDF37=(Token)match(input,IDF,FOLLOW_IDF_in_var_decl411);  
            stream_IDF.add(IDF37);

            char_literal38=(Token)match(input,50,FOLLOW_50_in_var_decl413);  
            stream_50.add(char_literal38);

            pushFollow(FOLLOW_type_in_var_decl415);
            type39=type();

            state._fsp--;

            stream_type.add(type39.getTree());
            char_literal40=(Token)match(input,55,FOLLOW_55_in_var_decl417);  
            stream_55.add(char_literal40);



            // AST REWRITE
            // elements: type, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:35: -> ^( VAR_DEC IDF type )
            {
                // Looc.g:68:38: ^( VAR_DEC IDF type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DEC, "VAR_DEC"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Looc.g:71:1: type : ( 'int' -> 'int' | 'string' -> 'string' | CLASS -> CLASS );
    public final LoocParser.type_return type() throws RecognitionException {
        LoocParser.type_return retval = new LoocParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal41=null;
        Token string_literal42=null;
        Token CLASS43=null;

        Object string_literal41_tree=null;
        Object string_literal42_tree=null;
        Object CLASS43_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");

        try {
            // Looc.g:71:5: ( 'int' -> 'int' | 'string' -> 'string' | CLASS -> CLASS )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt14=1;
                }
                break;
            case 57:
                {
                alt14=2;
                }
                break;
            case CLASS:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // Looc.g:71:9: 'int'
                    {
                    string_literal41=(Token)match(input,56,FOLLOW_56_in_type437);  
                    stream_56.add(string_literal41);



                    // AST REWRITE
                    // elements: 56
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:15: -> 'int'
                    {
                        adaptor.addChild(root_0, stream_56.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:72:7: 'string'
                    {
                    string_literal42=(Token)match(input,57,FOLLOW_57_in_type449);  
                    stream_57.add(string_literal42);



                    // AST REWRITE
                    // elements: 57
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:16: -> 'string'
                    {
                        adaptor.addChild(root_0, stream_57.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:73:8: CLASS
                    {
                    CLASS43=(Token)match(input,CLASS,FOLLOW_CLASS_in_type462);  
                    stream_CLASS.add(CLASS43);



                    // AST REWRITE
                    // elements: CLASS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:14: -> CLASS
                    {
                        adaptor.addChild(root_0, stream_CLASS.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // Looc.g:76:1: instruction : ( IDF ':=' expression ';' -> ^( AFFECT IDF expression ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ^( BODY ( instruction )+ ) ) | 'if' expression 'then' (a+= instruction )+ ( 'else' (b+= instruction )+ )? 'fi' -> ^( IF expression ^( THEN ( $a)+ ) ( ^( ELSE ( $b)+ ) )? ) | print | 'do' expression ';' -> ^( DO expression ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( BLOCK ( var_decl )* ( instruction )+ ) | return_decl ';' -> ^( RETURN return_decl ) | read ';' -> ^( READ read ) );
    public final LoocParser.instruction_return instruction() throws RecognitionException {
        LoocParser.instruction_return retval = new LoocParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF44=null;
        Token string_literal45=null;
        Token char_literal47=null;
        Token string_literal48=null;
        Token IDF49=null;
        Token string_literal50=null;
        Token string_literal52=null;
        Token string_literal54=null;
        Token string_literal56=null;
        Token string_literal57=null;
        Token string_literal59=null;
        Token string_literal60=null;
        Token string_literal61=null;
        Token string_literal63=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal73=null;
        List list_a=null;
        List list_b=null;
        LoocParser.expression_return expression46 = null;

        LoocParser.expression_return expression51 = null;

        LoocParser.expression_return expression53 = null;

        LoocParser.instruction_return instruction55 = null;

        LoocParser.expression_return expression58 = null;

        LoocParser.print_return print62 = null;

        LoocParser.expression_return expression64 = null;

        LoocParser.var_decl_return var_decl67 = null;

        LoocParser.instruction_return instruction68 = null;

        LoocParser.return_decl_return return_decl70 = null;

        LoocParser.read_return read72 = null;

        RuleReturnScope a = null;
        RuleReturnScope b = null;
        Object IDF44_tree=null;
        Object string_literal45_tree=null;
        Object char_literal47_tree=null;
        Object string_literal48_tree=null;
        Object IDF49_tree=null;
        Object string_literal50_tree=null;
        Object string_literal52_tree=null;
        Object string_literal54_tree=null;
        Object string_literal56_tree=null;
        Object string_literal57_tree=null;
        Object string_literal59_tree=null;
        Object string_literal60_tree=null;
        Object string_literal61_tree=null;
        Object string_literal63_tree=null;
        Object char_literal65_tree=null;
        Object char_literal66_tree=null;
        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_read=new RewriteRuleSubtreeStream(adaptor,"rule read");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_return_decl=new RewriteRuleSubtreeStream(adaptor,"rule return_decl");
        try {
            // Looc.g:76:12: ( IDF ':=' expression ';' -> ^( AFFECT IDF expression ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ^( BODY ( instruction )+ ) ) | 'if' expression 'then' (a+= instruction )+ ( 'else' (b+= instruction )+ )? 'fi' -> ^( IF expression ^( THEN ( $a)+ ) ( ^( ELSE ( $b)+ ) )? ) | print | 'do' expression ';' -> ^( DO expression ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( BLOCK ( var_decl )* ( instruction )+ ) | return_decl ';' -> ^( RETURN return_decl ) | read ';' -> ^( READ read ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt21=1;
                }
                break;
            case 59:
                {
                alt21=2;
                }
                break;
            case 64:
                {
                alt21=3;
                }
                break;
            case 76:
                {
                alt21=4;
                }
                break;
            case 62:
                {
                alt21=5;
                }
                break;
            case 51:
                {
                alt21=6;
                }
                break;
            case 77:
                {
                alt21=7;
                }
                break;
            case 78:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // Looc.g:76:15: IDF ':=' expression ';'
                    {
                    IDF44=(Token)match(input,IDF,FOLLOW_IDF_in_instruction475);  
                    stream_IDF.add(IDF44);

                    string_literal45=(Token)match(input,58,FOLLOW_58_in_instruction477);  
                    stream_58.add(string_literal45);

                    pushFollow(FOLLOW_expression_in_instruction479);
                    expression46=expression();

                    state._fsp--;

                    stream_expression.add(expression46.getTree());
                    char_literal47=(Token)match(input,55,FOLLOW_55_in_instruction481);  
                    stream_55.add(char_literal47);



                    // AST REWRITE
                    // elements: IDF, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:39: -> ^( AFFECT IDF expression )
                    {
                        // Looc.g:76:42: ^( AFFECT IDF expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:77:6: 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end'
                    {
                    string_literal48=(Token)match(input,59,FOLLOW_59_in_instruction499);  
                    stream_59.add(string_literal48);

                    IDF49=(Token)match(input,IDF,FOLLOW_IDF_in_instruction501);  
                    stream_IDF.add(IDF49);

                    string_literal50=(Token)match(input,60,FOLLOW_60_in_instruction503);  
                    stream_60.add(string_literal50);

                    pushFollow(FOLLOW_expression_in_instruction505);
                    expression51=expression();

                    state._fsp--;

                    stream_expression.add(expression51.getTree());
                    string_literal52=(Token)match(input,61,FOLLOW_61_in_instruction507);  
                    stream_61.add(string_literal52);

                    pushFollow(FOLLOW_expression_in_instruction509);
                    expression53=expression();

                    state._fsp--;

                    stream_expression.add(expression53.getTree());
                    string_literal54=(Token)match(input,62,FOLLOW_62_in_instruction511);  
                    stream_62.add(string_literal54);

                    // Looc.g:77:53: ( instruction )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IDF||LA15_0==51||LA15_0==59||LA15_0==62||LA15_0==64||(LA15_0>=76 && LA15_0<=78)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Looc.g:77:53: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction513);
                    	    instruction55=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    string_literal56=(Token)match(input,63,FOLLOW_63_in_instruction516);  
                    stream_63.add(string_literal56);



                    // AST REWRITE
                    // elements: expression, instruction, IDF, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:72: -> ^( FOR IDF expression expression ^( BODY ( instruction )+ ) )
                    {
                        // Looc.g:77:75: ^( FOR IDF expression expression ^( BODY ( instruction )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // Looc.g:77:107: ^( BODY ( instruction )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        if ( !(stream_instruction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instruction.hasNext() ) {
                            adaptor.addChild(root_2, stream_instruction.nextTree());

                        }
                        stream_instruction.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:78:6: 'if' expression 'then' (a+= instruction )+ ( 'else' (b+= instruction )+ )? 'fi'
                    {
                    string_literal57=(Token)match(input,64,FOLLOW_64_in_instruction542);  
                    stream_64.add(string_literal57);

                    pushFollow(FOLLOW_expression_in_instruction544);
                    expression58=expression();

                    state._fsp--;

                    stream_expression.add(expression58.getTree());
                    string_literal59=(Token)match(input,65,FOLLOW_65_in_instruction546);  
                    stream_65.add(string_literal59);

                    // Looc.g:78:30: (a+= instruction )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==IDF||LA16_0==51||LA16_0==59||LA16_0==62||LA16_0==64||(LA16_0>=76 && LA16_0<=78)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Looc.g:78:30: a+= instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction550);
                    	    a=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(a.getTree());
                    	    if (list_a==null) list_a=new ArrayList();
                    	    list_a.add(a.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    // Looc.g:78:45: ( 'else' (b+= instruction )+ )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==66) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Looc.g:78:46: 'else' (b+= instruction )+
                            {
                            string_literal60=(Token)match(input,66,FOLLOW_66_in_instruction554);  
                            stream_66.add(string_literal60);

                            // Looc.g:78:54: (b+= instruction )+
                            int cnt17=0;
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==IDF||LA17_0==51||LA17_0==59||LA17_0==62||LA17_0==64||(LA17_0>=76 && LA17_0<=78)) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // Looc.g:78:54: b+= instruction
                            	    {
                            	    pushFollow(FOLLOW_instruction_in_instruction558);
                            	    b=instruction();

                            	    state._fsp--;

                            	    stream_instruction.add(b.getTree());
                            	    if (list_b==null) list_b=new ArrayList();
                            	    list_b.add(b.getTree());


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt17 >= 1 ) break loop17;
                                        EarlyExitException eee =
                                            new EarlyExitException(17, input);
                                        throw eee;
                                }
                                cnt17++;
                            } while (true);


                            }
                            break;

                    }

                    string_literal61=(Token)match(input,67,FOLLOW_67_in_instruction563);  
                    stream_67.add(string_literal61);



                    // AST REWRITE
                    // elements: expression, a, b
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: a, b
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"token b",list_b);
                    root_0 = (Object)adaptor.nil();
                    // 78:76: -> ^( IF expression ^( THEN ( $a)+ ) ( ^( ELSE ( $b)+ ) )? )
                    {
                        // Looc.g:78:79: ^( IF expression ^( THEN ( $a)+ ) ( ^( ELSE ( $b)+ ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // Looc.g:78:95: ^( THEN ( $a)+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        if ( !(stream_a.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_a.hasNext() ) {
                            adaptor.addChild(root_2, stream_a.nextTree());

                        }
                        stream_a.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // Looc.g:78:107: ( ^( ELSE ( $b)+ ) )?
                        if ( stream_b.hasNext() ) {
                            // Looc.g:78:108: ^( ELSE ( $b)+ )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);

                            if ( !(stream_b.hasNext()) ) {
                                throw new RewriteEarlyExitException();
                            }
                            while ( stream_b.hasNext() ) {
                                adaptor.addChild(root_2, stream_b.nextTree());

                            }
                            stream_b.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_b.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Looc.g:79:6: print
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_print_in_instruction598);
                    print62=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print62.getTree());

                    }
                    break;
                case 5 :
                    // Looc.g:80:11: 'do' expression ';'
                    {
                    string_literal63=(Token)match(input,62,FOLLOW_62_in_instruction610);  
                    stream_62.add(string_literal63);

                    pushFollow(FOLLOW_expression_in_instruction612);
                    expression64=expression();

                    state._fsp--;

                    stream_expression.add(expression64.getTree());
                    char_literal65=(Token)match(input,55,FOLLOW_55_in_instruction614);  
                    stream_55.add(char_literal65);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:31: -> ^( DO expression )
                    {
                        // Looc.g:80:34: ^( DO expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Looc.g:81:12: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    char_literal66=(Token)match(input,51,FOLLOW_51_in_instruction635);  
                    stream_51.add(char_literal66);

                    // Looc.g:81:16: ( var_decl )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==54) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Looc.g:81:16: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instruction637);
                    	    var_decl67=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl67.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // Looc.g:81:26: ( instruction )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==IDF||LA20_0==51||LA20_0==59||LA20_0==62||LA20_0==64||(LA20_0>=76 && LA20_0<=78)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Looc.g:81:26: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction640);
                    	    instruction68=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction68.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    char_literal69=(Token)match(input,52,FOLLOW_52_in_instruction643);  
                    stream_52.add(char_literal69);



                    // AST REWRITE
                    // elements: var_decl, instruction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:43: -> ^( BLOCK ( var_decl )* ( instruction )+ )
                    {
                        // Looc.g:81:46: ^( BLOCK ( var_decl )* ( instruction )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // Looc.g:81:54: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        if ( !(stream_instruction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instruction.hasNext() ) {
                            adaptor.addChild(root_1, stream_instruction.nextTree());

                        }
                        stream_instruction.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // Looc.g:82:8: return_decl ';'
                    {
                    pushFollow(FOLLOW_return_decl_in_instruction664);
                    return_decl70=return_decl();

                    state._fsp--;

                    stream_return_decl.add(return_decl70.getTree());
                    char_literal71=(Token)match(input,55,FOLLOW_55_in_instruction666);  
                    stream_55.add(char_literal71);



                    // AST REWRITE
                    // elements: return_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:24: -> ^( RETURN return_decl )
                    {
                        // Looc.g:82:27: ^( RETURN return_decl )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                        adaptor.addChild(root_1, stream_return_decl.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // Looc.g:83:10: read ';'
                    {
                    pushFollow(FOLLOW_read_in_instruction685);
                    read72=read();

                    state._fsp--;

                    stream_read.add(read72.getTree());
                    char_literal73=(Token)match(input,55,FOLLOW_55_in_instruction686);  
                    stream_55.add(char_literal73);



                    // AST REWRITE
                    // elements: read
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:18: -> ^( READ read )
                    {
                        // Looc.g:83:21: ^( READ read )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);

                        adaptor.addChild(root_1, stream_read.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Looc.g:85:1: expression : ( operation | 'new' CLASS -> ^( 'new' CLASS ) );
    public final LoocParser.expression_return expression() throws RecognitionException {
        LoocParser.expression_return retval = new LoocParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal75=null;
        Token CLASS76=null;
        LoocParser.operation_return operation74 = null;


        Object string_literal75_tree=null;
        Object CLASS76_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");

        try {
            // Looc.g:85:12: ( operation | 'new' CLASS -> ^( 'new' CLASS ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDF||(LA22_0>=INT && LA22_0<=STRING)||LA22_0==47||LA22_0==70||(LA22_0>=74 && LA22_0<=75)) ) {
                alt22=1;
            }
            else if ( (LA22_0==68) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // Looc.g:85:16: operation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operation_in_expression704);
                    operation74=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation74.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:86:5: 'new' CLASS
                    {
                    string_literal75=(Token)match(input,68,FOLLOW_68_in_expression710);  
                    stream_68.add(string_literal75);

                    CLASS76=(Token)match(input,CLASS,FOLLOW_CLASS_in_expression712);  
                    stream_CLASS.add(CLASS76);



                    // AST REWRITE
                    // elements: 68, CLASS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:17: -> ^( 'new' CLASS )
                    {
                        // Looc.g:86:20: ^( 'new' CLASS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_68.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_CLASS.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class operation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation"
    // Looc.g:89:1: operation : ( multiop -> multiop ) ( '+' mult= multiop -> ^( PLUS $operation $mult) | '-' mult= multiop -> ^( DIFF $operation $mult) )* ;
    public final LoocParser.operation_return operation() throws RecognitionException {
        LoocParser.operation_return retval = new LoocParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal78=null;
        Token char_literal79=null;
        LoocParser.multiop_return mult = null;

        LoocParser.multiop_return multiop77 = null;


        Object char_literal78_tree=null;
        Object char_literal79_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_multiop=new RewriteRuleSubtreeStream(adaptor,"rule multiop");
        try {
            // Looc.g:89:11: ( ( multiop -> multiop ) ( '+' mult= multiop -> ^( PLUS $operation $mult) | '-' mult= multiop -> ^( DIFF $operation $mult) )* )
            // Looc.g:89:13: ( multiop -> multiop ) ( '+' mult= multiop -> ^( PLUS $operation $mult) | '-' mult= multiop -> ^( DIFF $operation $mult) )*
            {
            // Looc.g:89:13: ( multiop -> multiop )
            // Looc.g:89:14: multiop
            {
            pushFollow(FOLLOW_multiop_in_operation730);
            multiop77=multiop();

            state._fsp--;

            stream_multiop.add(multiop77.getTree());


            // AST REWRITE
            // elements: multiop
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:22: -> multiop
            {
                adaptor.addChild(root_0, stream_multiop.nextTree());

            }

            retval.tree = root_0;
            }

            // Looc.g:89:34: ( '+' mult= multiop -> ^( PLUS $operation $mult) | '-' mult= multiop -> ^( DIFF $operation $mult) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==69) ) {
                    alt23=1;
                }
                else if ( (LA23_0==70) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // Looc.g:89:35: '+' mult= multiop
            	    {
            	    char_literal78=(Token)match(input,69,FOLLOW_69_in_operation738);  
            	    stream_69.add(char_literal78);

            	    pushFollow(FOLLOW_multiop_in_operation742);
            	    mult=multiop();

            	    state._fsp--;

            	    stream_multiop.add(mult.getTree());


            	    // AST REWRITE
            	    // elements: operation, mult
            	    // token labels: 
            	    // rule labels: mult, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_mult=new RewriteRuleSubtreeStream(adaptor,"rule mult",mult!=null?mult.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 89:52: -> ^( PLUS $operation $mult)
            	    {
            	        // Looc.g:89:55: ^( PLUS $operation $mult)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS, "PLUS"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_mult.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // Looc.g:90:4: '-' mult= multiop
            	    {
            	    char_literal79=(Token)match(input,70,FOLLOW_70_in_operation759);  
            	    stream_70.add(char_literal79);

            	    pushFollow(FOLLOW_multiop_in_operation763);
            	    mult=multiop();

            	    state._fsp--;

            	    stream_multiop.add(mult.getTree());


            	    // AST REWRITE
            	    // elements: operation, mult
            	    // token labels: 
            	    // rule labels: mult, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_mult=new RewriteRuleSubtreeStream(adaptor,"rule mult",mult!=null?mult.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 90:21: -> ^( DIFF $operation $mult)
            	    {
            	        // Looc.g:90:24: ^( DIFF $operation $mult)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DIFF, "DIFF"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_mult.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operation"

    public static class multiop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiop"
    // Looc.g:92:1: multiop : ( comparaison -> comparaison ) ( '*' cmp= comparaison -> ^( MUL $multiop $cmp) | '/' cmp= comparaison -> ^( DIV $multiop $cmp) )* ;
    public final LoocParser.multiop_return multiop() throws RecognitionException {
        LoocParser.multiop_return retval = new LoocParser.multiop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal81=null;
        Token char_literal82=null;
        LoocParser.comparaison_return cmp = null;

        LoocParser.comparaison_return comparaison80 = null;


        Object char_literal81_tree=null;
        Object char_literal82_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_comparaison=new RewriteRuleSubtreeStream(adaptor,"rule comparaison");
        try {
            // Looc.g:92:9: ( ( comparaison -> comparaison ) ( '*' cmp= comparaison -> ^( MUL $multiop $cmp) | '/' cmp= comparaison -> ^( DIV $multiop $cmp) )* )
            // Looc.g:92:11: ( comparaison -> comparaison ) ( '*' cmp= comparaison -> ^( MUL $multiop $cmp) | '/' cmp= comparaison -> ^( DIV $multiop $cmp) )*
            {
            // Looc.g:92:11: ( comparaison -> comparaison )
            // Looc.g:92:12: comparaison
            {
            pushFollow(FOLLOW_comparaison_in_multiop786);
            comparaison80=comparaison();

            state._fsp--;

            stream_comparaison.add(comparaison80.getTree());


            // AST REWRITE
            // elements: comparaison
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:24: -> comparaison
            {
                adaptor.addChild(root_0, stream_comparaison.nextTree());

            }

            retval.tree = root_0;
            }

            // Looc.g:92:40: ( '*' cmp= comparaison -> ^( MUL $multiop $cmp) | '/' cmp= comparaison -> ^( DIV $multiop $cmp) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==71) ) {
                    alt24=1;
                }
                else if ( (LA24_0==72) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // Looc.g:92:41: '*' cmp= comparaison
            	    {
            	    char_literal81=(Token)match(input,71,FOLLOW_71_in_multiop794);  
            	    stream_71.add(char_literal81);

            	    pushFollow(FOLLOW_comparaison_in_multiop798);
            	    cmp=comparaison();

            	    state._fsp--;

            	    stream_comparaison.add(cmp.getTree());


            	    // AST REWRITE
            	    // elements: multiop, cmp
            	    // token labels: 
            	    // rule labels: cmp, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_cmp=new RewriteRuleSubtreeStream(adaptor,"rule cmp",cmp!=null?cmp.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 92:61: -> ^( MUL $multiop $cmp)
            	    {
            	        // Looc.g:92:64: ^( MUL $multiop $cmp)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MUL, "MUL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_cmp.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // Looc.g:93:4: '/' cmp= comparaison
            	    {
            	    char_literal82=(Token)match(input,72,FOLLOW_72_in_multiop815);  
            	    stream_72.add(char_literal82);

            	    pushFollow(FOLLOW_comparaison_in_multiop819);
            	    cmp=comparaison();

            	    state._fsp--;

            	    stream_comparaison.add(cmp.getTree());


            	    // AST REWRITE
            	    // elements: multiop, cmp
            	    // token labels: 
            	    // rule labels: cmp, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_cmp=new RewriteRuleSubtreeStream(adaptor,"rule cmp",cmp!=null?cmp.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 93:24: -> ^( DIV $multiop $cmp)
            	    {
            	        // Looc.g:93:27: ^( DIV $multiop $cmp)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DIV, "DIV"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_cmp.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiop"

    public static class comparaison_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparaison"
    // Looc.g:95:1: comparaison : moinsunaire ( OPER moinsunaire )? ;
    public final LoocParser.comparaison_return comparaison() throws RecognitionException {
        LoocParser.comparaison_return retval = new LoocParser.comparaison_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPER84=null;
        LoocParser.moinsunaire_return moinsunaire83 = null;

        LoocParser.moinsunaire_return moinsunaire85 = null;


        Object OPER84_tree=null;

        try {
            // Looc.g:96:2: ( moinsunaire ( OPER moinsunaire )? )
            // Looc.g:96:4: moinsunaire ( OPER moinsunaire )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_moinsunaire_in_comparaison842);
            moinsunaire83=moinsunaire();

            state._fsp--;

            adaptor.addChild(root_0, moinsunaire83.getTree());
            // Looc.g:96:16: ( OPER moinsunaire )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==OPER) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Looc.g:96:17: OPER moinsunaire
                    {
                    OPER84=(Token)match(input,OPER,FOLLOW_OPER_in_comparaison845); 
                    OPER84_tree = (Object)adaptor.create(OPER84);
                    root_0 = (Object)adaptor.becomeRoot(OPER84_tree, root_0);

                    pushFollow(FOLLOW_moinsunaire_in_comparaison848);
                    moinsunaire85=moinsunaire();

                    state._fsp--;

                    adaptor.addChild(root_0, moinsunaire85.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparaison"

    public static class moinsunaire_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moinsunaire"
    // Looc.g:98:1: moinsunaire : ( '-' )? atom ;
    public final LoocParser.moinsunaire_return moinsunaire() throws RecognitionException {
        LoocParser.moinsunaire_return retval = new LoocParser.moinsunaire_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal86=null;
        LoocParser.atom_return atom87 = null;


        Object char_literal86_tree=null;

        try {
            // Looc.g:99:2: ( ( '-' )? atom )
            // Looc.g:99:4: ( '-' )? atom
            {
            root_0 = (Object)adaptor.nil();

            // Looc.g:99:4: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==70) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Looc.g:99:5: '-'
                    {
                    char_literal86=(Token)match(input,70,FOLLOW_70_in_moinsunaire860); 
                    char_literal86_tree = (Object)adaptor.create(char_literal86);
                    root_0 = (Object)adaptor.becomeRoot(char_literal86_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_moinsunaire865);
            atom87=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom87.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "moinsunaire"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // Looc.g:101:1: atom : ( INT | STRING | IDF ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )? -> ( ^( CALL IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )? | 'this' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )? -> ( ^( CALL 'this' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )? | 'super' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )? -> ( ^( CALL 'super' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )? | '(' expression ')' -> expression );
    public final LoocParser.atom_return atom() throws RecognitionException {
        LoocParser.atom_return retval = new LoocParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT88=null;
        Token STRING89=null;
        Token IDF90=null;
        Token char_literal91=null;
        Token IDF92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal97=null;
        Token string_literal98=null;
        Token char_literal99=null;
        Token IDF100=null;
        Token char_literal101=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token string_literal106=null;
        Token char_literal107=null;
        Token IDF108=null;
        Token char_literal109=null;
        Token char_literal111=null;
        Token char_literal113=null;
        Token char_literal114=null;
        Token char_literal116=null;
        LoocParser.expression_return expression94 = null;

        LoocParser.expression_return expression96 = null;

        LoocParser.expression_return expression102 = null;

        LoocParser.expression_return expression104 = null;

        LoocParser.expression_return expression110 = null;

        LoocParser.expression_return expression112 = null;

        LoocParser.expression_return expression115 = null;


        Object INT88_tree=null;
        Object STRING89_tree=null;
        Object IDF90_tree=null;
        Object char_literal91_tree=null;
        Object IDF92_tree=null;
        Object char_literal93_tree=null;
        Object char_literal95_tree=null;
        Object char_literal97_tree=null;
        Object string_literal98_tree=null;
        Object char_literal99_tree=null;
        Object IDF100_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        Object char_literal105_tree=null;
        Object string_literal106_tree=null;
        Object char_literal107_tree=null;
        Object IDF108_tree=null;
        Object char_literal109_tree=null;
        Object char_literal111_tree=null;
        Object char_literal113_tree=null;
        Object char_literal114_tree=null;
        Object char_literal116_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:101:5: ( INT | STRING | IDF ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )? -> ( ^( CALL IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )? | 'this' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )? -> ( ^( CALL 'this' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )? | 'super' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )? -> ( ^( CALL 'super' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )? | '(' expression ')' -> expression )
            int alt36=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt36=1;
                }
                break;
            case STRING:
                {
                alt36=2;
                }
                break;
            case IDF:
                {
                alt36=3;
                }
                break;
            case 74:
                {
                alt36=4;
                }
                break;
            case 75:
                {
                alt36=5;
                }
                break;
            case 47:
                {
                alt36=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // Looc.g:101:7: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT88=(Token)match(input,INT,FOLLOW_INT_in_atom872); 
                    INT88_tree = (Object)adaptor.create(INT88);
                    adaptor.addChild(root_0, INT88_tree);


                    }
                    break;
                case 2 :
                    // Looc.g:102:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING89=(Token)match(input,STRING,FOLLOW_STRING_in_atom877); 
                    STRING89_tree = (Object)adaptor.create(STRING89);
                    adaptor.addChild(root_0, STRING89_tree);


                    }
                    break;
                case 3 :
                    // Looc.g:103:5: IDF ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )?
                    {
                    IDF90=(Token)match(input,IDF,FOLLOW_IDF_in_atom883);  
                    stream_IDF.add(IDF90);

                    // Looc.g:103:9: ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==73) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // Looc.g:103:10: '.' IDF '(' ( expression ( ',' expression )* )? ')'
                            {
                            char_literal91=(Token)match(input,73,FOLLOW_73_in_atom886);  
                            stream_73.add(char_literal91);

                            IDF92=(Token)match(input,IDF,FOLLOW_IDF_in_atom888);  
                            stream_IDF.add(IDF92);

                            char_literal93=(Token)match(input,47,FOLLOW_47_in_atom890);  
                            stream_47.add(char_literal93);

                            // Looc.g:103:21: ( expression ( ',' expression )* )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==IDF||(LA28_0>=INT && LA28_0<=STRING)||LA28_0==47||LA28_0==68||LA28_0==70||(LA28_0>=74 && LA28_0<=75)) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // Looc.g:103:22: expression ( ',' expression )*
                                    {
                                    pushFollow(FOLLOW_expression_in_atom892);
                                    expression94=expression();

                                    state._fsp--;

                                    stream_expression.add(expression94.getTree());
                                    // Looc.g:103:32: ( ',' expression )*
                                    loop27:
                                    do {
                                        int alt27=2;
                                        int LA27_0 = input.LA(1);

                                        if ( (LA27_0==53) ) {
                                            alt27=1;
                                        }


                                        switch (alt27) {
                                    	case 1 :
                                    	    // Looc.g:103:33: ',' expression
                                    	    {
                                    	    char_literal95=(Token)match(input,53,FOLLOW_53_in_atom894);  
                                    	    stream_53.add(char_literal95);

                                    	    pushFollow(FOLLOW_expression_in_atom895);
                                    	    expression96=expression();

                                    	    state._fsp--;

                                    	    stream_expression.add(expression96.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop27;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            char_literal97=(Token)match(input,48,FOLLOW_48_in_atom900);  
                            stream_48.add(char_literal97);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IDF, expression, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:56: -> ( ^( CALL IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )?
                    {
                        // Looc.g:103:59: ( ^( CALL IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )?
                        if ( stream_IDF.hasNext() ) {
                            // Looc.g:103:59: ^( CALL IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? )
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                            adaptor.addChild(root_1, stream_IDF.nextNode());
                            // Looc.g:103:70: ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )?
                            if ( stream_expression.hasNext() ) {
                                // Looc.g:103:70: ^( EFFECTIVE_PARAMS ( expression ( expression )* )? )
                                {
                                Object root_2 = (Object)adaptor.nil();
                                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EFFECTIVE_PARAMS, "EFFECTIVE_PARAMS"), root_2);

                                // Looc.g:103:89: ( expression ( expression )* )?
                                if ( stream_expression.hasNext()||stream_expression.hasNext() ) {
                                    adaptor.addChild(root_2, stream_expression.nextTree());
                                    // Looc.g:103:100: ( expression )*
                                    while ( stream_expression.hasNext() ) {
                                        adaptor.addChild(root_2, stream_expression.nextTree());

                                    }
                                    stream_expression.reset();

                                }
                                stream_expression.reset();
                                stream_expression.reset();

                                adaptor.addChild(root_1, root_2);
                                }

                            }
                            stream_expression.reset();

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_IDF.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Looc.g:104:5: 'this' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )?
                    {
                    string_literal98=(Token)match(input,74,FOLLOW_74_in_atom931);  
                    stream_74.add(string_literal98);

                    // Looc.g:104:12: ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==73) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // Looc.g:104:13: '.' IDF '(' ( expression ( ',' expression )* )? ')'
                            {
                            char_literal99=(Token)match(input,73,FOLLOW_73_in_atom934);  
                            stream_73.add(char_literal99);

                            IDF100=(Token)match(input,IDF,FOLLOW_IDF_in_atom936);  
                            stream_IDF.add(IDF100);

                            char_literal101=(Token)match(input,47,FOLLOW_47_in_atom938);  
                            stream_47.add(char_literal101);

                            // Looc.g:104:24: ( expression ( ',' expression )* )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==IDF||(LA31_0>=INT && LA31_0<=STRING)||LA31_0==47||LA31_0==68||LA31_0==70||(LA31_0>=74 && LA31_0<=75)) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // Looc.g:104:25: expression ( ',' expression )*
                                    {
                                    pushFollow(FOLLOW_expression_in_atom940);
                                    expression102=expression();

                                    state._fsp--;

                                    stream_expression.add(expression102.getTree());
                                    // Looc.g:104:35: ( ',' expression )*
                                    loop30:
                                    do {
                                        int alt30=2;
                                        int LA30_0 = input.LA(1);

                                        if ( (LA30_0==53) ) {
                                            alt30=1;
                                        }


                                        switch (alt30) {
                                    	case 1 :
                                    	    // Looc.g:104:36: ',' expression
                                    	    {
                                    	    char_literal103=(Token)match(input,53,FOLLOW_53_in_atom942);  
                                    	    stream_53.add(char_literal103);

                                    	    pushFollow(FOLLOW_expression_in_atom943);
                                    	    expression104=expression();

                                    	    state._fsp--;

                                    	    stream_expression.add(expression104.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop30;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            char_literal105=(Token)match(input,48,FOLLOW_48_in_atom948);  
                            stream_48.add(char_literal105);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expression, 74, expression, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:59: -> ( ^( CALL 'this' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )?
                    {
                        // Looc.g:104:62: ( ^( CALL 'this' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )?
                        if ( stream_74.hasNext()||stream_IDF.hasNext() ) {
                            // Looc.g:104:62: ^( CALL 'this' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? )
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                            adaptor.addChild(root_1, stream_74.nextNode());
                            adaptor.addChild(root_1, stream_IDF.nextNode());
                            // Looc.g:104:80: ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )?
                            if ( stream_expression.hasNext() ) {
                                // Looc.g:104:80: ^( EFFECTIVE_PARAMS ( expression ( expression )* )? )
                                {
                                Object root_2 = (Object)adaptor.nil();
                                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EFFECTIVE_PARAMS, "EFFECTIVE_PARAMS"), root_2);

                                // Looc.g:104:98: ( expression ( expression )* )?
                                if ( stream_expression.hasNext()||stream_expression.hasNext() ) {
                                    adaptor.addChild(root_2, stream_expression.nextTree());
                                    // Looc.g:104:109: ( expression )*
                                    while ( stream_expression.hasNext() ) {
                                        adaptor.addChild(root_2, stream_expression.nextTree());

                                    }
                                    stream_expression.reset();

                                }
                                stream_expression.reset();
                                stream_expression.reset();

                                adaptor.addChild(root_1, root_2);
                                }

                            }
                            stream_expression.reset();

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_74.reset();
                        stream_IDF.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Looc.g:105:4: 'super' ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )?
                    {
                    string_literal106=(Token)match(input,75,FOLLOW_75_in_atom980);  
                    stream_75.add(string_literal106);

                    // Looc.g:105:12: ( '.' IDF '(' ( expression ( ',' expression )* )? ')' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==73) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // Looc.g:105:13: '.' IDF '(' ( expression ( ',' expression )* )? ')'
                            {
                            char_literal107=(Token)match(input,73,FOLLOW_73_in_atom983);  
                            stream_73.add(char_literal107);

                            IDF108=(Token)match(input,IDF,FOLLOW_IDF_in_atom985);  
                            stream_IDF.add(IDF108);

                            char_literal109=(Token)match(input,47,FOLLOW_47_in_atom987);  
                            stream_47.add(char_literal109);

                            // Looc.g:105:24: ( expression ( ',' expression )* )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==IDF||(LA34_0>=INT && LA34_0<=STRING)||LA34_0==47||LA34_0==68||LA34_0==70||(LA34_0>=74 && LA34_0<=75)) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // Looc.g:105:25: expression ( ',' expression )*
                                    {
                                    pushFollow(FOLLOW_expression_in_atom989);
                                    expression110=expression();

                                    state._fsp--;

                                    stream_expression.add(expression110.getTree());
                                    // Looc.g:105:35: ( ',' expression )*
                                    loop33:
                                    do {
                                        int alt33=2;
                                        int LA33_0 = input.LA(1);

                                        if ( (LA33_0==53) ) {
                                            alt33=1;
                                        }


                                        switch (alt33) {
                                    	case 1 :
                                    	    // Looc.g:105:36: ',' expression
                                    	    {
                                    	    char_literal111=(Token)match(input,53,FOLLOW_53_in_atom991);  
                                    	    stream_53.add(char_literal111);

                                    	    pushFollow(FOLLOW_expression_in_atom992);
                                    	    expression112=expression();

                                    	    state._fsp--;

                                    	    stream_expression.add(expression112.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop33;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            char_literal113=(Token)match(input,48,FOLLOW_48_in_atom997);  
                            stream_48.add(char_literal113);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 75, expression, expression, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:59: -> ( ^( CALL 'super' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )?
                    {
                        // Looc.g:105:62: ( ^( CALL 'super' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? ) )?
                        if ( stream_75.hasNext()||stream_IDF.hasNext() ) {
                            // Looc.g:105:62: ^( CALL 'super' IDF ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )? )
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                            adaptor.addChild(root_1, stream_75.nextNode());
                            adaptor.addChild(root_1, stream_IDF.nextNode());
                            // Looc.g:105:81: ( ^( EFFECTIVE_PARAMS ( expression ( expression )* )? ) )?
                            if ( stream_expression.hasNext() ) {
                                // Looc.g:105:81: ^( EFFECTIVE_PARAMS ( expression ( expression )* )? )
                                {
                                Object root_2 = (Object)adaptor.nil();
                                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EFFECTIVE_PARAMS, "EFFECTIVE_PARAMS"), root_2);

                                // Looc.g:105:99: ( expression ( expression )* )?
                                if ( stream_expression.hasNext()||stream_expression.hasNext() ) {
                                    adaptor.addChild(root_2, stream_expression.nextTree());
                                    // Looc.g:105:110: ( expression )*
                                    while ( stream_expression.hasNext() ) {
                                        adaptor.addChild(root_2, stream_expression.nextTree());

                                    }
                                    stream_expression.reset();

                                }
                                stream_expression.reset();
                                stream_expression.reset();

                                adaptor.addChild(root_1, root_2);
                                }

                            }
                            stream_expression.reset();

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_75.reset();
                        stream_IDF.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Looc.g:106:4: '(' expression ')'
                    {
                    char_literal114=(Token)match(input,47,FOLLOW_47_in_atom1030);  
                    stream_47.add(char_literal114);

                    pushFollow(FOLLOW_expression_in_atom1032);
                    expression115=expression();

                    state._fsp--;

                    stream_expression.add(expression115.getTree());
                    char_literal116=(Token)match(input,48,FOLLOW_48_in_atom1034);  
                    stream_48.add(char_literal116);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:23: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print"
    // Looc.g:108:1: print : 'write' expression ';' -> ^( WRITE expression ) ;
    public final LoocParser.print_return print() throws RecognitionException {
        LoocParser.print_return retval = new LoocParser.print_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal117=null;
        Token char_literal119=null;
        LoocParser.expression_return expression118 = null;


        Object string_literal117_tree=null;
        Object char_literal119_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:108:6: ( 'write' expression ';' -> ^( WRITE expression ) )
            // Looc.g:108:9: 'write' expression ';'
            {
            string_literal117=(Token)match(input,76,FOLLOW_76_in_print1046);  
            stream_76.add(string_literal117);

            pushFollow(FOLLOW_expression_in_print1048);
            expression118=expression();

            state._fsp--;

            stream_expression.add(expression118.getTree());
            char_literal119=(Token)match(input,55,FOLLOW_55_in_print1050);  
            stream_55.add(char_literal119);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 108:32: -> ^( WRITE expression )
            {
                // Looc.g:108:35: ^( WRITE expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print"

    public static class return_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_decl"
    // Looc.g:110:1: return_decl : 'return' '(' expression ')' -> expression ;
    public final LoocParser.return_decl_return return_decl() throws RecognitionException {
        LoocParser.return_decl_return retval = new LoocParser.return_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal120=null;
        Token char_literal121=null;
        Token char_literal123=null;
        LoocParser.expression_return expression122 = null;


        Object string_literal120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal123_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:110:12: ( 'return' '(' expression ')' -> expression )
            // Looc.g:110:15: 'return' '(' expression ')'
            {
            string_literal120=(Token)match(input,77,FOLLOW_77_in_return_decl1066);  
            stream_77.add(string_literal120);

            char_literal121=(Token)match(input,47,FOLLOW_47_in_return_decl1067);  
            stream_47.add(char_literal121);

            pushFollow(FOLLOW_expression_in_return_decl1069);
            expression122=expression();

            state._fsp--;

            stream_expression.add(expression122.getTree());
            char_literal123=(Token)match(input,48,FOLLOW_48_in_return_decl1071);  
            stream_48.add(char_literal123);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 110:42: -> expression
            {
                adaptor.addChild(root_0, stream_expression.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "return_decl"

    public static class read_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read"
    // Looc.g:112:1: read : 'read' IDF -> IDF ;
    public final LoocParser.read_return read() throws RecognitionException {
        LoocParser.read_return retval = new LoocParser.read_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal124=null;
        Token IDF125=null;

        Object string_literal124_tree=null;
        Object IDF125_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");

        try {
            // Looc.g:112:6: ( 'read' IDF -> IDF )
            // Looc.g:112:8: 'read' IDF
            {
            string_literal124=(Token)match(input,78,FOLLOW_78_in_read1084);  
            stream_78.add(string_literal124);

            IDF125=(Token)match(input,IDF,FOLLOW_IDF_in_read1086);  
            stream_IDF.add(IDF125);



            // AST REWRITE
            // elements: IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:19: -> IDF
            {
                adaptor.addChild(root_0, stream_IDF.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "read"

    // Delegated rules


 

    public static final BitSet FOLLOW_class_decl_in_program163 = new BitSet(new long[]{0x4848101000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_var_decl_in_program166 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_instruction_in_program169 = new BitSet(new long[]{0x4848001000000002L,0x0000000000007001L});
    public static final BitSet FOLLOW_44_in_class_decl195 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl197 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_class_decl200 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl202 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_class_decl207 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_class_decl209 = new BitSet(new long[]{0x0043000000000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl210 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_class_decl211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl235 = new BitSet(new long[]{0x0042000000000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl238 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_method_decl267 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDF_in_method_decl269 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_method_decl271 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_method_args_in_method_decl273 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_method_decl276 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_function_decl_in_method_decl278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_function_decl300 = new BitSet(new long[]{0x0300000800000000L});
    public static final BitSet FOLLOW_type_in_function_decl302 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function_decl303 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_var_decl_in_function_decl304 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_instruction_in_function_decl307 = new BitSet(new long[]{0x4858001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_52_in_function_decl309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_function_decl331 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_var_decl_in_function_decl332 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_instruction_in_function_decl335 = new BitSet(new long[]{0x4858001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_52_in_function_decl338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_arg_in_method_args360 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_method_args363 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_method_arg_in_method_args365 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_arg387 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_method_arg389 = new BitSet(new long[]{0x0300000800000000L});
    public static final BitSet FOLLOW_type_in_method_arg391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_var_decl409 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDF_in_var_decl411 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_var_decl413 = new BitSet(new long[]{0x0300000800000000L});
    public static final BitSet FOLLOW_type_in_var_decl415 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_var_decl417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_type437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_type449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_type462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_instruction475 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instruction477 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_instruction479 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_instruction481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_instruction499 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDF_in_instruction501 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_instruction503 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_instruction505 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_instruction507 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_instruction509 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_instruction511 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_instruction_in_instruction513 = new BitSet(new long[]{0xC848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_63_in_instruction516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_instruction542 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_instruction544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_instruction546 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_instruction_in_instruction550 = new BitSet(new long[]{0x4848001000000000L,0x000000000000700DL});
    public static final BitSet FOLLOW_66_in_instruction554 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_instruction_in_instruction558 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007009L});
    public static final BitSet FOLLOW_67_in_instruction563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_instruction610 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_instruction612 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_instruction614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_instruction635 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_var_decl_in_instruction637 = new BitSet(new long[]{0x4848001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_instruction_in_instruction640 = new BitSet(new long[]{0x4858001000000000L,0x0000000000007001L});
    public static final BitSet FOLLOW_52_in_instruction643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_decl_in_instruction664 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_instruction666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction685 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_instruction686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_expression704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_expression710 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_CLASS_in_expression712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiop_in_operation730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_operation738 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C40L});
    public static final BitSet FOLLOW_multiop_in_operation742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_70_in_operation759 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C40L});
    public static final BitSet FOLLOW_multiop_in_operation763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_comparaison_in_multiop786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_multiop794 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C40L});
    public static final BitSet FOLLOW_comparaison_in_multiop798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_72_in_multiop815 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C40L});
    public static final BitSet FOLLOW_comparaison_in_multiop819 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_moinsunaire_in_comparaison842 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_OPER_in_comparaison845 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C40L});
    public static final BitSet FOLLOW_moinsunaire_in_comparaison848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_moinsunaire860 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C40L});
    public static final BitSet FOLLOW_atom_in_moinsunaire865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_atom883 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom886 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDF_in_atom888 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_atom890 = new BitSet(new long[]{0x000180D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_atom892 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_53_in_atom894 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_atom895 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_atom900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_atom931 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom934 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDF_in_atom936 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_atom938 = new BitSet(new long[]{0x000180D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_atom940 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_53_in_atom942 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_atom943 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_atom948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_atom980 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom983 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDF_in_atom985 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_atom987 = new BitSet(new long[]{0x000180D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_atom989 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_53_in_atom991 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_atom992 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_atom997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_atom1030 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_atom1032 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_atom1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_print1046 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_print1048 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_print1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_return_decl1066 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_return_decl1067 = new BitSet(new long[]{0x000080D000000000L,0x0000000000000C50L});
    public static final BitSet FOLLOW_expression_in_return_decl1069 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_return_decl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_read1084 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDF_in_read1086 = new BitSet(new long[]{0x0000000000000002L});

}