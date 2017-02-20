package com.wamas.ide.launching.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.wamas.ide.launching.services.LcDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLcDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQ", "RULE_ID", "RULE_STRING", "RULE_VERSION", "RULE_INT", "RULE_QUALIFIER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stdin'", "'java'", "'eclipse'", "'rap'", "'group'", "'run'", "'debug'", "'profile'", "'coverage'", "'inherit'", "'MB'", "'mb'", "'M'", "'m'", "'GB'", "'gb'", "'G'", "'g'", "'stdout'", "'stderr'", "'both-out'", "'configuration'", "'{'", "'}'", "':'", "';'", "'workspace'", "'working-dir'", "'project'", "'main-class'", "'plugin'", "'ignore'", "'vm-arg'", "'argument'", "'environment'", "'application'", "'product'", "'favorite'", "'redirect'", "'to'", "'from'", "'execution-environment'", "'clear'", "'memory'", "'min'", "'max'", "'perm'", "'member'", "'delay'", "'regex'", "'wait'", "'.'", "'explicit'", "'manual'", "'foreground'", "'no-console'", "'log'", "'!'", "'config'", "'adopt'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_VERSION=7;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_EQ=4;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_QUALIFIER=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLcDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLcDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLcDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLcDsl.g"; }


    	private LcDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(LcDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleLCModel"
    // InternalLcDsl.g:53:1: entryRuleLCModel : ruleLCModel EOF ;
    public final void entryRuleLCModel() throws RecognitionException {
        try {
            // InternalLcDsl.g:54:1: ( ruleLCModel EOF )
            // InternalLcDsl.g:55:1: ruleLCModel EOF
            {
             before(grammarAccess.getLCModelRule()); 
            pushFollow(FOLLOW_1);
            ruleLCModel();

            state._fsp--;

             after(grammarAccess.getLCModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLCModel"


    // $ANTLR start "ruleLCModel"
    // InternalLcDsl.g:62:1: ruleLCModel : ( ( rule__LCModel__ConfigurationsAssignment )* ) ;
    public final void ruleLCModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:66:2: ( ( ( rule__LCModel__ConfigurationsAssignment )* ) )
            // InternalLcDsl.g:67:2: ( ( rule__LCModel__ConfigurationsAssignment )* )
            {
            // InternalLcDsl.g:67:2: ( ( rule__LCModel__ConfigurationsAssignment )* )
            // InternalLcDsl.g:68:3: ( rule__LCModel__ConfigurationsAssignment )*
            {
             before(grammarAccess.getLCModelAccess().getConfigurationsAssignment()); 
            // InternalLcDsl.g:69:3: ( rule__LCModel__ConfigurationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=18)||(LA1_0>=66 && LA1_0<=69)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLcDsl.g:69:4: rule__LCModel__ConfigurationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LCModel__ConfigurationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLCModelAccess().getConfigurationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLCModel"


    // $ANTLR start "entryRuleLaunchConfig"
    // InternalLcDsl.g:78:1: entryRuleLaunchConfig : ruleLaunchConfig EOF ;
    public final void entryRuleLaunchConfig() throws RecognitionException {
        try {
            // InternalLcDsl.g:79:1: ( ruleLaunchConfig EOF )
            // InternalLcDsl.g:80:1: ruleLaunchConfig EOF
            {
             before(grammarAccess.getLaunchConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleLaunchConfig();

            state._fsp--;

             after(grammarAccess.getLaunchConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLaunchConfig"


    // $ANTLR start "ruleLaunchConfig"
    // InternalLcDsl.g:87:1: ruleLaunchConfig : ( ( rule__LaunchConfig__Group__0 ) ) ;
    public final void ruleLaunchConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:91:2: ( ( ( rule__LaunchConfig__Group__0 ) ) )
            // InternalLcDsl.g:92:2: ( ( rule__LaunchConfig__Group__0 ) )
            {
            // InternalLcDsl.g:92:2: ( ( rule__LaunchConfig__Group__0 ) )
            // InternalLcDsl.g:93:3: ( rule__LaunchConfig__Group__0 )
            {
             before(grammarAccess.getLaunchConfigAccess().getGroup()); 
            // InternalLcDsl.g:94:3: ( rule__LaunchConfig__Group__0 )
            // InternalLcDsl.g:94:4: rule__LaunchConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLaunchConfig"


    // $ANTLR start "entryRuleAddPlugin"
    // InternalLcDsl.g:103:1: entryRuleAddPlugin : ruleAddPlugin EOF ;
    public final void entryRuleAddPlugin() throws RecognitionException {
        try {
            // InternalLcDsl.g:104:1: ( ruleAddPlugin EOF )
            // InternalLcDsl.g:105:1: ruleAddPlugin EOF
            {
             before(grammarAccess.getAddPluginRule()); 
            pushFollow(FOLLOW_1);
            ruleAddPlugin();

            state._fsp--;

             after(grammarAccess.getAddPluginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddPlugin"


    // $ANTLR start "ruleAddPlugin"
    // InternalLcDsl.g:112:1: ruleAddPlugin : ( ( rule__AddPlugin__Group__0 ) ) ;
    public final void ruleAddPlugin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:116:2: ( ( ( rule__AddPlugin__Group__0 ) ) )
            // InternalLcDsl.g:117:2: ( ( rule__AddPlugin__Group__0 ) )
            {
            // InternalLcDsl.g:117:2: ( ( rule__AddPlugin__Group__0 ) )
            // InternalLcDsl.g:118:3: ( rule__AddPlugin__Group__0 )
            {
             before(grammarAccess.getAddPluginAccess().getGroup()); 
            // InternalLcDsl.g:119:3: ( rule__AddPlugin__Group__0 )
            // InternalLcDsl.g:119:4: rule__AddPlugin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddPlugin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddPluginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddPlugin"


    // $ANTLR start "entryRuleIgnorePlugin"
    // InternalLcDsl.g:128:1: entryRuleIgnorePlugin : ruleIgnorePlugin EOF ;
    public final void entryRuleIgnorePlugin() throws RecognitionException {
        try {
            // InternalLcDsl.g:129:1: ( ruleIgnorePlugin EOF )
            // InternalLcDsl.g:130:1: ruleIgnorePlugin EOF
            {
             before(grammarAccess.getIgnorePluginRule()); 
            pushFollow(FOLLOW_1);
            ruleIgnorePlugin();

            state._fsp--;

             after(grammarAccess.getIgnorePluginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIgnorePlugin"


    // $ANTLR start "ruleIgnorePlugin"
    // InternalLcDsl.g:137:1: ruleIgnorePlugin : ( ( rule__IgnorePlugin__Group__0 ) ) ;
    public final void ruleIgnorePlugin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:141:2: ( ( ( rule__IgnorePlugin__Group__0 ) ) )
            // InternalLcDsl.g:142:2: ( ( rule__IgnorePlugin__Group__0 ) )
            {
            // InternalLcDsl.g:142:2: ( ( rule__IgnorePlugin__Group__0 ) )
            // InternalLcDsl.g:143:3: ( rule__IgnorePlugin__Group__0 )
            {
             before(grammarAccess.getIgnorePluginAccess().getGroup()); 
            // InternalLcDsl.g:144:3: ( rule__IgnorePlugin__Group__0 )
            // InternalLcDsl.g:144:4: rule__IgnorePlugin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IgnorePlugin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIgnorePluginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIgnorePlugin"


    // $ANTLR start "entryRuleVmArgument"
    // InternalLcDsl.g:153:1: entryRuleVmArgument : ruleVmArgument EOF ;
    public final void entryRuleVmArgument() throws RecognitionException {
        try {
            // InternalLcDsl.g:154:1: ( ruleVmArgument EOF )
            // InternalLcDsl.g:155:1: ruleVmArgument EOF
            {
             before(grammarAccess.getVmArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleVmArgument();

            state._fsp--;

             after(grammarAccess.getVmArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVmArgument"


    // $ANTLR start "ruleVmArgument"
    // InternalLcDsl.g:162:1: ruleVmArgument : ( ( rule__VmArgument__Group__0 ) ) ;
    public final void ruleVmArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:166:2: ( ( ( rule__VmArgument__Group__0 ) ) )
            // InternalLcDsl.g:167:2: ( ( rule__VmArgument__Group__0 ) )
            {
            // InternalLcDsl.g:167:2: ( ( rule__VmArgument__Group__0 ) )
            // InternalLcDsl.g:168:3: ( rule__VmArgument__Group__0 )
            {
             before(grammarAccess.getVmArgumentAccess().getGroup()); 
            // InternalLcDsl.g:169:3: ( rule__VmArgument__Group__0 )
            // InternalLcDsl.g:169:4: rule__VmArgument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VmArgument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVmArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVmArgument"


    // $ANTLR start "entryRuleProgramArgument"
    // InternalLcDsl.g:178:1: entryRuleProgramArgument : ruleProgramArgument EOF ;
    public final void entryRuleProgramArgument() throws RecognitionException {
        try {
            // InternalLcDsl.g:179:1: ( ruleProgramArgument EOF )
            // InternalLcDsl.g:180:1: ruleProgramArgument EOF
            {
             before(grammarAccess.getProgramArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleProgramArgument();

            state._fsp--;

             after(grammarAccess.getProgramArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgramArgument"


    // $ANTLR start "ruleProgramArgument"
    // InternalLcDsl.g:187:1: ruleProgramArgument : ( ( rule__ProgramArgument__Group__0 ) ) ;
    public final void ruleProgramArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:191:2: ( ( ( rule__ProgramArgument__Group__0 ) ) )
            // InternalLcDsl.g:192:2: ( ( rule__ProgramArgument__Group__0 ) )
            {
            // InternalLcDsl.g:192:2: ( ( rule__ProgramArgument__Group__0 ) )
            // InternalLcDsl.g:193:3: ( rule__ProgramArgument__Group__0 )
            {
             before(grammarAccess.getProgramArgumentAccess().getGroup()); 
            // InternalLcDsl.g:194:3: ( rule__ProgramArgument__Group__0 )
            // InternalLcDsl.g:194:4: rule__ProgramArgument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProgramArgument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgramArgument"


    // $ANTLR start "entryRuleEnvironmentVariable"
    // InternalLcDsl.g:203:1: entryRuleEnvironmentVariable : ruleEnvironmentVariable EOF ;
    public final void entryRuleEnvironmentVariable() throws RecognitionException {
        try {
            // InternalLcDsl.g:204:1: ( ruleEnvironmentVariable EOF )
            // InternalLcDsl.g:205:1: ruleEnvironmentVariable EOF
            {
             before(grammarAccess.getEnvironmentVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentVariable();

            state._fsp--;

             after(grammarAccess.getEnvironmentVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnvironmentVariable"


    // $ANTLR start "ruleEnvironmentVariable"
    // InternalLcDsl.g:212:1: ruleEnvironmentVariable : ( ( rule__EnvironmentVariable__Group__0 ) ) ;
    public final void ruleEnvironmentVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:216:2: ( ( ( rule__EnvironmentVariable__Group__0 ) ) )
            // InternalLcDsl.g:217:2: ( ( rule__EnvironmentVariable__Group__0 ) )
            {
            // InternalLcDsl.g:217:2: ( ( rule__EnvironmentVariable__Group__0 ) )
            // InternalLcDsl.g:218:3: ( rule__EnvironmentVariable__Group__0 )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getGroup()); 
            // InternalLcDsl.g:219:3: ( rule__EnvironmentVariable__Group__0 )
            // InternalLcDsl.g:219:4: rule__EnvironmentVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironmentVariable"


    // $ANTLR start "entryRuleApplicationExtPoint"
    // InternalLcDsl.g:228:1: entryRuleApplicationExtPoint : ruleApplicationExtPoint EOF ;
    public final void entryRuleApplicationExtPoint() throws RecognitionException {
        try {
            // InternalLcDsl.g:229:1: ( ruleApplicationExtPoint EOF )
            // InternalLcDsl.g:230:1: ruleApplicationExtPoint EOF
            {
             before(grammarAccess.getApplicationExtPointRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationExtPoint();

            state._fsp--;

             after(grammarAccess.getApplicationExtPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplicationExtPoint"


    // $ANTLR start "ruleApplicationExtPoint"
    // InternalLcDsl.g:237:1: ruleApplicationExtPoint : ( ( rule__ApplicationExtPoint__Group__0 ) ) ;
    public final void ruleApplicationExtPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:241:2: ( ( ( rule__ApplicationExtPoint__Group__0 ) ) )
            // InternalLcDsl.g:242:2: ( ( rule__ApplicationExtPoint__Group__0 ) )
            {
            // InternalLcDsl.g:242:2: ( ( rule__ApplicationExtPoint__Group__0 ) )
            // InternalLcDsl.g:243:3: ( rule__ApplicationExtPoint__Group__0 )
            {
             before(grammarAccess.getApplicationExtPointAccess().getGroup()); 
            // InternalLcDsl.g:244:3: ( rule__ApplicationExtPoint__Group__0 )
            // InternalLcDsl.g:244:4: rule__ApplicationExtPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationExtPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationExtPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationExtPoint"


    // $ANTLR start "entryRuleProductExtPoint"
    // InternalLcDsl.g:253:1: entryRuleProductExtPoint : ruleProductExtPoint EOF ;
    public final void entryRuleProductExtPoint() throws RecognitionException {
        try {
            // InternalLcDsl.g:254:1: ( ruleProductExtPoint EOF )
            // InternalLcDsl.g:255:1: ruleProductExtPoint EOF
            {
             before(grammarAccess.getProductExtPointRule()); 
            pushFollow(FOLLOW_1);
            ruleProductExtPoint();

            state._fsp--;

             after(grammarAccess.getProductExtPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProductExtPoint"


    // $ANTLR start "ruleProductExtPoint"
    // InternalLcDsl.g:262:1: ruleProductExtPoint : ( ( rule__ProductExtPoint__Group__0 ) ) ;
    public final void ruleProductExtPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:266:2: ( ( ( rule__ProductExtPoint__Group__0 ) ) )
            // InternalLcDsl.g:267:2: ( ( rule__ProductExtPoint__Group__0 ) )
            {
            // InternalLcDsl.g:267:2: ( ( rule__ProductExtPoint__Group__0 ) )
            // InternalLcDsl.g:268:3: ( rule__ProductExtPoint__Group__0 )
            {
             before(grammarAccess.getProductExtPointAccess().getGroup()); 
            // InternalLcDsl.g:269:3: ( rule__ProductExtPoint__Group__0 )
            // InternalLcDsl.g:269:4: rule__ProductExtPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProductExtPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductExtPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductExtPoint"


    // $ANTLR start "entryRuleFavorites"
    // InternalLcDsl.g:278:1: entryRuleFavorites : ruleFavorites EOF ;
    public final void entryRuleFavorites() throws RecognitionException {
        try {
            // InternalLcDsl.g:279:1: ( ruleFavorites EOF )
            // InternalLcDsl.g:280:1: ruleFavorites EOF
            {
             before(grammarAccess.getFavoritesRule()); 
            pushFollow(FOLLOW_1);
            ruleFavorites();

            state._fsp--;

             after(grammarAccess.getFavoritesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFavorites"


    // $ANTLR start "ruleFavorites"
    // InternalLcDsl.g:287:1: ruleFavorites : ( ( rule__Favorites__Group__0 ) ) ;
    public final void ruleFavorites() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:291:2: ( ( ( rule__Favorites__Group__0 ) ) )
            // InternalLcDsl.g:292:2: ( ( rule__Favorites__Group__0 ) )
            {
            // InternalLcDsl.g:292:2: ( ( rule__Favorites__Group__0 ) )
            // InternalLcDsl.g:293:3: ( rule__Favorites__Group__0 )
            {
             before(grammarAccess.getFavoritesAccess().getGroup()); 
            // InternalLcDsl.g:294:3: ( rule__Favorites__Group__0 )
            // InternalLcDsl.g:294:4: rule__Favorites__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Favorites__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFavoritesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFavorites"


    // $ANTLR start "entryRuleRedirect"
    // InternalLcDsl.g:303:1: entryRuleRedirect : ruleRedirect EOF ;
    public final void entryRuleRedirect() throws RecognitionException {
        try {
            // InternalLcDsl.g:304:1: ( ruleRedirect EOF )
            // InternalLcDsl.g:305:1: ruleRedirect EOF
            {
             before(grammarAccess.getRedirectRule()); 
            pushFollow(FOLLOW_1);
            ruleRedirect();

            state._fsp--;

             after(grammarAccess.getRedirectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRedirect"


    // $ANTLR start "ruleRedirect"
    // InternalLcDsl.g:312:1: ruleRedirect : ( ( rule__Redirect__Group__0 ) ) ;
    public final void ruleRedirect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:316:2: ( ( ( rule__Redirect__Group__0 ) ) )
            // InternalLcDsl.g:317:2: ( ( rule__Redirect__Group__0 ) )
            {
            // InternalLcDsl.g:317:2: ( ( rule__Redirect__Group__0 ) )
            // InternalLcDsl.g:318:3: ( rule__Redirect__Group__0 )
            {
             before(grammarAccess.getRedirectAccess().getGroup()); 
            // InternalLcDsl.g:319:3: ( rule__Redirect__Group__0 )
            // InternalLcDsl.g:319:4: rule__Redirect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRedirectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRedirect"


    // $ANTLR start "entryRuleExecutionEnvironment"
    // InternalLcDsl.g:328:1: entryRuleExecutionEnvironment : ruleExecutionEnvironment EOF ;
    public final void entryRuleExecutionEnvironment() throws RecognitionException {
        try {
            // InternalLcDsl.g:329:1: ( ruleExecutionEnvironment EOF )
            // InternalLcDsl.g:330:1: ruleExecutionEnvironment EOF
            {
             before(grammarAccess.getExecutionEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleExecutionEnvironment();

            state._fsp--;

             after(grammarAccess.getExecutionEnvironmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExecutionEnvironment"


    // $ANTLR start "ruleExecutionEnvironment"
    // InternalLcDsl.g:337:1: ruleExecutionEnvironment : ( ( rule__ExecutionEnvironment__Group__0 ) ) ;
    public final void ruleExecutionEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:341:2: ( ( ( rule__ExecutionEnvironment__Group__0 ) ) )
            // InternalLcDsl.g:342:2: ( ( rule__ExecutionEnvironment__Group__0 ) )
            {
            // InternalLcDsl.g:342:2: ( ( rule__ExecutionEnvironment__Group__0 ) )
            // InternalLcDsl.g:343:3: ( rule__ExecutionEnvironment__Group__0 )
            {
             before(grammarAccess.getExecutionEnvironmentAccess().getGroup()); 
            // InternalLcDsl.g:344:3: ( rule__ExecutionEnvironment__Group__0 )
            // InternalLcDsl.g:344:4: rule__ExecutionEnvironment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionEnvironment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExecutionEnvironmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExecutionEnvironment"


    // $ANTLR start "entryRuleExistingPath"
    // InternalLcDsl.g:353:1: entryRuleExistingPath : ruleExistingPath EOF ;
    public final void entryRuleExistingPath() throws RecognitionException {
        try {
            // InternalLcDsl.g:354:1: ( ruleExistingPath EOF )
            // InternalLcDsl.g:355:1: ruleExistingPath EOF
            {
             before(grammarAccess.getExistingPathRule()); 
            pushFollow(FOLLOW_1);
            ruleExistingPath();

            state._fsp--;

             after(grammarAccess.getExistingPathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistingPath"


    // $ANTLR start "ruleExistingPath"
    // InternalLcDsl.g:362:1: ruleExistingPath : ( ( rule__ExistingPath__NameAssignment ) ) ;
    public final void ruleExistingPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:366:2: ( ( ( rule__ExistingPath__NameAssignment ) ) )
            // InternalLcDsl.g:367:2: ( ( rule__ExistingPath__NameAssignment ) )
            {
            // InternalLcDsl.g:367:2: ( ( rule__ExistingPath__NameAssignment ) )
            // InternalLcDsl.g:368:3: ( rule__ExistingPath__NameAssignment )
            {
             before(grammarAccess.getExistingPathAccess().getNameAssignment()); 
            // InternalLcDsl.g:369:3: ( rule__ExistingPath__NameAssignment )
            // InternalLcDsl.g:369:4: rule__ExistingPath__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExistingPath__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExistingPathAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistingPath"


    // $ANTLR start "entryRuleAnyPath"
    // InternalLcDsl.g:378:1: entryRuleAnyPath : ruleAnyPath EOF ;
    public final void entryRuleAnyPath() throws RecognitionException {
        try {
            // InternalLcDsl.g:379:1: ( ruleAnyPath EOF )
            // InternalLcDsl.g:380:1: ruleAnyPath EOF
            {
             before(grammarAccess.getAnyPathRule()); 
            pushFollow(FOLLOW_1);
            ruleAnyPath();

            state._fsp--;

             after(grammarAccess.getAnyPathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyPath"


    // $ANTLR start "ruleAnyPath"
    // InternalLcDsl.g:387:1: ruleAnyPath : ( ( rule__AnyPath__NameAssignment ) ) ;
    public final void ruleAnyPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:391:2: ( ( ( rule__AnyPath__NameAssignment ) ) )
            // InternalLcDsl.g:392:2: ( ( rule__AnyPath__NameAssignment ) )
            {
            // InternalLcDsl.g:392:2: ( ( rule__AnyPath__NameAssignment ) )
            // InternalLcDsl.g:393:3: ( rule__AnyPath__NameAssignment )
            {
             before(grammarAccess.getAnyPathAccess().getNameAssignment()); 
            // InternalLcDsl.g:394:3: ( rule__AnyPath__NameAssignment )
            // InternalLcDsl.g:394:4: rule__AnyPath__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AnyPath__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAnyPathAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyPath"


    // $ANTLR start "entryRulePlugin"
    // InternalLcDsl.g:403:1: entryRulePlugin : rulePlugin EOF ;
    public final void entryRulePlugin() throws RecognitionException {
        try {
            // InternalLcDsl.g:404:1: ( rulePlugin EOF )
            // InternalLcDsl.g:405:1: rulePlugin EOF
            {
             before(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_1);
            rulePlugin();

            state._fsp--;

             after(grammarAccess.getPluginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlugin"


    // $ANTLR start "rulePlugin"
    // InternalLcDsl.g:412:1: rulePlugin : ( ( rule__Plugin__Group__0 ) ) ;
    public final void rulePlugin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:416:2: ( ( ( rule__Plugin__Group__0 ) ) )
            // InternalLcDsl.g:417:2: ( ( rule__Plugin__Group__0 ) )
            {
            // InternalLcDsl.g:417:2: ( ( rule__Plugin__Group__0 ) )
            // InternalLcDsl.g:418:3: ( rule__Plugin__Group__0 )
            {
             before(grammarAccess.getPluginAccess().getGroup()); 
            // InternalLcDsl.g:419:3: ( rule__Plugin__Group__0 )
            // InternalLcDsl.g:419:4: rule__Plugin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlugin"


    // $ANTLR start "entryRuleProject"
    // InternalLcDsl.g:428:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalLcDsl.g:429:1: ( ruleProject EOF )
            // InternalLcDsl.g:430:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalLcDsl.g:437:1: ruleProject : ( ( rule__Project__NameAssignment ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:441:2: ( ( ( rule__Project__NameAssignment ) ) )
            // InternalLcDsl.g:442:2: ( ( rule__Project__NameAssignment ) )
            {
            // InternalLcDsl.g:442:2: ( ( rule__Project__NameAssignment ) )
            // InternalLcDsl.g:443:3: ( rule__Project__NameAssignment )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment()); 
            // InternalLcDsl.g:444:3: ( rule__Project__NameAssignment )
            // InternalLcDsl.g:444:4: rule__Project__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleJavaType"
    // InternalLcDsl.g:453:1: entryRuleJavaType : ruleJavaType EOF ;
    public final void entryRuleJavaType() throws RecognitionException {
        try {
            // InternalLcDsl.g:454:1: ( ruleJavaType EOF )
            // InternalLcDsl.g:455:1: ruleJavaType EOF
            {
             before(grammarAccess.getJavaTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleJavaType();

            state._fsp--;

             after(grammarAccess.getJavaTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJavaType"


    // $ANTLR start "ruleJavaType"
    // InternalLcDsl.g:462:1: ruleJavaType : ( ( rule__JavaType__NameAssignment ) ) ;
    public final void ruleJavaType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:466:2: ( ( ( rule__JavaType__NameAssignment ) ) )
            // InternalLcDsl.g:467:2: ( ( rule__JavaType__NameAssignment ) )
            {
            // InternalLcDsl.g:467:2: ( ( rule__JavaType__NameAssignment ) )
            // InternalLcDsl.g:468:3: ( rule__JavaType__NameAssignment )
            {
             before(grammarAccess.getJavaTypeAccess().getNameAssignment()); 
            // InternalLcDsl.g:469:3: ( rule__JavaType__NameAssignment )
            // InternalLcDsl.g:469:4: rule__JavaType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JavaType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJavaTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJavaType"


    // $ANTLR start "entryRuleClearOption"
    // InternalLcDsl.g:478:1: entryRuleClearOption : ruleClearOption EOF ;
    public final void entryRuleClearOption() throws RecognitionException {
        try {
            // InternalLcDsl.g:479:1: ( ruleClearOption EOF )
            // InternalLcDsl.g:480:1: ruleClearOption EOF
            {
             before(grammarAccess.getClearOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleClearOption();

            state._fsp--;

             after(grammarAccess.getClearOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClearOption"


    // $ANTLR start "ruleClearOption"
    // InternalLcDsl.g:487:1: ruleClearOption : ( ( rule__ClearOption__Group__0 ) ) ;
    public final void ruleClearOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:491:2: ( ( ( rule__ClearOption__Group__0 ) ) )
            // InternalLcDsl.g:492:2: ( ( rule__ClearOption__Group__0 ) )
            {
            // InternalLcDsl.g:492:2: ( ( rule__ClearOption__Group__0 ) )
            // InternalLcDsl.g:493:3: ( rule__ClearOption__Group__0 )
            {
             before(grammarAccess.getClearOptionAccess().getGroup()); 
            // InternalLcDsl.g:494:3: ( rule__ClearOption__Group__0 )
            // InternalLcDsl.g:494:4: rule__ClearOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClearOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClearOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClearOption"


    // $ANTLR start "entryRuleMemoryOption"
    // InternalLcDsl.g:503:1: entryRuleMemoryOption : ruleMemoryOption EOF ;
    public final void entryRuleMemoryOption() throws RecognitionException {
        try {
            // InternalLcDsl.g:504:1: ( ruleMemoryOption EOF )
            // InternalLcDsl.g:505:1: ruleMemoryOption EOF
            {
             before(grammarAccess.getMemoryOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleMemoryOption();

            state._fsp--;

             after(grammarAccess.getMemoryOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemoryOption"


    // $ANTLR start "ruleMemoryOption"
    // InternalLcDsl.g:512:1: ruleMemoryOption : ( ( rule__MemoryOption__Group__0 ) ) ;
    public final void ruleMemoryOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:516:2: ( ( ( rule__MemoryOption__Group__0 ) ) )
            // InternalLcDsl.g:517:2: ( ( rule__MemoryOption__Group__0 ) )
            {
            // InternalLcDsl.g:517:2: ( ( rule__MemoryOption__Group__0 ) )
            // InternalLcDsl.g:518:3: ( rule__MemoryOption__Group__0 )
            {
             before(grammarAccess.getMemoryOptionAccess().getGroup()); 
            // InternalLcDsl.g:519:3: ( rule__MemoryOption__Group__0 )
            // InternalLcDsl.g:519:4: rule__MemoryOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemoryOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemoryOption"


    // $ANTLR start "entryRuleGroupMember"
    // InternalLcDsl.g:528:1: entryRuleGroupMember : ruleGroupMember EOF ;
    public final void entryRuleGroupMember() throws RecognitionException {
        try {
            // InternalLcDsl.g:529:1: ( ruleGroupMember EOF )
            // InternalLcDsl.g:530:1: ruleGroupMember EOF
            {
             before(grammarAccess.getGroupMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupMember();

            state._fsp--;

             after(grammarAccess.getGroupMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupMember"


    // $ANTLR start "ruleGroupMember"
    // InternalLcDsl.g:537:1: ruleGroupMember : ( ( rule__GroupMember__Group__0 ) ) ;
    public final void ruleGroupMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:541:2: ( ( ( rule__GroupMember__Group__0 ) ) )
            // InternalLcDsl.g:542:2: ( ( rule__GroupMember__Group__0 ) )
            {
            // InternalLcDsl.g:542:2: ( ( rule__GroupMember__Group__0 ) )
            // InternalLcDsl.g:543:3: ( rule__GroupMember__Group__0 )
            {
             before(grammarAccess.getGroupMemberAccess().getGroup()); 
            // InternalLcDsl.g:544:3: ( rule__GroupMember__Group__0 )
            // InternalLcDsl.g:544:4: rule__GroupMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupMember"


    // $ANTLR start "entryRuleGroupPostLaunchAction"
    // InternalLcDsl.g:553:1: entryRuleGroupPostLaunchAction : ruleGroupPostLaunchAction EOF ;
    public final void entryRuleGroupPostLaunchAction() throws RecognitionException {
        try {
            // InternalLcDsl.g:554:1: ( ruleGroupPostLaunchAction EOF )
            // InternalLcDsl.g:555:1: ruleGroupPostLaunchAction EOF
            {
             before(grammarAccess.getGroupPostLaunchActionRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupPostLaunchAction();

            state._fsp--;

             after(grammarAccess.getGroupPostLaunchActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupPostLaunchAction"


    // $ANTLR start "ruleGroupPostLaunchAction"
    // InternalLcDsl.g:562:1: ruleGroupPostLaunchAction : ( ( rule__GroupPostLaunchAction__Alternatives ) ) ;
    public final void ruleGroupPostLaunchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:566:2: ( ( ( rule__GroupPostLaunchAction__Alternatives ) ) )
            // InternalLcDsl.g:567:2: ( ( rule__GroupPostLaunchAction__Alternatives ) )
            {
            // InternalLcDsl.g:567:2: ( ( rule__GroupPostLaunchAction__Alternatives ) )
            // InternalLcDsl.g:568:3: ( rule__GroupPostLaunchAction__Alternatives )
            {
             before(grammarAccess.getGroupPostLaunchActionAccess().getAlternatives()); 
            // InternalLcDsl.g:569:3: ( rule__GroupPostLaunchAction__Alternatives )
            // InternalLcDsl.g:569:4: rule__GroupPostLaunchAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroupPostLaunchActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupPostLaunchAction"


    // $ANTLR start "entryRuleGroupPostLaunchDelay"
    // InternalLcDsl.g:578:1: entryRuleGroupPostLaunchDelay : ruleGroupPostLaunchDelay EOF ;
    public final void entryRuleGroupPostLaunchDelay() throws RecognitionException {
        try {
            // InternalLcDsl.g:579:1: ( ruleGroupPostLaunchDelay EOF )
            // InternalLcDsl.g:580:1: ruleGroupPostLaunchDelay EOF
            {
             before(grammarAccess.getGroupPostLaunchDelayRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupPostLaunchDelay();

            state._fsp--;

             after(grammarAccess.getGroupPostLaunchDelayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupPostLaunchDelay"


    // $ANTLR start "ruleGroupPostLaunchDelay"
    // InternalLcDsl.g:587:1: ruleGroupPostLaunchDelay : ( ( rule__GroupPostLaunchDelay__Group__0 ) ) ;
    public final void ruleGroupPostLaunchDelay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:591:2: ( ( ( rule__GroupPostLaunchDelay__Group__0 ) ) )
            // InternalLcDsl.g:592:2: ( ( rule__GroupPostLaunchDelay__Group__0 ) )
            {
            // InternalLcDsl.g:592:2: ( ( rule__GroupPostLaunchDelay__Group__0 ) )
            // InternalLcDsl.g:593:3: ( rule__GroupPostLaunchDelay__Group__0 )
            {
             before(grammarAccess.getGroupPostLaunchDelayAccess().getGroup()); 
            // InternalLcDsl.g:594:3: ( rule__GroupPostLaunchDelay__Group__0 )
            // InternalLcDsl.g:594:4: rule__GroupPostLaunchDelay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchDelay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupPostLaunchDelayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupPostLaunchDelay"


    // $ANTLR start "entryRuleGroupPostLaunchRegex"
    // InternalLcDsl.g:603:1: entryRuleGroupPostLaunchRegex : ruleGroupPostLaunchRegex EOF ;
    public final void entryRuleGroupPostLaunchRegex() throws RecognitionException {
        try {
            // InternalLcDsl.g:604:1: ( ruleGroupPostLaunchRegex EOF )
            // InternalLcDsl.g:605:1: ruleGroupPostLaunchRegex EOF
            {
             before(grammarAccess.getGroupPostLaunchRegexRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupPostLaunchRegex();

            state._fsp--;

             after(grammarAccess.getGroupPostLaunchRegexRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupPostLaunchRegex"


    // $ANTLR start "ruleGroupPostLaunchRegex"
    // InternalLcDsl.g:612:1: ruleGroupPostLaunchRegex : ( ( rule__GroupPostLaunchRegex__Group__0 ) ) ;
    public final void ruleGroupPostLaunchRegex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:616:2: ( ( ( rule__GroupPostLaunchRegex__Group__0 ) ) )
            // InternalLcDsl.g:617:2: ( ( rule__GroupPostLaunchRegex__Group__0 ) )
            {
            // InternalLcDsl.g:617:2: ( ( rule__GroupPostLaunchRegex__Group__0 ) )
            // InternalLcDsl.g:618:3: ( rule__GroupPostLaunchRegex__Group__0 )
            {
             before(grammarAccess.getGroupPostLaunchRegexAccess().getGroup()); 
            // InternalLcDsl.g:619:3: ( rule__GroupPostLaunchRegex__Group__0 )
            // InternalLcDsl.g:619:4: rule__GroupPostLaunchRegex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchRegex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupPostLaunchRegexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupPostLaunchRegex"


    // $ANTLR start "entryRuleGroupPostLaunchWait"
    // InternalLcDsl.g:628:1: entryRuleGroupPostLaunchWait : ruleGroupPostLaunchWait EOF ;
    public final void entryRuleGroupPostLaunchWait() throws RecognitionException {
        try {
            // InternalLcDsl.g:629:1: ( ruleGroupPostLaunchWait EOF )
            // InternalLcDsl.g:630:1: ruleGroupPostLaunchWait EOF
            {
             before(grammarAccess.getGroupPostLaunchWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupPostLaunchWait();

            state._fsp--;

             after(grammarAccess.getGroupPostLaunchWaitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupPostLaunchWait"


    // $ANTLR start "ruleGroupPostLaunchWait"
    // InternalLcDsl.g:637:1: ruleGroupPostLaunchWait : ( ( rule__GroupPostLaunchWait__Group__0 ) ) ;
    public final void ruleGroupPostLaunchWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:641:2: ( ( ( rule__GroupPostLaunchWait__Group__0 ) ) )
            // InternalLcDsl.g:642:2: ( ( rule__GroupPostLaunchWait__Group__0 ) )
            {
            // InternalLcDsl.g:642:2: ( ( rule__GroupPostLaunchWait__Group__0 ) )
            // InternalLcDsl.g:643:3: ( rule__GroupPostLaunchWait__Group__0 )
            {
             before(grammarAccess.getGroupPostLaunchWaitAccess().getGroup()); 
            // InternalLcDsl.g:644:3: ( rule__GroupPostLaunchWait__Group__0 )
            // InternalLcDsl.g:644:4: rule__GroupPostLaunchWait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchWait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupPostLaunchWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupPostLaunchWait"


    // $ANTLR start "entryRuleFQName"
    // InternalLcDsl.g:653:1: entryRuleFQName : ruleFQName EOF ;
    public final void entryRuleFQName() throws RecognitionException {
        try {
            // InternalLcDsl.g:654:1: ( ruleFQName EOF )
            // InternalLcDsl.g:655:1: ruleFQName EOF
            {
             before(grammarAccess.getFQNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getFQNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQName"


    // $ANTLR start "ruleFQName"
    // InternalLcDsl.g:662:1: ruleFQName : ( ( rule__FQName__Group__0 ) ) ;
    public final void ruleFQName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:666:2: ( ( ( rule__FQName__Group__0 ) ) )
            // InternalLcDsl.g:667:2: ( ( rule__FQName__Group__0 ) )
            {
            // InternalLcDsl.g:667:2: ( ( rule__FQName__Group__0 ) )
            // InternalLcDsl.g:668:3: ( rule__FQName__Group__0 )
            {
             before(grammarAccess.getFQNameAccess().getGroup()); 
            // InternalLcDsl.g:669:3: ( rule__FQName__Group__0 )
            // InternalLcDsl.g:669:4: rule__FQName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQName"


    // $ANTLR start "ruleLaunchConfigType"
    // InternalLcDsl.g:678:1: ruleLaunchConfigType : ( ( rule__LaunchConfigType__Alternatives ) ) ;
    public final void ruleLaunchConfigType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:682:1: ( ( ( rule__LaunchConfigType__Alternatives ) ) )
            // InternalLcDsl.g:683:2: ( ( rule__LaunchConfigType__Alternatives ) )
            {
            // InternalLcDsl.g:683:2: ( ( rule__LaunchConfigType__Alternatives ) )
            // InternalLcDsl.g:684:3: ( rule__LaunchConfigType__Alternatives )
            {
             before(grammarAccess.getLaunchConfigTypeAccess().getAlternatives()); 
            // InternalLcDsl.g:685:3: ( rule__LaunchConfigType__Alternatives )
            // InternalLcDsl.g:685:4: rule__LaunchConfigType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfigType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLaunchConfigType"


    // $ANTLR start "ruleLaunchModeType"
    // InternalLcDsl.g:694:1: ruleLaunchModeType : ( ( rule__LaunchModeType__Alternatives ) ) ;
    public final void ruleLaunchModeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:698:1: ( ( ( rule__LaunchModeType__Alternatives ) ) )
            // InternalLcDsl.g:699:2: ( ( rule__LaunchModeType__Alternatives ) )
            {
            // InternalLcDsl.g:699:2: ( ( rule__LaunchModeType__Alternatives ) )
            // InternalLcDsl.g:700:3: ( rule__LaunchModeType__Alternatives )
            {
             before(grammarAccess.getLaunchModeTypeAccess().getAlternatives()); 
            // InternalLcDsl.g:701:3: ( rule__LaunchModeType__Alternatives )
            // InternalLcDsl.g:701:4: rule__LaunchModeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LaunchModeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLaunchModeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLaunchModeType"


    // $ANTLR start "ruleMemoryUnit"
    // InternalLcDsl.g:710:1: ruleMemoryUnit : ( ( rule__MemoryUnit__Alternatives ) ) ;
    public final void ruleMemoryUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:714:1: ( ( ( rule__MemoryUnit__Alternatives ) ) )
            // InternalLcDsl.g:715:2: ( ( rule__MemoryUnit__Alternatives ) )
            {
            // InternalLcDsl.g:715:2: ( ( rule__MemoryUnit__Alternatives ) )
            // InternalLcDsl.g:716:3: ( rule__MemoryUnit__Alternatives )
            {
             before(grammarAccess.getMemoryUnitAccess().getAlternatives()); 
            // InternalLcDsl.g:717:3: ( rule__MemoryUnit__Alternatives )
            // InternalLcDsl.g:717:4: rule__MemoryUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MemoryUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemoryUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemoryUnit"


    // $ANTLR start "ruleOutputStream"
    // InternalLcDsl.g:726:1: ruleOutputStream : ( ( rule__OutputStream__Alternatives ) ) ;
    public final void ruleOutputStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:730:1: ( ( ( rule__OutputStream__Alternatives ) ) )
            // InternalLcDsl.g:731:2: ( ( rule__OutputStream__Alternatives ) )
            {
            // InternalLcDsl.g:731:2: ( ( rule__OutputStream__Alternatives ) )
            // InternalLcDsl.g:732:3: ( rule__OutputStream__Alternatives )
            {
             before(grammarAccess.getOutputStreamAccess().getAlternatives()); 
            // InternalLcDsl.g:733:3: ( rule__OutputStream__Alternatives )
            // InternalLcDsl.g:733:4: rule__OutputStream__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OutputStream__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOutputStreamAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputStream"


    // $ANTLR start "ruleInputStream"
    // InternalLcDsl.g:742:1: ruleInputStream : ( ( 'stdin' ) ) ;
    public final void ruleInputStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:746:1: ( ( ( 'stdin' ) ) )
            // InternalLcDsl.g:747:2: ( ( 'stdin' ) )
            {
            // InternalLcDsl.g:747:2: ( ( 'stdin' ) )
            // InternalLcDsl.g:748:3: ( 'stdin' )
            {
             before(grammarAccess.getInputStreamAccess().getSTDINEnumLiteralDeclaration()); 
            // InternalLcDsl.g:749:3: ( 'stdin' )
            // InternalLcDsl.g:749:4: 'stdin'
            {
            match(input,14,FOLLOW_2); 

            }

             after(grammarAccess.getInputStreamAccess().getSTDINEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputStream"


    // $ANTLR start "rule__LaunchConfig__Alternatives_7"
    // InternalLcDsl.g:757:1: rule__LaunchConfig__Alternatives_7 : ( ( ( rule__LaunchConfig__PluginsAssignment_7_0 ) ) | ( ( rule__LaunchConfig__IgnoreAssignment_7_1 ) ) | ( ( rule__LaunchConfig__GroupMembersAssignment_7_2 ) ) | ( ( rule__LaunchConfig__VmArgsAssignment_7_3 ) ) | ( ( rule__LaunchConfig__ProgArgsAssignment_7_4 ) ) | ( ( rule__LaunchConfig__EnvVarsAssignment_7_5 ) ) );
    public final void rule__LaunchConfig__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:761:1: ( ( ( rule__LaunchConfig__PluginsAssignment_7_0 ) ) | ( ( rule__LaunchConfig__IgnoreAssignment_7_1 ) ) | ( ( rule__LaunchConfig__GroupMembersAssignment_7_2 ) ) | ( ( rule__LaunchConfig__VmArgsAssignment_7_3 ) ) | ( ( rule__LaunchConfig__ProgArgsAssignment_7_4 ) ) | ( ( rule__LaunchConfig__EnvVarsAssignment_7_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 45:
                {
                alt2=2;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 61:
            case 73:
                {
                alt2=3;
                }
                break;
            case 46:
                {
                alt2=4;
                }
                break;
            case 47:
                {
                alt2=5;
                }
                break;
            case 48:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLcDsl.g:762:2: ( ( rule__LaunchConfig__PluginsAssignment_7_0 ) )
                    {
                    // InternalLcDsl.g:762:2: ( ( rule__LaunchConfig__PluginsAssignment_7_0 ) )
                    // InternalLcDsl.g:763:3: ( rule__LaunchConfig__PluginsAssignment_7_0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getPluginsAssignment_7_0()); 
                    // InternalLcDsl.g:764:3: ( rule__LaunchConfig__PluginsAssignment_7_0 )
                    // InternalLcDsl.g:764:4: rule__LaunchConfig__PluginsAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__PluginsAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getPluginsAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:768:2: ( ( rule__LaunchConfig__IgnoreAssignment_7_1 ) )
                    {
                    // InternalLcDsl.g:768:2: ( ( rule__LaunchConfig__IgnoreAssignment_7_1 ) )
                    // InternalLcDsl.g:769:3: ( rule__LaunchConfig__IgnoreAssignment_7_1 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getIgnoreAssignment_7_1()); 
                    // InternalLcDsl.g:770:3: ( rule__LaunchConfig__IgnoreAssignment_7_1 )
                    // InternalLcDsl.g:770:4: rule__LaunchConfig__IgnoreAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__IgnoreAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getIgnoreAssignment_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:774:2: ( ( rule__LaunchConfig__GroupMembersAssignment_7_2 ) )
                    {
                    // InternalLcDsl.g:774:2: ( ( rule__LaunchConfig__GroupMembersAssignment_7_2 ) )
                    // InternalLcDsl.g:775:3: ( rule__LaunchConfig__GroupMembersAssignment_7_2 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroupMembersAssignment_7_2()); 
                    // InternalLcDsl.g:776:3: ( rule__LaunchConfig__GroupMembersAssignment_7_2 )
                    // InternalLcDsl.g:776:4: rule__LaunchConfig__GroupMembersAssignment_7_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__GroupMembersAssignment_7_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getGroupMembersAssignment_7_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:780:2: ( ( rule__LaunchConfig__VmArgsAssignment_7_3 ) )
                    {
                    // InternalLcDsl.g:780:2: ( ( rule__LaunchConfig__VmArgsAssignment_7_3 ) )
                    // InternalLcDsl.g:781:3: ( rule__LaunchConfig__VmArgsAssignment_7_3 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getVmArgsAssignment_7_3()); 
                    // InternalLcDsl.g:782:3: ( rule__LaunchConfig__VmArgsAssignment_7_3 )
                    // InternalLcDsl.g:782:4: rule__LaunchConfig__VmArgsAssignment_7_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__VmArgsAssignment_7_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getVmArgsAssignment_7_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:786:2: ( ( rule__LaunchConfig__ProgArgsAssignment_7_4 ) )
                    {
                    // InternalLcDsl.g:786:2: ( ( rule__LaunchConfig__ProgArgsAssignment_7_4 ) )
                    // InternalLcDsl.g:787:3: ( rule__LaunchConfig__ProgArgsAssignment_7_4 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getProgArgsAssignment_7_4()); 
                    // InternalLcDsl.g:788:3: ( rule__LaunchConfig__ProgArgsAssignment_7_4 )
                    // InternalLcDsl.g:788:4: rule__LaunchConfig__ProgArgsAssignment_7_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__ProgArgsAssignment_7_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getProgArgsAssignment_7_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:792:2: ( ( rule__LaunchConfig__EnvVarsAssignment_7_5 ) )
                    {
                    // InternalLcDsl.g:792:2: ( ( rule__LaunchConfig__EnvVarsAssignment_7_5 ) )
                    // InternalLcDsl.g:793:3: ( rule__LaunchConfig__EnvVarsAssignment_7_5 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getEnvVarsAssignment_7_5()); 
                    // InternalLcDsl.g:794:3: ( rule__LaunchConfig__EnvVarsAssignment_7_5 )
                    // InternalLcDsl.g:794:4: rule__LaunchConfig__EnvVarsAssignment_7_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__EnvVarsAssignment_7_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getEnvVarsAssignment_7_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Alternatives_7"


    // $ANTLR start "rule__ClearOption__Alternatives_2_0_0"
    // InternalLcDsl.g:802:1: rule__ClearOption__Alternatives_2_0_0 : ( ( ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 ) ) | ( ( rule__ClearOption__LogAssignment_2_0_0_1 ) ) );
    public final void rule__ClearOption__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:806:1: ( ( ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 ) ) | ( ( rule__ClearOption__LogAssignment_2_0_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==70) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLcDsl.g:807:2: ( ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 ) )
                    {
                    // InternalLcDsl.g:807:2: ( ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 ) )
                    // InternalLcDsl.g:808:3: ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 )
                    {
                     before(grammarAccess.getClearOptionAccess().getWorkspaceAssignment_2_0_0_0()); 
                    // InternalLcDsl.g:809:3: ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 )
                    // InternalLcDsl.g:809:4: rule__ClearOption__WorkspaceAssignment_2_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClearOption__WorkspaceAssignment_2_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClearOptionAccess().getWorkspaceAssignment_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:813:2: ( ( rule__ClearOption__LogAssignment_2_0_0_1 ) )
                    {
                    // InternalLcDsl.g:813:2: ( ( rule__ClearOption__LogAssignment_2_0_0_1 ) )
                    // InternalLcDsl.g:814:3: ( rule__ClearOption__LogAssignment_2_0_0_1 )
                    {
                     before(grammarAccess.getClearOptionAccess().getLogAssignment_2_0_0_1()); 
                    // InternalLcDsl.g:815:3: ( rule__ClearOption__LogAssignment_2_0_0_1 )
                    // InternalLcDsl.g:815:4: rule__ClearOption__LogAssignment_2_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClearOption__LogAssignment_2_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClearOptionAccess().getLogAssignment_2_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Alternatives_2_0_0"


    // $ANTLR start "rule__GroupPostLaunchAction__Alternatives"
    // InternalLcDsl.g:823:1: rule__GroupPostLaunchAction__Alternatives : ( ( ruleGroupPostLaunchDelay ) | ( ruleGroupPostLaunchRegex ) | ( ruleGroupPostLaunchWait ) );
    public final void rule__GroupPostLaunchAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:827:1: ( ( ruleGroupPostLaunchDelay ) | ( ruleGroupPostLaunchRegex ) | ( ruleGroupPostLaunchWait ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt4=1;
                }
                break;
            case 63:
                {
                alt4=2;
                }
                break;
            case 64:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLcDsl.g:828:2: ( ruleGroupPostLaunchDelay )
                    {
                    // InternalLcDsl.g:828:2: ( ruleGroupPostLaunchDelay )
                    // InternalLcDsl.g:829:3: ruleGroupPostLaunchDelay
                    {
                     before(grammarAccess.getGroupPostLaunchActionAccess().getGroupPostLaunchDelayParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGroupPostLaunchDelay();

                    state._fsp--;

                     after(grammarAccess.getGroupPostLaunchActionAccess().getGroupPostLaunchDelayParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:834:2: ( ruleGroupPostLaunchRegex )
                    {
                    // InternalLcDsl.g:834:2: ( ruleGroupPostLaunchRegex )
                    // InternalLcDsl.g:835:3: ruleGroupPostLaunchRegex
                    {
                     before(grammarAccess.getGroupPostLaunchActionAccess().getGroupPostLaunchRegexParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGroupPostLaunchRegex();

                    state._fsp--;

                     after(grammarAccess.getGroupPostLaunchActionAccess().getGroupPostLaunchRegexParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:840:2: ( ruleGroupPostLaunchWait )
                    {
                    // InternalLcDsl.g:840:2: ( ruleGroupPostLaunchWait )
                    // InternalLcDsl.g:841:3: ruleGroupPostLaunchWait
                    {
                     before(grammarAccess.getGroupPostLaunchActionAccess().getGroupPostLaunchWaitParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGroupPostLaunchWait();

                    state._fsp--;

                     after(grammarAccess.getGroupPostLaunchActionAccess().getGroupPostLaunchWaitParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchAction__Alternatives"


    // $ANTLR start "rule__LaunchConfigType__Alternatives"
    // InternalLcDsl.g:850:1: rule__LaunchConfigType__Alternatives : ( ( ( 'java' ) ) | ( ( 'eclipse' ) ) | ( ( 'rap' ) ) | ( ( 'group' ) ) );
    public final void rule__LaunchConfigType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:854:1: ( ( ( 'java' ) ) | ( ( 'eclipse' ) ) | ( ( 'rap' ) ) | ( ( 'group' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLcDsl.g:855:2: ( ( 'java' ) )
                    {
                    // InternalLcDsl.g:855:2: ( ( 'java' ) )
                    // InternalLcDsl.g:856:3: ( 'java' )
                    {
                     before(grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0()); 
                    // InternalLcDsl.g:857:3: ( 'java' )
                    // InternalLcDsl.g:857:4: 'java'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:861:2: ( ( 'eclipse' ) )
                    {
                    // InternalLcDsl.g:861:2: ( ( 'eclipse' ) )
                    // InternalLcDsl.g:862:3: ( 'eclipse' )
                    {
                     before(grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1()); 
                    // InternalLcDsl.g:863:3: ( 'eclipse' )
                    // InternalLcDsl.g:863:4: 'eclipse'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:867:2: ( ( 'rap' ) )
                    {
                    // InternalLcDsl.g:867:2: ( ( 'rap' ) )
                    // InternalLcDsl.g:868:3: ( 'rap' )
                    {
                     before(grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2()); 
                    // InternalLcDsl.g:869:3: ( 'rap' )
                    // InternalLcDsl.g:869:4: 'rap'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:873:2: ( ( 'group' ) )
                    {
                    // InternalLcDsl.g:873:2: ( ( 'group' ) )
                    // InternalLcDsl.g:874:3: ( 'group' )
                    {
                     before(grammarAccess.getLaunchConfigTypeAccess().getGROUPEnumLiteralDeclaration_3()); 
                    // InternalLcDsl.g:875:3: ( 'group' )
                    // InternalLcDsl.g:875:4: 'group'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchConfigTypeAccess().getGROUPEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfigType__Alternatives"


    // $ANTLR start "rule__LaunchModeType__Alternatives"
    // InternalLcDsl.g:883:1: rule__LaunchModeType__Alternatives : ( ( ( 'run' ) ) | ( ( 'debug' ) ) | ( ( 'profile' ) ) | ( ( 'coverage' ) ) | ( ( 'inherit' ) ) );
    public final void rule__LaunchModeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:887:1: ( ( ( 'run' ) ) | ( ( 'debug' ) ) | ( ( 'profile' ) ) | ( ( 'coverage' ) ) | ( ( 'inherit' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLcDsl.g:888:2: ( ( 'run' ) )
                    {
                    // InternalLcDsl.g:888:2: ( ( 'run' ) )
                    // InternalLcDsl.g:889:3: ( 'run' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0()); 
                    // InternalLcDsl.g:890:3: ( 'run' )
                    // InternalLcDsl.g:890:4: 'run'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:894:2: ( ( 'debug' ) )
                    {
                    // InternalLcDsl.g:894:2: ( ( 'debug' ) )
                    // InternalLcDsl.g:895:3: ( 'debug' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1()); 
                    // InternalLcDsl.g:896:3: ( 'debug' )
                    // InternalLcDsl.g:896:4: 'debug'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:900:2: ( ( 'profile' ) )
                    {
                    // InternalLcDsl.g:900:2: ( ( 'profile' ) )
                    // InternalLcDsl.g:901:3: ( 'profile' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2()); 
                    // InternalLcDsl.g:902:3: ( 'profile' )
                    // InternalLcDsl.g:902:4: 'profile'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:906:2: ( ( 'coverage' ) )
                    {
                    // InternalLcDsl.g:906:2: ( ( 'coverage' ) )
                    // InternalLcDsl.g:907:3: ( 'coverage' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3()); 
                    // InternalLcDsl.g:908:3: ( 'coverage' )
                    // InternalLcDsl.g:908:4: 'coverage'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:912:2: ( ( 'inherit' ) )
                    {
                    // InternalLcDsl.g:912:2: ( ( 'inherit' ) )
                    // InternalLcDsl.g:913:3: ( 'inherit' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getINHERITEnumLiteralDeclaration_4()); 
                    // InternalLcDsl.g:914:3: ( 'inherit' )
                    // InternalLcDsl.g:914:4: 'inherit'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchModeTypeAccess().getINHERITEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchModeType__Alternatives"


    // $ANTLR start "rule__MemoryUnit__Alternatives"
    // InternalLcDsl.g:922:1: rule__MemoryUnit__Alternatives : ( ( ( 'MB' ) ) | ( ( 'mb' ) ) | ( ( 'M' ) ) | ( ( 'm' ) ) | ( ( 'GB' ) ) | ( ( 'gb' ) ) | ( ( 'G' ) ) | ( ( 'g' ) ) );
    public final void rule__MemoryUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:926:1: ( ( ( 'MB' ) ) | ( ( 'mb' ) ) | ( ( 'M' ) ) | ( ( 'm' ) ) | ( ( 'GB' ) ) | ( ( 'gb' ) ) | ( ( 'G' ) ) | ( ( 'g' ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            case 29:
                {
                alt7=6;
                }
                break;
            case 30:
                {
                alt7=7;
                }
                break;
            case 31:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLcDsl.g:927:2: ( ( 'MB' ) )
                    {
                    // InternalLcDsl.g:927:2: ( ( 'MB' ) )
                    // InternalLcDsl.g:928:3: ( 'MB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0()); 
                    // InternalLcDsl.g:929:3: ( 'MB' )
                    // InternalLcDsl.g:929:4: 'MB'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:933:2: ( ( 'mb' ) )
                    {
                    // InternalLcDsl.g:933:2: ( ( 'mb' ) )
                    // InternalLcDsl.g:934:3: ( 'mb' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                    // InternalLcDsl.g:935:3: ( 'mb' )
                    // InternalLcDsl.g:935:4: 'mb'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:939:2: ( ( 'M' ) )
                    {
                    // InternalLcDsl.g:939:2: ( ( 'M' ) )
                    // InternalLcDsl.g:940:3: ( 'M' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2()); 
                    // InternalLcDsl.g:941:3: ( 'M' )
                    // InternalLcDsl.g:941:4: 'M'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:945:2: ( ( 'm' ) )
                    {
                    // InternalLcDsl.g:945:2: ( ( 'm' ) )
                    // InternalLcDsl.g:946:3: ( 'm' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3()); 
                    // InternalLcDsl.g:947:3: ( 'm' )
                    // InternalLcDsl.g:947:4: 'm'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:951:2: ( ( 'GB' ) )
                    {
                    // InternalLcDsl.g:951:2: ( ( 'GB' ) )
                    // InternalLcDsl.g:952:3: ( 'GB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4()); 
                    // InternalLcDsl.g:953:3: ( 'GB' )
                    // InternalLcDsl.g:953:4: 'GB'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:957:2: ( ( 'gb' ) )
                    {
                    // InternalLcDsl.g:957:2: ( ( 'gb' ) )
                    // InternalLcDsl.g:958:3: ( 'gb' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5()); 
                    // InternalLcDsl.g:959:3: ( 'gb' )
                    // InternalLcDsl.g:959:4: 'gb'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:963:2: ( ( 'G' ) )
                    {
                    // InternalLcDsl.g:963:2: ( ( 'G' ) )
                    // InternalLcDsl.g:964:3: ( 'G' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6()); 
                    // InternalLcDsl.g:965:3: ( 'G' )
                    // InternalLcDsl.g:965:4: 'G'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLcDsl.g:969:2: ( ( 'g' ) )
                    {
                    // InternalLcDsl.g:969:2: ( ( 'g' ) )
                    // InternalLcDsl.g:970:3: ( 'g' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_7()); 
                    // InternalLcDsl.g:971:3: ( 'g' )
                    // InternalLcDsl.g:971:4: 'g'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryUnit__Alternatives"


    // $ANTLR start "rule__OutputStream__Alternatives"
    // InternalLcDsl.g:979:1: rule__OutputStream__Alternatives : ( ( ( 'stdout' ) ) | ( ( 'stderr' ) ) | ( ( 'both-out' ) ) );
    public final void rule__OutputStream__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:983:1: ( ( ( 'stdout' ) ) | ( ( 'stderr' ) ) | ( ( 'both-out' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLcDsl.g:984:2: ( ( 'stdout' ) )
                    {
                    // InternalLcDsl.g:984:2: ( ( 'stdout' ) )
                    // InternalLcDsl.g:985:3: ( 'stdout' )
                    {
                     before(grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0()); 
                    // InternalLcDsl.g:986:3: ( 'stdout' )
                    // InternalLcDsl.g:986:4: 'stdout'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:990:2: ( ( 'stderr' ) )
                    {
                    // InternalLcDsl.g:990:2: ( ( 'stderr' ) )
                    // InternalLcDsl.g:991:3: ( 'stderr' )
                    {
                     before(grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1()); 
                    // InternalLcDsl.g:992:3: ( 'stderr' )
                    // InternalLcDsl.g:992:4: 'stderr'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:996:2: ( ( 'both-out' ) )
                    {
                    // InternalLcDsl.g:996:2: ( ( 'both-out' ) )
                    // InternalLcDsl.g:997:3: ( 'both-out' )
                    {
                     before(grammarAccess.getOutputStreamAccess().getBOTHEnumLiteralDeclaration_2()); 
                    // InternalLcDsl.g:998:3: ( 'both-out' )
                    // InternalLcDsl.g:998:4: 'both-out'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getOutputStreamAccess().getBOTHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputStream__Alternatives"


    // $ANTLR start "rule__LaunchConfig__Group__0"
    // InternalLcDsl.g:1006:1: rule__LaunchConfig__Group__0 : rule__LaunchConfig__Group__0__Impl rule__LaunchConfig__Group__1 ;
    public final void rule__LaunchConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1010:1: ( rule__LaunchConfig__Group__0__Impl rule__LaunchConfig__Group__1 )
            // InternalLcDsl.g:1011:2: rule__LaunchConfig__Group__0__Impl rule__LaunchConfig__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LaunchConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__0"


    // $ANTLR start "rule__LaunchConfig__Group__0__Impl"
    // InternalLcDsl.g:1018:1: rule__LaunchConfig__Group__0__Impl : ( ( rule__LaunchConfig__UnorderedGroup_0 ) ) ;
    public final void rule__LaunchConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1022:1: ( ( ( rule__LaunchConfig__UnorderedGroup_0 ) ) )
            // InternalLcDsl.g:1023:1: ( ( rule__LaunchConfig__UnorderedGroup_0 ) )
            {
            // InternalLcDsl.g:1023:1: ( ( rule__LaunchConfig__UnorderedGroup_0 ) )
            // InternalLcDsl.g:1024:2: ( rule__LaunchConfig__UnorderedGroup_0 )
            {
             before(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0()); 
            // InternalLcDsl.g:1025:2: ( rule__LaunchConfig__UnorderedGroup_0 )
            // InternalLcDsl.g:1025:3: rule__LaunchConfig__UnorderedGroup_0
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__UnorderedGroup_0();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__0__Impl"


    // $ANTLR start "rule__LaunchConfig__Group__1"
    // InternalLcDsl.g:1033:1: rule__LaunchConfig__Group__1 : rule__LaunchConfig__Group__1__Impl rule__LaunchConfig__Group__2 ;
    public final void rule__LaunchConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1037:1: ( rule__LaunchConfig__Group__1__Impl rule__LaunchConfig__Group__2 )
            // InternalLcDsl.g:1038:2: rule__LaunchConfig__Group__1__Impl rule__LaunchConfig__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LaunchConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__1"


    // $ANTLR start "rule__LaunchConfig__Group__1__Impl"
    // InternalLcDsl.g:1045:1: rule__LaunchConfig__Group__1__Impl : ( ( rule__LaunchConfig__TypeAssignment_1 ) ) ;
    public final void rule__LaunchConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1049:1: ( ( ( rule__LaunchConfig__TypeAssignment_1 ) ) )
            // InternalLcDsl.g:1050:1: ( ( rule__LaunchConfig__TypeAssignment_1 ) )
            {
            // InternalLcDsl.g:1050:1: ( ( rule__LaunchConfig__TypeAssignment_1 ) )
            // InternalLcDsl.g:1051:2: ( rule__LaunchConfig__TypeAssignment_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getTypeAssignment_1()); 
            // InternalLcDsl.g:1052:2: ( rule__LaunchConfig__TypeAssignment_1 )
            // InternalLcDsl.g:1052:3: rule__LaunchConfig__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__1__Impl"


    // $ANTLR start "rule__LaunchConfig__Group__2"
    // InternalLcDsl.g:1060:1: rule__LaunchConfig__Group__2 : rule__LaunchConfig__Group__2__Impl rule__LaunchConfig__Group__3 ;
    public final void rule__LaunchConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1064:1: ( rule__LaunchConfig__Group__2__Impl rule__LaunchConfig__Group__3 )
            // InternalLcDsl.g:1065:2: rule__LaunchConfig__Group__2__Impl rule__LaunchConfig__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LaunchConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__2"


    // $ANTLR start "rule__LaunchConfig__Group__2__Impl"
    // InternalLcDsl.g:1072:1: rule__LaunchConfig__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__LaunchConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1076:1: ( ( 'configuration' ) )
            // InternalLcDsl.g:1077:1: ( 'configuration' )
            {
            // InternalLcDsl.g:1077:1: ( 'configuration' )
            // InternalLcDsl.g:1078:2: 'configuration'
            {
             before(grammarAccess.getLaunchConfigAccess().getConfigurationKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getConfigurationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__2__Impl"


    // $ANTLR start "rule__LaunchConfig__Group__3"
    // InternalLcDsl.g:1087:1: rule__LaunchConfig__Group__3 : rule__LaunchConfig__Group__3__Impl rule__LaunchConfig__Group__4 ;
    public final void rule__LaunchConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1091:1: ( rule__LaunchConfig__Group__3__Impl rule__LaunchConfig__Group__4 )
            // InternalLcDsl.g:1092:2: rule__LaunchConfig__Group__3__Impl rule__LaunchConfig__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__LaunchConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__3"


    // $ANTLR start "rule__LaunchConfig__Group__3__Impl"
    // InternalLcDsl.g:1099:1: rule__LaunchConfig__Group__3__Impl : ( ( rule__LaunchConfig__NameAssignment_3 ) ) ;
    public final void rule__LaunchConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1103:1: ( ( ( rule__LaunchConfig__NameAssignment_3 ) ) )
            // InternalLcDsl.g:1104:1: ( ( rule__LaunchConfig__NameAssignment_3 ) )
            {
            // InternalLcDsl.g:1104:1: ( ( rule__LaunchConfig__NameAssignment_3 ) )
            // InternalLcDsl.g:1105:2: ( rule__LaunchConfig__NameAssignment_3 )
            {
             before(grammarAccess.getLaunchConfigAccess().getNameAssignment_3()); 
            // InternalLcDsl.g:1106:2: ( rule__LaunchConfig__NameAssignment_3 )
            // InternalLcDsl.g:1106:3: rule__LaunchConfig__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__3__Impl"


    // $ANTLR start "rule__LaunchConfig__Group__4"
    // InternalLcDsl.g:1114:1: rule__LaunchConfig__Group__4 : rule__LaunchConfig__Group__4__Impl rule__LaunchConfig__Group__5 ;
    public final void rule__LaunchConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1118:1: ( rule__LaunchConfig__Group__4__Impl rule__LaunchConfig__Group__5 )
            // InternalLcDsl.g:1119:2: rule__LaunchConfig__Group__4__Impl rule__LaunchConfig__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__LaunchConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__4"


    // $ANTLR start "rule__LaunchConfig__Group__4__Impl"
    // InternalLcDsl.g:1126:1: rule__LaunchConfig__Group__4__Impl : ( ( rule__LaunchConfig__Group_4__0 )? ) ;
    public final void rule__LaunchConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1130:1: ( ( ( rule__LaunchConfig__Group_4__0 )? ) )
            // InternalLcDsl.g:1131:1: ( ( rule__LaunchConfig__Group_4__0 )? )
            {
            // InternalLcDsl.g:1131:1: ( ( rule__LaunchConfig__Group_4__0 )? )
            // InternalLcDsl.g:1132:2: ( rule__LaunchConfig__Group_4__0 )?
            {
             before(grammarAccess.getLaunchConfigAccess().getGroup_4()); 
            // InternalLcDsl.g:1133:2: ( rule__LaunchConfig__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLcDsl.g:1133:3: rule__LaunchConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLaunchConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__4__Impl"


    // $ANTLR start "rule__LaunchConfig__Group__5"
    // InternalLcDsl.g:1141:1: rule__LaunchConfig__Group__5 : rule__LaunchConfig__Group__5__Impl rule__LaunchConfig__Group__6 ;
    public final void rule__LaunchConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1145:1: ( rule__LaunchConfig__Group__5__Impl rule__LaunchConfig__Group__6 )
            // InternalLcDsl.g:1146:2: rule__LaunchConfig__Group__5__Impl rule__LaunchConfig__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__LaunchConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__5"


    // $ANTLR start "rule__LaunchConfig__Group__5__Impl"
    // InternalLcDsl.g:1153:1: rule__LaunchConfig__Group__5__Impl : ( '{' ) ;
    public final void rule__LaunchConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1157:1: ( ( '{' ) )
            // InternalLcDsl.g:1158:1: ( '{' )
            {
            // InternalLcDsl.g:1158:1: ( '{' )
            // InternalLcDsl.g:1159:2: '{'
            {
             before(grammarAccess.getLaunchConfigAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__5__Impl"


    // $ANTLR start "rule__LaunchConfig__Group__6"
    // InternalLcDsl.g:1168:1: rule__LaunchConfig__Group__6 : rule__LaunchConfig__Group__6__Impl rule__LaunchConfig__Group__7 ;
    public final void rule__LaunchConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1172:1: ( rule__LaunchConfig__Group__6__Impl rule__LaunchConfig__Group__7 )
            // InternalLcDsl.g:1173:2: rule__LaunchConfig__Group__6__Impl rule__LaunchConfig__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__LaunchConfig__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__6"


    // $ANTLR start "rule__LaunchConfig__Group__6__Impl"
    // InternalLcDsl.g:1180:1: rule__LaunchConfig__Group__6__Impl : ( ( rule__LaunchConfig__UnorderedGroup_6 ) ) ;
    public final void rule__LaunchConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1184:1: ( ( ( rule__LaunchConfig__UnorderedGroup_6 ) ) )
            // InternalLcDsl.g:1185:1: ( ( rule__LaunchConfig__UnorderedGroup_6 ) )
            {
            // InternalLcDsl.g:1185:1: ( ( rule__LaunchConfig__UnorderedGroup_6 ) )
            // InternalLcDsl.g:1186:2: ( rule__LaunchConfig__UnorderedGroup_6 )
            {
             before(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6()); 
            // InternalLcDsl.g:1187:2: ( rule__LaunchConfig__UnorderedGroup_6 )
            // InternalLcDsl.g:1187:3: rule__LaunchConfig__UnorderedGroup_6
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__UnorderedGroup_6();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__6__Impl"


    // $ANTLR start "rule__LaunchConfig__Group__7"
    // InternalLcDsl.g:1195:1: rule__LaunchConfig__Group__7 : rule__LaunchConfig__Group__7__Impl rule__LaunchConfig__Group__8 ;
    public final void rule__LaunchConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1199:1: ( rule__LaunchConfig__Group__7__Impl rule__LaunchConfig__Group__8 )
            // InternalLcDsl.g:1200:2: rule__LaunchConfig__Group__7__Impl rule__LaunchConfig__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__LaunchConfig__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__7"


    // $ANTLR start "rule__LaunchConfig__Group__7__Impl"
    // InternalLcDsl.g:1207:1: rule__LaunchConfig__Group__7__Impl : ( ( rule__LaunchConfig__Alternatives_7 )* ) ;
    public final void rule__LaunchConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1211:1: ( ( ( rule__LaunchConfig__Alternatives_7 )* ) )
            // InternalLcDsl.g:1212:1: ( ( rule__LaunchConfig__Alternatives_7 )* )
            {
            // InternalLcDsl.g:1212:1: ( ( rule__LaunchConfig__Alternatives_7 )* )
            // InternalLcDsl.g:1213:2: ( rule__LaunchConfig__Alternatives_7 )*
            {
             before(grammarAccess.getLaunchConfigAccess().getAlternatives_7()); 
            // InternalLcDsl.g:1214:2: ( rule__LaunchConfig__Alternatives_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=19 && LA10_0<=23)||(LA10_0>=44 && LA10_0<=48)||LA10_0==61||LA10_0==73) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLcDsl.g:1214:3: rule__LaunchConfig__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LaunchConfig__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLaunchConfigAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__7__Impl"


    // $ANTLR start "rule__LaunchConfig__Group__8"
    // InternalLcDsl.g:1222:1: rule__LaunchConfig__Group__8 : rule__LaunchConfig__Group__8__Impl ;
    public final void rule__LaunchConfig__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1226:1: ( rule__LaunchConfig__Group__8__Impl )
            // InternalLcDsl.g:1227:2: rule__LaunchConfig__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__8"


    // $ANTLR start "rule__LaunchConfig__Group__8__Impl"
    // InternalLcDsl.g:1233:1: rule__LaunchConfig__Group__8__Impl : ( '}' ) ;
    public final void rule__LaunchConfig__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1237:1: ( ( '}' ) )
            // InternalLcDsl.g:1238:1: ( '}' )
            {
            // InternalLcDsl.g:1238:1: ( '}' )
            // InternalLcDsl.g:1239:2: '}'
            {
             before(grammarAccess.getLaunchConfigAccess().getRightCurlyBracketKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group__8__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_4__0"
    // InternalLcDsl.g:1249:1: rule__LaunchConfig__Group_4__0 : rule__LaunchConfig__Group_4__0__Impl rule__LaunchConfig__Group_4__1 ;
    public final void rule__LaunchConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1253:1: ( rule__LaunchConfig__Group_4__0__Impl rule__LaunchConfig__Group_4__1 )
            // InternalLcDsl.g:1254:2: rule__LaunchConfig__Group_4__0__Impl rule__LaunchConfig__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__LaunchConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_4__0"


    // $ANTLR start "rule__LaunchConfig__Group_4__0__Impl"
    // InternalLcDsl.g:1261:1: rule__LaunchConfig__Group_4__0__Impl : ( ':' ) ;
    public final void rule__LaunchConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1265:1: ( ( ':' ) )
            // InternalLcDsl.g:1266:1: ( ':' )
            {
            // InternalLcDsl.g:1266:1: ( ':' )
            // InternalLcDsl.g:1267:2: ':'
            {
             before(grammarAccess.getLaunchConfigAccess().getColonKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_4__0__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_4__1"
    // InternalLcDsl.g:1276:1: rule__LaunchConfig__Group_4__1 : rule__LaunchConfig__Group_4__1__Impl ;
    public final void rule__LaunchConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1280:1: ( rule__LaunchConfig__Group_4__1__Impl )
            // InternalLcDsl.g:1281:2: rule__LaunchConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_4__1"


    // $ANTLR start "rule__LaunchConfig__Group_4__1__Impl"
    // InternalLcDsl.g:1287:1: rule__LaunchConfig__Group_4__1__Impl : ( ( rule__LaunchConfig__SuperConfigAssignment_4_1 ) ) ;
    public final void rule__LaunchConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1291:1: ( ( ( rule__LaunchConfig__SuperConfigAssignment_4_1 ) ) )
            // InternalLcDsl.g:1292:1: ( ( rule__LaunchConfig__SuperConfigAssignment_4_1 ) )
            {
            // InternalLcDsl.g:1292:1: ( ( rule__LaunchConfig__SuperConfigAssignment_4_1 ) )
            // InternalLcDsl.g:1293:2: ( rule__LaunchConfig__SuperConfigAssignment_4_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getSuperConfigAssignment_4_1()); 
            // InternalLcDsl.g:1294:2: ( rule__LaunchConfig__SuperConfigAssignment_4_1 )
            // InternalLcDsl.g:1294:3: rule__LaunchConfig__SuperConfigAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__SuperConfigAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getSuperConfigAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_4__1__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_0__0"
    // InternalLcDsl.g:1303:1: rule__LaunchConfig__Group_6_0__0 : rule__LaunchConfig__Group_6_0__0__Impl rule__LaunchConfig__Group_6_0__1 ;
    public final void rule__LaunchConfig__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1307:1: ( rule__LaunchConfig__Group_6_0__0__Impl rule__LaunchConfig__Group_6_0__1 )
            // InternalLcDsl.g:1308:2: rule__LaunchConfig__Group_6_0__0__Impl rule__LaunchConfig__Group_6_0__1
            {
            pushFollow(FOLLOW_11);
            rule__LaunchConfig__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_0__0"


    // $ANTLR start "rule__LaunchConfig__Group_6_0__0__Impl"
    // InternalLcDsl.g:1315:1: rule__LaunchConfig__Group_6_0__0__Impl : ( ( rule__LaunchConfig__ClearsAssignment_6_0_0 ) ) ;
    public final void rule__LaunchConfig__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1319:1: ( ( ( rule__LaunchConfig__ClearsAssignment_6_0_0 ) ) )
            // InternalLcDsl.g:1320:1: ( ( rule__LaunchConfig__ClearsAssignment_6_0_0 ) )
            {
            // InternalLcDsl.g:1320:1: ( ( rule__LaunchConfig__ClearsAssignment_6_0_0 ) )
            // InternalLcDsl.g:1321:2: ( rule__LaunchConfig__ClearsAssignment_6_0_0 )
            {
             before(grammarAccess.getLaunchConfigAccess().getClearsAssignment_6_0_0()); 
            // InternalLcDsl.g:1322:2: ( rule__LaunchConfig__ClearsAssignment_6_0_0 )
            // InternalLcDsl.g:1322:3: rule__LaunchConfig__ClearsAssignment_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__ClearsAssignment_6_0_0();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getClearsAssignment_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_0__0__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_0__1"
    // InternalLcDsl.g:1330:1: rule__LaunchConfig__Group_6_0__1 : rule__LaunchConfig__Group_6_0__1__Impl ;
    public final void rule__LaunchConfig__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1334:1: ( rule__LaunchConfig__Group_6_0__1__Impl )
            // InternalLcDsl.g:1335:2: rule__LaunchConfig__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_0__1"


    // $ANTLR start "rule__LaunchConfig__Group_6_0__1__Impl"
    // InternalLcDsl.g:1341:1: rule__LaunchConfig__Group_6_0__1__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1345:1: ( ( ';' ) )
            // InternalLcDsl.g:1346:1: ( ';' )
            {
            // InternalLcDsl.g:1346:1: ( ';' )
            // InternalLcDsl.g:1347:2: ';'
            {
             before(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_0__1__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_1__0"
    // InternalLcDsl.g:1357:1: rule__LaunchConfig__Group_6_1__0 : rule__LaunchConfig__Group_6_1__0__Impl rule__LaunchConfig__Group_6_1__1 ;
    public final void rule__LaunchConfig__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1361:1: ( rule__LaunchConfig__Group_6_1__0__Impl rule__LaunchConfig__Group_6_1__1 )
            // InternalLcDsl.g:1362:2: rule__LaunchConfig__Group_6_1__0__Impl rule__LaunchConfig__Group_6_1__1
            {
            pushFollow(FOLLOW_12);
            rule__LaunchConfig__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_1__0"


    // $ANTLR start "rule__LaunchConfig__Group_6_1__0__Impl"
    // InternalLcDsl.g:1369:1: rule__LaunchConfig__Group_6_1__0__Impl : ( 'workspace' ) ;
    public final void rule__LaunchConfig__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1373:1: ( ( 'workspace' ) )
            // InternalLcDsl.g:1374:1: ( 'workspace' )
            {
            // InternalLcDsl.g:1374:1: ( 'workspace' )
            // InternalLcDsl.g:1375:2: 'workspace'
            {
             before(grammarAccess.getLaunchConfigAccess().getWorkspaceKeyword_6_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getWorkspaceKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_1__0__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_1__1"
    // InternalLcDsl.g:1384:1: rule__LaunchConfig__Group_6_1__1 : rule__LaunchConfig__Group_6_1__1__Impl rule__LaunchConfig__Group_6_1__2 ;
    public final void rule__LaunchConfig__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1388:1: ( rule__LaunchConfig__Group_6_1__1__Impl rule__LaunchConfig__Group_6_1__2 )
            // InternalLcDsl.g:1389:2: rule__LaunchConfig__Group_6_1__1__Impl rule__LaunchConfig__Group_6_1__2
            {
            pushFollow(FOLLOW_11);
            rule__LaunchConfig__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_1__1"


    // $ANTLR start "rule__LaunchConfig__Group_6_1__1__Impl"
    // InternalLcDsl.g:1396:1: rule__LaunchConfig__Group_6_1__1__Impl : ( ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 ) ) ;
    public final void rule__LaunchConfig__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1400:1: ( ( ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 ) ) )
            // InternalLcDsl.g:1401:1: ( ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 ) )
            {
            // InternalLcDsl.g:1401:1: ( ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 ) )
            // InternalLcDsl.g:1402:2: ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getWorkspaceAssignment_6_1_1()); 
            // InternalLcDsl.g:1403:2: ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 )
            // InternalLcDsl.g:1403:3: rule__LaunchConfig__WorkspaceAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__WorkspaceAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getWorkspaceAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_1__1__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_1__2"
    // InternalLcDsl.g:1411:1: rule__LaunchConfig__Group_6_1__2 : rule__LaunchConfig__Group_6_1__2__Impl ;
    public final void rule__LaunchConfig__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1415:1: ( rule__LaunchConfig__Group_6_1__2__Impl )
            // InternalLcDsl.g:1416:2: rule__LaunchConfig__Group_6_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_1__2"


    // $ANTLR start "rule__LaunchConfig__Group_6_1__2__Impl"
    // InternalLcDsl.g:1422:1: rule__LaunchConfig__Group_6_1__2__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1426:1: ( ( ';' ) )
            // InternalLcDsl.g:1427:1: ( ';' )
            {
            // InternalLcDsl.g:1427:1: ( ';' )
            // InternalLcDsl.g:1428:2: ';'
            {
             before(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_1__2__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_2__0"
    // InternalLcDsl.g:1438:1: rule__LaunchConfig__Group_6_2__0 : rule__LaunchConfig__Group_6_2__0__Impl rule__LaunchConfig__Group_6_2__1 ;
    public final void rule__LaunchConfig__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1442:1: ( rule__LaunchConfig__Group_6_2__0__Impl rule__LaunchConfig__Group_6_2__1 )
            // InternalLcDsl.g:1443:2: rule__LaunchConfig__Group_6_2__0__Impl rule__LaunchConfig__Group_6_2__1
            {
            pushFollow(FOLLOW_12);
            rule__LaunchConfig__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_2__0"


    // $ANTLR start "rule__LaunchConfig__Group_6_2__0__Impl"
    // InternalLcDsl.g:1450:1: rule__LaunchConfig__Group_6_2__0__Impl : ( 'working-dir' ) ;
    public final void rule__LaunchConfig__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1454:1: ( ( 'working-dir' ) )
            // InternalLcDsl.g:1455:1: ( 'working-dir' )
            {
            // InternalLcDsl.g:1455:1: ( 'working-dir' )
            // InternalLcDsl.g:1456:2: 'working-dir'
            {
             before(grammarAccess.getLaunchConfigAccess().getWorkingDirKeyword_6_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getWorkingDirKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_2__0__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_2__1"
    // InternalLcDsl.g:1465:1: rule__LaunchConfig__Group_6_2__1 : rule__LaunchConfig__Group_6_2__1__Impl rule__LaunchConfig__Group_6_2__2 ;
    public final void rule__LaunchConfig__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1469:1: ( rule__LaunchConfig__Group_6_2__1__Impl rule__LaunchConfig__Group_6_2__2 )
            // InternalLcDsl.g:1470:2: rule__LaunchConfig__Group_6_2__1__Impl rule__LaunchConfig__Group_6_2__2
            {
            pushFollow(FOLLOW_11);
            rule__LaunchConfig__Group_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_2__1"


    // $ANTLR start "rule__LaunchConfig__Group_6_2__1__Impl"
    // InternalLcDsl.g:1477:1: rule__LaunchConfig__Group_6_2__1__Impl : ( ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 ) ) ;
    public final void rule__LaunchConfig__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1481:1: ( ( ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 ) ) )
            // InternalLcDsl.g:1482:1: ( ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 ) )
            {
            // InternalLcDsl.g:1482:1: ( ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 ) )
            // InternalLcDsl.g:1483:2: ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getWorkingDirAssignment_6_2_1()); 
            // InternalLcDsl.g:1484:2: ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 )
            // InternalLcDsl.g:1484:3: rule__LaunchConfig__WorkingDirAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__WorkingDirAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getWorkingDirAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_2__1__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_2__2"
    // InternalLcDsl.g:1492:1: rule__LaunchConfig__Group_6_2__2 : rule__LaunchConfig__Group_6_2__2__Impl ;
    public final void rule__LaunchConfig__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1496:1: ( rule__LaunchConfig__Group_6_2__2__Impl )
            // InternalLcDsl.g:1497:2: rule__LaunchConfig__Group_6_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_2__2"


    // $ANTLR start "rule__LaunchConfig__Group_6_2__2__Impl"
    // InternalLcDsl.g:1503:1: rule__LaunchConfig__Group_6_2__2__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1507:1: ( ( ';' ) )
            // InternalLcDsl.g:1508:1: ( ';' )
            {
            // InternalLcDsl.g:1508:1: ( ';' )
            // InternalLcDsl.g:1509:2: ';'
            {
             before(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_2_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_2__2__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_3__0"
    // InternalLcDsl.g:1519:1: rule__LaunchConfig__Group_6_3__0 : rule__LaunchConfig__Group_6_3__0__Impl rule__LaunchConfig__Group_6_3__1 ;
    public final void rule__LaunchConfig__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1523:1: ( rule__LaunchConfig__Group_6_3__0__Impl rule__LaunchConfig__Group_6_3__1 )
            // InternalLcDsl.g:1524:2: rule__LaunchConfig__Group_6_3__0__Impl rule__LaunchConfig__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__LaunchConfig__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_3__0"


    // $ANTLR start "rule__LaunchConfig__Group_6_3__0__Impl"
    // InternalLcDsl.g:1531:1: rule__LaunchConfig__Group_6_3__0__Impl : ( ( rule__LaunchConfig__MemoryAssignment_6_3_0 ) ) ;
    public final void rule__LaunchConfig__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1535:1: ( ( ( rule__LaunchConfig__MemoryAssignment_6_3_0 ) ) )
            // InternalLcDsl.g:1536:1: ( ( rule__LaunchConfig__MemoryAssignment_6_3_0 ) )
            {
            // InternalLcDsl.g:1536:1: ( ( rule__LaunchConfig__MemoryAssignment_6_3_0 ) )
            // InternalLcDsl.g:1537:2: ( rule__LaunchConfig__MemoryAssignment_6_3_0 )
            {
             before(grammarAccess.getLaunchConfigAccess().getMemoryAssignment_6_3_0()); 
            // InternalLcDsl.g:1538:2: ( rule__LaunchConfig__MemoryAssignment_6_3_0 )
            // InternalLcDsl.g:1538:3: rule__LaunchConfig__MemoryAssignment_6_3_0
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__MemoryAssignment_6_3_0();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getMemoryAssignment_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_3__0__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_3__1"
    // InternalLcDsl.g:1546:1: rule__LaunchConfig__Group_6_3__1 : rule__LaunchConfig__Group_6_3__1__Impl ;
    public final void rule__LaunchConfig__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1550:1: ( rule__LaunchConfig__Group_6_3__1__Impl )
            // InternalLcDsl.g:1551:2: rule__LaunchConfig__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_3__1"


    // $ANTLR start "rule__LaunchConfig__Group_6_3__1__Impl"
    // InternalLcDsl.g:1557:1: rule__LaunchConfig__Group_6_3__1__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1561:1: ( ( ';' ) )
            // InternalLcDsl.g:1562:1: ( ';' )
            {
            // InternalLcDsl.g:1562:1: ( ';' )
            // InternalLcDsl.g:1563:2: ';'
            {
             before(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_3_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_3__1__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_4__0"
    // InternalLcDsl.g:1573:1: rule__LaunchConfig__Group_6_4__0 : rule__LaunchConfig__Group_6_4__0__Impl rule__LaunchConfig__Group_6_4__1 ;
    public final void rule__LaunchConfig__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1577:1: ( rule__LaunchConfig__Group_6_4__0__Impl rule__LaunchConfig__Group_6_4__1 )
            // InternalLcDsl.g:1578:2: rule__LaunchConfig__Group_6_4__0__Impl rule__LaunchConfig__Group_6_4__1
            {
            pushFollow(FOLLOW_6);
            rule__LaunchConfig__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_4__0"


    // $ANTLR start "rule__LaunchConfig__Group_6_4__0__Impl"
    // InternalLcDsl.g:1585:1: rule__LaunchConfig__Group_6_4__0__Impl : ( 'project' ) ;
    public final void rule__LaunchConfig__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1589:1: ( ( 'project' ) )
            // InternalLcDsl.g:1590:1: ( 'project' )
            {
            // InternalLcDsl.g:1590:1: ( 'project' )
            // InternalLcDsl.g:1591:2: 'project'
            {
             before(grammarAccess.getLaunchConfigAccess().getProjectKeyword_6_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getProjectKeyword_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_4__0__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_4__1"
    // InternalLcDsl.g:1600:1: rule__LaunchConfig__Group_6_4__1 : rule__LaunchConfig__Group_6_4__1__Impl rule__LaunchConfig__Group_6_4__2 ;
    public final void rule__LaunchConfig__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1604:1: ( rule__LaunchConfig__Group_6_4__1__Impl rule__LaunchConfig__Group_6_4__2 )
            // InternalLcDsl.g:1605:2: rule__LaunchConfig__Group_6_4__1__Impl rule__LaunchConfig__Group_6_4__2
            {
            pushFollow(FOLLOW_11);
            rule__LaunchConfig__Group_6_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_4__1"


    // $ANTLR start "rule__LaunchConfig__Group_6_4__1__Impl"
    // InternalLcDsl.g:1612:1: rule__LaunchConfig__Group_6_4__1__Impl : ( ( rule__LaunchConfig__ProjectAssignment_6_4_1 ) ) ;
    public final void rule__LaunchConfig__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1616:1: ( ( ( rule__LaunchConfig__ProjectAssignment_6_4_1 ) ) )
            // InternalLcDsl.g:1617:1: ( ( rule__LaunchConfig__ProjectAssignment_6_4_1 ) )
            {
            // InternalLcDsl.g:1617:1: ( ( rule__LaunchConfig__ProjectAssignment_6_4_1 ) )
            // InternalLcDsl.g:1618:2: ( rule__LaunchConfig__ProjectAssignment_6_4_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getProjectAssignment_6_4_1()); 
            // InternalLcDsl.g:1619:2: ( rule__LaunchConfig__ProjectAssignment_6_4_1 )
            // InternalLcDsl.g:1619:3: rule__LaunchConfig__ProjectAssignment_6_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__ProjectAssignment_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getProjectAssignment_6_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_4__1__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_4__2"
    // InternalLcDsl.g:1627:1: rule__LaunchConfig__Group_6_4__2 : rule__LaunchConfig__Group_6_4__2__Impl ;
    public final void rule__LaunchConfig__Group_6_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1631:1: ( rule__LaunchConfig__Group_6_4__2__Impl )
            // InternalLcDsl.g:1632:2: rule__LaunchConfig__Group_6_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_4__2"


    // $ANTLR start "rule__LaunchConfig__Group_6_4__2__Impl"
    // InternalLcDsl.g:1638:1: rule__LaunchConfig__Group_6_4__2__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1642:1: ( ( ';' ) )
            // InternalLcDsl.g:1643:1: ( ';' )
            {
            // InternalLcDsl.g:1643:1: ( ';' )
            // InternalLcDsl.g:1644:2: ';'
            {
             before(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_4_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_4__2__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_5__0"
    // InternalLcDsl.g:1654:1: rule__LaunchConfig__Group_6_5__0 : rule__LaunchConfig__Group_6_5__0__Impl rule__LaunchConfig__Group_6_5__1 ;
    public final void rule__LaunchConfig__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1658:1: ( rule__LaunchConfig__Group_6_5__0__Impl rule__LaunchConfig__Group_6_5__1 )
            // InternalLcDsl.g:1659:2: rule__LaunchConfig__Group_6_5__0__Impl rule__LaunchConfig__Group_6_5__1
            {
            pushFollow(FOLLOW_6);
            rule__LaunchConfig__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_5__0"


    // $ANTLR start "rule__LaunchConfig__Group_6_5__0__Impl"
    // InternalLcDsl.g:1666:1: rule__LaunchConfig__Group_6_5__0__Impl : ( 'main-class' ) ;
    public final void rule__LaunchConfig__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1670:1: ( ( 'main-class' ) )
            // InternalLcDsl.g:1671:1: ( 'main-class' )
            {
            // InternalLcDsl.g:1671:1: ( 'main-class' )
            // InternalLcDsl.g:1672:2: 'main-class'
            {
             before(grammarAccess.getLaunchConfigAccess().getMainClassKeyword_6_5_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getMainClassKeyword_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_5__0__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_5__1"
    // InternalLcDsl.g:1681:1: rule__LaunchConfig__Group_6_5__1 : rule__LaunchConfig__Group_6_5__1__Impl rule__LaunchConfig__Group_6_5__2 ;
    public final void rule__LaunchConfig__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1685:1: ( rule__LaunchConfig__Group_6_5__1__Impl rule__LaunchConfig__Group_6_5__2 )
            // InternalLcDsl.g:1686:2: rule__LaunchConfig__Group_6_5__1__Impl rule__LaunchConfig__Group_6_5__2
            {
            pushFollow(FOLLOW_11);
            rule__LaunchConfig__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_5__1"


    // $ANTLR start "rule__LaunchConfig__Group_6_5__1__Impl"
    // InternalLcDsl.g:1693:1: rule__LaunchConfig__Group_6_5__1__Impl : ( ( rule__LaunchConfig__MainClassAssignment_6_5_1 ) ) ;
    public final void rule__LaunchConfig__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1697:1: ( ( ( rule__LaunchConfig__MainClassAssignment_6_5_1 ) ) )
            // InternalLcDsl.g:1698:1: ( ( rule__LaunchConfig__MainClassAssignment_6_5_1 ) )
            {
            // InternalLcDsl.g:1698:1: ( ( rule__LaunchConfig__MainClassAssignment_6_5_1 ) )
            // InternalLcDsl.g:1699:2: ( rule__LaunchConfig__MainClassAssignment_6_5_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getMainClassAssignment_6_5_1()); 
            // InternalLcDsl.g:1700:2: ( rule__LaunchConfig__MainClassAssignment_6_5_1 )
            // InternalLcDsl.g:1700:3: rule__LaunchConfig__MainClassAssignment_6_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__MainClassAssignment_6_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLaunchConfigAccess().getMainClassAssignment_6_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_5__1__Impl"


    // $ANTLR start "rule__LaunchConfig__Group_6_5__2"
    // InternalLcDsl.g:1708:1: rule__LaunchConfig__Group_6_5__2 : rule__LaunchConfig__Group_6_5__2__Impl ;
    public final void rule__LaunchConfig__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1712:1: ( rule__LaunchConfig__Group_6_5__2__Impl )
            // InternalLcDsl.g:1713:2: rule__LaunchConfig__Group_6_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__Group_6_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_5__2"


    // $ANTLR start "rule__LaunchConfig__Group_6_5__2__Impl"
    // InternalLcDsl.g:1719:1: rule__LaunchConfig__Group_6_5__2__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1723:1: ( ( ';' ) )
            // InternalLcDsl.g:1724:1: ( ';' )
            {
            // InternalLcDsl.g:1724:1: ( ';' )
            // InternalLcDsl.g:1725:2: ';'
            {
             before(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_5_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__Group_6_5__2__Impl"


    // $ANTLR start "rule__AddPlugin__Group__0"
    // InternalLcDsl.g:1735:1: rule__AddPlugin__Group__0 : rule__AddPlugin__Group__0__Impl rule__AddPlugin__Group__1 ;
    public final void rule__AddPlugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1739:1: ( rule__AddPlugin__Group__0__Impl rule__AddPlugin__Group__1 )
            // InternalLcDsl.g:1740:2: rule__AddPlugin__Group__0__Impl rule__AddPlugin__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AddPlugin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddPlugin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPlugin__Group__0"


    // $ANTLR start "rule__AddPlugin__Group__0__Impl"
    // InternalLcDsl.g:1747:1: rule__AddPlugin__Group__0__Impl : ( 'plugin' ) ;
    public final void rule__AddPlugin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1751:1: ( ( 'plugin' ) )
            // InternalLcDsl.g:1752:1: ( 'plugin' )
            {
            // InternalLcDsl.g:1752:1: ( 'plugin' )
            // InternalLcDsl.g:1753:2: 'plugin'
            {
             before(grammarAccess.getAddPluginAccess().getPluginKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAddPluginAccess().getPluginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPlugin__Group__0__Impl"


    // $ANTLR start "rule__AddPlugin__Group__1"
    // InternalLcDsl.g:1762:1: rule__AddPlugin__Group__1 : rule__AddPlugin__Group__1__Impl rule__AddPlugin__Group__2 ;
    public final void rule__AddPlugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1766:1: ( rule__AddPlugin__Group__1__Impl rule__AddPlugin__Group__2 )
            // InternalLcDsl.g:1767:2: rule__AddPlugin__Group__1__Impl rule__AddPlugin__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AddPlugin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddPlugin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPlugin__Group__1"


    // $ANTLR start "rule__AddPlugin__Group__1__Impl"
    // InternalLcDsl.g:1774:1: rule__AddPlugin__Group__1__Impl : ( ( rule__AddPlugin__PluginAssignment_1 ) ) ;
    public final void rule__AddPlugin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1778:1: ( ( ( rule__AddPlugin__PluginAssignment_1 ) ) )
            // InternalLcDsl.g:1779:1: ( ( rule__AddPlugin__PluginAssignment_1 ) )
            {
            // InternalLcDsl.g:1779:1: ( ( rule__AddPlugin__PluginAssignment_1 ) )
            // InternalLcDsl.g:1780:2: ( rule__AddPlugin__PluginAssignment_1 )
            {
             before(grammarAccess.getAddPluginAccess().getPluginAssignment_1()); 
            // InternalLcDsl.g:1781:2: ( rule__AddPlugin__PluginAssignment_1 )
            // InternalLcDsl.g:1781:3: rule__AddPlugin__PluginAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddPlugin__PluginAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddPluginAccess().getPluginAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPlugin__Group__1__Impl"


    // $ANTLR start "rule__AddPlugin__Group__2"
    // InternalLcDsl.g:1789:1: rule__AddPlugin__Group__2 : rule__AddPlugin__Group__2__Impl ;
    public final void rule__AddPlugin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1793:1: ( rule__AddPlugin__Group__2__Impl )
            // InternalLcDsl.g:1794:2: rule__AddPlugin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddPlugin__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPlugin__Group__2"


    // $ANTLR start "rule__AddPlugin__Group__2__Impl"
    // InternalLcDsl.g:1800:1: rule__AddPlugin__Group__2__Impl : ( ';' ) ;
    public final void rule__AddPlugin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1804:1: ( ( ';' ) )
            // InternalLcDsl.g:1805:1: ( ';' )
            {
            // InternalLcDsl.g:1805:1: ( ';' )
            // InternalLcDsl.g:1806:2: ';'
            {
             before(grammarAccess.getAddPluginAccess().getSemicolonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAddPluginAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPlugin__Group__2__Impl"


    // $ANTLR start "rule__IgnorePlugin__Group__0"
    // InternalLcDsl.g:1816:1: rule__IgnorePlugin__Group__0 : rule__IgnorePlugin__Group__0__Impl rule__IgnorePlugin__Group__1 ;
    public final void rule__IgnorePlugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1820:1: ( rule__IgnorePlugin__Group__0__Impl rule__IgnorePlugin__Group__1 )
            // InternalLcDsl.g:1821:2: rule__IgnorePlugin__Group__0__Impl rule__IgnorePlugin__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__IgnorePlugin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IgnorePlugin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnorePlugin__Group__0"


    // $ANTLR start "rule__IgnorePlugin__Group__0__Impl"
    // InternalLcDsl.g:1828:1: rule__IgnorePlugin__Group__0__Impl : ( 'ignore' ) ;
    public final void rule__IgnorePlugin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1832:1: ( ( 'ignore' ) )
            // InternalLcDsl.g:1833:1: ( 'ignore' )
            {
            // InternalLcDsl.g:1833:1: ( 'ignore' )
            // InternalLcDsl.g:1834:2: 'ignore'
            {
             before(grammarAccess.getIgnorePluginAccess().getIgnoreKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getIgnorePluginAccess().getIgnoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnorePlugin__Group__0__Impl"


    // $ANTLR start "rule__IgnorePlugin__Group__1"
    // InternalLcDsl.g:1843:1: rule__IgnorePlugin__Group__1 : rule__IgnorePlugin__Group__1__Impl rule__IgnorePlugin__Group__2 ;
    public final void rule__IgnorePlugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1847:1: ( rule__IgnorePlugin__Group__1__Impl rule__IgnorePlugin__Group__2 )
            // InternalLcDsl.g:1848:2: rule__IgnorePlugin__Group__1__Impl rule__IgnorePlugin__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IgnorePlugin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IgnorePlugin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnorePlugin__Group__1"


    // $ANTLR start "rule__IgnorePlugin__Group__1__Impl"
    // InternalLcDsl.g:1855:1: rule__IgnorePlugin__Group__1__Impl : ( ( rule__IgnorePlugin__PluginAssignment_1 ) ) ;
    public final void rule__IgnorePlugin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1859:1: ( ( ( rule__IgnorePlugin__PluginAssignment_1 ) ) )
            // InternalLcDsl.g:1860:1: ( ( rule__IgnorePlugin__PluginAssignment_1 ) )
            {
            // InternalLcDsl.g:1860:1: ( ( rule__IgnorePlugin__PluginAssignment_1 ) )
            // InternalLcDsl.g:1861:2: ( rule__IgnorePlugin__PluginAssignment_1 )
            {
             before(grammarAccess.getIgnorePluginAccess().getPluginAssignment_1()); 
            // InternalLcDsl.g:1862:2: ( rule__IgnorePlugin__PluginAssignment_1 )
            // InternalLcDsl.g:1862:3: rule__IgnorePlugin__PluginAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IgnorePlugin__PluginAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIgnorePluginAccess().getPluginAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnorePlugin__Group__1__Impl"


    // $ANTLR start "rule__IgnorePlugin__Group__2"
    // InternalLcDsl.g:1870:1: rule__IgnorePlugin__Group__2 : rule__IgnorePlugin__Group__2__Impl ;
    public final void rule__IgnorePlugin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1874:1: ( rule__IgnorePlugin__Group__2__Impl )
            // InternalLcDsl.g:1875:2: rule__IgnorePlugin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IgnorePlugin__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnorePlugin__Group__2"


    // $ANTLR start "rule__IgnorePlugin__Group__2__Impl"
    // InternalLcDsl.g:1881:1: rule__IgnorePlugin__Group__2__Impl : ( ';' ) ;
    public final void rule__IgnorePlugin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1885:1: ( ( ';' ) )
            // InternalLcDsl.g:1886:1: ( ';' )
            {
            // InternalLcDsl.g:1886:1: ( ';' )
            // InternalLcDsl.g:1887:2: ';'
            {
             before(grammarAccess.getIgnorePluginAccess().getSemicolonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIgnorePluginAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnorePlugin__Group__2__Impl"


    // $ANTLR start "rule__VmArgument__Group__0"
    // InternalLcDsl.g:1897:1: rule__VmArgument__Group__0 : rule__VmArgument__Group__0__Impl rule__VmArgument__Group__1 ;
    public final void rule__VmArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1901:1: ( rule__VmArgument__Group__0__Impl rule__VmArgument__Group__1 )
            // InternalLcDsl.g:1902:2: rule__VmArgument__Group__0__Impl rule__VmArgument__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__VmArgument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VmArgument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VmArgument__Group__0"


    // $ANTLR start "rule__VmArgument__Group__0__Impl"
    // InternalLcDsl.g:1909:1: rule__VmArgument__Group__0__Impl : ( () ) ;
    public final void rule__VmArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1913:1: ( ( () ) )
            // InternalLcDsl.g:1914:1: ( () )
            {
            // InternalLcDsl.g:1914:1: ( () )
            // InternalLcDsl.g:1915:2: ()
            {
             before(grammarAccess.getVmArgumentAccess().getVmArgumentAction_0()); 
            // InternalLcDsl.g:1916:2: ()
            // InternalLcDsl.g:1916:3: 
            {
            }

             after(grammarAccess.getVmArgumentAccess().getVmArgumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VmArgument__Group__0__Impl"


    // $ANTLR start "rule__VmArgument__Group__1"
    // InternalLcDsl.g:1924:1: rule__VmArgument__Group__1 : rule__VmArgument__Group__1__Impl rule__VmArgument__Group__2 ;
    public final void rule__VmArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1928:1: ( rule__VmArgument__Group__1__Impl rule__VmArgument__Group__2 )
            // InternalLcDsl.g:1929:2: rule__VmArgument__Group__1__Impl rule__VmArgument__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__VmArgument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VmArgument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VmArgument__Group__1"


    // $ANTLR start "rule__VmArgument__Group__1__Impl"
    // InternalLcDsl.g:1936:1: rule__VmArgument__Group__1__Impl : ( 'vm-arg' ) ;
    public final void rule__VmArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1940:1: ( ( 'vm-arg' ) )
            // InternalLcDsl.g:1941:1: ( 'vm-arg' )
            {
            // InternalLcDsl.g:1941:1: ( 'vm-arg' )
            // InternalLcDsl.g:1942:2: 'vm-arg'
            {
             before(grammarAccess.getVmArgumentAccess().getVmArgKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVmArgumentAccess().getVmArgKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VmArgument__Group__1__Impl"


    // $ANTLR start "rule__VmArgument__Group__2"
    // InternalLcDsl.g:1951:1: rule__VmArgument__Group__2 : rule__VmArgument__Group__2__Impl rule__VmArgument__Group__3 ;
    public final void rule__VmArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1955:1: ( rule__VmArgument__Group__2__Impl rule__VmArgument__Group__3 )
            // InternalLcDsl.g:1956:2: rule__VmArgument__Group__2__Impl rule__VmArgument__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__VmArgument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VmArgument__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VmArgument__Group__2"


    // $ANTLR start "rule__VmArgument__Group__2__Impl"
    // InternalLcDsl.g:1963:1: rule__VmArgument__Group__2__Impl : ( ( rule__VmArgument__ArgumentsAssignment_2 )* ) ;
    public final void rule__VmArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1967:1: ( ( ( rule__VmArgument__ArgumentsAssignment_2 )* ) )
            // InternalLcDsl.g:1968:1: ( ( rule__VmArgument__ArgumentsAssignment_2 )* )
            {
            // InternalLcDsl.g:1968:1: ( ( rule__VmArgument__ArgumentsAssignment_2 )* )
            // InternalLcDsl.g:1969:2: ( rule__VmArgument__ArgumentsAssignment_2 )*
            {
             before(grammarAccess.getVmArgumentAccess().getArgumentsAssignment_2()); 
            // InternalLcDsl.g:1970:2: ( rule__VmArgument__ArgumentsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLcDsl.g:1970:3: rule__VmArgument__ArgumentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VmArgument__ArgumentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getVmArgumentAccess().getArgumentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VmArgument__Group__2__Impl"


    // $ANTLR start "rule__VmArgument__Group__3"
    // InternalLcDsl.g:1978:1: rule__VmArgument__Group__3 : rule__VmArgument__Group__3__Impl ;
    public final void rule__VmArgument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1982:1: ( rule__VmArgument__Group__3__Impl )
            // InternalLcDsl.g:1983:2: rule__VmArgument__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VmArgument__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VmArgument__Group__3"


    // $ANTLR start "rule__VmArgument__Group__3__Impl"
    // InternalLcDsl.g:1989:1: rule__VmArgument__Group__3__Impl : ( ';' ) ;
    public final void rule__VmArgument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1993:1: ( ( ';' ) )
            // InternalLcDsl.g:1994:1: ( ';' )
            {
            // InternalLcDsl.g:1994:1: ( ';' )
            // InternalLcDsl.g:1995:2: ';'
            {
             before(grammarAccess.getVmArgumentAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVmArgumentAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VmArgument__Group__3__Impl"


    // $ANTLR start "rule__ProgramArgument__Group__0"
    // InternalLcDsl.g:2005:1: rule__ProgramArgument__Group__0 : rule__ProgramArgument__Group__0__Impl rule__ProgramArgument__Group__1 ;
    public final void rule__ProgramArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2009:1: ( rule__ProgramArgument__Group__0__Impl rule__ProgramArgument__Group__1 )
            // InternalLcDsl.g:2010:2: rule__ProgramArgument__Group__0__Impl rule__ProgramArgument__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ProgramArgument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramArgument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramArgument__Group__0"


    // $ANTLR start "rule__ProgramArgument__Group__0__Impl"
    // InternalLcDsl.g:2017:1: rule__ProgramArgument__Group__0__Impl : ( () ) ;
    public final void rule__ProgramArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2021:1: ( ( () ) )
            // InternalLcDsl.g:2022:1: ( () )
            {
            // InternalLcDsl.g:2022:1: ( () )
            // InternalLcDsl.g:2023:2: ()
            {
             before(grammarAccess.getProgramArgumentAccess().getProgramArgumentAction_0()); 
            // InternalLcDsl.g:2024:2: ()
            // InternalLcDsl.g:2024:3: 
            {
            }

             after(grammarAccess.getProgramArgumentAccess().getProgramArgumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramArgument__Group__0__Impl"


    // $ANTLR start "rule__ProgramArgument__Group__1"
    // InternalLcDsl.g:2032:1: rule__ProgramArgument__Group__1 : rule__ProgramArgument__Group__1__Impl rule__ProgramArgument__Group__2 ;
    public final void rule__ProgramArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2036:1: ( rule__ProgramArgument__Group__1__Impl rule__ProgramArgument__Group__2 )
            // InternalLcDsl.g:2037:2: rule__ProgramArgument__Group__1__Impl rule__ProgramArgument__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ProgramArgument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramArgument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramArgument__Group__1"


    // $ANTLR start "rule__ProgramArgument__Group__1__Impl"
    // InternalLcDsl.g:2044:1: rule__ProgramArgument__Group__1__Impl : ( 'argument' ) ;
    public final void rule__ProgramArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2048:1: ( ( 'argument' ) )
            // InternalLcDsl.g:2049:1: ( 'argument' )
            {
            // InternalLcDsl.g:2049:1: ( 'argument' )
            // InternalLcDsl.g:2050:2: 'argument'
            {
             before(grammarAccess.getProgramArgumentAccess().getArgumentKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getProgramArgumentAccess().getArgumentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramArgument__Group__1__Impl"


    // $ANTLR start "rule__ProgramArgument__Group__2"
    // InternalLcDsl.g:2059:1: rule__ProgramArgument__Group__2 : rule__ProgramArgument__Group__2__Impl rule__ProgramArgument__Group__3 ;
    public final void rule__ProgramArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2063:1: ( rule__ProgramArgument__Group__2__Impl rule__ProgramArgument__Group__3 )
            // InternalLcDsl.g:2064:2: rule__ProgramArgument__Group__2__Impl rule__ProgramArgument__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ProgramArgument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProgramArgument__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramArgument__Group__2"


    // $ANTLR start "rule__ProgramArgument__Group__2__Impl"
    // InternalLcDsl.g:2071:1: rule__ProgramArgument__Group__2__Impl : ( ( rule__ProgramArgument__ArgumentsAssignment_2 )* ) ;
    public final void rule__ProgramArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2075:1: ( ( ( rule__ProgramArgument__ArgumentsAssignment_2 )* ) )
            // InternalLcDsl.g:2076:1: ( ( rule__ProgramArgument__ArgumentsAssignment_2 )* )
            {
            // InternalLcDsl.g:2076:1: ( ( rule__ProgramArgument__ArgumentsAssignment_2 )* )
            // InternalLcDsl.g:2077:2: ( rule__ProgramArgument__ArgumentsAssignment_2 )*
            {
             before(grammarAccess.getProgramArgumentAccess().getArgumentsAssignment_2()); 
            // InternalLcDsl.g:2078:2: ( rule__ProgramArgument__ArgumentsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLcDsl.g:2078:3: rule__ProgramArgument__ArgumentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ProgramArgument__ArgumentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProgramArgumentAccess().getArgumentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramArgument__Group__2__Impl"


    // $ANTLR start "rule__ProgramArgument__Group__3"
    // InternalLcDsl.g:2086:1: rule__ProgramArgument__Group__3 : rule__ProgramArgument__Group__3__Impl ;
    public final void rule__ProgramArgument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2090:1: ( rule__ProgramArgument__Group__3__Impl )
            // InternalLcDsl.g:2091:2: rule__ProgramArgument__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProgramArgument__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramArgument__Group__3"


    // $ANTLR start "rule__ProgramArgument__Group__3__Impl"
    // InternalLcDsl.g:2097:1: rule__ProgramArgument__Group__3__Impl : ( ';' ) ;
    public final void rule__ProgramArgument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2101:1: ( ( ';' ) )
            // InternalLcDsl.g:2102:1: ( ';' )
            {
            // InternalLcDsl.g:2102:1: ( ';' )
            // InternalLcDsl.g:2103:2: ';'
            {
             before(grammarAccess.getProgramArgumentAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProgramArgumentAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramArgument__Group__3__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__0"
    // InternalLcDsl.g:2113:1: rule__EnvironmentVariable__Group__0 : rule__EnvironmentVariable__Group__0__Impl rule__EnvironmentVariable__Group__1 ;
    public final void rule__EnvironmentVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2117:1: ( rule__EnvironmentVariable__Group__0__Impl rule__EnvironmentVariable__Group__1 )
            // InternalLcDsl.g:2118:2: rule__EnvironmentVariable__Group__0__Impl rule__EnvironmentVariable__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EnvironmentVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__0"


    // $ANTLR start "rule__EnvironmentVariable__Group__0__Impl"
    // InternalLcDsl.g:2125:1: rule__EnvironmentVariable__Group__0__Impl : ( () ) ;
    public final void rule__EnvironmentVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2129:1: ( ( () ) )
            // InternalLcDsl.g:2130:1: ( () )
            {
            // InternalLcDsl.g:2130:1: ( () )
            // InternalLcDsl.g:2131:2: ()
            {
             before(grammarAccess.getEnvironmentVariableAccess().getEnvironmentVariableAction_0()); 
            // InternalLcDsl.g:2132:2: ()
            // InternalLcDsl.g:2132:3: 
            {
            }

             after(grammarAccess.getEnvironmentVariableAccess().getEnvironmentVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__0__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__1"
    // InternalLcDsl.g:2140:1: rule__EnvironmentVariable__Group__1 : rule__EnvironmentVariable__Group__1__Impl rule__EnvironmentVariable__Group__2 ;
    public final void rule__EnvironmentVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2144:1: ( rule__EnvironmentVariable__Group__1__Impl rule__EnvironmentVariable__Group__2 )
            // InternalLcDsl.g:2145:2: rule__EnvironmentVariable__Group__1__Impl rule__EnvironmentVariable__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EnvironmentVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__1"


    // $ANTLR start "rule__EnvironmentVariable__Group__1__Impl"
    // InternalLcDsl.g:2152:1: rule__EnvironmentVariable__Group__1__Impl : ( 'environment' ) ;
    public final void rule__EnvironmentVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2156:1: ( ( 'environment' ) )
            // InternalLcDsl.g:2157:1: ( 'environment' )
            {
            // InternalLcDsl.g:2157:1: ( 'environment' )
            // InternalLcDsl.g:2158:2: 'environment'
            {
             before(grammarAccess.getEnvironmentVariableAccess().getEnvironmentKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEnvironmentVariableAccess().getEnvironmentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__1__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__2"
    // InternalLcDsl.g:2167:1: rule__EnvironmentVariable__Group__2 : rule__EnvironmentVariable__Group__2__Impl rule__EnvironmentVariable__Group__3 ;
    public final void rule__EnvironmentVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2171:1: ( rule__EnvironmentVariable__Group__2__Impl rule__EnvironmentVariable__Group__3 )
            // InternalLcDsl.g:2172:2: rule__EnvironmentVariable__Group__2__Impl rule__EnvironmentVariable__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__EnvironmentVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__2"


    // $ANTLR start "rule__EnvironmentVariable__Group__2__Impl"
    // InternalLcDsl.g:2179:1: rule__EnvironmentVariable__Group__2__Impl : ( ( rule__EnvironmentVariable__NameAssignment_2 ) ) ;
    public final void rule__EnvironmentVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2183:1: ( ( ( rule__EnvironmentVariable__NameAssignment_2 ) ) )
            // InternalLcDsl.g:2184:1: ( ( rule__EnvironmentVariable__NameAssignment_2 ) )
            {
            // InternalLcDsl.g:2184:1: ( ( rule__EnvironmentVariable__NameAssignment_2 ) )
            // InternalLcDsl.g:2185:2: ( rule__EnvironmentVariable__NameAssignment_2 )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getNameAssignment_2()); 
            // InternalLcDsl.g:2186:2: ( rule__EnvironmentVariable__NameAssignment_2 )
            // InternalLcDsl.g:2186:3: rule__EnvironmentVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__2__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__3"
    // InternalLcDsl.g:2194:1: rule__EnvironmentVariable__Group__3 : rule__EnvironmentVariable__Group__3__Impl rule__EnvironmentVariable__Group__4 ;
    public final void rule__EnvironmentVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2198:1: ( rule__EnvironmentVariable__Group__3__Impl rule__EnvironmentVariable__Group__4 )
            // InternalLcDsl.g:2199:2: rule__EnvironmentVariable__Group__3__Impl rule__EnvironmentVariable__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EnvironmentVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__3"


    // $ANTLR start "rule__EnvironmentVariable__Group__3__Impl"
    // InternalLcDsl.g:2206:1: rule__EnvironmentVariable__Group__3__Impl : ( RULE_EQ ) ;
    public final void rule__EnvironmentVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2210:1: ( ( RULE_EQ ) )
            // InternalLcDsl.g:2211:1: ( RULE_EQ )
            {
            // InternalLcDsl.g:2211:1: ( RULE_EQ )
            // InternalLcDsl.g:2212:2: RULE_EQ
            {
             before(grammarAccess.getEnvironmentVariableAccess().getEQTerminalRuleCall_3()); 
            match(input,RULE_EQ,FOLLOW_2); 
             after(grammarAccess.getEnvironmentVariableAccess().getEQTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__3__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__4"
    // InternalLcDsl.g:2221:1: rule__EnvironmentVariable__Group__4 : rule__EnvironmentVariable__Group__4__Impl rule__EnvironmentVariable__Group__5 ;
    public final void rule__EnvironmentVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2225:1: ( rule__EnvironmentVariable__Group__4__Impl rule__EnvironmentVariable__Group__5 )
            // InternalLcDsl.g:2226:2: rule__EnvironmentVariable__Group__4__Impl rule__EnvironmentVariable__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__EnvironmentVariable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentVariable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__4"


    // $ANTLR start "rule__EnvironmentVariable__Group__4__Impl"
    // InternalLcDsl.g:2233:1: rule__EnvironmentVariable__Group__4__Impl : ( ( rule__EnvironmentVariable__ValueAssignment_4 ) ) ;
    public final void rule__EnvironmentVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2237:1: ( ( ( rule__EnvironmentVariable__ValueAssignment_4 ) ) )
            // InternalLcDsl.g:2238:1: ( ( rule__EnvironmentVariable__ValueAssignment_4 ) )
            {
            // InternalLcDsl.g:2238:1: ( ( rule__EnvironmentVariable__ValueAssignment_4 ) )
            // InternalLcDsl.g:2239:2: ( rule__EnvironmentVariable__ValueAssignment_4 )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getValueAssignment_4()); 
            // InternalLcDsl.g:2240:2: ( rule__EnvironmentVariable__ValueAssignment_4 )
            // InternalLcDsl.g:2240:3: rule__EnvironmentVariable__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentVariable__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentVariableAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__4__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__5"
    // InternalLcDsl.g:2248:1: rule__EnvironmentVariable__Group__5 : rule__EnvironmentVariable__Group__5__Impl ;
    public final void rule__EnvironmentVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2252:1: ( rule__EnvironmentVariable__Group__5__Impl )
            // InternalLcDsl.g:2253:2: rule__EnvironmentVariable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentVariable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__5"


    // $ANTLR start "rule__EnvironmentVariable__Group__5__Impl"
    // InternalLcDsl.g:2259:1: rule__EnvironmentVariable__Group__5__Impl : ( ';' ) ;
    public final void rule__EnvironmentVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2263:1: ( ( ';' ) )
            // InternalLcDsl.g:2264:1: ( ';' )
            {
            // InternalLcDsl.g:2264:1: ( ';' )
            // InternalLcDsl.g:2265:2: ';'
            {
             before(grammarAccess.getEnvironmentVariableAccess().getSemicolonKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEnvironmentVariableAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__Group__5__Impl"


    // $ANTLR start "rule__ApplicationExtPoint__Group__0"
    // InternalLcDsl.g:2275:1: rule__ApplicationExtPoint__Group__0 : rule__ApplicationExtPoint__Group__0__Impl rule__ApplicationExtPoint__Group__1 ;
    public final void rule__ApplicationExtPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2279:1: ( rule__ApplicationExtPoint__Group__0__Impl rule__ApplicationExtPoint__Group__1 )
            // InternalLcDsl.g:2280:2: rule__ApplicationExtPoint__Group__0__Impl rule__ApplicationExtPoint__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ApplicationExtPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationExtPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationExtPoint__Group__0"


    // $ANTLR start "rule__ApplicationExtPoint__Group__0__Impl"
    // InternalLcDsl.g:2287:1: rule__ApplicationExtPoint__Group__0__Impl : ( 'application' ) ;
    public final void rule__ApplicationExtPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2291:1: ( ( 'application' ) )
            // InternalLcDsl.g:2292:1: ( 'application' )
            {
            // InternalLcDsl.g:2292:1: ( 'application' )
            // InternalLcDsl.g:2293:2: 'application'
            {
             before(grammarAccess.getApplicationExtPointAccess().getApplicationKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getApplicationExtPointAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationExtPoint__Group__0__Impl"


    // $ANTLR start "rule__ApplicationExtPoint__Group__1"
    // InternalLcDsl.g:2302:1: rule__ApplicationExtPoint__Group__1 : rule__ApplicationExtPoint__Group__1__Impl rule__ApplicationExtPoint__Group__2 ;
    public final void rule__ApplicationExtPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2306:1: ( rule__ApplicationExtPoint__Group__1__Impl rule__ApplicationExtPoint__Group__2 )
            // InternalLcDsl.g:2307:2: rule__ApplicationExtPoint__Group__1__Impl rule__ApplicationExtPoint__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ApplicationExtPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationExtPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationExtPoint__Group__1"


    // $ANTLR start "rule__ApplicationExtPoint__Group__1__Impl"
    // InternalLcDsl.g:2314:1: rule__ApplicationExtPoint__Group__1__Impl : ( ( rule__ApplicationExtPoint__NameAssignment_1 ) ) ;
    public final void rule__ApplicationExtPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2318:1: ( ( ( rule__ApplicationExtPoint__NameAssignment_1 ) ) )
            // InternalLcDsl.g:2319:1: ( ( rule__ApplicationExtPoint__NameAssignment_1 ) )
            {
            // InternalLcDsl.g:2319:1: ( ( rule__ApplicationExtPoint__NameAssignment_1 ) )
            // InternalLcDsl.g:2320:2: ( rule__ApplicationExtPoint__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationExtPointAccess().getNameAssignment_1()); 
            // InternalLcDsl.g:2321:2: ( rule__ApplicationExtPoint__NameAssignment_1 )
            // InternalLcDsl.g:2321:3: rule__ApplicationExtPoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationExtPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationExtPointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationExtPoint__Group__1__Impl"


    // $ANTLR start "rule__ApplicationExtPoint__Group__2"
    // InternalLcDsl.g:2329:1: rule__ApplicationExtPoint__Group__2 : rule__ApplicationExtPoint__Group__2__Impl ;
    public final void rule__ApplicationExtPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2333:1: ( rule__ApplicationExtPoint__Group__2__Impl )
            // InternalLcDsl.g:2334:2: rule__ApplicationExtPoint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationExtPoint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationExtPoint__Group__2"


    // $ANTLR start "rule__ApplicationExtPoint__Group__2__Impl"
    // InternalLcDsl.g:2340:1: rule__ApplicationExtPoint__Group__2__Impl : ( ';' ) ;
    public final void rule__ApplicationExtPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2344:1: ( ( ';' ) )
            // InternalLcDsl.g:2345:1: ( ';' )
            {
            // InternalLcDsl.g:2345:1: ( ';' )
            // InternalLcDsl.g:2346:2: ';'
            {
             before(grammarAccess.getApplicationExtPointAccess().getSemicolonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getApplicationExtPointAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationExtPoint__Group__2__Impl"


    // $ANTLR start "rule__ProductExtPoint__Group__0"
    // InternalLcDsl.g:2356:1: rule__ProductExtPoint__Group__0 : rule__ProductExtPoint__Group__0__Impl rule__ProductExtPoint__Group__1 ;
    public final void rule__ProductExtPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2360:1: ( rule__ProductExtPoint__Group__0__Impl rule__ProductExtPoint__Group__1 )
            // InternalLcDsl.g:2361:2: rule__ProductExtPoint__Group__0__Impl rule__ProductExtPoint__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ProductExtPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductExtPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductExtPoint__Group__0"


    // $ANTLR start "rule__ProductExtPoint__Group__0__Impl"
    // InternalLcDsl.g:2368:1: rule__ProductExtPoint__Group__0__Impl : ( 'product' ) ;
    public final void rule__ProductExtPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2372:1: ( ( 'product' ) )
            // InternalLcDsl.g:2373:1: ( 'product' )
            {
            // InternalLcDsl.g:2373:1: ( 'product' )
            // InternalLcDsl.g:2374:2: 'product'
            {
             before(grammarAccess.getProductExtPointAccess().getProductKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getProductExtPointAccess().getProductKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductExtPoint__Group__0__Impl"


    // $ANTLR start "rule__ProductExtPoint__Group__1"
    // InternalLcDsl.g:2383:1: rule__ProductExtPoint__Group__1 : rule__ProductExtPoint__Group__1__Impl rule__ProductExtPoint__Group__2 ;
    public final void rule__ProductExtPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2387:1: ( rule__ProductExtPoint__Group__1__Impl rule__ProductExtPoint__Group__2 )
            // InternalLcDsl.g:2388:2: rule__ProductExtPoint__Group__1__Impl rule__ProductExtPoint__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ProductExtPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductExtPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductExtPoint__Group__1"


    // $ANTLR start "rule__ProductExtPoint__Group__1__Impl"
    // InternalLcDsl.g:2395:1: rule__ProductExtPoint__Group__1__Impl : ( ( rule__ProductExtPoint__NameAssignment_1 ) ) ;
    public final void rule__ProductExtPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2399:1: ( ( ( rule__ProductExtPoint__NameAssignment_1 ) ) )
            // InternalLcDsl.g:2400:1: ( ( rule__ProductExtPoint__NameAssignment_1 ) )
            {
            // InternalLcDsl.g:2400:1: ( ( rule__ProductExtPoint__NameAssignment_1 ) )
            // InternalLcDsl.g:2401:2: ( rule__ProductExtPoint__NameAssignment_1 )
            {
             before(grammarAccess.getProductExtPointAccess().getNameAssignment_1()); 
            // InternalLcDsl.g:2402:2: ( rule__ProductExtPoint__NameAssignment_1 )
            // InternalLcDsl.g:2402:3: rule__ProductExtPoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProductExtPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProductExtPointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductExtPoint__Group__1__Impl"


    // $ANTLR start "rule__ProductExtPoint__Group__2"
    // InternalLcDsl.g:2410:1: rule__ProductExtPoint__Group__2 : rule__ProductExtPoint__Group__2__Impl ;
    public final void rule__ProductExtPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2414:1: ( rule__ProductExtPoint__Group__2__Impl )
            // InternalLcDsl.g:2415:2: rule__ProductExtPoint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductExtPoint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductExtPoint__Group__2"


    // $ANTLR start "rule__ProductExtPoint__Group__2__Impl"
    // InternalLcDsl.g:2421:1: rule__ProductExtPoint__Group__2__Impl : ( ';' ) ;
    public final void rule__ProductExtPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2425:1: ( ( ';' ) )
            // InternalLcDsl.g:2426:1: ( ';' )
            {
            // InternalLcDsl.g:2426:1: ( ';' )
            // InternalLcDsl.g:2427:2: ';'
            {
             before(grammarAccess.getProductExtPointAccess().getSemicolonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProductExtPointAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductExtPoint__Group__2__Impl"


    // $ANTLR start "rule__Favorites__Group__0"
    // InternalLcDsl.g:2437:1: rule__Favorites__Group__0 : rule__Favorites__Group__0__Impl rule__Favorites__Group__1 ;
    public final void rule__Favorites__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2441:1: ( rule__Favorites__Group__0__Impl rule__Favorites__Group__1 )
            // InternalLcDsl.g:2442:2: rule__Favorites__Group__0__Impl rule__Favorites__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Favorites__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Favorites__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__Group__0"


    // $ANTLR start "rule__Favorites__Group__0__Impl"
    // InternalLcDsl.g:2449:1: rule__Favorites__Group__0__Impl : ( () ) ;
    public final void rule__Favorites__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2453:1: ( ( () ) )
            // InternalLcDsl.g:2454:1: ( () )
            {
            // InternalLcDsl.g:2454:1: ( () )
            // InternalLcDsl.g:2455:2: ()
            {
             before(grammarAccess.getFavoritesAccess().getFavoritesAction_0()); 
            // InternalLcDsl.g:2456:2: ()
            // InternalLcDsl.g:2456:3: 
            {
            }

             after(grammarAccess.getFavoritesAccess().getFavoritesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__Group__0__Impl"


    // $ANTLR start "rule__Favorites__Group__1"
    // InternalLcDsl.g:2464:1: rule__Favorites__Group__1 : rule__Favorites__Group__1__Impl rule__Favorites__Group__2 ;
    public final void rule__Favorites__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2468:1: ( rule__Favorites__Group__1__Impl rule__Favorites__Group__2 )
            // InternalLcDsl.g:2469:2: rule__Favorites__Group__1__Impl rule__Favorites__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Favorites__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Favorites__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__Group__1"


    // $ANTLR start "rule__Favorites__Group__1__Impl"
    // InternalLcDsl.g:2476:1: rule__Favorites__Group__1__Impl : ( 'favorite' ) ;
    public final void rule__Favorites__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2480:1: ( ( 'favorite' ) )
            // InternalLcDsl.g:2481:1: ( 'favorite' )
            {
            // InternalLcDsl.g:2481:1: ( 'favorite' )
            // InternalLcDsl.g:2482:2: 'favorite'
            {
             before(grammarAccess.getFavoritesAccess().getFavoriteKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFavoritesAccess().getFavoriteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__Group__1__Impl"


    // $ANTLR start "rule__Favorites__Group__2"
    // InternalLcDsl.g:2491:1: rule__Favorites__Group__2 : rule__Favorites__Group__2__Impl rule__Favorites__Group__3 ;
    public final void rule__Favorites__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2495:1: ( rule__Favorites__Group__2__Impl rule__Favorites__Group__3 )
            // InternalLcDsl.g:2496:2: rule__Favorites__Group__2__Impl rule__Favorites__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Favorites__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Favorites__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__Group__2"


    // $ANTLR start "rule__Favorites__Group__2__Impl"
    // InternalLcDsl.g:2503:1: rule__Favorites__Group__2__Impl : ( ( rule__Favorites__UnorderedGroup_2 ) ) ;
    public final void rule__Favorites__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2507:1: ( ( ( rule__Favorites__UnorderedGroup_2 ) ) )
            // InternalLcDsl.g:2508:1: ( ( rule__Favorites__UnorderedGroup_2 ) )
            {
            // InternalLcDsl.g:2508:1: ( ( rule__Favorites__UnorderedGroup_2 ) )
            // InternalLcDsl.g:2509:2: ( rule__Favorites__UnorderedGroup_2 )
            {
             before(grammarAccess.getFavoritesAccess().getUnorderedGroup_2()); 
            // InternalLcDsl.g:2510:2: ( rule__Favorites__UnorderedGroup_2 )
            // InternalLcDsl.g:2510:3: rule__Favorites__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Favorites__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getFavoritesAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__Group__2__Impl"


    // $ANTLR start "rule__Favorites__Group__3"
    // InternalLcDsl.g:2518:1: rule__Favorites__Group__3 : rule__Favorites__Group__3__Impl ;
    public final void rule__Favorites__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2522:1: ( rule__Favorites__Group__3__Impl )
            // InternalLcDsl.g:2523:2: rule__Favorites__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Favorites__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__Group__3"


    // $ANTLR start "rule__Favorites__Group__3__Impl"
    // InternalLcDsl.g:2529:1: rule__Favorites__Group__3__Impl : ( ';' ) ;
    public final void rule__Favorites__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2533:1: ( ( ';' ) )
            // InternalLcDsl.g:2534:1: ( ';' )
            {
            // InternalLcDsl.g:2534:1: ( ';' )
            // InternalLcDsl.g:2535:2: ';'
            {
             before(grammarAccess.getFavoritesAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFavoritesAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__Group__3__Impl"


    // $ANTLR start "rule__Redirect__Group__0"
    // InternalLcDsl.g:2545:1: rule__Redirect__Group__0 : rule__Redirect__Group__0__Impl rule__Redirect__Group__1 ;
    public final void rule__Redirect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2549:1: ( rule__Redirect__Group__0__Impl rule__Redirect__Group__1 )
            // InternalLcDsl.g:2550:2: rule__Redirect__Group__0__Impl rule__Redirect__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Redirect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Redirect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group__0"


    // $ANTLR start "rule__Redirect__Group__0__Impl"
    // InternalLcDsl.g:2557:1: rule__Redirect__Group__0__Impl : ( () ) ;
    public final void rule__Redirect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2561:1: ( ( () ) )
            // InternalLcDsl.g:2562:1: ( () )
            {
            // InternalLcDsl.g:2562:1: ( () )
            // InternalLcDsl.g:2563:2: ()
            {
             before(grammarAccess.getRedirectAccess().getRedirectAction_0()); 
            // InternalLcDsl.g:2564:2: ()
            // InternalLcDsl.g:2564:3: 
            {
            }

             after(grammarAccess.getRedirectAccess().getRedirectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group__0__Impl"


    // $ANTLR start "rule__Redirect__Group__1"
    // InternalLcDsl.g:2572:1: rule__Redirect__Group__1 : rule__Redirect__Group__1__Impl rule__Redirect__Group__2 ;
    public final void rule__Redirect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2576:1: ( rule__Redirect__Group__1__Impl rule__Redirect__Group__2 )
            // InternalLcDsl.g:2577:2: rule__Redirect__Group__1__Impl rule__Redirect__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Redirect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Redirect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group__1"


    // $ANTLR start "rule__Redirect__Group__1__Impl"
    // InternalLcDsl.g:2584:1: rule__Redirect__Group__1__Impl : ( 'redirect' ) ;
    public final void rule__Redirect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2588:1: ( ( 'redirect' ) )
            // InternalLcDsl.g:2589:1: ( 'redirect' )
            {
            // InternalLcDsl.g:2589:1: ( 'redirect' )
            // InternalLcDsl.g:2590:2: 'redirect'
            {
             before(grammarAccess.getRedirectAccess().getRedirectKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRedirectAccess().getRedirectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group__1__Impl"


    // $ANTLR start "rule__Redirect__Group__2"
    // InternalLcDsl.g:2599:1: rule__Redirect__Group__2 : rule__Redirect__Group__2__Impl rule__Redirect__Group__3 ;
    public final void rule__Redirect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2603:1: ( rule__Redirect__Group__2__Impl rule__Redirect__Group__3 )
            // InternalLcDsl.g:2604:2: rule__Redirect__Group__2__Impl rule__Redirect__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Redirect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Redirect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group__2"


    // $ANTLR start "rule__Redirect__Group__2__Impl"
    // InternalLcDsl.g:2611:1: rule__Redirect__Group__2__Impl : ( ( rule__Redirect__UnorderedGroup_2 ) ) ;
    public final void rule__Redirect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2615:1: ( ( ( rule__Redirect__UnorderedGroup_2 ) ) )
            // InternalLcDsl.g:2616:1: ( ( rule__Redirect__UnorderedGroup_2 ) )
            {
            // InternalLcDsl.g:2616:1: ( ( rule__Redirect__UnorderedGroup_2 ) )
            // InternalLcDsl.g:2617:2: ( rule__Redirect__UnorderedGroup_2 )
            {
             before(grammarAccess.getRedirectAccess().getUnorderedGroup_2()); 
            // InternalLcDsl.g:2618:2: ( rule__Redirect__UnorderedGroup_2 )
            // InternalLcDsl.g:2618:3: rule__Redirect__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getRedirectAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group__2__Impl"


    // $ANTLR start "rule__Redirect__Group__3"
    // InternalLcDsl.g:2626:1: rule__Redirect__Group__3 : rule__Redirect__Group__3__Impl ;
    public final void rule__Redirect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2630:1: ( rule__Redirect__Group__3__Impl )
            // InternalLcDsl.g:2631:2: rule__Redirect__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group__3"


    // $ANTLR start "rule__Redirect__Group__3__Impl"
    // InternalLcDsl.g:2637:1: rule__Redirect__Group__3__Impl : ( ';' ) ;
    public final void rule__Redirect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2641:1: ( ( ';' ) )
            // InternalLcDsl.g:2642:1: ( ';' )
            {
            // InternalLcDsl.g:2642:1: ( ';' )
            // InternalLcDsl.g:2643:2: ';'
            {
             before(grammarAccess.getRedirectAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRedirectAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group__3__Impl"


    // $ANTLR start "rule__Redirect__Group_2_0__0"
    // InternalLcDsl.g:2653:1: rule__Redirect__Group_2_0__0 : rule__Redirect__Group_2_0__0__Impl rule__Redirect__Group_2_0__1 ;
    public final void rule__Redirect__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2657:1: ( rule__Redirect__Group_2_0__0__Impl rule__Redirect__Group_2_0__1 )
            // InternalLcDsl.g:2658:2: rule__Redirect__Group_2_0__0__Impl rule__Redirect__Group_2_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Redirect__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Redirect__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_0__0"


    // $ANTLR start "rule__Redirect__Group_2_0__0__Impl"
    // InternalLcDsl.g:2665:1: rule__Redirect__Group_2_0__0__Impl : ( ( rule__Redirect__OutWhichAssignment_2_0_0 ) ) ;
    public final void rule__Redirect__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2669:1: ( ( ( rule__Redirect__OutWhichAssignment_2_0_0 ) ) )
            // InternalLcDsl.g:2670:1: ( ( rule__Redirect__OutWhichAssignment_2_0_0 ) )
            {
            // InternalLcDsl.g:2670:1: ( ( rule__Redirect__OutWhichAssignment_2_0_0 ) )
            // InternalLcDsl.g:2671:2: ( rule__Redirect__OutWhichAssignment_2_0_0 )
            {
             before(grammarAccess.getRedirectAccess().getOutWhichAssignment_2_0_0()); 
            // InternalLcDsl.g:2672:2: ( rule__Redirect__OutWhichAssignment_2_0_0 )
            // InternalLcDsl.g:2672:3: rule__Redirect__OutWhichAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__OutWhichAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRedirectAccess().getOutWhichAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_0__0__Impl"


    // $ANTLR start "rule__Redirect__Group_2_0__1"
    // InternalLcDsl.g:2680:1: rule__Redirect__Group_2_0__1 : rule__Redirect__Group_2_0__1__Impl rule__Redirect__Group_2_0__2 ;
    public final void rule__Redirect__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2684:1: ( rule__Redirect__Group_2_0__1__Impl rule__Redirect__Group_2_0__2 )
            // InternalLcDsl.g:2685:2: rule__Redirect__Group_2_0__1__Impl rule__Redirect__Group_2_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Redirect__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Redirect__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_0__1"


    // $ANTLR start "rule__Redirect__Group_2_0__1__Impl"
    // InternalLcDsl.g:2692:1: rule__Redirect__Group_2_0__1__Impl : ( 'to' ) ;
    public final void rule__Redirect__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2696:1: ( ( 'to' ) )
            // InternalLcDsl.g:2697:1: ( 'to' )
            {
            // InternalLcDsl.g:2697:1: ( 'to' )
            // InternalLcDsl.g:2698:2: 'to'
            {
             before(grammarAccess.getRedirectAccess().getToKeyword_2_0_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRedirectAccess().getToKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_0__1__Impl"


    // $ANTLR start "rule__Redirect__Group_2_0__2"
    // InternalLcDsl.g:2707:1: rule__Redirect__Group_2_0__2 : rule__Redirect__Group_2_0__2__Impl ;
    public final void rule__Redirect__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2711:1: ( rule__Redirect__Group_2_0__2__Impl )
            // InternalLcDsl.g:2712:2: rule__Redirect__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_0__2"


    // $ANTLR start "rule__Redirect__Group_2_0__2__Impl"
    // InternalLcDsl.g:2718:1: rule__Redirect__Group_2_0__2__Impl : ( ( rule__Redirect__OutFileAssignment_2_0_2 ) ) ;
    public final void rule__Redirect__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2722:1: ( ( ( rule__Redirect__OutFileAssignment_2_0_2 ) ) )
            // InternalLcDsl.g:2723:1: ( ( rule__Redirect__OutFileAssignment_2_0_2 ) )
            {
            // InternalLcDsl.g:2723:1: ( ( rule__Redirect__OutFileAssignment_2_0_2 ) )
            // InternalLcDsl.g:2724:2: ( rule__Redirect__OutFileAssignment_2_0_2 )
            {
             before(grammarAccess.getRedirectAccess().getOutFileAssignment_2_0_2()); 
            // InternalLcDsl.g:2725:2: ( rule__Redirect__OutFileAssignment_2_0_2 )
            // InternalLcDsl.g:2725:3: rule__Redirect__OutFileAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__OutFileAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRedirectAccess().getOutFileAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_0__2__Impl"


    // $ANTLR start "rule__Redirect__Group_2_1__0"
    // InternalLcDsl.g:2734:1: rule__Redirect__Group_2_1__0 : rule__Redirect__Group_2_1__0__Impl rule__Redirect__Group_2_1__1 ;
    public final void rule__Redirect__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2738:1: ( rule__Redirect__Group_2_1__0__Impl rule__Redirect__Group_2_1__1 )
            // InternalLcDsl.g:2739:2: rule__Redirect__Group_2_1__0__Impl rule__Redirect__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Redirect__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Redirect__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_1__0"


    // $ANTLR start "rule__Redirect__Group_2_1__0__Impl"
    // InternalLcDsl.g:2746:1: rule__Redirect__Group_2_1__0__Impl : ( ( rule__Redirect__InWhichAssignment_2_1_0 ) ) ;
    public final void rule__Redirect__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2750:1: ( ( ( rule__Redirect__InWhichAssignment_2_1_0 ) ) )
            // InternalLcDsl.g:2751:1: ( ( rule__Redirect__InWhichAssignment_2_1_0 ) )
            {
            // InternalLcDsl.g:2751:1: ( ( rule__Redirect__InWhichAssignment_2_1_0 ) )
            // InternalLcDsl.g:2752:2: ( rule__Redirect__InWhichAssignment_2_1_0 )
            {
             before(grammarAccess.getRedirectAccess().getInWhichAssignment_2_1_0()); 
            // InternalLcDsl.g:2753:2: ( rule__Redirect__InWhichAssignment_2_1_0 )
            // InternalLcDsl.g:2753:3: rule__Redirect__InWhichAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__InWhichAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRedirectAccess().getInWhichAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_1__0__Impl"


    // $ANTLR start "rule__Redirect__Group_2_1__1"
    // InternalLcDsl.g:2761:1: rule__Redirect__Group_2_1__1 : rule__Redirect__Group_2_1__1__Impl rule__Redirect__Group_2_1__2 ;
    public final void rule__Redirect__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2765:1: ( rule__Redirect__Group_2_1__1__Impl rule__Redirect__Group_2_1__2 )
            // InternalLcDsl.g:2766:2: rule__Redirect__Group_2_1__1__Impl rule__Redirect__Group_2_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Redirect__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Redirect__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_1__1"


    // $ANTLR start "rule__Redirect__Group_2_1__1__Impl"
    // InternalLcDsl.g:2773:1: rule__Redirect__Group_2_1__1__Impl : ( 'from' ) ;
    public final void rule__Redirect__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2777:1: ( ( 'from' ) )
            // InternalLcDsl.g:2778:1: ( 'from' )
            {
            // InternalLcDsl.g:2778:1: ( 'from' )
            // InternalLcDsl.g:2779:2: 'from'
            {
             before(grammarAccess.getRedirectAccess().getFromKeyword_2_1_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRedirectAccess().getFromKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_1__1__Impl"


    // $ANTLR start "rule__Redirect__Group_2_1__2"
    // InternalLcDsl.g:2788:1: rule__Redirect__Group_2_1__2 : rule__Redirect__Group_2_1__2__Impl ;
    public final void rule__Redirect__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2792:1: ( rule__Redirect__Group_2_1__2__Impl )
            // InternalLcDsl.g:2793:2: rule__Redirect__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_1__2"


    // $ANTLR start "rule__Redirect__Group_2_1__2__Impl"
    // InternalLcDsl.g:2799:1: rule__Redirect__Group_2_1__2__Impl : ( ( rule__Redirect__InFileAssignment_2_1_2 ) ) ;
    public final void rule__Redirect__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2803:1: ( ( ( rule__Redirect__InFileAssignment_2_1_2 ) ) )
            // InternalLcDsl.g:2804:1: ( ( rule__Redirect__InFileAssignment_2_1_2 ) )
            {
            // InternalLcDsl.g:2804:1: ( ( rule__Redirect__InFileAssignment_2_1_2 ) )
            // InternalLcDsl.g:2805:2: ( rule__Redirect__InFileAssignment_2_1_2 )
            {
             before(grammarAccess.getRedirectAccess().getInFileAssignment_2_1_2()); 
            // InternalLcDsl.g:2806:2: ( rule__Redirect__InFileAssignment_2_1_2 )
            // InternalLcDsl.g:2806:3: rule__Redirect__InFileAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__InFileAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRedirectAccess().getInFileAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__Group_2_1__2__Impl"


    // $ANTLR start "rule__ExecutionEnvironment__Group__0"
    // InternalLcDsl.g:2815:1: rule__ExecutionEnvironment__Group__0 : rule__ExecutionEnvironment__Group__0__Impl rule__ExecutionEnvironment__Group__1 ;
    public final void rule__ExecutionEnvironment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2819:1: ( rule__ExecutionEnvironment__Group__0__Impl rule__ExecutionEnvironment__Group__1 )
            // InternalLcDsl.g:2820:2: rule__ExecutionEnvironment__Group__0__Impl rule__ExecutionEnvironment__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExecutionEnvironment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutionEnvironment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionEnvironment__Group__0"


    // $ANTLR start "rule__ExecutionEnvironment__Group__0__Impl"
    // InternalLcDsl.g:2827:1: rule__ExecutionEnvironment__Group__0__Impl : ( 'execution-environment' ) ;
    public final void rule__ExecutionEnvironment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2831:1: ( ( 'execution-environment' ) )
            // InternalLcDsl.g:2832:1: ( 'execution-environment' )
            {
            // InternalLcDsl.g:2832:1: ( 'execution-environment' )
            // InternalLcDsl.g:2833:2: 'execution-environment'
            {
             before(grammarAccess.getExecutionEnvironmentAccess().getExecutionEnvironmentKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getExecutionEnvironmentAccess().getExecutionEnvironmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionEnvironment__Group__0__Impl"


    // $ANTLR start "rule__ExecutionEnvironment__Group__1"
    // InternalLcDsl.g:2842:1: rule__ExecutionEnvironment__Group__1 : rule__ExecutionEnvironment__Group__1__Impl rule__ExecutionEnvironment__Group__2 ;
    public final void rule__ExecutionEnvironment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2846:1: ( rule__ExecutionEnvironment__Group__1__Impl rule__ExecutionEnvironment__Group__2 )
            // InternalLcDsl.g:2847:2: rule__ExecutionEnvironment__Group__1__Impl rule__ExecutionEnvironment__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ExecutionEnvironment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutionEnvironment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionEnvironment__Group__1"


    // $ANTLR start "rule__ExecutionEnvironment__Group__1__Impl"
    // InternalLcDsl.g:2854:1: rule__ExecutionEnvironment__Group__1__Impl : ( ( rule__ExecutionEnvironment__NameAssignment_1 ) ) ;
    public final void rule__ExecutionEnvironment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2858:1: ( ( ( rule__ExecutionEnvironment__NameAssignment_1 ) ) )
            // InternalLcDsl.g:2859:1: ( ( rule__ExecutionEnvironment__NameAssignment_1 ) )
            {
            // InternalLcDsl.g:2859:1: ( ( rule__ExecutionEnvironment__NameAssignment_1 ) )
            // InternalLcDsl.g:2860:2: ( rule__ExecutionEnvironment__NameAssignment_1 )
            {
             before(grammarAccess.getExecutionEnvironmentAccess().getNameAssignment_1()); 
            // InternalLcDsl.g:2861:2: ( rule__ExecutionEnvironment__NameAssignment_1 )
            // InternalLcDsl.g:2861:3: rule__ExecutionEnvironment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionEnvironment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExecutionEnvironmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionEnvironment__Group__1__Impl"


    // $ANTLR start "rule__ExecutionEnvironment__Group__2"
    // InternalLcDsl.g:2869:1: rule__ExecutionEnvironment__Group__2 : rule__ExecutionEnvironment__Group__2__Impl ;
    public final void rule__ExecutionEnvironment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2873:1: ( rule__ExecutionEnvironment__Group__2__Impl )
            // InternalLcDsl.g:2874:2: rule__ExecutionEnvironment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionEnvironment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionEnvironment__Group__2"


    // $ANTLR start "rule__ExecutionEnvironment__Group__2__Impl"
    // InternalLcDsl.g:2880:1: rule__ExecutionEnvironment__Group__2__Impl : ( ';' ) ;
    public final void rule__ExecutionEnvironment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2884:1: ( ( ';' ) )
            // InternalLcDsl.g:2885:1: ( ';' )
            {
            // InternalLcDsl.g:2885:1: ( ';' )
            // InternalLcDsl.g:2886:2: ';'
            {
             before(grammarAccess.getExecutionEnvironmentAccess().getSemicolonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExecutionEnvironmentAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionEnvironment__Group__2__Impl"


    // $ANTLR start "rule__Plugin__Group__0"
    // InternalLcDsl.g:2896:1: rule__Plugin__Group__0 : rule__Plugin__Group__0__Impl rule__Plugin__Group__1 ;
    public final void rule__Plugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2900:1: ( rule__Plugin__Group__0__Impl rule__Plugin__Group__1 )
            // InternalLcDsl.g:2901:2: rule__Plugin__Group__0__Impl rule__Plugin__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Plugin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plugin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__Group__0"


    // $ANTLR start "rule__Plugin__Group__0__Impl"
    // InternalLcDsl.g:2908:1: rule__Plugin__Group__0__Impl : ( ( rule__Plugin__NameAssignment_0 ) ) ;
    public final void rule__Plugin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2912:1: ( ( ( rule__Plugin__NameAssignment_0 ) ) )
            // InternalLcDsl.g:2913:1: ( ( rule__Plugin__NameAssignment_0 ) )
            {
            // InternalLcDsl.g:2913:1: ( ( rule__Plugin__NameAssignment_0 ) )
            // InternalLcDsl.g:2914:2: ( rule__Plugin__NameAssignment_0 )
            {
             before(grammarAccess.getPluginAccess().getNameAssignment_0()); 
            // InternalLcDsl.g:2915:2: ( rule__Plugin__NameAssignment_0 )
            // InternalLcDsl.g:2915:3: rule__Plugin__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__Group__0__Impl"


    // $ANTLR start "rule__Plugin__Group__1"
    // InternalLcDsl.g:2923:1: rule__Plugin__Group__1 : rule__Plugin__Group__1__Impl ;
    public final void rule__Plugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2927:1: ( rule__Plugin__Group__1__Impl )
            // InternalLcDsl.g:2928:2: rule__Plugin__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__Group__1"


    // $ANTLR start "rule__Plugin__Group__1__Impl"
    // InternalLcDsl.g:2934:1: rule__Plugin__Group__1__Impl : ( ( rule__Plugin__VersionAssignment_1 )? ) ;
    public final void rule__Plugin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2938:1: ( ( ( rule__Plugin__VersionAssignment_1 )? ) )
            // InternalLcDsl.g:2939:1: ( ( rule__Plugin__VersionAssignment_1 )? )
            {
            // InternalLcDsl.g:2939:1: ( ( rule__Plugin__VersionAssignment_1 )? )
            // InternalLcDsl.g:2940:2: ( rule__Plugin__VersionAssignment_1 )?
            {
             before(grammarAccess.getPluginAccess().getVersionAssignment_1()); 
            // InternalLcDsl.g:2941:2: ( rule__Plugin__VersionAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_VERSION) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLcDsl.g:2941:3: rule__Plugin__VersionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Plugin__VersionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPluginAccess().getVersionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__Group__1__Impl"


    // $ANTLR start "rule__ClearOption__Group__0"
    // InternalLcDsl.g:2950:1: rule__ClearOption__Group__0 : rule__ClearOption__Group__0__Impl rule__ClearOption__Group__1 ;
    public final void rule__ClearOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2954:1: ( rule__ClearOption__Group__0__Impl rule__ClearOption__Group__1 )
            // InternalLcDsl.g:2955:2: rule__ClearOption__Group__0__Impl rule__ClearOption__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ClearOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClearOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group__0"


    // $ANTLR start "rule__ClearOption__Group__0__Impl"
    // InternalLcDsl.g:2962:1: rule__ClearOption__Group__0__Impl : ( () ) ;
    public final void rule__ClearOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2966:1: ( ( () ) )
            // InternalLcDsl.g:2967:1: ( () )
            {
            // InternalLcDsl.g:2967:1: ( () )
            // InternalLcDsl.g:2968:2: ()
            {
             before(grammarAccess.getClearOptionAccess().getClearOptionAction_0()); 
            // InternalLcDsl.g:2969:2: ()
            // InternalLcDsl.g:2969:3: 
            {
            }

             after(grammarAccess.getClearOptionAccess().getClearOptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group__0__Impl"


    // $ANTLR start "rule__ClearOption__Group__1"
    // InternalLcDsl.g:2977:1: rule__ClearOption__Group__1 : rule__ClearOption__Group__1__Impl rule__ClearOption__Group__2 ;
    public final void rule__ClearOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2981:1: ( rule__ClearOption__Group__1__Impl rule__ClearOption__Group__2 )
            // InternalLcDsl.g:2982:2: rule__ClearOption__Group__1__Impl rule__ClearOption__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ClearOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClearOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group__1"


    // $ANTLR start "rule__ClearOption__Group__1__Impl"
    // InternalLcDsl.g:2989:1: rule__ClearOption__Group__1__Impl : ( 'clear' ) ;
    public final void rule__ClearOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2993:1: ( ( 'clear' ) )
            // InternalLcDsl.g:2994:1: ( 'clear' )
            {
            // InternalLcDsl.g:2994:1: ( 'clear' )
            // InternalLcDsl.g:2995:2: 'clear'
            {
             before(grammarAccess.getClearOptionAccess().getClearKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getClearOptionAccess().getClearKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group__1__Impl"


    // $ANTLR start "rule__ClearOption__Group__2"
    // InternalLcDsl.g:3004:1: rule__ClearOption__Group__2 : rule__ClearOption__Group__2__Impl ;
    public final void rule__ClearOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3008:1: ( rule__ClearOption__Group__2__Impl )
            // InternalLcDsl.g:3009:2: rule__ClearOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClearOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group__2"


    // $ANTLR start "rule__ClearOption__Group__2__Impl"
    // InternalLcDsl.g:3015:1: rule__ClearOption__Group__2__Impl : ( ( rule__ClearOption__UnorderedGroup_2 ) ) ;
    public final void rule__ClearOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3019:1: ( ( ( rule__ClearOption__UnorderedGroup_2 ) ) )
            // InternalLcDsl.g:3020:1: ( ( rule__ClearOption__UnorderedGroup_2 ) )
            {
            // InternalLcDsl.g:3020:1: ( ( rule__ClearOption__UnorderedGroup_2 ) )
            // InternalLcDsl.g:3021:2: ( rule__ClearOption__UnorderedGroup_2 )
            {
             before(grammarAccess.getClearOptionAccess().getUnorderedGroup_2()); 
            // InternalLcDsl.g:3022:2: ( rule__ClearOption__UnorderedGroup_2 )
            // InternalLcDsl.g:3022:3: rule__ClearOption__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__ClearOption__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getClearOptionAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group__2__Impl"


    // $ANTLR start "rule__ClearOption__Group_2_0__0"
    // InternalLcDsl.g:3031:1: rule__ClearOption__Group_2_0__0 : rule__ClearOption__Group_2_0__0__Impl rule__ClearOption__Group_2_0__1 ;
    public final void rule__ClearOption__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3035:1: ( rule__ClearOption__Group_2_0__0__Impl rule__ClearOption__Group_2_0__1 )
            // InternalLcDsl.g:3036:2: rule__ClearOption__Group_2_0__0__Impl rule__ClearOption__Group_2_0__1
            {
            pushFollow(FOLLOW_28);
            rule__ClearOption__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClearOption__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group_2_0__0"


    // $ANTLR start "rule__ClearOption__Group_2_0__0__Impl"
    // InternalLcDsl.g:3043:1: rule__ClearOption__Group_2_0__0__Impl : ( ( rule__ClearOption__Alternatives_2_0_0 ) ) ;
    public final void rule__ClearOption__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3047:1: ( ( ( rule__ClearOption__Alternatives_2_0_0 ) ) )
            // InternalLcDsl.g:3048:1: ( ( rule__ClearOption__Alternatives_2_0_0 ) )
            {
            // InternalLcDsl.g:3048:1: ( ( rule__ClearOption__Alternatives_2_0_0 ) )
            // InternalLcDsl.g:3049:2: ( rule__ClearOption__Alternatives_2_0_0 )
            {
             before(grammarAccess.getClearOptionAccess().getAlternatives_2_0_0()); 
            // InternalLcDsl.g:3050:2: ( rule__ClearOption__Alternatives_2_0_0 )
            // InternalLcDsl.g:3050:3: rule__ClearOption__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ClearOption__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClearOptionAccess().getAlternatives_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group_2_0__0__Impl"


    // $ANTLR start "rule__ClearOption__Group_2_0__1"
    // InternalLcDsl.g:3058:1: rule__ClearOption__Group_2_0__1 : rule__ClearOption__Group_2_0__1__Impl ;
    public final void rule__ClearOption__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3062:1: ( rule__ClearOption__Group_2_0__1__Impl )
            // InternalLcDsl.g:3063:2: rule__ClearOption__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClearOption__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group_2_0__1"


    // $ANTLR start "rule__ClearOption__Group_2_0__1__Impl"
    // InternalLcDsl.g:3069:1: rule__ClearOption__Group_2_0__1__Impl : ( ( rule__ClearOption__NoAskClearAssignment_2_0_1 )? ) ;
    public final void rule__ClearOption__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3073:1: ( ( ( rule__ClearOption__NoAskClearAssignment_2_0_1 )? ) )
            // InternalLcDsl.g:3074:1: ( ( rule__ClearOption__NoAskClearAssignment_2_0_1 )? )
            {
            // InternalLcDsl.g:3074:1: ( ( rule__ClearOption__NoAskClearAssignment_2_0_1 )? )
            // InternalLcDsl.g:3075:2: ( rule__ClearOption__NoAskClearAssignment_2_0_1 )?
            {
             before(grammarAccess.getClearOptionAccess().getNoAskClearAssignment_2_0_1()); 
            // InternalLcDsl.g:3076:2: ( rule__ClearOption__NoAskClearAssignment_2_0_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==71) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLcDsl.g:3076:3: rule__ClearOption__NoAskClearAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClearOption__NoAskClearAssignment_2_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClearOptionAccess().getNoAskClearAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__Group_2_0__1__Impl"


    // $ANTLR start "rule__MemoryOption__Group__0"
    // InternalLcDsl.g:3085:1: rule__MemoryOption__Group__0 : rule__MemoryOption__Group__0__Impl rule__MemoryOption__Group__1 ;
    public final void rule__MemoryOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3089:1: ( rule__MemoryOption__Group__0__Impl rule__MemoryOption__Group__1 )
            // InternalLcDsl.g:3090:2: rule__MemoryOption__Group__0__Impl rule__MemoryOption__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__MemoryOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group__0"


    // $ANTLR start "rule__MemoryOption__Group__0__Impl"
    // InternalLcDsl.g:3097:1: rule__MemoryOption__Group__0__Impl : ( () ) ;
    public final void rule__MemoryOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3101:1: ( ( () ) )
            // InternalLcDsl.g:3102:1: ( () )
            {
            // InternalLcDsl.g:3102:1: ( () )
            // InternalLcDsl.g:3103:2: ()
            {
             before(grammarAccess.getMemoryOptionAccess().getMemoryOptionAction_0()); 
            // InternalLcDsl.g:3104:2: ()
            // InternalLcDsl.g:3104:3: 
            {
            }

             after(grammarAccess.getMemoryOptionAccess().getMemoryOptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group__0__Impl"


    // $ANTLR start "rule__MemoryOption__Group__1"
    // InternalLcDsl.g:3112:1: rule__MemoryOption__Group__1 : rule__MemoryOption__Group__1__Impl rule__MemoryOption__Group__2 ;
    public final void rule__MemoryOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3116:1: ( rule__MemoryOption__Group__1__Impl rule__MemoryOption__Group__2 )
            // InternalLcDsl.g:3117:2: rule__MemoryOption__Group__1__Impl rule__MemoryOption__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__MemoryOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group__1"


    // $ANTLR start "rule__MemoryOption__Group__1__Impl"
    // InternalLcDsl.g:3124:1: rule__MemoryOption__Group__1__Impl : ( 'memory' ) ;
    public final void rule__MemoryOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3128:1: ( ( 'memory' ) )
            // InternalLcDsl.g:3129:1: ( 'memory' )
            {
            // InternalLcDsl.g:3129:1: ( 'memory' )
            // InternalLcDsl.g:3130:2: 'memory'
            {
             before(grammarAccess.getMemoryOptionAccess().getMemoryKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getMemoryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group__1__Impl"


    // $ANTLR start "rule__MemoryOption__Group__2"
    // InternalLcDsl.g:3139:1: rule__MemoryOption__Group__2 : rule__MemoryOption__Group__2__Impl ;
    public final void rule__MemoryOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3143:1: ( rule__MemoryOption__Group__2__Impl )
            // InternalLcDsl.g:3144:2: rule__MemoryOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group__2"


    // $ANTLR start "rule__MemoryOption__Group__2__Impl"
    // InternalLcDsl.g:3150:1: rule__MemoryOption__Group__2__Impl : ( ( rule__MemoryOption__UnorderedGroup_2 ) ) ;
    public final void rule__MemoryOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3154:1: ( ( ( rule__MemoryOption__UnorderedGroup_2 ) ) )
            // InternalLcDsl.g:3155:1: ( ( rule__MemoryOption__UnorderedGroup_2 ) )
            {
            // InternalLcDsl.g:3155:1: ( ( rule__MemoryOption__UnorderedGroup_2 ) )
            // InternalLcDsl.g:3156:2: ( rule__MemoryOption__UnorderedGroup_2 )
            {
             before(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2()); 
            // InternalLcDsl.g:3157:2: ( rule__MemoryOption__UnorderedGroup_2 )
            // InternalLcDsl.g:3157:3: rule__MemoryOption__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group__2__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_0__0"
    // InternalLcDsl.g:3166:1: rule__MemoryOption__Group_2_0__0 : rule__MemoryOption__Group_2_0__0__Impl rule__MemoryOption__Group_2_0__1 ;
    public final void rule__MemoryOption__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3170:1: ( rule__MemoryOption__Group_2_0__0__Impl rule__MemoryOption__Group_2_0__1 )
            // InternalLcDsl.g:3171:2: rule__MemoryOption__Group_2_0__0__Impl rule__MemoryOption__Group_2_0__1
            {
            pushFollow(FOLLOW_18);
            rule__MemoryOption__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_0__0"


    // $ANTLR start "rule__MemoryOption__Group_2_0__0__Impl"
    // InternalLcDsl.g:3178:1: rule__MemoryOption__Group_2_0__0__Impl : ( 'min' ) ;
    public final void rule__MemoryOption__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3182:1: ( ( 'min' ) )
            // InternalLcDsl.g:3183:1: ( 'min' )
            {
            // InternalLcDsl.g:3183:1: ( 'min' )
            // InternalLcDsl.g:3184:2: 'min'
            {
             before(grammarAccess.getMemoryOptionAccess().getMinKeyword_2_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getMinKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_0__0__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_0__1"
    // InternalLcDsl.g:3193:1: rule__MemoryOption__Group_2_0__1 : rule__MemoryOption__Group_2_0__1__Impl rule__MemoryOption__Group_2_0__2 ;
    public final void rule__MemoryOption__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3197:1: ( rule__MemoryOption__Group_2_0__1__Impl rule__MemoryOption__Group_2_0__2 )
            // InternalLcDsl.g:3198:2: rule__MemoryOption__Group_2_0__1__Impl rule__MemoryOption__Group_2_0__2
            {
            pushFollow(FOLLOW_31);
            rule__MemoryOption__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_0__1"


    // $ANTLR start "rule__MemoryOption__Group_2_0__1__Impl"
    // InternalLcDsl.g:3205:1: rule__MemoryOption__Group_2_0__1__Impl : ( RULE_EQ ) ;
    public final void rule__MemoryOption__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3209:1: ( ( RULE_EQ ) )
            // InternalLcDsl.g:3210:1: ( RULE_EQ )
            {
            // InternalLcDsl.g:3210:1: ( RULE_EQ )
            // InternalLcDsl.g:3211:2: RULE_EQ
            {
             before(grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_0_1()); 
            match(input,RULE_EQ,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_0__1__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_0__2"
    // InternalLcDsl.g:3220:1: rule__MemoryOption__Group_2_0__2 : rule__MemoryOption__Group_2_0__2__Impl rule__MemoryOption__Group_2_0__3 ;
    public final void rule__MemoryOption__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3224:1: ( rule__MemoryOption__Group_2_0__2__Impl rule__MemoryOption__Group_2_0__3 )
            // InternalLcDsl.g:3225:2: rule__MemoryOption__Group_2_0__2__Impl rule__MemoryOption__Group_2_0__3
            {
            pushFollow(FOLLOW_32);
            rule__MemoryOption__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_0__2"


    // $ANTLR start "rule__MemoryOption__Group_2_0__2__Impl"
    // InternalLcDsl.g:3232:1: rule__MemoryOption__Group_2_0__2__Impl : ( ( rule__MemoryOption__MinAssignment_2_0_2 ) ) ;
    public final void rule__MemoryOption__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3236:1: ( ( ( rule__MemoryOption__MinAssignment_2_0_2 ) ) )
            // InternalLcDsl.g:3237:1: ( ( rule__MemoryOption__MinAssignment_2_0_2 ) )
            {
            // InternalLcDsl.g:3237:1: ( ( rule__MemoryOption__MinAssignment_2_0_2 ) )
            // InternalLcDsl.g:3238:2: ( rule__MemoryOption__MinAssignment_2_0_2 )
            {
             before(grammarAccess.getMemoryOptionAccess().getMinAssignment_2_0_2()); 
            // InternalLcDsl.g:3239:2: ( rule__MemoryOption__MinAssignment_2_0_2 )
            // InternalLcDsl.g:3239:3: rule__MemoryOption__MinAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__MinAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMemoryOptionAccess().getMinAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_0__2__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_0__3"
    // InternalLcDsl.g:3247:1: rule__MemoryOption__Group_2_0__3 : rule__MemoryOption__Group_2_0__3__Impl ;
    public final void rule__MemoryOption__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3251:1: ( rule__MemoryOption__Group_2_0__3__Impl )
            // InternalLcDsl.g:3252:2: rule__MemoryOption__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_0__3"


    // $ANTLR start "rule__MemoryOption__Group_2_0__3__Impl"
    // InternalLcDsl.g:3258:1: rule__MemoryOption__Group_2_0__3__Impl : ( ( rule__MemoryOption__MinUnitAssignment_2_0_3 ) ) ;
    public final void rule__MemoryOption__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3262:1: ( ( ( rule__MemoryOption__MinUnitAssignment_2_0_3 ) ) )
            // InternalLcDsl.g:3263:1: ( ( rule__MemoryOption__MinUnitAssignment_2_0_3 ) )
            {
            // InternalLcDsl.g:3263:1: ( ( rule__MemoryOption__MinUnitAssignment_2_0_3 ) )
            // InternalLcDsl.g:3264:2: ( rule__MemoryOption__MinUnitAssignment_2_0_3 )
            {
             before(grammarAccess.getMemoryOptionAccess().getMinUnitAssignment_2_0_3()); 
            // InternalLcDsl.g:3265:2: ( rule__MemoryOption__MinUnitAssignment_2_0_3 )
            // InternalLcDsl.g:3265:3: rule__MemoryOption__MinUnitAssignment_2_0_3
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__MinUnitAssignment_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getMemoryOptionAccess().getMinUnitAssignment_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_0__3__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_1__0"
    // InternalLcDsl.g:3274:1: rule__MemoryOption__Group_2_1__0 : rule__MemoryOption__Group_2_1__0__Impl rule__MemoryOption__Group_2_1__1 ;
    public final void rule__MemoryOption__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3278:1: ( rule__MemoryOption__Group_2_1__0__Impl rule__MemoryOption__Group_2_1__1 )
            // InternalLcDsl.g:3279:2: rule__MemoryOption__Group_2_1__0__Impl rule__MemoryOption__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__MemoryOption__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_1__0"


    // $ANTLR start "rule__MemoryOption__Group_2_1__0__Impl"
    // InternalLcDsl.g:3286:1: rule__MemoryOption__Group_2_1__0__Impl : ( 'max' ) ;
    public final void rule__MemoryOption__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3290:1: ( ( 'max' ) )
            // InternalLcDsl.g:3291:1: ( 'max' )
            {
            // InternalLcDsl.g:3291:1: ( 'max' )
            // InternalLcDsl.g:3292:2: 'max'
            {
             before(grammarAccess.getMemoryOptionAccess().getMaxKeyword_2_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getMaxKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_1__0__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_1__1"
    // InternalLcDsl.g:3301:1: rule__MemoryOption__Group_2_1__1 : rule__MemoryOption__Group_2_1__1__Impl rule__MemoryOption__Group_2_1__2 ;
    public final void rule__MemoryOption__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3305:1: ( rule__MemoryOption__Group_2_1__1__Impl rule__MemoryOption__Group_2_1__2 )
            // InternalLcDsl.g:3306:2: rule__MemoryOption__Group_2_1__1__Impl rule__MemoryOption__Group_2_1__2
            {
            pushFollow(FOLLOW_31);
            rule__MemoryOption__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_1__1"


    // $ANTLR start "rule__MemoryOption__Group_2_1__1__Impl"
    // InternalLcDsl.g:3313:1: rule__MemoryOption__Group_2_1__1__Impl : ( RULE_EQ ) ;
    public final void rule__MemoryOption__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3317:1: ( ( RULE_EQ ) )
            // InternalLcDsl.g:3318:1: ( RULE_EQ )
            {
            // InternalLcDsl.g:3318:1: ( RULE_EQ )
            // InternalLcDsl.g:3319:2: RULE_EQ
            {
             before(grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_1_1()); 
            match(input,RULE_EQ,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_1__1__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_1__2"
    // InternalLcDsl.g:3328:1: rule__MemoryOption__Group_2_1__2 : rule__MemoryOption__Group_2_1__2__Impl rule__MemoryOption__Group_2_1__3 ;
    public final void rule__MemoryOption__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3332:1: ( rule__MemoryOption__Group_2_1__2__Impl rule__MemoryOption__Group_2_1__3 )
            // InternalLcDsl.g:3333:2: rule__MemoryOption__Group_2_1__2__Impl rule__MemoryOption__Group_2_1__3
            {
            pushFollow(FOLLOW_32);
            rule__MemoryOption__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_1__2"


    // $ANTLR start "rule__MemoryOption__Group_2_1__2__Impl"
    // InternalLcDsl.g:3340:1: rule__MemoryOption__Group_2_1__2__Impl : ( ( rule__MemoryOption__MaxAssignment_2_1_2 ) ) ;
    public final void rule__MemoryOption__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3344:1: ( ( ( rule__MemoryOption__MaxAssignment_2_1_2 ) ) )
            // InternalLcDsl.g:3345:1: ( ( rule__MemoryOption__MaxAssignment_2_1_2 ) )
            {
            // InternalLcDsl.g:3345:1: ( ( rule__MemoryOption__MaxAssignment_2_1_2 ) )
            // InternalLcDsl.g:3346:2: ( rule__MemoryOption__MaxAssignment_2_1_2 )
            {
             before(grammarAccess.getMemoryOptionAccess().getMaxAssignment_2_1_2()); 
            // InternalLcDsl.g:3347:2: ( rule__MemoryOption__MaxAssignment_2_1_2 )
            // InternalLcDsl.g:3347:3: rule__MemoryOption__MaxAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__MaxAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMemoryOptionAccess().getMaxAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_1__2__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_1__3"
    // InternalLcDsl.g:3355:1: rule__MemoryOption__Group_2_1__3 : rule__MemoryOption__Group_2_1__3__Impl ;
    public final void rule__MemoryOption__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3359:1: ( rule__MemoryOption__Group_2_1__3__Impl )
            // InternalLcDsl.g:3360:2: rule__MemoryOption__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_1__3"


    // $ANTLR start "rule__MemoryOption__Group_2_1__3__Impl"
    // InternalLcDsl.g:3366:1: rule__MemoryOption__Group_2_1__3__Impl : ( ( rule__MemoryOption__MaxUnitAssignment_2_1_3 ) ) ;
    public final void rule__MemoryOption__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3370:1: ( ( ( rule__MemoryOption__MaxUnitAssignment_2_1_3 ) ) )
            // InternalLcDsl.g:3371:1: ( ( rule__MemoryOption__MaxUnitAssignment_2_1_3 ) )
            {
            // InternalLcDsl.g:3371:1: ( ( rule__MemoryOption__MaxUnitAssignment_2_1_3 ) )
            // InternalLcDsl.g:3372:2: ( rule__MemoryOption__MaxUnitAssignment_2_1_3 )
            {
             before(grammarAccess.getMemoryOptionAccess().getMaxUnitAssignment_2_1_3()); 
            // InternalLcDsl.g:3373:2: ( rule__MemoryOption__MaxUnitAssignment_2_1_3 )
            // InternalLcDsl.g:3373:3: rule__MemoryOption__MaxUnitAssignment_2_1_3
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__MaxUnitAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getMemoryOptionAccess().getMaxUnitAssignment_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_1__3__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_2__0"
    // InternalLcDsl.g:3382:1: rule__MemoryOption__Group_2_2__0 : rule__MemoryOption__Group_2_2__0__Impl rule__MemoryOption__Group_2_2__1 ;
    public final void rule__MemoryOption__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3386:1: ( rule__MemoryOption__Group_2_2__0__Impl rule__MemoryOption__Group_2_2__1 )
            // InternalLcDsl.g:3387:2: rule__MemoryOption__Group_2_2__0__Impl rule__MemoryOption__Group_2_2__1
            {
            pushFollow(FOLLOW_18);
            rule__MemoryOption__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_2__0"


    // $ANTLR start "rule__MemoryOption__Group_2_2__0__Impl"
    // InternalLcDsl.g:3394:1: rule__MemoryOption__Group_2_2__0__Impl : ( 'perm' ) ;
    public final void rule__MemoryOption__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3398:1: ( ( 'perm' ) )
            // InternalLcDsl.g:3399:1: ( 'perm' )
            {
            // InternalLcDsl.g:3399:1: ( 'perm' )
            // InternalLcDsl.g:3400:2: 'perm'
            {
             before(grammarAccess.getMemoryOptionAccess().getPermKeyword_2_2_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getPermKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_2__0__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_2__1"
    // InternalLcDsl.g:3409:1: rule__MemoryOption__Group_2_2__1 : rule__MemoryOption__Group_2_2__1__Impl rule__MemoryOption__Group_2_2__2 ;
    public final void rule__MemoryOption__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3413:1: ( rule__MemoryOption__Group_2_2__1__Impl rule__MemoryOption__Group_2_2__2 )
            // InternalLcDsl.g:3414:2: rule__MemoryOption__Group_2_2__1__Impl rule__MemoryOption__Group_2_2__2
            {
            pushFollow(FOLLOW_31);
            rule__MemoryOption__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_2__1"


    // $ANTLR start "rule__MemoryOption__Group_2_2__1__Impl"
    // InternalLcDsl.g:3421:1: rule__MemoryOption__Group_2_2__1__Impl : ( RULE_EQ ) ;
    public final void rule__MemoryOption__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3425:1: ( ( RULE_EQ ) )
            // InternalLcDsl.g:3426:1: ( RULE_EQ )
            {
            // InternalLcDsl.g:3426:1: ( RULE_EQ )
            // InternalLcDsl.g:3427:2: RULE_EQ
            {
             before(grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_2_1()); 
            match(input,RULE_EQ,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_2__1__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_2__2"
    // InternalLcDsl.g:3436:1: rule__MemoryOption__Group_2_2__2 : rule__MemoryOption__Group_2_2__2__Impl rule__MemoryOption__Group_2_2__3 ;
    public final void rule__MemoryOption__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3440:1: ( rule__MemoryOption__Group_2_2__2__Impl rule__MemoryOption__Group_2_2__3 )
            // InternalLcDsl.g:3441:2: rule__MemoryOption__Group_2_2__2__Impl rule__MemoryOption__Group_2_2__3
            {
            pushFollow(FOLLOW_32);
            rule__MemoryOption__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_2__2"


    // $ANTLR start "rule__MemoryOption__Group_2_2__2__Impl"
    // InternalLcDsl.g:3448:1: rule__MemoryOption__Group_2_2__2__Impl : ( ( rule__MemoryOption__PermAssignment_2_2_2 ) ) ;
    public final void rule__MemoryOption__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3452:1: ( ( ( rule__MemoryOption__PermAssignment_2_2_2 ) ) )
            // InternalLcDsl.g:3453:1: ( ( rule__MemoryOption__PermAssignment_2_2_2 ) )
            {
            // InternalLcDsl.g:3453:1: ( ( rule__MemoryOption__PermAssignment_2_2_2 ) )
            // InternalLcDsl.g:3454:2: ( rule__MemoryOption__PermAssignment_2_2_2 )
            {
             before(grammarAccess.getMemoryOptionAccess().getPermAssignment_2_2_2()); 
            // InternalLcDsl.g:3455:2: ( rule__MemoryOption__PermAssignment_2_2_2 )
            // InternalLcDsl.g:3455:3: rule__MemoryOption__PermAssignment_2_2_2
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__PermAssignment_2_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMemoryOptionAccess().getPermAssignment_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_2__2__Impl"


    // $ANTLR start "rule__MemoryOption__Group_2_2__3"
    // InternalLcDsl.g:3463:1: rule__MemoryOption__Group_2_2__3 : rule__MemoryOption__Group_2_2__3__Impl ;
    public final void rule__MemoryOption__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3467:1: ( rule__MemoryOption__Group_2_2__3__Impl )
            // InternalLcDsl.g:3468:2: rule__MemoryOption__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__Group_2_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_2__3"


    // $ANTLR start "rule__MemoryOption__Group_2_2__3__Impl"
    // InternalLcDsl.g:3474:1: rule__MemoryOption__Group_2_2__3__Impl : ( ( rule__MemoryOption__PermUnitAssignment_2_2_3 ) ) ;
    public final void rule__MemoryOption__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3478:1: ( ( ( rule__MemoryOption__PermUnitAssignment_2_2_3 ) ) )
            // InternalLcDsl.g:3479:1: ( ( rule__MemoryOption__PermUnitAssignment_2_2_3 ) )
            {
            // InternalLcDsl.g:3479:1: ( ( rule__MemoryOption__PermUnitAssignment_2_2_3 ) )
            // InternalLcDsl.g:3480:2: ( rule__MemoryOption__PermUnitAssignment_2_2_3 )
            {
             before(grammarAccess.getMemoryOptionAccess().getPermUnitAssignment_2_2_3()); 
            // InternalLcDsl.g:3481:2: ( rule__MemoryOption__PermUnitAssignment_2_2_3 )
            // InternalLcDsl.g:3481:3: rule__MemoryOption__PermUnitAssignment_2_2_3
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__PermUnitAssignment_2_2_3();

            state._fsp--;


            }

             after(grammarAccess.getMemoryOptionAccess().getPermUnitAssignment_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__Group_2_2__3__Impl"


    // $ANTLR start "rule__GroupMember__Group__0"
    // InternalLcDsl.g:3490:1: rule__GroupMember__Group__0 : rule__GroupMember__Group__0__Impl rule__GroupMember__Group__1 ;
    public final void rule__GroupMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3494:1: ( rule__GroupMember__Group__0__Impl rule__GroupMember__Group__1 )
            // InternalLcDsl.g:3495:2: rule__GroupMember__Group__0__Impl rule__GroupMember__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__GroupMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__0"


    // $ANTLR start "rule__GroupMember__Group__0__Impl"
    // InternalLcDsl.g:3502:1: rule__GroupMember__Group__0__Impl : ( ( rule__GroupMember__UnorderedGroup_0 ) ) ;
    public final void rule__GroupMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3506:1: ( ( ( rule__GroupMember__UnorderedGroup_0 ) ) )
            // InternalLcDsl.g:3507:1: ( ( rule__GroupMember__UnorderedGroup_0 ) )
            {
            // InternalLcDsl.g:3507:1: ( ( rule__GroupMember__UnorderedGroup_0 ) )
            // InternalLcDsl.g:3508:2: ( rule__GroupMember__UnorderedGroup_0 )
            {
             before(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0()); 
            // InternalLcDsl.g:3509:2: ( rule__GroupMember__UnorderedGroup_0 )
            // InternalLcDsl.g:3509:3: rule__GroupMember__UnorderedGroup_0
            {
            pushFollow(FOLLOW_2);
            rule__GroupMember__UnorderedGroup_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__0__Impl"


    // $ANTLR start "rule__GroupMember__Group__1"
    // InternalLcDsl.g:3517:1: rule__GroupMember__Group__1 : rule__GroupMember__Group__1__Impl rule__GroupMember__Group__2 ;
    public final void rule__GroupMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3521:1: ( rule__GroupMember__Group__1__Impl rule__GroupMember__Group__2 )
            // InternalLcDsl.g:3522:2: rule__GroupMember__Group__1__Impl rule__GroupMember__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__GroupMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__1"


    // $ANTLR start "rule__GroupMember__Group__1__Impl"
    // InternalLcDsl.g:3529:1: rule__GroupMember__Group__1__Impl : ( 'member' ) ;
    public final void rule__GroupMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3533:1: ( ( 'member' ) )
            // InternalLcDsl.g:3534:1: ( 'member' )
            {
            // InternalLcDsl.g:3534:1: ( 'member' )
            // InternalLcDsl.g:3535:2: 'member'
            {
             before(grammarAccess.getGroupMemberAccess().getMemberKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGroupMemberAccess().getMemberKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__1__Impl"


    // $ANTLR start "rule__GroupMember__Group__2"
    // InternalLcDsl.g:3544:1: rule__GroupMember__Group__2 : rule__GroupMember__Group__2__Impl rule__GroupMember__Group__3 ;
    public final void rule__GroupMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3548:1: ( rule__GroupMember__Group__2__Impl rule__GroupMember__Group__3 )
            // InternalLcDsl.g:3549:2: rule__GroupMember__Group__2__Impl rule__GroupMember__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__GroupMember__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupMember__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__2"


    // $ANTLR start "rule__GroupMember__Group__2__Impl"
    // InternalLcDsl.g:3556:1: rule__GroupMember__Group__2__Impl : ( ( rule__GroupMember__MemberAssignment_2 ) ) ;
    public final void rule__GroupMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3560:1: ( ( ( rule__GroupMember__MemberAssignment_2 ) ) )
            // InternalLcDsl.g:3561:1: ( ( rule__GroupMember__MemberAssignment_2 ) )
            {
            // InternalLcDsl.g:3561:1: ( ( rule__GroupMember__MemberAssignment_2 ) )
            // InternalLcDsl.g:3562:2: ( rule__GroupMember__MemberAssignment_2 )
            {
             before(grammarAccess.getGroupMemberAccess().getMemberAssignment_2()); 
            // InternalLcDsl.g:3563:2: ( rule__GroupMember__MemberAssignment_2 )
            // InternalLcDsl.g:3563:3: rule__GroupMember__MemberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GroupMember__MemberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupMemberAccess().getMemberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__2__Impl"


    // $ANTLR start "rule__GroupMember__Group__3"
    // InternalLcDsl.g:3571:1: rule__GroupMember__Group__3 : rule__GroupMember__Group__3__Impl rule__GroupMember__Group__4 ;
    public final void rule__GroupMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3575:1: ( rule__GroupMember__Group__3__Impl rule__GroupMember__Group__4 )
            // InternalLcDsl.g:3576:2: rule__GroupMember__Group__3__Impl rule__GroupMember__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__GroupMember__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupMember__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__3"


    // $ANTLR start "rule__GroupMember__Group__3__Impl"
    // InternalLcDsl.g:3583:1: rule__GroupMember__Group__3__Impl : ( ( rule__GroupMember__PostActionAssignment_3 )? ) ;
    public final void rule__GroupMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3587:1: ( ( ( rule__GroupMember__PostActionAssignment_3 )? ) )
            // InternalLcDsl.g:3588:1: ( ( rule__GroupMember__PostActionAssignment_3 )? )
            {
            // InternalLcDsl.g:3588:1: ( ( rule__GroupMember__PostActionAssignment_3 )? )
            // InternalLcDsl.g:3589:2: ( rule__GroupMember__PostActionAssignment_3 )?
            {
             before(grammarAccess.getGroupMemberAccess().getPostActionAssignment_3()); 
            // InternalLcDsl.g:3590:2: ( rule__GroupMember__PostActionAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=62 && LA15_0<=64)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLcDsl.g:3590:3: rule__GroupMember__PostActionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupMember__PostActionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupMemberAccess().getPostActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__3__Impl"


    // $ANTLR start "rule__GroupMember__Group__4"
    // InternalLcDsl.g:3598:1: rule__GroupMember__Group__4 : rule__GroupMember__Group__4__Impl ;
    public final void rule__GroupMember__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3602:1: ( rule__GroupMember__Group__4__Impl )
            // InternalLcDsl.g:3603:2: rule__GroupMember__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupMember__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__4"


    // $ANTLR start "rule__GroupMember__Group__4__Impl"
    // InternalLcDsl.g:3609:1: rule__GroupMember__Group__4__Impl : ( ';' ) ;
    public final void rule__GroupMember__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3613:1: ( ( ';' ) )
            // InternalLcDsl.g:3614:1: ( ';' )
            {
            // InternalLcDsl.g:3614:1: ( ';' )
            // InternalLcDsl.g:3615:2: ';'
            {
             before(grammarAccess.getGroupMemberAccess().getSemicolonKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGroupMemberAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__Group__4__Impl"


    // $ANTLR start "rule__GroupPostLaunchDelay__Group__0"
    // InternalLcDsl.g:3625:1: rule__GroupPostLaunchDelay__Group__0 : rule__GroupPostLaunchDelay__Group__0__Impl rule__GroupPostLaunchDelay__Group__1 ;
    public final void rule__GroupPostLaunchDelay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3629:1: ( rule__GroupPostLaunchDelay__Group__0__Impl rule__GroupPostLaunchDelay__Group__1 )
            // InternalLcDsl.g:3630:2: rule__GroupPostLaunchDelay__Group__0__Impl rule__GroupPostLaunchDelay__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__GroupPostLaunchDelay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchDelay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchDelay__Group__0"


    // $ANTLR start "rule__GroupPostLaunchDelay__Group__0__Impl"
    // InternalLcDsl.g:3637:1: rule__GroupPostLaunchDelay__Group__0__Impl : ( 'delay' ) ;
    public final void rule__GroupPostLaunchDelay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3641:1: ( ( 'delay' ) )
            // InternalLcDsl.g:3642:1: ( 'delay' )
            {
            // InternalLcDsl.g:3642:1: ( 'delay' )
            // InternalLcDsl.g:3643:2: 'delay'
            {
             before(grammarAccess.getGroupPostLaunchDelayAccess().getDelayKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getGroupPostLaunchDelayAccess().getDelayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchDelay__Group__0__Impl"


    // $ANTLR start "rule__GroupPostLaunchDelay__Group__1"
    // InternalLcDsl.g:3652:1: rule__GroupPostLaunchDelay__Group__1 : rule__GroupPostLaunchDelay__Group__1__Impl ;
    public final void rule__GroupPostLaunchDelay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3656:1: ( rule__GroupPostLaunchDelay__Group__1__Impl )
            // InternalLcDsl.g:3657:2: rule__GroupPostLaunchDelay__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchDelay__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchDelay__Group__1"


    // $ANTLR start "rule__GroupPostLaunchDelay__Group__1__Impl"
    // InternalLcDsl.g:3663:1: rule__GroupPostLaunchDelay__Group__1__Impl : ( ( rule__GroupPostLaunchDelay__DelayAssignment_1 ) ) ;
    public final void rule__GroupPostLaunchDelay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3667:1: ( ( ( rule__GroupPostLaunchDelay__DelayAssignment_1 ) ) )
            // InternalLcDsl.g:3668:1: ( ( rule__GroupPostLaunchDelay__DelayAssignment_1 ) )
            {
            // InternalLcDsl.g:3668:1: ( ( rule__GroupPostLaunchDelay__DelayAssignment_1 ) )
            // InternalLcDsl.g:3669:2: ( rule__GroupPostLaunchDelay__DelayAssignment_1 )
            {
             before(grammarAccess.getGroupPostLaunchDelayAccess().getDelayAssignment_1()); 
            // InternalLcDsl.g:3670:2: ( rule__GroupPostLaunchDelay__DelayAssignment_1 )
            // InternalLcDsl.g:3670:3: rule__GroupPostLaunchDelay__DelayAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchDelay__DelayAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupPostLaunchDelayAccess().getDelayAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchDelay__Group__1__Impl"


    // $ANTLR start "rule__GroupPostLaunchRegex__Group__0"
    // InternalLcDsl.g:3679:1: rule__GroupPostLaunchRegex__Group__0 : rule__GroupPostLaunchRegex__Group__0__Impl rule__GroupPostLaunchRegex__Group__1 ;
    public final void rule__GroupPostLaunchRegex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3683:1: ( rule__GroupPostLaunchRegex__Group__0__Impl rule__GroupPostLaunchRegex__Group__1 )
            // InternalLcDsl.g:3684:2: rule__GroupPostLaunchRegex__Group__0__Impl rule__GroupPostLaunchRegex__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__GroupPostLaunchRegex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchRegex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchRegex__Group__0"


    // $ANTLR start "rule__GroupPostLaunchRegex__Group__0__Impl"
    // InternalLcDsl.g:3691:1: rule__GroupPostLaunchRegex__Group__0__Impl : ( 'regex' ) ;
    public final void rule__GroupPostLaunchRegex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3695:1: ( ( 'regex' ) )
            // InternalLcDsl.g:3696:1: ( 'regex' )
            {
            // InternalLcDsl.g:3696:1: ( 'regex' )
            // InternalLcDsl.g:3697:2: 'regex'
            {
             before(grammarAccess.getGroupPostLaunchRegexAccess().getRegexKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getGroupPostLaunchRegexAccess().getRegexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchRegex__Group__0__Impl"


    // $ANTLR start "rule__GroupPostLaunchRegex__Group__1"
    // InternalLcDsl.g:3706:1: rule__GroupPostLaunchRegex__Group__1 : rule__GroupPostLaunchRegex__Group__1__Impl ;
    public final void rule__GroupPostLaunchRegex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3710:1: ( rule__GroupPostLaunchRegex__Group__1__Impl )
            // InternalLcDsl.g:3711:2: rule__GroupPostLaunchRegex__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchRegex__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchRegex__Group__1"


    // $ANTLR start "rule__GroupPostLaunchRegex__Group__1__Impl"
    // InternalLcDsl.g:3717:1: rule__GroupPostLaunchRegex__Group__1__Impl : ( ( rule__GroupPostLaunchRegex__RegexAssignment_1 ) ) ;
    public final void rule__GroupPostLaunchRegex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3721:1: ( ( ( rule__GroupPostLaunchRegex__RegexAssignment_1 ) ) )
            // InternalLcDsl.g:3722:1: ( ( rule__GroupPostLaunchRegex__RegexAssignment_1 ) )
            {
            // InternalLcDsl.g:3722:1: ( ( rule__GroupPostLaunchRegex__RegexAssignment_1 ) )
            // InternalLcDsl.g:3723:2: ( rule__GroupPostLaunchRegex__RegexAssignment_1 )
            {
             before(grammarAccess.getGroupPostLaunchRegexAccess().getRegexAssignment_1()); 
            // InternalLcDsl.g:3724:2: ( rule__GroupPostLaunchRegex__RegexAssignment_1 )
            // InternalLcDsl.g:3724:3: rule__GroupPostLaunchRegex__RegexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchRegex__RegexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupPostLaunchRegexAccess().getRegexAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchRegex__Group__1__Impl"


    // $ANTLR start "rule__GroupPostLaunchWait__Group__0"
    // InternalLcDsl.g:3733:1: rule__GroupPostLaunchWait__Group__0 : rule__GroupPostLaunchWait__Group__0__Impl rule__GroupPostLaunchWait__Group__1 ;
    public final void rule__GroupPostLaunchWait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3737:1: ( rule__GroupPostLaunchWait__Group__0__Impl rule__GroupPostLaunchWait__Group__1 )
            // InternalLcDsl.g:3738:2: rule__GroupPostLaunchWait__Group__0__Impl rule__GroupPostLaunchWait__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__GroupPostLaunchWait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchWait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchWait__Group__0"


    // $ANTLR start "rule__GroupPostLaunchWait__Group__0__Impl"
    // InternalLcDsl.g:3745:1: rule__GroupPostLaunchWait__Group__0__Impl : ( () ) ;
    public final void rule__GroupPostLaunchWait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3749:1: ( ( () ) )
            // InternalLcDsl.g:3750:1: ( () )
            {
            // InternalLcDsl.g:3750:1: ( () )
            // InternalLcDsl.g:3751:2: ()
            {
             before(grammarAccess.getGroupPostLaunchWaitAccess().getGroupPostLaunchWaitAction_0()); 
            // InternalLcDsl.g:3752:2: ()
            // InternalLcDsl.g:3752:3: 
            {
            }

             after(grammarAccess.getGroupPostLaunchWaitAccess().getGroupPostLaunchWaitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchWait__Group__0__Impl"


    // $ANTLR start "rule__GroupPostLaunchWait__Group__1"
    // InternalLcDsl.g:3760:1: rule__GroupPostLaunchWait__Group__1 : rule__GroupPostLaunchWait__Group__1__Impl ;
    public final void rule__GroupPostLaunchWait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3764:1: ( rule__GroupPostLaunchWait__Group__1__Impl )
            // InternalLcDsl.g:3765:2: rule__GroupPostLaunchWait__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupPostLaunchWait__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchWait__Group__1"


    // $ANTLR start "rule__GroupPostLaunchWait__Group__1__Impl"
    // InternalLcDsl.g:3771:1: rule__GroupPostLaunchWait__Group__1__Impl : ( 'wait' ) ;
    public final void rule__GroupPostLaunchWait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3775:1: ( ( 'wait' ) )
            // InternalLcDsl.g:3776:1: ( 'wait' )
            {
            // InternalLcDsl.g:3776:1: ( 'wait' )
            // InternalLcDsl.g:3777:2: 'wait'
            {
             before(grammarAccess.getGroupPostLaunchWaitAccess().getWaitKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getGroupPostLaunchWaitAccess().getWaitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchWait__Group__1__Impl"


    // $ANTLR start "rule__FQName__Group__0"
    // InternalLcDsl.g:3787:1: rule__FQName__Group__0 : rule__FQName__Group__0__Impl rule__FQName__Group__1 ;
    public final void rule__FQName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3791:1: ( rule__FQName__Group__0__Impl rule__FQName__Group__1 )
            // InternalLcDsl.g:3792:2: rule__FQName__Group__0__Impl rule__FQName__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__FQName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQName__Group__0"


    // $ANTLR start "rule__FQName__Group__0__Impl"
    // InternalLcDsl.g:3799:1: rule__FQName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3803:1: ( ( RULE_ID ) )
            // InternalLcDsl.g:3804:1: ( RULE_ID )
            {
            // InternalLcDsl.g:3804:1: ( RULE_ID )
            // InternalLcDsl.g:3805:2: RULE_ID
            {
             before(grammarAccess.getFQNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQName__Group__0__Impl"


    // $ANTLR start "rule__FQName__Group__1"
    // InternalLcDsl.g:3814:1: rule__FQName__Group__1 : rule__FQName__Group__1__Impl ;
    public final void rule__FQName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3818:1: ( rule__FQName__Group__1__Impl )
            // InternalLcDsl.g:3819:2: rule__FQName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQName__Group__1"


    // $ANTLR start "rule__FQName__Group__1__Impl"
    // InternalLcDsl.g:3825:1: rule__FQName__Group__1__Impl : ( ( rule__FQName__Group_1__0 )* ) ;
    public final void rule__FQName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3829:1: ( ( ( rule__FQName__Group_1__0 )* ) )
            // InternalLcDsl.g:3830:1: ( ( rule__FQName__Group_1__0 )* )
            {
            // InternalLcDsl.g:3830:1: ( ( rule__FQName__Group_1__0 )* )
            // InternalLcDsl.g:3831:2: ( rule__FQName__Group_1__0 )*
            {
             before(grammarAccess.getFQNameAccess().getGroup_1()); 
            // InternalLcDsl.g:3832:2: ( rule__FQName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==65) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLcDsl.g:3832:3: rule__FQName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__FQName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFQNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQName__Group__1__Impl"


    // $ANTLR start "rule__FQName__Group_1__0"
    // InternalLcDsl.g:3841:1: rule__FQName__Group_1__0 : rule__FQName__Group_1__0__Impl rule__FQName__Group_1__1 ;
    public final void rule__FQName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3845:1: ( rule__FQName__Group_1__0__Impl rule__FQName__Group_1__1 )
            // InternalLcDsl.g:3846:2: rule__FQName__Group_1__0__Impl rule__FQName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__FQName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQName__Group_1__0"


    // $ANTLR start "rule__FQName__Group_1__0__Impl"
    // InternalLcDsl.g:3853:1: rule__FQName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3857:1: ( ( '.' ) )
            // InternalLcDsl.g:3858:1: ( '.' )
            {
            // InternalLcDsl.g:3858:1: ( '.' )
            // InternalLcDsl.g:3859:2: '.'
            {
             before(grammarAccess.getFQNameAccess().getFullStopKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getFQNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQName__Group_1__0__Impl"


    // $ANTLR start "rule__FQName__Group_1__1"
    // InternalLcDsl.g:3868:1: rule__FQName__Group_1__1 : rule__FQName__Group_1__1__Impl ;
    public final void rule__FQName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3872:1: ( rule__FQName__Group_1__1__Impl )
            // InternalLcDsl.g:3873:2: rule__FQName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQName__Group_1__1"


    // $ANTLR start "rule__FQName__Group_1__1__Impl"
    // InternalLcDsl.g:3879:1: rule__FQName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3883:1: ( ( RULE_ID ) )
            // InternalLcDsl.g:3884:1: ( RULE_ID )
            {
            // InternalLcDsl.g:3884:1: ( RULE_ID )
            // InternalLcDsl.g:3885:2: RULE_ID
            {
             before(grammarAccess.getFQNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQName__Group_1__1__Impl"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_0"
    // InternalLcDsl.g:3895:1: rule__LaunchConfig__UnorderedGroup_0 : ( rule__LaunchConfig__UnorderedGroup_0__0 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
        	
        try {
            // InternalLcDsl.g:3900:1: ( ( rule__LaunchConfig__UnorderedGroup_0__0 )? )
            // InternalLcDsl.g:3901:2: ( rule__LaunchConfig__UnorderedGroup_0__0 )?
            {
            // InternalLcDsl.g:3901:2: ( rule__LaunchConfig__UnorderedGroup_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt17=1;
            }
            else if ( LA17_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt17=1;
            }
            else if ( LA17_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLcDsl.g:3901:2: rule__LaunchConfig__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_0__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_0__Impl"
    // InternalLcDsl.g:3909:1: rule__LaunchConfig__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) ) ) ;
    public final void rule__LaunchConfig__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:3914:1: ( ( ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) ) ) )
            // InternalLcDsl.g:3915:3: ( ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) ) )
            {
            // InternalLcDsl.g:3915:3: ( ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) ) )
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt18=2;
            }
            else if ( LA18_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt18=3;
            }
            else if ( LA18_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt18=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLcDsl.g:3916:3: ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) )
                    {
                    // InternalLcDsl.g:3916:3: ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) )
                    // InternalLcDsl.g:3917:4: {...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalLcDsl.g:3917:108: ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) )
                    // InternalLcDsl.g:3918:5: ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:3924:5: ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) )
                    // InternalLcDsl.g:3925:6: ( rule__LaunchConfig__ExplicitAssignment_0_0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getExplicitAssignment_0_0()); 
                    // InternalLcDsl.g:3926:6: ( rule__LaunchConfig__ExplicitAssignment_0_0 )
                    // InternalLcDsl.g:3926:7: rule__LaunchConfig__ExplicitAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__ExplicitAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getExplicitAssignment_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3931:3: ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) )
                    {
                    // InternalLcDsl.g:3931:3: ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) )
                    // InternalLcDsl.g:3932:4: {...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalLcDsl.g:3932:108: ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) )
                    // InternalLcDsl.g:3933:5: ( ( rule__LaunchConfig__ManualAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:3939:5: ( ( rule__LaunchConfig__ManualAssignment_0_1 ) )
                    // InternalLcDsl.g:3940:6: ( rule__LaunchConfig__ManualAssignment_0_1 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getManualAssignment_0_1()); 
                    // InternalLcDsl.g:3941:6: ( rule__LaunchConfig__ManualAssignment_0_1 )
                    // InternalLcDsl.g:3941:7: rule__LaunchConfig__ManualAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__ManualAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getManualAssignment_0_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3946:3: ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) )
                    {
                    // InternalLcDsl.g:3946:3: ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) )
                    // InternalLcDsl.g:3947:4: {...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2)");
                    }
                    // InternalLcDsl.g:3947:108: ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) )
                    // InternalLcDsl.g:3948:5: ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:3954:5: ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) )
                    // InternalLcDsl.g:3955:6: ( rule__LaunchConfig__ForegroundAssignment_0_2 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getForegroundAssignment_0_2()); 
                    // InternalLcDsl.g:3956:6: ( rule__LaunchConfig__ForegroundAssignment_0_2 )
                    // InternalLcDsl.g:3956:7: rule__LaunchConfig__ForegroundAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__ForegroundAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getForegroundAssignment_0_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3961:3: ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) )
                    {
                    // InternalLcDsl.g:3961:3: ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) )
                    // InternalLcDsl.g:3962:4: {...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3)");
                    }
                    // InternalLcDsl.g:3962:108: ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) )
                    // InternalLcDsl.g:3963:5: ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:3969:5: ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) )
                    // InternalLcDsl.g:3970:6: ( rule__LaunchConfig__NoConsoleAssignment_0_3 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getNoConsoleAssignment_0_3()); 
                    // InternalLcDsl.g:3971:6: ( rule__LaunchConfig__NoConsoleAssignment_0_3 )
                    // InternalLcDsl.g:3971:7: rule__LaunchConfig__NoConsoleAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__NoConsoleAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getNoConsoleAssignment_0_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_0__0"
    // InternalLcDsl.g:3984:1: rule__LaunchConfig__UnorderedGroup_0__0 : rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__1 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3988:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__1 )? )
            // InternalLcDsl.g:3989:2: rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_3);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:3990:2: ( rule__LaunchConfig__UnorderedGroup_0__1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLcDsl.g:3990:2: rule__LaunchConfig__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_0__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0__0"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_0__1"
    // InternalLcDsl.g:3996:1: rule__LaunchConfig__UnorderedGroup_0__1 : rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__2 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4000:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__2 )? )
            // InternalLcDsl.g:4001:2: rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__2 )?
            {
            pushFollow(FOLLOW_3);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:4002:2: ( rule__LaunchConfig__UnorderedGroup_0__2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt20=1;
            }
            else if ( LA20_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLcDsl.g:4002:2: rule__LaunchConfig__UnorderedGroup_0__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_0__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0__1"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_0__2"
    // InternalLcDsl.g:4008:1: rule__LaunchConfig__UnorderedGroup_0__2 : rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__3 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4012:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__3 )? )
            // InternalLcDsl.g:4013:2: rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__3 )?
            {
            pushFollow(FOLLOW_3);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:4014:2: ( rule__LaunchConfig__UnorderedGroup_0__3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLcDsl.g:4014:2: rule__LaunchConfig__UnorderedGroup_0__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_0__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0__2"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_0__3"
    // InternalLcDsl.g:4020:1: rule__LaunchConfig__UnorderedGroup_0__3 : rule__LaunchConfig__UnorderedGroup_0__Impl ;
    public final void rule__LaunchConfig__UnorderedGroup_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4024:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl )
            // InternalLcDsl.g:4025:2: rule__LaunchConfig__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0__3"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6"
    // InternalLcDsl.g:4032:1: rule__LaunchConfig__UnorderedGroup_6 : ( rule__LaunchConfig__UnorderedGroup_6__0 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
        	
        try {
            // InternalLcDsl.g:4037:1: ( ( rule__LaunchConfig__UnorderedGroup_6__0 )? )
            // InternalLcDsl.g:4038:2: ( rule__LaunchConfig__UnorderedGroup_6__0 )?
            {
            // InternalLcDsl.g:4038:2: ( rule__LaunchConfig__UnorderedGroup_6__0 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalLcDsl.g:4038:2: rule__LaunchConfig__UnorderedGroup_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__Impl"
    // InternalLcDsl.g:4046:1: rule__LaunchConfig__UnorderedGroup_6__Impl : ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) ) ;
    public final void rule__LaunchConfig__UnorderedGroup_6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4051:1: ( ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) ) )
            // InternalLcDsl.g:4052:3: ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) )
            {
            // InternalLcDsl.g:4052:3: ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) )
            int alt23=11;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalLcDsl.g:4053:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4053:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) )
                    // InternalLcDsl.g:4054:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0)");
                    }
                    // InternalLcDsl.g:4054:108: ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) )
                    // InternalLcDsl.g:4055:5: ( ( rule__LaunchConfig__Group_6_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4061:5: ( ( rule__LaunchConfig__Group_6_0__0 ) )
                    // InternalLcDsl.g:4062:6: ( rule__LaunchConfig__Group_6_0__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_0()); 
                    // InternalLcDsl.g:4063:6: ( rule__LaunchConfig__Group_6_0__0 )
                    // InternalLcDsl.g:4063:7: rule__LaunchConfig__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getGroup_6_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4068:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4068:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) )
                    // InternalLcDsl.g:4069:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1)");
                    }
                    // InternalLcDsl.g:4069:108: ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) )
                    // InternalLcDsl.g:4070:5: ( ( rule__LaunchConfig__Group_6_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4076:5: ( ( rule__LaunchConfig__Group_6_1__0 ) )
                    // InternalLcDsl.g:4077:6: ( rule__LaunchConfig__Group_6_1__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_1()); 
                    // InternalLcDsl.g:4078:6: ( rule__LaunchConfig__Group_6_1__0 )
                    // InternalLcDsl.g:4078:7: rule__LaunchConfig__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getGroup_6_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:4083:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4083:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) )
                    // InternalLcDsl.g:4084:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2)");
                    }
                    // InternalLcDsl.g:4084:108: ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) )
                    // InternalLcDsl.g:4085:5: ( ( rule__LaunchConfig__Group_6_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4091:5: ( ( rule__LaunchConfig__Group_6_2__0 ) )
                    // InternalLcDsl.g:4092:6: ( rule__LaunchConfig__Group_6_2__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_2()); 
                    // InternalLcDsl.g:4093:6: ( rule__LaunchConfig__Group_6_2__0 )
                    // InternalLcDsl.g:4093:7: rule__LaunchConfig__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getGroup_6_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:4098:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4098:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) )
                    // InternalLcDsl.g:4099:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3)");
                    }
                    // InternalLcDsl.g:4099:108: ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) )
                    // InternalLcDsl.g:4100:5: ( ( rule__LaunchConfig__Group_6_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4106:5: ( ( rule__LaunchConfig__Group_6_3__0 ) )
                    // InternalLcDsl.g:4107:6: ( rule__LaunchConfig__Group_6_3__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_3()); 
                    // InternalLcDsl.g:4108:6: ( rule__LaunchConfig__Group_6_3__0 )
                    // InternalLcDsl.g:4108:7: rule__LaunchConfig__Group_6_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__Group_6_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getGroup_6_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:4113:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4113:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) )
                    // InternalLcDsl.g:4114:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4)");
                    }
                    // InternalLcDsl.g:4114:108: ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) )
                    // InternalLcDsl.g:4115:5: ( ( rule__LaunchConfig__Group_6_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4121:5: ( ( rule__LaunchConfig__Group_6_4__0 ) )
                    // InternalLcDsl.g:4122:6: ( rule__LaunchConfig__Group_6_4__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_4()); 
                    // InternalLcDsl.g:4123:6: ( rule__LaunchConfig__Group_6_4__0 )
                    // InternalLcDsl.g:4123:7: rule__LaunchConfig__Group_6_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__Group_6_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getGroup_6_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:4128:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4128:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) )
                    // InternalLcDsl.g:4129:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5)");
                    }
                    // InternalLcDsl.g:4129:108: ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) )
                    // InternalLcDsl.g:4130:5: ( ( rule__LaunchConfig__Group_6_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4136:5: ( ( rule__LaunchConfig__Group_6_5__0 ) )
                    // InternalLcDsl.g:4137:6: ( rule__LaunchConfig__Group_6_5__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_5()); 
                    // InternalLcDsl.g:4138:6: ( rule__LaunchConfig__Group_6_5__0 )
                    // InternalLcDsl.g:4138:7: rule__LaunchConfig__Group_6_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__Group_6_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getGroup_6_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:4143:3: ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) )
                    {
                    // InternalLcDsl.g:4143:3: ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) )
                    // InternalLcDsl.g:4144:4: {...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6)");
                    }
                    // InternalLcDsl.g:4144:108: ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) )
                    // InternalLcDsl.g:4145:5: ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4151:5: ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) )
                    // InternalLcDsl.g:4152:6: ( rule__LaunchConfig__ApplicationAssignment_6_6 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getApplicationAssignment_6_6()); 
                    // InternalLcDsl.g:4153:6: ( rule__LaunchConfig__ApplicationAssignment_6_6 )
                    // InternalLcDsl.g:4153:7: rule__LaunchConfig__ApplicationAssignment_6_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__ApplicationAssignment_6_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getApplicationAssignment_6_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalLcDsl.g:4158:3: ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) )
                    {
                    // InternalLcDsl.g:4158:3: ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) )
                    // InternalLcDsl.g:4159:4: {...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7)");
                    }
                    // InternalLcDsl.g:4159:108: ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) )
                    // InternalLcDsl.g:4160:5: ( ( rule__LaunchConfig__ProductAssignment_6_7 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4166:5: ( ( rule__LaunchConfig__ProductAssignment_6_7 ) )
                    // InternalLcDsl.g:4167:6: ( rule__LaunchConfig__ProductAssignment_6_7 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getProductAssignment_6_7()); 
                    // InternalLcDsl.g:4168:6: ( rule__LaunchConfig__ProductAssignment_6_7 )
                    // InternalLcDsl.g:4168:7: rule__LaunchConfig__ProductAssignment_6_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__ProductAssignment_6_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getProductAssignment_6_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalLcDsl.g:4173:3: ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) )
                    {
                    // InternalLcDsl.g:4173:3: ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) )
                    // InternalLcDsl.g:4174:4: {...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8)");
                    }
                    // InternalLcDsl.g:4174:108: ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) )
                    // InternalLcDsl.g:4175:5: ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4181:5: ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) )
                    // InternalLcDsl.g:4182:6: ( rule__LaunchConfig__FavoritesAssignment_6_8 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getFavoritesAssignment_6_8()); 
                    // InternalLcDsl.g:4183:6: ( rule__LaunchConfig__FavoritesAssignment_6_8 )
                    // InternalLcDsl.g:4183:7: rule__LaunchConfig__FavoritesAssignment_6_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__FavoritesAssignment_6_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getFavoritesAssignment_6_8()); 

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalLcDsl.g:4188:3: ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) )
                    {
                    // InternalLcDsl.g:4188:3: ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) )
                    // InternalLcDsl.g:4189:4: {...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9)");
                    }
                    // InternalLcDsl.g:4189:108: ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) )
                    // InternalLcDsl.g:4190:5: ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4196:5: ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) )
                    // InternalLcDsl.g:4197:6: ( rule__LaunchConfig__RedirectAssignment_6_9 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getRedirectAssignment_6_9()); 
                    // InternalLcDsl.g:4198:6: ( rule__LaunchConfig__RedirectAssignment_6_9 )
                    // InternalLcDsl.g:4198:7: rule__LaunchConfig__RedirectAssignment_6_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__RedirectAssignment_6_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getRedirectAssignment_6_9()); 

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalLcDsl.g:4203:3: ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) )
                    {
                    // InternalLcDsl.g:4203:3: ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) )
                    // InternalLcDsl.g:4204:4: {...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10)");
                    }
                    // InternalLcDsl.g:4204:109: ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) )
                    // InternalLcDsl.g:4205:5: ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4211:5: ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) )
                    // InternalLcDsl.g:4212:6: ( rule__LaunchConfig__ExecEnvAssignment_6_10 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getExecEnvAssignment_6_10()); 
                    // InternalLcDsl.g:4213:6: ( rule__LaunchConfig__ExecEnvAssignment_6_10 )
                    // InternalLcDsl.g:4213:7: rule__LaunchConfig__ExecEnvAssignment_6_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__ExecEnvAssignment_6_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getExecEnvAssignment_6_10()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__Impl"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__0"
    // InternalLcDsl.g:4226:1: rule__LaunchConfig__UnorderedGroup_6__0 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__1 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4230:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__1 )? )
            // InternalLcDsl.g:4231:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__1 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4232:2: ( rule__LaunchConfig__UnorderedGroup_6__1 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalLcDsl.g:4232:2: rule__LaunchConfig__UnorderedGroup_6__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__0"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__1"
    // InternalLcDsl.g:4238:1: rule__LaunchConfig__UnorderedGroup_6__1 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__2 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4242:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__2 )? )
            // InternalLcDsl.g:4243:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__2 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4244:2: ( rule__LaunchConfig__UnorderedGroup_6__2 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalLcDsl.g:4244:2: rule__LaunchConfig__UnorderedGroup_6__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__1"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__2"
    // InternalLcDsl.g:4250:1: rule__LaunchConfig__UnorderedGroup_6__2 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__3 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4254:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__3 )? )
            // InternalLcDsl.g:4255:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__3 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4256:2: ( rule__LaunchConfig__UnorderedGroup_6__3 )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalLcDsl.g:4256:2: rule__LaunchConfig__UnorderedGroup_6__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__2"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__3"
    // InternalLcDsl.g:4262:1: rule__LaunchConfig__UnorderedGroup_6__3 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__4 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4266:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__4 )? )
            // InternalLcDsl.g:4267:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__4 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4268:2: ( rule__LaunchConfig__UnorderedGroup_6__4 )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalLcDsl.g:4268:2: rule__LaunchConfig__UnorderedGroup_6__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__3"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__4"
    // InternalLcDsl.g:4274:1: rule__LaunchConfig__UnorderedGroup_6__4 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__5 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4278:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__5 )? )
            // InternalLcDsl.g:4279:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__5 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4280:2: ( rule__LaunchConfig__UnorderedGroup_6__5 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalLcDsl.g:4280:2: rule__LaunchConfig__UnorderedGroup_6__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__4"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__5"
    // InternalLcDsl.g:4286:1: rule__LaunchConfig__UnorderedGroup_6__5 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__6 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4290:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__6 )? )
            // InternalLcDsl.g:4291:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__6 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4292:2: ( rule__LaunchConfig__UnorderedGroup_6__6 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalLcDsl.g:4292:2: rule__LaunchConfig__UnorderedGroup_6__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__6();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__5"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__6"
    // InternalLcDsl.g:4298:1: rule__LaunchConfig__UnorderedGroup_6__6 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__7 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4302:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__7 )? )
            // InternalLcDsl.g:4303:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__7 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4304:2: ( rule__LaunchConfig__UnorderedGroup_6__7 )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalLcDsl.g:4304:2: rule__LaunchConfig__UnorderedGroup_6__7
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__7();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__6"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__7"
    // InternalLcDsl.g:4310:1: rule__LaunchConfig__UnorderedGroup_6__7 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__8 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4314:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__8 )? )
            // InternalLcDsl.g:4315:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__8 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4316:2: ( rule__LaunchConfig__UnorderedGroup_6__8 )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalLcDsl.g:4316:2: rule__LaunchConfig__UnorderedGroup_6__8
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__8();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__7"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__8"
    // InternalLcDsl.g:4322:1: rule__LaunchConfig__UnorderedGroup_6__8 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__9 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4326:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__9 )? )
            // InternalLcDsl.g:4327:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__9 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4328:2: ( rule__LaunchConfig__UnorderedGroup_6__9 )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalLcDsl.g:4328:2: rule__LaunchConfig__UnorderedGroup_6__9
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__9();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__8"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__9"
    // InternalLcDsl.g:4334:1: rule__LaunchConfig__UnorderedGroup_6__9 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__10 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4338:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__10 )? )
            // InternalLcDsl.g:4339:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__10 )?
            {
            pushFollow(FOLLOW_38);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4340:2: ( rule__LaunchConfig__UnorderedGroup_6__10 )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalLcDsl.g:4340:2: rule__LaunchConfig__UnorderedGroup_6__10
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__10();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__9"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__10"
    // InternalLcDsl.g:4346:1: rule__LaunchConfig__UnorderedGroup_6__10 : rule__LaunchConfig__UnorderedGroup_6__Impl ;
    public final void rule__LaunchConfig__UnorderedGroup_6__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4350:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl )
            // InternalLcDsl.g:4351:2: rule__LaunchConfig__UnorderedGroup_6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__10"


    // $ANTLR start "rule__Favorites__UnorderedGroup_2"
    // InternalLcDsl.g:4358:1: rule__Favorites__UnorderedGroup_2 : ( rule__Favorites__UnorderedGroup_2__0 )? ;
    public final void rule__Favorites__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getFavoritesAccess().getUnorderedGroup_2());
        	
        try {
            // InternalLcDsl.g:4363:1: ( ( rule__Favorites__UnorderedGroup_2__0 )? )
            // InternalLcDsl.g:4364:2: ( rule__Favorites__UnorderedGroup_2__0 )?
            {
            // InternalLcDsl.g:4364:2: ( rule__Favorites__UnorderedGroup_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLcDsl.g:4364:2: rule__Favorites__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Favorites__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getFavoritesAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__UnorderedGroup_2"


    // $ANTLR start "rule__Favorites__UnorderedGroup_2__Impl"
    // InternalLcDsl.g:4372:1: rule__Favorites__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) ) ) ;
    public final void rule__Favorites__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4377:1: ( ( ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) ) ) )
            // InternalLcDsl.g:4378:3: ( ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) ) )
            {
            // InternalLcDsl.g:4378:3: ( ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalLcDsl.g:4379:3: ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) )
                    {
                    // InternalLcDsl.g:4379:3: ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) )
                    // InternalLcDsl.g:4380:4: {...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Favorites__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalLcDsl.g:4380:105: ( ( ( rule__Favorites__RunAssignment_2_0 ) ) )
                    // InternalLcDsl.g:4381:5: ( ( rule__Favorites__RunAssignment_2_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4387:5: ( ( rule__Favorites__RunAssignment_2_0 ) )
                    // InternalLcDsl.g:4388:6: ( rule__Favorites__RunAssignment_2_0 )
                    {
                     before(grammarAccess.getFavoritesAccess().getRunAssignment_2_0()); 
                    // InternalLcDsl.g:4389:6: ( rule__Favorites__RunAssignment_2_0 )
                    // InternalLcDsl.g:4389:7: rule__Favorites__RunAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Favorites__RunAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFavoritesAccess().getRunAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4394:3: ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) )
                    {
                    // InternalLcDsl.g:4394:3: ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) )
                    // InternalLcDsl.g:4395:4: {...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Favorites__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalLcDsl.g:4395:105: ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) )
                    // InternalLcDsl.g:4396:5: ( ( rule__Favorites__DebugAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4402:5: ( ( rule__Favorites__DebugAssignment_2_1 ) )
                    // InternalLcDsl.g:4403:6: ( rule__Favorites__DebugAssignment_2_1 )
                    {
                     before(grammarAccess.getFavoritesAccess().getDebugAssignment_2_1()); 
                    // InternalLcDsl.g:4404:6: ( rule__Favorites__DebugAssignment_2_1 )
                    // InternalLcDsl.g:4404:7: rule__Favorites__DebugAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Favorites__DebugAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFavoritesAccess().getDebugAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFavoritesAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Favorites__UnorderedGroup_2__0"
    // InternalLcDsl.g:4417:1: rule__Favorites__UnorderedGroup_2__0 : rule__Favorites__UnorderedGroup_2__Impl ( rule__Favorites__UnorderedGroup_2__1 )? ;
    public final void rule__Favorites__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4421:1: ( rule__Favorites__UnorderedGroup_2__Impl ( rule__Favorites__UnorderedGroup_2__1 )? )
            // InternalLcDsl.g:4422:2: rule__Favorites__UnorderedGroup_2__Impl ( rule__Favorites__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_39);
            rule__Favorites__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:4423:2: ( rule__Favorites__UnorderedGroup_2__1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalLcDsl.g:4423:2: rule__Favorites__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Favorites__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__UnorderedGroup_2__0"


    // $ANTLR start "rule__Favorites__UnorderedGroup_2__1"
    // InternalLcDsl.g:4429:1: rule__Favorites__UnorderedGroup_2__1 : rule__Favorites__UnorderedGroup_2__Impl ;
    public final void rule__Favorites__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4433:1: ( rule__Favorites__UnorderedGroup_2__Impl )
            // InternalLcDsl.g:4434:2: rule__Favorites__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Favorites__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__UnorderedGroup_2__1"


    // $ANTLR start "rule__Redirect__UnorderedGroup_2"
    // InternalLcDsl.g:4441:1: rule__Redirect__UnorderedGroup_2 : ( rule__Redirect__UnorderedGroup_2__0 )? ;
    public final void rule__Redirect__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
        	
        try {
            // InternalLcDsl.g:4446:1: ( ( rule__Redirect__UnorderedGroup_2__0 )? )
            // InternalLcDsl.g:4447:2: ( rule__Redirect__UnorderedGroup_2__0 )?
            {
            // InternalLcDsl.g:4447:2: ( rule__Redirect__UnorderedGroup_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 >= 32 && LA37_0 <= 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalLcDsl.g:4447:2: rule__Redirect__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Redirect__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__UnorderedGroup_2"


    // $ANTLR start "rule__Redirect__UnorderedGroup_2__Impl"
    // InternalLcDsl.g:4455:1: rule__Redirect__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__Redirect__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4460:1: ( ( ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) ) ) )
            // InternalLcDsl.g:4461:3: ( ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) ) )
            {
            // InternalLcDsl.g:4461:3: ( ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 >= 32 && LA38_0 <= 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalLcDsl.g:4462:3: ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4462:3: ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) )
                    // InternalLcDsl.g:4463:4: {...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Redirect__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalLcDsl.g:4463:104: ( ( ( rule__Redirect__Group_2_0__0 ) ) )
                    // InternalLcDsl.g:4464:5: ( ( rule__Redirect__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4470:5: ( ( rule__Redirect__Group_2_0__0 ) )
                    // InternalLcDsl.g:4471:6: ( rule__Redirect__Group_2_0__0 )
                    {
                     before(grammarAccess.getRedirectAccess().getGroup_2_0()); 
                    // InternalLcDsl.g:4472:6: ( rule__Redirect__Group_2_0__0 )
                    // InternalLcDsl.g:4472:7: rule__Redirect__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Redirect__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRedirectAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4477:3: ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4477:3: ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) )
                    // InternalLcDsl.g:4478:4: {...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Redirect__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalLcDsl.g:4478:104: ( ( ( rule__Redirect__Group_2_1__0 ) ) )
                    // InternalLcDsl.g:4479:5: ( ( rule__Redirect__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4485:5: ( ( rule__Redirect__Group_2_1__0 ) )
                    // InternalLcDsl.g:4486:6: ( rule__Redirect__Group_2_1__0 )
                    {
                     before(grammarAccess.getRedirectAccess().getGroup_2_1()); 
                    // InternalLcDsl.g:4487:6: ( rule__Redirect__Group_2_1__0 )
                    // InternalLcDsl.g:4487:7: rule__Redirect__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Redirect__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRedirectAccess().getGroup_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Redirect__UnorderedGroup_2__0"
    // InternalLcDsl.g:4500:1: rule__Redirect__UnorderedGroup_2__0 : rule__Redirect__UnorderedGroup_2__Impl ( rule__Redirect__UnorderedGroup_2__1 )? ;
    public final void rule__Redirect__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4504:1: ( rule__Redirect__UnorderedGroup_2__Impl ( rule__Redirect__UnorderedGroup_2__1 )? )
            // InternalLcDsl.g:4505:2: rule__Redirect__UnorderedGroup_2__Impl ( rule__Redirect__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_40);
            rule__Redirect__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:4506:2: ( rule__Redirect__UnorderedGroup_2__1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 >= 32 && LA39_0 <= 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalLcDsl.g:4506:2: rule__Redirect__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Redirect__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__UnorderedGroup_2__0"


    // $ANTLR start "rule__Redirect__UnorderedGroup_2__1"
    // InternalLcDsl.g:4512:1: rule__Redirect__UnorderedGroup_2__1 : rule__Redirect__UnorderedGroup_2__Impl ;
    public final void rule__Redirect__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4516:1: ( rule__Redirect__UnorderedGroup_2__Impl )
            // InternalLcDsl.g:4517:2: rule__Redirect__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__UnorderedGroup_2__1"


    // $ANTLR start "rule__ClearOption__UnorderedGroup_2"
    // InternalLcDsl.g:4524:1: rule__ClearOption__UnorderedGroup_2 : ( rule__ClearOption__UnorderedGroup_2__0 )? ;
    public final void rule__ClearOption__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
        	
        try {
            // InternalLcDsl.g:4529:1: ( ( rule__ClearOption__UnorderedGroup_2__0 )? )
            // InternalLcDsl.g:4530:2: ( rule__ClearOption__UnorderedGroup_2__0 )?
            {
            // InternalLcDsl.g:4530:2: ( rule__ClearOption__UnorderedGroup_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ( LA40_0 == 40 || LA40_0 == 70 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalLcDsl.g:4530:2: rule__ClearOption__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClearOption__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__UnorderedGroup_2"


    // $ANTLR start "rule__ClearOption__UnorderedGroup_2__Impl"
    // InternalLcDsl.g:4538:1: rule__ClearOption__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) ) ) ;
    public final void rule__ClearOption__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4543:1: ( ( ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) ) ) )
            // InternalLcDsl.g:4544:3: ( ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) ) )
            {
            // InternalLcDsl.g:4544:3: ( ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ( LA41_0 == 40 || LA41_0 == 70 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalLcDsl.g:4545:3: ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4545:3: ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) )
                    // InternalLcDsl.g:4546:4: {...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ClearOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalLcDsl.g:4546:107: ( ( ( rule__ClearOption__Group_2_0__0 ) ) )
                    // InternalLcDsl.g:4547:5: ( ( rule__ClearOption__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4553:5: ( ( rule__ClearOption__Group_2_0__0 ) )
                    // InternalLcDsl.g:4554:6: ( rule__ClearOption__Group_2_0__0 )
                    {
                     before(grammarAccess.getClearOptionAccess().getGroup_2_0()); 
                    // InternalLcDsl.g:4555:6: ( rule__ClearOption__Group_2_0__0 )
                    // InternalLcDsl.g:4555:7: rule__ClearOption__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClearOption__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClearOptionAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4560:3: ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) )
                    {
                    // InternalLcDsl.g:4560:3: ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) )
                    // InternalLcDsl.g:4561:4: {...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ClearOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalLcDsl.g:4561:107: ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) )
                    // InternalLcDsl.g:4562:5: ( ( rule__ClearOption__ConfigAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4568:5: ( ( rule__ClearOption__ConfigAssignment_2_1 ) )
                    // InternalLcDsl.g:4569:6: ( rule__ClearOption__ConfigAssignment_2_1 )
                    {
                     before(grammarAccess.getClearOptionAccess().getConfigAssignment_2_1()); 
                    // InternalLcDsl.g:4570:6: ( rule__ClearOption__ConfigAssignment_2_1 )
                    // InternalLcDsl.g:4570:7: rule__ClearOption__ConfigAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClearOption__ConfigAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClearOptionAccess().getConfigAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__ClearOption__UnorderedGroup_2__0"
    // InternalLcDsl.g:4583:1: rule__ClearOption__UnorderedGroup_2__0 : rule__ClearOption__UnorderedGroup_2__Impl ( rule__ClearOption__UnorderedGroup_2__1 )? ;
    public final void rule__ClearOption__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4587:1: ( rule__ClearOption__UnorderedGroup_2__Impl ( rule__ClearOption__UnorderedGroup_2__1 )? )
            // InternalLcDsl.g:4588:2: rule__ClearOption__UnorderedGroup_2__Impl ( rule__ClearOption__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_41);
            rule__ClearOption__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:4589:2: ( rule__ClearOption__UnorderedGroup_2__1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ( LA42_0 == 40 || LA42_0 == 70 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalLcDsl.g:4589:2: rule__ClearOption__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClearOption__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__UnorderedGroup_2__0"


    // $ANTLR start "rule__ClearOption__UnorderedGroup_2__1"
    // InternalLcDsl.g:4595:1: rule__ClearOption__UnorderedGroup_2__1 : rule__ClearOption__UnorderedGroup_2__Impl ;
    public final void rule__ClearOption__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4599:1: ( rule__ClearOption__UnorderedGroup_2__Impl )
            // InternalLcDsl.g:4600:2: rule__ClearOption__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClearOption__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__UnorderedGroup_2__1"


    // $ANTLR start "rule__MemoryOption__UnorderedGroup_2"
    // InternalLcDsl.g:4607:1: rule__MemoryOption__UnorderedGroup_2 : ( rule__MemoryOption__UnorderedGroup_2__0 )? ;
    public final void rule__MemoryOption__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
        	
        try {
            // InternalLcDsl.g:4612:1: ( ( rule__MemoryOption__UnorderedGroup_2__0 )? )
            // InternalLcDsl.g:4613:2: ( rule__MemoryOption__UnorderedGroup_2__0 )?
            {
            // InternalLcDsl.g:4613:2: ( rule__MemoryOption__UnorderedGroup_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalLcDsl.g:4613:2: rule__MemoryOption__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemoryOption__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__UnorderedGroup_2"


    // $ANTLR start "rule__MemoryOption__UnorderedGroup_2__Impl"
    // InternalLcDsl.g:4621:1: rule__MemoryOption__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) ) ) ;
    public final void rule__MemoryOption__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4626:1: ( ( ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) ) ) )
            // InternalLcDsl.g:4627:3: ( ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) ) )
            {
            // InternalLcDsl.g:4627:3: ( ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) ) )
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt44=2;
            }
            else if ( LA44_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                alt44=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalLcDsl.g:4628:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4628:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) )
                    // InternalLcDsl.g:4629:4: {...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MemoryOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalLcDsl.g:4629:108: ( ( ( rule__MemoryOption__Group_2_0__0 ) ) )
                    // InternalLcDsl.g:4630:5: ( ( rule__MemoryOption__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4636:5: ( ( rule__MemoryOption__Group_2_0__0 ) )
                    // InternalLcDsl.g:4637:6: ( rule__MemoryOption__Group_2_0__0 )
                    {
                     before(grammarAccess.getMemoryOptionAccess().getGroup_2_0()); 
                    // InternalLcDsl.g:4638:6: ( rule__MemoryOption__Group_2_0__0 )
                    // InternalLcDsl.g:4638:7: rule__MemoryOption__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemoryOption__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMemoryOptionAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4643:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4643:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) )
                    // InternalLcDsl.g:4644:4: {...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MemoryOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalLcDsl.g:4644:108: ( ( ( rule__MemoryOption__Group_2_1__0 ) ) )
                    // InternalLcDsl.g:4645:5: ( ( rule__MemoryOption__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4651:5: ( ( rule__MemoryOption__Group_2_1__0 ) )
                    // InternalLcDsl.g:4652:6: ( rule__MemoryOption__Group_2_1__0 )
                    {
                     before(grammarAccess.getMemoryOptionAccess().getGroup_2_1()); 
                    // InternalLcDsl.g:4653:6: ( rule__MemoryOption__Group_2_1__0 )
                    // InternalLcDsl.g:4653:7: rule__MemoryOption__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemoryOption__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMemoryOptionAccess().getGroup_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:4658:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4658:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) )
                    // InternalLcDsl.g:4659:4: {...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__MemoryOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalLcDsl.g:4659:108: ( ( ( rule__MemoryOption__Group_2_2__0 ) ) )
                    // InternalLcDsl.g:4660:5: ( ( rule__MemoryOption__Group_2_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4666:5: ( ( rule__MemoryOption__Group_2_2__0 ) )
                    // InternalLcDsl.g:4667:6: ( rule__MemoryOption__Group_2_2__0 )
                    {
                     before(grammarAccess.getMemoryOptionAccess().getGroup_2_2()); 
                    // InternalLcDsl.g:4668:6: ( rule__MemoryOption__Group_2_2__0 )
                    // InternalLcDsl.g:4668:7: rule__MemoryOption__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemoryOption__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMemoryOptionAccess().getGroup_2_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__MemoryOption__UnorderedGroup_2__0"
    // InternalLcDsl.g:4681:1: rule__MemoryOption__UnorderedGroup_2__0 : rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__1 )? ;
    public final void rule__MemoryOption__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4685:1: ( rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__1 )? )
            // InternalLcDsl.g:4686:2: rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_42);
            rule__MemoryOption__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:4687:2: ( rule__MemoryOption__UnorderedGroup_2__1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt45=1;
            }
            else if ( LA45_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalLcDsl.g:4687:2: rule__MemoryOption__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemoryOption__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__UnorderedGroup_2__0"


    // $ANTLR start "rule__MemoryOption__UnorderedGroup_2__1"
    // InternalLcDsl.g:4693:1: rule__MemoryOption__UnorderedGroup_2__1 : rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__2 )? ;
    public final void rule__MemoryOption__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4697:1: ( rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__2 )? )
            // InternalLcDsl.g:4698:2: rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_42);
            rule__MemoryOption__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:4699:2: ( rule__MemoryOption__UnorderedGroup_2__2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalLcDsl.g:4699:2: rule__MemoryOption__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemoryOption__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__UnorderedGroup_2__1"


    // $ANTLR start "rule__MemoryOption__UnorderedGroup_2__2"
    // InternalLcDsl.g:4705:1: rule__MemoryOption__UnorderedGroup_2__2 : rule__MemoryOption__UnorderedGroup_2__Impl ;
    public final void rule__MemoryOption__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4709:1: ( rule__MemoryOption__UnorderedGroup_2__Impl )
            // InternalLcDsl.g:4710:2: rule__MemoryOption__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemoryOption__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__UnorderedGroup_2__2"


    // $ANTLR start "rule__GroupMember__UnorderedGroup_0"
    // InternalLcDsl.g:4717:1: rule__GroupMember__UnorderedGroup_0 : ( rule__GroupMember__UnorderedGroup_0__0 )? ;
    public final void rule__GroupMember__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
        	
        try {
            // InternalLcDsl.g:4722:1: ( ( rule__GroupMember__UnorderedGroup_0__0 )? )
            // InternalLcDsl.g:4723:2: ( rule__GroupMember__UnorderedGroup_0__0 )?
            {
            // InternalLcDsl.g:4723:2: ( rule__GroupMember__UnorderedGroup_0__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 >= 19 && LA47_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalLcDsl.g:4723:2: rule__GroupMember__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupMember__UnorderedGroup_0__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__UnorderedGroup_0"


    // $ANTLR start "rule__GroupMember__UnorderedGroup_0__Impl"
    // InternalLcDsl.g:4731:1: rule__GroupMember__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) ) ) ;
    public final void rule__GroupMember__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4736:1: ( ( ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) ) ) )
            // InternalLcDsl.g:4737:3: ( ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) ) )
            {
            // InternalLcDsl.g:4737:3: ( ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 >= 19 && LA48_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalLcDsl.g:4738:3: ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) )
                    {
                    // InternalLcDsl.g:4738:3: ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) )
                    // InternalLcDsl.g:4739:4: {...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GroupMember__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalLcDsl.g:4739:107: ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) )
                    // InternalLcDsl.g:4740:5: ( ( rule__GroupMember__TypeAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4746:5: ( ( rule__GroupMember__TypeAssignment_0_0 ) )
                    // InternalLcDsl.g:4747:6: ( rule__GroupMember__TypeAssignment_0_0 )
                    {
                     before(grammarAccess.getGroupMemberAccess().getTypeAssignment_0_0()); 
                    // InternalLcDsl.g:4748:6: ( rule__GroupMember__TypeAssignment_0_0 )
                    // InternalLcDsl.g:4748:7: rule__GroupMember__TypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupMember__TypeAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupMemberAccess().getTypeAssignment_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4753:3: ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) )
                    {
                    // InternalLcDsl.g:4753:3: ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) )
                    // InternalLcDsl.g:4754:4: {...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GroupMember__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalLcDsl.g:4754:107: ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) )
                    // InternalLcDsl.g:4755:5: ( ( rule__GroupMember__AdoptAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4761:5: ( ( rule__GroupMember__AdoptAssignment_0_1 ) )
                    // InternalLcDsl.g:4762:6: ( rule__GroupMember__AdoptAssignment_0_1 )
                    {
                     before(grammarAccess.getGroupMemberAccess().getAdoptAssignment_0_1()); 
                    // InternalLcDsl.g:4763:6: ( rule__GroupMember__AdoptAssignment_0_1 )
                    // InternalLcDsl.g:4763:7: rule__GroupMember__AdoptAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupMember__AdoptAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupMemberAccess().getAdoptAssignment_0_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__GroupMember__UnorderedGroup_0__0"
    // InternalLcDsl.g:4776:1: rule__GroupMember__UnorderedGroup_0__0 : rule__GroupMember__UnorderedGroup_0__Impl ( rule__GroupMember__UnorderedGroup_0__1 )? ;
    public final void rule__GroupMember__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4780:1: ( rule__GroupMember__UnorderedGroup_0__Impl ( rule__GroupMember__UnorderedGroup_0__1 )? )
            // InternalLcDsl.g:4781:2: rule__GroupMember__UnorderedGroup_0__Impl ( rule__GroupMember__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_43);
            rule__GroupMember__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:4782:2: ( rule__GroupMember__UnorderedGroup_0__1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 >= 19 && LA49_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalLcDsl.g:4782:2: rule__GroupMember__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupMember__UnorderedGroup_0__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__UnorderedGroup_0__0"


    // $ANTLR start "rule__GroupMember__UnorderedGroup_0__1"
    // InternalLcDsl.g:4788:1: rule__GroupMember__UnorderedGroup_0__1 : rule__GroupMember__UnorderedGroup_0__Impl ;
    public final void rule__GroupMember__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4792:1: ( rule__GroupMember__UnorderedGroup_0__Impl )
            // InternalLcDsl.g:4793:2: rule__GroupMember__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupMember__UnorderedGroup_0__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__UnorderedGroup_0__1"


    // $ANTLR start "rule__LCModel__ConfigurationsAssignment"
    // InternalLcDsl.g:4800:1: rule__LCModel__ConfigurationsAssignment : ( ruleLaunchConfig ) ;
    public final void rule__LCModel__ConfigurationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4804:1: ( ( ruleLaunchConfig ) )
            // InternalLcDsl.g:4805:2: ( ruleLaunchConfig )
            {
            // InternalLcDsl.g:4805:2: ( ruleLaunchConfig )
            // InternalLcDsl.g:4806:3: ruleLaunchConfig
            {
             before(grammarAccess.getLCModelAccess().getConfigurationsLaunchConfigParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLaunchConfig();

            state._fsp--;

             after(grammarAccess.getLCModelAccess().getConfigurationsLaunchConfigParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LCModel__ConfigurationsAssignment"


    // $ANTLR start "rule__LaunchConfig__ExplicitAssignment_0_0"
    // InternalLcDsl.g:4815:1: rule__LaunchConfig__ExplicitAssignment_0_0 : ( ( 'explicit' ) ) ;
    public final void rule__LaunchConfig__ExplicitAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4819:1: ( ( ( 'explicit' ) ) )
            // InternalLcDsl.g:4820:2: ( ( 'explicit' ) )
            {
            // InternalLcDsl.g:4820:2: ( ( 'explicit' ) )
            // InternalLcDsl.g:4821:3: ( 'explicit' )
            {
             before(grammarAccess.getLaunchConfigAccess().getExplicitExplicitKeyword_0_0_0()); 
            // InternalLcDsl.g:4822:3: ( 'explicit' )
            // InternalLcDsl.g:4823:4: 'explicit'
            {
             before(grammarAccess.getLaunchConfigAccess().getExplicitExplicitKeyword_0_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getExplicitExplicitKeyword_0_0_0()); 

            }

             after(grammarAccess.getLaunchConfigAccess().getExplicitExplicitKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__ExplicitAssignment_0_0"


    // $ANTLR start "rule__LaunchConfig__ManualAssignment_0_1"
    // InternalLcDsl.g:4834:1: rule__LaunchConfig__ManualAssignment_0_1 : ( ( 'manual' ) ) ;
    public final void rule__LaunchConfig__ManualAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4838:1: ( ( ( 'manual' ) ) )
            // InternalLcDsl.g:4839:2: ( ( 'manual' ) )
            {
            // InternalLcDsl.g:4839:2: ( ( 'manual' ) )
            // InternalLcDsl.g:4840:3: ( 'manual' )
            {
             before(grammarAccess.getLaunchConfigAccess().getManualManualKeyword_0_1_0()); 
            // InternalLcDsl.g:4841:3: ( 'manual' )
            // InternalLcDsl.g:4842:4: 'manual'
            {
             before(grammarAccess.getLaunchConfigAccess().getManualManualKeyword_0_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getManualManualKeyword_0_1_0()); 

            }

             after(grammarAccess.getLaunchConfigAccess().getManualManualKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__ManualAssignment_0_1"


    // $ANTLR start "rule__LaunchConfig__ForegroundAssignment_0_2"
    // InternalLcDsl.g:4853:1: rule__LaunchConfig__ForegroundAssignment_0_2 : ( ( 'foreground' ) ) ;
    public final void rule__LaunchConfig__ForegroundAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4857:1: ( ( ( 'foreground' ) ) )
            // InternalLcDsl.g:4858:2: ( ( 'foreground' ) )
            {
            // InternalLcDsl.g:4858:2: ( ( 'foreground' ) )
            // InternalLcDsl.g:4859:3: ( 'foreground' )
            {
             before(grammarAccess.getLaunchConfigAccess().getForegroundForegroundKeyword_0_2_0()); 
            // InternalLcDsl.g:4860:3: ( 'foreground' )
            // InternalLcDsl.g:4861:4: 'foreground'
            {
             before(grammarAccess.getLaunchConfigAccess().getForegroundForegroundKeyword_0_2_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getForegroundForegroundKeyword_0_2_0()); 

            }

             after(grammarAccess.getLaunchConfigAccess().getForegroundForegroundKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__ForegroundAssignment_0_2"


    // $ANTLR start "rule__LaunchConfig__NoConsoleAssignment_0_3"
    // InternalLcDsl.g:4872:1: rule__LaunchConfig__NoConsoleAssignment_0_3 : ( ( 'no-console' ) ) ;
    public final void rule__LaunchConfig__NoConsoleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4876:1: ( ( ( 'no-console' ) ) )
            // InternalLcDsl.g:4877:2: ( ( 'no-console' ) )
            {
            // InternalLcDsl.g:4877:2: ( ( 'no-console' ) )
            // InternalLcDsl.g:4878:3: ( 'no-console' )
            {
             before(grammarAccess.getLaunchConfigAccess().getNoConsoleNoConsoleKeyword_0_3_0()); 
            // InternalLcDsl.g:4879:3: ( 'no-console' )
            // InternalLcDsl.g:4880:4: 'no-console'
            {
             before(grammarAccess.getLaunchConfigAccess().getNoConsoleNoConsoleKeyword_0_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getNoConsoleNoConsoleKeyword_0_3_0()); 

            }

             after(grammarAccess.getLaunchConfigAccess().getNoConsoleNoConsoleKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__NoConsoleAssignment_0_3"


    // $ANTLR start "rule__LaunchConfig__TypeAssignment_1"
    // InternalLcDsl.g:4891:1: rule__LaunchConfig__TypeAssignment_1 : ( ruleLaunchConfigType ) ;
    public final void rule__LaunchConfig__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4895:1: ( ( ruleLaunchConfigType ) )
            // InternalLcDsl.g:4896:2: ( ruleLaunchConfigType )
            {
            // InternalLcDsl.g:4896:2: ( ruleLaunchConfigType )
            // InternalLcDsl.g:4897:3: ruleLaunchConfigType
            {
             before(grammarAccess.getLaunchConfigAccess().getTypeLaunchConfigTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLaunchConfigType();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getTypeLaunchConfigTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__TypeAssignment_1"


    // $ANTLR start "rule__LaunchConfig__NameAssignment_3"
    // InternalLcDsl.g:4906:1: rule__LaunchConfig__NameAssignment_3 : ( ruleFQName ) ;
    public final void rule__LaunchConfig__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4910:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:4911:2: ( ruleFQName )
            {
            // InternalLcDsl.g:4911:2: ( ruleFQName )
            // InternalLcDsl.g:4912:3: ruleFQName
            {
             before(grammarAccess.getLaunchConfigAccess().getNameFQNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getNameFQNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__NameAssignment_3"


    // $ANTLR start "rule__LaunchConfig__SuperConfigAssignment_4_1"
    // InternalLcDsl.g:4921:1: rule__LaunchConfig__SuperConfigAssignment_4_1 : ( ( ruleFQName ) ) ;
    public final void rule__LaunchConfig__SuperConfigAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4925:1: ( ( ( ruleFQName ) ) )
            // InternalLcDsl.g:4926:2: ( ( ruleFQName ) )
            {
            // InternalLcDsl.g:4926:2: ( ( ruleFQName ) )
            // InternalLcDsl.g:4927:3: ( ruleFQName )
            {
             before(grammarAccess.getLaunchConfigAccess().getSuperConfigLaunchConfigCrossReference_4_1_0()); 
            // InternalLcDsl.g:4928:3: ( ruleFQName )
            // InternalLcDsl.g:4929:4: ruleFQName
            {
             before(grammarAccess.getLaunchConfigAccess().getSuperConfigLaunchConfigFQNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getSuperConfigLaunchConfigFQNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getLaunchConfigAccess().getSuperConfigLaunchConfigCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__SuperConfigAssignment_4_1"


    // $ANTLR start "rule__LaunchConfig__ClearsAssignment_6_0_0"
    // InternalLcDsl.g:4940:1: rule__LaunchConfig__ClearsAssignment_6_0_0 : ( ruleClearOption ) ;
    public final void rule__LaunchConfig__ClearsAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4944:1: ( ( ruleClearOption ) )
            // InternalLcDsl.g:4945:2: ( ruleClearOption )
            {
            // InternalLcDsl.g:4945:2: ( ruleClearOption )
            // InternalLcDsl.g:4946:3: ruleClearOption
            {
             before(grammarAccess.getLaunchConfigAccess().getClearsClearOptionParserRuleCall_6_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClearOption();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getClearsClearOptionParserRuleCall_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__ClearsAssignment_6_0_0"


    // $ANTLR start "rule__LaunchConfig__WorkspaceAssignment_6_1_1"
    // InternalLcDsl.g:4955:1: rule__LaunchConfig__WorkspaceAssignment_6_1_1 : ( ruleAnyPath ) ;
    public final void rule__LaunchConfig__WorkspaceAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4959:1: ( ( ruleAnyPath ) )
            // InternalLcDsl.g:4960:2: ( ruleAnyPath )
            {
            // InternalLcDsl.g:4960:2: ( ruleAnyPath )
            // InternalLcDsl.g:4961:3: ruleAnyPath
            {
             before(grammarAccess.getLaunchConfigAccess().getWorkspaceAnyPathParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyPath();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getWorkspaceAnyPathParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__WorkspaceAssignment_6_1_1"


    // $ANTLR start "rule__LaunchConfig__WorkingDirAssignment_6_2_1"
    // InternalLcDsl.g:4970:1: rule__LaunchConfig__WorkingDirAssignment_6_2_1 : ( ruleExistingPath ) ;
    public final void rule__LaunchConfig__WorkingDirAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4974:1: ( ( ruleExistingPath ) )
            // InternalLcDsl.g:4975:2: ( ruleExistingPath )
            {
            // InternalLcDsl.g:4975:2: ( ruleExistingPath )
            // InternalLcDsl.g:4976:3: ruleExistingPath
            {
             before(grammarAccess.getLaunchConfigAccess().getWorkingDirExistingPathParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExistingPath();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getWorkingDirExistingPathParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__WorkingDirAssignment_6_2_1"


    // $ANTLR start "rule__LaunchConfig__MemoryAssignment_6_3_0"
    // InternalLcDsl.g:4985:1: rule__LaunchConfig__MemoryAssignment_6_3_0 : ( ruleMemoryOption ) ;
    public final void rule__LaunchConfig__MemoryAssignment_6_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4989:1: ( ( ruleMemoryOption ) )
            // InternalLcDsl.g:4990:2: ( ruleMemoryOption )
            {
            // InternalLcDsl.g:4990:2: ( ruleMemoryOption )
            // InternalLcDsl.g:4991:3: ruleMemoryOption
            {
             before(grammarAccess.getLaunchConfigAccess().getMemoryMemoryOptionParserRuleCall_6_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMemoryOption();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getMemoryMemoryOptionParserRuleCall_6_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__MemoryAssignment_6_3_0"


    // $ANTLR start "rule__LaunchConfig__ProjectAssignment_6_4_1"
    // InternalLcDsl.g:5000:1: rule__LaunchConfig__ProjectAssignment_6_4_1 : ( ruleProject ) ;
    public final void rule__LaunchConfig__ProjectAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5004:1: ( ( ruleProject ) )
            // InternalLcDsl.g:5005:2: ( ruleProject )
            {
            // InternalLcDsl.g:5005:2: ( ruleProject )
            // InternalLcDsl.g:5006:3: ruleProject
            {
             before(grammarAccess.getLaunchConfigAccess().getProjectProjectParserRuleCall_6_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getProjectProjectParserRuleCall_6_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__ProjectAssignment_6_4_1"


    // $ANTLR start "rule__LaunchConfig__MainClassAssignment_6_5_1"
    // InternalLcDsl.g:5015:1: rule__LaunchConfig__MainClassAssignment_6_5_1 : ( ruleJavaType ) ;
    public final void rule__LaunchConfig__MainClassAssignment_6_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5019:1: ( ( ruleJavaType ) )
            // InternalLcDsl.g:5020:2: ( ruleJavaType )
            {
            // InternalLcDsl.g:5020:2: ( ruleJavaType )
            // InternalLcDsl.g:5021:3: ruleJavaType
            {
             before(grammarAccess.getLaunchConfigAccess().getMainClassJavaTypeParserRuleCall_6_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJavaType();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getMainClassJavaTypeParserRuleCall_6_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__MainClassAssignment_6_5_1"


    // $ANTLR start "rule__LaunchConfig__ApplicationAssignment_6_6"
    // InternalLcDsl.g:5030:1: rule__LaunchConfig__ApplicationAssignment_6_6 : ( ruleApplicationExtPoint ) ;
    public final void rule__LaunchConfig__ApplicationAssignment_6_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5034:1: ( ( ruleApplicationExtPoint ) )
            // InternalLcDsl.g:5035:2: ( ruleApplicationExtPoint )
            {
            // InternalLcDsl.g:5035:2: ( ruleApplicationExtPoint )
            // InternalLcDsl.g:5036:3: ruleApplicationExtPoint
            {
             before(grammarAccess.getLaunchConfigAccess().getApplicationApplicationExtPointParserRuleCall_6_6_0()); 
            pushFollow(FOLLOW_2);
            ruleApplicationExtPoint();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getApplicationApplicationExtPointParserRuleCall_6_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__ApplicationAssignment_6_6"


    // $ANTLR start "rule__LaunchConfig__ProductAssignment_6_7"
    // InternalLcDsl.g:5045:1: rule__LaunchConfig__ProductAssignment_6_7 : ( ruleProductExtPoint ) ;
    public final void rule__LaunchConfig__ProductAssignment_6_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5049:1: ( ( ruleProductExtPoint ) )
            // InternalLcDsl.g:5050:2: ( ruleProductExtPoint )
            {
            // InternalLcDsl.g:5050:2: ( ruleProductExtPoint )
            // InternalLcDsl.g:5051:3: ruleProductExtPoint
            {
             before(grammarAccess.getLaunchConfigAccess().getProductProductExtPointParserRuleCall_6_7_0()); 
            pushFollow(FOLLOW_2);
            ruleProductExtPoint();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getProductProductExtPointParserRuleCall_6_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__ProductAssignment_6_7"


    // $ANTLR start "rule__LaunchConfig__FavoritesAssignment_6_8"
    // InternalLcDsl.g:5060:1: rule__LaunchConfig__FavoritesAssignment_6_8 : ( ruleFavorites ) ;
    public final void rule__LaunchConfig__FavoritesAssignment_6_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5064:1: ( ( ruleFavorites ) )
            // InternalLcDsl.g:5065:2: ( ruleFavorites )
            {
            // InternalLcDsl.g:5065:2: ( ruleFavorites )
            // InternalLcDsl.g:5066:3: ruleFavorites
            {
             before(grammarAccess.getLaunchConfigAccess().getFavoritesFavoritesParserRuleCall_6_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFavorites();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getFavoritesFavoritesParserRuleCall_6_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__FavoritesAssignment_6_8"


    // $ANTLR start "rule__LaunchConfig__RedirectAssignment_6_9"
    // InternalLcDsl.g:5075:1: rule__LaunchConfig__RedirectAssignment_6_9 : ( ruleRedirect ) ;
    public final void rule__LaunchConfig__RedirectAssignment_6_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5079:1: ( ( ruleRedirect ) )
            // InternalLcDsl.g:5080:2: ( ruleRedirect )
            {
            // InternalLcDsl.g:5080:2: ( ruleRedirect )
            // InternalLcDsl.g:5081:3: ruleRedirect
            {
             before(grammarAccess.getLaunchConfigAccess().getRedirectRedirectParserRuleCall_6_9_0()); 
            pushFollow(FOLLOW_2);
            ruleRedirect();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getRedirectRedirectParserRuleCall_6_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__RedirectAssignment_6_9"


    // $ANTLR start "rule__LaunchConfig__ExecEnvAssignment_6_10"
    // InternalLcDsl.g:5090:1: rule__LaunchConfig__ExecEnvAssignment_6_10 : ( ruleExecutionEnvironment ) ;
    public final void rule__LaunchConfig__ExecEnvAssignment_6_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5094:1: ( ( ruleExecutionEnvironment ) )
            // InternalLcDsl.g:5095:2: ( ruleExecutionEnvironment )
            {
            // InternalLcDsl.g:5095:2: ( ruleExecutionEnvironment )
            // InternalLcDsl.g:5096:3: ruleExecutionEnvironment
            {
             before(grammarAccess.getLaunchConfigAccess().getExecEnvExecutionEnvironmentParserRuleCall_6_10_0()); 
            pushFollow(FOLLOW_2);
            ruleExecutionEnvironment();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getExecEnvExecutionEnvironmentParserRuleCall_6_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__ExecEnvAssignment_6_10"


    // $ANTLR start "rule__LaunchConfig__PluginsAssignment_7_0"
    // InternalLcDsl.g:5105:1: rule__LaunchConfig__PluginsAssignment_7_0 : ( ruleAddPlugin ) ;
    public final void rule__LaunchConfig__PluginsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5109:1: ( ( ruleAddPlugin ) )
            // InternalLcDsl.g:5110:2: ( ruleAddPlugin )
            {
            // InternalLcDsl.g:5110:2: ( ruleAddPlugin )
            // InternalLcDsl.g:5111:3: ruleAddPlugin
            {
             before(grammarAccess.getLaunchConfigAccess().getPluginsAddPluginParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAddPlugin();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getPluginsAddPluginParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__PluginsAssignment_7_0"


    // $ANTLR start "rule__LaunchConfig__IgnoreAssignment_7_1"
    // InternalLcDsl.g:5120:1: rule__LaunchConfig__IgnoreAssignment_7_1 : ( ruleIgnorePlugin ) ;
    public final void rule__LaunchConfig__IgnoreAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5124:1: ( ( ruleIgnorePlugin ) )
            // InternalLcDsl.g:5125:2: ( ruleIgnorePlugin )
            {
            // InternalLcDsl.g:5125:2: ( ruleIgnorePlugin )
            // InternalLcDsl.g:5126:3: ruleIgnorePlugin
            {
             before(grammarAccess.getLaunchConfigAccess().getIgnoreIgnorePluginParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIgnorePlugin();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getIgnoreIgnorePluginParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__IgnoreAssignment_7_1"


    // $ANTLR start "rule__LaunchConfig__GroupMembersAssignment_7_2"
    // InternalLcDsl.g:5135:1: rule__LaunchConfig__GroupMembersAssignment_7_2 : ( ruleGroupMember ) ;
    public final void rule__LaunchConfig__GroupMembersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5139:1: ( ( ruleGroupMember ) )
            // InternalLcDsl.g:5140:2: ( ruleGroupMember )
            {
            // InternalLcDsl.g:5140:2: ( ruleGroupMember )
            // InternalLcDsl.g:5141:3: ruleGroupMember
            {
             before(grammarAccess.getLaunchConfigAccess().getGroupMembersGroupMemberParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupMember();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getGroupMembersGroupMemberParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__GroupMembersAssignment_7_2"


    // $ANTLR start "rule__LaunchConfig__VmArgsAssignment_7_3"
    // InternalLcDsl.g:5150:1: rule__LaunchConfig__VmArgsAssignment_7_3 : ( ruleVmArgument ) ;
    public final void rule__LaunchConfig__VmArgsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5154:1: ( ( ruleVmArgument ) )
            // InternalLcDsl.g:5155:2: ( ruleVmArgument )
            {
            // InternalLcDsl.g:5155:2: ( ruleVmArgument )
            // InternalLcDsl.g:5156:3: ruleVmArgument
            {
             before(grammarAccess.getLaunchConfigAccess().getVmArgsVmArgumentParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVmArgument();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getVmArgsVmArgumentParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__VmArgsAssignment_7_3"


    // $ANTLR start "rule__LaunchConfig__ProgArgsAssignment_7_4"
    // InternalLcDsl.g:5165:1: rule__LaunchConfig__ProgArgsAssignment_7_4 : ( ruleProgramArgument ) ;
    public final void rule__LaunchConfig__ProgArgsAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5169:1: ( ( ruleProgramArgument ) )
            // InternalLcDsl.g:5170:2: ( ruleProgramArgument )
            {
            // InternalLcDsl.g:5170:2: ( ruleProgramArgument )
            // InternalLcDsl.g:5171:3: ruleProgramArgument
            {
             before(grammarAccess.getLaunchConfigAccess().getProgArgsProgramArgumentParserRuleCall_7_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProgramArgument();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getProgArgsProgramArgumentParserRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__ProgArgsAssignment_7_4"


    // $ANTLR start "rule__LaunchConfig__EnvVarsAssignment_7_5"
    // InternalLcDsl.g:5180:1: rule__LaunchConfig__EnvVarsAssignment_7_5 : ( ruleEnvironmentVariable ) ;
    public final void rule__LaunchConfig__EnvVarsAssignment_7_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5184:1: ( ( ruleEnvironmentVariable ) )
            // InternalLcDsl.g:5185:2: ( ruleEnvironmentVariable )
            {
            // InternalLcDsl.g:5185:2: ( ruleEnvironmentVariable )
            // InternalLcDsl.g:5186:3: ruleEnvironmentVariable
            {
             before(grammarAccess.getLaunchConfigAccess().getEnvVarsEnvironmentVariableParserRuleCall_7_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentVariable();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getEnvVarsEnvironmentVariableParserRuleCall_7_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LaunchConfig__EnvVarsAssignment_7_5"


    // $ANTLR start "rule__AddPlugin__PluginAssignment_1"
    // InternalLcDsl.g:5195:1: rule__AddPlugin__PluginAssignment_1 : ( rulePlugin ) ;
    public final void rule__AddPlugin__PluginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5199:1: ( ( rulePlugin ) )
            // InternalLcDsl.g:5200:2: ( rulePlugin )
            {
            // InternalLcDsl.g:5200:2: ( rulePlugin )
            // InternalLcDsl.g:5201:3: rulePlugin
            {
             before(grammarAccess.getAddPluginAccess().getPluginPluginParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlugin();

            state._fsp--;

             after(grammarAccess.getAddPluginAccess().getPluginPluginParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPlugin__PluginAssignment_1"


    // $ANTLR start "rule__IgnorePlugin__PluginAssignment_1"
    // InternalLcDsl.g:5210:1: rule__IgnorePlugin__PluginAssignment_1 : ( rulePlugin ) ;
    public final void rule__IgnorePlugin__PluginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5214:1: ( ( rulePlugin ) )
            // InternalLcDsl.g:5215:2: ( rulePlugin )
            {
            // InternalLcDsl.g:5215:2: ( rulePlugin )
            // InternalLcDsl.g:5216:3: rulePlugin
            {
             before(grammarAccess.getIgnorePluginAccess().getPluginPluginParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlugin();

            state._fsp--;

             after(grammarAccess.getIgnorePluginAccess().getPluginPluginParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnorePlugin__PluginAssignment_1"


    // $ANTLR start "rule__VmArgument__ArgumentsAssignment_2"
    // InternalLcDsl.g:5225:1: rule__VmArgument__ArgumentsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VmArgument__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5229:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:5230:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:5230:2: ( RULE_STRING )
            // InternalLcDsl.g:5231:3: RULE_STRING
            {
             before(grammarAccess.getVmArgumentAccess().getArgumentsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVmArgumentAccess().getArgumentsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VmArgument__ArgumentsAssignment_2"


    // $ANTLR start "rule__ProgramArgument__ArgumentsAssignment_2"
    // InternalLcDsl.g:5240:1: rule__ProgramArgument__ArgumentsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ProgramArgument__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5244:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:5245:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:5245:2: ( RULE_STRING )
            // InternalLcDsl.g:5246:3: RULE_STRING
            {
             before(grammarAccess.getProgramArgumentAccess().getArgumentsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProgramArgumentAccess().getArgumentsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramArgument__ArgumentsAssignment_2"


    // $ANTLR start "rule__EnvironmentVariable__NameAssignment_2"
    // InternalLcDsl.g:5255:1: rule__EnvironmentVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnvironmentVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5259:1: ( ( RULE_ID ) )
            // InternalLcDsl.g:5260:2: ( RULE_ID )
            {
            // InternalLcDsl.g:5260:2: ( RULE_ID )
            // InternalLcDsl.g:5261:3: RULE_ID
            {
             before(grammarAccess.getEnvironmentVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnvironmentVariableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__NameAssignment_2"


    // $ANTLR start "rule__EnvironmentVariable__ValueAssignment_4"
    // InternalLcDsl.g:5270:1: rule__EnvironmentVariable__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EnvironmentVariable__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5274:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:5275:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:5275:2: ( RULE_STRING )
            // InternalLcDsl.g:5276:3: RULE_STRING
            {
             before(grammarAccess.getEnvironmentVariableAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnvironmentVariableAccess().getValueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentVariable__ValueAssignment_4"


    // $ANTLR start "rule__ApplicationExtPoint__NameAssignment_1"
    // InternalLcDsl.g:5285:1: rule__ApplicationExtPoint__NameAssignment_1 : ( ruleFQName ) ;
    public final void rule__ApplicationExtPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5289:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:5290:2: ( ruleFQName )
            {
            // InternalLcDsl.g:5290:2: ( ruleFQName )
            // InternalLcDsl.g:5291:3: ruleFQName
            {
             before(grammarAccess.getApplicationExtPointAccess().getNameFQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getApplicationExtPointAccess().getNameFQNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationExtPoint__NameAssignment_1"


    // $ANTLR start "rule__ProductExtPoint__NameAssignment_1"
    // InternalLcDsl.g:5300:1: rule__ProductExtPoint__NameAssignment_1 : ( ruleFQName ) ;
    public final void rule__ProductExtPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5304:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:5305:2: ( ruleFQName )
            {
            // InternalLcDsl.g:5305:2: ( ruleFQName )
            // InternalLcDsl.g:5306:3: ruleFQName
            {
             before(grammarAccess.getProductExtPointAccess().getNameFQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getProductExtPointAccess().getNameFQNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductExtPoint__NameAssignment_1"


    // $ANTLR start "rule__Favorites__RunAssignment_2_0"
    // InternalLcDsl.g:5315:1: rule__Favorites__RunAssignment_2_0 : ( ( 'run' ) ) ;
    public final void rule__Favorites__RunAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5319:1: ( ( ( 'run' ) ) )
            // InternalLcDsl.g:5320:2: ( ( 'run' ) )
            {
            // InternalLcDsl.g:5320:2: ( ( 'run' ) )
            // InternalLcDsl.g:5321:3: ( 'run' )
            {
             before(grammarAccess.getFavoritesAccess().getRunRunKeyword_2_0_0()); 
            // InternalLcDsl.g:5322:3: ( 'run' )
            // InternalLcDsl.g:5323:4: 'run'
            {
             before(grammarAccess.getFavoritesAccess().getRunRunKeyword_2_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFavoritesAccess().getRunRunKeyword_2_0_0()); 

            }

             after(grammarAccess.getFavoritesAccess().getRunRunKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__RunAssignment_2_0"


    // $ANTLR start "rule__Favorites__DebugAssignment_2_1"
    // InternalLcDsl.g:5334:1: rule__Favorites__DebugAssignment_2_1 : ( ( 'debug' ) ) ;
    public final void rule__Favorites__DebugAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5338:1: ( ( ( 'debug' ) ) )
            // InternalLcDsl.g:5339:2: ( ( 'debug' ) )
            {
            // InternalLcDsl.g:5339:2: ( ( 'debug' ) )
            // InternalLcDsl.g:5340:3: ( 'debug' )
            {
             before(grammarAccess.getFavoritesAccess().getDebugDebugKeyword_2_1_0()); 
            // InternalLcDsl.g:5341:3: ( 'debug' )
            // InternalLcDsl.g:5342:4: 'debug'
            {
             before(grammarAccess.getFavoritesAccess().getDebugDebugKeyword_2_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFavoritesAccess().getDebugDebugKeyword_2_1_0()); 

            }

             after(grammarAccess.getFavoritesAccess().getDebugDebugKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Favorites__DebugAssignment_2_1"


    // $ANTLR start "rule__Redirect__OutWhichAssignment_2_0_0"
    // InternalLcDsl.g:5353:1: rule__Redirect__OutWhichAssignment_2_0_0 : ( ruleOutputStream ) ;
    public final void rule__Redirect__OutWhichAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5357:1: ( ( ruleOutputStream ) )
            // InternalLcDsl.g:5358:2: ( ruleOutputStream )
            {
            // InternalLcDsl.g:5358:2: ( ruleOutputStream )
            // InternalLcDsl.g:5359:3: ruleOutputStream
            {
             before(grammarAccess.getRedirectAccess().getOutWhichOutputStreamEnumRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputStream();

            state._fsp--;

             after(grammarAccess.getRedirectAccess().getOutWhichOutputStreamEnumRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__OutWhichAssignment_2_0_0"


    // $ANTLR start "rule__Redirect__OutFileAssignment_2_0_2"
    // InternalLcDsl.g:5368:1: rule__Redirect__OutFileAssignment_2_0_2 : ( ruleAnyPath ) ;
    public final void rule__Redirect__OutFileAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5372:1: ( ( ruleAnyPath ) )
            // InternalLcDsl.g:5373:2: ( ruleAnyPath )
            {
            // InternalLcDsl.g:5373:2: ( ruleAnyPath )
            // InternalLcDsl.g:5374:3: ruleAnyPath
            {
             before(grammarAccess.getRedirectAccess().getOutFileAnyPathParserRuleCall_2_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyPath();

            state._fsp--;

             after(grammarAccess.getRedirectAccess().getOutFileAnyPathParserRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__OutFileAssignment_2_0_2"


    // $ANTLR start "rule__Redirect__InWhichAssignment_2_1_0"
    // InternalLcDsl.g:5383:1: rule__Redirect__InWhichAssignment_2_1_0 : ( ruleInputStream ) ;
    public final void rule__Redirect__InWhichAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5387:1: ( ( ruleInputStream ) )
            // InternalLcDsl.g:5388:2: ( ruleInputStream )
            {
            // InternalLcDsl.g:5388:2: ( ruleInputStream )
            // InternalLcDsl.g:5389:3: ruleInputStream
            {
             before(grammarAccess.getRedirectAccess().getInWhichInputStreamEnumRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInputStream();

            state._fsp--;

             after(grammarAccess.getRedirectAccess().getInWhichInputStreamEnumRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__InWhichAssignment_2_1_0"


    // $ANTLR start "rule__Redirect__InFileAssignment_2_1_2"
    // InternalLcDsl.g:5398:1: rule__Redirect__InFileAssignment_2_1_2 : ( ruleExistingPath ) ;
    public final void rule__Redirect__InFileAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5402:1: ( ( ruleExistingPath ) )
            // InternalLcDsl.g:5403:2: ( ruleExistingPath )
            {
            // InternalLcDsl.g:5403:2: ( ruleExistingPath )
            // InternalLcDsl.g:5404:3: ruleExistingPath
            {
             before(grammarAccess.getRedirectAccess().getInFileExistingPathParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExistingPath();

            state._fsp--;

             after(grammarAccess.getRedirectAccess().getInFileExistingPathParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redirect__InFileAssignment_2_1_2"


    // $ANTLR start "rule__ExecutionEnvironment__NameAssignment_1"
    // InternalLcDsl.g:5413:1: rule__ExecutionEnvironment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExecutionEnvironment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5417:1: ( ( RULE_ID ) )
            // InternalLcDsl.g:5418:2: ( RULE_ID )
            {
            // InternalLcDsl.g:5418:2: ( RULE_ID )
            // InternalLcDsl.g:5419:3: RULE_ID
            {
             before(grammarAccess.getExecutionEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExecutionEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionEnvironment__NameAssignment_1"


    // $ANTLR start "rule__ExistingPath__NameAssignment"
    // InternalLcDsl.g:5428:1: rule__ExistingPath__NameAssignment : ( RULE_STRING ) ;
    public final void rule__ExistingPath__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5432:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:5433:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:5433:2: ( RULE_STRING )
            // InternalLcDsl.g:5434:3: RULE_STRING
            {
             before(grammarAccess.getExistingPathAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExistingPathAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistingPath__NameAssignment"


    // $ANTLR start "rule__AnyPath__NameAssignment"
    // InternalLcDsl.g:5443:1: rule__AnyPath__NameAssignment : ( RULE_STRING ) ;
    public final void rule__AnyPath__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5447:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:5448:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:5448:2: ( RULE_STRING )
            // InternalLcDsl.g:5449:3: RULE_STRING
            {
             before(grammarAccess.getAnyPathAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnyPathAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyPath__NameAssignment"


    // $ANTLR start "rule__Plugin__NameAssignment_0"
    // InternalLcDsl.g:5458:1: rule__Plugin__NameAssignment_0 : ( ruleFQName ) ;
    public final void rule__Plugin__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5462:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:5463:2: ( ruleFQName )
            {
            // InternalLcDsl.g:5463:2: ( ruleFQName )
            // InternalLcDsl.g:5464:3: ruleFQName
            {
             before(grammarAccess.getPluginAccess().getNameFQNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getNameFQNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__NameAssignment_0"


    // $ANTLR start "rule__Plugin__VersionAssignment_1"
    // InternalLcDsl.g:5473:1: rule__Plugin__VersionAssignment_1 : ( RULE_VERSION ) ;
    public final void rule__Plugin__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5477:1: ( ( RULE_VERSION ) )
            // InternalLcDsl.g:5478:2: ( RULE_VERSION )
            {
            // InternalLcDsl.g:5478:2: ( RULE_VERSION )
            // InternalLcDsl.g:5479:3: RULE_VERSION
            {
             before(grammarAccess.getPluginAccess().getVersionVERSIONTerminalRuleCall_1_0()); 
            match(input,RULE_VERSION,FOLLOW_2); 
             after(grammarAccess.getPluginAccess().getVersionVERSIONTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plugin__VersionAssignment_1"


    // $ANTLR start "rule__Project__NameAssignment"
    // InternalLcDsl.g:5488:1: rule__Project__NameAssignment : ( ruleFQName ) ;
    public final void rule__Project__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5492:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:5493:2: ( ruleFQName )
            {
            // InternalLcDsl.g:5493:2: ( ruleFQName )
            // InternalLcDsl.g:5494:3: ruleFQName
            {
             before(grammarAccess.getProjectAccess().getNameFQNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getNameFQNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment"


    // $ANTLR start "rule__JavaType__NameAssignment"
    // InternalLcDsl.g:5503:1: rule__JavaType__NameAssignment : ( ruleFQName ) ;
    public final void rule__JavaType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5507:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:5508:2: ( ruleFQName )
            {
            // InternalLcDsl.g:5508:2: ( ruleFQName )
            // InternalLcDsl.g:5509:3: ruleFQName
            {
             before(grammarAccess.getJavaTypeAccess().getNameFQNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getJavaTypeAccess().getNameFQNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaType__NameAssignment"


    // $ANTLR start "rule__ClearOption__WorkspaceAssignment_2_0_0_0"
    // InternalLcDsl.g:5518:1: rule__ClearOption__WorkspaceAssignment_2_0_0_0 : ( ( 'workspace' ) ) ;
    public final void rule__ClearOption__WorkspaceAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5522:1: ( ( ( 'workspace' ) ) )
            // InternalLcDsl.g:5523:2: ( ( 'workspace' ) )
            {
            // InternalLcDsl.g:5523:2: ( ( 'workspace' ) )
            // InternalLcDsl.g:5524:3: ( 'workspace' )
            {
             before(grammarAccess.getClearOptionAccess().getWorkspaceWorkspaceKeyword_2_0_0_0_0()); 
            // InternalLcDsl.g:5525:3: ( 'workspace' )
            // InternalLcDsl.g:5526:4: 'workspace'
            {
             before(grammarAccess.getClearOptionAccess().getWorkspaceWorkspaceKeyword_2_0_0_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClearOptionAccess().getWorkspaceWorkspaceKeyword_2_0_0_0_0()); 

            }

             after(grammarAccess.getClearOptionAccess().getWorkspaceWorkspaceKeyword_2_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__WorkspaceAssignment_2_0_0_0"


    // $ANTLR start "rule__ClearOption__LogAssignment_2_0_0_1"
    // InternalLcDsl.g:5537:1: rule__ClearOption__LogAssignment_2_0_0_1 : ( ( 'log' ) ) ;
    public final void rule__ClearOption__LogAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5541:1: ( ( ( 'log' ) ) )
            // InternalLcDsl.g:5542:2: ( ( 'log' ) )
            {
            // InternalLcDsl.g:5542:2: ( ( 'log' ) )
            // InternalLcDsl.g:5543:3: ( 'log' )
            {
             before(grammarAccess.getClearOptionAccess().getLogLogKeyword_2_0_0_1_0()); 
            // InternalLcDsl.g:5544:3: ( 'log' )
            // InternalLcDsl.g:5545:4: 'log'
            {
             before(grammarAccess.getClearOptionAccess().getLogLogKeyword_2_0_0_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getClearOptionAccess().getLogLogKeyword_2_0_0_1_0()); 

            }

             after(grammarAccess.getClearOptionAccess().getLogLogKeyword_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__LogAssignment_2_0_0_1"


    // $ANTLR start "rule__ClearOption__NoAskClearAssignment_2_0_1"
    // InternalLcDsl.g:5556:1: rule__ClearOption__NoAskClearAssignment_2_0_1 : ( ( '!' ) ) ;
    public final void rule__ClearOption__NoAskClearAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5560:1: ( ( ( '!' ) ) )
            // InternalLcDsl.g:5561:2: ( ( '!' ) )
            {
            // InternalLcDsl.g:5561:2: ( ( '!' ) )
            // InternalLcDsl.g:5562:3: ( '!' )
            {
             before(grammarAccess.getClearOptionAccess().getNoAskClearExclamationMarkKeyword_2_0_1_0()); 
            // InternalLcDsl.g:5563:3: ( '!' )
            // InternalLcDsl.g:5564:4: '!'
            {
             before(grammarAccess.getClearOptionAccess().getNoAskClearExclamationMarkKeyword_2_0_1_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getClearOptionAccess().getNoAskClearExclamationMarkKeyword_2_0_1_0()); 

            }

             after(grammarAccess.getClearOptionAccess().getNoAskClearExclamationMarkKeyword_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__NoAskClearAssignment_2_0_1"


    // $ANTLR start "rule__ClearOption__ConfigAssignment_2_1"
    // InternalLcDsl.g:5575:1: rule__ClearOption__ConfigAssignment_2_1 : ( ( 'config' ) ) ;
    public final void rule__ClearOption__ConfigAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5579:1: ( ( ( 'config' ) ) )
            // InternalLcDsl.g:5580:2: ( ( 'config' ) )
            {
            // InternalLcDsl.g:5580:2: ( ( 'config' ) )
            // InternalLcDsl.g:5581:3: ( 'config' )
            {
             before(grammarAccess.getClearOptionAccess().getConfigConfigKeyword_2_1_0()); 
            // InternalLcDsl.g:5582:3: ( 'config' )
            // InternalLcDsl.g:5583:4: 'config'
            {
             before(grammarAccess.getClearOptionAccess().getConfigConfigKeyword_2_1_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getClearOptionAccess().getConfigConfigKeyword_2_1_0()); 

            }

             after(grammarAccess.getClearOptionAccess().getConfigConfigKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearOption__ConfigAssignment_2_1"


    // $ANTLR start "rule__MemoryOption__MinAssignment_2_0_2"
    // InternalLcDsl.g:5594:1: rule__MemoryOption__MinAssignment_2_0_2 : ( RULE_INT ) ;
    public final void rule__MemoryOption__MinAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5598:1: ( ( RULE_INT ) )
            // InternalLcDsl.g:5599:2: ( RULE_INT )
            {
            // InternalLcDsl.g:5599:2: ( RULE_INT )
            // InternalLcDsl.g:5600:3: RULE_INT
            {
             before(grammarAccess.getMemoryOptionAccess().getMinINTTerminalRuleCall_2_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getMinINTTerminalRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__MinAssignment_2_0_2"


    // $ANTLR start "rule__MemoryOption__MinUnitAssignment_2_0_3"
    // InternalLcDsl.g:5609:1: rule__MemoryOption__MinUnitAssignment_2_0_3 : ( ruleMemoryUnit ) ;
    public final void rule__MemoryOption__MinUnitAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5613:1: ( ( ruleMemoryUnit ) )
            // InternalLcDsl.g:5614:2: ( ruleMemoryUnit )
            {
            // InternalLcDsl.g:5614:2: ( ruleMemoryUnit )
            // InternalLcDsl.g:5615:3: ruleMemoryUnit
            {
             before(grammarAccess.getMemoryOptionAccess().getMinUnitMemoryUnitEnumRuleCall_2_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMemoryUnit();

            state._fsp--;

             after(grammarAccess.getMemoryOptionAccess().getMinUnitMemoryUnitEnumRuleCall_2_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__MinUnitAssignment_2_0_3"


    // $ANTLR start "rule__MemoryOption__MaxAssignment_2_1_2"
    // InternalLcDsl.g:5624:1: rule__MemoryOption__MaxAssignment_2_1_2 : ( RULE_INT ) ;
    public final void rule__MemoryOption__MaxAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5628:1: ( ( RULE_INT ) )
            // InternalLcDsl.g:5629:2: ( RULE_INT )
            {
            // InternalLcDsl.g:5629:2: ( RULE_INT )
            // InternalLcDsl.g:5630:3: RULE_INT
            {
             before(grammarAccess.getMemoryOptionAccess().getMaxINTTerminalRuleCall_2_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getMaxINTTerminalRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__MaxAssignment_2_1_2"


    // $ANTLR start "rule__MemoryOption__MaxUnitAssignment_2_1_3"
    // InternalLcDsl.g:5639:1: rule__MemoryOption__MaxUnitAssignment_2_1_3 : ( ruleMemoryUnit ) ;
    public final void rule__MemoryOption__MaxUnitAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5643:1: ( ( ruleMemoryUnit ) )
            // InternalLcDsl.g:5644:2: ( ruleMemoryUnit )
            {
            // InternalLcDsl.g:5644:2: ( ruleMemoryUnit )
            // InternalLcDsl.g:5645:3: ruleMemoryUnit
            {
             before(grammarAccess.getMemoryOptionAccess().getMaxUnitMemoryUnitEnumRuleCall_2_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMemoryUnit();

            state._fsp--;

             after(grammarAccess.getMemoryOptionAccess().getMaxUnitMemoryUnitEnumRuleCall_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__MaxUnitAssignment_2_1_3"


    // $ANTLR start "rule__MemoryOption__PermAssignment_2_2_2"
    // InternalLcDsl.g:5654:1: rule__MemoryOption__PermAssignment_2_2_2 : ( RULE_INT ) ;
    public final void rule__MemoryOption__PermAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5658:1: ( ( RULE_INT ) )
            // InternalLcDsl.g:5659:2: ( RULE_INT )
            {
            // InternalLcDsl.g:5659:2: ( RULE_INT )
            // InternalLcDsl.g:5660:3: RULE_INT
            {
             before(grammarAccess.getMemoryOptionAccess().getPermINTTerminalRuleCall_2_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemoryOptionAccess().getPermINTTerminalRuleCall_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__PermAssignment_2_2_2"


    // $ANTLR start "rule__MemoryOption__PermUnitAssignment_2_2_3"
    // InternalLcDsl.g:5669:1: rule__MemoryOption__PermUnitAssignment_2_2_3 : ( ruleMemoryUnit ) ;
    public final void rule__MemoryOption__PermUnitAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5673:1: ( ( ruleMemoryUnit ) )
            // InternalLcDsl.g:5674:2: ( ruleMemoryUnit )
            {
            // InternalLcDsl.g:5674:2: ( ruleMemoryUnit )
            // InternalLcDsl.g:5675:3: ruleMemoryUnit
            {
             before(grammarAccess.getMemoryOptionAccess().getPermUnitMemoryUnitEnumRuleCall_2_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMemoryUnit();

            state._fsp--;

             after(grammarAccess.getMemoryOptionAccess().getPermUnitMemoryUnitEnumRuleCall_2_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryOption__PermUnitAssignment_2_2_3"


    // $ANTLR start "rule__GroupMember__TypeAssignment_0_0"
    // InternalLcDsl.g:5684:1: rule__GroupMember__TypeAssignment_0_0 : ( ruleLaunchModeType ) ;
    public final void rule__GroupMember__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5688:1: ( ( ruleLaunchModeType ) )
            // InternalLcDsl.g:5689:2: ( ruleLaunchModeType )
            {
            // InternalLcDsl.g:5689:2: ( ruleLaunchModeType )
            // InternalLcDsl.g:5690:3: ruleLaunchModeType
            {
             before(grammarAccess.getGroupMemberAccess().getTypeLaunchModeTypeEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLaunchModeType();

            state._fsp--;

             after(grammarAccess.getGroupMemberAccess().getTypeLaunchModeTypeEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__TypeAssignment_0_0"


    // $ANTLR start "rule__GroupMember__AdoptAssignment_0_1"
    // InternalLcDsl.g:5699:1: rule__GroupMember__AdoptAssignment_0_1 : ( ( 'adopt' ) ) ;
    public final void rule__GroupMember__AdoptAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5703:1: ( ( ( 'adopt' ) ) )
            // InternalLcDsl.g:5704:2: ( ( 'adopt' ) )
            {
            // InternalLcDsl.g:5704:2: ( ( 'adopt' ) )
            // InternalLcDsl.g:5705:3: ( 'adopt' )
            {
             before(grammarAccess.getGroupMemberAccess().getAdoptAdoptKeyword_0_1_0()); 
            // InternalLcDsl.g:5706:3: ( 'adopt' )
            // InternalLcDsl.g:5707:4: 'adopt'
            {
             before(grammarAccess.getGroupMemberAccess().getAdoptAdoptKeyword_0_1_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getGroupMemberAccess().getAdoptAdoptKeyword_0_1_0()); 

            }

             after(grammarAccess.getGroupMemberAccess().getAdoptAdoptKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__AdoptAssignment_0_1"


    // $ANTLR start "rule__GroupMember__MemberAssignment_2"
    // InternalLcDsl.g:5718:1: rule__GroupMember__MemberAssignment_2 : ( ( ruleFQName ) ) ;
    public final void rule__GroupMember__MemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5722:1: ( ( ( ruleFQName ) ) )
            // InternalLcDsl.g:5723:2: ( ( ruleFQName ) )
            {
            // InternalLcDsl.g:5723:2: ( ( ruleFQName ) )
            // InternalLcDsl.g:5724:3: ( ruleFQName )
            {
             before(grammarAccess.getGroupMemberAccess().getMemberLaunchConfigCrossReference_2_0()); 
            // InternalLcDsl.g:5725:3: ( ruleFQName )
            // InternalLcDsl.g:5726:4: ruleFQName
            {
             before(grammarAccess.getGroupMemberAccess().getMemberLaunchConfigFQNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getGroupMemberAccess().getMemberLaunchConfigFQNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGroupMemberAccess().getMemberLaunchConfigCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__MemberAssignment_2"


    // $ANTLR start "rule__GroupMember__PostActionAssignment_3"
    // InternalLcDsl.g:5737:1: rule__GroupMember__PostActionAssignment_3 : ( ruleGroupPostLaunchAction ) ;
    public final void rule__GroupMember__PostActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5741:1: ( ( ruleGroupPostLaunchAction ) )
            // InternalLcDsl.g:5742:2: ( ruleGroupPostLaunchAction )
            {
            // InternalLcDsl.g:5742:2: ( ruleGroupPostLaunchAction )
            // InternalLcDsl.g:5743:3: ruleGroupPostLaunchAction
            {
             before(grammarAccess.getGroupMemberAccess().getPostActionGroupPostLaunchActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupPostLaunchAction();

            state._fsp--;

             after(grammarAccess.getGroupMemberAccess().getPostActionGroupPostLaunchActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupMember__PostActionAssignment_3"


    // $ANTLR start "rule__GroupPostLaunchDelay__DelayAssignment_1"
    // InternalLcDsl.g:5752:1: rule__GroupPostLaunchDelay__DelayAssignment_1 : ( RULE_INT ) ;
    public final void rule__GroupPostLaunchDelay__DelayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5756:1: ( ( RULE_INT ) )
            // InternalLcDsl.g:5757:2: ( RULE_INT )
            {
            // InternalLcDsl.g:5757:2: ( RULE_INT )
            // InternalLcDsl.g:5758:3: RULE_INT
            {
             before(grammarAccess.getGroupPostLaunchDelayAccess().getDelayINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGroupPostLaunchDelayAccess().getDelayINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchDelay__DelayAssignment_1"


    // $ANTLR start "rule__GroupPostLaunchRegex__RegexAssignment_1"
    // InternalLcDsl.g:5767:1: rule__GroupPostLaunchRegex__RegexAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GroupPostLaunchRegex__RegexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5771:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:5772:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:5772:2: ( RULE_STRING )
            // InternalLcDsl.g:5773:3: RULE_STRING
            {
             before(grammarAccess.getGroupPostLaunchRegexAccess().getRegexSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGroupPostLaunchRegexAccess().getRegexSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupPostLaunchRegex__RegexAssignment_1"

    // Delegated rules


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\23\14\uffff";
    static final String dfa_3s = "\1\111\14\uffff";
    static final String dfa_4s = "\1\uffff\13\1\1\2";
    static final String dfa_5s = "\1\0\14\uffff}>";
    static final String[] dfa_6s = {
            "\5\14\15\uffff\1\14\2\uffff\1\2\1\3\1\5\1\6\5\14\1\7\1\10\1\11\1\12\2\uffff\1\13\1\1\1\4\3\uffff\1\14\13\uffff\1\14",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4038:2: ( rule__LaunchConfig__UnorderedGroup_6__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA22_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA22_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA22_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA22_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA22_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA22_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA22_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA22_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA22_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA22_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA22_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA22_0>=19 && LA22_0<=23)||LA22_0==37||(LA22_0>=44 && LA22_0<=48)||LA22_0==61||LA22_0==73) ) {s = 12;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\50\13\uffff";
    static final String dfa_9s = "\1\71\13\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_11s = "\1\0\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\1\5\1\6\5\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\1\1\1\4",
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
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "4052:3: ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA23_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA23_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA23_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA23_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA23_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA23_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA23_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA23_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA23_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA23_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA23_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4232:2: ( rule__LaunchConfig__UnorderedGroup_6__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA24_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA24_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA24_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA24_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA24_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA24_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA24_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA24_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA24_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA24_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA24_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA24_0>=19 && LA24_0<=23)||LA24_0==37||(LA24_0>=44 && LA24_0<=48)||LA24_0==61||LA24_0==73) ) {s = 12;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4244:2: ( rule__LaunchConfig__UnorderedGroup_6__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA25_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA25_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA25_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA25_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA25_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA25_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA25_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA25_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA25_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA25_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA25_0>=19 && LA25_0<=23)||LA25_0==37||(LA25_0>=44 && LA25_0<=48)||LA25_0==61||LA25_0==73) ) {s = 12;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4256:2: ( rule__LaunchConfig__UnorderedGroup_6__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA26_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA26_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA26_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA26_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA26_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA26_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA26_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA26_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA26_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA26_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA26_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA26_0>=19 && LA26_0<=23)||LA26_0==37||(LA26_0>=44 && LA26_0<=48)||LA26_0==61||LA26_0==73) ) {s = 12;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4268:2: ( rule__LaunchConfig__UnorderedGroup_6__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA27_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA27_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA27_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA27_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA27_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA27_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA27_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA27_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA27_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA27_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA27_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA27_0>=19 && LA27_0<=23)||LA27_0==37||(LA27_0>=44 && LA27_0<=48)||LA27_0==61||LA27_0==73) ) {s = 12;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4280:2: ( rule__LaunchConfig__UnorderedGroup_6__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA28_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA28_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA28_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA28_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA28_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA28_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA28_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA28_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA28_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA28_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA28_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA28_0>=19 && LA28_0<=23)||LA28_0==37||(LA28_0>=44 && LA28_0<=48)||LA28_0==61||LA28_0==73) ) {s = 12;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4292:2: ( rule__LaunchConfig__UnorderedGroup_6__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA29_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA29_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA29_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA29_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA29_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA29_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA29_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA29_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA29_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA29_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA29_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA29_0>=19 && LA29_0<=23)||LA29_0==37||(LA29_0>=44 && LA29_0<=48)||LA29_0==61||LA29_0==73) ) {s = 12;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4304:2: ( rule__LaunchConfig__UnorderedGroup_6__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA30_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA30_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA30_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA30_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA30_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA30_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA30_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA30_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA30_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA30_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA30_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA30_0>=19 && LA30_0<=23)||LA30_0==37||(LA30_0>=44 && LA30_0<=48)||LA30_0==61||LA30_0==73) ) {s = 12;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4316:2: ( rule__LaunchConfig__UnorderedGroup_6__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_0 = input.LA(1);

                         
                        int index31_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA31_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA31_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA31_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA31_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA31_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA31_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA31_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA31_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA31_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA31_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA31_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA31_0>=19 && LA31_0<=23)||LA31_0==37||(LA31_0>=44 && LA31_0<=48)||LA31_0==61||LA31_0==73) ) {s = 12;}

                         
                        input.seek(index31_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4328:2: ( rule__LaunchConfig__UnorderedGroup_6__9 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA32_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA32_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA32_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA32_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA32_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA32_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA32_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA32_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA32_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA32_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA32_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA32_0>=19 && LA32_0<=23)||LA32_0==37||(LA32_0>=44 && LA32_0<=48)||LA32_0==61||LA32_0==73) ) {s = 12;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4340:2: ( rule__LaunchConfig__UnorderedGroup_6__10 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA33_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA33_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA33_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA33_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA33_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA33_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA33_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA33_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA33_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA33_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA33_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( ((LA33_0>=19 && LA33_0<=23)||LA33_0==37||(LA33_0>=44 && LA33_0<=48)||LA33_0==61||LA33_0==73) ) {s = 12;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003CL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x039E0F0000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001F02000F80000L,0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001F00000F80002L,0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001F00000F80000L,0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000700004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000FF000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xC000008000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x039E0F0000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000700004002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000140L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000F80002L,0x0000000000000200L});

}
