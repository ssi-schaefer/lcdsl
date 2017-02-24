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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQ", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_VERSION", "RULE_QUALIFIER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stdin'", "'java'", "'eclipse'", "'rap'", "'group'", "'run'", "'debug'", "'profile'", "'coverage'", "'inherit'", "'MB'", "'mb'", "'M'", "'m'", "'GB'", "'gb'", "'G'", "'g'", "'stdout'", "'stderr'", "'both-out'", "'configuration'", "'{'", "'}'", "':'", "';'", "'workspace'", "'working-dir'", "'project'", "'main-class'", "'plugin'", "'ignore'", "'vm-arg'", "'argument'", "'environment'", "'application'", "'product'", "'favorite'", "'redirect'", "'to'", "'from'", "'execution-environment'", "'config-ini-template'", "'trace'", "'startlevel'", "'clear'", "'memory'", "'min'", "'max'", "'perm'", "'member'", "'delay'", "'regex'", "'wait'", "'.'", "'explicit'", "'manual'", "'foreground'", "'no-console'", "'no-validate'", "'sw-install-allowed'", "'replace-env'", "'autostart'", "'log'", "'!'", "'config'", "'adopt'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_VERSION=8;
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
    public static final int RULE_INT=7;
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
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

                if ( ((LA1_0>=15 && LA1_0<=18)||(LA1_0>=69 && LA1_0<=75)) ) {
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


    // $ANTLR start "entryRuleConfigIniTemplate"
    // InternalLcDsl.g:353:1: entryRuleConfigIniTemplate : ruleConfigIniTemplate EOF ;
    public final void entryRuleConfigIniTemplate() throws RecognitionException {
        try {
            // InternalLcDsl.g:354:1: ( ruleConfigIniTemplate EOF )
            // InternalLcDsl.g:355:1: ruleConfigIniTemplate EOF
            {
             before(grammarAccess.getConfigIniTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigIniTemplate();

            state._fsp--;

             after(grammarAccess.getConfigIniTemplateRule()); 
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
    // $ANTLR end "entryRuleConfigIniTemplate"


    // $ANTLR start "ruleConfigIniTemplate"
    // InternalLcDsl.g:362:1: ruleConfigIniTemplate : ( ( rule__ConfigIniTemplate__Group__0 ) ) ;
    public final void ruleConfigIniTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:366:2: ( ( ( rule__ConfigIniTemplate__Group__0 ) ) )
            // InternalLcDsl.g:367:2: ( ( rule__ConfigIniTemplate__Group__0 ) )
            {
            // InternalLcDsl.g:367:2: ( ( rule__ConfigIniTemplate__Group__0 ) )
            // InternalLcDsl.g:368:3: ( rule__ConfigIniTemplate__Group__0 )
            {
             before(grammarAccess.getConfigIniTemplateAccess().getGroup()); 
            // InternalLcDsl.g:369:3: ( rule__ConfigIniTemplate__Group__0 )
            // InternalLcDsl.g:369:4: rule__ConfigIniTemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigIniTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigIniTemplateAccess().getGroup()); 

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
    // $ANTLR end "ruleConfigIniTemplate"


    // $ANTLR start "entryRuleTraceEnablement"
    // InternalLcDsl.g:378:1: entryRuleTraceEnablement : ruleTraceEnablement EOF ;
    public final void entryRuleTraceEnablement() throws RecognitionException {
        try {
            // InternalLcDsl.g:379:1: ( ruleTraceEnablement EOF )
            // InternalLcDsl.g:380:1: ruleTraceEnablement EOF
            {
             before(grammarAccess.getTraceEnablementRule()); 
            pushFollow(FOLLOW_1);
            ruleTraceEnablement();

            state._fsp--;

             after(grammarAccess.getTraceEnablementRule()); 
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
    // $ANTLR end "entryRuleTraceEnablement"


    // $ANTLR start "ruleTraceEnablement"
    // InternalLcDsl.g:387:1: ruleTraceEnablement : ( ( rule__TraceEnablement__Group__0 ) ) ;
    public final void ruleTraceEnablement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:391:2: ( ( ( rule__TraceEnablement__Group__0 ) ) )
            // InternalLcDsl.g:392:2: ( ( rule__TraceEnablement__Group__0 ) )
            {
            // InternalLcDsl.g:392:2: ( ( rule__TraceEnablement__Group__0 ) )
            // InternalLcDsl.g:393:3: ( rule__TraceEnablement__Group__0 )
            {
             before(grammarAccess.getTraceEnablementAccess().getGroup()); 
            // InternalLcDsl.g:394:3: ( rule__TraceEnablement__Group__0 )
            // InternalLcDsl.g:394:4: rule__TraceEnablement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TraceEnablement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraceEnablementAccess().getGroup()); 

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
    // $ANTLR end "ruleTraceEnablement"


    // $ANTLR start "entryRuleExistingPath"
    // InternalLcDsl.g:403:1: entryRuleExistingPath : ruleExistingPath EOF ;
    public final void entryRuleExistingPath() throws RecognitionException {
        try {
            // InternalLcDsl.g:404:1: ( ruleExistingPath EOF )
            // InternalLcDsl.g:405:1: ruleExistingPath EOF
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
    // InternalLcDsl.g:412:1: ruleExistingPath : ( ( rule__ExistingPath__NameAssignment ) ) ;
    public final void ruleExistingPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:416:2: ( ( ( rule__ExistingPath__NameAssignment ) ) )
            // InternalLcDsl.g:417:2: ( ( rule__ExistingPath__NameAssignment ) )
            {
            // InternalLcDsl.g:417:2: ( ( rule__ExistingPath__NameAssignment ) )
            // InternalLcDsl.g:418:3: ( rule__ExistingPath__NameAssignment )
            {
             before(grammarAccess.getExistingPathAccess().getNameAssignment()); 
            // InternalLcDsl.g:419:3: ( rule__ExistingPath__NameAssignment )
            // InternalLcDsl.g:419:4: rule__ExistingPath__NameAssignment
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
    // InternalLcDsl.g:428:1: entryRuleAnyPath : ruleAnyPath EOF ;
    public final void entryRuleAnyPath() throws RecognitionException {
        try {
            // InternalLcDsl.g:429:1: ( ruleAnyPath EOF )
            // InternalLcDsl.g:430:1: ruleAnyPath EOF
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
    // InternalLcDsl.g:437:1: ruleAnyPath : ( ( rule__AnyPath__NameAssignment ) ) ;
    public final void ruleAnyPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:441:2: ( ( ( rule__AnyPath__NameAssignment ) ) )
            // InternalLcDsl.g:442:2: ( ( rule__AnyPath__NameAssignment ) )
            {
            // InternalLcDsl.g:442:2: ( ( rule__AnyPath__NameAssignment ) )
            // InternalLcDsl.g:443:3: ( rule__AnyPath__NameAssignment )
            {
             before(grammarAccess.getAnyPathAccess().getNameAssignment()); 
            // InternalLcDsl.g:444:3: ( rule__AnyPath__NameAssignment )
            // InternalLcDsl.g:444:4: rule__AnyPath__NameAssignment
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


    // $ANTLR start "entryRulePluginWithVersionAndStartLevel"
    // InternalLcDsl.g:453:1: entryRulePluginWithVersionAndStartLevel : rulePluginWithVersionAndStartLevel EOF ;
    public final void entryRulePluginWithVersionAndStartLevel() throws RecognitionException {
        try {
            // InternalLcDsl.g:454:1: ( rulePluginWithVersionAndStartLevel EOF )
            // InternalLcDsl.g:455:1: rulePluginWithVersionAndStartLevel EOF
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelRule()); 
            pushFollow(FOLLOW_1);
            rulePluginWithVersionAndStartLevel();

            state._fsp--;

             after(grammarAccess.getPluginWithVersionAndStartLevelRule()); 
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
    // $ANTLR end "entryRulePluginWithVersionAndStartLevel"


    // $ANTLR start "rulePluginWithVersionAndStartLevel"
    // InternalLcDsl.g:462:1: rulePluginWithVersionAndStartLevel : ( ( rule__PluginWithVersionAndStartLevel__Group__0 ) ) ;
    public final void rulePluginWithVersionAndStartLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:466:2: ( ( ( rule__PluginWithVersionAndStartLevel__Group__0 ) ) )
            // InternalLcDsl.g:467:2: ( ( rule__PluginWithVersionAndStartLevel__Group__0 ) )
            {
            // InternalLcDsl.g:467:2: ( ( rule__PluginWithVersionAndStartLevel__Group__0 ) )
            // InternalLcDsl.g:468:3: ( rule__PluginWithVersionAndStartLevel__Group__0 )
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getGroup()); 
            // InternalLcDsl.g:469:3: ( rule__PluginWithVersionAndStartLevel__Group__0 )
            // InternalLcDsl.g:469:4: rule__PluginWithVersionAndStartLevel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PluginWithVersionAndStartLevel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getGroup()); 

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
    // $ANTLR end "rulePluginWithVersionAndStartLevel"


    // $ANTLR start "entryRulePluginWithVersion"
    // InternalLcDsl.g:478:1: entryRulePluginWithVersion : rulePluginWithVersion EOF ;
    public final void entryRulePluginWithVersion() throws RecognitionException {
        try {
            // InternalLcDsl.g:479:1: ( rulePluginWithVersion EOF )
            // InternalLcDsl.g:480:1: rulePluginWithVersion EOF
            {
             before(grammarAccess.getPluginWithVersionRule()); 
            pushFollow(FOLLOW_1);
            rulePluginWithVersion();

            state._fsp--;

             after(grammarAccess.getPluginWithVersionRule()); 
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
    // $ANTLR end "entryRulePluginWithVersion"


    // $ANTLR start "rulePluginWithVersion"
    // InternalLcDsl.g:487:1: rulePluginWithVersion : ( ( rule__PluginWithVersion__Group__0 ) ) ;
    public final void rulePluginWithVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:491:2: ( ( ( rule__PluginWithVersion__Group__0 ) ) )
            // InternalLcDsl.g:492:2: ( ( rule__PluginWithVersion__Group__0 ) )
            {
            // InternalLcDsl.g:492:2: ( ( rule__PluginWithVersion__Group__0 ) )
            // InternalLcDsl.g:493:3: ( rule__PluginWithVersion__Group__0 )
            {
             before(grammarAccess.getPluginWithVersionAccess().getGroup()); 
            // InternalLcDsl.g:494:3: ( rule__PluginWithVersion__Group__0 )
            // InternalLcDsl.g:494:4: rule__PluginWithVersion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PluginWithVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPluginWithVersionAccess().getGroup()); 

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
    // $ANTLR end "rulePluginWithVersion"


    // $ANTLR start "entryRulePlugin"
    // InternalLcDsl.g:503:1: entryRulePlugin : rulePlugin EOF ;
    public final void entryRulePlugin() throws RecognitionException {
        try {
            // InternalLcDsl.g:504:1: ( rulePlugin EOF )
            // InternalLcDsl.g:505:1: rulePlugin EOF
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
    // InternalLcDsl.g:512:1: rulePlugin : ( ( rule__Plugin__NameAssignment ) ) ;
    public final void rulePlugin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:516:2: ( ( ( rule__Plugin__NameAssignment ) ) )
            // InternalLcDsl.g:517:2: ( ( rule__Plugin__NameAssignment ) )
            {
            // InternalLcDsl.g:517:2: ( ( rule__Plugin__NameAssignment ) )
            // InternalLcDsl.g:518:3: ( rule__Plugin__NameAssignment )
            {
             before(grammarAccess.getPluginAccess().getNameAssignment()); 
            // InternalLcDsl.g:519:3: ( rule__Plugin__NameAssignment )
            // InternalLcDsl.g:519:4: rule__Plugin__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Plugin__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPluginAccess().getNameAssignment()); 

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
    // InternalLcDsl.g:528:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalLcDsl.g:529:1: ( ruleProject EOF )
            // InternalLcDsl.g:530:1: ruleProject EOF
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
    // InternalLcDsl.g:537:1: ruleProject : ( ( rule__Project__NameAssignment ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:541:2: ( ( ( rule__Project__NameAssignment ) ) )
            // InternalLcDsl.g:542:2: ( ( rule__Project__NameAssignment ) )
            {
            // InternalLcDsl.g:542:2: ( ( rule__Project__NameAssignment ) )
            // InternalLcDsl.g:543:3: ( rule__Project__NameAssignment )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment()); 
            // InternalLcDsl.g:544:3: ( rule__Project__NameAssignment )
            // InternalLcDsl.g:544:4: rule__Project__NameAssignment
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
    // InternalLcDsl.g:553:1: entryRuleJavaType : ruleJavaType EOF ;
    public final void entryRuleJavaType() throws RecognitionException {
        try {
            // InternalLcDsl.g:554:1: ( ruleJavaType EOF )
            // InternalLcDsl.g:555:1: ruleJavaType EOF
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
    // InternalLcDsl.g:562:1: ruleJavaType : ( ( rule__JavaType__NameAssignment ) ) ;
    public final void ruleJavaType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:566:2: ( ( ( rule__JavaType__NameAssignment ) ) )
            // InternalLcDsl.g:567:2: ( ( rule__JavaType__NameAssignment ) )
            {
            // InternalLcDsl.g:567:2: ( ( rule__JavaType__NameAssignment ) )
            // InternalLcDsl.g:568:3: ( rule__JavaType__NameAssignment )
            {
             before(grammarAccess.getJavaTypeAccess().getNameAssignment()); 
            // InternalLcDsl.g:569:3: ( rule__JavaType__NameAssignment )
            // InternalLcDsl.g:569:4: rule__JavaType__NameAssignment
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
    // InternalLcDsl.g:578:1: entryRuleClearOption : ruleClearOption EOF ;
    public final void entryRuleClearOption() throws RecognitionException {
        try {
            // InternalLcDsl.g:579:1: ( ruleClearOption EOF )
            // InternalLcDsl.g:580:1: ruleClearOption EOF
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
    // InternalLcDsl.g:587:1: ruleClearOption : ( ( rule__ClearOption__Group__0 ) ) ;
    public final void ruleClearOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:591:2: ( ( ( rule__ClearOption__Group__0 ) ) )
            // InternalLcDsl.g:592:2: ( ( rule__ClearOption__Group__0 ) )
            {
            // InternalLcDsl.g:592:2: ( ( rule__ClearOption__Group__0 ) )
            // InternalLcDsl.g:593:3: ( rule__ClearOption__Group__0 )
            {
             before(grammarAccess.getClearOptionAccess().getGroup()); 
            // InternalLcDsl.g:594:3: ( rule__ClearOption__Group__0 )
            // InternalLcDsl.g:594:4: rule__ClearOption__Group__0
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
    // InternalLcDsl.g:603:1: entryRuleMemoryOption : ruleMemoryOption EOF ;
    public final void entryRuleMemoryOption() throws RecognitionException {
        try {
            // InternalLcDsl.g:604:1: ( ruleMemoryOption EOF )
            // InternalLcDsl.g:605:1: ruleMemoryOption EOF
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
    // InternalLcDsl.g:612:1: ruleMemoryOption : ( ( rule__MemoryOption__Group__0 ) ) ;
    public final void ruleMemoryOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:616:2: ( ( ( rule__MemoryOption__Group__0 ) ) )
            // InternalLcDsl.g:617:2: ( ( rule__MemoryOption__Group__0 ) )
            {
            // InternalLcDsl.g:617:2: ( ( rule__MemoryOption__Group__0 ) )
            // InternalLcDsl.g:618:3: ( rule__MemoryOption__Group__0 )
            {
             before(grammarAccess.getMemoryOptionAccess().getGroup()); 
            // InternalLcDsl.g:619:3: ( rule__MemoryOption__Group__0 )
            // InternalLcDsl.g:619:4: rule__MemoryOption__Group__0
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
    // InternalLcDsl.g:628:1: entryRuleGroupMember : ruleGroupMember EOF ;
    public final void entryRuleGroupMember() throws RecognitionException {
        try {
            // InternalLcDsl.g:629:1: ( ruleGroupMember EOF )
            // InternalLcDsl.g:630:1: ruleGroupMember EOF
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
    // InternalLcDsl.g:637:1: ruleGroupMember : ( ( rule__GroupMember__Group__0 ) ) ;
    public final void ruleGroupMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:641:2: ( ( ( rule__GroupMember__Group__0 ) ) )
            // InternalLcDsl.g:642:2: ( ( rule__GroupMember__Group__0 ) )
            {
            // InternalLcDsl.g:642:2: ( ( rule__GroupMember__Group__0 ) )
            // InternalLcDsl.g:643:3: ( rule__GroupMember__Group__0 )
            {
             before(grammarAccess.getGroupMemberAccess().getGroup()); 
            // InternalLcDsl.g:644:3: ( rule__GroupMember__Group__0 )
            // InternalLcDsl.g:644:4: rule__GroupMember__Group__0
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
    // InternalLcDsl.g:653:1: entryRuleGroupPostLaunchAction : ruleGroupPostLaunchAction EOF ;
    public final void entryRuleGroupPostLaunchAction() throws RecognitionException {
        try {
            // InternalLcDsl.g:654:1: ( ruleGroupPostLaunchAction EOF )
            // InternalLcDsl.g:655:1: ruleGroupPostLaunchAction EOF
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
    // InternalLcDsl.g:662:1: ruleGroupPostLaunchAction : ( ( rule__GroupPostLaunchAction__Alternatives ) ) ;
    public final void ruleGroupPostLaunchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:666:2: ( ( ( rule__GroupPostLaunchAction__Alternatives ) ) )
            // InternalLcDsl.g:667:2: ( ( rule__GroupPostLaunchAction__Alternatives ) )
            {
            // InternalLcDsl.g:667:2: ( ( rule__GroupPostLaunchAction__Alternatives ) )
            // InternalLcDsl.g:668:3: ( rule__GroupPostLaunchAction__Alternatives )
            {
             before(grammarAccess.getGroupPostLaunchActionAccess().getAlternatives()); 
            // InternalLcDsl.g:669:3: ( rule__GroupPostLaunchAction__Alternatives )
            // InternalLcDsl.g:669:4: rule__GroupPostLaunchAction__Alternatives
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
    // InternalLcDsl.g:678:1: entryRuleGroupPostLaunchDelay : ruleGroupPostLaunchDelay EOF ;
    public final void entryRuleGroupPostLaunchDelay() throws RecognitionException {
        try {
            // InternalLcDsl.g:679:1: ( ruleGroupPostLaunchDelay EOF )
            // InternalLcDsl.g:680:1: ruleGroupPostLaunchDelay EOF
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
    // InternalLcDsl.g:687:1: ruleGroupPostLaunchDelay : ( ( rule__GroupPostLaunchDelay__Group__0 ) ) ;
    public final void ruleGroupPostLaunchDelay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:691:2: ( ( ( rule__GroupPostLaunchDelay__Group__0 ) ) )
            // InternalLcDsl.g:692:2: ( ( rule__GroupPostLaunchDelay__Group__0 ) )
            {
            // InternalLcDsl.g:692:2: ( ( rule__GroupPostLaunchDelay__Group__0 ) )
            // InternalLcDsl.g:693:3: ( rule__GroupPostLaunchDelay__Group__0 )
            {
             before(grammarAccess.getGroupPostLaunchDelayAccess().getGroup()); 
            // InternalLcDsl.g:694:3: ( rule__GroupPostLaunchDelay__Group__0 )
            // InternalLcDsl.g:694:4: rule__GroupPostLaunchDelay__Group__0
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
    // InternalLcDsl.g:703:1: entryRuleGroupPostLaunchRegex : ruleGroupPostLaunchRegex EOF ;
    public final void entryRuleGroupPostLaunchRegex() throws RecognitionException {
        try {
            // InternalLcDsl.g:704:1: ( ruleGroupPostLaunchRegex EOF )
            // InternalLcDsl.g:705:1: ruleGroupPostLaunchRegex EOF
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
    // InternalLcDsl.g:712:1: ruleGroupPostLaunchRegex : ( ( rule__GroupPostLaunchRegex__Group__0 ) ) ;
    public final void ruleGroupPostLaunchRegex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:716:2: ( ( ( rule__GroupPostLaunchRegex__Group__0 ) ) )
            // InternalLcDsl.g:717:2: ( ( rule__GroupPostLaunchRegex__Group__0 ) )
            {
            // InternalLcDsl.g:717:2: ( ( rule__GroupPostLaunchRegex__Group__0 ) )
            // InternalLcDsl.g:718:3: ( rule__GroupPostLaunchRegex__Group__0 )
            {
             before(grammarAccess.getGroupPostLaunchRegexAccess().getGroup()); 
            // InternalLcDsl.g:719:3: ( rule__GroupPostLaunchRegex__Group__0 )
            // InternalLcDsl.g:719:4: rule__GroupPostLaunchRegex__Group__0
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
    // InternalLcDsl.g:728:1: entryRuleGroupPostLaunchWait : ruleGroupPostLaunchWait EOF ;
    public final void entryRuleGroupPostLaunchWait() throws RecognitionException {
        try {
            // InternalLcDsl.g:729:1: ( ruleGroupPostLaunchWait EOF )
            // InternalLcDsl.g:730:1: ruleGroupPostLaunchWait EOF
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
    // InternalLcDsl.g:737:1: ruleGroupPostLaunchWait : ( ( rule__GroupPostLaunchWait__Group__0 ) ) ;
    public final void ruleGroupPostLaunchWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:741:2: ( ( ( rule__GroupPostLaunchWait__Group__0 ) ) )
            // InternalLcDsl.g:742:2: ( ( rule__GroupPostLaunchWait__Group__0 ) )
            {
            // InternalLcDsl.g:742:2: ( ( rule__GroupPostLaunchWait__Group__0 ) )
            // InternalLcDsl.g:743:3: ( rule__GroupPostLaunchWait__Group__0 )
            {
             before(grammarAccess.getGroupPostLaunchWaitAccess().getGroup()); 
            // InternalLcDsl.g:744:3: ( rule__GroupPostLaunchWait__Group__0 )
            // InternalLcDsl.g:744:4: rule__GroupPostLaunchWait__Group__0
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
    // InternalLcDsl.g:753:1: entryRuleFQName : ruleFQName EOF ;
    public final void entryRuleFQName() throws RecognitionException {
        try {
            // InternalLcDsl.g:754:1: ( ruleFQName EOF )
            // InternalLcDsl.g:755:1: ruleFQName EOF
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
    // InternalLcDsl.g:762:1: ruleFQName : ( ( rule__FQName__Group__0 ) ) ;
    public final void ruleFQName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:766:2: ( ( ( rule__FQName__Group__0 ) ) )
            // InternalLcDsl.g:767:2: ( ( rule__FQName__Group__0 ) )
            {
            // InternalLcDsl.g:767:2: ( ( rule__FQName__Group__0 ) )
            // InternalLcDsl.g:768:3: ( rule__FQName__Group__0 )
            {
             before(grammarAccess.getFQNameAccess().getGroup()); 
            // InternalLcDsl.g:769:3: ( rule__FQName__Group__0 )
            // InternalLcDsl.g:769:4: rule__FQName__Group__0
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
    // InternalLcDsl.g:778:1: ruleLaunchConfigType : ( ( rule__LaunchConfigType__Alternatives ) ) ;
    public final void ruleLaunchConfigType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:782:1: ( ( ( rule__LaunchConfigType__Alternatives ) ) )
            // InternalLcDsl.g:783:2: ( ( rule__LaunchConfigType__Alternatives ) )
            {
            // InternalLcDsl.g:783:2: ( ( rule__LaunchConfigType__Alternatives ) )
            // InternalLcDsl.g:784:3: ( rule__LaunchConfigType__Alternatives )
            {
             before(grammarAccess.getLaunchConfigTypeAccess().getAlternatives()); 
            // InternalLcDsl.g:785:3: ( rule__LaunchConfigType__Alternatives )
            // InternalLcDsl.g:785:4: rule__LaunchConfigType__Alternatives
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
    // InternalLcDsl.g:794:1: ruleLaunchModeType : ( ( rule__LaunchModeType__Alternatives ) ) ;
    public final void ruleLaunchModeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:798:1: ( ( ( rule__LaunchModeType__Alternatives ) ) )
            // InternalLcDsl.g:799:2: ( ( rule__LaunchModeType__Alternatives ) )
            {
            // InternalLcDsl.g:799:2: ( ( rule__LaunchModeType__Alternatives ) )
            // InternalLcDsl.g:800:3: ( rule__LaunchModeType__Alternatives )
            {
             before(grammarAccess.getLaunchModeTypeAccess().getAlternatives()); 
            // InternalLcDsl.g:801:3: ( rule__LaunchModeType__Alternatives )
            // InternalLcDsl.g:801:4: rule__LaunchModeType__Alternatives
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
    // InternalLcDsl.g:810:1: ruleMemoryUnit : ( ( rule__MemoryUnit__Alternatives ) ) ;
    public final void ruleMemoryUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:814:1: ( ( ( rule__MemoryUnit__Alternatives ) ) )
            // InternalLcDsl.g:815:2: ( ( rule__MemoryUnit__Alternatives ) )
            {
            // InternalLcDsl.g:815:2: ( ( rule__MemoryUnit__Alternatives ) )
            // InternalLcDsl.g:816:3: ( rule__MemoryUnit__Alternatives )
            {
             before(grammarAccess.getMemoryUnitAccess().getAlternatives()); 
            // InternalLcDsl.g:817:3: ( rule__MemoryUnit__Alternatives )
            // InternalLcDsl.g:817:4: rule__MemoryUnit__Alternatives
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
    // InternalLcDsl.g:826:1: ruleOutputStream : ( ( rule__OutputStream__Alternatives ) ) ;
    public final void ruleOutputStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:830:1: ( ( ( rule__OutputStream__Alternatives ) ) )
            // InternalLcDsl.g:831:2: ( ( rule__OutputStream__Alternatives ) )
            {
            // InternalLcDsl.g:831:2: ( ( rule__OutputStream__Alternatives ) )
            // InternalLcDsl.g:832:3: ( rule__OutputStream__Alternatives )
            {
             before(grammarAccess.getOutputStreamAccess().getAlternatives()); 
            // InternalLcDsl.g:833:3: ( rule__OutputStream__Alternatives )
            // InternalLcDsl.g:833:4: rule__OutputStream__Alternatives
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
    // InternalLcDsl.g:842:1: ruleInputStream : ( ( 'stdin' ) ) ;
    public final void ruleInputStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:846:1: ( ( ( 'stdin' ) ) )
            // InternalLcDsl.g:847:2: ( ( 'stdin' ) )
            {
            // InternalLcDsl.g:847:2: ( ( 'stdin' ) )
            // InternalLcDsl.g:848:3: ( 'stdin' )
            {
             before(grammarAccess.getInputStreamAccess().getSTDINEnumLiteralDeclaration()); 
            // InternalLcDsl.g:849:3: ( 'stdin' )
            // InternalLcDsl.g:849:4: 'stdin'
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
    // InternalLcDsl.g:857:1: rule__LaunchConfig__Alternatives_7 : ( ( ( rule__LaunchConfig__PluginsAssignment_7_0 ) ) | ( ( rule__LaunchConfig__IgnoreAssignment_7_1 ) ) | ( ( rule__LaunchConfig__GroupMembersAssignment_7_2 ) ) | ( ( rule__LaunchConfig__VmArgsAssignment_7_3 ) ) | ( ( rule__LaunchConfig__ProgArgsAssignment_7_4 ) ) | ( ( rule__LaunchConfig__EnvVarsAssignment_7_5 ) ) | ( ( rule__LaunchConfig__TracesAssignment_7_6 ) ) );
    public final void rule__LaunchConfig__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:861:1: ( ( ( rule__LaunchConfig__PluginsAssignment_7_0 ) ) | ( ( rule__LaunchConfig__IgnoreAssignment_7_1 ) ) | ( ( rule__LaunchConfig__GroupMembersAssignment_7_2 ) ) | ( ( rule__LaunchConfig__VmArgsAssignment_7_3 ) ) | ( ( rule__LaunchConfig__ProgArgsAssignment_7_4 ) ) | ( ( rule__LaunchConfig__EnvVarsAssignment_7_5 ) ) | ( ( rule__LaunchConfig__TracesAssignment_7_6 ) ) )
            int alt2=7;
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
            case 64:
            case 80:
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
            case 57:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLcDsl.g:862:2: ( ( rule__LaunchConfig__PluginsAssignment_7_0 ) )
                    {
                    // InternalLcDsl.g:862:2: ( ( rule__LaunchConfig__PluginsAssignment_7_0 ) )
                    // InternalLcDsl.g:863:3: ( rule__LaunchConfig__PluginsAssignment_7_0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getPluginsAssignment_7_0()); 
                    // InternalLcDsl.g:864:3: ( rule__LaunchConfig__PluginsAssignment_7_0 )
                    // InternalLcDsl.g:864:4: rule__LaunchConfig__PluginsAssignment_7_0
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
                    // InternalLcDsl.g:868:2: ( ( rule__LaunchConfig__IgnoreAssignment_7_1 ) )
                    {
                    // InternalLcDsl.g:868:2: ( ( rule__LaunchConfig__IgnoreAssignment_7_1 ) )
                    // InternalLcDsl.g:869:3: ( rule__LaunchConfig__IgnoreAssignment_7_1 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getIgnoreAssignment_7_1()); 
                    // InternalLcDsl.g:870:3: ( rule__LaunchConfig__IgnoreAssignment_7_1 )
                    // InternalLcDsl.g:870:4: rule__LaunchConfig__IgnoreAssignment_7_1
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
                    // InternalLcDsl.g:874:2: ( ( rule__LaunchConfig__GroupMembersAssignment_7_2 ) )
                    {
                    // InternalLcDsl.g:874:2: ( ( rule__LaunchConfig__GroupMembersAssignment_7_2 ) )
                    // InternalLcDsl.g:875:3: ( rule__LaunchConfig__GroupMembersAssignment_7_2 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroupMembersAssignment_7_2()); 
                    // InternalLcDsl.g:876:3: ( rule__LaunchConfig__GroupMembersAssignment_7_2 )
                    // InternalLcDsl.g:876:4: rule__LaunchConfig__GroupMembersAssignment_7_2
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
                    // InternalLcDsl.g:880:2: ( ( rule__LaunchConfig__VmArgsAssignment_7_3 ) )
                    {
                    // InternalLcDsl.g:880:2: ( ( rule__LaunchConfig__VmArgsAssignment_7_3 ) )
                    // InternalLcDsl.g:881:3: ( rule__LaunchConfig__VmArgsAssignment_7_3 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getVmArgsAssignment_7_3()); 
                    // InternalLcDsl.g:882:3: ( rule__LaunchConfig__VmArgsAssignment_7_3 )
                    // InternalLcDsl.g:882:4: rule__LaunchConfig__VmArgsAssignment_7_3
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
                    // InternalLcDsl.g:886:2: ( ( rule__LaunchConfig__ProgArgsAssignment_7_4 ) )
                    {
                    // InternalLcDsl.g:886:2: ( ( rule__LaunchConfig__ProgArgsAssignment_7_4 ) )
                    // InternalLcDsl.g:887:3: ( rule__LaunchConfig__ProgArgsAssignment_7_4 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getProgArgsAssignment_7_4()); 
                    // InternalLcDsl.g:888:3: ( rule__LaunchConfig__ProgArgsAssignment_7_4 )
                    // InternalLcDsl.g:888:4: rule__LaunchConfig__ProgArgsAssignment_7_4
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
                    // InternalLcDsl.g:892:2: ( ( rule__LaunchConfig__EnvVarsAssignment_7_5 ) )
                    {
                    // InternalLcDsl.g:892:2: ( ( rule__LaunchConfig__EnvVarsAssignment_7_5 ) )
                    // InternalLcDsl.g:893:3: ( rule__LaunchConfig__EnvVarsAssignment_7_5 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getEnvVarsAssignment_7_5()); 
                    // InternalLcDsl.g:894:3: ( rule__LaunchConfig__EnvVarsAssignment_7_5 )
                    // InternalLcDsl.g:894:4: rule__LaunchConfig__EnvVarsAssignment_7_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__EnvVarsAssignment_7_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getEnvVarsAssignment_7_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:898:2: ( ( rule__LaunchConfig__TracesAssignment_7_6 ) )
                    {
                    // InternalLcDsl.g:898:2: ( ( rule__LaunchConfig__TracesAssignment_7_6 ) )
                    // InternalLcDsl.g:899:3: ( rule__LaunchConfig__TracesAssignment_7_6 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getTracesAssignment_7_6()); 
                    // InternalLcDsl.g:900:3: ( rule__LaunchConfig__TracesAssignment_7_6 )
                    // InternalLcDsl.g:900:4: rule__LaunchConfig__TracesAssignment_7_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__TracesAssignment_7_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getTracesAssignment_7_6()); 

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
    // InternalLcDsl.g:908:1: rule__ClearOption__Alternatives_2_0_0 : ( ( ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 ) ) | ( ( rule__ClearOption__LogAssignment_2_0_0_1 ) ) );
    public final void rule__ClearOption__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:912:1: ( ( ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 ) ) | ( ( rule__ClearOption__LogAssignment_2_0_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==77) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLcDsl.g:913:2: ( ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 ) )
                    {
                    // InternalLcDsl.g:913:2: ( ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 ) )
                    // InternalLcDsl.g:914:3: ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 )
                    {
                     before(grammarAccess.getClearOptionAccess().getWorkspaceAssignment_2_0_0_0()); 
                    // InternalLcDsl.g:915:3: ( rule__ClearOption__WorkspaceAssignment_2_0_0_0 )
                    // InternalLcDsl.g:915:4: rule__ClearOption__WorkspaceAssignment_2_0_0_0
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
                    // InternalLcDsl.g:919:2: ( ( rule__ClearOption__LogAssignment_2_0_0_1 ) )
                    {
                    // InternalLcDsl.g:919:2: ( ( rule__ClearOption__LogAssignment_2_0_0_1 ) )
                    // InternalLcDsl.g:920:3: ( rule__ClearOption__LogAssignment_2_0_0_1 )
                    {
                     before(grammarAccess.getClearOptionAccess().getLogAssignment_2_0_0_1()); 
                    // InternalLcDsl.g:921:3: ( rule__ClearOption__LogAssignment_2_0_0_1 )
                    // InternalLcDsl.g:921:4: rule__ClearOption__LogAssignment_2_0_0_1
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
    // InternalLcDsl.g:929:1: rule__GroupPostLaunchAction__Alternatives : ( ( ruleGroupPostLaunchDelay ) | ( ruleGroupPostLaunchRegex ) | ( ruleGroupPostLaunchWait ) );
    public final void rule__GroupPostLaunchAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:933:1: ( ( ruleGroupPostLaunchDelay ) | ( ruleGroupPostLaunchRegex ) | ( ruleGroupPostLaunchWait ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt4=1;
                }
                break;
            case 66:
                {
                alt4=2;
                }
                break;
            case 67:
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
                    // InternalLcDsl.g:934:2: ( ruleGroupPostLaunchDelay )
                    {
                    // InternalLcDsl.g:934:2: ( ruleGroupPostLaunchDelay )
                    // InternalLcDsl.g:935:3: ruleGroupPostLaunchDelay
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
                    // InternalLcDsl.g:940:2: ( ruleGroupPostLaunchRegex )
                    {
                    // InternalLcDsl.g:940:2: ( ruleGroupPostLaunchRegex )
                    // InternalLcDsl.g:941:3: ruleGroupPostLaunchRegex
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
                    // InternalLcDsl.g:946:2: ( ruleGroupPostLaunchWait )
                    {
                    // InternalLcDsl.g:946:2: ( ruleGroupPostLaunchWait )
                    // InternalLcDsl.g:947:3: ruleGroupPostLaunchWait
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
    // InternalLcDsl.g:956:1: rule__LaunchConfigType__Alternatives : ( ( ( 'java' ) ) | ( ( 'eclipse' ) ) | ( ( 'rap' ) ) | ( ( 'group' ) ) );
    public final void rule__LaunchConfigType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:960:1: ( ( ( 'java' ) ) | ( ( 'eclipse' ) ) | ( ( 'rap' ) ) | ( ( 'group' ) ) )
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
                    // InternalLcDsl.g:961:2: ( ( 'java' ) )
                    {
                    // InternalLcDsl.g:961:2: ( ( 'java' ) )
                    // InternalLcDsl.g:962:3: ( 'java' )
                    {
                     before(grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0()); 
                    // InternalLcDsl.g:963:3: ( 'java' )
                    // InternalLcDsl.g:963:4: 'java'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:967:2: ( ( 'eclipse' ) )
                    {
                    // InternalLcDsl.g:967:2: ( ( 'eclipse' ) )
                    // InternalLcDsl.g:968:3: ( 'eclipse' )
                    {
                     before(grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1()); 
                    // InternalLcDsl.g:969:3: ( 'eclipse' )
                    // InternalLcDsl.g:969:4: 'eclipse'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:973:2: ( ( 'rap' ) )
                    {
                    // InternalLcDsl.g:973:2: ( ( 'rap' ) )
                    // InternalLcDsl.g:974:3: ( 'rap' )
                    {
                     before(grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2()); 
                    // InternalLcDsl.g:975:3: ( 'rap' )
                    // InternalLcDsl.g:975:4: 'rap'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:979:2: ( ( 'group' ) )
                    {
                    // InternalLcDsl.g:979:2: ( ( 'group' ) )
                    // InternalLcDsl.g:980:3: ( 'group' )
                    {
                     before(grammarAccess.getLaunchConfigTypeAccess().getGROUPEnumLiteralDeclaration_3()); 
                    // InternalLcDsl.g:981:3: ( 'group' )
                    // InternalLcDsl.g:981:4: 'group'
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
    // InternalLcDsl.g:989:1: rule__LaunchModeType__Alternatives : ( ( ( 'run' ) ) | ( ( 'debug' ) ) | ( ( 'profile' ) ) | ( ( 'coverage' ) ) | ( ( 'inherit' ) ) );
    public final void rule__LaunchModeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:993:1: ( ( ( 'run' ) ) | ( ( 'debug' ) ) | ( ( 'profile' ) ) | ( ( 'coverage' ) ) | ( ( 'inherit' ) ) )
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
                    // InternalLcDsl.g:994:2: ( ( 'run' ) )
                    {
                    // InternalLcDsl.g:994:2: ( ( 'run' ) )
                    // InternalLcDsl.g:995:3: ( 'run' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0()); 
                    // InternalLcDsl.g:996:3: ( 'run' )
                    // InternalLcDsl.g:996:4: 'run'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:1000:2: ( ( 'debug' ) )
                    {
                    // InternalLcDsl.g:1000:2: ( ( 'debug' ) )
                    // InternalLcDsl.g:1001:3: ( 'debug' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1()); 
                    // InternalLcDsl.g:1002:3: ( 'debug' )
                    // InternalLcDsl.g:1002:4: 'debug'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:1006:2: ( ( 'profile' ) )
                    {
                    // InternalLcDsl.g:1006:2: ( ( 'profile' ) )
                    // InternalLcDsl.g:1007:3: ( 'profile' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2()); 
                    // InternalLcDsl.g:1008:3: ( 'profile' )
                    // InternalLcDsl.g:1008:4: 'profile'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:1012:2: ( ( 'coverage' ) )
                    {
                    // InternalLcDsl.g:1012:2: ( ( 'coverage' ) )
                    // InternalLcDsl.g:1013:3: ( 'coverage' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3()); 
                    // InternalLcDsl.g:1014:3: ( 'coverage' )
                    // InternalLcDsl.g:1014:4: 'coverage'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:1018:2: ( ( 'inherit' ) )
                    {
                    // InternalLcDsl.g:1018:2: ( ( 'inherit' ) )
                    // InternalLcDsl.g:1019:3: ( 'inherit' )
                    {
                     before(grammarAccess.getLaunchModeTypeAccess().getINHERITEnumLiteralDeclaration_4()); 
                    // InternalLcDsl.g:1020:3: ( 'inherit' )
                    // InternalLcDsl.g:1020:4: 'inherit'
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
    // InternalLcDsl.g:1028:1: rule__MemoryUnit__Alternatives : ( ( ( 'MB' ) ) | ( ( 'mb' ) ) | ( ( 'M' ) ) | ( ( 'm' ) ) | ( ( 'GB' ) ) | ( ( 'gb' ) ) | ( ( 'G' ) ) | ( ( 'g' ) ) );
    public final void rule__MemoryUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1032:1: ( ( ( 'MB' ) ) | ( ( 'mb' ) ) | ( ( 'M' ) ) | ( ( 'm' ) ) | ( ( 'GB' ) ) | ( ( 'gb' ) ) | ( ( 'G' ) ) | ( ( 'g' ) ) )
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
                    // InternalLcDsl.g:1033:2: ( ( 'MB' ) )
                    {
                    // InternalLcDsl.g:1033:2: ( ( 'MB' ) )
                    // InternalLcDsl.g:1034:3: ( 'MB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0()); 
                    // InternalLcDsl.g:1035:3: ( 'MB' )
                    // InternalLcDsl.g:1035:4: 'MB'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:1039:2: ( ( 'mb' ) )
                    {
                    // InternalLcDsl.g:1039:2: ( ( 'mb' ) )
                    // InternalLcDsl.g:1040:3: ( 'mb' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                    // InternalLcDsl.g:1041:3: ( 'mb' )
                    // InternalLcDsl.g:1041:4: 'mb'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:1045:2: ( ( 'M' ) )
                    {
                    // InternalLcDsl.g:1045:2: ( ( 'M' ) )
                    // InternalLcDsl.g:1046:3: ( 'M' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2()); 
                    // InternalLcDsl.g:1047:3: ( 'M' )
                    // InternalLcDsl.g:1047:4: 'M'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:1051:2: ( ( 'm' ) )
                    {
                    // InternalLcDsl.g:1051:2: ( ( 'm' ) )
                    // InternalLcDsl.g:1052:3: ( 'm' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3()); 
                    // InternalLcDsl.g:1053:3: ( 'm' )
                    // InternalLcDsl.g:1053:4: 'm'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:1057:2: ( ( 'GB' ) )
                    {
                    // InternalLcDsl.g:1057:2: ( ( 'GB' ) )
                    // InternalLcDsl.g:1058:3: ( 'GB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4()); 
                    // InternalLcDsl.g:1059:3: ( 'GB' )
                    // InternalLcDsl.g:1059:4: 'GB'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:1063:2: ( ( 'gb' ) )
                    {
                    // InternalLcDsl.g:1063:2: ( ( 'gb' ) )
                    // InternalLcDsl.g:1064:3: ( 'gb' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5()); 
                    // InternalLcDsl.g:1065:3: ( 'gb' )
                    // InternalLcDsl.g:1065:4: 'gb'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:1069:2: ( ( 'G' ) )
                    {
                    // InternalLcDsl.g:1069:2: ( ( 'G' ) )
                    // InternalLcDsl.g:1070:3: ( 'G' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6()); 
                    // InternalLcDsl.g:1071:3: ( 'G' )
                    // InternalLcDsl.g:1071:4: 'G'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLcDsl.g:1075:2: ( ( 'g' ) )
                    {
                    // InternalLcDsl.g:1075:2: ( ( 'g' ) )
                    // InternalLcDsl.g:1076:3: ( 'g' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_7()); 
                    // InternalLcDsl.g:1077:3: ( 'g' )
                    // InternalLcDsl.g:1077:4: 'g'
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
    // InternalLcDsl.g:1085:1: rule__OutputStream__Alternatives : ( ( ( 'stdout' ) ) | ( ( 'stderr' ) ) | ( ( 'both-out' ) ) );
    public final void rule__OutputStream__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1089:1: ( ( ( 'stdout' ) ) | ( ( 'stderr' ) ) | ( ( 'both-out' ) ) )
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
                    // InternalLcDsl.g:1090:2: ( ( 'stdout' ) )
                    {
                    // InternalLcDsl.g:1090:2: ( ( 'stdout' ) )
                    // InternalLcDsl.g:1091:3: ( 'stdout' )
                    {
                     before(grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0()); 
                    // InternalLcDsl.g:1092:3: ( 'stdout' )
                    // InternalLcDsl.g:1092:4: 'stdout'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:1096:2: ( ( 'stderr' ) )
                    {
                    // InternalLcDsl.g:1096:2: ( ( 'stderr' ) )
                    // InternalLcDsl.g:1097:3: ( 'stderr' )
                    {
                     before(grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1()); 
                    // InternalLcDsl.g:1098:3: ( 'stderr' )
                    // InternalLcDsl.g:1098:4: 'stderr'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:1102:2: ( ( 'both-out' ) )
                    {
                    // InternalLcDsl.g:1102:2: ( ( 'both-out' ) )
                    // InternalLcDsl.g:1103:3: ( 'both-out' )
                    {
                     before(grammarAccess.getOutputStreamAccess().getBOTHEnumLiteralDeclaration_2()); 
                    // InternalLcDsl.g:1104:3: ( 'both-out' )
                    // InternalLcDsl.g:1104:4: 'both-out'
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
    // InternalLcDsl.g:1112:1: rule__LaunchConfig__Group__0 : rule__LaunchConfig__Group__0__Impl rule__LaunchConfig__Group__1 ;
    public final void rule__LaunchConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1116:1: ( rule__LaunchConfig__Group__0__Impl rule__LaunchConfig__Group__1 )
            // InternalLcDsl.g:1117:2: rule__LaunchConfig__Group__0__Impl rule__LaunchConfig__Group__1
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
    // InternalLcDsl.g:1124:1: rule__LaunchConfig__Group__0__Impl : ( ( rule__LaunchConfig__UnorderedGroup_0 ) ) ;
    public final void rule__LaunchConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1128:1: ( ( ( rule__LaunchConfig__UnorderedGroup_0 ) ) )
            // InternalLcDsl.g:1129:1: ( ( rule__LaunchConfig__UnorderedGroup_0 ) )
            {
            // InternalLcDsl.g:1129:1: ( ( rule__LaunchConfig__UnorderedGroup_0 ) )
            // InternalLcDsl.g:1130:2: ( rule__LaunchConfig__UnorderedGroup_0 )
            {
             before(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0()); 
            // InternalLcDsl.g:1131:2: ( rule__LaunchConfig__UnorderedGroup_0 )
            // InternalLcDsl.g:1131:3: rule__LaunchConfig__UnorderedGroup_0
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
    // InternalLcDsl.g:1139:1: rule__LaunchConfig__Group__1 : rule__LaunchConfig__Group__1__Impl rule__LaunchConfig__Group__2 ;
    public final void rule__LaunchConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1143:1: ( rule__LaunchConfig__Group__1__Impl rule__LaunchConfig__Group__2 )
            // InternalLcDsl.g:1144:2: rule__LaunchConfig__Group__1__Impl rule__LaunchConfig__Group__2
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
    // InternalLcDsl.g:1151:1: rule__LaunchConfig__Group__1__Impl : ( ( rule__LaunchConfig__TypeAssignment_1 ) ) ;
    public final void rule__LaunchConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1155:1: ( ( ( rule__LaunchConfig__TypeAssignment_1 ) ) )
            // InternalLcDsl.g:1156:1: ( ( rule__LaunchConfig__TypeAssignment_1 ) )
            {
            // InternalLcDsl.g:1156:1: ( ( rule__LaunchConfig__TypeAssignment_1 ) )
            // InternalLcDsl.g:1157:2: ( rule__LaunchConfig__TypeAssignment_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getTypeAssignment_1()); 
            // InternalLcDsl.g:1158:2: ( rule__LaunchConfig__TypeAssignment_1 )
            // InternalLcDsl.g:1158:3: rule__LaunchConfig__TypeAssignment_1
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
    // InternalLcDsl.g:1166:1: rule__LaunchConfig__Group__2 : rule__LaunchConfig__Group__2__Impl rule__LaunchConfig__Group__3 ;
    public final void rule__LaunchConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1170:1: ( rule__LaunchConfig__Group__2__Impl rule__LaunchConfig__Group__3 )
            // InternalLcDsl.g:1171:2: rule__LaunchConfig__Group__2__Impl rule__LaunchConfig__Group__3
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
    // InternalLcDsl.g:1178:1: rule__LaunchConfig__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__LaunchConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1182:1: ( ( 'configuration' ) )
            // InternalLcDsl.g:1183:1: ( 'configuration' )
            {
            // InternalLcDsl.g:1183:1: ( 'configuration' )
            // InternalLcDsl.g:1184:2: 'configuration'
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
    // InternalLcDsl.g:1193:1: rule__LaunchConfig__Group__3 : rule__LaunchConfig__Group__3__Impl rule__LaunchConfig__Group__4 ;
    public final void rule__LaunchConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1197:1: ( rule__LaunchConfig__Group__3__Impl rule__LaunchConfig__Group__4 )
            // InternalLcDsl.g:1198:2: rule__LaunchConfig__Group__3__Impl rule__LaunchConfig__Group__4
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
    // InternalLcDsl.g:1205:1: rule__LaunchConfig__Group__3__Impl : ( ( rule__LaunchConfig__NameAssignment_3 ) ) ;
    public final void rule__LaunchConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1209:1: ( ( ( rule__LaunchConfig__NameAssignment_3 ) ) )
            // InternalLcDsl.g:1210:1: ( ( rule__LaunchConfig__NameAssignment_3 ) )
            {
            // InternalLcDsl.g:1210:1: ( ( rule__LaunchConfig__NameAssignment_3 ) )
            // InternalLcDsl.g:1211:2: ( rule__LaunchConfig__NameAssignment_3 )
            {
             before(grammarAccess.getLaunchConfigAccess().getNameAssignment_3()); 
            // InternalLcDsl.g:1212:2: ( rule__LaunchConfig__NameAssignment_3 )
            // InternalLcDsl.g:1212:3: rule__LaunchConfig__NameAssignment_3
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
    // InternalLcDsl.g:1220:1: rule__LaunchConfig__Group__4 : rule__LaunchConfig__Group__4__Impl rule__LaunchConfig__Group__5 ;
    public final void rule__LaunchConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1224:1: ( rule__LaunchConfig__Group__4__Impl rule__LaunchConfig__Group__5 )
            // InternalLcDsl.g:1225:2: rule__LaunchConfig__Group__4__Impl rule__LaunchConfig__Group__5
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
    // InternalLcDsl.g:1232:1: rule__LaunchConfig__Group__4__Impl : ( ( rule__LaunchConfig__Group_4__0 )? ) ;
    public final void rule__LaunchConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1236:1: ( ( ( rule__LaunchConfig__Group_4__0 )? ) )
            // InternalLcDsl.g:1237:1: ( ( rule__LaunchConfig__Group_4__0 )? )
            {
            // InternalLcDsl.g:1237:1: ( ( rule__LaunchConfig__Group_4__0 )? )
            // InternalLcDsl.g:1238:2: ( rule__LaunchConfig__Group_4__0 )?
            {
             before(grammarAccess.getLaunchConfigAccess().getGroup_4()); 
            // InternalLcDsl.g:1239:2: ( rule__LaunchConfig__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLcDsl.g:1239:3: rule__LaunchConfig__Group_4__0
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
    // InternalLcDsl.g:1247:1: rule__LaunchConfig__Group__5 : rule__LaunchConfig__Group__5__Impl rule__LaunchConfig__Group__6 ;
    public final void rule__LaunchConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1251:1: ( rule__LaunchConfig__Group__5__Impl rule__LaunchConfig__Group__6 )
            // InternalLcDsl.g:1252:2: rule__LaunchConfig__Group__5__Impl rule__LaunchConfig__Group__6
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
    // InternalLcDsl.g:1259:1: rule__LaunchConfig__Group__5__Impl : ( '{' ) ;
    public final void rule__LaunchConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1263:1: ( ( '{' ) )
            // InternalLcDsl.g:1264:1: ( '{' )
            {
            // InternalLcDsl.g:1264:1: ( '{' )
            // InternalLcDsl.g:1265:2: '{'
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
    // InternalLcDsl.g:1274:1: rule__LaunchConfig__Group__6 : rule__LaunchConfig__Group__6__Impl rule__LaunchConfig__Group__7 ;
    public final void rule__LaunchConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1278:1: ( rule__LaunchConfig__Group__6__Impl rule__LaunchConfig__Group__7 )
            // InternalLcDsl.g:1279:2: rule__LaunchConfig__Group__6__Impl rule__LaunchConfig__Group__7
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
    // InternalLcDsl.g:1286:1: rule__LaunchConfig__Group__6__Impl : ( ( rule__LaunchConfig__UnorderedGroup_6 ) ) ;
    public final void rule__LaunchConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1290:1: ( ( ( rule__LaunchConfig__UnorderedGroup_6 ) ) )
            // InternalLcDsl.g:1291:1: ( ( rule__LaunchConfig__UnorderedGroup_6 ) )
            {
            // InternalLcDsl.g:1291:1: ( ( rule__LaunchConfig__UnorderedGroup_6 ) )
            // InternalLcDsl.g:1292:2: ( rule__LaunchConfig__UnorderedGroup_6 )
            {
             before(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6()); 
            // InternalLcDsl.g:1293:2: ( rule__LaunchConfig__UnorderedGroup_6 )
            // InternalLcDsl.g:1293:3: rule__LaunchConfig__UnorderedGroup_6
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
    // InternalLcDsl.g:1301:1: rule__LaunchConfig__Group__7 : rule__LaunchConfig__Group__7__Impl rule__LaunchConfig__Group__8 ;
    public final void rule__LaunchConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1305:1: ( rule__LaunchConfig__Group__7__Impl rule__LaunchConfig__Group__8 )
            // InternalLcDsl.g:1306:2: rule__LaunchConfig__Group__7__Impl rule__LaunchConfig__Group__8
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
    // InternalLcDsl.g:1313:1: rule__LaunchConfig__Group__7__Impl : ( ( rule__LaunchConfig__Alternatives_7 )* ) ;
    public final void rule__LaunchConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1317:1: ( ( ( rule__LaunchConfig__Alternatives_7 )* ) )
            // InternalLcDsl.g:1318:1: ( ( rule__LaunchConfig__Alternatives_7 )* )
            {
            // InternalLcDsl.g:1318:1: ( ( rule__LaunchConfig__Alternatives_7 )* )
            // InternalLcDsl.g:1319:2: ( rule__LaunchConfig__Alternatives_7 )*
            {
             before(grammarAccess.getLaunchConfigAccess().getAlternatives_7()); 
            // InternalLcDsl.g:1320:2: ( rule__LaunchConfig__Alternatives_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=19 && LA10_0<=23)||(LA10_0>=44 && LA10_0<=48)||LA10_0==57||LA10_0==64||LA10_0==80) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLcDsl.g:1320:3: rule__LaunchConfig__Alternatives_7
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
    // InternalLcDsl.g:1328:1: rule__LaunchConfig__Group__8 : rule__LaunchConfig__Group__8__Impl ;
    public final void rule__LaunchConfig__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1332:1: ( rule__LaunchConfig__Group__8__Impl )
            // InternalLcDsl.g:1333:2: rule__LaunchConfig__Group__8__Impl
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
    // InternalLcDsl.g:1339:1: rule__LaunchConfig__Group__8__Impl : ( '}' ) ;
    public final void rule__LaunchConfig__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1343:1: ( ( '}' ) )
            // InternalLcDsl.g:1344:1: ( '}' )
            {
            // InternalLcDsl.g:1344:1: ( '}' )
            // InternalLcDsl.g:1345:2: '}'
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
    // InternalLcDsl.g:1355:1: rule__LaunchConfig__Group_4__0 : rule__LaunchConfig__Group_4__0__Impl rule__LaunchConfig__Group_4__1 ;
    public final void rule__LaunchConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1359:1: ( rule__LaunchConfig__Group_4__0__Impl rule__LaunchConfig__Group_4__1 )
            // InternalLcDsl.g:1360:2: rule__LaunchConfig__Group_4__0__Impl rule__LaunchConfig__Group_4__1
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
    // InternalLcDsl.g:1367:1: rule__LaunchConfig__Group_4__0__Impl : ( ':' ) ;
    public final void rule__LaunchConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1371:1: ( ( ':' ) )
            // InternalLcDsl.g:1372:1: ( ':' )
            {
            // InternalLcDsl.g:1372:1: ( ':' )
            // InternalLcDsl.g:1373:2: ':'
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
    // InternalLcDsl.g:1382:1: rule__LaunchConfig__Group_4__1 : rule__LaunchConfig__Group_4__1__Impl ;
    public final void rule__LaunchConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1386:1: ( rule__LaunchConfig__Group_4__1__Impl )
            // InternalLcDsl.g:1387:2: rule__LaunchConfig__Group_4__1__Impl
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
    // InternalLcDsl.g:1393:1: rule__LaunchConfig__Group_4__1__Impl : ( ( rule__LaunchConfig__SuperConfigAssignment_4_1 ) ) ;
    public final void rule__LaunchConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1397:1: ( ( ( rule__LaunchConfig__SuperConfigAssignment_4_1 ) ) )
            // InternalLcDsl.g:1398:1: ( ( rule__LaunchConfig__SuperConfigAssignment_4_1 ) )
            {
            // InternalLcDsl.g:1398:1: ( ( rule__LaunchConfig__SuperConfigAssignment_4_1 ) )
            // InternalLcDsl.g:1399:2: ( rule__LaunchConfig__SuperConfigAssignment_4_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getSuperConfigAssignment_4_1()); 
            // InternalLcDsl.g:1400:2: ( rule__LaunchConfig__SuperConfigAssignment_4_1 )
            // InternalLcDsl.g:1400:3: rule__LaunchConfig__SuperConfigAssignment_4_1
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
    // InternalLcDsl.g:1409:1: rule__LaunchConfig__Group_6_0__0 : rule__LaunchConfig__Group_6_0__0__Impl rule__LaunchConfig__Group_6_0__1 ;
    public final void rule__LaunchConfig__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1413:1: ( rule__LaunchConfig__Group_6_0__0__Impl rule__LaunchConfig__Group_6_0__1 )
            // InternalLcDsl.g:1414:2: rule__LaunchConfig__Group_6_0__0__Impl rule__LaunchConfig__Group_6_0__1
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
    // InternalLcDsl.g:1421:1: rule__LaunchConfig__Group_6_0__0__Impl : ( ( rule__LaunchConfig__ClearsAssignment_6_0_0 ) ) ;
    public final void rule__LaunchConfig__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1425:1: ( ( ( rule__LaunchConfig__ClearsAssignment_6_0_0 ) ) )
            // InternalLcDsl.g:1426:1: ( ( rule__LaunchConfig__ClearsAssignment_6_0_0 ) )
            {
            // InternalLcDsl.g:1426:1: ( ( rule__LaunchConfig__ClearsAssignment_6_0_0 ) )
            // InternalLcDsl.g:1427:2: ( rule__LaunchConfig__ClearsAssignment_6_0_0 )
            {
             before(grammarAccess.getLaunchConfigAccess().getClearsAssignment_6_0_0()); 
            // InternalLcDsl.g:1428:2: ( rule__LaunchConfig__ClearsAssignment_6_0_0 )
            // InternalLcDsl.g:1428:3: rule__LaunchConfig__ClearsAssignment_6_0_0
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
    // InternalLcDsl.g:1436:1: rule__LaunchConfig__Group_6_0__1 : rule__LaunchConfig__Group_6_0__1__Impl ;
    public final void rule__LaunchConfig__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1440:1: ( rule__LaunchConfig__Group_6_0__1__Impl )
            // InternalLcDsl.g:1441:2: rule__LaunchConfig__Group_6_0__1__Impl
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
    // InternalLcDsl.g:1447:1: rule__LaunchConfig__Group_6_0__1__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1451:1: ( ( ';' ) )
            // InternalLcDsl.g:1452:1: ( ';' )
            {
            // InternalLcDsl.g:1452:1: ( ';' )
            // InternalLcDsl.g:1453:2: ';'
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
    // InternalLcDsl.g:1463:1: rule__LaunchConfig__Group_6_1__0 : rule__LaunchConfig__Group_6_1__0__Impl rule__LaunchConfig__Group_6_1__1 ;
    public final void rule__LaunchConfig__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1467:1: ( rule__LaunchConfig__Group_6_1__0__Impl rule__LaunchConfig__Group_6_1__1 )
            // InternalLcDsl.g:1468:2: rule__LaunchConfig__Group_6_1__0__Impl rule__LaunchConfig__Group_6_1__1
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
    // InternalLcDsl.g:1475:1: rule__LaunchConfig__Group_6_1__0__Impl : ( 'workspace' ) ;
    public final void rule__LaunchConfig__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1479:1: ( ( 'workspace' ) )
            // InternalLcDsl.g:1480:1: ( 'workspace' )
            {
            // InternalLcDsl.g:1480:1: ( 'workspace' )
            // InternalLcDsl.g:1481:2: 'workspace'
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
    // InternalLcDsl.g:1490:1: rule__LaunchConfig__Group_6_1__1 : rule__LaunchConfig__Group_6_1__1__Impl rule__LaunchConfig__Group_6_1__2 ;
    public final void rule__LaunchConfig__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1494:1: ( rule__LaunchConfig__Group_6_1__1__Impl rule__LaunchConfig__Group_6_1__2 )
            // InternalLcDsl.g:1495:2: rule__LaunchConfig__Group_6_1__1__Impl rule__LaunchConfig__Group_6_1__2
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
    // InternalLcDsl.g:1502:1: rule__LaunchConfig__Group_6_1__1__Impl : ( ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 ) ) ;
    public final void rule__LaunchConfig__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1506:1: ( ( ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 ) ) )
            // InternalLcDsl.g:1507:1: ( ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 ) )
            {
            // InternalLcDsl.g:1507:1: ( ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 ) )
            // InternalLcDsl.g:1508:2: ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getWorkspaceAssignment_6_1_1()); 
            // InternalLcDsl.g:1509:2: ( rule__LaunchConfig__WorkspaceAssignment_6_1_1 )
            // InternalLcDsl.g:1509:3: rule__LaunchConfig__WorkspaceAssignment_6_1_1
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
    // InternalLcDsl.g:1517:1: rule__LaunchConfig__Group_6_1__2 : rule__LaunchConfig__Group_6_1__2__Impl ;
    public final void rule__LaunchConfig__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1521:1: ( rule__LaunchConfig__Group_6_1__2__Impl )
            // InternalLcDsl.g:1522:2: rule__LaunchConfig__Group_6_1__2__Impl
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
    // InternalLcDsl.g:1528:1: rule__LaunchConfig__Group_6_1__2__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1532:1: ( ( ';' ) )
            // InternalLcDsl.g:1533:1: ( ';' )
            {
            // InternalLcDsl.g:1533:1: ( ';' )
            // InternalLcDsl.g:1534:2: ';'
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
    // InternalLcDsl.g:1544:1: rule__LaunchConfig__Group_6_2__0 : rule__LaunchConfig__Group_6_2__0__Impl rule__LaunchConfig__Group_6_2__1 ;
    public final void rule__LaunchConfig__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1548:1: ( rule__LaunchConfig__Group_6_2__0__Impl rule__LaunchConfig__Group_6_2__1 )
            // InternalLcDsl.g:1549:2: rule__LaunchConfig__Group_6_2__0__Impl rule__LaunchConfig__Group_6_2__1
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
    // InternalLcDsl.g:1556:1: rule__LaunchConfig__Group_6_2__0__Impl : ( 'working-dir' ) ;
    public final void rule__LaunchConfig__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1560:1: ( ( 'working-dir' ) )
            // InternalLcDsl.g:1561:1: ( 'working-dir' )
            {
            // InternalLcDsl.g:1561:1: ( 'working-dir' )
            // InternalLcDsl.g:1562:2: 'working-dir'
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
    // InternalLcDsl.g:1571:1: rule__LaunchConfig__Group_6_2__1 : rule__LaunchConfig__Group_6_2__1__Impl rule__LaunchConfig__Group_6_2__2 ;
    public final void rule__LaunchConfig__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1575:1: ( rule__LaunchConfig__Group_6_2__1__Impl rule__LaunchConfig__Group_6_2__2 )
            // InternalLcDsl.g:1576:2: rule__LaunchConfig__Group_6_2__1__Impl rule__LaunchConfig__Group_6_2__2
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
    // InternalLcDsl.g:1583:1: rule__LaunchConfig__Group_6_2__1__Impl : ( ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 ) ) ;
    public final void rule__LaunchConfig__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1587:1: ( ( ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 ) ) )
            // InternalLcDsl.g:1588:1: ( ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 ) )
            {
            // InternalLcDsl.g:1588:1: ( ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 ) )
            // InternalLcDsl.g:1589:2: ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getWorkingDirAssignment_6_2_1()); 
            // InternalLcDsl.g:1590:2: ( rule__LaunchConfig__WorkingDirAssignment_6_2_1 )
            // InternalLcDsl.g:1590:3: rule__LaunchConfig__WorkingDirAssignment_6_2_1
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
    // InternalLcDsl.g:1598:1: rule__LaunchConfig__Group_6_2__2 : rule__LaunchConfig__Group_6_2__2__Impl ;
    public final void rule__LaunchConfig__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1602:1: ( rule__LaunchConfig__Group_6_2__2__Impl )
            // InternalLcDsl.g:1603:2: rule__LaunchConfig__Group_6_2__2__Impl
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
    // InternalLcDsl.g:1609:1: rule__LaunchConfig__Group_6_2__2__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1613:1: ( ( ';' ) )
            // InternalLcDsl.g:1614:1: ( ';' )
            {
            // InternalLcDsl.g:1614:1: ( ';' )
            // InternalLcDsl.g:1615:2: ';'
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
    // InternalLcDsl.g:1625:1: rule__LaunchConfig__Group_6_3__0 : rule__LaunchConfig__Group_6_3__0__Impl rule__LaunchConfig__Group_6_3__1 ;
    public final void rule__LaunchConfig__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1629:1: ( rule__LaunchConfig__Group_6_3__0__Impl rule__LaunchConfig__Group_6_3__1 )
            // InternalLcDsl.g:1630:2: rule__LaunchConfig__Group_6_3__0__Impl rule__LaunchConfig__Group_6_3__1
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
    // InternalLcDsl.g:1637:1: rule__LaunchConfig__Group_6_3__0__Impl : ( ( rule__LaunchConfig__MemoryAssignment_6_3_0 ) ) ;
    public final void rule__LaunchConfig__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1641:1: ( ( ( rule__LaunchConfig__MemoryAssignment_6_3_0 ) ) )
            // InternalLcDsl.g:1642:1: ( ( rule__LaunchConfig__MemoryAssignment_6_3_0 ) )
            {
            // InternalLcDsl.g:1642:1: ( ( rule__LaunchConfig__MemoryAssignment_6_3_0 ) )
            // InternalLcDsl.g:1643:2: ( rule__LaunchConfig__MemoryAssignment_6_3_0 )
            {
             before(grammarAccess.getLaunchConfigAccess().getMemoryAssignment_6_3_0()); 
            // InternalLcDsl.g:1644:2: ( rule__LaunchConfig__MemoryAssignment_6_3_0 )
            // InternalLcDsl.g:1644:3: rule__LaunchConfig__MemoryAssignment_6_3_0
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
    // InternalLcDsl.g:1652:1: rule__LaunchConfig__Group_6_3__1 : rule__LaunchConfig__Group_6_3__1__Impl ;
    public final void rule__LaunchConfig__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1656:1: ( rule__LaunchConfig__Group_6_3__1__Impl )
            // InternalLcDsl.g:1657:2: rule__LaunchConfig__Group_6_3__1__Impl
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
    // InternalLcDsl.g:1663:1: rule__LaunchConfig__Group_6_3__1__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1667:1: ( ( ';' ) )
            // InternalLcDsl.g:1668:1: ( ';' )
            {
            // InternalLcDsl.g:1668:1: ( ';' )
            // InternalLcDsl.g:1669:2: ';'
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
    // InternalLcDsl.g:1679:1: rule__LaunchConfig__Group_6_4__0 : rule__LaunchConfig__Group_6_4__0__Impl rule__LaunchConfig__Group_6_4__1 ;
    public final void rule__LaunchConfig__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1683:1: ( rule__LaunchConfig__Group_6_4__0__Impl rule__LaunchConfig__Group_6_4__1 )
            // InternalLcDsl.g:1684:2: rule__LaunchConfig__Group_6_4__0__Impl rule__LaunchConfig__Group_6_4__1
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
    // InternalLcDsl.g:1691:1: rule__LaunchConfig__Group_6_4__0__Impl : ( 'project' ) ;
    public final void rule__LaunchConfig__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1695:1: ( ( 'project' ) )
            // InternalLcDsl.g:1696:1: ( 'project' )
            {
            // InternalLcDsl.g:1696:1: ( 'project' )
            // InternalLcDsl.g:1697:2: 'project'
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
    // InternalLcDsl.g:1706:1: rule__LaunchConfig__Group_6_4__1 : rule__LaunchConfig__Group_6_4__1__Impl rule__LaunchConfig__Group_6_4__2 ;
    public final void rule__LaunchConfig__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1710:1: ( rule__LaunchConfig__Group_6_4__1__Impl rule__LaunchConfig__Group_6_4__2 )
            // InternalLcDsl.g:1711:2: rule__LaunchConfig__Group_6_4__1__Impl rule__LaunchConfig__Group_6_4__2
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
    // InternalLcDsl.g:1718:1: rule__LaunchConfig__Group_6_4__1__Impl : ( ( rule__LaunchConfig__ProjectAssignment_6_4_1 ) ) ;
    public final void rule__LaunchConfig__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1722:1: ( ( ( rule__LaunchConfig__ProjectAssignment_6_4_1 ) ) )
            // InternalLcDsl.g:1723:1: ( ( rule__LaunchConfig__ProjectAssignment_6_4_1 ) )
            {
            // InternalLcDsl.g:1723:1: ( ( rule__LaunchConfig__ProjectAssignment_6_4_1 ) )
            // InternalLcDsl.g:1724:2: ( rule__LaunchConfig__ProjectAssignment_6_4_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getProjectAssignment_6_4_1()); 
            // InternalLcDsl.g:1725:2: ( rule__LaunchConfig__ProjectAssignment_6_4_1 )
            // InternalLcDsl.g:1725:3: rule__LaunchConfig__ProjectAssignment_6_4_1
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
    // InternalLcDsl.g:1733:1: rule__LaunchConfig__Group_6_4__2 : rule__LaunchConfig__Group_6_4__2__Impl ;
    public final void rule__LaunchConfig__Group_6_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1737:1: ( rule__LaunchConfig__Group_6_4__2__Impl )
            // InternalLcDsl.g:1738:2: rule__LaunchConfig__Group_6_4__2__Impl
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
    // InternalLcDsl.g:1744:1: rule__LaunchConfig__Group_6_4__2__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1748:1: ( ( ';' ) )
            // InternalLcDsl.g:1749:1: ( ';' )
            {
            // InternalLcDsl.g:1749:1: ( ';' )
            // InternalLcDsl.g:1750:2: ';'
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
    // InternalLcDsl.g:1760:1: rule__LaunchConfig__Group_6_5__0 : rule__LaunchConfig__Group_6_5__0__Impl rule__LaunchConfig__Group_6_5__1 ;
    public final void rule__LaunchConfig__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1764:1: ( rule__LaunchConfig__Group_6_5__0__Impl rule__LaunchConfig__Group_6_5__1 )
            // InternalLcDsl.g:1765:2: rule__LaunchConfig__Group_6_5__0__Impl rule__LaunchConfig__Group_6_5__1
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
    // InternalLcDsl.g:1772:1: rule__LaunchConfig__Group_6_5__0__Impl : ( 'main-class' ) ;
    public final void rule__LaunchConfig__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1776:1: ( ( 'main-class' ) )
            // InternalLcDsl.g:1777:1: ( 'main-class' )
            {
            // InternalLcDsl.g:1777:1: ( 'main-class' )
            // InternalLcDsl.g:1778:2: 'main-class'
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
    // InternalLcDsl.g:1787:1: rule__LaunchConfig__Group_6_5__1 : rule__LaunchConfig__Group_6_5__1__Impl rule__LaunchConfig__Group_6_5__2 ;
    public final void rule__LaunchConfig__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1791:1: ( rule__LaunchConfig__Group_6_5__1__Impl rule__LaunchConfig__Group_6_5__2 )
            // InternalLcDsl.g:1792:2: rule__LaunchConfig__Group_6_5__1__Impl rule__LaunchConfig__Group_6_5__2
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
    // InternalLcDsl.g:1799:1: rule__LaunchConfig__Group_6_5__1__Impl : ( ( rule__LaunchConfig__MainClassAssignment_6_5_1 ) ) ;
    public final void rule__LaunchConfig__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1803:1: ( ( ( rule__LaunchConfig__MainClassAssignment_6_5_1 ) ) )
            // InternalLcDsl.g:1804:1: ( ( rule__LaunchConfig__MainClassAssignment_6_5_1 ) )
            {
            // InternalLcDsl.g:1804:1: ( ( rule__LaunchConfig__MainClassAssignment_6_5_1 ) )
            // InternalLcDsl.g:1805:2: ( rule__LaunchConfig__MainClassAssignment_6_5_1 )
            {
             before(grammarAccess.getLaunchConfigAccess().getMainClassAssignment_6_5_1()); 
            // InternalLcDsl.g:1806:2: ( rule__LaunchConfig__MainClassAssignment_6_5_1 )
            // InternalLcDsl.g:1806:3: rule__LaunchConfig__MainClassAssignment_6_5_1
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
    // InternalLcDsl.g:1814:1: rule__LaunchConfig__Group_6_5__2 : rule__LaunchConfig__Group_6_5__2__Impl ;
    public final void rule__LaunchConfig__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1818:1: ( rule__LaunchConfig__Group_6_5__2__Impl )
            // InternalLcDsl.g:1819:2: rule__LaunchConfig__Group_6_5__2__Impl
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
    // InternalLcDsl.g:1825:1: rule__LaunchConfig__Group_6_5__2__Impl : ( ';' ) ;
    public final void rule__LaunchConfig__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1829:1: ( ( ';' ) )
            // InternalLcDsl.g:1830:1: ( ';' )
            {
            // InternalLcDsl.g:1830:1: ( ';' )
            // InternalLcDsl.g:1831:2: ';'
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
    // InternalLcDsl.g:1841:1: rule__AddPlugin__Group__0 : rule__AddPlugin__Group__0__Impl rule__AddPlugin__Group__1 ;
    public final void rule__AddPlugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1845:1: ( rule__AddPlugin__Group__0__Impl rule__AddPlugin__Group__1 )
            // InternalLcDsl.g:1846:2: rule__AddPlugin__Group__0__Impl rule__AddPlugin__Group__1
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
    // InternalLcDsl.g:1853:1: rule__AddPlugin__Group__0__Impl : ( 'plugin' ) ;
    public final void rule__AddPlugin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1857:1: ( ( 'plugin' ) )
            // InternalLcDsl.g:1858:1: ( 'plugin' )
            {
            // InternalLcDsl.g:1858:1: ( 'plugin' )
            // InternalLcDsl.g:1859:2: 'plugin'
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
    // InternalLcDsl.g:1868:1: rule__AddPlugin__Group__1 : rule__AddPlugin__Group__1__Impl rule__AddPlugin__Group__2 ;
    public final void rule__AddPlugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1872:1: ( rule__AddPlugin__Group__1__Impl rule__AddPlugin__Group__2 )
            // InternalLcDsl.g:1873:2: rule__AddPlugin__Group__1__Impl rule__AddPlugin__Group__2
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
    // InternalLcDsl.g:1880:1: rule__AddPlugin__Group__1__Impl : ( ( rule__AddPlugin__PluginAssignment_1 ) ) ;
    public final void rule__AddPlugin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1884:1: ( ( ( rule__AddPlugin__PluginAssignment_1 ) ) )
            // InternalLcDsl.g:1885:1: ( ( rule__AddPlugin__PluginAssignment_1 ) )
            {
            // InternalLcDsl.g:1885:1: ( ( rule__AddPlugin__PluginAssignment_1 ) )
            // InternalLcDsl.g:1886:2: ( rule__AddPlugin__PluginAssignment_1 )
            {
             before(grammarAccess.getAddPluginAccess().getPluginAssignment_1()); 
            // InternalLcDsl.g:1887:2: ( rule__AddPlugin__PluginAssignment_1 )
            // InternalLcDsl.g:1887:3: rule__AddPlugin__PluginAssignment_1
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
    // InternalLcDsl.g:1895:1: rule__AddPlugin__Group__2 : rule__AddPlugin__Group__2__Impl ;
    public final void rule__AddPlugin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1899:1: ( rule__AddPlugin__Group__2__Impl )
            // InternalLcDsl.g:1900:2: rule__AddPlugin__Group__2__Impl
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
    // InternalLcDsl.g:1906:1: rule__AddPlugin__Group__2__Impl : ( ';' ) ;
    public final void rule__AddPlugin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1910:1: ( ( ';' ) )
            // InternalLcDsl.g:1911:1: ( ';' )
            {
            // InternalLcDsl.g:1911:1: ( ';' )
            // InternalLcDsl.g:1912:2: ';'
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
    // InternalLcDsl.g:1922:1: rule__IgnorePlugin__Group__0 : rule__IgnorePlugin__Group__0__Impl rule__IgnorePlugin__Group__1 ;
    public final void rule__IgnorePlugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1926:1: ( rule__IgnorePlugin__Group__0__Impl rule__IgnorePlugin__Group__1 )
            // InternalLcDsl.g:1927:2: rule__IgnorePlugin__Group__0__Impl rule__IgnorePlugin__Group__1
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
    // InternalLcDsl.g:1934:1: rule__IgnorePlugin__Group__0__Impl : ( 'ignore' ) ;
    public final void rule__IgnorePlugin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1938:1: ( ( 'ignore' ) )
            // InternalLcDsl.g:1939:1: ( 'ignore' )
            {
            // InternalLcDsl.g:1939:1: ( 'ignore' )
            // InternalLcDsl.g:1940:2: 'ignore'
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
    // InternalLcDsl.g:1949:1: rule__IgnorePlugin__Group__1 : rule__IgnorePlugin__Group__1__Impl rule__IgnorePlugin__Group__2 ;
    public final void rule__IgnorePlugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1953:1: ( rule__IgnorePlugin__Group__1__Impl rule__IgnorePlugin__Group__2 )
            // InternalLcDsl.g:1954:2: rule__IgnorePlugin__Group__1__Impl rule__IgnorePlugin__Group__2
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
    // InternalLcDsl.g:1961:1: rule__IgnorePlugin__Group__1__Impl : ( ( rule__IgnorePlugin__PluginAssignment_1 ) ) ;
    public final void rule__IgnorePlugin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1965:1: ( ( ( rule__IgnorePlugin__PluginAssignment_1 ) ) )
            // InternalLcDsl.g:1966:1: ( ( rule__IgnorePlugin__PluginAssignment_1 ) )
            {
            // InternalLcDsl.g:1966:1: ( ( rule__IgnorePlugin__PluginAssignment_1 ) )
            // InternalLcDsl.g:1967:2: ( rule__IgnorePlugin__PluginAssignment_1 )
            {
             before(grammarAccess.getIgnorePluginAccess().getPluginAssignment_1()); 
            // InternalLcDsl.g:1968:2: ( rule__IgnorePlugin__PluginAssignment_1 )
            // InternalLcDsl.g:1968:3: rule__IgnorePlugin__PluginAssignment_1
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
    // InternalLcDsl.g:1976:1: rule__IgnorePlugin__Group__2 : rule__IgnorePlugin__Group__2__Impl ;
    public final void rule__IgnorePlugin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1980:1: ( rule__IgnorePlugin__Group__2__Impl )
            // InternalLcDsl.g:1981:2: rule__IgnorePlugin__Group__2__Impl
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
    // InternalLcDsl.g:1987:1: rule__IgnorePlugin__Group__2__Impl : ( ';' ) ;
    public final void rule__IgnorePlugin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:1991:1: ( ( ';' ) )
            // InternalLcDsl.g:1992:1: ( ';' )
            {
            // InternalLcDsl.g:1992:1: ( ';' )
            // InternalLcDsl.g:1993:2: ';'
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
    // InternalLcDsl.g:2003:1: rule__VmArgument__Group__0 : rule__VmArgument__Group__0__Impl rule__VmArgument__Group__1 ;
    public final void rule__VmArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2007:1: ( rule__VmArgument__Group__0__Impl rule__VmArgument__Group__1 )
            // InternalLcDsl.g:2008:2: rule__VmArgument__Group__0__Impl rule__VmArgument__Group__1
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
    // InternalLcDsl.g:2015:1: rule__VmArgument__Group__0__Impl : ( () ) ;
    public final void rule__VmArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2019:1: ( ( () ) )
            // InternalLcDsl.g:2020:1: ( () )
            {
            // InternalLcDsl.g:2020:1: ( () )
            // InternalLcDsl.g:2021:2: ()
            {
             before(grammarAccess.getVmArgumentAccess().getVmArgumentAction_0()); 
            // InternalLcDsl.g:2022:2: ()
            // InternalLcDsl.g:2022:3: 
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
    // InternalLcDsl.g:2030:1: rule__VmArgument__Group__1 : rule__VmArgument__Group__1__Impl rule__VmArgument__Group__2 ;
    public final void rule__VmArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2034:1: ( rule__VmArgument__Group__1__Impl rule__VmArgument__Group__2 )
            // InternalLcDsl.g:2035:2: rule__VmArgument__Group__1__Impl rule__VmArgument__Group__2
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
    // InternalLcDsl.g:2042:1: rule__VmArgument__Group__1__Impl : ( 'vm-arg' ) ;
    public final void rule__VmArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2046:1: ( ( 'vm-arg' ) )
            // InternalLcDsl.g:2047:1: ( 'vm-arg' )
            {
            // InternalLcDsl.g:2047:1: ( 'vm-arg' )
            // InternalLcDsl.g:2048:2: 'vm-arg'
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
    // InternalLcDsl.g:2057:1: rule__VmArgument__Group__2 : rule__VmArgument__Group__2__Impl rule__VmArgument__Group__3 ;
    public final void rule__VmArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2061:1: ( rule__VmArgument__Group__2__Impl rule__VmArgument__Group__3 )
            // InternalLcDsl.g:2062:2: rule__VmArgument__Group__2__Impl rule__VmArgument__Group__3
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
    // InternalLcDsl.g:2069:1: rule__VmArgument__Group__2__Impl : ( ( rule__VmArgument__ArgumentsAssignment_2 )* ) ;
    public final void rule__VmArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2073:1: ( ( ( rule__VmArgument__ArgumentsAssignment_2 )* ) )
            // InternalLcDsl.g:2074:1: ( ( rule__VmArgument__ArgumentsAssignment_2 )* )
            {
            // InternalLcDsl.g:2074:1: ( ( rule__VmArgument__ArgumentsAssignment_2 )* )
            // InternalLcDsl.g:2075:2: ( rule__VmArgument__ArgumentsAssignment_2 )*
            {
             before(grammarAccess.getVmArgumentAccess().getArgumentsAssignment_2()); 
            // InternalLcDsl.g:2076:2: ( rule__VmArgument__ArgumentsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLcDsl.g:2076:3: rule__VmArgument__ArgumentsAssignment_2
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
    // InternalLcDsl.g:2084:1: rule__VmArgument__Group__3 : rule__VmArgument__Group__3__Impl ;
    public final void rule__VmArgument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2088:1: ( rule__VmArgument__Group__3__Impl )
            // InternalLcDsl.g:2089:2: rule__VmArgument__Group__3__Impl
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
    // InternalLcDsl.g:2095:1: rule__VmArgument__Group__3__Impl : ( ';' ) ;
    public final void rule__VmArgument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2099:1: ( ( ';' ) )
            // InternalLcDsl.g:2100:1: ( ';' )
            {
            // InternalLcDsl.g:2100:1: ( ';' )
            // InternalLcDsl.g:2101:2: ';'
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
    // InternalLcDsl.g:2111:1: rule__ProgramArgument__Group__0 : rule__ProgramArgument__Group__0__Impl rule__ProgramArgument__Group__1 ;
    public final void rule__ProgramArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2115:1: ( rule__ProgramArgument__Group__0__Impl rule__ProgramArgument__Group__1 )
            // InternalLcDsl.g:2116:2: rule__ProgramArgument__Group__0__Impl rule__ProgramArgument__Group__1
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
    // InternalLcDsl.g:2123:1: rule__ProgramArgument__Group__0__Impl : ( () ) ;
    public final void rule__ProgramArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2127:1: ( ( () ) )
            // InternalLcDsl.g:2128:1: ( () )
            {
            // InternalLcDsl.g:2128:1: ( () )
            // InternalLcDsl.g:2129:2: ()
            {
             before(grammarAccess.getProgramArgumentAccess().getProgramArgumentAction_0()); 
            // InternalLcDsl.g:2130:2: ()
            // InternalLcDsl.g:2130:3: 
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
    // InternalLcDsl.g:2138:1: rule__ProgramArgument__Group__1 : rule__ProgramArgument__Group__1__Impl rule__ProgramArgument__Group__2 ;
    public final void rule__ProgramArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2142:1: ( rule__ProgramArgument__Group__1__Impl rule__ProgramArgument__Group__2 )
            // InternalLcDsl.g:2143:2: rule__ProgramArgument__Group__1__Impl rule__ProgramArgument__Group__2
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
    // InternalLcDsl.g:2150:1: rule__ProgramArgument__Group__1__Impl : ( 'argument' ) ;
    public final void rule__ProgramArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2154:1: ( ( 'argument' ) )
            // InternalLcDsl.g:2155:1: ( 'argument' )
            {
            // InternalLcDsl.g:2155:1: ( 'argument' )
            // InternalLcDsl.g:2156:2: 'argument'
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
    // InternalLcDsl.g:2165:1: rule__ProgramArgument__Group__2 : rule__ProgramArgument__Group__2__Impl rule__ProgramArgument__Group__3 ;
    public final void rule__ProgramArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2169:1: ( rule__ProgramArgument__Group__2__Impl rule__ProgramArgument__Group__3 )
            // InternalLcDsl.g:2170:2: rule__ProgramArgument__Group__2__Impl rule__ProgramArgument__Group__3
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
    // InternalLcDsl.g:2177:1: rule__ProgramArgument__Group__2__Impl : ( ( rule__ProgramArgument__ArgumentsAssignment_2 )* ) ;
    public final void rule__ProgramArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2181:1: ( ( ( rule__ProgramArgument__ArgumentsAssignment_2 )* ) )
            // InternalLcDsl.g:2182:1: ( ( rule__ProgramArgument__ArgumentsAssignment_2 )* )
            {
            // InternalLcDsl.g:2182:1: ( ( rule__ProgramArgument__ArgumentsAssignment_2 )* )
            // InternalLcDsl.g:2183:2: ( rule__ProgramArgument__ArgumentsAssignment_2 )*
            {
             before(grammarAccess.getProgramArgumentAccess().getArgumentsAssignment_2()); 
            // InternalLcDsl.g:2184:2: ( rule__ProgramArgument__ArgumentsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLcDsl.g:2184:3: rule__ProgramArgument__ArgumentsAssignment_2
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
    // InternalLcDsl.g:2192:1: rule__ProgramArgument__Group__3 : rule__ProgramArgument__Group__3__Impl ;
    public final void rule__ProgramArgument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2196:1: ( rule__ProgramArgument__Group__3__Impl )
            // InternalLcDsl.g:2197:2: rule__ProgramArgument__Group__3__Impl
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
    // InternalLcDsl.g:2203:1: rule__ProgramArgument__Group__3__Impl : ( ';' ) ;
    public final void rule__ProgramArgument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2207:1: ( ( ';' ) )
            // InternalLcDsl.g:2208:1: ( ';' )
            {
            // InternalLcDsl.g:2208:1: ( ';' )
            // InternalLcDsl.g:2209:2: ';'
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
    // InternalLcDsl.g:2219:1: rule__EnvironmentVariable__Group__0 : rule__EnvironmentVariable__Group__0__Impl rule__EnvironmentVariable__Group__1 ;
    public final void rule__EnvironmentVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2223:1: ( rule__EnvironmentVariable__Group__0__Impl rule__EnvironmentVariable__Group__1 )
            // InternalLcDsl.g:2224:2: rule__EnvironmentVariable__Group__0__Impl rule__EnvironmentVariable__Group__1
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
    // InternalLcDsl.g:2231:1: rule__EnvironmentVariable__Group__0__Impl : ( () ) ;
    public final void rule__EnvironmentVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2235:1: ( ( () ) )
            // InternalLcDsl.g:2236:1: ( () )
            {
            // InternalLcDsl.g:2236:1: ( () )
            // InternalLcDsl.g:2237:2: ()
            {
             before(grammarAccess.getEnvironmentVariableAccess().getEnvironmentVariableAction_0()); 
            // InternalLcDsl.g:2238:2: ()
            // InternalLcDsl.g:2238:3: 
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
    // InternalLcDsl.g:2246:1: rule__EnvironmentVariable__Group__1 : rule__EnvironmentVariable__Group__1__Impl rule__EnvironmentVariable__Group__2 ;
    public final void rule__EnvironmentVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2250:1: ( rule__EnvironmentVariable__Group__1__Impl rule__EnvironmentVariable__Group__2 )
            // InternalLcDsl.g:2251:2: rule__EnvironmentVariable__Group__1__Impl rule__EnvironmentVariable__Group__2
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
    // InternalLcDsl.g:2258:1: rule__EnvironmentVariable__Group__1__Impl : ( 'environment' ) ;
    public final void rule__EnvironmentVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2262:1: ( ( 'environment' ) )
            // InternalLcDsl.g:2263:1: ( 'environment' )
            {
            // InternalLcDsl.g:2263:1: ( 'environment' )
            // InternalLcDsl.g:2264:2: 'environment'
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
    // InternalLcDsl.g:2273:1: rule__EnvironmentVariable__Group__2 : rule__EnvironmentVariable__Group__2__Impl rule__EnvironmentVariable__Group__3 ;
    public final void rule__EnvironmentVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2277:1: ( rule__EnvironmentVariable__Group__2__Impl rule__EnvironmentVariable__Group__3 )
            // InternalLcDsl.g:2278:2: rule__EnvironmentVariable__Group__2__Impl rule__EnvironmentVariable__Group__3
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
    // InternalLcDsl.g:2285:1: rule__EnvironmentVariable__Group__2__Impl : ( ( rule__EnvironmentVariable__NameAssignment_2 ) ) ;
    public final void rule__EnvironmentVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2289:1: ( ( ( rule__EnvironmentVariable__NameAssignment_2 ) ) )
            // InternalLcDsl.g:2290:1: ( ( rule__EnvironmentVariable__NameAssignment_2 ) )
            {
            // InternalLcDsl.g:2290:1: ( ( rule__EnvironmentVariable__NameAssignment_2 ) )
            // InternalLcDsl.g:2291:2: ( rule__EnvironmentVariable__NameAssignment_2 )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getNameAssignment_2()); 
            // InternalLcDsl.g:2292:2: ( rule__EnvironmentVariable__NameAssignment_2 )
            // InternalLcDsl.g:2292:3: rule__EnvironmentVariable__NameAssignment_2
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
    // InternalLcDsl.g:2300:1: rule__EnvironmentVariable__Group__3 : rule__EnvironmentVariable__Group__3__Impl rule__EnvironmentVariable__Group__4 ;
    public final void rule__EnvironmentVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2304:1: ( rule__EnvironmentVariable__Group__3__Impl rule__EnvironmentVariable__Group__4 )
            // InternalLcDsl.g:2305:2: rule__EnvironmentVariable__Group__3__Impl rule__EnvironmentVariable__Group__4
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
    // InternalLcDsl.g:2312:1: rule__EnvironmentVariable__Group__3__Impl : ( RULE_EQ ) ;
    public final void rule__EnvironmentVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2316:1: ( ( RULE_EQ ) )
            // InternalLcDsl.g:2317:1: ( RULE_EQ )
            {
            // InternalLcDsl.g:2317:1: ( RULE_EQ )
            // InternalLcDsl.g:2318:2: RULE_EQ
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
    // InternalLcDsl.g:2327:1: rule__EnvironmentVariable__Group__4 : rule__EnvironmentVariable__Group__4__Impl rule__EnvironmentVariable__Group__5 ;
    public final void rule__EnvironmentVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2331:1: ( rule__EnvironmentVariable__Group__4__Impl rule__EnvironmentVariable__Group__5 )
            // InternalLcDsl.g:2332:2: rule__EnvironmentVariable__Group__4__Impl rule__EnvironmentVariable__Group__5
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
    // InternalLcDsl.g:2339:1: rule__EnvironmentVariable__Group__4__Impl : ( ( rule__EnvironmentVariable__ValueAssignment_4 ) ) ;
    public final void rule__EnvironmentVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2343:1: ( ( ( rule__EnvironmentVariable__ValueAssignment_4 ) ) )
            // InternalLcDsl.g:2344:1: ( ( rule__EnvironmentVariable__ValueAssignment_4 ) )
            {
            // InternalLcDsl.g:2344:1: ( ( rule__EnvironmentVariable__ValueAssignment_4 ) )
            // InternalLcDsl.g:2345:2: ( rule__EnvironmentVariable__ValueAssignment_4 )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getValueAssignment_4()); 
            // InternalLcDsl.g:2346:2: ( rule__EnvironmentVariable__ValueAssignment_4 )
            // InternalLcDsl.g:2346:3: rule__EnvironmentVariable__ValueAssignment_4
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
    // InternalLcDsl.g:2354:1: rule__EnvironmentVariable__Group__5 : rule__EnvironmentVariable__Group__5__Impl ;
    public final void rule__EnvironmentVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2358:1: ( rule__EnvironmentVariable__Group__5__Impl )
            // InternalLcDsl.g:2359:2: rule__EnvironmentVariable__Group__5__Impl
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
    // InternalLcDsl.g:2365:1: rule__EnvironmentVariable__Group__5__Impl : ( ';' ) ;
    public final void rule__EnvironmentVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2369:1: ( ( ';' ) )
            // InternalLcDsl.g:2370:1: ( ';' )
            {
            // InternalLcDsl.g:2370:1: ( ';' )
            // InternalLcDsl.g:2371:2: ';'
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
    // InternalLcDsl.g:2381:1: rule__ApplicationExtPoint__Group__0 : rule__ApplicationExtPoint__Group__0__Impl rule__ApplicationExtPoint__Group__1 ;
    public final void rule__ApplicationExtPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2385:1: ( rule__ApplicationExtPoint__Group__0__Impl rule__ApplicationExtPoint__Group__1 )
            // InternalLcDsl.g:2386:2: rule__ApplicationExtPoint__Group__0__Impl rule__ApplicationExtPoint__Group__1
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
    // InternalLcDsl.g:2393:1: rule__ApplicationExtPoint__Group__0__Impl : ( 'application' ) ;
    public final void rule__ApplicationExtPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2397:1: ( ( 'application' ) )
            // InternalLcDsl.g:2398:1: ( 'application' )
            {
            // InternalLcDsl.g:2398:1: ( 'application' )
            // InternalLcDsl.g:2399:2: 'application'
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
    // InternalLcDsl.g:2408:1: rule__ApplicationExtPoint__Group__1 : rule__ApplicationExtPoint__Group__1__Impl rule__ApplicationExtPoint__Group__2 ;
    public final void rule__ApplicationExtPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2412:1: ( rule__ApplicationExtPoint__Group__1__Impl rule__ApplicationExtPoint__Group__2 )
            // InternalLcDsl.g:2413:2: rule__ApplicationExtPoint__Group__1__Impl rule__ApplicationExtPoint__Group__2
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
    // InternalLcDsl.g:2420:1: rule__ApplicationExtPoint__Group__1__Impl : ( ( rule__ApplicationExtPoint__NameAssignment_1 ) ) ;
    public final void rule__ApplicationExtPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2424:1: ( ( ( rule__ApplicationExtPoint__NameAssignment_1 ) ) )
            // InternalLcDsl.g:2425:1: ( ( rule__ApplicationExtPoint__NameAssignment_1 ) )
            {
            // InternalLcDsl.g:2425:1: ( ( rule__ApplicationExtPoint__NameAssignment_1 ) )
            // InternalLcDsl.g:2426:2: ( rule__ApplicationExtPoint__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationExtPointAccess().getNameAssignment_1()); 
            // InternalLcDsl.g:2427:2: ( rule__ApplicationExtPoint__NameAssignment_1 )
            // InternalLcDsl.g:2427:3: rule__ApplicationExtPoint__NameAssignment_1
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
    // InternalLcDsl.g:2435:1: rule__ApplicationExtPoint__Group__2 : rule__ApplicationExtPoint__Group__2__Impl ;
    public final void rule__ApplicationExtPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2439:1: ( rule__ApplicationExtPoint__Group__2__Impl )
            // InternalLcDsl.g:2440:2: rule__ApplicationExtPoint__Group__2__Impl
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
    // InternalLcDsl.g:2446:1: rule__ApplicationExtPoint__Group__2__Impl : ( ';' ) ;
    public final void rule__ApplicationExtPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2450:1: ( ( ';' ) )
            // InternalLcDsl.g:2451:1: ( ';' )
            {
            // InternalLcDsl.g:2451:1: ( ';' )
            // InternalLcDsl.g:2452:2: ';'
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
    // InternalLcDsl.g:2462:1: rule__ProductExtPoint__Group__0 : rule__ProductExtPoint__Group__0__Impl rule__ProductExtPoint__Group__1 ;
    public final void rule__ProductExtPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2466:1: ( rule__ProductExtPoint__Group__0__Impl rule__ProductExtPoint__Group__1 )
            // InternalLcDsl.g:2467:2: rule__ProductExtPoint__Group__0__Impl rule__ProductExtPoint__Group__1
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
    // InternalLcDsl.g:2474:1: rule__ProductExtPoint__Group__0__Impl : ( 'product' ) ;
    public final void rule__ProductExtPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2478:1: ( ( 'product' ) )
            // InternalLcDsl.g:2479:1: ( 'product' )
            {
            // InternalLcDsl.g:2479:1: ( 'product' )
            // InternalLcDsl.g:2480:2: 'product'
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
    // InternalLcDsl.g:2489:1: rule__ProductExtPoint__Group__1 : rule__ProductExtPoint__Group__1__Impl rule__ProductExtPoint__Group__2 ;
    public final void rule__ProductExtPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2493:1: ( rule__ProductExtPoint__Group__1__Impl rule__ProductExtPoint__Group__2 )
            // InternalLcDsl.g:2494:2: rule__ProductExtPoint__Group__1__Impl rule__ProductExtPoint__Group__2
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
    // InternalLcDsl.g:2501:1: rule__ProductExtPoint__Group__1__Impl : ( ( rule__ProductExtPoint__NameAssignment_1 ) ) ;
    public final void rule__ProductExtPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2505:1: ( ( ( rule__ProductExtPoint__NameAssignment_1 ) ) )
            // InternalLcDsl.g:2506:1: ( ( rule__ProductExtPoint__NameAssignment_1 ) )
            {
            // InternalLcDsl.g:2506:1: ( ( rule__ProductExtPoint__NameAssignment_1 ) )
            // InternalLcDsl.g:2507:2: ( rule__ProductExtPoint__NameAssignment_1 )
            {
             before(grammarAccess.getProductExtPointAccess().getNameAssignment_1()); 
            // InternalLcDsl.g:2508:2: ( rule__ProductExtPoint__NameAssignment_1 )
            // InternalLcDsl.g:2508:3: rule__ProductExtPoint__NameAssignment_1
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
    // InternalLcDsl.g:2516:1: rule__ProductExtPoint__Group__2 : rule__ProductExtPoint__Group__2__Impl ;
    public final void rule__ProductExtPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2520:1: ( rule__ProductExtPoint__Group__2__Impl )
            // InternalLcDsl.g:2521:2: rule__ProductExtPoint__Group__2__Impl
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
    // InternalLcDsl.g:2527:1: rule__ProductExtPoint__Group__2__Impl : ( ';' ) ;
    public final void rule__ProductExtPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2531:1: ( ( ';' ) )
            // InternalLcDsl.g:2532:1: ( ';' )
            {
            // InternalLcDsl.g:2532:1: ( ';' )
            // InternalLcDsl.g:2533:2: ';'
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
    // InternalLcDsl.g:2543:1: rule__Favorites__Group__0 : rule__Favorites__Group__0__Impl rule__Favorites__Group__1 ;
    public final void rule__Favorites__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2547:1: ( rule__Favorites__Group__0__Impl rule__Favorites__Group__1 )
            // InternalLcDsl.g:2548:2: rule__Favorites__Group__0__Impl rule__Favorites__Group__1
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
    // InternalLcDsl.g:2555:1: rule__Favorites__Group__0__Impl : ( () ) ;
    public final void rule__Favorites__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2559:1: ( ( () ) )
            // InternalLcDsl.g:2560:1: ( () )
            {
            // InternalLcDsl.g:2560:1: ( () )
            // InternalLcDsl.g:2561:2: ()
            {
             before(grammarAccess.getFavoritesAccess().getFavoritesAction_0()); 
            // InternalLcDsl.g:2562:2: ()
            // InternalLcDsl.g:2562:3: 
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
    // InternalLcDsl.g:2570:1: rule__Favorites__Group__1 : rule__Favorites__Group__1__Impl rule__Favorites__Group__2 ;
    public final void rule__Favorites__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2574:1: ( rule__Favorites__Group__1__Impl rule__Favorites__Group__2 )
            // InternalLcDsl.g:2575:2: rule__Favorites__Group__1__Impl rule__Favorites__Group__2
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
    // InternalLcDsl.g:2582:1: rule__Favorites__Group__1__Impl : ( 'favorite' ) ;
    public final void rule__Favorites__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2586:1: ( ( 'favorite' ) )
            // InternalLcDsl.g:2587:1: ( 'favorite' )
            {
            // InternalLcDsl.g:2587:1: ( 'favorite' )
            // InternalLcDsl.g:2588:2: 'favorite'
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
    // InternalLcDsl.g:2597:1: rule__Favorites__Group__2 : rule__Favorites__Group__2__Impl rule__Favorites__Group__3 ;
    public final void rule__Favorites__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2601:1: ( rule__Favorites__Group__2__Impl rule__Favorites__Group__3 )
            // InternalLcDsl.g:2602:2: rule__Favorites__Group__2__Impl rule__Favorites__Group__3
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
    // InternalLcDsl.g:2609:1: rule__Favorites__Group__2__Impl : ( ( rule__Favorites__UnorderedGroup_2 ) ) ;
    public final void rule__Favorites__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2613:1: ( ( ( rule__Favorites__UnorderedGroup_2 ) ) )
            // InternalLcDsl.g:2614:1: ( ( rule__Favorites__UnorderedGroup_2 ) )
            {
            // InternalLcDsl.g:2614:1: ( ( rule__Favorites__UnorderedGroup_2 ) )
            // InternalLcDsl.g:2615:2: ( rule__Favorites__UnorderedGroup_2 )
            {
             before(grammarAccess.getFavoritesAccess().getUnorderedGroup_2()); 
            // InternalLcDsl.g:2616:2: ( rule__Favorites__UnorderedGroup_2 )
            // InternalLcDsl.g:2616:3: rule__Favorites__UnorderedGroup_2
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
    // InternalLcDsl.g:2624:1: rule__Favorites__Group__3 : rule__Favorites__Group__3__Impl ;
    public final void rule__Favorites__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2628:1: ( rule__Favorites__Group__3__Impl )
            // InternalLcDsl.g:2629:2: rule__Favorites__Group__3__Impl
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
    // InternalLcDsl.g:2635:1: rule__Favorites__Group__3__Impl : ( ';' ) ;
    public final void rule__Favorites__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2639:1: ( ( ';' ) )
            // InternalLcDsl.g:2640:1: ( ';' )
            {
            // InternalLcDsl.g:2640:1: ( ';' )
            // InternalLcDsl.g:2641:2: ';'
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
    // InternalLcDsl.g:2651:1: rule__Redirect__Group__0 : rule__Redirect__Group__0__Impl rule__Redirect__Group__1 ;
    public final void rule__Redirect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2655:1: ( rule__Redirect__Group__0__Impl rule__Redirect__Group__1 )
            // InternalLcDsl.g:2656:2: rule__Redirect__Group__0__Impl rule__Redirect__Group__1
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
    // InternalLcDsl.g:2663:1: rule__Redirect__Group__0__Impl : ( () ) ;
    public final void rule__Redirect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2667:1: ( ( () ) )
            // InternalLcDsl.g:2668:1: ( () )
            {
            // InternalLcDsl.g:2668:1: ( () )
            // InternalLcDsl.g:2669:2: ()
            {
             before(grammarAccess.getRedirectAccess().getRedirectAction_0()); 
            // InternalLcDsl.g:2670:2: ()
            // InternalLcDsl.g:2670:3: 
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
    // InternalLcDsl.g:2678:1: rule__Redirect__Group__1 : rule__Redirect__Group__1__Impl rule__Redirect__Group__2 ;
    public final void rule__Redirect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2682:1: ( rule__Redirect__Group__1__Impl rule__Redirect__Group__2 )
            // InternalLcDsl.g:2683:2: rule__Redirect__Group__1__Impl rule__Redirect__Group__2
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
    // InternalLcDsl.g:2690:1: rule__Redirect__Group__1__Impl : ( 'redirect' ) ;
    public final void rule__Redirect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2694:1: ( ( 'redirect' ) )
            // InternalLcDsl.g:2695:1: ( 'redirect' )
            {
            // InternalLcDsl.g:2695:1: ( 'redirect' )
            // InternalLcDsl.g:2696:2: 'redirect'
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
    // InternalLcDsl.g:2705:1: rule__Redirect__Group__2 : rule__Redirect__Group__2__Impl rule__Redirect__Group__3 ;
    public final void rule__Redirect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2709:1: ( rule__Redirect__Group__2__Impl rule__Redirect__Group__3 )
            // InternalLcDsl.g:2710:2: rule__Redirect__Group__2__Impl rule__Redirect__Group__3
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
    // InternalLcDsl.g:2717:1: rule__Redirect__Group__2__Impl : ( ( rule__Redirect__UnorderedGroup_2 ) ) ;
    public final void rule__Redirect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2721:1: ( ( ( rule__Redirect__UnorderedGroup_2 ) ) )
            // InternalLcDsl.g:2722:1: ( ( rule__Redirect__UnorderedGroup_2 ) )
            {
            // InternalLcDsl.g:2722:1: ( ( rule__Redirect__UnorderedGroup_2 ) )
            // InternalLcDsl.g:2723:2: ( rule__Redirect__UnorderedGroup_2 )
            {
             before(grammarAccess.getRedirectAccess().getUnorderedGroup_2()); 
            // InternalLcDsl.g:2724:2: ( rule__Redirect__UnorderedGroup_2 )
            // InternalLcDsl.g:2724:3: rule__Redirect__UnorderedGroup_2
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
    // InternalLcDsl.g:2732:1: rule__Redirect__Group__3 : rule__Redirect__Group__3__Impl ;
    public final void rule__Redirect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2736:1: ( rule__Redirect__Group__3__Impl )
            // InternalLcDsl.g:2737:2: rule__Redirect__Group__3__Impl
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
    // InternalLcDsl.g:2743:1: rule__Redirect__Group__3__Impl : ( ';' ) ;
    public final void rule__Redirect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2747:1: ( ( ';' ) )
            // InternalLcDsl.g:2748:1: ( ';' )
            {
            // InternalLcDsl.g:2748:1: ( ';' )
            // InternalLcDsl.g:2749:2: ';'
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
    // InternalLcDsl.g:2759:1: rule__Redirect__Group_2_0__0 : rule__Redirect__Group_2_0__0__Impl rule__Redirect__Group_2_0__1 ;
    public final void rule__Redirect__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2763:1: ( rule__Redirect__Group_2_0__0__Impl rule__Redirect__Group_2_0__1 )
            // InternalLcDsl.g:2764:2: rule__Redirect__Group_2_0__0__Impl rule__Redirect__Group_2_0__1
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
    // InternalLcDsl.g:2771:1: rule__Redirect__Group_2_0__0__Impl : ( ( rule__Redirect__OutWhichAssignment_2_0_0 ) ) ;
    public final void rule__Redirect__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2775:1: ( ( ( rule__Redirect__OutWhichAssignment_2_0_0 ) ) )
            // InternalLcDsl.g:2776:1: ( ( rule__Redirect__OutWhichAssignment_2_0_0 ) )
            {
            // InternalLcDsl.g:2776:1: ( ( rule__Redirect__OutWhichAssignment_2_0_0 ) )
            // InternalLcDsl.g:2777:2: ( rule__Redirect__OutWhichAssignment_2_0_0 )
            {
             before(grammarAccess.getRedirectAccess().getOutWhichAssignment_2_0_0()); 
            // InternalLcDsl.g:2778:2: ( rule__Redirect__OutWhichAssignment_2_0_0 )
            // InternalLcDsl.g:2778:3: rule__Redirect__OutWhichAssignment_2_0_0
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
    // InternalLcDsl.g:2786:1: rule__Redirect__Group_2_0__1 : rule__Redirect__Group_2_0__1__Impl rule__Redirect__Group_2_0__2 ;
    public final void rule__Redirect__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2790:1: ( rule__Redirect__Group_2_0__1__Impl rule__Redirect__Group_2_0__2 )
            // InternalLcDsl.g:2791:2: rule__Redirect__Group_2_0__1__Impl rule__Redirect__Group_2_0__2
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
    // InternalLcDsl.g:2798:1: rule__Redirect__Group_2_0__1__Impl : ( 'to' ) ;
    public final void rule__Redirect__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2802:1: ( ( 'to' ) )
            // InternalLcDsl.g:2803:1: ( 'to' )
            {
            // InternalLcDsl.g:2803:1: ( 'to' )
            // InternalLcDsl.g:2804:2: 'to'
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
    // InternalLcDsl.g:2813:1: rule__Redirect__Group_2_0__2 : rule__Redirect__Group_2_0__2__Impl ;
    public final void rule__Redirect__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2817:1: ( rule__Redirect__Group_2_0__2__Impl )
            // InternalLcDsl.g:2818:2: rule__Redirect__Group_2_0__2__Impl
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
    // InternalLcDsl.g:2824:1: rule__Redirect__Group_2_0__2__Impl : ( ( rule__Redirect__OutFileAssignment_2_0_2 ) ) ;
    public final void rule__Redirect__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2828:1: ( ( ( rule__Redirect__OutFileAssignment_2_0_2 ) ) )
            // InternalLcDsl.g:2829:1: ( ( rule__Redirect__OutFileAssignment_2_0_2 ) )
            {
            // InternalLcDsl.g:2829:1: ( ( rule__Redirect__OutFileAssignment_2_0_2 ) )
            // InternalLcDsl.g:2830:2: ( rule__Redirect__OutFileAssignment_2_0_2 )
            {
             before(grammarAccess.getRedirectAccess().getOutFileAssignment_2_0_2()); 
            // InternalLcDsl.g:2831:2: ( rule__Redirect__OutFileAssignment_2_0_2 )
            // InternalLcDsl.g:2831:3: rule__Redirect__OutFileAssignment_2_0_2
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
    // InternalLcDsl.g:2840:1: rule__Redirect__Group_2_1__0 : rule__Redirect__Group_2_1__0__Impl rule__Redirect__Group_2_1__1 ;
    public final void rule__Redirect__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2844:1: ( rule__Redirect__Group_2_1__0__Impl rule__Redirect__Group_2_1__1 )
            // InternalLcDsl.g:2845:2: rule__Redirect__Group_2_1__0__Impl rule__Redirect__Group_2_1__1
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
    // InternalLcDsl.g:2852:1: rule__Redirect__Group_2_1__0__Impl : ( ( rule__Redirect__InWhichAssignment_2_1_0 ) ) ;
    public final void rule__Redirect__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2856:1: ( ( ( rule__Redirect__InWhichAssignment_2_1_0 ) ) )
            // InternalLcDsl.g:2857:1: ( ( rule__Redirect__InWhichAssignment_2_1_0 ) )
            {
            // InternalLcDsl.g:2857:1: ( ( rule__Redirect__InWhichAssignment_2_1_0 ) )
            // InternalLcDsl.g:2858:2: ( rule__Redirect__InWhichAssignment_2_1_0 )
            {
             before(grammarAccess.getRedirectAccess().getInWhichAssignment_2_1_0()); 
            // InternalLcDsl.g:2859:2: ( rule__Redirect__InWhichAssignment_2_1_0 )
            // InternalLcDsl.g:2859:3: rule__Redirect__InWhichAssignment_2_1_0
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
    // InternalLcDsl.g:2867:1: rule__Redirect__Group_2_1__1 : rule__Redirect__Group_2_1__1__Impl rule__Redirect__Group_2_1__2 ;
    public final void rule__Redirect__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2871:1: ( rule__Redirect__Group_2_1__1__Impl rule__Redirect__Group_2_1__2 )
            // InternalLcDsl.g:2872:2: rule__Redirect__Group_2_1__1__Impl rule__Redirect__Group_2_1__2
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
    // InternalLcDsl.g:2879:1: rule__Redirect__Group_2_1__1__Impl : ( 'from' ) ;
    public final void rule__Redirect__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2883:1: ( ( 'from' ) )
            // InternalLcDsl.g:2884:1: ( 'from' )
            {
            // InternalLcDsl.g:2884:1: ( 'from' )
            // InternalLcDsl.g:2885:2: 'from'
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
    // InternalLcDsl.g:2894:1: rule__Redirect__Group_2_1__2 : rule__Redirect__Group_2_1__2__Impl ;
    public final void rule__Redirect__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2898:1: ( rule__Redirect__Group_2_1__2__Impl )
            // InternalLcDsl.g:2899:2: rule__Redirect__Group_2_1__2__Impl
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
    // InternalLcDsl.g:2905:1: rule__Redirect__Group_2_1__2__Impl : ( ( rule__Redirect__InFileAssignment_2_1_2 ) ) ;
    public final void rule__Redirect__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2909:1: ( ( ( rule__Redirect__InFileAssignment_2_1_2 ) ) )
            // InternalLcDsl.g:2910:1: ( ( rule__Redirect__InFileAssignment_2_1_2 ) )
            {
            // InternalLcDsl.g:2910:1: ( ( rule__Redirect__InFileAssignment_2_1_2 ) )
            // InternalLcDsl.g:2911:2: ( rule__Redirect__InFileAssignment_2_1_2 )
            {
             before(grammarAccess.getRedirectAccess().getInFileAssignment_2_1_2()); 
            // InternalLcDsl.g:2912:2: ( rule__Redirect__InFileAssignment_2_1_2 )
            // InternalLcDsl.g:2912:3: rule__Redirect__InFileAssignment_2_1_2
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
    // InternalLcDsl.g:2921:1: rule__ExecutionEnvironment__Group__0 : rule__ExecutionEnvironment__Group__0__Impl rule__ExecutionEnvironment__Group__1 ;
    public final void rule__ExecutionEnvironment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2925:1: ( rule__ExecutionEnvironment__Group__0__Impl rule__ExecutionEnvironment__Group__1 )
            // InternalLcDsl.g:2926:2: rule__ExecutionEnvironment__Group__0__Impl rule__ExecutionEnvironment__Group__1
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
    // InternalLcDsl.g:2933:1: rule__ExecutionEnvironment__Group__0__Impl : ( 'execution-environment' ) ;
    public final void rule__ExecutionEnvironment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2937:1: ( ( 'execution-environment' ) )
            // InternalLcDsl.g:2938:1: ( 'execution-environment' )
            {
            // InternalLcDsl.g:2938:1: ( 'execution-environment' )
            // InternalLcDsl.g:2939:2: 'execution-environment'
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
    // InternalLcDsl.g:2948:1: rule__ExecutionEnvironment__Group__1 : rule__ExecutionEnvironment__Group__1__Impl rule__ExecutionEnvironment__Group__2 ;
    public final void rule__ExecutionEnvironment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2952:1: ( rule__ExecutionEnvironment__Group__1__Impl rule__ExecutionEnvironment__Group__2 )
            // InternalLcDsl.g:2953:2: rule__ExecutionEnvironment__Group__1__Impl rule__ExecutionEnvironment__Group__2
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
    // InternalLcDsl.g:2960:1: rule__ExecutionEnvironment__Group__1__Impl : ( ( rule__ExecutionEnvironment__NameAssignment_1 ) ) ;
    public final void rule__ExecutionEnvironment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2964:1: ( ( ( rule__ExecutionEnvironment__NameAssignment_1 ) ) )
            // InternalLcDsl.g:2965:1: ( ( rule__ExecutionEnvironment__NameAssignment_1 ) )
            {
            // InternalLcDsl.g:2965:1: ( ( rule__ExecutionEnvironment__NameAssignment_1 ) )
            // InternalLcDsl.g:2966:2: ( rule__ExecutionEnvironment__NameAssignment_1 )
            {
             before(grammarAccess.getExecutionEnvironmentAccess().getNameAssignment_1()); 
            // InternalLcDsl.g:2967:2: ( rule__ExecutionEnvironment__NameAssignment_1 )
            // InternalLcDsl.g:2967:3: rule__ExecutionEnvironment__NameAssignment_1
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
    // InternalLcDsl.g:2975:1: rule__ExecutionEnvironment__Group__2 : rule__ExecutionEnvironment__Group__2__Impl ;
    public final void rule__ExecutionEnvironment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2979:1: ( rule__ExecutionEnvironment__Group__2__Impl )
            // InternalLcDsl.g:2980:2: rule__ExecutionEnvironment__Group__2__Impl
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
    // InternalLcDsl.g:2986:1: rule__ExecutionEnvironment__Group__2__Impl : ( ';' ) ;
    public final void rule__ExecutionEnvironment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:2990:1: ( ( ';' ) )
            // InternalLcDsl.g:2991:1: ( ';' )
            {
            // InternalLcDsl.g:2991:1: ( ';' )
            // InternalLcDsl.g:2992:2: ';'
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


    // $ANTLR start "rule__ConfigIniTemplate__Group__0"
    // InternalLcDsl.g:3002:1: rule__ConfigIniTemplate__Group__0 : rule__ConfigIniTemplate__Group__0__Impl rule__ConfigIniTemplate__Group__1 ;
    public final void rule__ConfigIniTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3006:1: ( rule__ConfigIniTemplate__Group__0__Impl rule__ConfigIniTemplate__Group__1 )
            // InternalLcDsl.g:3007:2: rule__ConfigIniTemplate__Group__0__Impl rule__ConfigIniTemplate__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ConfigIniTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigIniTemplate__Group__1();

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
    // $ANTLR end "rule__ConfigIniTemplate__Group__0"


    // $ANTLR start "rule__ConfigIniTemplate__Group__0__Impl"
    // InternalLcDsl.g:3014:1: rule__ConfigIniTemplate__Group__0__Impl : ( 'config-ini-template' ) ;
    public final void rule__ConfigIniTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3018:1: ( ( 'config-ini-template' ) )
            // InternalLcDsl.g:3019:1: ( 'config-ini-template' )
            {
            // InternalLcDsl.g:3019:1: ( 'config-ini-template' )
            // InternalLcDsl.g:3020:2: 'config-ini-template'
            {
             before(grammarAccess.getConfigIniTemplateAccess().getConfigIniTemplateKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getConfigIniTemplateAccess().getConfigIniTemplateKeyword_0()); 

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
    // $ANTLR end "rule__ConfigIniTemplate__Group__0__Impl"


    // $ANTLR start "rule__ConfigIniTemplate__Group__1"
    // InternalLcDsl.g:3029:1: rule__ConfigIniTemplate__Group__1 : rule__ConfigIniTemplate__Group__1__Impl rule__ConfigIniTemplate__Group__2 ;
    public final void rule__ConfigIniTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3033:1: ( rule__ConfigIniTemplate__Group__1__Impl rule__ConfigIniTemplate__Group__2 )
            // InternalLcDsl.g:3034:2: rule__ConfigIniTemplate__Group__1__Impl rule__ConfigIniTemplate__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ConfigIniTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigIniTemplate__Group__2();

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
    // $ANTLR end "rule__ConfigIniTemplate__Group__1"


    // $ANTLR start "rule__ConfigIniTemplate__Group__1__Impl"
    // InternalLcDsl.g:3041:1: rule__ConfigIniTemplate__Group__1__Impl : ( ( rule__ConfigIniTemplate__PathAssignment_1 ) ) ;
    public final void rule__ConfigIniTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3045:1: ( ( ( rule__ConfigIniTemplate__PathAssignment_1 ) ) )
            // InternalLcDsl.g:3046:1: ( ( rule__ConfigIniTemplate__PathAssignment_1 ) )
            {
            // InternalLcDsl.g:3046:1: ( ( rule__ConfigIniTemplate__PathAssignment_1 ) )
            // InternalLcDsl.g:3047:2: ( rule__ConfigIniTemplate__PathAssignment_1 )
            {
             before(grammarAccess.getConfigIniTemplateAccess().getPathAssignment_1()); 
            // InternalLcDsl.g:3048:2: ( rule__ConfigIniTemplate__PathAssignment_1 )
            // InternalLcDsl.g:3048:3: rule__ConfigIniTemplate__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigIniTemplate__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigIniTemplateAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__ConfigIniTemplate__Group__1__Impl"


    // $ANTLR start "rule__ConfigIniTemplate__Group__2"
    // InternalLcDsl.g:3056:1: rule__ConfigIniTemplate__Group__2 : rule__ConfigIniTemplate__Group__2__Impl ;
    public final void rule__ConfigIniTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3060:1: ( rule__ConfigIniTemplate__Group__2__Impl )
            // InternalLcDsl.g:3061:2: rule__ConfigIniTemplate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigIniTemplate__Group__2__Impl();

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
    // $ANTLR end "rule__ConfigIniTemplate__Group__2"


    // $ANTLR start "rule__ConfigIniTemplate__Group__2__Impl"
    // InternalLcDsl.g:3067:1: rule__ConfigIniTemplate__Group__2__Impl : ( ';' ) ;
    public final void rule__ConfigIniTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3071:1: ( ( ';' ) )
            // InternalLcDsl.g:3072:1: ( ';' )
            {
            // InternalLcDsl.g:3072:1: ( ';' )
            // InternalLcDsl.g:3073:2: ';'
            {
             before(grammarAccess.getConfigIniTemplateAccess().getSemicolonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConfigIniTemplateAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__ConfigIniTemplate__Group__2__Impl"


    // $ANTLR start "rule__TraceEnablement__Group__0"
    // InternalLcDsl.g:3083:1: rule__TraceEnablement__Group__0 : rule__TraceEnablement__Group__0__Impl rule__TraceEnablement__Group__1 ;
    public final void rule__TraceEnablement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3087:1: ( rule__TraceEnablement__Group__0__Impl rule__TraceEnablement__Group__1 )
            // InternalLcDsl.g:3088:2: rule__TraceEnablement__Group__0__Impl rule__TraceEnablement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TraceEnablement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceEnablement__Group__1();

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
    // $ANTLR end "rule__TraceEnablement__Group__0"


    // $ANTLR start "rule__TraceEnablement__Group__0__Impl"
    // InternalLcDsl.g:3095:1: rule__TraceEnablement__Group__0__Impl : ( 'trace' ) ;
    public final void rule__TraceEnablement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3099:1: ( ( 'trace' ) )
            // InternalLcDsl.g:3100:1: ( 'trace' )
            {
            // InternalLcDsl.g:3100:1: ( 'trace' )
            // InternalLcDsl.g:3101:2: 'trace'
            {
             before(grammarAccess.getTraceEnablementAccess().getTraceKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTraceEnablementAccess().getTraceKeyword_0()); 

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
    // $ANTLR end "rule__TraceEnablement__Group__0__Impl"


    // $ANTLR start "rule__TraceEnablement__Group__1"
    // InternalLcDsl.g:3110:1: rule__TraceEnablement__Group__1 : rule__TraceEnablement__Group__1__Impl rule__TraceEnablement__Group__2 ;
    public final void rule__TraceEnablement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3114:1: ( rule__TraceEnablement__Group__1__Impl rule__TraceEnablement__Group__2 )
            // InternalLcDsl.g:3115:2: rule__TraceEnablement__Group__1__Impl rule__TraceEnablement__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__TraceEnablement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceEnablement__Group__2();

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
    // $ANTLR end "rule__TraceEnablement__Group__1"


    // $ANTLR start "rule__TraceEnablement__Group__1__Impl"
    // InternalLcDsl.g:3122:1: rule__TraceEnablement__Group__1__Impl : ( ( rule__TraceEnablement__PluginAssignment_1 ) ) ;
    public final void rule__TraceEnablement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3126:1: ( ( ( rule__TraceEnablement__PluginAssignment_1 ) ) )
            // InternalLcDsl.g:3127:1: ( ( rule__TraceEnablement__PluginAssignment_1 ) )
            {
            // InternalLcDsl.g:3127:1: ( ( rule__TraceEnablement__PluginAssignment_1 ) )
            // InternalLcDsl.g:3128:2: ( rule__TraceEnablement__PluginAssignment_1 )
            {
             before(grammarAccess.getTraceEnablementAccess().getPluginAssignment_1()); 
            // InternalLcDsl.g:3129:2: ( rule__TraceEnablement__PluginAssignment_1 )
            // InternalLcDsl.g:3129:3: rule__TraceEnablement__PluginAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TraceEnablement__PluginAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceEnablementAccess().getPluginAssignment_1()); 

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
    // $ANTLR end "rule__TraceEnablement__Group__1__Impl"


    // $ANTLR start "rule__TraceEnablement__Group__2"
    // InternalLcDsl.g:3137:1: rule__TraceEnablement__Group__2 : rule__TraceEnablement__Group__2__Impl rule__TraceEnablement__Group__3 ;
    public final void rule__TraceEnablement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3141:1: ( rule__TraceEnablement__Group__2__Impl rule__TraceEnablement__Group__3 )
            // InternalLcDsl.g:3142:2: rule__TraceEnablement__Group__2__Impl rule__TraceEnablement__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__TraceEnablement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceEnablement__Group__3();

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
    // $ANTLR end "rule__TraceEnablement__Group__2"


    // $ANTLR start "rule__TraceEnablement__Group__2__Impl"
    // InternalLcDsl.g:3149:1: rule__TraceEnablement__Group__2__Impl : ( ( rule__TraceEnablement__WhatAssignment_2 )* ) ;
    public final void rule__TraceEnablement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3153:1: ( ( ( rule__TraceEnablement__WhatAssignment_2 )* ) )
            // InternalLcDsl.g:3154:1: ( ( rule__TraceEnablement__WhatAssignment_2 )* )
            {
            // InternalLcDsl.g:3154:1: ( ( rule__TraceEnablement__WhatAssignment_2 )* )
            // InternalLcDsl.g:3155:2: ( rule__TraceEnablement__WhatAssignment_2 )*
            {
             before(grammarAccess.getTraceEnablementAccess().getWhatAssignment_2()); 
            // InternalLcDsl.g:3156:2: ( rule__TraceEnablement__WhatAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLcDsl.g:3156:3: rule__TraceEnablement__WhatAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__TraceEnablement__WhatAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTraceEnablementAccess().getWhatAssignment_2()); 

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
    // $ANTLR end "rule__TraceEnablement__Group__2__Impl"


    // $ANTLR start "rule__TraceEnablement__Group__3"
    // InternalLcDsl.g:3164:1: rule__TraceEnablement__Group__3 : rule__TraceEnablement__Group__3__Impl ;
    public final void rule__TraceEnablement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3168:1: ( rule__TraceEnablement__Group__3__Impl )
            // InternalLcDsl.g:3169:2: rule__TraceEnablement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraceEnablement__Group__3__Impl();

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
    // $ANTLR end "rule__TraceEnablement__Group__3"


    // $ANTLR start "rule__TraceEnablement__Group__3__Impl"
    // InternalLcDsl.g:3175:1: rule__TraceEnablement__Group__3__Impl : ( ';' ) ;
    public final void rule__TraceEnablement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3179:1: ( ( ';' ) )
            // InternalLcDsl.g:3180:1: ( ';' )
            {
            // InternalLcDsl.g:3180:1: ( ';' )
            // InternalLcDsl.g:3181:2: ';'
            {
             before(grammarAccess.getTraceEnablementAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTraceEnablementAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__TraceEnablement__Group__3__Impl"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__Group__0"
    // InternalLcDsl.g:3191:1: rule__PluginWithVersionAndStartLevel__Group__0 : rule__PluginWithVersionAndStartLevel__Group__0__Impl rule__PluginWithVersionAndStartLevel__Group__1 ;
    public final void rule__PluginWithVersionAndStartLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3195:1: ( rule__PluginWithVersionAndStartLevel__Group__0__Impl rule__PluginWithVersionAndStartLevel__Group__1 )
            // InternalLcDsl.g:3196:2: rule__PluginWithVersionAndStartLevel__Group__0__Impl rule__PluginWithVersionAndStartLevel__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__PluginWithVersionAndStartLevel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PluginWithVersionAndStartLevel__Group__1();

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__Group__0"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__Group__0__Impl"
    // InternalLcDsl.g:3203:1: rule__PluginWithVersionAndStartLevel__Group__0__Impl : ( ( rule__PluginWithVersionAndStartLevel__PluginAssignment_0 ) ) ;
    public final void rule__PluginWithVersionAndStartLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3207:1: ( ( ( rule__PluginWithVersionAndStartLevel__PluginAssignment_0 ) ) )
            // InternalLcDsl.g:3208:1: ( ( rule__PluginWithVersionAndStartLevel__PluginAssignment_0 ) )
            {
            // InternalLcDsl.g:3208:1: ( ( rule__PluginWithVersionAndStartLevel__PluginAssignment_0 ) )
            // InternalLcDsl.g:3209:2: ( rule__PluginWithVersionAndStartLevel__PluginAssignment_0 )
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getPluginAssignment_0()); 
            // InternalLcDsl.g:3210:2: ( rule__PluginWithVersionAndStartLevel__PluginAssignment_0 )
            // InternalLcDsl.g:3210:3: rule__PluginWithVersionAndStartLevel__PluginAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PluginWithVersionAndStartLevel__PluginAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getPluginAssignment_0()); 

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__Group__0__Impl"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__Group__1"
    // InternalLcDsl.g:3218:1: rule__PluginWithVersionAndStartLevel__Group__1 : rule__PluginWithVersionAndStartLevel__Group__1__Impl ;
    public final void rule__PluginWithVersionAndStartLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3222:1: ( rule__PluginWithVersionAndStartLevel__Group__1__Impl )
            // InternalLcDsl.g:3223:2: rule__PluginWithVersionAndStartLevel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PluginWithVersionAndStartLevel__Group__1__Impl();

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__Group__1"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__Group__1__Impl"
    // InternalLcDsl.g:3229:1: rule__PluginWithVersionAndStartLevel__Group__1__Impl : ( ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1 ) ) ;
    public final void rule__PluginWithVersionAndStartLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3233:1: ( ( ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1 ) ) )
            // InternalLcDsl.g:3234:1: ( ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1 ) )
            {
            // InternalLcDsl.g:3234:1: ( ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1 ) )
            // InternalLcDsl.g:3235:2: ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1 )
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1()); 
            // InternalLcDsl.g:3236:2: ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1 )
            // InternalLcDsl.g:3236:3: rule__PluginWithVersionAndStartLevel__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__PluginWithVersionAndStartLevel__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1()); 

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__Group__1__Impl"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__Group_1_1__0"
    // InternalLcDsl.g:3245:1: rule__PluginWithVersionAndStartLevel__Group_1_1__0 : rule__PluginWithVersionAndStartLevel__Group_1_1__0__Impl rule__PluginWithVersionAndStartLevel__Group_1_1__1 ;
    public final void rule__PluginWithVersionAndStartLevel__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3249:1: ( rule__PluginWithVersionAndStartLevel__Group_1_1__0__Impl rule__PluginWithVersionAndStartLevel__Group_1_1__1 )
            // InternalLcDsl.g:3250:2: rule__PluginWithVersionAndStartLevel__Group_1_1__0__Impl rule__PluginWithVersionAndStartLevel__Group_1_1__1
            {
            pushFollow(FOLLOW_28);
            rule__PluginWithVersionAndStartLevel__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PluginWithVersionAndStartLevel__Group_1_1__1();

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__Group_1_1__0"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__Group_1_1__0__Impl"
    // InternalLcDsl.g:3257:1: rule__PluginWithVersionAndStartLevel__Group_1_1__0__Impl : ( 'startlevel' ) ;
    public final void rule__PluginWithVersionAndStartLevel__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3261:1: ( ( 'startlevel' ) )
            // InternalLcDsl.g:3262:1: ( 'startlevel' )
            {
            // InternalLcDsl.g:3262:1: ( 'startlevel' )
            // InternalLcDsl.g:3263:2: 'startlevel'
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartlevelKeyword_1_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartlevelKeyword_1_1_0()); 

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__Group_1_1__0__Impl"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__Group_1_1__1"
    // InternalLcDsl.g:3272:1: rule__PluginWithVersionAndStartLevel__Group_1_1__1 : rule__PluginWithVersionAndStartLevel__Group_1_1__1__Impl ;
    public final void rule__PluginWithVersionAndStartLevel__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3276:1: ( rule__PluginWithVersionAndStartLevel__Group_1_1__1__Impl )
            // InternalLcDsl.g:3277:2: rule__PluginWithVersionAndStartLevel__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PluginWithVersionAndStartLevel__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__Group_1_1__1"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__Group_1_1__1__Impl"
    // InternalLcDsl.g:3283:1: rule__PluginWithVersionAndStartLevel__Group_1_1__1__Impl : ( ( rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1 ) ) ;
    public final void rule__PluginWithVersionAndStartLevel__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3287:1: ( ( ( rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1 ) ) )
            // InternalLcDsl.g:3288:1: ( ( rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1 ) )
            {
            // InternalLcDsl.g:3288:1: ( ( rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1 ) )
            // InternalLcDsl.g:3289:2: ( rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1 )
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartLevelAssignment_1_1_1()); 
            // InternalLcDsl.g:3290:2: ( rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1 )
            // InternalLcDsl.g:3290:3: rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartLevelAssignment_1_1_1()); 

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__Group_1_1__1__Impl"


    // $ANTLR start "rule__PluginWithVersion__Group__0"
    // InternalLcDsl.g:3299:1: rule__PluginWithVersion__Group__0 : rule__PluginWithVersion__Group__0__Impl rule__PluginWithVersion__Group__1 ;
    public final void rule__PluginWithVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3303:1: ( rule__PluginWithVersion__Group__0__Impl rule__PluginWithVersion__Group__1 )
            // InternalLcDsl.g:3304:2: rule__PluginWithVersion__Group__0__Impl rule__PluginWithVersion__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__PluginWithVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PluginWithVersion__Group__1();

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
    // $ANTLR end "rule__PluginWithVersion__Group__0"


    // $ANTLR start "rule__PluginWithVersion__Group__0__Impl"
    // InternalLcDsl.g:3311:1: rule__PluginWithVersion__Group__0__Impl : ( rulePlugin ) ;
    public final void rule__PluginWithVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3315:1: ( ( rulePlugin ) )
            // InternalLcDsl.g:3316:1: ( rulePlugin )
            {
            // InternalLcDsl.g:3316:1: ( rulePlugin )
            // InternalLcDsl.g:3317:2: rulePlugin
            {
             before(grammarAccess.getPluginWithVersionAccess().getPluginParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlugin();

            state._fsp--;

             after(grammarAccess.getPluginWithVersionAccess().getPluginParserRuleCall_0()); 

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
    // $ANTLR end "rule__PluginWithVersion__Group__0__Impl"


    // $ANTLR start "rule__PluginWithVersion__Group__1"
    // InternalLcDsl.g:3326:1: rule__PluginWithVersion__Group__1 : rule__PluginWithVersion__Group__1__Impl ;
    public final void rule__PluginWithVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3330:1: ( rule__PluginWithVersion__Group__1__Impl )
            // InternalLcDsl.g:3331:2: rule__PluginWithVersion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PluginWithVersion__Group__1__Impl();

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
    // $ANTLR end "rule__PluginWithVersion__Group__1"


    // $ANTLR start "rule__PluginWithVersion__Group__1__Impl"
    // InternalLcDsl.g:3337:1: rule__PluginWithVersion__Group__1__Impl : ( ( rule__PluginWithVersion__VersionAssignment_1 )? ) ;
    public final void rule__PluginWithVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3341:1: ( ( ( rule__PluginWithVersion__VersionAssignment_1 )? ) )
            // InternalLcDsl.g:3342:1: ( ( rule__PluginWithVersion__VersionAssignment_1 )? )
            {
            // InternalLcDsl.g:3342:1: ( ( rule__PluginWithVersion__VersionAssignment_1 )? )
            // InternalLcDsl.g:3343:2: ( rule__PluginWithVersion__VersionAssignment_1 )?
            {
             before(grammarAccess.getPluginWithVersionAccess().getVersionAssignment_1()); 
            // InternalLcDsl.g:3344:2: ( rule__PluginWithVersion__VersionAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_VERSION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLcDsl.g:3344:3: rule__PluginWithVersion__VersionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PluginWithVersion__VersionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPluginWithVersionAccess().getVersionAssignment_1()); 

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
    // $ANTLR end "rule__PluginWithVersion__Group__1__Impl"


    // $ANTLR start "rule__ClearOption__Group__0"
    // InternalLcDsl.g:3353:1: rule__ClearOption__Group__0 : rule__ClearOption__Group__0__Impl rule__ClearOption__Group__1 ;
    public final void rule__ClearOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3357:1: ( rule__ClearOption__Group__0__Impl rule__ClearOption__Group__1 )
            // InternalLcDsl.g:3358:2: rule__ClearOption__Group__0__Impl rule__ClearOption__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalLcDsl.g:3365:1: rule__ClearOption__Group__0__Impl : ( () ) ;
    public final void rule__ClearOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3369:1: ( ( () ) )
            // InternalLcDsl.g:3370:1: ( () )
            {
            // InternalLcDsl.g:3370:1: ( () )
            // InternalLcDsl.g:3371:2: ()
            {
             before(grammarAccess.getClearOptionAccess().getClearOptionAction_0()); 
            // InternalLcDsl.g:3372:2: ()
            // InternalLcDsl.g:3372:3: 
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
    // InternalLcDsl.g:3380:1: rule__ClearOption__Group__1 : rule__ClearOption__Group__1__Impl rule__ClearOption__Group__2 ;
    public final void rule__ClearOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3384:1: ( rule__ClearOption__Group__1__Impl rule__ClearOption__Group__2 )
            // InternalLcDsl.g:3385:2: rule__ClearOption__Group__1__Impl rule__ClearOption__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalLcDsl.g:3392:1: rule__ClearOption__Group__1__Impl : ( 'clear' ) ;
    public final void rule__ClearOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3396:1: ( ( 'clear' ) )
            // InternalLcDsl.g:3397:1: ( 'clear' )
            {
            // InternalLcDsl.g:3397:1: ( 'clear' )
            // InternalLcDsl.g:3398:2: 'clear'
            {
             before(grammarAccess.getClearOptionAccess().getClearKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalLcDsl.g:3407:1: rule__ClearOption__Group__2 : rule__ClearOption__Group__2__Impl ;
    public final void rule__ClearOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3411:1: ( rule__ClearOption__Group__2__Impl )
            // InternalLcDsl.g:3412:2: rule__ClearOption__Group__2__Impl
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
    // InternalLcDsl.g:3418:1: rule__ClearOption__Group__2__Impl : ( ( rule__ClearOption__UnorderedGroup_2 ) ) ;
    public final void rule__ClearOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3422:1: ( ( ( rule__ClearOption__UnorderedGroup_2 ) ) )
            // InternalLcDsl.g:3423:1: ( ( rule__ClearOption__UnorderedGroup_2 ) )
            {
            // InternalLcDsl.g:3423:1: ( ( rule__ClearOption__UnorderedGroup_2 ) )
            // InternalLcDsl.g:3424:2: ( rule__ClearOption__UnorderedGroup_2 )
            {
             before(grammarAccess.getClearOptionAccess().getUnorderedGroup_2()); 
            // InternalLcDsl.g:3425:2: ( rule__ClearOption__UnorderedGroup_2 )
            // InternalLcDsl.g:3425:3: rule__ClearOption__UnorderedGroup_2
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
    // InternalLcDsl.g:3434:1: rule__ClearOption__Group_2_0__0 : rule__ClearOption__Group_2_0__0__Impl rule__ClearOption__Group_2_0__1 ;
    public final void rule__ClearOption__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3438:1: ( rule__ClearOption__Group_2_0__0__Impl rule__ClearOption__Group_2_0__1 )
            // InternalLcDsl.g:3439:2: rule__ClearOption__Group_2_0__0__Impl rule__ClearOption__Group_2_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalLcDsl.g:3446:1: rule__ClearOption__Group_2_0__0__Impl : ( ( rule__ClearOption__Alternatives_2_0_0 ) ) ;
    public final void rule__ClearOption__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3450:1: ( ( ( rule__ClearOption__Alternatives_2_0_0 ) ) )
            // InternalLcDsl.g:3451:1: ( ( rule__ClearOption__Alternatives_2_0_0 ) )
            {
            // InternalLcDsl.g:3451:1: ( ( rule__ClearOption__Alternatives_2_0_0 ) )
            // InternalLcDsl.g:3452:2: ( rule__ClearOption__Alternatives_2_0_0 )
            {
             before(grammarAccess.getClearOptionAccess().getAlternatives_2_0_0()); 
            // InternalLcDsl.g:3453:2: ( rule__ClearOption__Alternatives_2_0_0 )
            // InternalLcDsl.g:3453:3: rule__ClearOption__Alternatives_2_0_0
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
    // InternalLcDsl.g:3461:1: rule__ClearOption__Group_2_0__1 : rule__ClearOption__Group_2_0__1__Impl ;
    public final void rule__ClearOption__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3465:1: ( rule__ClearOption__Group_2_0__1__Impl )
            // InternalLcDsl.g:3466:2: rule__ClearOption__Group_2_0__1__Impl
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
    // InternalLcDsl.g:3472:1: rule__ClearOption__Group_2_0__1__Impl : ( ( rule__ClearOption__NoAskClearAssignment_2_0_1 )? ) ;
    public final void rule__ClearOption__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3476:1: ( ( ( rule__ClearOption__NoAskClearAssignment_2_0_1 )? ) )
            // InternalLcDsl.g:3477:1: ( ( rule__ClearOption__NoAskClearAssignment_2_0_1 )? )
            {
            // InternalLcDsl.g:3477:1: ( ( rule__ClearOption__NoAskClearAssignment_2_0_1 )? )
            // InternalLcDsl.g:3478:2: ( rule__ClearOption__NoAskClearAssignment_2_0_1 )?
            {
             before(grammarAccess.getClearOptionAccess().getNoAskClearAssignment_2_0_1()); 
            // InternalLcDsl.g:3479:2: ( rule__ClearOption__NoAskClearAssignment_2_0_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==78) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLcDsl.g:3479:3: rule__ClearOption__NoAskClearAssignment_2_0_1
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
    // InternalLcDsl.g:3488:1: rule__MemoryOption__Group__0 : rule__MemoryOption__Group__0__Impl rule__MemoryOption__Group__1 ;
    public final void rule__MemoryOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3492:1: ( rule__MemoryOption__Group__0__Impl rule__MemoryOption__Group__1 )
            // InternalLcDsl.g:3493:2: rule__MemoryOption__Group__0__Impl rule__MemoryOption__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalLcDsl.g:3500:1: rule__MemoryOption__Group__0__Impl : ( () ) ;
    public final void rule__MemoryOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3504:1: ( ( () ) )
            // InternalLcDsl.g:3505:1: ( () )
            {
            // InternalLcDsl.g:3505:1: ( () )
            // InternalLcDsl.g:3506:2: ()
            {
             before(grammarAccess.getMemoryOptionAccess().getMemoryOptionAction_0()); 
            // InternalLcDsl.g:3507:2: ()
            // InternalLcDsl.g:3507:3: 
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
    // InternalLcDsl.g:3515:1: rule__MemoryOption__Group__1 : rule__MemoryOption__Group__1__Impl rule__MemoryOption__Group__2 ;
    public final void rule__MemoryOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3519:1: ( rule__MemoryOption__Group__1__Impl rule__MemoryOption__Group__2 )
            // InternalLcDsl.g:3520:2: rule__MemoryOption__Group__1__Impl rule__MemoryOption__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalLcDsl.g:3527:1: rule__MemoryOption__Group__1__Impl : ( 'memory' ) ;
    public final void rule__MemoryOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3531:1: ( ( 'memory' ) )
            // InternalLcDsl.g:3532:1: ( 'memory' )
            {
            // InternalLcDsl.g:3532:1: ( 'memory' )
            // InternalLcDsl.g:3533:2: 'memory'
            {
             before(grammarAccess.getMemoryOptionAccess().getMemoryKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalLcDsl.g:3542:1: rule__MemoryOption__Group__2 : rule__MemoryOption__Group__2__Impl ;
    public final void rule__MemoryOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3546:1: ( rule__MemoryOption__Group__2__Impl )
            // InternalLcDsl.g:3547:2: rule__MemoryOption__Group__2__Impl
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
    // InternalLcDsl.g:3553:1: rule__MemoryOption__Group__2__Impl : ( ( rule__MemoryOption__UnorderedGroup_2 ) ) ;
    public final void rule__MemoryOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3557:1: ( ( ( rule__MemoryOption__UnorderedGroup_2 ) ) )
            // InternalLcDsl.g:3558:1: ( ( rule__MemoryOption__UnorderedGroup_2 ) )
            {
            // InternalLcDsl.g:3558:1: ( ( rule__MemoryOption__UnorderedGroup_2 ) )
            // InternalLcDsl.g:3559:2: ( rule__MemoryOption__UnorderedGroup_2 )
            {
             before(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2()); 
            // InternalLcDsl.g:3560:2: ( rule__MemoryOption__UnorderedGroup_2 )
            // InternalLcDsl.g:3560:3: rule__MemoryOption__UnorderedGroup_2
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
    // InternalLcDsl.g:3569:1: rule__MemoryOption__Group_2_0__0 : rule__MemoryOption__Group_2_0__0__Impl rule__MemoryOption__Group_2_0__1 ;
    public final void rule__MemoryOption__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3573:1: ( rule__MemoryOption__Group_2_0__0__Impl rule__MemoryOption__Group_2_0__1 )
            // InternalLcDsl.g:3574:2: rule__MemoryOption__Group_2_0__0__Impl rule__MemoryOption__Group_2_0__1
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
    // InternalLcDsl.g:3581:1: rule__MemoryOption__Group_2_0__0__Impl : ( 'min' ) ;
    public final void rule__MemoryOption__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3585:1: ( ( 'min' ) )
            // InternalLcDsl.g:3586:1: ( 'min' )
            {
            // InternalLcDsl.g:3586:1: ( 'min' )
            // InternalLcDsl.g:3587:2: 'min'
            {
             before(grammarAccess.getMemoryOptionAccess().getMinKeyword_2_0_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalLcDsl.g:3596:1: rule__MemoryOption__Group_2_0__1 : rule__MemoryOption__Group_2_0__1__Impl rule__MemoryOption__Group_2_0__2 ;
    public final void rule__MemoryOption__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3600:1: ( rule__MemoryOption__Group_2_0__1__Impl rule__MemoryOption__Group_2_0__2 )
            // InternalLcDsl.g:3601:2: rule__MemoryOption__Group_2_0__1__Impl rule__MemoryOption__Group_2_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalLcDsl.g:3608:1: rule__MemoryOption__Group_2_0__1__Impl : ( RULE_EQ ) ;
    public final void rule__MemoryOption__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3612:1: ( ( RULE_EQ ) )
            // InternalLcDsl.g:3613:1: ( RULE_EQ )
            {
            // InternalLcDsl.g:3613:1: ( RULE_EQ )
            // InternalLcDsl.g:3614:2: RULE_EQ
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
    // InternalLcDsl.g:3623:1: rule__MemoryOption__Group_2_0__2 : rule__MemoryOption__Group_2_0__2__Impl rule__MemoryOption__Group_2_0__3 ;
    public final void rule__MemoryOption__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3627:1: ( rule__MemoryOption__Group_2_0__2__Impl rule__MemoryOption__Group_2_0__3 )
            // InternalLcDsl.g:3628:2: rule__MemoryOption__Group_2_0__2__Impl rule__MemoryOption__Group_2_0__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalLcDsl.g:3635:1: rule__MemoryOption__Group_2_0__2__Impl : ( ( rule__MemoryOption__MinAssignment_2_0_2 ) ) ;
    public final void rule__MemoryOption__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3639:1: ( ( ( rule__MemoryOption__MinAssignment_2_0_2 ) ) )
            // InternalLcDsl.g:3640:1: ( ( rule__MemoryOption__MinAssignment_2_0_2 ) )
            {
            // InternalLcDsl.g:3640:1: ( ( rule__MemoryOption__MinAssignment_2_0_2 ) )
            // InternalLcDsl.g:3641:2: ( rule__MemoryOption__MinAssignment_2_0_2 )
            {
             before(grammarAccess.getMemoryOptionAccess().getMinAssignment_2_0_2()); 
            // InternalLcDsl.g:3642:2: ( rule__MemoryOption__MinAssignment_2_0_2 )
            // InternalLcDsl.g:3642:3: rule__MemoryOption__MinAssignment_2_0_2
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
    // InternalLcDsl.g:3650:1: rule__MemoryOption__Group_2_0__3 : rule__MemoryOption__Group_2_0__3__Impl ;
    public final void rule__MemoryOption__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3654:1: ( rule__MemoryOption__Group_2_0__3__Impl )
            // InternalLcDsl.g:3655:2: rule__MemoryOption__Group_2_0__3__Impl
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
    // InternalLcDsl.g:3661:1: rule__MemoryOption__Group_2_0__3__Impl : ( ( rule__MemoryOption__MinUnitAssignment_2_0_3 ) ) ;
    public final void rule__MemoryOption__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3665:1: ( ( ( rule__MemoryOption__MinUnitAssignment_2_0_3 ) ) )
            // InternalLcDsl.g:3666:1: ( ( rule__MemoryOption__MinUnitAssignment_2_0_3 ) )
            {
            // InternalLcDsl.g:3666:1: ( ( rule__MemoryOption__MinUnitAssignment_2_0_3 ) )
            // InternalLcDsl.g:3667:2: ( rule__MemoryOption__MinUnitAssignment_2_0_3 )
            {
             before(grammarAccess.getMemoryOptionAccess().getMinUnitAssignment_2_0_3()); 
            // InternalLcDsl.g:3668:2: ( rule__MemoryOption__MinUnitAssignment_2_0_3 )
            // InternalLcDsl.g:3668:3: rule__MemoryOption__MinUnitAssignment_2_0_3
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
    // InternalLcDsl.g:3677:1: rule__MemoryOption__Group_2_1__0 : rule__MemoryOption__Group_2_1__0__Impl rule__MemoryOption__Group_2_1__1 ;
    public final void rule__MemoryOption__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3681:1: ( rule__MemoryOption__Group_2_1__0__Impl rule__MemoryOption__Group_2_1__1 )
            // InternalLcDsl.g:3682:2: rule__MemoryOption__Group_2_1__0__Impl rule__MemoryOption__Group_2_1__1
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
    // InternalLcDsl.g:3689:1: rule__MemoryOption__Group_2_1__0__Impl : ( 'max' ) ;
    public final void rule__MemoryOption__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3693:1: ( ( 'max' ) )
            // InternalLcDsl.g:3694:1: ( 'max' )
            {
            // InternalLcDsl.g:3694:1: ( 'max' )
            // InternalLcDsl.g:3695:2: 'max'
            {
             before(grammarAccess.getMemoryOptionAccess().getMaxKeyword_2_1_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalLcDsl.g:3704:1: rule__MemoryOption__Group_2_1__1 : rule__MemoryOption__Group_2_1__1__Impl rule__MemoryOption__Group_2_1__2 ;
    public final void rule__MemoryOption__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3708:1: ( rule__MemoryOption__Group_2_1__1__Impl rule__MemoryOption__Group_2_1__2 )
            // InternalLcDsl.g:3709:2: rule__MemoryOption__Group_2_1__1__Impl rule__MemoryOption__Group_2_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalLcDsl.g:3716:1: rule__MemoryOption__Group_2_1__1__Impl : ( RULE_EQ ) ;
    public final void rule__MemoryOption__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3720:1: ( ( RULE_EQ ) )
            // InternalLcDsl.g:3721:1: ( RULE_EQ )
            {
            // InternalLcDsl.g:3721:1: ( RULE_EQ )
            // InternalLcDsl.g:3722:2: RULE_EQ
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
    // InternalLcDsl.g:3731:1: rule__MemoryOption__Group_2_1__2 : rule__MemoryOption__Group_2_1__2__Impl rule__MemoryOption__Group_2_1__3 ;
    public final void rule__MemoryOption__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3735:1: ( rule__MemoryOption__Group_2_1__2__Impl rule__MemoryOption__Group_2_1__3 )
            // InternalLcDsl.g:3736:2: rule__MemoryOption__Group_2_1__2__Impl rule__MemoryOption__Group_2_1__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalLcDsl.g:3743:1: rule__MemoryOption__Group_2_1__2__Impl : ( ( rule__MemoryOption__MaxAssignment_2_1_2 ) ) ;
    public final void rule__MemoryOption__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3747:1: ( ( ( rule__MemoryOption__MaxAssignment_2_1_2 ) ) )
            // InternalLcDsl.g:3748:1: ( ( rule__MemoryOption__MaxAssignment_2_1_2 ) )
            {
            // InternalLcDsl.g:3748:1: ( ( rule__MemoryOption__MaxAssignment_2_1_2 ) )
            // InternalLcDsl.g:3749:2: ( rule__MemoryOption__MaxAssignment_2_1_2 )
            {
             before(grammarAccess.getMemoryOptionAccess().getMaxAssignment_2_1_2()); 
            // InternalLcDsl.g:3750:2: ( rule__MemoryOption__MaxAssignment_2_1_2 )
            // InternalLcDsl.g:3750:3: rule__MemoryOption__MaxAssignment_2_1_2
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
    // InternalLcDsl.g:3758:1: rule__MemoryOption__Group_2_1__3 : rule__MemoryOption__Group_2_1__3__Impl ;
    public final void rule__MemoryOption__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3762:1: ( rule__MemoryOption__Group_2_1__3__Impl )
            // InternalLcDsl.g:3763:2: rule__MemoryOption__Group_2_1__3__Impl
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
    // InternalLcDsl.g:3769:1: rule__MemoryOption__Group_2_1__3__Impl : ( ( rule__MemoryOption__MaxUnitAssignment_2_1_3 ) ) ;
    public final void rule__MemoryOption__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3773:1: ( ( ( rule__MemoryOption__MaxUnitAssignment_2_1_3 ) ) )
            // InternalLcDsl.g:3774:1: ( ( rule__MemoryOption__MaxUnitAssignment_2_1_3 ) )
            {
            // InternalLcDsl.g:3774:1: ( ( rule__MemoryOption__MaxUnitAssignment_2_1_3 ) )
            // InternalLcDsl.g:3775:2: ( rule__MemoryOption__MaxUnitAssignment_2_1_3 )
            {
             before(grammarAccess.getMemoryOptionAccess().getMaxUnitAssignment_2_1_3()); 
            // InternalLcDsl.g:3776:2: ( rule__MemoryOption__MaxUnitAssignment_2_1_3 )
            // InternalLcDsl.g:3776:3: rule__MemoryOption__MaxUnitAssignment_2_1_3
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
    // InternalLcDsl.g:3785:1: rule__MemoryOption__Group_2_2__0 : rule__MemoryOption__Group_2_2__0__Impl rule__MemoryOption__Group_2_2__1 ;
    public final void rule__MemoryOption__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3789:1: ( rule__MemoryOption__Group_2_2__0__Impl rule__MemoryOption__Group_2_2__1 )
            // InternalLcDsl.g:3790:2: rule__MemoryOption__Group_2_2__0__Impl rule__MemoryOption__Group_2_2__1
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
    // InternalLcDsl.g:3797:1: rule__MemoryOption__Group_2_2__0__Impl : ( 'perm' ) ;
    public final void rule__MemoryOption__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3801:1: ( ( 'perm' ) )
            // InternalLcDsl.g:3802:1: ( 'perm' )
            {
            // InternalLcDsl.g:3802:1: ( 'perm' )
            // InternalLcDsl.g:3803:2: 'perm'
            {
             before(grammarAccess.getMemoryOptionAccess().getPermKeyword_2_2_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalLcDsl.g:3812:1: rule__MemoryOption__Group_2_2__1 : rule__MemoryOption__Group_2_2__1__Impl rule__MemoryOption__Group_2_2__2 ;
    public final void rule__MemoryOption__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3816:1: ( rule__MemoryOption__Group_2_2__1__Impl rule__MemoryOption__Group_2_2__2 )
            // InternalLcDsl.g:3817:2: rule__MemoryOption__Group_2_2__1__Impl rule__MemoryOption__Group_2_2__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalLcDsl.g:3824:1: rule__MemoryOption__Group_2_2__1__Impl : ( RULE_EQ ) ;
    public final void rule__MemoryOption__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3828:1: ( ( RULE_EQ ) )
            // InternalLcDsl.g:3829:1: ( RULE_EQ )
            {
            // InternalLcDsl.g:3829:1: ( RULE_EQ )
            // InternalLcDsl.g:3830:2: RULE_EQ
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
    // InternalLcDsl.g:3839:1: rule__MemoryOption__Group_2_2__2 : rule__MemoryOption__Group_2_2__2__Impl rule__MemoryOption__Group_2_2__3 ;
    public final void rule__MemoryOption__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3843:1: ( rule__MemoryOption__Group_2_2__2__Impl rule__MemoryOption__Group_2_2__3 )
            // InternalLcDsl.g:3844:2: rule__MemoryOption__Group_2_2__2__Impl rule__MemoryOption__Group_2_2__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalLcDsl.g:3851:1: rule__MemoryOption__Group_2_2__2__Impl : ( ( rule__MemoryOption__PermAssignment_2_2_2 ) ) ;
    public final void rule__MemoryOption__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3855:1: ( ( ( rule__MemoryOption__PermAssignment_2_2_2 ) ) )
            // InternalLcDsl.g:3856:1: ( ( rule__MemoryOption__PermAssignment_2_2_2 ) )
            {
            // InternalLcDsl.g:3856:1: ( ( rule__MemoryOption__PermAssignment_2_2_2 ) )
            // InternalLcDsl.g:3857:2: ( rule__MemoryOption__PermAssignment_2_2_2 )
            {
             before(grammarAccess.getMemoryOptionAccess().getPermAssignment_2_2_2()); 
            // InternalLcDsl.g:3858:2: ( rule__MemoryOption__PermAssignment_2_2_2 )
            // InternalLcDsl.g:3858:3: rule__MemoryOption__PermAssignment_2_2_2
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
    // InternalLcDsl.g:3866:1: rule__MemoryOption__Group_2_2__3 : rule__MemoryOption__Group_2_2__3__Impl ;
    public final void rule__MemoryOption__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3870:1: ( rule__MemoryOption__Group_2_2__3__Impl )
            // InternalLcDsl.g:3871:2: rule__MemoryOption__Group_2_2__3__Impl
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
    // InternalLcDsl.g:3877:1: rule__MemoryOption__Group_2_2__3__Impl : ( ( rule__MemoryOption__PermUnitAssignment_2_2_3 ) ) ;
    public final void rule__MemoryOption__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3881:1: ( ( ( rule__MemoryOption__PermUnitAssignment_2_2_3 ) ) )
            // InternalLcDsl.g:3882:1: ( ( rule__MemoryOption__PermUnitAssignment_2_2_3 ) )
            {
            // InternalLcDsl.g:3882:1: ( ( rule__MemoryOption__PermUnitAssignment_2_2_3 ) )
            // InternalLcDsl.g:3883:2: ( rule__MemoryOption__PermUnitAssignment_2_2_3 )
            {
             before(grammarAccess.getMemoryOptionAccess().getPermUnitAssignment_2_2_3()); 
            // InternalLcDsl.g:3884:2: ( rule__MemoryOption__PermUnitAssignment_2_2_3 )
            // InternalLcDsl.g:3884:3: rule__MemoryOption__PermUnitAssignment_2_2_3
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
    // InternalLcDsl.g:3893:1: rule__GroupMember__Group__0 : rule__GroupMember__Group__0__Impl rule__GroupMember__Group__1 ;
    public final void rule__GroupMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3897:1: ( rule__GroupMember__Group__0__Impl rule__GroupMember__Group__1 )
            // InternalLcDsl.g:3898:2: rule__GroupMember__Group__0__Impl rule__GroupMember__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalLcDsl.g:3905:1: rule__GroupMember__Group__0__Impl : ( ( rule__GroupMember__UnorderedGroup_0 ) ) ;
    public final void rule__GroupMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3909:1: ( ( ( rule__GroupMember__UnorderedGroup_0 ) ) )
            // InternalLcDsl.g:3910:1: ( ( rule__GroupMember__UnorderedGroup_0 ) )
            {
            // InternalLcDsl.g:3910:1: ( ( rule__GroupMember__UnorderedGroup_0 ) )
            // InternalLcDsl.g:3911:2: ( rule__GroupMember__UnorderedGroup_0 )
            {
             before(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0()); 
            // InternalLcDsl.g:3912:2: ( rule__GroupMember__UnorderedGroup_0 )
            // InternalLcDsl.g:3912:3: rule__GroupMember__UnorderedGroup_0
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
    // InternalLcDsl.g:3920:1: rule__GroupMember__Group__1 : rule__GroupMember__Group__1__Impl rule__GroupMember__Group__2 ;
    public final void rule__GroupMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3924:1: ( rule__GroupMember__Group__1__Impl rule__GroupMember__Group__2 )
            // InternalLcDsl.g:3925:2: rule__GroupMember__Group__1__Impl rule__GroupMember__Group__2
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
    // InternalLcDsl.g:3932:1: rule__GroupMember__Group__1__Impl : ( 'member' ) ;
    public final void rule__GroupMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3936:1: ( ( 'member' ) )
            // InternalLcDsl.g:3937:1: ( 'member' )
            {
            // InternalLcDsl.g:3937:1: ( 'member' )
            // InternalLcDsl.g:3938:2: 'member'
            {
             before(grammarAccess.getGroupMemberAccess().getMemberKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalLcDsl.g:3947:1: rule__GroupMember__Group__2 : rule__GroupMember__Group__2__Impl rule__GroupMember__Group__3 ;
    public final void rule__GroupMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3951:1: ( rule__GroupMember__Group__2__Impl rule__GroupMember__Group__3 )
            // InternalLcDsl.g:3952:2: rule__GroupMember__Group__2__Impl rule__GroupMember__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalLcDsl.g:3959:1: rule__GroupMember__Group__2__Impl : ( ( rule__GroupMember__MemberAssignment_2 ) ) ;
    public final void rule__GroupMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3963:1: ( ( ( rule__GroupMember__MemberAssignment_2 ) ) )
            // InternalLcDsl.g:3964:1: ( ( rule__GroupMember__MemberAssignment_2 ) )
            {
            // InternalLcDsl.g:3964:1: ( ( rule__GroupMember__MemberAssignment_2 ) )
            // InternalLcDsl.g:3965:2: ( rule__GroupMember__MemberAssignment_2 )
            {
             before(grammarAccess.getGroupMemberAccess().getMemberAssignment_2()); 
            // InternalLcDsl.g:3966:2: ( rule__GroupMember__MemberAssignment_2 )
            // InternalLcDsl.g:3966:3: rule__GroupMember__MemberAssignment_2
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
    // InternalLcDsl.g:3974:1: rule__GroupMember__Group__3 : rule__GroupMember__Group__3__Impl rule__GroupMember__Group__4 ;
    public final void rule__GroupMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3978:1: ( rule__GroupMember__Group__3__Impl rule__GroupMember__Group__4 )
            // InternalLcDsl.g:3979:2: rule__GroupMember__Group__3__Impl rule__GroupMember__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalLcDsl.g:3986:1: rule__GroupMember__Group__3__Impl : ( ( rule__GroupMember__PostActionAssignment_3 )? ) ;
    public final void rule__GroupMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:3990:1: ( ( ( rule__GroupMember__PostActionAssignment_3 )? ) )
            // InternalLcDsl.g:3991:1: ( ( rule__GroupMember__PostActionAssignment_3 )? )
            {
            // InternalLcDsl.g:3991:1: ( ( rule__GroupMember__PostActionAssignment_3 )? )
            // InternalLcDsl.g:3992:2: ( rule__GroupMember__PostActionAssignment_3 )?
            {
             before(grammarAccess.getGroupMemberAccess().getPostActionAssignment_3()); 
            // InternalLcDsl.g:3993:2: ( rule__GroupMember__PostActionAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=65 && LA16_0<=67)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLcDsl.g:3993:3: rule__GroupMember__PostActionAssignment_3
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
    // InternalLcDsl.g:4001:1: rule__GroupMember__Group__4 : rule__GroupMember__Group__4__Impl ;
    public final void rule__GroupMember__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4005:1: ( rule__GroupMember__Group__4__Impl )
            // InternalLcDsl.g:4006:2: rule__GroupMember__Group__4__Impl
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
    // InternalLcDsl.g:4012:1: rule__GroupMember__Group__4__Impl : ( ';' ) ;
    public final void rule__GroupMember__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4016:1: ( ( ';' ) )
            // InternalLcDsl.g:4017:1: ( ';' )
            {
            // InternalLcDsl.g:4017:1: ( ';' )
            // InternalLcDsl.g:4018:2: ';'
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
    // InternalLcDsl.g:4028:1: rule__GroupPostLaunchDelay__Group__0 : rule__GroupPostLaunchDelay__Group__0__Impl rule__GroupPostLaunchDelay__Group__1 ;
    public final void rule__GroupPostLaunchDelay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4032:1: ( rule__GroupPostLaunchDelay__Group__0__Impl rule__GroupPostLaunchDelay__Group__1 )
            // InternalLcDsl.g:4033:2: rule__GroupPostLaunchDelay__Group__0__Impl rule__GroupPostLaunchDelay__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalLcDsl.g:4040:1: rule__GroupPostLaunchDelay__Group__0__Impl : ( 'delay' ) ;
    public final void rule__GroupPostLaunchDelay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4044:1: ( ( 'delay' ) )
            // InternalLcDsl.g:4045:1: ( 'delay' )
            {
            // InternalLcDsl.g:4045:1: ( 'delay' )
            // InternalLcDsl.g:4046:2: 'delay'
            {
             before(grammarAccess.getGroupPostLaunchDelayAccess().getDelayKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalLcDsl.g:4055:1: rule__GroupPostLaunchDelay__Group__1 : rule__GroupPostLaunchDelay__Group__1__Impl ;
    public final void rule__GroupPostLaunchDelay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4059:1: ( rule__GroupPostLaunchDelay__Group__1__Impl )
            // InternalLcDsl.g:4060:2: rule__GroupPostLaunchDelay__Group__1__Impl
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
    // InternalLcDsl.g:4066:1: rule__GroupPostLaunchDelay__Group__1__Impl : ( ( rule__GroupPostLaunchDelay__DelayAssignment_1 ) ) ;
    public final void rule__GroupPostLaunchDelay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4070:1: ( ( ( rule__GroupPostLaunchDelay__DelayAssignment_1 ) ) )
            // InternalLcDsl.g:4071:1: ( ( rule__GroupPostLaunchDelay__DelayAssignment_1 ) )
            {
            // InternalLcDsl.g:4071:1: ( ( rule__GroupPostLaunchDelay__DelayAssignment_1 ) )
            // InternalLcDsl.g:4072:2: ( rule__GroupPostLaunchDelay__DelayAssignment_1 )
            {
             before(grammarAccess.getGroupPostLaunchDelayAccess().getDelayAssignment_1()); 
            // InternalLcDsl.g:4073:2: ( rule__GroupPostLaunchDelay__DelayAssignment_1 )
            // InternalLcDsl.g:4073:3: rule__GroupPostLaunchDelay__DelayAssignment_1
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
    // InternalLcDsl.g:4082:1: rule__GroupPostLaunchRegex__Group__0 : rule__GroupPostLaunchRegex__Group__0__Impl rule__GroupPostLaunchRegex__Group__1 ;
    public final void rule__GroupPostLaunchRegex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4086:1: ( rule__GroupPostLaunchRegex__Group__0__Impl rule__GroupPostLaunchRegex__Group__1 )
            // InternalLcDsl.g:4087:2: rule__GroupPostLaunchRegex__Group__0__Impl rule__GroupPostLaunchRegex__Group__1
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
    // InternalLcDsl.g:4094:1: rule__GroupPostLaunchRegex__Group__0__Impl : ( 'regex' ) ;
    public final void rule__GroupPostLaunchRegex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4098:1: ( ( 'regex' ) )
            // InternalLcDsl.g:4099:1: ( 'regex' )
            {
            // InternalLcDsl.g:4099:1: ( 'regex' )
            // InternalLcDsl.g:4100:2: 'regex'
            {
             before(grammarAccess.getGroupPostLaunchRegexAccess().getRegexKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalLcDsl.g:4109:1: rule__GroupPostLaunchRegex__Group__1 : rule__GroupPostLaunchRegex__Group__1__Impl ;
    public final void rule__GroupPostLaunchRegex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4113:1: ( rule__GroupPostLaunchRegex__Group__1__Impl )
            // InternalLcDsl.g:4114:2: rule__GroupPostLaunchRegex__Group__1__Impl
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
    // InternalLcDsl.g:4120:1: rule__GroupPostLaunchRegex__Group__1__Impl : ( ( rule__GroupPostLaunchRegex__RegexAssignment_1 ) ) ;
    public final void rule__GroupPostLaunchRegex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4124:1: ( ( ( rule__GroupPostLaunchRegex__RegexAssignment_1 ) ) )
            // InternalLcDsl.g:4125:1: ( ( rule__GroupPostLaunchRegex__RegexAssignment_1 ) )
            {
            // InternalLcDsl.g:4125:1: ( ( rule__GroupPostLaunchRegex__RegexAssignment_1 ) )
            // InternalLcDsl.g:4126:2: ( rule__GroupPostLaunchRegex__RegexAssignment_1 )
            {
             before(grammarAccess.getGroupPostLaunchRegexAccess().getRegexAssignment_1()); 
            // InternalLcDsl.g:4127:2: ( rule__GroupPostLaunchRegex__RegexAssignment_1 )
            // InternalLcDsl.g:4127:3: rule__GroupPostLaunchRegex__RegexAssignment_1
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
    // InternalLcDsl.g:4136:1: rule__GroupPostLaunchWait__Group__0 : rule__GroupPostLaunchWait__Group__0__Impl rule__GroupPostLaunchWait__Group__1 ;
    public final void rule__GroupPostLaunchWait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4140:1: ( rule__GroupPostLaunchWait__Group__0__Impl rule__GroupPostLaunchWait__Group__1 )
            // InternalLcDsl.g:4141:2: rule__GroupPostLaunchWait__Group__0__Impl rule__GroupPostLaunchWait__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalLcDsl.g:4148:1: rule__GroupPostLaunchWait__Group__0__Impl : ( () ) ;
    public final void rule__GroupPostLaunchWait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4152:1: ( ( () ) )
            // InternalLcDsl.g:4153:1: ( () )
            {
            // InternalLcDsl.g:4153:1: ( () )
            // InternalLcDsl.g:4154:2: ()
            {
             before(grammarAccess.getGroupPostLaunchWaitAccess().getGroupPostLaunchWaitAction_0()); 
            // InternalLcDsl.g:4155:2: ()
            // InternalLcDsl.g:4155:3: 
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
    // InternalLcDsl.g:4163:1: rule__GroupPostLaunchWait__Group__1 : rule__GroupPostLaunchWait__Group__1__Impl ;
    public final void rule__GroupPostLaunchWait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4167:1: ( rule__GroupPostLaunchWait__Group__1__Impl )
            // InternalLcDsl.g:4168:2: rule__GroupPostLaunchWait__Group__1__Impl
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
    // InternalLcDsl.g:4174:1: rule__GroupPostLaunchWait__Group__1__Impl : ( 'wait' ) ;
    public final void rule__GroupPostLaunchWait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4178:1: ( ( 'wait' ) )
            // InternalLcDsl.g:4179:1: ( 'wait' )
            {
            // InternalLcDsl.g:4179:1: ( 'wait' )
            // InternalLcDsl.g:4180:2: 'wait'
            {
             before(grammarAccess.getGroupPostLaunchWaitAccess().getWaitKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalLcDsl.g:4190:1: rule__FQName__Group__0 : rule__FQName__Group__0__Impl rule__FQName__Group__1 ;
    public final void rule__FQName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4194:1: ( rule__FQName__Group__0__Impl rule__FQName__Group__1 )
            // InternalLcDsl.g:4195:2: rule__FQName__Group__0__Impl rule__FQName__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalLcDsl.g:4202:1: rule__FQName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4206:1: ( ( RULE_ID ) )
            // InternalLcDsl.g:4207:1: ( RULE_ID )
            {
            // InternalLcDsl.g:4207:1: ( RULE_ID )
            // InternalLcDsl.g:4208:2: RULE_ID
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
    // InternalLcDsl.g:4217:1: rule__FQName__Group__1 : rule__FQName__Group__1__Impl ;
    public final void rule__FQName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4221:1: ( rule__FQName__Group__1__Impl )
            // InternalLcDsl.g:4222:2: rule__FQName__Group__1__Impl
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
    // InternalLcDsl.g:4228:1: rule__FQName__Group__1__Impl : ( ( rule__FQName__Group_1__0 )* ) ;
    public final void rule__FQName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4232:1: ( ( ( rule__FQName__Group_1__0 )* ) )
            // InternalLcDsl.g:4233:1: ( ( rule__FQName__Group_1__0 )* )
            {
            // InternalLcDsl.g:4233:1: ( ( rule__FQName__Group_1__0 )* )
            // InternalLcDsl.g:4234:2: ( rule__FQName__Group_1__0 )*
            {
             before(grammarAccess.getFQNameAccess().getGroup_1()); 
            // InternalLcDsl.g:4235:2: ( rule__FQName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==68) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLcDsl.g:4235:3: rule__FQName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__FQName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalLcDsl.g:4244:1: rule__FQName__Group_1__0 : rule__FQName__Group_1__0__Impl rule__FQName__Group_1__1 ;
    public final void rule__FQName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4248:1: ( rule__FQName__Group_1__0__Impl rule__FQName__Group_1__1 )
            // InternalLcDsl.g:4249:2: rule__FQName__Group_1__0__Impl rule__FQName__Group_1__1
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
    // InternalLcDsl.g:4256:1: rule__FQName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4260:1: ( ( '.' ) )
            // InternalLcDsl.g:4261:1: ( '.' )
            {
            // InternalLcDsl.g:4261:1: ( '.' )
            // InternalLcDsl.g:4262:2: '.'
            {
             before(grammarAccess.getFQNameAccess().getFullStopKeyword_1_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalLcDsl.g:4271:1: rule__FQName__Group_1__1 : rule__FQName__Group_1__1__Impl ;
    public final void rule__FQName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4275:1: ( rule__FQName__Group_1__1__Impl )
            // InternalLcDsl.g:4276:2: rule__FQName__Group_1__1__Impl
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
    // InternalLcDsl.g:4282:1: rule__FQName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4286:1: ( ( RULE_ID ) )
            // InternalLcDsl.g:4287:1: ( RULE_ID )
            {
            // InternalLcDsl.g:4287:1: ( RULE_ID )
            // InternalLcDsl.g:4288:2: RULE_ID
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
    // InternalLcDsl.g:4298:1: rule__LaunchConfig__UnorderedGroup_0 : ( rule__LaunchConfig__UnorderedGroup_0__0 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
        	
        try {
            // InternalLcDsl.g:4303:1: ( ( rule__LaunchConfig__UnorderedGroup_0__0 )? )
            // InternalLcDsl.g:4304:2: ( rule__LaunchConfig__UnorderedGroup_0__0 )?
            {
            // InternalLcDsl.g:4304:2: ( rule__LaunchConfig__UnorderedGroup_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt18=1;
            }
            else if ( LA18_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt18=1;
            }
            else if ( LA18_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt18=1;
            }
            else if ( LA18_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                alt18=1;
            }
            else if ( LA18_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                alt18=1;
            }
            else if ( LA18_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLcDsl.g:4304:2: rule__LaunchConfig__UnorderedGroup_0__0
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
    // InternalLcDsl.g:4312:1: rule__LaunchConfig__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) ) ) ) ) ;
    public final void rule__LaunchConfig__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4317:1: ( ( ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) ) ) ) ) )
            // InternalLcDsl.g:4318:3: ( ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) ) ) ) )
            {
            // InternalLcDsl.g:4318:3: ( ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) ) ) ) )
            int alt19=7;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt19=2;
            }
            else if ( LA19_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt19=3;
            }
            else if ( LA19_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt19=4;
            }
            else if ( LA19_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                alt19=5;
            }
            else if ( LA19_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                alt19=6;
            }
            else if ( LA19_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                alt19=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLcDsl.g:4319:3: ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) )
                    {
                    // InternalLcDsl.g:4319:3: ({...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) ) )
                    // InternalLcDsl.g:4320:4: {...}? => ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalLcDsl.g:4320:108: ( ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) ) )
                    // InternalLcDsl.g:4321:5: ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4327:5: ( ( rule__LaunchConfig__ExplicitAssignment_0_0 ) )
                    // InternalLcDsl.g:4328:6: ( rule__LaunchConfig__ExplicitAssignment_0_0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getExplicitAssignment_0_0()); 
                    // InternalLcDsl.g:4329:6: ( rule__LaunchConfig__ExplicitAssignment_0_0 )
                    // InternalLcDsl.g:4329:7: rule__LaunchConfig__ExplicitAssignment_0_0
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
                    // InternalLcDsl.g:4334:3: ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) )
                    {
                    // InternalLcDsl.g:4334:3: ({...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) ) )
                    // InternalLcDsl.g:4335:4: {...}? => ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalLcDsl.g:4335:108: ( ( ( rule__LaunchConfig__ManualAssignment_0_1 ) ) )
                    // InternalLcDsl.g:4336:5: ( ( rule__LaunchConfig__ManualAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4342:5: ( ( rule__LaunchConfig__ManualAssignment_0_1 ) )
                    // InternalLcDsl.g:4343:6: ( rule__LaunchConfig__ManualAssignment_0_1 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getManualAssignment_0_1()); 
                    // InternalLcDsl.g:4344:6: ( rule__LaunchConfig__ManualAssignment_0_1 )
                    // InternalLcDsl.g:4344:7: rule__LaunchConfig__ManualAssignment_0_1
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
                    // InternalLcDsl.g:4349:3: ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) )
                    {
                    // InternalLcDsl.g:4349:3: ({...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) ) )
                    // InternalLcDsl.g:4350:4: {...}? => ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2)");
                    }
                    // InternalLcDsl.g:4350:108: ( ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) ) )
                    // InternalLcDsl.g:4351:5: ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4357:5: ( ( rule__LaunchConfig__ForegroundAssignment_0_2 ) )
                    // InternalLcDsl.g:4358:6: ( rule__LaunchConfig__ForegroundAssignment_0_2 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getForegroundAssignment_0_2()); 
                    // InternalLcDsl.g:4359:6: ( rule__LaunchConfig__ForegroundAssignment_0_2 )
                    // InternalLcDsl.g:4359:7: rule__LaunchConfig__ForegroundAssignment_0_2
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
                    // InternalLcDsl.g:4364:3: ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) )
                    {
                    // InternalLcDsl.g:4364:3: ({...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) ) )
                    // InternalLcDsl.g:4365:4: {...}? => ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3)");
                    }
                    // InternalLcDsl.g:4365:108: ( ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) ) )
                    // InternalLcDsl.g:4366:5: ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4372:5: ( ( rule__LaunchConfig__NoConsoleAssignment_0_3 ) )
                    // InternalLcDsl.g:4373:6: ( rule__LaunchConfig__NoConsoleAssignment_0_3 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getNoConsoleAssignment_0_3()); 
                    // InternalLcDsl.g:4374:6: ( rule__LaunchConfig__NoConsoleAssignment_0_3 )
                    // InternalLcDsl.g:4374:7: rule__LaunchConfig__NoConsoleAssignment_0_3
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
                case 5 :
                    // InternalLcDsl.g:4379:3: ({...}? => ( ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) ) ) )
                    {
                    // InternalLcDsl.g:4379:3: ({...}? => ( ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) ) ) )
                    // InternalLcDsl.g:4380:4: {...}? => ( ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4)");
                    }
                    // InternalLcDsl.g:4380:108: ( ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) ) )
                    // InternalLcDsl.g:4381:5: ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4387:5: ( ( rule__LaunchConfig__NoValidateAssignment_0_4 ) )
                    // InternalLcDsl.g:4388:6: ( rule__LaunchConfig__NoValidateAssignment_0_4 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getNoValidateAssignment_0_4()); 
                    // InternalLcDsl.g:4389:6: ( rule__LaunchConfig__NoValidateAssignment_0_4 )
                    // InternalLcDsl.g:4389:7: rule__LaunchConfig__NoValidateAssignment_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__NoValidateAssignment_0_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getNoValidateAssignment_0_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:4394:3: ({...}? => ( ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) ) ) )
                    {
                    // InternalLcDsl.g:4394:3: ({...}? => ( ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) ) ) )
                    // InternalLcDsl.g:4395:4: {...}? => ( ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5)");
                    }
                    // InternalLcDsl.g:4395:108: ( ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) ) )
                    // InternalLcDsl.g:4396:5: ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4402:5: ( ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 ) )
                    // InternalLcDsl.g:4403:6: ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getSwInstallSupportAssignment_0_5()); 
                    // InternalLcDsl.g:4404:6: ( rule__LaunchConfig__SwInstallSupportAssignment_0_5 )
                    // InternalLcDsl.g:4404:7: rule__LaunchConfig__SwInstallSupportAssignment_0_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__SwInstallSupportAssignment_0_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getSwInstallSupportAssignment_0_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:4409:3: ({...}? => ( ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) ) ) )
                    {
                    // InternalLcDsl.g:4409:3: ({...}? => ( ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) ) ) )
                    // InternalLcDsl.g:4410:4: {...}? => ( ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6)");
                    }
                    // InternalLcDsl.g:4410:108: ( ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) ) )
                    // InternalLcDsl.g:4411:5: ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4417:5: ( ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 ) )
                    // InternalLcDsl.g:4418:6: ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getReplaceEnvAssignment_0_6()); 
                    // InternalLcDsl.g:4419:6: ( rule__LaunchConfig__ReplaceEnvAssignment_0_6 )
                    // InternalLcDsl.g:4419:7: rule__LaunchConfig__ReplaceEnvAssignment_0_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__ReplaceEnvAssignment_0_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getReplaceEnvAssignment_0_6()); 

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
    // InternalLcDsl.g:4432:1: rule__LaunchConfig__UnorderedGroup_0__0 : rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__1 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4436:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__1 )? )
            // InternalLcDsl.g:4437:2: rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_3);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:4438:2: ( rule__LaunchConfig__UnorderedGroup_0__1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt20=1;
            }
            else if ( LA20_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt20=1;
            }
            else if ( LA20_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                alt20=1;
            }
            else if ( LA20_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                alt20=1;
            }
            else if ( LA20_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLcDsl.g:4438:2: rule__LaunchConfig__UnorderedGroup_0__1
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
    // InternalLcDsl.g:4444:1: rule__LaunchConfig__UnorderedGroup_0__1 : rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__2 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4448:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__2 )? )
            // InternalLcDsl.g:4449:2: rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__2 )?
            {
            pushFollow(FOLLOW_3);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:4450:2: ( rule__LaunchConfig__UnorderedGroup_0__2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt21=1;
            }
            else if ( LA21_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                alt21=1;
            }
            else if ( LA21_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                alt21=1;
            }
            else if ( LA21_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLcDsl.g:4450:2: rule__LaunchConfig__UnorderedGroup_0__2
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
    // InternalLcDsl.g:4456:1: rule__LaunchConfig__UnorderedGroup_0__2 : rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__3 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4460:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__3 )? )
            // InternalLcDsl.g:4461:2: rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__3 )?
            {
            pushFollow(FOLLOW_3);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:4462:2: ( rule__LaunchConfig__UnorderedGroup_0__3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt22=1;
            }
            else if ( LA22_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt22=1;
            }
            else if ( LA22_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                alt22=1;
            }
            else if ( LA22_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                alt22=1;
            }
            else if ( LA22_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLcDsl.g:4462:2: rule__LaunchConfig__UnorderedGroup_0__3
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
    // InternalLcDsl.g:4468:1: rule__LaunchConfig__UnorderedGroup_0__3 : rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__4 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4472:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__4 )? )
            // InternalLcDsl.g:4473:2: rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__4 )?
            {
            pushFollow(FOLLOW_3);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:4474:2: ( rule__LaunchConfig__UnorderedGroup_0__4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt23=1;
            }
            else if ( LA23_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                alt23=1;
            }
            else if ( LA23_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                alt23=1;
            }
            else if ( LA23_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLcDsl.g:4474:2: rule__LaunchConfig__UnorderedGroup_0__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_0__4();

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
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0__3"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_0__4"
    // InternalLcDsl.g:4480:1: rule__LaunchConfig__UnorderedGroup_0__4 : rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__5 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4484:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__5 )? )
            // InternalLcDsl.g:4485:2: rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__5 )?
            {
            pushFollow(FOLLOW_3);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:4486:2: ( rule__LaunchConfig__UnorderedGroup_0__5 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                alt24=1;
            }
            else if ( LA24_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                alt24=1;
            }
            else if ( LA24_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLcDsl.g:4486:2: rule__LaunchConfig__UnorderedGroup_0__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_0__5();

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
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0__4"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_0__5"
    // InternalLcDsl.g:4492:1: rule__LaunchConfig__UnorderedGroup_0__5 : rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__6 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4496:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__6 )? )
            // InternalLcDsl.g:4497:2: rule__LaunchConfig__UnorderedGroup_0__Impl ( rule__LaunchConfig__UnorderedGroup_0__6 )?
            {
            pushFollow(FOLLOW_3);
            rule__LaunchConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:4498:2: ( rule__LaunchConfig__UnorderedGroup_0__6 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                alt25=1;
            }
            else if ( LA25_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                alt25=1;
            }
            else if ( LA25_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                alt25=1;
            }
            else if ( LA25_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLcDsl.g:4498:2: rule__LaunchConfig__UnorderedGroup_0__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_0__6();

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
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0__5"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_0__6"
    // InternalLcDsl.g:4504:1: rule__LaunchConfig__UnorderedGroup_0__6 : rule__LaunchConfig__UnorderedGroup_0__Impl ;
    public final void rule__LaunchConfig__UnorderedGroup_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4508:1: ( rule__LaunchConfig__UnorderedGroup_0__Impl )
            // InternalLcDsl.g:4509:2: rule__LaunchConfig__UnorderedGroup_0__Impl
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
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_0__6"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6"
    // InternalLcDsl.g:4516:1: rule__LaunchConfig__UnorderedGroup_6 : ( rule__LaunchConfig__UnorderedGroup_6__0 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
        	
        try {
            // InternalLcDsl.g:4521:1: ( ( rule__LaunchConfig__UnorderedGroup_6__0 )? )
            // InternalLcDsl.g:4522:2: ( rule__LaunchConfig__UnorderedGroup_6__0 )?
            {
            // InternalLcDsl.g:4522:2: ( rule__LaunchConfig__UnorderedGroup_6__0 )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalLcDsl.g:4522:2: rule__LaunchConfig__UnorderedGroup_6__0
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
    // InternalLcDsl.g:4530:1: rule__LaunchConfig__UnorderedGroup_6__Impl : ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) ) ) ) ) ;
    public final void rule__LaunchConfig__UnorderedGroup_6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4535:1: ( ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) ) ) ) ) )
            // InternalLcDsl.g:4536:3: ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) ) ) ) )
            {
            // InternalLcDsl.g:4536:3: ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) ) ) ) )
            int alt27=12;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalLcDsl.g:4537:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4537:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) )
                    // InternalLcDsl.g:4538:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0)");
                    }
                    // InternalLcDsl.g:4538:108: ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) )
                    // InternalLcDsl.g:4539:5: ( ( rule__LaunchConfig__Group_6_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4545:5: ( ( rule__LaunchConfig__Group_6_0__0 ) )
                    // InternalLcDsl.g:4546:6: ( rule__LaunchConfig__Group_6_0__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_0()); 
                    // InternalLcDsl.g:4547:6: ( rule__LaunchConfig__Group_6_0__0 )
                    // InternalLcDsl.g:4547:7: rule__LaunchConfig__Group_6_0__0
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
                    // InternalLcDsl.g:4552:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4552:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) )
                    // InternalLcDsl.g:4553:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1)");
                    }
                    // InternalLcDsl.g:4553:108: ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) )
                    // InternalLcDsl.g:4554:5: ( ( rule__LaunchConfig__Group_6_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4560:5: ( ( rule__LaunchConfig__Group_6_1__0 ) )
                    // InternalLcDsl.g:4561:6: ( rule__LaunchConfig__Group_6_1__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_1()); 
                    // InternalLcDsl.g:4562:6: ( rule__LaunchConfig__Group_6_1__0 )
                    // InternalLcDsl.g:4562:7: rule__LaunchConfig__Group_6_1__0
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
                    // InternalLcDsl.g:4567:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4567:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) )
                    // InternalLcDsl.g:4568:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2)");
                    }
                    // InternalLcDsl.g:4568:108: ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) )
                    // InternalLcDsl.g:4569:5: ( ( rule__LaunchConfig__Group_6_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4575:5: ( ( rule__LaunchConfig__Group_6_2__0 ) )
                    // InternalLcDsl.g:4576:6: ( rule__LaunchConfig__Group_6_2__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_2()); 
                    // InternalLcDsl.g:4577:6: ( rule__LaunchConfig__Group_6_2__0 )
                    // InternalLcDsl.g:4577:7: rule__LaunchConfig__Group_6_2__0
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
                    // InternalLcDsl.g:4582:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4582:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) )
                    // InternalLcDsl.g:4583:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3)");
                    }
                    // InternalLcDsl.g:4583:108: ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) )
                    // InternalLcDsl.g:4584:5: ( ( rule__LaunchConfig__Group_6_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4590:5: ( ( rule__LaunchConfig__Group_6_3__0 ) )
                    // InternalLcDsl.g:4591:6: ( rule__LaunchConfig__Group_6_3__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_3()); 
                    // InternalLcDsl.g:4592:6: ( rule__LaunchConfig__Group_6_3__0 )
                    // InternalLcDsl.g:4592:7: rule__LaunchConfig__Group_6_3__0
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
                    // InternalLcDsl.g:4597:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4597:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) )
                    // InternalLcDsl.g:4598:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4)");
                    }
                    // InternalLcDsl.g:4598:108: ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) )
                    // InternalLcDsl.g:4599:5: ( ( rule__LaunchConfig__Group_6_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4605:5: ( ( rule__LaunchConfig__Group_6_4__0 ) )
                    // InternalLcDsl.g:4606:6: ( rule__LaunchConfig__Group_6_4__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_4()); 
                    // InternalLcDsl.g:4607:6: ( rule__LaunchConfig__Group_6_4__0 )
                    // InternalLcDsl.g:4607:7: rule__LaunchConfig__Group_6_4__0
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
                    // InternalLcDsl.g:4612:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4612:3: ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) )
                    // InternalLcDsl.g:4613:4: {...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5)");
                    }
                    // InternalLcDsl.g:4613:108: ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) )
                    // InternalLcDsl.g:4614:5: ( ( rule__LaunchConfig__Group_6_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4620:5: ( ( rule__LaunchConfig__Group_6_5__0 ) )
                    // InternalLcDsl.g:4621:6: ( rule__LaunchConfig__Group_6_5__0 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getGroup_6_5()); 
                    // InternalLcDsl.g:4622:6: ( rule__LaunchConfig__Group_6_5__0 )
                    // InternalLcDsl.g:4622:7: rule__LaunchConfig__Group_6_5__0
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
                    // InternalLcDsl.g:4627:3: ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) )
                    {
                    // InternalLcDsl.g:4627:3: ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) )
                    // InternalLcDsl.g:4628:4: {...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6)");
                    }
                    // InternalLcDsl.g:4628:108: ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) )
                    // InternalLcDsl.g:4629:5: ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4635:5: ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) )
                    // InternalLcDsl.g:4636:6: ( rule__LaunchConfig__ApplicationAssignment_6_6 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getApplicationAssignment_6_6()); 
                    // InternalLcDsl.g:4637:6: ( rule__LaunchConfig__ApplicationAssignment_6_6 )
                    // InternalLcDsl.g:4637:7: rule__LaunchConfig__ApplicationAssignment_6_6
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
                    // InternalLcDsl.g:4642:3: ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) )
                    {
                    // InternalLcDsl.g:4642:3: ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) )
                    // InternalLcDsl.g:4643:4: {...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7)");
                    }
                    // InternalLcDsl.g:4643:108: ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) )
                    // InternalLcDsl.g:4644:5: ( ( rule__LaunchConfig__ProductAssignment_6_7 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4650:5: ( ( rule__LaunchConfig__ProductAssignment_6_7 ) )
                    // InternalLcDsl.g:4651:6: ( rule__LaunchConfig__ProductAssignment_6_7 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getProductAssignment_6_7()); 
                    // InternalLcDsl.g:4652:6: ( rule__LaunchConfig__ProductAssignment_6_7 )
                    // InternalLcDsl.g:4652:7: rule__LaunchConfig__ProductAssignment_6_7
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
                    // InternalLcDsl.g:4657:3: ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) )
                    {
                    // InternalLcDsl.g:4657:3: ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) )
                    // InternalLcDsl.g:4658:4: {...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8)");
                    }
                    // InternalLcDsl.g:4658:108: ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) )
                    // InternalLcDsl.g:4659:5: ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4665:5: ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) )
                    // InternalLcDsl.g:4666:6: ( rule__LaunchConfig__FavoritesAssignment_6_8 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getFavoritesAssignment_6_8()); 
                    // InternalLcDsl.g:4667:6: ( rule__LaunchConfig__FavoritesAssignment_6_8 )
                    // InternalLcDsl.g:4667:7: rule__LaunchConfig__FavoritesAssignment_6_8
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
                    // InternalLcDsl.g:4672:3: ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) )
                    {
                    // InternalLcDsl.g:4672:3: ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) )
                    // InternalLcDsl.g:4673:4: {...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9)");
                    }
                    // InternalLcDsl.g:4673:108: ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) )
                    // InternalLcDsl.g:4674:5: ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4680:5: ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) )
                    // InternalLcDsl.g:4681:6: ( rule__LaunchConfig__RedirectAssignment_6_9 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getRedirectAssignment_6_9()); 
                    // InternalLcDsl.g:4682:6: ( rule__LaunchConfig__RedirectAssignment_6_9 )
                    // InternalLcDsl.g:4682:7: rule__LaunchConfig__RedirectAssignment_6_9
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
                    // InternalLcDsl.g:4687:3: ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) )
                    {
                    // InternalLcDsl.g:4687:3: ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) )
                    // InternalLcDsl.g:4688:4: {...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10)");
                    }
                    // InternalLcDsl.g:4688:109: ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) )
                    // InternalLcDsl.g:4689:5: ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4695:5: ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) )
                    // InternalLcDsl.g:4696:6: ( rule__LaunchConfig__ExecEnvAssignment_6_10 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getExecEnvAssignment_6_10()); 
                    // InternalLcDsl.g:4697:6: ( rule__LaunchConfig__ExecEnvAssignment_6_10 )
                    // InternalLcDsl.g:4697:7: rule__LaunchConfig__ExecEnvAssignment_6_10
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
                case 12 :
                    // InternalLcDsl.g:4702:3: ({...}? => ( ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) ) ) )
                    {
                    // InternalLcDsl.g:4702:3: ({...}? => ( ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) ) ) )
                    // InternalLcDsl.g:4703:4: {...}? => ( ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {
                        throw new FailedPredicateException(input, "rule__LaunchConfig__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11)");
                    }
                    // InternalLcDsl.g:4703:109: ( ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) ) )
                    // InternalLcDsl.g:4704:5: ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4710:5: ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) )
                    // InternalLcDsl.g:4711:6: ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 )
                    {
                     before(grammarAccess.getLaunchConfigAccess().getConfigIniTemplateAssignment_6_11()); 
                    // InternalLcDsl.g:4712:6: ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 )
                    // InternalLcDsl.g:4712:7: rule__LaunchConfig__ConfigIniTemplateAssignment_6_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__ConfigIniTemplateAssignment_6_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getLaunchConfigAccess().getConfigIniTemplateAssignment_6_11()); 

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
    // InternalLcDsl.g:4725:1: rule__LaunchConfig__UnorderedGroup_6__0 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__1 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4729:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__1 )? )
            // InternalLcDsl.g:4730:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__1 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4731:2: ( rule__LaunchConfig__UnorderedGroup_6__1 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalLcDsl.g:4731:2: rule__LaunchConfig__UnorderedGroup_6__1
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
    // InternalLcDsl.g:4737:1: rule__LaunchConfig__UnorderedGroup_6__1 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__2 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4741:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__2 )? )
            // InternalLcDsl.g:4742:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__2 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4743:2: ( rule__LaunchConfig__UnorderedGroup_6__2 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalLcDsl.g:4743:2: rule__LaunchConfig__UnorderedGroup_6__2
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
    // InternalLcDsl.g:4749:1: rule__LaunchConfig__UnorderedGroup_6__2 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__3 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4753:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__3 )? )
            // InternalLcDsl.g:4754:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__3 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4755:2: ( rule__LaunchConfig__UnorderedGroup_6__3 )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalLcDsl.g:4755:2: rule__LaunchConfig__UnorderedGroup_6__3
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
    // InternalLcDsl.g:4761:1: rule__LaunchConfig__UnorderedGroup_6__3 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__4 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4765:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__4 )? )
            // InternalLcDsl.g:4766:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__4 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4767:2: ( rule__LaunchConfig__UnorderedGroup_6__4 )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalLcDsl.g:4767:2: rule__LaunchConfig__UnorderedGroup_6__4
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
    // InternalLcDsl.g:4773:1: rule__LaunchConfig__UnorderedGroup_6__4 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__5 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4777:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__5 )? )
            // InternalLcDsl.g:4778:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__5 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4779:2: ( rule__LaunchConfig__UnorderedGroup_6__5 )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalLcDsl.g:4779:2: rule__LaunchConfig__UnorderedGroup_6__5
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
    // InternalLcDsl.g:4785:1: rule__LaunchConfig__UnorderedGroup_6__5 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__6 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4789:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__6 )? )
            // InternalLcDsl.g:4790:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__6 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4791:2: ( rule__LaunchConfig__UnorderedGroup_6__6 )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalLcDsl.g:4791:2: rule__LaunchConfig__UnorderedGroup_6__6
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
    // InternalLcDsl.g:4797:1: rule__LaunchConfig__UnorderedGroup_6__6 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__7 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4801:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__7 )? )
            // InternalLcDsl.g:4802:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__7 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4803:2: ( rule__LaunchConfig__UnorderedGroup_6__7 )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalLcDsl.g:4803:2: rule__LaunchConfig__UnorderedGroup_6__7
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
    // InternalLcDsl.g:4809:1: rule__LaunchConfig__UnorderedGroup_6__7 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__8 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4813:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__8 )? )
            // InternalLcDsl.g:4814:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__8 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4815:2: ( rule__LaunchConfig__UnorderedGroup_6__8 )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalLcDsl.g:4815:2: rule__LaunchConfig__UnorderedGroup_6__8
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
    // InternalLcDsl.g:4821:1: rule__LaunchConfig__UnorderedGroup_6__8 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__9 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4825:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__9 )? )
            // InternalLcDsl.g:4826:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__9 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4827:2: ( rule__LaunchConfig__UnorderedGroup_6__9 )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalLcDsl.g:4827:2: rule__LaunchConfig__UnorderedGroup_6__9
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
    // InternalLcDsl.g:4833:1: rule__LaunchConfig__UnorderedGroup_6__9 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__10 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4837:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__10 )? )
            // InternalLcDsl.g:4838:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__10 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4839:2: ( rule__LaunchConfig__UnorderedGroup_6__10 )?
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalLcDsl.g:4839:2: rule__LaunchConfig__UnorderedGroup_6__10
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
    // InternalLcDsl.g:4845:1: rule__LaunchConfig__UnorderedGroup_6__10 : rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__11 )? ;
    public final void rule__LaunchConfig__UnorderedGroup_6__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4849:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__11 )? )
            // InternalLcDsl.g:4850:2: rule__LaunchConfig__UnorderedGroup_6__Impl ( rule__LaunchConfig__UnorderedGroup_6__11 )?
            {
            pushFollow(FOLLOW_41);
            rule__LaunchConfig__UnorderedGroup_6__Impl();

            state._fsp--;

            // InternalLcDsl.g:4851:2: ( rule__LaunchConfig__UnorderedGroup_6__11 )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalLcDsl.g:4851:2: rule__LaunchConfig__UnorderedGroup_6__11
                    {
                    pushFollow(FOLLOW_2);
                    rule__LaunchConfig__UnorderedGroup_6__11();

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
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__10"


    // $ANTLR start "rule__LaunchConfig__UnorderedGroup_6__11"
    // InternalLcDsl.g:4857:1: rule__LaunchConfig__UnorderedGroup_6__11 : rule__LaunchConfig__UnorderedGroup_6__Impl ;
    public final void rule__LaunchConfig__UnorderedGroup_6__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4861:1: ( rule__LaunchConfig__UnorderedGroup_6__Impl )
            // InternalLcDsl.g:4862:2: rule__LaunchConfig__UnorderedGroup_6__Impl
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
    // $ANTLR end "rule__LaunchConfig__UnorderedGroup_6__11"


    // $ANTLR start "rule__Favorites__UnorderedGroup_2"
    // InternalLcDsl.g:4869:1: rule__Favorites__UnorderedGroup_2 : ( rule__Favorites__UnorderedGroup_2__0 )? ;
    public final void rule__Favorites__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getFavoritesAccess().getUnorderedGroup_2());
        	
        try {
            // InternalLcDsl.g:4874:1: ( ( rule__Favorites__UnorderedGroup_2__0 )? )
            // InternalLcDsl.g:4875:2: ( rule__Favorites__UnorderedGroup_2__0 )?
            {
            // InternalLcDsl.g:4875:2: ( rule__Favorites__UnorderedGroup_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalLcDsl.g:4875:2: rule__Favorites__UnorderedGroup_2__0
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
    // InternalLcDsl.g:4883:1: rule__Favorites__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) ) ) ;
    public final void rule__Favorites__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4888:1: ( ( ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) ) ) )
            // InternalLcDsl.g:4889:3: ( ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) ) )
            {
            // InternalLcDsl.g:4889:3: ( ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalLcDsl.g:4890:3: ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) )
                    {
                    // InternalLcDsl.g:4890:3: ({...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) ) )
                    // InternalLcDsl.g:4891:4: {...}? => ( ( ( rule__Favorites__RunAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Favorites__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalLcDsl.g:4891:105: ( ( ( rule__Favorites__RunAssignment_2_0 ) ) )
                    // InternalLcDsl.g:4892:5: ( ( rule__Favorites__RunAssignment_2_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4898:5: ( ( rule__Favorites__RunAssignment_2_0 ) )
                    // InternalLcDsl.g:4899:6: ( rule__Favorites__RunAssignment_2_0 )
                    {
                     before(grammarAccess.getFavoritesAccess().getRunAssignment_2_0()); 
                    // InternalLcDsl.g:4900:6: ( rule__Favorites__RunAssignment_2_0 )
                    // InternalLcDsl.g:4900:7: rule__Favorites__RunAssignment_2_0
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
                    // InternalLcDsl.g:4905:3: ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) )
                    {
                    // InternalLcDsl.g:4905:3: ({...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) ) )
                    // InternalLcDsl.g:4906:4: {...}? => ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Favorites__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalLcDsl.g:4906:105: ( ( ( rule__Favorites__DebugAssignment_2_1 ) ) )
                    // InternalLcDsl.g:4907:5: ( ( rule__Favorites__DebugAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4913:5: ( ( rule__Favorites__DebugAssignment_2_1 ) )
                    // InternalLcDsl.g:4914:6: ( rule__Favorites__DebugAssignment_2_1 )
                    {
                     before(grammarAccess.getFavoritesAccess().getDebugAssignment_2_1()); 
                    // InternalLcDsl.g:4915:6: ( rule__Favorites__DebugAssignment_2_1 )
                    // InternalLcDsl.g:4915:7: rule__Favorites__DebugAssignment_2_1
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
    // InternalLcDsl.g:4928:1: rule__Favorites__UnorderedGroup_2__0 : rule__Favorites__UnorderedGroup_2__Impl ( rule__Favorites__UnorderedGroup_2__1 )? ;
    public final void rule__Favorites__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4932:1: ( rule__Favorites__UnorderedGroup_2__Impl ( rule__Favorites__UnorderedGroup_2__1 )? )
            // InternalLcDsl.g:4933:2: rule__Favorites__UnorderedGroup_2__Impl ( rule__Favorites__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_42);
            rule__Favorites__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:4934:2: ( rule__Favorites__UnorderedGroup_2__1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalLcDsl.g:4934:2: rule__Favorites__UnorderedGroup_2__1
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
    // InternalLcDsl.g:4940:1: rule__Favorites__UnorderedGroup_2__1 : rule__Favorites__UnorderedGroup_2__Impl ;
    public final void rule__Favorites__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:4944:1: ( rule__Favorites__UnorderedGroup_2__Impl )
            // InternalLcDsl.g:4945:2: rule__Favorites__UnorderedGroup_2__Impl
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
    // InternalLcDsl.g:4952:1: rule__Redirect__UnorderedGroup_2 : ( rule__Redirect__UnorderedGroup_2__0 )? ;
    public final void rule__Redirect__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
        	
        try {
            // InternalLcDsl.g:4957:1: ( ( rule__Redirect__UnorderedGroup_2__0 )? )
            // InternalLcDsl.g:4958:2: ( rule__Redirect__UnorderedGroup_2__0 )?
            {
            // InternalLcDsl.g:4958:2: ( rule__Redirect__UnorderedGroup_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 >= 32 && LA42_0 <= 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalLcDsl.g:4958:2: rule__Redirect__UnorderedGroup_2__0
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
    // InternalLcDsl.g:4966:1: rule__Redirect__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__Redirect__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:4971:1: ( ( ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) ) ) )
            // InternalLcDsl.g:4972:3: ( ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) ) )
            {
            // InternalLcDsl.g:4972:3: ( ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 >= 32 && LA43_0 <= 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalLcDsl.g:4973:3: ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4973:3: ({...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) ) )
                    // InternalLcDsl.g:4974:4: {...}? => ( ( ( rule__Redirect__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Redirect__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalLcDsl.g:4974:104: ( ( ( rule__Redirect__Group_2_0__0 ) ) )
                    // InternalLcDsl.g:4975:5: ( ( rule__Redirect__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4981:5: ( ( rule__Redirect__Group_2_0__0 ) )
                    // InternalLcDsl.g:4982:6: ( rule__Redirect__Group_2_0__0 )
                    {
                     before(grammarAccess.getRedirectAccess().getGroup_2_0()); 
                    // InternalLcDsl.g:4983:6: ( rule__Redirect__Group_2_0__0 )
                    // InternalLcDsl.g:4983:7: rule__Redirect__Group_2_0__0
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
                    // InternalLcDsl.g:4988:3: ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) )
                    {
                    // InternalLcDsl.g:4988:3: ({...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) ) )
                    // InternalLcDsl.g:4989:4: {...}? => ( ( ( rule__Redirect__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Redirect__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalLcDsl.g:4989:104: ( ( ( rule__Redirect__Group_2_1__0 ) ) )
                    // InternalLcDsl.g:4990:5: ( ( rule__Redirect__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:4996:5: ( ( rule__Redirect__Group_2_1__0 ) )
                    // InternalLcDsl.g:4997:6: ( rule__Redirect__Group_2_1__0 )
                    {
                     before(grammarAccess.getRedirectAccess().getGroup_2_1()); 
                    // InternalLcDsl.g:4998:6: ( rule__Redirect__Group_2_1__0 )
                    // InternalLcDsl.g:4998:7: rule__Redirect__Group_2_1__0
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
    // InternalLcDsl.g:5011:1: rule__Redirect__UnorderedGroup_2__0 : rule__Redirect__UnorderedGroup_2__Impl ( rule__Redirect__UnorderedGroup_2__1 )? ;
    public final void rule__Redirect__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5015:1: ( rule__Redirect__UnorderedGroup_2__Impl ( rule__Redirect__UnorderedGroup_2__1 )? )
            // InternalLcDsl.g:5016:2: rule__Redirect__UnorderedGroup_2__Impl ( rule__Redirect__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_43);
            rule__Redirect__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:5017:2: ( rule__Redirect__UnorderedGroup_2__1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 >= 32 && LA44_0 <= 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalLcDsl.g:5017:2: rule__Redirect__UnorderedGroup_2__1
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
    // InternalLcDsl.g:5023:1: rule__Redirect__UnorderedGroup_2__1 : rule__Redirect__UnorderedGroup_2__Impl ;
    public final void rule__Redirect__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5027:1: ( rule__Redirect__UnorderedGroup_2__Impl )
            // InternalLcDsl.g:5028:2: rule__Redirect__UnorderedGroup_2__Impl
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


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1"
    // InternalLcDsl.g:5035:1: rule__PluginWithVersionAndStartLevel__UnorderedGroup_1 : ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0 )? ;
    public final void rule__PluginWithVersionAndStartLevel__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
        	
        try {
            // InternalLcDsl.g:5040:1: ( ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0 )? )
            // InternalLcDsl.g:5041:2: ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0 )?
            {
            // InternalLcDsl.g:5041:2: ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalLcDsl.g:5041:2: rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl"
    // InternalLcDsl.g:5049:1: rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) ) ) ) ) ;
    public final void rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:5054:1: ( ( ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) ) ) ) ) )
            // InternalLcDsl.g:5055:3: ( ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) ) ) ) )
            {
            // InternalLcDsl.g:5055:3: ( ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalLcDsl.g:5056:3: ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) ) ) )
                    {
                    // InternalLcDsl.g:5056:3: ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) ) ) )
                    // InternalLcDsl.g:5057:4: {...}? => ( ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalLcDsl.g:5057:126: ( ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) ) )
                    // InternalLcDsl.g:5058:5: ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:5064:5: ( ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 ) )
                    // InternalLcDsl.g:5065:6: ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 )
                    {
                     before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getAutoStartAssignment_1_0()); 
                    // InternalLcDsl.g:5066:6: ( rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 )
                    // InternalLcDsl.g:5066:7: rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getAutoStartAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:5071:3: ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) ) ) )
                    {
                    // InternalLcDsl.g:5071:3: ({...}? => ( ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) ) ) )
                    // InternalLcDsl.g:5072:4: {...}? => ( ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalLcDsl.g:5072:126: ( ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) ) )
                    // InternalLcDsl.g:5073:5: ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:5079:5: ( ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 ) )
                    // InternalLcDsl.g:5080:6: ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 )
                    {
                     before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getGroup_1_1()); 
                    // InternalLcDsl.g:5081:6: ( rule__PluginWithVersionAndStartLevel__Group_1_1__0 )
                    // InternalLcDsl.g:5081:7: rule__PluginWithVersionAndStartLevel__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PluginWithVersionAndStartLevel__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getGroup_1_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0"
    // InternalLcDsl.g:5094:1: rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0 : rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1 )? ;
    public final void rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5098:1: ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1 )? )
            // InternalLcDsl.g:5099:2: rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_44);
            rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalLcDsl.g:5100:2: ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalLcDsl.g:5100:2: rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1();

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__0"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1"
    // InternalLcDsl.g:5106:1: rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1 : rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl ;
    public final void rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5110:1: ( rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl )
            // InternalLcDsl.g:5111:2: rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__Impl();

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__UnorderedGroup_1__1"


    // $ANTLR start "rule__ClearOption__UnorderedGroup_2"
    // InternalLcDsl.g:5118:1: rule__ClearOption__UnorderedGroup_2 : ( rule__ClearOption__UnorderedGroup_2__0 )? ;
    public final void rule__ClearOption__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
        	
        try {
            // InternalLcDsl.g:5123:1: ( ( rule__ClearOption__UnorderedGroup_2__0 )? )
            // InternalLcDsl.g:5124:2: ( rule__ClearOption__UnorderedGroup_2__0 )?
            {
            // InternalLcDsl.g:5124:2: ( rule__ClearOption__UnorderedGroup_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ( LA48_0 == 40 || LA48_0 == 77 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalLcDsl.g:5124:2: rule__ClearOption__UnorderedGroup_2__0
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
    // InternalLcDsl.g:5132:1: rule__ClearOption__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) ) ) ;
    public final void rule__ClearOption__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:5137:1: ( ( ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) ) ) )
            // InternalLcDsl.g:5138:3: ( ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) ) )
            {
            // InternalLcDsl.g:5138:3: ( ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ( LA49_0 == 40 || LA49_0 == 77 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalLcDsl.g:5139:3: ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) )
                    {
                    // InternalLcDsl.g:5139:3: ({...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) ) )
                    // InternalLcDsl.g:5140:4: {...}? => ( ( ( rule__ClearOption__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ClearOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalLcDsl.g:5140:107: ( ( ( rule__ClearOption__Group_2_0__0 ) ) )
                    // InternalLcDsl.g:5141:5: ( ( rule__ClearOption__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:5147:5: ( ( rule__ClearOption__Group_2_0__0 ) )
                    // InternalLcDsl.g:5148:6: ( rule__ClearOption__Group_2_0__0 )
                    {
                     before(grammarAccess.getClearOptionAccess().getGroup_2_0()); 
                    // InternalLcDsl.g:5149:6: ( rule__ClearOption__Group_2_0__0 )
                    // InternalLcDsl.g:5149:7: rule__ClearOption__Group_2_0__0
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
                    // InternalLcDsl.g:5154:3: ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) )
                    {
                    // InternalLcDsl.g:5154:3: ({...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) ) )
                    // InternalLcDsl.g:5155:4: {...}? => ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ClearOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalLcDsl.g:5155:107: ( ( ( rule__ClearOption__ConfigAssignment_2_1 ) ) )
                    // InternalLcDsl.g:5156:5: ( ( rule__ClearOption__ConfigAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:5162:5: ( ( rule__ClearOption__ConfigAssignment_2_1 ) )
                    // InternalLcDsl.g:5163:6: ( rule__ClearOption__ConfigAssignment_2_1 )
                    {
                     before(grammarAccess.getClearOptionAccess().getConfigAssignment_2_1()); 
                    // InternalLcDsl.g:5164:6: ( rule__ClearOption__ConfigAssignment_2_1 )
                    // InternalLcDsl.g:5164:7: rule__ClearOption__ConfigAssignment_2_1
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
    // InternalLcDsl.g:5177:1: rule__ClearOption__UnorderedGroup_2__0 : rule__ClearOption__UnorderedGroup_2__Impl ( rule__ClearOption__UnorderedGroup_2__1 )? ;
    public final void rule__ClearOption__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5181:1: ( rule__ClearOption__UnorderedGroup_2__Impl ( rule__ClearOption__UnorderedGroup_2__1 )? )
            // InternalLcDsl.g:5182:2: rule__ClearOption__UnorderedGroup_2__Impl ( rule__ClearOption__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_45);
            rule__ClearOption__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:5183:2: ( rule__ClearOption__UnorderedGroup_2__1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ( LA50_0 == 40 || LA50_0 == 77 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalLcDsl.g:5183:2: rule__ClearOption__UnorderedGroup_2__1
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
    // InternalLcDsl.g:5189:1: rule__ClearOption__UnorderedGroup_2__1 : rule__ClearOption__UnorderedGroup_2__Impl ;
    public final void rule__ClearOption__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5193:1: ( rule__ClearOption__UnorderedGroup_2__Impl )
            // InternalLcDsl.g:5194:2: rule__ClearOption__UnorderedGroup_2__Impl
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
    // InternalLcDsl.g:5201:1: rule__MemoryOption__UnorderedGroup_2 : ( rule__MemoryOption__UnorderedGroup_2__0 )? ;
    public final void rule__MemoryOption__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
        	
        try {
            // InternalLcDsl.g:5206:1: ( ( rule__MemoryOption__UnorderedGroup_2__0 )? )
            // InternalLcDsl.g:5207:2: ( rule__MemoryOption__UnorderedGroup_2__0 )?
            {
            // InternalLcDsl.g:5207:2: ( rule__MemoryOption__UnorderedGroup_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalLcDsl.g:5207:2: rule__MemoryOption__UnorderedGroup_2__0
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
    // InternalLcDsl.g:5215:1: rule__MemoryOption__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) ) ) ;
    public final void rule__MemoryOption__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:5220:1: ( ( ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) ) ) )
            // InternalLcDsl.g:5221:3: ( ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) ) )
            {
            // InternalLcDsl.g:5221:3: ( ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) ) )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt52=2;
            }
            else if ( LA52_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                alt52=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalLcDsl.g:5222:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) )
                    {
                    // InternalLcDsl.g:5222:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) ) )
                    // InternalLcDsl.g:5223:4: {...}? => ( ( ( rule__MemoryOption__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MemoryOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalLcDsl.g:5223:108: ( ( ( rule__MemoryOption__Group_2_0__0 ) ) )
                    // InternalLcDsl.g:5224:5: ( ( rule__MemoryOption__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:5230:5: ( ( rule__MemoryOption__Group_2_0__0 ) )
                    // InternalLcDsl.g:5231:6: ( rule__MemoryOption__Group_2_0__0 )
                    {
                     before(grammarAccess.getMemoryOptionAccess().getGroup_2_0()); 
                    // InternalLcDsl.g:5232:6: ( rule__MemoryOption__Group_2_0__0 )
                    // InternalLcDsl.g:5232:7: rule__MemoryOption__Group_2_0__0
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
                    // InternalLcDsl.g:5237:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) )
                    {
                    // InternalLcDsl.g:5237:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) ) )
                    // InternalLcDsl.g:5238:4: {...}? => ( ( ( rule__MemoryOption__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MemoryOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalLcDsl.g:5238:108: ( ( ( rule__MemoryOption__Group_2_1__0 ) ) )
                    // InternalLcDsl.g:5239:5: ( ( rule__MemoryOption__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:5245:5: ( ( rule__MemoryOption__Group_2_1__0 ) )
                    // InternalLcDsl.g:5246:6: ( rule__MemoryOption__Group_2_1__0 )
                    {
                     before(grammarAccess.getMemoryOptionAccess().getGroup_2_1()); 
                    // InternalLcDsl.g:5247:6: ( rule__MemoryOption__Group_2_1__0 )
                    // InternalLcDsl.g:5247:7: rule__MemoryOption__Group_2_1__0
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
                    // InternalLcDsl.g:5252:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) )
                    {
                    // InternalLcDsl.g:5252:3: ({...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) ) )
                    // InternalLcDsl.g:5253:4: {...}? => ( ( ( rule__MemoryOption__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__MemoryOption__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalLcDsl.g:5253:108: ( ( ( rule__MemoryOption__Group_2_2__0 ) ) )
                    // InternalLcDsl.g:5254:5: ( ( rule__MemoryOption__Group_2_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:5260:5: ( ( rule__MemoryOption__Group_2_2__0 ) )
                    // InternalLcDsl.g:5261:6: ( rule__MemoryOption__Group_2_2__0 )
                    {
                     before(grammarAccess.getMemoryOptionAccess().getGroup_2_2()); 
                    // InternalLcDsl.g:5262:6: ( rule__MemoryOption__Group_2_2__0 )
                    // InternalLcDsl.g:5262:7: rule__MemoryOption__Group_2_2__0
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
    // InternalLcDsl.g:5275:1: rule__MemoryOption__UnorderedGroup_2__0 : rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__1 )? ;
    public final void rule__MemoryOption__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5279:1: ( rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__1 )? )
            // InternalLcDsl.g:5280:2: rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_46);
            rule__MemoryOption__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:5281:2: ( rule__MemoryOption__UnorderedGroup_2__1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt53=1;
            }
            else if ( LA53_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalLcDsl.g:5281:2: rule__MemoryOption__UnorderedGroup_2__1
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
    // InternalLcDsl.g:5287:1: rule__MemoryOption__UnorderedGroup_2__1 : rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__2 )? ;
    public final void rule__MemoryOption__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5291:1: ( rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__2 )? )
            // InternalLcDsl.g:5292:2: rule__MemoryOption__UnorderedGroup_2__Impl ( rule__MemoryOption__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_46);
            rule__MemoryOption__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalLcDsl.g:5293:2: ( rule__MemoryOption__UnorderedGroup_2__2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                alt54=1;
            }
            else if ( LA54_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalLcDsl.g:5293:2: rule__MemoryOption__UnorderedGroup_2__2
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
    // InternalLcDsl.g:5299:1: rule__MemoryOption__UnorderedGroup_2__2 : rule__MemoryOption__UnorderedGroup_2__Impl ;
    public final void rule__MemoryOption__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5303:1: ( rule__MemoryOption__UnorderedGroup_2__Impl )
            // InternalLcDsl.g:5304:2: rule__MemoryOption__UnorderedGroup_2__Impl
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
    // InternalLcDsl.g:5311:1: rule__GroupMember__UnorderedGroup_0 : ( rule__GroupMember__UnorderedGroup_0__0 )? ;
    public final void rule__GroupMember__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
        	
        try {
            // InternalLcDsl.g:5316:1: ( ( rule__GroupMember__UnorderedGroup_0__0 )? )
            // InternalLcDsl.g:5317:2: ( rule__GroupMember__UnorderedGroup_0__0 )?
            {
            // InternalLcDsl.g:5317:2: ( rule__GroupMember__UnorderedGroup_0__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 >= 19 && LA55_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalLcDsl.g:5317:2: rule__GroupMember__UnorderedGroup_0__0
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
    // InternalLcDsl.g:5325:1: rule__GroupMember__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) ) ) ;
    public final void rule__GroupMember__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLcDsl.g:5330:1: ( ( ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) ) ) )
            // InternalLcDsl.g:5331:3: ( ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) ) )
            {
            // InternalLcDsl.g:5331:3: ( ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( LA56_0 >= 19 && LA56_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalLcDsl.g:5332:3: ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) )
                    {
                    // InternalLcDsl.g:5332:3: ({...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) ) )
                    // InternalLcDsl.g:5333:4: {...}? => ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GroupMember__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalLcDsl.g:5333:107: ( ( ( rule__GroupMember__TypeAssignment_0_0 ) ) )
                    // InternalLcDsl.g:5334:5: ( ( rule__GroupMember__TypeAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:5340:5: ( ( rule__GroupMember__TypeAssignment_0_0 ) )
                    // InternalLcDsl.g:5341:6: ( rule__GroupMember__TypeAssignment_0_0 )
                    {
                     before(grammarAccess.getGroupMemberAccess().getTypeAssignment_0_0()); 
                    // InternalLcDsl.g:5342:6: ( rule__GroupMember__TypeAssignment_0_0 )
                    // InternalLcDsl.g:5342:7: rule__GroupMember__TypeAssignment_0_0
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
                    // InternalLcDsl.g:5347:3: ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) )
                    {
                    // InternalLcDsl.g:5347:3: ({...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) ) )
                    // InternalLcDsl.g:5348:4: {...}? => ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GroupMember__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalLcDsl.g:5348:107: ( ( ( rule__GroupMember__AdoptAssignment_0_1 ) ) )
                    // InternalLcDsl.g:5349:5: ( ( rule__GroupMember__AdoptAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalLcDsl.g:5355:5: ( ( rule__GroupMember__AdoptAssignment_0_1 ) )
                    // InternalLcDsl.g:5356:6: ( rule__GroupMember__AdoptAssignment_0_1 )
                    {
                     before(grammarAccess.getGroupMemberAccess().getAdoptAssignment_0_1()); 
                    // InternalLcDsl.g:5357:6: ( rule__GroupMember__AdoptAssignment_0_1 )
                    // InternalLcDsl.g:5357:7: rule__GroupMember__AdoptAssignment_0_1
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
    // InternalLcDsl.g:5370:1: rule__GroupMember__UnorderedGroup_0__0 : rule__GroupMember__UnorderedGroup_0__Impl ( rule__GroupMember__UnorderedGroup_0__1 )? ;
    public final void rule__GroupMember__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5374:1: ( rule__GroupMember__UnorderedGroup_0__Impl ( rule__GroupMember__UnorderedGroup_0__1 )? )
            // InternalLcDsl.g:5375:2: rule__GroupMember__UnorderedGroup_0__Impl ( rule__GroupMember__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_47);
            rule__GroupMember__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalLcDsl.g:5376:2: ( rule__GroupMember__UnorderedGroup_0__1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( LA57_0 >= 19 && LA57_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalLcDsl.g:5376:2: rule__GroupMember__UnorderedGroup_0__1
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
    // InternalLcDsl.g:5382:1: rule__GroupMember__UnorderedGroup_0__1 : rule__GroupMember__UnorderedGroup_0__Impl ;
    public final void rule__GroupMember__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5386:1: ( rule__GroupMember__UnorderedGroup_0__Impl )
            // InternalLcDsl.g:5387:2: rule__GroupMember__UnorderedGroup_0__Impl
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
    // InternalLcDsl.g:5394:1: rule__LCModel__ConfigurationsAssignment : ( ruleLaunchConfig ) ;
    public final void rule__LCModel__ConfigurationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5398:1: ( ( ruleLaunchConfig ) )
            // InternalLcDsl.g:5399:2: ( ruleLaunchConfig )
            {
            // InternalLcDsl.g:5399:2: ( ruleLaunchConfig )
            // InternalLcDsl.g:5400:3: ruleLaunchConfig
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
    // InternalLcDsl.g:5409:1: rule__LaunchConfig__ExplicitAssignment_0_0 : ( ( 'explicit' ) ) ;
    public final void rule__LaunchConfig__ExplicitAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5413:1: ( ( ( 'explicit' ) ) )
            // InternalLcDsl.g:5414:2: ( ( 'explicit' ) )
            {
            // InternalLcDsl.g:5414:2: ( ( 'explicit' ) )
            // InternalLcDsl.g:5415:3: ( 'explicit' )
            {
             before(grammarAccess.getLaunchConfigAccess().getExplicitExplicitKeyword_0_0_0()); 
            // InternalLcDsl.g:5416:3: ( 'explicit' )
            // InternalLcDsl.g:5417:4: 'explicit'
            {
             before(grammarAccess.getLaunchConfigAccess().getExplicitExplicitKeyword_0_0_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalLcDsl.g:5428:1: rule__LaunchConfig__ManualAssignment_0_1 : ( ( 'manual' ) ) ;
    public final void rule__LaunchConfig__ManualAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5432:1: ( ( ( 'manual' ) ) )
            // InternalLcDsl.g:5433:2: ( ( 'manual' ) )
            {
            // InternalLcDsl.g:5433:2: ( ( 'manual' ) )
            // InternalLcDsl.g:5434:3: ( 'manual' )
            {
             before(grammarAccess.getLaunchConfigAccess().getManualManualKeyword_0_1_0()); 
            // InternalLcDsl.g:5435:3: ( 'manual' )
            // InternalLcDsl.g:5436:4: 'manual'
            {
             before(grammarAccess.getLaunchConfigAccess().getManualManualKeyword_0_1_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalLcDsl.g:5447:1: rule__LaunchConfig__ForegroundAssignment_0_2 : ( ( 'foreground' ) ) ;
    public final void rule__LaunchConfig__ForegroundAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5451:1: ( ( ( 'foreground' ) ) )
            // InternalLcDsl.g:5452:2: ( ( 'foreground' ) )
            {
            // InternalLcDsl.g:5452:2: ( ( 'foreground' ) )
            // InternalLcDsl.g:5453:3: ( 'foreground' )
            {
             before(grammarAccess.getLaunchConfigAccess().getForegroundForegroundKeyword_0_2_0()); 
            // InternalLcDsl.g:5454:3: ( 'foreground' )
            // InternalLcDsl.g:5455:4: 'foreground'
            {
             before(grammarAccess.getLaunchConfigAccess().getForegroundForegroundKeyword_0_2_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalLcDsl.g:5466:1: rule__LaunchConfig__NoConsoleAssignment_0_3 : ( ( 'no-console' ) ) ;
    public final void rule__LaunchConfig__NoConsoleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5470:1: ( ( ( 'no-console' ) ) )
            // InternalLcDsl.g:5471:2: ( ( 'no-console' ) )
            {
            // InternalLcDsl.g:5471:2: ( ( 'no-console' ) )
            // InternalLcDsl.g:5472:3: ( 'no-console' )
            {
             before(grammarAccess.getLaunchConfigAccess().getNoConsoleNoConsoleKeyword_0_3_0()); 
            // InternalLcDsl.g:5473:3: ( 'no-console' )
            // InternalLcDsl.g:5474:4: 'no-console'
            {
             before(grammarAccess.getLaunchConfigAccess().getNoConsoleNoConsoleKeyword_0_3_0()); 
            match(input,72,FOLLOW_2); 
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


    // $ANTLR start "rule__LaunchConfig__NoValidateAssignment_0_4"
    // InternalLcDsl.g:5485:1: rule__LaunchConfig__NoValidateAssignment_0_4 : ( ( 'no-validate' ) ) ;
    public final void rule__LaunchConfig__NoValidateAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5489:1: ( ( ( 'no-validate' ) ) )
            // InternalLcDsl.g:5490:2: ( ( 'no-validate' ) )
            {
            // InternalLcDsl.g:5490:2: ( ( 'no-validate' ) )
            // InternalLcDsl.g:5491:3: ( 'no-validate' )
            {
             before(grammarAccess.getLaunchConfigAccess().getNoValidateNoValidateKeyword_0_4_0()); 
            // InternalLcDsl.g:5492:3: ( 'no-validate' )
            // InternalLcDsl.g:5493:4: 'no-validate'
            {
             before(grammarAccess.getLaunchConfigAccess().getNoValidateNoValidateKeyword_0_4_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getNoValidateNoValidateKeyword_0_4_0()); 

            }

             after(grammarAccess.getLaunchConfigAccess().getNoValidateNoValidateKeyword_0_4_0()); 

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
    // $ANTLR end "rule__LaunchConfig__NoValidateAssignment_0_4"


    // $ANTLR start "rule__LaunchConfig__SwInstallSupportAssignment_0_5"
    // InternalLcDsl.g:5504:1: rule__LaunchConfig__SwInstallSupportAssignment_0_5 : ( ( 'sw-install-allowed' ) ) ;
    public final void rule__LaunchConfig__SwInstallSupportAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5508:1: ( ( ( 'sw-install-allowed' ) ) )
            // InternalLcDsl.g:5509:2: ( ( 'sw-install-allowed' ) )
            {
            // InternalLcDsl.g:5509:2: ( ( 'sw-install-allowed' ) )
            // InternalLcDsl.g:5510:3: ( 'sw-install-allowed' )
            {
             before(grammarAccess.getLaunchConfigAccess().getSwInstallSupportSwInstallAllowedKeyword_0_5_0()); 
            // InternalLcDsl.g:5511:3: ( 'sw-install-allowed' )
            // InternalLcDsl.g:5512:4: 'sw-install-allowed'
            {
             before(grammarAccess.getLaunchConfigAccess().getSwInstallSupportSwInstallAllowedKeyword_0_5_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getSwInstallSupportSwInstallAllowedKeyword_0_5_0()); 

            }

             after(grammarAccess.getLaunchConfigAccess().getSwInstallSupportSwInstallAllowedKeyword_0_5_0()); 

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
    // $ANTLR end "rule__LaunchConfig__SwInstallSupportAssignment_0_5"


    // $ANTLR start "rule__LaunchConfig__ReplaceEnvAssignment_0_6"
    // InternalLcDsl.g:5523:1: rule__LaunchConfig__ReplaceEnvAssignment_0_6 : ( ( 'replace-env' ) ) ;
    public final void rule__LaunchConfig__ReplaceEnvAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5527:1: ( ( ( 'replace-env' ) ) )
            // InternalLcDsl.g:5528:2: ( ( 'replace-env' ) )
            {
            // InternalLcDsl.g:5528:2: ( ( 'replace-env' ) )
            // InternalLcDsl.g:5529:3: ( 'replace-env' )
            {
             before(grammarAccess.getLaunchConfigAccess().getReplaceEnvReplaceEnvKeyword_0_6_0()); 
            // InternalLcDsl.g:5530:3: ( 'replace-env' )
            // InternalLcDsl.g:5531:4: 'replace-env'
            {
             before(grammarAccess.getLaunchConfigAccess().getReplaceEnvReplaceEnvKeyword_0_6_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getLaunchConfigAccess().getReplaceEnvReplaceEnvKeyword_0_6_0()); 

            }

             after(grammarAccess.getLaunchConfigAccess().getReplaceEnvReplaceEnvKeyword_0_6_0()); 

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
    // $ANTLR end "rule__LaunchConfig__ReplaceEnvAssignment_0_6"


    // $ANTLR start "rule__LaunchConfig__TypeAssignment_1"
    // InternalLcDsl.g:5542:1: rule__LaunchConfig__TypeAssignment_1 : ( ruleLaunchConfigType ) ;
    public final void rule__LaunchConfig__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5546:1: ( ( ruleLaunchConfigType ) )
            // InternalLcDsl.g:5547:2: ( ruleLaunchConfigType )
            {
            // InternalLcDsl.g:5547:2: ( ruleLaunchConfigType )
            // InternalLcDsl.g:5548:3: ruleLaunchConfigType
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
    // InternalLcDsl.g:5557:1: rule__LaunchConfig__NameAssignment_3 : ( ruleFQName ) ;
    public final void rule__LaunchConfig__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5561:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:5562:2: ( ruleFQName )
            {
            // InternalLcDsl.g:5562:2: ( ruleFQName )
            // InternalLcDsl.g:5563:3: ruleFQName
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
    // InternalLcDsl.g:5572:1: rule__LaunchConfig__SuperConfigAssignment_4_1 : ( ( ruleFQName ) ) ;
    public final void rule__LaunchConfig__SuperConfigAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5576:1: ( ( ( ruleFQName ) ) )
            // InternalLcDsl.g:5577:2: ( ( ruleFQName ) )
            {
            // InternalLcDsl.g:5577:2: ( ( ruleFQName ) )
            // InternalLcDsl.g:5578:3: ( ruleFQName )
            {
             before(grammarAccess.getLaunchConfigAccess().getSuperConfigLaunchConfigCrossReference_4_1_0()); 
            // InternalLcDsl.g:5579:3: ( ruleFQName )
            // InternalLcDsl.g:5580:4: ruleFQName
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
    // InternalLcDsl.g:5591:1: rule__LaunchConfig__ClearsAssignment_6_0_0 : ( ruleClearOption ) ;
    public final void rule__LaunchConfig__ClearsAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5595:1: ( ( ruleClearOption ) )
            // InternalLcDsl.g:5596:2: ( ruleClearOption )
            {
            // InternalLcDsl.g:5596:2: ( ruleClearOption )
            // InternalLcDsl.g:5597:3: ruleClearOption
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
    // InternalLcDsl.g:5606:1: rule__LaunchConfig__WorkspaceAssignment_6_1_1 : ( ruleAnyPath ) ;
    public final void rule__LaunchConfig__WorkspaceAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5610:1: ( ( ruleAnyPath ) )
            // InternalLcDsl.g:5611:2: ( ruleAnyPath )
            {
            // InternalLcDsl.g:5611:2: ( ruleAnyPath )
            // InternalLcDsl.g:5612:3: ruleAnyPath
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
    // InternalLcDsl.g:5621:1: rule__LaunchConfig__WorkingDirAssignment_6_2_1 : ( ruleExistingPath ) ;
    public final void rule__LaunchConfig__WorkingDirAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5625:1: ( ( ruleExistingPath ) )
            // InternalLcDsl.g:5626:2: ( ruleExistingPath )
            {
            // InternalLcDsl.g:5626:2: ( ruleExistingPath )
            // InternalLcDsl.g:5627:3: ruleExistingPath
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
    // InternalLcDsl.g:5636:1: rule__LaunchConfig__MemoryAssignment_6_3_0 : ( ruleMemoryOption ) ;
    public final void rule__LaunchConfig__MemoryAssignment_6_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5640:1: ( ( ruleMemoryOption ) )
            // InternalLcDsl.g:5641:2: ( ruleMemoryOption )
            {
            // InternalLcDsl.g:5641:2: ( ruleMemoryOption )
            // InternalLcDsl.g:5642:3: ruleMemoryOption
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
    // InternalLcDsl.g:5651:1: rule__LaunchConfig__ProjectAssignment_6_4_1 : ( ruleProject ) ;
    public final void rule__LaunchConfig__ProjectAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5655:1: ( ( ruleProject ) )
            // InternalLcDsl.g:5656:2: ( ruleProject )
            {
            // InternalLcDsl.g:5656:2: ( ruleProject )
            // InternalLcDsl.g:5657:3: ruleProject
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
    // InternalLcDsl.g:5666:1: rule__LaunchConfig__MainClassAssignment_6_5_1 : ( ruleJavaType ) ;
    public final void rule__LaunchConfig__MainClassAssignment_6_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5670:1: ( ( ruleJavaType ) )
            // InternalLcDsl.g:5671:2: ( ruleJavaType )
            {
            // InternalLcDsl.g:5671:2: ( ruleJavaType )
            // InternalLcDsl.g:5672:3: ruleJavaType
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
    // InternalLcDsl.g:5681:1: rule__LaunchConfig__ApplicationAssignment_6_6 : ( ruleApplicationExtPoint ) ;
    public final void rule__LaunchConfig__ApplicationAssignment_6_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5685:1: ( ( ruleApplicationExtPoint ) )
            // InternalLcDsl.g:5686:2: ( ruleApplicationExtPoint )
            {
            // InternalLcDsl.g:5686:2: ( ruleApplicationExtPoint )
            // InternalLcDsl.g:5687:3: ruleApplicationExtPoint
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
    // InternalLcDsl.g:5696:1: rule__LaunchConfig__ProductAssignment_6_7 : ( ruleProductExtPoint ) ;
    public final void rule__LaunchConfig__ProductAssignment_6_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5700:1: ( ( ruleProductExtPoint ) )
            // InternalLcDsl.g:5701:2: ( ruleProductExtPoint )
            {
            // InternalLcDsl.g:5701:2: ( ruleProductExtPoint )
            // InternalLcDsl.g:5702:3: ruleProductExtPoint
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
    // InternalLcDsl.g:5711:1: rule__LaunchConfig__FavoritesAssignment_6_8 : ( ruleFavorites ) ;
    public final void rule__LaunchConfig__FavoritesAssignment_6_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5715:1: ( ( ruleFavorites ) )
            // InternalLcDsl.g:5716:2: ( ruleFavorites )
            {
            // InternalLcDsl.g:5716:2: ( ruleFavorites )
            // InternalLcDsl.g:5717:3: ruleFavorites
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
    // InternalLcDsl.g:5726:1: rule__LaunchConfig__RedirectAssignment_6_9 : ( ruleRedirect ) ;
    public final void rule__LaunchConfig__RedirectAssignment_6_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5730:1: ( ( ruleRedirect ) )
            // InternalLcDsl.g:5731:2: ( ruleRedirect )
            {
            // InternalLcDsl.g:5731:2: ( ruleRedirect )
            // InternalLcDsl.g:5732:3: ruleRedirect
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
    // InternalLcDsl.g:5741:1: rule__LaunchConfig__ExecEnvAssignment_6_10 : ( ruleExecutionEnvironment ) ;
    public final void rule__LaunchConfig__ExecEnvAssignment_6_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5745:1: ( ( ruleExecutionEnvironment ) )
            // InternalLcDsl.g:5746:2: ( ruleExecutionEnvironment )
            {
            // InternalLcDsl.g:5746:2: ( ruleExecutionEnvironment )
            // InternalLcDsl.g:5747:3: ruleExecutionEnvironment
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


    // $ANTLR start "rule__LaunchConfig__ConfigIniTemplateAssignment_6_11"
    // InternalLcDsl.g:5756:1: rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 : ( ruleConfigIniTemplate ) ;
    public final void rule__LaunchConfig__ConfigIniTemplateAssignment_6_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5760:1: ( ( ruleConfigIniTemplate ) )
            // InternalLcDsl.g:5761:2: ( ruleConfigIniTemplate )
            {
            // InternalLcDsl.g:5761:2: ( ruleConfigIniTemplate )
            // InternalLcDsl.g:5762:3: ruleConfigIniTemplate
            {
             before(grammarAccess.getLaunchConfigAccess().getConfigIniTemplateConfigIniTemplateParserRuleCall_6_11_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigIniTemplate();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getConfigIniTemplateConfigIniTemplateParserRuleCall_6_11_0()); 

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
    // $ANTLR end "rule__LaunchConfig__ConfigIniTemplateAssignment_6_11"


    // $ANTLR start "rule__LaunchConfig__PluginsAssignment_7_0"
    // InternalLcDsl.g:5771:1: rule__LaunchConfig__PluginsAssignment_7_0 : ( ruleAddPlugin ) ;
    public final void rule__LaunchConfig__PluginsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5775:1: ( ( ruleAddPlugin ) )
            // InternalLcDsl.g:5776:2: ( ruleAddPlugin )
            {
            // InternalLcDsl.g:5776:2: ( ruleAddPlugin )
            // InternalLcDsl.g:5777:3: ruleAddPlugin
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
    // InternalLcDsl.g:5786:1: rule__LaunchConfig__IgnoreAssignment_7_1 : ( ruleIgnorePlugin ) ;
    public final void rule__LaunchConfig__IgnoreAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5790:1: ( ( ruleIgnorePlugin ) )
            // InternalLcDsl.g:5791:2: ( ruleIgnorePlugin )
            {
            // InternalLcDsl.g:5791:2: ( ruleIgnorePlugin )
            // InternalLcDsl.g:5792:3: ruleIgnorePlugin
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
    // InternalLcDsl.g:5801:1: rule__LaunchConfig__GroupMembersAssignment_7_2 : ( ruleGroupMember ) ;
    public final void rule__LaunchConfig__GroupMembersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5805:1: ( ( ruleGroupMember ) )
            // InternalLcDsl.g:5806:2: ( ruleGroupMember )
            {
            // InternalLcDsl.g:5806:2: ( ruleGroupMember )
            // InternalLcDsl.g:5807:3: ruleGroupMember
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
    // InternalLcDsl.g:5816:1: rule__LaunchConfig__VmArgsAssignment_7_3 : ( ruleVmArgument ) ;
    public final void rule__LaunchConfig__VmArgsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5820:1: ( ( ruleVmArgument ) )
            // InternalLcDsl.g:5821:2: ( ruleVmArgument )
            {
            // InternalLcDsl.g:5821:2: ( ruleVmArgument )
            // InternalLcDsl.g:5822:3: ruleVmArgument
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
    // InternalLcDsl.g:5831:1: rule__LaunchConfig__ProgArgsAssignment_7_4 : ( ruleProgramArgument ) ;
    public final void rule__LaunchConfig__ProgArgsAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5835:1: ( ( ruleProgramArgument ) )
            // InternalLcDsl.g:5836:2: ( ruleProgramArgument )
            {
            // InternalLcDsl.g:5836:2: ( ruleProgramArgument )
            // InternalLcDsl.g:5837:3: ruleProgramArgument
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
    // InternalLcDsl.g:5846:1: rule__LaunchConfig__EnvVarsAssignment_7_5 : ( ruleEnvironmentVariable ) ;
    public final void rule__LaunchConfig__EnvVarsAssignment_7_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5850:1: ( ( ruleEnvironmentVariable ) )
            // InternalLcDsl.g:5851:2: ( ruleEnvironmentVariable )
            {
            // InternalLcDsl.g:5851:2: ( ruleEnvironmentVariable )
            // InternalLcDsl.g:5852:3: ruleEnvironmentVariable
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


    // $ANTLR start "rule__LaunchConfig__TracesAssignment_7_6"
    // InternalLcDsl.g:5861:1: rule__LaunchConfig__TracesAssignment_7_6 : ( ruleTraceEnablement ) ;
    public final void rule__LaunchConfig__TracesAssignment_7_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5865:1: ( ( ruleTraceEnablement ) )
            // InternalLcDsl.g:5866:2: ( ruleTraceEnablement )
            {
            // InternalLcDsl.g:5866:2: ( ruleTraceEnablement )
            // InternalLcDsl.g:5867:3: ruleTraceEnablement
            {
             before(grammarAccess.getLaunchConfigAccess().getTracesTraceEnablementParserRuleCall_7_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTraceEnablement();

            state._fsp--;

             after(grammarAccess.getLaunchConfigAccess().getTracesTraceEnablementParserRuleCall_7_6_0()); 

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
    // $ANTLR end "rule__LaunchConfig__TracesAssignment_7_6"


    // $ANTLR start "rule__AddPlugin__PluginAssignment_1"
    // InternalLcDsl.g:5876:1: rule__AddPlugin__PluginAssignment_1 : ( rulePluginWithVersionAndStartLevel ) ;
    public final void rule__AddPlugin__PluginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5880:1: ( ( rulePluginWithVersionAndStartLevel ) )
            // InternalLcDsl.g:5881:2: ( rulePluginWithVersionAndStartLevel )
            {
            // InternalLcDsl.g:5881:2: ( rulePluginWithVersionAndStartLevel )
            // InternalLcDsl.g:5882:3: rulePluginWithVersionAndStartLevel
            {
             before(grammarAccess.getAddPluginAccess().getPluginPluginWithVersionAndStartLevelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePluginWithVersionAndStartLevel();

            state._fsp--;

             after(grammarAccess.getAddPluginAccess().getPluginPluginWithVersionAndStartLevelParserRuleCall_1_0()); 

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
    // InternalLcDsl.g:5891:1: rule__IgnorePlugin__PluginAssignment_1 : ( rulePluginWithVersion ) ;
    public final void rule__IgnorePlugin__PluginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5895:1: ( ( rulePluginWithVersion ) )
            // InternalLcDsl.g:5896:2: ( rulePluginWithVersion )
            {
            // InternalLcDsl.g:5896:2: ( rulePluginWithVersion )
            // InternalLcDsl.g:5897:3: rulePluginWithVersion
            {
             before(grammarAccess.getIgnorePluginAccess().getPluginPluginWithVersionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePluginWithVersion();

            state._fsp--;

             after(grammarAccess.getIgnorePluginAccess().getPluginPluginWithVersionParserRuleCall_1_0()); 

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
    // InternalLcDsl.g:5906:1: rule__VmArgument__ArgumentsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VmArgument__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5910:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:5911:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:5911:2: ( RULE_STRING )
            // InternalLcDsl.g:5912:3: RULE_STRING
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
    // InternalLcDsl.g:5921:1: rule__ProgramArgument__ArgumentsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ProgramArgument__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5925:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:5926:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:5926:2: ( RULE_STRING )
            // InternalLcDsl.g:5927:3: RULE_STRING
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
    // InternalLcDsl.g:5936:1: rule__EnvironmentVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnvironmentVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5940:1: ( ( RULE_ID ) )
            // InternalLcDsl.g:5941:2: ( RULE_ID )
            {
            // InternalLcDsl.g:5941:2: ( RULE_ID )
            // InternalLcDsl.g:5942:3: RULE_ID
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
    // InternalLcDsl.g:5951:1: rule__EnvironmentVariable__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EnvironmentVariable__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5955:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:5956:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:5956:2: ( RULE_STRING )
            // InternalLcDsl.g:5957:3: RULE_STRING
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
    // InternalLcDsl.g:5966:1: rule__ApplicationExtPoint__NameAssignment_1 : ( ruleFQName ) ;
    public final void rule__ApplicationExtPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5970:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:5971:2: ( ruleFQName )
            {
            // InternalLcDsl.g:5971:2: ( ruleFQName )
            // InternalLcDsl.g:5972:3: ruleFQName
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
    // InternalLcDsl.g:5981:1: rule__ProductExtPoint__NameAssignment_1 : ( ruleFQName ) ;
    public final void rule__ProductExtPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:5985:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:5986:2: ( ruleFQName )
            {
            // InternalLcDsl.g:5986:2: ( ruleFQName )
            // InternalLcDsl.g:5987:3: ruleFQName
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
    // InternalLcDsl.g:5996:1: rule__Favorites__RunAssignment_2_0 : ( ( 'run' ) ) ;
    public final void rule__Favorites__RunAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6000:1: ( ( ( 'run' ) ) )
            // InternalLcDsl.g:6001:2: ( ( 'run' ) )
            {
            // InternalLcDsl.g:6001:2: ( ( 'run' ) )
            // InternalLcDsl.g:6002:3: ( 'run' )
            {
             before(grammarAccess.getFavoritesAccess().getRunRunKeyword_2_0_0()); 
            // InternalLcDsl.g:6003:3: ( 'run' )
            // InternalLcDsl.g:6004:4: 'run'
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
    // InternalLcDsl.g:6015:1: rule__Favorites__DebugAssignment_2_1 : ( ( 'debug' ) ) ;
    public final void rule__Favorites__DebugAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6019:1: ( ( ( 'debug' ) ) )
            // InternalLcDsl.g:6020:2: ( ( 'debug' ) )
            {
            // InternalLcDsl.g:6020:2: ( ( 'debug' ) )
            // InternalLcDsl.g:6021:3: ( 'debug' )
            {
             before(grammarAccess.getFavoritesAccess().getDebugDebugKeyword_2_1_0()); 
            // InternalLcDsl.g:6022:3: ( 'debug' )
            // InternalLcDsl.g:6023:4: 'debug'
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
    // InternalLcDsl.g:6034:1: rule__Redirect__OutWhichAssignment_2_0_0 : ( ruleOutputStream ) ;
    public final void rule__Redirect__OutWhichAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6038:1: ( ( ruleOutputStream ) )
            // InternalLcDsl.g:6039:2: ( ruleOutputStream )
            {
            // InternalLcDsl.g:6039:2: ( ruleOutputStream )
            // InternalLcDsl.g:6040:3: ruleOutputStream
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
    // InternalLcDsl.g:6049:1: rule__Redirect__OutFileAssignment_2_0_2 : ( ruleAnyPath ) ;
    public final void rule__Redirect__OutFileAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6053:1: ( ( ruleAnyPath ) )
            // InternalLcDsl.g:6054:2: ( ruleAnyPath )
            {
            // InternalLcDsl.g:6054:2: ( ruleAnyPath )
            // InternalLcDsl.g:6055:3: ruleAnyPath
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
    // InternalLcDsl.g:6064:1: rule__Redirect__InWhichAssignment_2_1_0 : ( ruleInputStream ) ;
    public final void rule__Redirect__InWhichAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6068:1: ( ( ruleInputStream ) )
            // InternalLcDsl.g:6069:2: ( ruleInputStream )
            {
            // InternalLcDsl.g:6069:2: ( ruleInputStream )
            // InternalLcDsl.g:6070:3: ruleInputStream
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
    // InternalLcDsl.g:6079:1: rule__Redirect__InFileAssignment_2_1_2 : ( ruleExistingPath ) ;
    public final void rule__Redirect__InFileAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6083:1: ( ( ruleExistingPath ) )
            // InternalLcDsl.g:6084:2: ( ruleExistingPath )
            {
            // InternalLcDsl.g:6084:2: ( ruleExistingPath )
            // InternalLcDsl.g:6085:3: ruleExistingPath
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
    // InternalLcDsl.g:6094:1: rule__ExecutionEnvironment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExecutionEnvironment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6098:1: ( ( RULE_ID ) )
            // InternalLcDsl.g:6099:2: ( RULE_ID )
            {
            // InternalLcDsl.g:6099:2: ( RULE_ID )
            // InternalLcDsl.g:6100:3: RULE_ID
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


    // $ANTLR start "rule__ConfigIniTemplate__PathAssignment_1"
    // InternalLcDsl.g:6109:1: rule__ConfigIniTemplate__PathAssignment_1 : ( ruleExistingPath ) ;
    public final void rule__ConfigIniTemplate__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6113:1: ( ( ruleExistingPath ) )
            // InternalLcDsl.g:6114:2: ( ruleExistingPath )
            {
            // InternalLcDsl.g:6114:2: ( ruleExistingPath )
            // InternalLcDsl.g:6115:3: ruleExistingPath
            {
             before(grammarAccess.getConfigIniTemplateAccess().getPathExistingPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExistingPath();

            state._fsp--;

             after(grammarAccess.getConfigIniTemplateAccess().getPathExistingPathParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConfigIniTemplate__PathAssignment_1"


    // $ANTLR start "rule__TraceEnablement__PluginAssignment_1"
    // InternalLcDsl.g:6124:1: rule__TraceEnablement__PluginAssignment_1 : ( rulePluginWithVersion ) ;
    public final void rule__TraceEnablement__PluginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6128:1: ( ( rulePluginWithVersion ) )
            // InternalLcDsl.g:6129:2: ( rulePluginWithVersion )
            {
            // InternalLcDsl.g:6129:2: ( rulePluginWithVersion )
            // InternalLcDsl.g:6130:3: rulePluginWithVersion
            {
             before(grammarAccess.getTraceEnablementAccess().getPluginPluginWithVersionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePluginWithVersion();

            state._fsp--;

             after(grammarAccess.getTraceEnablementAccess().getPluginPluginWithVersionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TraceEnablement__PluginAssignment_1"


    // $ANTLR start "rule__TraceEnablement__WhatAssignment_2"
    // InternalLcDsl.g:6139:1: rule__TraceEnablement__WhatAssignment_2 : ( RULE_ID ) ;
    public final void rule__TraceEnablement__WhatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6143:1: ( ( RULE_ID ) )
            // InternalLcDsl.g:6144:2: ( RULE_ID )
            {
            // InternalLcDsl.g:6144:2: ( RULE_ID )
            // InternalLcDsl.g:6145:3: RULE_ID
            {
             before(grammarAccess.getTraceEnablementAccess().getWhatIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTraceEnablementAccess().getWhatIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TraceEnablement__WhatAssignment_2"


    // $ANTLR start "rule__ExistingPath__NameAssignment"
    // InternalLcDsl.g:6154:1: rule__ExistingPath__NameAssignment : ( RULE_STRING ) ;
    public final void rule__ExistingPath__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6158:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:6159:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:6159:2: ( RULE_STRING )
            // InternalLcDsl.g:6160:3: RULE_STRING
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
    // InternalLcDsl.g:6169:1: rule__AnyPath__NameAssignment : ( RULE_STRING ) ;
    public final void rule__AnyPath__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6173:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:6174:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:6174:2: ( RULE_STRING )
            // InternalLcDsl.g:6175:3: RULE_STRING
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


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__PluginAssignment_0"
    // InternalLcDsl.g:6184:1: rule__PluginWithVersionAndStartLevel__PluginAssignment_0 : ( rulePluginWithVersion ) ;
    public final void rule__PluginWithVersionAndStartLevel__PluginAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6188:1: ( ( rulePluginWithVersion ) )
            // InternalLcDsl.g:6189:2: ( rulePluginWithVersion )
            {
            // InternalLcDsl.g:6189:2: ( rulePluginWithVersion )
            // InternalLcDsl.g:6190:3: rulePluginWithVersion
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getPluginPluginWithVersionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePluginWithVersion();

            state._fsp--;

             after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getPluginPluginWithVersionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__PluginAssignment_0"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0"
    // InternalLcDsl.g:6199:1: rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0 : ( ( 'autostart' ) ) ;
    public final void rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6203:1: ( ( ( 'autostart' ) ) )
            // InternalLcDsl.g:6204:2: ( ( 'autostart' ) )
            {
            // InternalLcDsl.g:6204:2: ( ( 'autostart' ) )
            // InternalLcDsl.g:6205:3: ( 'autostart' )
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getAutoStartAutostartKeyword_1_0_0()); 
            // InternalLcDsl.g:6206:3: ( 'autostart' )
            // InternalLcDsl.g:6207:4: 'autostart'
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getAutoStartAutostartKeyword_1_0_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getAutoStartAutostartKeyword_1_0_0()); 

            }

             after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getAutoStartAutostartKeyword_1_0_0()); 

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__AutoStartAssignment_1_0"


    // $ANTLR start "rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1"
    // InternalLcDsl.g:6218:1: rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1 : ( RULE_INT ) ;
    public final void rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6222:1: ( ( RULE_INT ) )
            // InternalLcDsl.g:6223:2: ( RULE_INT )
            {
            // InternalLcDsl.g:6223:2: ( RULE_INT )
            // InternalLcDsl.g:6224:3: RULE_INT
            {
             before(grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartLevelINTTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartLevelINTTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__PluginWithVersionAndStartLevel__StartLevelAssignment_1_1_1"


    // $ANTLR start "rule__PluginWithVersion__VersionAssignment_1"
    // InternalLcDsl.g:6233:1: rule__PluginWithVersion__VersionAssignment_1 : ( RULE_VERSION ) ;
    public final void rule__PluginWithVersion__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6237:1: ( ( RULE_VERSION ) )
            // InternalLcDsl.g:6238:2: ( RULE_VERSION )
            {
            // InternalLcDsl.g:6238:2: ( RULE_VERSION )
            // InternalLcDsl.g:6239:3: RULE_VERSION
            {
             before(grammarAccess.getPluginWithVersionAccess().getVersionVERSIONTerminalRuleCall_1_0()); 
            match(input,RULE_VERSION,FOLLOW_2); 
             after(grammarAccess.getPluginWithVersionAccess().getVersionVERSIONTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PluginWithVersion__VersionAssignment_1"


    // $ANTLR start "rule__Plugin__NameAssignment"
    // InternalLcDsl.g:6248:1: rule__Plugin__NameAssignment : ( ruleFQName ) ;
    public final void rule__Plugin__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6252:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:6253:2: ( ruleFQName )
            {
            // InternalLcDsl.g:6253:2: ( ruleFQName )
            // InternalLcDsl.g:6254:3: ruleFQName
            {
             before(grammarAccess.getPluginAccess().getNameFQNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFQName();

            state._fsp--;

             after(grammarAccess.getPluginAccess().getNameFQNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__Plugin__NameAssignment"


    // $ANTLR start "rule__Project__NameAssignment"
    // InternalLcDsl.g:6263:1: rule__Project__NameAssignment : ( ruleFQName ) ;
    public final void rule__Project__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6267:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:6268:2: ( ruleFQName )
            {
            // InternalLcDsl.g:6268:2: ( ruleFQName )
            // InternalLcDsl.g:6269:3: ruleFQName
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
    // InternalLcDsl.g:6278:1: rule__JavaType__NameAssignment : ( ruleFQName ) ;
    public final void rule__JavaType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6282:1: ( ( ruleFQName ) )
            // InternalLcDsl.g:6283:2: ( ruleFQName )
            {
            // InternalLcDsl.g:6283:2: ( ruleFQName )
            // InternalLcDsl.g:6284:3: ruleFQName
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
    // InternalLcDsl.g:6293:1: rule__ClearOption__WorkspaceAssignment_2_0_0_0 : ( ( 'workspace' ) ) ;
    public final void rule__ClearOption__WorkspaceAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6297:1: ( ( ( 'workspace' ) ) )
            // InternalLcDsl.g:6298:2: ( ( 'workspace' ) )
            {
            // InternalLcDsl.g:6298:2: ( ( 'workspace' ) )
            // InternalLcDsl.g:6299:3: ( 'workspace' )
            {
             before(grammarAccess.getClearOptionAccess().getWorkspaceWorkspaceKeyword_2_0_0_0_0()); 
            // InternalLcDsl.g:6300:3: ( 'workspace' )
            // InternalLcDsl.g:6301:4: 'workspace'
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
    // InternalLcDsl.g:6312:1: rule__ClearOption__LogAssignment_2_0_0_1 : ( ( 'log' ) ) ;
    public final void rule__ClearOption__LogAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6316:1: ( ( ( 'log' ) ) )
            // InternalLcDsl.g:6317:2: ( ( 'log' ) )
            {
            // InternalLcDsl.g:6317:2: ( ( 'log' ) )
            // InternalLcDsl.g:6318:3: ( 'log' )
            {
             before(grammarAccess.getClearOptionAccess().getLogLogKeyword_2_0_0_1_0()); 
            // InternalLcDsl.g:6319:3: ( 'log' )
            // InternalLcDsl.g:6320:4: 'log'
            {
             before(grammarAccess.getClearOptionAccess().getLogLogKeyword_2_0_0_1_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalLcDsl.g:6331:1: rule__ClearOption__NoAskClearAssignment_2_0_1 : ( ( '!' ) ) ;
    public final void rule__ClearOption__NoAskClearAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6335:1: ( ( ( '!' ) ) )
            // InternalLcDsl.g:6336:2: ( ( '!' ) )
            {
            // InternalLcDsl.g:6336:2: ( ( '!' ) )
            // InternalLcDsl.g:6337:3: ( '!' )
            {
             before(grammarAccess.getClearOptionAccess().getNoAskClearExclamationMarkKeyword_2_0_1_0()); 
            // InternalLcDsl.g:6338:3: ( '!' )
            // InternalLcDsl.g:6339:4: '!'
            {
             before(grammarAccess.getClearOptionAccess().getNoAskClearExclamationMarkKeyword_2_0_1_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalLcDsl.g:6350:1: rule__ClearOption__ConfigAssignment_2_1 : ( ( 'config' ) ) ;
    public final void rule__ClearOption__ConfigAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6354:1: ( ( ( 'config' ) ) )
            // InternalLcDsl.g:6355:2: ( ( 'config' ) )
            {
            // InternalLcDsl.g:6355:2: ( ( 'config' ) )
            // InternalLcDsl.g:6356:3: ( 'config' )
            {
             before(grammarAccess.getClearOptionAccess().getConfigConfigKeyword_2_1_0()); 
            // InternalLcDsl.g:6357:3: ( 'config' )
            // InternalLcDsl.g:6358:4: 'config'
            {
             before(grammarAccess.getClearOptionAccess().getConfigConfigKeyword_2_1_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalLcDsl.g:6369:1: rule__MemoryOption__MinAssignment_2_0_2 : ( RULE_INT ) ;
    public final void rule__MemoryOption__MinAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6373:1: ( ( RULE_INT ) )
            // InternalLcDsl.g:6374:2: ( RULE_INT )
            {
            // InternalLcDsl.g:6374:2: ( RULE_INT )
            // InternalLcDsl.g:6375:3: RULE_INT
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
    // InternalLcDsl.g:6384:1: rule__MemoryOption__MinUnitAssignment_2_0_3 : ( ruleMemoryUnit ) ;
    public final void rule__MemoryOption__MinUnitAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6388:1: ( ( ruleMemoryUnit ) )
            // InternalLcDsl.g:6389:2: ( ruleMemoryUnit )
            {
            // InternalLcDsl.g:6389:2: ( ruleMemoryUnit )
            // InternalLcDsl.g:6390:3: ruleMemoryUnit
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
    // InternalLcDsl.g:6399:1: rule__MemoryOption__MaxAssignment_2_1_2 : ( RULE_INT ) ;
    public final void rule__MemoryOption__MaxAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6403:1: ( ( RULE_INT ) )
            // InternalLcDsl.g:6404:2: ( RULE_INT )
            {
            // InternalLcDsl.g:6404:2: ( RULE_INT )
            // InternalLcDsl.g:6405:3: RULE_INT
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
    // InternalLcDsl.g:6414:1: rule__MemoryOption__MaxUnitAssignment_2_1_3 : ( ruleMemoryUnit ) ;
    public final void rule__MemoryOption__MaxUnitAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6418:1: ( ( ruleMemoryUnit ) )
            // InternalLcDsl.g:6419:2: ( ruleMemoryUnit )
            {
            // InternalLcDsl.g:6419:2: ( ruleMemoryUnit )
            // InternalLcDsl.g:6420:3: ruleMemoryUnit
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
    // InternalLcDsl.g:6429:1: rule__MemoryOption__PermAssignment_2_2_2 : ( RULE_INT ) ;
    public final void rule__MemoryOption__PermAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6433:1: ( ( RULE_INT ) )
            // InternalLcDsl.g:6434:2: ( RULE_INT )
            {
            // InternalLcDsl.g:6434:2: ( RULE_INT )
            // InternalLcDsl.g:6435:3: RULE_INT
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
    // InternalLcDsl.g:6444:1: rule__MemoryOption__PermUnitAssignment_2_2_3 : ( ruleMemoryUnit ) ;
    public final void rule__MemoryOption__PermUnitAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6448:1: ( ( ruleMemoryUnit ) )
            // InternalLcDsl.g:6449:2: ( ruleMemoryUnit )
            {
            // InternalLcDsl.g:6449:2: ( ruleMemoryUnit )
            // InternalLcDsl.g:6450:3: ruleMemoryUnit
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
    // InternalLcDsl.g:6459:1: rule__GroupMember__TypeAssignment_0_0 : ( ruleLaunchModeType ) ;
    public final void rule__GroupMember__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6463:1: ( ( ruleLaunchModeType ) )
            // InternalLcDsl.g:6464:2: ( ruleLaunchModeType )
            {
            // InternalLcDsl.g:6464:2: ( ruleLaunchModeType )
            // InternalLcDsl.g:6465:3: ruleLaunchModeType
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
    // InternalLcDsl.g:6474:1: rule__GroupMember__AdoptAssignment_0_1 : ( ( 'adopt' ) ) ;
    public final void rule__GroupMember__AdoptAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6478:1: ( ( ( 'adopt' ) ) )
            // InternalLcDsl.g:6479:2: ( ( 'adopt' ) )
            {
            // InternalLcDsl.g:6479:2: ( ( 'adopt' ) )
            // InternalLcDsl.g:6480:3: ( 'adopt' )
            {
             before(grammarAccess.getGroupMemberAccess().getAdoptAdoptKeyword_0_1_0()); 
            // InternalLcDsl.g:6481:3: ( 'adopt' )
            // InternalLcDsl.g:6482:4: 'adopt'
            {
             before(grammarAccess.getGroupMemberAccess().getAdoptAdoptKeyword_0_1_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalLcDsl.g:6493:1: rule__GroupMember__MemberAssignment_2 : ( ( ruleFQName ) ) ;
    public final void rule__GroupMember__MemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6497:1: ( ( ( ruleFQName ) ) )
            // InternalLcDsl.g:6498:2: ( ( ruleFQName ) )
            {
            // InternalLcDsl.g:6498:2: ( ( ruleFQName ) )
            // InternalLcDsl.g:6499:3: ( ruleFQName )
            {
             before(grammarAccess.getGroupMemberAccess().getMemberLaunchConfigCrossReference_2_0()); 
            // InternalLcDsl.g:6500:3: ( ruleFQName )
            // InternalLcDsl.g:6501:4: ruleFQName
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
    // InternalLcDsl.g:6512:1: rule__GroupMember__PostActionAssignment_3 : ( ruleGroupPostLaunchAction ) ;
    public final void rule__GroupMember__PostActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6516:1: ( ( ruleGroupPostLaunchAction ) )
            // InternalLcDsl.g:6517:2: ( ruleGroupPostLaunchAction )
            {
            // InternalLcDsl.g:6517:2: ( ruleGroupPostLaunchAction )
            // InternalLcDsl.g:6518:3: ruleGroupPostLaunchAction
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
    // InternalLcDsl.g:6527:1: rule__GroupPostLaunchDelay__DelayAssignment_1 : ( RULE_INT ) ;
    public final void rule__GroupPostLaunchDelay__DelayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6531:1: ( ( RULE_INT ) )
            // InternalLcDsl.g:6532:2: ( RULE_INT )
            {
            // InternalLcDsl.g:6532:2: ( RULE_INT )
            // InternalLcDsl.g:6533:3: RULE_INT
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
    // InternalLcDsl.g:6542:1: rule__GroupPostLaunchRegex__RegexAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GroupPostLaunchRegex__RegexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLcDsl.g:6546:1: ( ( RULE_STRING ) )
            // InternalLcDsl.g:6547:2: ( RULE_STRING )
            {
            // InternalLcDsl.g:6547:2: ( RULE_STRING )
            // InternalLcDsl.g:6548:3: RULE_STRING
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


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\23\15\uffff";
    static final String dfa_3s = "\1\120\15\uffff";
    static final String dfa_4s = "\1\uffff\14\1\1\2";
    static final String dfa_5s = "\1\0\15\uffff}>";
    static final String[] dfa_6s = {
            "\5\15\15\uffff\1\15\2\uffff\1\2\1\3\1\5\1\6\5\15\1\7\1\10\1\11\1\12\2\uffff\1\13\1\14\1\15\1\uffff\1\1\1\4\3\uffff\1\15\17\uffff\1\15",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

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
            return "4522:2: ( rule__LaunchConfig__UnorderedGroup_6__0 )?";
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
                        if ( LA26_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA26_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA26_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA26_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA26_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA26_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA26_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA26_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA26_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA26_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA26_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA26_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA26_0>=19 && LA26_0<=23)||LA26_0==37||(LA26_0>=44 && LA26_0<=48)||LA26_0==57||LA26_0==64||LA26_0==80) ) {s = 13;}

                         
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
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\50\14\uffff";
    static final String dfa_9s = "\1\74\14\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_11s = "\1\0\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\1\5\1\6\5\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\1\14\2\uffff\1\1\1\4",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "4536:3: ( ({...}? => ( ( ( rule__LaunchConfig__Group_6_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_2__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_3__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_4__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__Group_6_5__0 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ApplicationAssignment_6_6 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ProductAssignment_6_7 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__FavoritesAssignment_6_8 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__RedirectAssignment_6_9 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ExecEnvAssignment_6_10 ) ) ) ) | ({...}? => ( ( ( rule__LaunchConfig__ConfigIniTemplateAssignment_6_11 ) ) ) ) )";
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
                        if ( LA27_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA27_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA27_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA27_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA27_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA27_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA27_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA27_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA27_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA27_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA27_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA27_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                         
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
            return "4731:2: ( rule__LaunchConfig__UnorderedGroup_6__1 )?";
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
                        if ( LA28_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA28_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA28_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA28_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA28_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA28_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA28_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA28_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA28_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA28_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA28_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA28_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA28_0>=19 && LA28_0<=23)||LA28_0==37||(LA28_0>=44 && LA28_0<=48)||LA28_0==57||LA28_0==64||LA28_0==80) ) {s = 13;}

                         
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
            return "4743:2: ( rule__LaunchConfig__UnorderedGroup_6__2 )?";
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
                        if ( LA29_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA29_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA29_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA29_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA29_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA29_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA29_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA29_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA29_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA29_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA29_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA29_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA29_0>=19 && LA29_0<=23)||LA29_0==37||(LA29_0>=44 && LA29_0<=48)||LA29_0==57||LA29_0==64||LA29_0==80) ) {s = 13;}

                         
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
            return "4755:2: ( rule__LaunchConfig__UnorderedGroup_6__3 )?";
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
                        if ( LA30_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA30_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA30_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA30_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA30_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA30_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA30_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA30_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA30_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA30_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA30_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA30_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA30_0>=19 && LA30_0<=23)||LA30_0==37||(LA30_0>=44 && LA30_0<=48)||LA30_0==57||LA30_0==64||LA30_0==80) ) {s = 13;}

                         
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
            return "4767:2: ( rule__LaunchConfig__UnorderedGroup_6__4 )?";
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
                        if ( LA31_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA31_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA31_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA31_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA31_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA31_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA31_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA31_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA31_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA31_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA31_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA31_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA31_0>=19 && LA31_0<=23)||LA31_0==37||(LA31_0>=44 && LA31_0<=48)||LA31_0==57||LA31_0==64||LA31_0==80) ) {s = 13;}

                         
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
            return "4779:2: ( rule__LaunchConfig__UnorderedGroup_6__5 )?";
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
                        if ( LA32_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA32_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA32_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA32_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA32_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA32_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA32_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA32_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA32_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA32_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA32_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA32_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA32_0>=19 && LA32_0<=23)||LA32_0==37||(LA32_0>=44 && LA32_0<=48)||LA32_0==57||LA32_0==64||LA32_0==80) ) {s = 13;}

                         
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
            return "4791:2: ( rule__LaunchConfig__UnorderedGroup_6__6 )?";
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
                        if ( LA33_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA33_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA33_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA33_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA33_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA33_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA33_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA33_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA33_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA33_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA33_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA33_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA33_0>=19 && LA33_0<=23)||LA33_0==37||(LA33_0>=44 && LA33_0<=48)||LA33_0==57||LA33_0==64||LA33_0==80) ) {s = 13;}

                         
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

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4803:2: ( rule__LaunchConfig__UnorderedGroup_6__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA34_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA34_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA34_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA34_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA34_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA34_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA34_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA34_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA34_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA34_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA34_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA34_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA34_0>=19 && LA34_0<=23)||LA34_0==37||(LA34_0>=44 && LA34_0<=48)||LA34_0==57||LA34_0==64||LA34_0==80) ) {s = 13;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4815:2: ( rule__LaunchConfig__UnorderedGroup_6__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA35_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA35_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA35_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA35_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA35_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA35_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA35_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA35_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA35_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA35_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA35_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA35_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA35_0>=19 && LA35_0<=23)||LA35_0==37||(LA35_0>=44 && LA35_0<=48)||LA35_0==57||LA35_0==64||LA35_0==80) ) {s = 13;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4827:2: ( rule__LaunchConfig__UnorderedGroup_6__9 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA36_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA36_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA36_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA36_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA36_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA36_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA36_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA36_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA36_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA36_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA36_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA36_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA36_0>=19 && LA36_0<=23)||LA36_0==37||(LA36_0>=44 && LA36_0<=48)||LA36_0==57||LA36_0==64||LA36_0==80) ) {s = 13;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4839:2: ( rule__LaunchConfig__UnorderedGroup_6__10 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA37_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA37_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA37_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA37_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA37_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA37_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA37_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA37_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA37_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA37_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA37_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA37_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA37_0>=19 && LA37_0<=23)||LA37_0==37||(LA37_0>=44 && LA37_0<=48)||LA37_0==57||LA37_0==64||LA37_0==80) ) {s = 13;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4851:2: ( rule__LaunchConfig__UnorderedGroup_6__11 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_0 = input.LA(1);

                         
                        int index38_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA38_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 1;}

                        else if ( LA38_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 2;}

                        else if ( LA38_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 3;}

                        else if ( LA38_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 4;}

                        else if ( LA38_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 5;}

                        else if ( LA38_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 6;}

                        else if ( LA38_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 7;}

                        else if ( LA38_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 8;}

                        else if ( LA38_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 9;}

                        else if ( LA38_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 10;}

                        else if ( LA38_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 11;}

                        else if ( LA38_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 12;}

                        else if ( ((LA38_0>=19 && LA38_0<=23)||LA38_0==37||(LA38_0>=44 && LA38_0<=48)||LA38_0==57||LA38_0==64||LA38_0==80) ) {s = 13;}

                         
                        input.seek(index38_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x199E0F0000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0201F02000F80000L,0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0201F00000F80002L,0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000700004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0400000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000FF000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x199E0F0000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000700004002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000002L,0x000000000000A000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xE000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000F80002L,0x0000000000010000L});

}
