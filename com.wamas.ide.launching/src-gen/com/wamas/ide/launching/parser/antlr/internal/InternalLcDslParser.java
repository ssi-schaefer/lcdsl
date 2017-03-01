package com.wamas.ide.launching.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.wamas.ide.launching.services.LcDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLcDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BLOCK_BEGIN", "RULE_BLOCK_END", "RULE_ID", "RULE_EQ", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_VERSION", "RULE_QUALIFIER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'explicit'", "'manual'", "'foreground'", "'no-console'", "'no-validate'", "'sw-install-allowed'", "'replace-env'", "'stop-in-main'", "'configuration'", "':'", "'workspace'", "';'", "'working-dir'", "'project'", "'main-class'", "'plugin'", "'ignore'", "'vm-arg'", "'argument'", "'environment'", "'application'", "'product'", "'favorite'", "'redirect'", "'to'", "'from'", "'execution-environment'", "'config-ini-template'", "'trace'", "'search-main'", "'system'", "'inherited'", "'servlet'", "'path'", "'browser'", "'port'", "'session-timeout'", "'context-path'", "'dev-mode'", "'autostart'", "'startlevel'", "'clear'", "'log'", "'!'", "'config'", "'memory'", "'min'", "'max'", "'perm'", "'adopt'", "'member'", "'delay'", "'regex'", "'wait'", "'.'", "'internal'", "'external'", "'none'", "'java'", "'eclipse'", "'rap'", "'group'", "'run'", "'debug'", "'profile'", "'coverage'", "'inherit'", "'MB'", "'mb'", "'M'", "'m'", "'GB'", "'gb'", "'G'", "'g'", "'stdout'", "'stderr'", "'both-out'", "'stdin'"
    };
    public static final int T__50=50;
    public static final int RULE_VERSION=11;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int RULE_BLOCK_END=5;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=10;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_BLOCK_BEGIN=4;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_EQ=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_QUALIFIER=12;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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

        public InternalLcDslParser(TokenStream input, LcDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LCModel";
       	}

       	@Override
       	protected LcDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLCModel"
    // InternalLcDsl.g:65:1: entryRuleLCModel returns [EObject current=null] : iv_ruleLCModel= ruleLCModel EOF ;
    public final EObject entryRuleLCModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLCModel = null;


        try {
            // InternalLcDsl.g:65:48: (iv_ruleLCModel= ruleLCModel EOF )
            // InternalLcDsl.g:66:2: iv_ruleLCModel= ruleLCModel EOF
            {
             newCompositeNode(grammarAccess.getLCModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLCModel=ruleLCModel();

            state._fsp--;

             current =iv_ruleLCModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLCModel"


    // $ANTLR start "ruleLCModel"
    // InternalLcDsl.g:72:1: ruleLCModel returns [EObject current=null] : ( (lv_configurations_0_0= ruleLaunchConfig ) )* ;
    public final EObject ruleLCModel() throws RecognitionException {
        EObject current = null;

        EObject lv_configurations_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:78:2: ( ( (lv_configurations_0_0= ruleLaunchConfig ) )* )
            // InternalLcDsl.g:79:2: ( (lv_configurations_0_0= ruleLaunchConfig ) )*
            {
            // InternalLcDsl.g:79:2: ( (lv_configurations_0_0= ruleLaunchConfig ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=24)||(LA1_0>=75 && LA1_0<=78)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLcDsl.g:80:3: (lv_configurations_0_0= ruleLaunchConfig )
            	    {
            	    // InternalLcDsl.g:80:3: (lv_configurations_0_0= ruleLaunchConfig )
            	    // InternalLcDsl.g:81:4: lv_configurations_0_0= ruleLaunchConfig
            	    {

            	    				newCompositeNode(grammarAccess.getLCModelAccess().getConfigurationsLaunchConfigParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_configurations_0_0=ruleLaunchConfig();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLCModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"configurations",
            	    					lv_configurations_0_0,
            	    					"com.wamas.ide.launching.LcDsl.LaunchConfig");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLCModel"


    // $ANTLR start "entryRuleLaunchConfig"
    // InternalLcDsl.g:101:1: entryRuleLaunchConfig returns [EObject current=null] : iv_ruleLaunchConfig= ruleLaunchConfig EOF ;
    public final EObject entryRuleLaunchConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaunchConfig = null;


        try {
            // InternalLcDsl.g:101:53: (iv_ruleLaunchConfig= ruleLaunchConfig EOF )
            // InternalLcDsl.g:102:2: iv_ruleLaunchConfig= ruleLaunchConfig EOF
            {
             newCompositeNode(grammarAccess.getLaunchConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLaunchConfig=ruleLaunchConfig();

            state._fsp--;

             current =iv_ruleLaunchConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLaunchConfig"


    // $ANTLR start "ruleLaunchConfig"
    // InternalLcDsl.g:108:1: ruleLaunchConfig returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_30_0= ruleAddPlugin ) ) | ( (lv_ignore_31_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_32_0= ruleGroupMember ) ) | ( (lv_vmArgs_33_0= ruleVmArgument ) ) | ( (lv_progArgs_34_0= ruleProgramArgument ) ) | ( (lv_envVars_35_0= ruleEnvironmentVariable ) ) | ( (lv_traces_36_0= ruleTraceEnablement ) ) )* this_BLOCK_END_37= RULE_BLOCK_END ) ;
    public final EObject ruleLaunchConfig() throws RecognitionException {
        EObject current = null;

        Token lv_explicit_1_0=null;
        Token lv_manual_2_0=null;
        Token lv_foreground_3_0=null;
        Token lv_noConsole_4_0=null;
        Token lv_noValidate_5_0=null;
        Token lv_swInstallSupport_6_0=null;
        Token lv_replaceEnv_7_0=null;
        Token lv_stopInMain_8_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_BLOCK_BEGIN_14=null;
        Token this_BLOCK_END_37=null;
        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_name_11_0 = null;

        EObject lv_clears_16_0 = null;

        EObject lv_workspace_17_0 = null;

        EObject lv_workingDir_18_0 = null;

        EObject lv_memory_19_0 = null;

        EObject lv_mainProject_20_0 = null;

        EObject lv_mainType_21_0 = null;

        EObject lv_application_22_0 = null;

        EObject lv_product_23_0 = null;

        EObject lv_favorites_24_0 = null;

        EObject lv_redirect_25_0 = null;

        EObject lv_execEnv_26_0 = null;

        EObject lv_configIniTemplate_27_0 = null;

        EObject lv_javaMainSearch_28_0 = null;

        EObject lv_servletConfig_29_0 = null;

        EObject lv_plugins_30_0 = null;

        EObject lv_ignore_31_0 = null;

        EObject lv_groupMembers_32_0 = null;

        EObject lv_vmArgs_33_0 = null;

        EObject lv_progArgs_34_0 = null;

        EObject lv_envVars_35_0 = null;

        EObject lv_traces_36_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:114:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_30_0= ruleAddPlugin ) ) | ( (lv_ignore_31_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_32_0= ruleGroupMember ) ) | ( (lv_vmArgs_33_0= ruleVmArgument ) ) | ( (lv_progArgs_34_0= ruleProgramArgument ) ) | ( (lv_envVars_35_0= ruleEnvironmentVariable ) ) | ( (lv_traces_36_0= ruleTraceEnablement ) ) )* this_BLOCK_END_37= RULE_BLOCK_END ) )
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_30_0= ruleAddPlugin ) ) | ( (lv_ignore_31_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_32_0= ruleGroupMember ) ) | ( (lv_vmArgs_33_0= ruleVmArgument ) ) | ( (lv_progArgs_34_0= ruleProgramArgument ) ) | ( (lv_envVars_35_0= ruleEnvironmentVariable ) ) | ( (lv_traces_36_0= ruleTraceEnablement ) ) )* this_BLOCK_END_37= RULE_BLOCK_END )
            {
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_30_0= ruleAddPlugin ) ) | ( (lv_ignore_31_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_32_0= ruleGroupMember ) ) | ( (lv_vmArgs_33_0= ruleVmArgument ) ) | ( (lv_progArgs_34_0= ruleProgramArgument ) ) | ( (lv_envVars_35_0= ruleEnvironmentVariable ) ) | ( (lv_traces_36_0= ruleTraceEnablement ) ) )* this_BLOCK_END_37= RULE_BLOCK_END )
            // InternalLcDsl.g:116:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_30_0= ruleAddPlugin ) ) | ( (lv_ignore_31_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_32_0= ruleGroupMember ) ) | ( (lv_vmArgs_33_0= ruleVmArgument ) ) | ( (lv_progArgs_34_0= ruleProgramArgument ) ) | ( (lv_envVars_35_0= ruleEnvironmentVariable ) ) | ( (lv_traces_36_0= ruleTraceEnablement ) ) )* this_BLOCK_END_37= RULE_BLOCK_END
            {
            // InternalLcDsl.g:116:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:117:4: ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:117:4: ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:118:5: ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            				
            // InternalLcDsl.g:121:5: ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* )
            // InternalLcDsl.g:122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )*
            loop2:
            do {
                int alt2=9;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalLcDsl.g:123:4: ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:123:4: ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) )
            	    // InternalLcDsl.g:124:5: {...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalLcDsl.g:124:109: ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) )
            	    // InternalLcDsl.g:125:6: ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalLcDsl.g:128:9: ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) )
            	    // InternalLcDsl.g:128:10: {...}? => ( (lv_explicit_1_0= 'explicit' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:128:19: ( (lv_explicit_1_0= 'explicit' ) )
            	    // InternalLcDsl.g:128:20: (lv_explicit_1_0= 'explicit' )
            	    {
            	    // InternalLcDsl.g:128:20: (lv_explicit_1_0= 'explicit' )
            	    // InternalLcDsl.g:129:10: lv_explicit_1_0= 'explicit'
            	    {
            	    lv_explicit_1_0=(Token)match(input,17,FOLLOW_4); 

            	    										newLeafNode(lv_explicit_1_0, grammarAccess.getLaunchConfigAccess().getExplicitExplicitKeyword_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "explicit", true, "explicit");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:146:4: ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:146:4: ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) )
            	    // InternalLcDsl.g:147:5: {...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalLcDsl.g:147:109: ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) )
            	    // InternalLcDsl.g:148:6: ({...}? => ( (lv_manual_2_0= 'manual' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalLcDsl.g:151:9: ({...}? => ( (lv_manual_2_0= 'manual' ) ) )
            	    // InternalLcDsl.g:151:10: {...}? => ( (lv_manual_2_0= 'manual' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:151:19: ( (lv_manual_2_0= 'manual' ) )
            	    // InternalLcDsl.g:151:20: (lv_manual_2_0= 'manual' )
            	    {
            	    // InternalLcDsl.g:151:20: (lv_manual_2_0= 'manual' )
            	    // InternalLcDsl.g:152:10: lv_manual_2_0= 'manual'
            	    {
            	    lv_manual_2_0=(Token)match(input,18,FOLLOW_4); 

            	    										newLeafNode(lv_manual_2_0, grammarAccess.getLaunchConfigAccess().getManualManualKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "manual", true, "manual");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:169:4: ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:169:4: ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) )
            	    // InternalLcDsl.g:170:5: {...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalLcDsl.g:170:109: ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) )
            	    // InternalLcDsl.g:171:6: ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalLcDsl.g:174:9: ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) )
            	    // InternalLcDsl.g:174:10: {...}? => ( (lv_foreground_3_0= 'foreground' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:174:19: ( (lv_foreground_3_0= 'foreground' ) )
            	    // InternalLcDsl.g:174:20: (lv_foreground_3_0= 'foreground' )
            	    {
            	    // InternalLcDsl.g:174:20: (lv_foreground_3_0= 'foreground' )
            	    // InternalLcDsl.g:175:10: lv_foreground_3_0= 'foreground'
            	    {
            	    lv_foreground_3_0=(Token)match(input,19,FOLLOW_4); 

            	    										newLeafNode(lv_foreground_3_0, grammarAccess.getLaunchConfigAccess().getForegroundForegroundKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "foreground", true, "foreground");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:192:4: ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:192:4: ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) )
            	    // InternalLcDsl.g:193:5: {...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalLcDsl.g:193:109: ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) )
            	    // InternalLcDsl.g:194:6: ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalLcDsl.g:197:9: ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) )
            	    // InternalLcDsl.g:197:10: {...}? => ( (lv_noConsole_4_0= 'no-console' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:197:19: ( (lv_noConsole_4_0= 'no-console' ) )
            	    // InternalLcDsl.g:197:20: (lv_noConsole_4_0= 'no-console' )
            	    {
            	    // InternalLcDsl.g:197:20: (lv_noConsole_4_0= 'no-console' )
            	    // InternalLcDsl.g:198:10: lv_noConsole_4_0= 'no-console'
            	    {
            	    lv_noConsole_4_0=(Token)match(input,20,FOLLOW_4); 

            	    										newLeafNode(lv_noConsole_4_0, grammarAccess.getLaunchConfigAccess().getNoConsoleNoConsoleKeyword_0_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "noConsole", true, "no-console");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:215:4: ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:215:4: ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) )
            	    // InternalLcDsl.g:216:5: {...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4)");
            	    }
            	    // InternalLcDsl.g:216:109: ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) )
            	    // InternalLcDsl.g:217:6: ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4);
            	    					
            	    // InternalLcDsl.g:220:9: ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) )
            	    // InternalLcDsl.g:220:10: {...}? => ( (lv_noValidate_5_0= 'no-validate' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:220:19: ( (lv_noValidate_5_0= 'no-validate' ) )
            	    // InternalLcDsl.g:220:20: (lv_noValidate_5_0= 'no-validate' )
            	    {
            	    // InternalLcDsl.g:220:20: (lv_noValidate_5_0= 'no-validate' )
            	    // InternalLcDsl.g:221:10: lv_noValidate_5_0= 'no-validate'
            	    {
            	    lv_noValidate_5_0=(Token)match(input,21,FOLLOW_4); 

            	    										newLeafNode(lv_noValidate_5_0, grammarAccess.getLaunchConfigAccess().getNoValidateNoValidateKeyword_0_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "noValidate", true, "no-validate");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:238:4: ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:238:4: ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) )
            	    // InternalLcDsl.g:239:5: {...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5)");
            	    }
            	    // InternalLcDsl.g:239:109: ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) )
            	    // InternalLcDsl.g:240:6: ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5);
            	    					
            	    // InternalLcDsl.g:243:9: ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) )
            	    // InternalLcDsl.g:243:10: {...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:243:19: ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) )
            	    // InternalLcDsl.g:243:20: (lv_swInstallSupport_6_0= 'sw-install-allowed' )
            	    {
            	    // InternalLcDsl.g:243:20: (lv_swInstallSupport_6_0= 'sw-install-allowed' )
            	    // InternalLcDsl.g:244:10: lv_swInstallSupport_6_0= 'sw-install-allowed'
            	    {
            	    lv_swInstallSupport_6_0=(Token)match(input,22,FOLLOW_4); 

            	    										newLeafNode(lv_swInstallSupport_6_0, grammarAccess.getLaunchConfigAccess().getSwInstallSupportSwInstallAllowedKeyword_0_5_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "swInstallSupport", true, "sw-install-allowed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLcDsl.g:261:4: ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:261:4: ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) )
            	    // InternalLcDsl.g:262:5: {...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6)");
            	    }
            	    // InternalLcDsl.g:262:109: ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) )
            	    // InternalLcDsl.g:263:6: ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6);
            	    					
            	    // InternalLcDsl.g:266:9: ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) )
            	    // InternalLcDsl.g:266:10: {...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:266:19: ( (lv_replaceEnv_7_0= 'replace-env' ) )
            	    // InternalLcDsl.g:266:20: (lv_replaceEnv_7_0= 'replace-env' )
            	    {
            	    // InternalLcDsl.g:266:20: (lv_replaceEnv_7_0= 'replace-env' )
            	    // InternalLcDsl.g:267:10: lv_replaceEnv_7_0= 'replace-env'
            	    {
            	    lv_replaceEnv_7_0=(Token)match(input,23,FOLLOW_4); 

            	    										newLeafNode(lv_replaceEnv_7_0, grammarAccess.getLaunchConfigAccess().getReplaceEnvReplaceEnvKeyword_0_6_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "replaceEnv", true, "replace-env");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalLcDsl.g:284:4: ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:284:4: ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) )
            	    // InternalLcDsl.g:285:5: {...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 7)");
            	    }
            	    // InternalLcDsl.g:285:109: ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) )
            	    // InternalLcDsl.g:286:6: ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 7);
            	    					
            	    // InternalLcDsl.g:289:9: ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) )
            	    // InternalLcDsl.g:289:10: {...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:289:19: ( (lv_stopInMain_8_0= 'stop-in-main' ) )
            	    // InternalLcDsl.g:289:20: (lv_stopInMain_8_0= 'stop-in-main' )
            	    {
            	    // InternalLcDsl.g:289:20: (lv_stopInMain_8_0= 'stop-in-main' )
            	    // InternalLcDsl.g:290:10: lv_stopInMain_8_0= 'stop-in-main'
            	    {
            	    lv_stopInMain_8_0=(Token)match(input,24,FOLLOW_4); 

            	    										newLeafNode(lv_stopInMain_8_0, grammarAccess.getLaunchConfigAccess().getStopInMainStopInMainKeyword_0_7_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "stopInMain", true, "stop-in-main");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            				

            }

            // InternalLcDsl.g:314:3: ( (lv_type_9_0= ruleLaunchConfigType ) )
            // InternalLcDsl.g:315:4: (lv_type_9_0= ruleLaunchConfigType )
            {
            // InternalLcDsl.g:315:4: (lv_type_9_0= ruleLaunchConfigType )
            // InternalLcDsl.g:316:5: lv_type_9_0= ruleLaunchConfigType
            {

            					newCompositeNode(grammarAccess.getLaunchConfigAccess().getTypeLaunchConfigTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_9_0=ruleLaunchConfigType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_9_0,
            						"com.wamas.ide.launching.LcDsl.LaunchConfigType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getLaunchConfigAccess().getConfigurationKeyword_2());
            		
            // InternalLcDsl.g:337:3: ( (lv_name_11_0= ruleFQName ) )
            // InternalLcDsl.g:338:4: (lv_name_11_0= ruleFQName )
            {
            // InternalLcDsl.g:338:4: (lv_name_11_0= ruleFQName )
            // InternalLcDsl.g:339:5: lv_name_11_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getLaunchConfigAccess().getNameFQNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_11_0=ruleFQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_11_0,
            						"com.wamas.ide.launching.LcDsl.FQName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:356:3: (otherlv_12= ':' ( ( ruleFQName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLcDsl.g:357:4: otherlv_12= ':' ( ( ruleFQName ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getLaunchConfigAccess().getColonKeyword_4_0());
                    			
                    // InternalLcDsl.g:361:4: ( ( ruleFQName ) )
                    // InternalLcDsl.g:362:5: ( ruleFQName )
                    {
                    // InternalLcDsl.g:362:5: ( ruleFQName )
                    // InternalLcDsl.g:363:6: ruleFQName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLaunchConfigRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getSuperConfigLaunchConfigCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleFQName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BLOCK_BEGIN_14=(Token)match(input,RULE_BLOCK_BEGIN,FOLLOW_9); 

            			newLeafNode(this_BLOCK_BEGIN_14, grammarAccess.getLaunchConfigAccess().getBLOCK_BEGINTerminalRuleCall_5());
            		
            // InternalLcDsl.g:382:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:383:4: ( ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:383:4: ( ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* ) )
            // InternalLcDsl.g:384:5: ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            				
            // InternalLcDsl.g:387:5: ( ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )* )
            // InternalLcDsl.g:388:6: ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )*
            {
            // InternalLcDsl.g:388:6: ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )*
            loop4:
            do {
                int alt4=15;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalLcDsl.g:389:4: ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:389:4: ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) )
            	    // InternalLcDsl.g:390:5: {...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalLcDsl.g:390:109: ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) )
            	    // InternalLcDsl.g:391:6: ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0);
            	    					
            	    // InternalLcDsl.g:394:9: ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) )
            	    // InternalLcDsl.g:394:10: {...}? => ( (lv_clears_16_0= ruleClearOption ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:394:19: ( (lv_clears_16_0= ruleClearOption ) )
            	    // InternalLcDsl.g:394:20: (lv_clears_16_0= ruleClearOption )
            	    {
            	    // InternalLcDsl.g:394:20: (lv_clears_16_0= ruleClearOption )
            	    // InternalLcDsl.g:395:10: lv_clears_16_0= ruleClearOption
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getClearsClearOptionParserRuleCall_6_0_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_clears_16_0=ruleClearOption();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"clears",
            	    											lv_clears_16_0,
            	    											"com.wamas.ide.launching.LcDsl.ClearOption");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:417:4: ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:417:4: ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) )
            	    // InternalLcDsl.g:418:5: {...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalLcDsl.g:418:109: ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) )
            	    // InternalLcDsl.g:419:6: ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1);
            	    					
            	    // InternalLcDsl.g:422:9: ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) )
            	    // InternalLcDsl.g:422:10: {...}? => ( (lv_workspace_17_0= ruleWorkspace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:422:19: ( (lv_workspace_17_0= ruleWorkspace ) )
            	    // InternalLcDsl.g:422:20: (lv_workspace_17_0= ruleWorkspace )
            	    {
            	    // InternalLcDsl.g:422:20: (lv_workspace_17_0= ruleWorkspace )
            	    // InternalLcDsl.g:423:10: lv_workspace_17_0= ruleWorkspace
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkspaceWorkspaceParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_workspace_17_0=ruleWorkspace();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"workspace",
            	    											lv_workspace_17_0,
            	    											"com.wamas.ide.launching.LcDsl.Workspace");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:445:4: ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:445:4: ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) )
            	    // InternalLcDsl.g:446:5: {...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalLcDsl.g:446:109: ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) )
            	    // InternalLcDsl.g:447:6: ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2);
            	    					
            	    // InternalLcDsl.g:450:9: ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) )
            	    // InternalLcDsl.g:450:10: {...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:450:19: ( (lv_workingDir_18_0= ruleWorkingDir ) )
            	    // InternalLcDsl.g:450:20: (lv_workingDir_18_0= ruleWorkingDir )
            	    {
            	    // InternalLcDsl.g:450:20: (lv_workingDir_18_0= ruleWorkingDir )
            	    // InternalLcDsl.g:451:10: lv_workingDir_18_0= ruleWorkingDir
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkingDirWorkingDirParserRuleCall_6_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_workingDir_18_0=ruleWorkingDir();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"workingDir",
            	    											lv_workingDir_18_0,
            	    											"com.wamas.ide.launching.LcDsl.WorkingDir");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:473:4: ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:473:4: ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) )
            	    // InternalLcDsl.g:474:5: {...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalLcDsl.g:474:109: ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) )
            	    // InternalLcDsl.g:475:6: ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3);
            	    					
            	    // InternalLcDsl.g:478:9: ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) )
            	    // InternalLcDsl.g:478:10: {...}? => ( (lv_memory_19_0= ruleMemoryOption ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:478:19: ( (lv_memory_19_0= ruleMemoryOption ) )
            	    // InternalLcDsl.g:478:20: (lv_memory_19_0= ruleMemoryOption )
            	    {
            	    // InternalLcDsl.g:478:20: (lv_memory_19_0= ruleMemoryOption )
            	    // InternalLcDsl.g:479:10: lv_memory_19_0= ruleMemoryOption
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getMemoryMemoryOptionParserRuleCall_6_3_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_memory_19_0=ruleMemoryOption();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"memory",
            	    											lv_memory_19_0,
            	    											"com.wamas.ide.launching.LcDsl.MemoryOption");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:501:4: ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:501:4: ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) )
            	    // InternalLcDsl.g:502:5: {...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalLcDsl.g:502:109: ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) )
            	    // InternalLcDsl.g:503:6: ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4);
            	    					
            	    // InternalLcDsl.g:506:9: ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) )
            	    // InternalLcDsl.g:506:10: {...}? => ( (lv_mainProject_20_0= ruleMainProject ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:506:19: ( (lv_mainProject_20_0= ruleMainProject ) )
            	    // InternalLcDsl.g:506:20: (lv_mainProject_20_0= ruleMainProject )
            	    {
            	    // InternalLcDsl.g:506:20: (lv_mainProject_20_0= ruleMainProject )
            	    // InternalLcDsl.g:507:10: lv_mainProject_20_0= ruleMainProject
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getMainProjectMainProjectParserRuleCall_6_4_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_mainProject_20_0=ruleMainProject();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"mainProject",
            	    											lv_mainProject_20_0,
            	    											"com.wamas.ide.launching.LcDsl.MainProject");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:529:4: ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:529:4: ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) )
            	    // InternalLcDsl.g:530:5: {...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalLcDsl.g:530:109: ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) )
            	    // InternalLcDsl.g:531:6: ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5);
            	    					
            	    // InternalLcDsl.g:534:9: ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) )
            	    // InternalLcDsl.g:534:10: {...}? => ( (lv_mainType_21_0= ruleMainType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:534:19: ( (lv_mainType_21_0= ruleMainType ) )
            	    // InternalLcDsl.g:534:20: (lv_mainType_21_0= ruleMainType )
            	    {
            	    // InternalLcDsl.g:534:20: (lv_mainType_21_0= ruleMainType )
            	    // InternalLcDsl.g:535:10: lv_mainType_21_0= ruleMainType
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getMainTypeMainTypeParserRuleCall_6_5_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_mainType_21_0=ruleMainType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"mainType",
            	    											lv_mainType_21_0,
            	    											"com.wamas.ide.launching.LcDsl.MainType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLcDsl.g:557:4: ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:557:4: ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:558:5: {...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // InternalLcDsl.g:558:109: ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) )
            	    // InternalLcDsl.g:559:6: ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6);
            	    					
            	    // InternalLcDsl.g:562:9: ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) )
            	    // InternalLcDsl.g:562:10: {...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:562:19: ( (lv_application_22_0= ruleApplicationExtPoint ) )
            	    // InternalLcDsl.g:562:20: (lv_application_22_0= ruleApplicationExtPoint )
            	    {
            	    // InternalLcDsl.g:562:20: (lv_application_22_0= ruleApplicationExtPoint )
            	    // InternalLcDsl.g:563:10: lv_application_22_0= ruleApplicationExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getApplicationApplicationExtPointParserRuleCall_6_6_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_application_22_0=ruleApplicationExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"application",
            	    											lv_application_22_0,
            	    											"com.wamas.ide.launching.LcDsl.ApplicationExtPoint");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalLcDsl.g:585:4: ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:585:4: ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:586:5: {...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7)");
            	    }
            	    // InternalLcDsl.g:586:109: ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) )
            	    // InternalLcDsl.g:587:6: ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7);
            	    					
            	    // InternalLcDsl.g:590:9: ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) )
            	    // InternalLcDsl.g:590:10: {...}? => ( (lv_product_23_0= ruleProductExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:590:19: ( (lv_product_23_0= ruleProductExtPoint ) )
            	    // InternalLcDsl.g:590:20: (lv_product_23_0= ruleProductExtPoint )
            	    {
            	    // InternalLcDsl.g:590:20: (lv_product_23_0= ruleProductExtPoint )
            	    // InternalLcDsl.g:591:10: lv_product_23_0= ruleProductExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getProductProductExtPointParserRuleCall_6_7_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_product_23_0=ruleProductExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"product",
            	    											lv_product_23_0,
            	    											"com.wamas.ide.launching.LcDsl.ProductExtPoint");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalLcDsl.g:613:4: ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:613:4: ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) )
            	    // InternalLcDsl.g:614:5: {...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8)");
            	    }
            	    // InternalLcDsl.g:614:109: ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) )
            	    // InternalLcDsl.g:615:6: ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8);
            	    					
            	    // InternalLcDsl.g:618:9: ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) )
            	    // InternalLcDsl.g:618:10: {...}? => ( (lv_favorites_24_0= ruleFavorites ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:618:19: ( (lv_favorites_24_0= ruleFavorites ) )
            	    // InternalLcDsl.g:618:20: (lv_favorites_24_0= ruleFavorites )
            	    {
            	    // InternalLcDsl.g:618:20: (lv_favorites_24_0= ruleFavorites )
            	    // InternalLcDsl.g:619:10: lv_favorites_24_0= ruleFavorites
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getFavoritesFavoritesParserRuleCall_6_8_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_favorites_24_0=ruleFavorites();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"favorites",
            	    											lv_favorites_24_0,
            	    											"com.wamas.ide.launching.LcDsl.Favorites");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalLcDsl.g:641:4: ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:641:4: ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) )
            	    // InternalLcDsl.g:642:5: {...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9)");
            	    }
            	    // InternalLcDsl.g:642:109: ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) )
            	    // InternalLcDsl.g:643:6: ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9);
            	    					
            	    // InternalLcDsl.g:646:9: ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) )
            	    // InternalLcDsl.g:646:10: {...}? => ( (lv_redirect_25_0= ruleRedirect ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:646:19: ( (lv_redirect_25_0= ruleRedirect ) )
            	    // InternalLcDsl.g:646:20: (lv_redirect_25_0= ruleRedirect )
            	    {
            	    // InternalLcDsl.g:646:20: (lv_redirect_25_0= ruleRedirect )
            	    // InternalLcDsl.g:647:10: lv_redirect_25_0= ruleRedirect
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getRedirectRedirectParserRuleCall_6_9_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_redirect_25_0=ruleRedirect();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"redirect",
            	    											lv_redirect_25_0,
            	    											"com.wamas.ide.launching.LcDsl.Redirect");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalLcDsl.g:669:4: ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:669:4: ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) )
            	    // InternalLcDsl.g:670:5: {...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10)");
            	    }
            	    // InternalLcDsl.g:670:110: ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) )
            	    // InternalLcDsl.g:671:6: ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10);
            	    					
            	    // InternalLcDsl.g:674:9: ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) )
            	    // InternalLcDsl.g:674:10: {...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:674:19: ( (lv_execEnv_26_0= ruleExecutionEnvironment ) )
            	    // InternalLcDsl.g:674:20: (lv_execEnv_26_0= ruleExecutionEnvironment )
            	    {
            	    // InternalLcDsl.g:674:20: (lv_execEnv_26_0= ruleExecutionEnvironment )
            	    // InternalLcDsl.g:675:10: lv_execEnv_26_0= ruleExecutionEnvironment
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getExecEnvExecutionEnvironmentParserRuleCall_6_10_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_execEnv_26_0=ruleExecutionEnvironment();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"execEnv",
            	    											lv_execEnv_26_0,
            	    											"com.wamas.ide.launching.LcDsl.ExecutionEnvironment");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalLcDsl.g:697:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:697:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) )
            	    // InternalLcDsl.g:698:5: {...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11)");
            	    }
            	    // InternalLcDsl.g:698:110: ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) )
            	    // InternalLcDsl.g:699:6: ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11);
            	    					
            	    // InternalLcDsl.g:702:9: ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) )
            	    // InternalLcDsl.g:702:10: {...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:702:19: ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) )
            	    // InternalLcDsl.g:702:20: (lv_configIniTemplate_27_0= ruleConfigIniTemplate )
            	    {
            	    // InternalLcDsl.g:702:20: (lv_configIniTemplate_27_0= ruleConfigIniTemplate )
            	    // InternalLcDsl.g:703:10: lv_configIniTemplate_27_0= ruleConfigIniTemplate
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getConfigIniTemplateConfigIniTemplateParserRuleCall_6_11_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_configIniTemplate_27_0=ruleConfigIniTemplate();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"configIniTemplate",
            	    											lv_configIniTemplate_27_0,
            	    											"com.wamas.ide.launching.LcDsl.ConfigIniTemplate");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalLcDsl.g:725:4: ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:725:4: ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) )
            	    // InternalLcDsl.g:726:5: {...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12)");
            	    }
            	    // InternalLcDsl.g:726:110: ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) )
            	    // InternalLcDsl.g:727:6: ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12);
            	    					
            	    // InternalLcDsl.g:730:9: ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) )
            	    // InternalLcDsl.g:730:10: {...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:730:19: ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) )
            	    // InternalLcDsl.g:730:20: (lv_javaMainSearch_28_0= ruleJavaMainSearch )
            	    {
            	    // InternalLcDsl.g:730:20: (lv_javaMainSearch_28_0= ruleJavaMainSearch )
            	    // InternalLcDsl.g:731:10: lv_javaMainSearch_28_0= ruleJavaMainSearch
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getJavaMainSearchJavaMainSearchParserRuleCall_6_12_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_javaMainSearch_28_0=ruleJavaMainSearch();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"javaMainSearch",
            	    											lv_javaMainSearch_28_0,
            	    											"com.wamas.ide.launching.LcDsl.JavaMainSearch");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalLcDsl.g:753:4: ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:753:4: ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) )
            	    // InternalLcDsl.g:754:5: {...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13)");
            	    }
            	    // InternalLcDsl.g:754:110: ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) )
            	    // InternalLcDsl.g:755:6: ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13);
            	    					
            	    // InternalLcDsl.g:758:9: ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) )
            	    // InternalLcDsl.g:758:10: {...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:758:19: ( (lv_servletConfig_29_0= ruleRapServletConfig ) )
            	    // InternalLcDsl.g:758:20: (lv_servletConfig_29_0= ruleRapServletConfig )
            	    {
            	    // InternalLcDsl.g:758:20: (lv_servletConfig_29_0= ruleRapServletConfig )
            	    // InternalLcDsl.g:759:10: lv_servletConfig_29_0= ruleRapServletConfig
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getServletConfigRapServletConfigParserRuleCall_6_13_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_servletConfig_29_0=ruleRapServletConfig();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"servletConfig",
            	    											lv_servletConfig_29_0,
            	    											"com.wamas.ide.launching.LcDsl.RapServletConfig");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            				

            }

            // InternalLcDsl.g:788:3: ( ( (lv_plugins_30_0= ruleAddPlugin ) ) | ( (lv_ignore_31_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_32_0= ruleGroupMember ) ) | ( (lv_vmArgs_33_0= ruleVmArgument ) ) | ( (lv_progArgs_34_0= ruleProgramArgument ) ) | ( (lv_envVars_35_0= ruleEnvironmentVariable ) ) | ( (lv_traces_36_0= ruleTraceEnablement ) ) )*
            loop5:
            do {
                int alt5=8;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    alt5=1;
                    }
                    break;
                case 33:
                    {
                    alt5=2;
                    }
                    break;
                case 66:
                case 67:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                    {
                    alt5=3;
                    }
                    break;
                case 34:
                    {
                    alt5=4;
                    }
                    break;
                case 35:
                    {
                    alt5=5;
                    }
                    break;
                case 36:
                    {
                    alt5=6;
                    }
                    break;
                case 45:
                    {
                    alt5=7;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalLcDsl.g:789:4: ( (lv_plugins_30_0= ruleAddPlugin ) )
            	    {
            	    // InternalLcDsl.g:789:4: ( (lv_plugins_30_0= ruleAddPlugin ) )
            	    // InternalLcDsl.g:790:5: (lv_plugins_30_0= ruleAddPlugin )
            	    {
            	    // InternalLcDsl.g:790:5: (lv_plugins_30_0= ruleAddPlugin )
            	    // InternalLcDsl.g:791:6: lv_plugins_30_0= ruleAddPlugin
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getPluginsAddPluginParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_plugins_30_0=ruleAddPlugin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"plugins",
            	    							lv_plugins_30_0,
            	    							"com.wamas.ide.launching.LcDsl.AddPlugin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:809:4: ( (lv_ignore_31_0= ruleIgnorePlugin ) )
            	    {
            	    // InternalLcDsl.g:809:4: ( (lv_ignore_31_0= ruleIgnorePlugin ) )
            	    // InternalLcDsl.g:810:5: (lv_ignore_31_0= ruleIgnorePlugin )
            	    {
            	    // InternalLcDsl.g:810:5: (lv_ignore_31_0= ruleIgnorePlugin )
            	    // InternalLcDsl.g:811:6: lv_ignore_31_0= ruleIgnorePlugin
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getIgnoreIgnorePluginParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_ignore_31_0=ruleIgnorePlugin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ignore",
            	    							lv_ignore_31_0,
            	    							"com.wamas.ide.launching.LcDsl.IgnorePlugin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:829:4: ( (lv_groupMembers_32_0= ruleGroupMember ) )
            	    {
            	    // InternalLcDsl.g:829:4: ( (lv_groupMembers_32_0= ruleGroupMember ) )
            	    // InternalLcDsl.g:830:5: (lv_groupMembers_32_0= ruleGroupMember )
            	    {
            	    // InternalLcDsl.g:830:5: (lv_groupMembers_32_0= ruleGroupMember )
            	    // InternalLcDsl.g:831:6: lv_groupMembers_32_0= ruleGroupMember
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getGroupMembersGroupMemberParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_groupMembers_32_0=ruleGroupMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"groupMembers",
            	    							lv_groupMembers_32_0,
            	    							"com.wamas.ide.launching.LcDsl.GroupMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:849:4: ( (lv_vmArgs_33_0= ruleVmArgument ) )
            	    {
            	    // InternalLcDsl.g:849:4: ( (lv_vmArgs_33_0= ruleVmArgument ) )
            	    // InternalLcDsl.g:850:5: (lv_vmArgs_33_0= ruleVmArgument )
            	    {
            	    // InternalLcDsl.g:850:5: (lv_vmArgs_33_0= ruleVmArgument )
            	    // InternalLcDsl.g:851:6: lv_vmArgs_33_0= ruleVmArgument
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getVmArgsVmArgumentParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_vmArgs_33_0=ruleVmArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vmArgs",
            	    							lv_vmArgs_33_0,
            	    							"com.wamas.ide.launching.LcDsl.VmArgument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:869:4: ( (lv_progArgs_34_0= ruleProgramArgument ) )
            	    {
            	    // InternalLcDsl.g:869:4: ( (lv_progArgs_34_0= ruleProgramArgument ) )
            	    // InternalLcDsl.g:870:5: (lv_progArgs_34_0= ruleProgramArgument )
            	    {
            	    // InternalLcDsl.g:870:5: (lv_progArgs_34_0= ruleProgramArgument )
            	    // InternalLcDsl.g:871:6: lv_progArgs_34_0= ruleProgramArgument
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getProgArgsProgramArgumentParserRuleCall_7_4_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_progArgs_34_0=ruleProgramArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"progArgs",
            	    							lv_progArgs_34_0,
            	    							"com.wamas.ide.launching.LcDsl.ProgramArgument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:889:4: ( (lv_envVars_35_0= ruleEnvironmentVariable ) )
            	    {
            	    // InternalLcDsl.g:889:4: ( (lv_envVars_35_0= ruleEnvironmentVariable ) )
            	    // InternalLcDsl.g:890:5: (lv_envVars_35_0= ruleEnvironmentVariable )
            	    {
            	    // InternalLcDsl.g:890:5: (lv_envVars_35_0= ruleEnvironmentVariable )
            	    // InternalLcDsl.g:891:6: lv_envVars_35_0= ruleEnvironmentVariable
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getEnvVarsEnvironmentVariableParserRuleCall_7_5_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_envVars_35_0=ruleEnvironmentVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"envVars",
            	    							lv_envVars_35_0,
            	    							"com.wamas.ide.launching.LcDsl.EnvironmentVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLcDsl.g:909:4: ( (lv_traces_36_0= ruleTraceEnablement ) )
            	    {
            	    // InternalLcDsl.g:909:4: ( (lv_traces_36_0= ruleTraceEnablement ) )
            	    // InternalLcDsl.g:910:5: (lv_traces_36_0= ruleTraceEnablement )
            	    {
            	    // InternalLcDsl.g:910:5: (lv_traces_36_0= ruleTraceEnablement )
            	    // InternalLcDsl.g:911:6: lv_traces_36_0= ruleTraceEnablement
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getTracesTraceEnablementParserRuleCall_7_6_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_traces_36_0=ruleTraceEnablement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"traces",
            	    							lv_traces_36_0,
            	    							"com.wamas.ide.launching.LcDsl.TraceEnablement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_BLOCK_END_37=(Token)match(input,RULE_BLOCK_END,FOLLOW_2); 

            			newLeafNode(this_BLOCK_END_37, grammarAccess.getLaunchConfigAccess().getBLOCK_ENDTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLaunchConfig"


    // $ANTLR start "entryRuleWorkspace"
    // InternalLcDsl.g:937:1: entryRuleWorkspace returns [EObject current=null] : iv_ruleWorkspace= ruleWorkspace EOF ;
    public final EObject entryRuleWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkspace = null;


        try {
            // InternalLcDsl.g:937:50: (iv_ruleWorkspace= ruleWorkspace EOF )
            // InternalLcDsl.g:938:2: iv_ruleWorkspace= ruleWorkspace EOF
            {
             newCompositeNode(grammarAccess.getWorkspaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkspace=ruleWorkspace();

            state._fsp--;

             current =iv_ruleWorkspace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkspace"


    // $ANTLR start "ruleWorkspace"
    // InternalLcDsl.g:944:1: ruleWorkspace returns [EObject current=null] : (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleWorkspace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_workspace_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:950:2: ( (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:951:2: (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:951:2: (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:952:3: otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkspaceAccess().getWorkspaceKeyword_0());
            		
            // InternalLcDsl.g:956:3: ( (lv_workspace_1_0= ruleAnyPath ) )
            // InternalLcDsl.g:957:4: (lv_workspace_1_0= ruleAnyPath )
            {
            // InternalLcDsl.g:957:4: (lv_workspace_1_0= ruleAnyPath )
            // InternalLcDsl.g:958:5: lv_workspace_1_0= ruleAnyPath
            {

            					newCompositeNode(grammarAccess.getWorkspaceAccess().getWorkspaceAnyPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_workspace_1_0=ruleAnyPath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkspaceRule());
            					}
            					set(
            						current,
            						"workspace",
            						lv_workspace_1_0,
            						"com.wamas.ide.launching.LcDsl.AnyPath");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkspaceAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkspace"


    // $ANTLR start "entryRuleWorkingDir"
    // InternalLcDsl.g:983:1: entryRuleWorkingDir returns [EObject current=null] : iv_ruleWorkingDir= ruleWorkingDir EOF ;
    public final EObject entryRuleWorkingDir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingDir = null;


        try {
            // InternalLcDsl.g:983:51: (iv_ruleWorkingDir= ruleWorkingDir EOF )
            // InternalLcDsl.g:984:2: iv_ruleWorkingDir= ruleWorkingDir EOF
            {
             newCompositeNode(grammarAccess.getWorkingDirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkingDir=ruleWorkingDir();

            state._fsp--;

             current =iv_ruleWorkingDir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkingDir"


    // $ANTLR start "ruleWorkingDir"
    // InternalLcDsl.g:990:1: ruleWorkingDir returns [EObject current=null] : (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleWorkingDir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_workingDir_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:996:2: ( (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:997:2: (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:997:2: (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:998:3: otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkingDirAccess().getWorkingDirKeyword_0());
            		
            // InternalLcDsl.g:1002:3: ( (lv_workingDir_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:1003:4: (lv_workingDir_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:1003:4: (lv_workingDir_1_0= ruleExistingPath )
            // InternalLcDsl.g:1004:5: lv_workingDir_1_0= ruleExistingPath
            {

            					newCompositeNode(grammarAccess.getWorkingDirAccess().getWorkingDirExistingPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_workingDir_1_0=ruleExistingPath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkingDirRule());
            					}
            					set(
            						current,
            						"workingDir",
            						lv_workingDir_1_0,
            						"com.wamas.ide.launching.LcDsl.ExistingPath");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkingDirAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkingDir"


    // $ANTLR start "entryRuleMainProject"
    // InternalLcDsl.g:1029:1: entryRuleMainProject returns [EObject current=null] : iv_ruleMainProject= ruleMainProject EOF ;
    public final EObject entryRuleMainProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainProject = null;


        try {
            // InternalLcDsl.g:1029:52: (iv_ruleMainProject= ruleMainProject EOF )
            // InternalLcDsl.g:1030:2: iv_ruleMainProject= ruleMainProject EOF
            {
             newCompositeNode(grammarAccess.getMainProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainProject=ruleMainProject();

            state._fsp--;

             current =iv_ruleMainProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainProject"


    // $ANTLR start "ruleMainProject"
    // InternalLcDsl.g:1036:1: ruleMainProject returns [EObject current=null] : (otherlv_0= 'project' ( (lv_project_1_0= ruleProject ) ) otherlv_2= ';' ) ;
    public final EObject ruleMainProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_project_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1042:2: ( (otherlv_0= 'project' ( (lv_project_1_0= ruleProject ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1043:2: (otherlv_0= 'project' ( (lv_project_1_0= ruleProject ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1043:2: (otherlv_0= 'project' ( (lv_project_1_0= ruleProject ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1044:3: otherlv_0= 'project' ( (lv_project_1_0= ruleProject ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMainProjectAccess().getProjectKeyword_0());
            		
            // InternalLcDsl.g:1048:3: ( (lv_project_1_0= ruleProject ) )
            // InternalLcDsl.g:1049:4: (lv_project_1_0= ruleProject )
            {
            // InternalLcDsl.g:1049:4: (lv_project_1_0= ruleProject )
            // InternalLcDsl.g:1050:5: lv_project_1_0= ruleProject
            {

            					newCompositeNode(grammarAccess.getMainProjectAccess().getProjectProjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_project_1_0=ruleProject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainProjectRule());
            					}
            					set(
            						current,
            						"project",
            						lv_project_1_0,
            						"com.wamas.ide.launching.LcDsl.Project");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMainProjectAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainProject"


    // $ANTLR start "entryRuleMainType"
    // InternalLcDsl.g:1075:1: entryRuleMainType returns [EObject current=null] : iv_ruleMainType= ruleMainType EOF ;
    public final EObject entryRuleMainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainType = null;


        try {
            // InternalLcDsl.g:1075:49: (iv_ruleMainType= ruleMainType EOF )
            // InternalLcDsl.g:1076:2: iv_ruleMainType= ruleMainType EOF
            {
             newCompositeNode(grammarAccess.getMainTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainType=ruleMainType();

            state._fsp--;

             current =iv_ruleMainType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainType"


    // $ANTLR start "ruleMainType"
    // InternalLcDsl.g:1082:1: ruleMainType returns [EObject current=null] : (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' ) ;
    public final EObject ruleMainType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_mainClass_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1088:2: ( (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1089:2: (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1089:2: (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1090:3: otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMainTypeAccess().getMainClassKeyword_0());
            		
            // InternalLcDsl.g:1094:3: ( (lv_mainClass_1_0= ruleJavaMainType ) )
            // InternalLcDsl.g:1095:4: (lv_mainClass_1_0= ruleJavaMainType )
            {
            // InternalLcDsl.g:1095:4: (lv_mainClass_1_0= ruleJavaMainType )
            // InternalLcDsl.g:1096:5: lv_mainClass_1_0= ruleJavaMainType
            {

            					newCompositeNode(grammarAccess.getMainTypeAccess().getMainClassJavaMainTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_mainClass_1_0=ruleJavaMainType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainTypeRule());
            					}
            					set(
            						current,
            						"mainClass",
            						lv_mainClass_1_0,
            						"com.wamas.ide.launching.LcDsl.JavaMainType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMainTypeAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainType"


    // $ANTLR start "entryRuleAddPlugin"
    // InternalLcDsl.g:1121:1: entryRuleAddPlugin returns [EObject current=null] : iv_ruleAddPlugin= ruleAddPlugin EOF ;
    public final EObject entryRuleAddPlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPlugin = null;


        try {
            // InternalLcDsl.g:1121:50: (iv_ruleAddPlugin= ruleAddPlugin EOF )
            // InternalLcDsl.g:1122:2: iv_ruleAddPlugin= ruleAddPlugin EOF
            {
             newCompositeNode(grammarAccess.getAddPluginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddPlugin=ruleAddPlugin();

            state._fsp--;

             current =iv_ruleAddPlugin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddPlugin"


    // $ANTLR start "ruleAddPlugin"
    // InternalLcDsl.g:1128:1: ruleAddPlugin returns [EObject current=null] : (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' ) ;
    public final EObject ruleAddPlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1134:2: ( (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1135:2: (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1135:2: (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1136:3: otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAddPluginAccess().getPluginKeyword_0());
            		
            // InternalLcDsl.g:1140:3: ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) )
            // InternalLcDsl.g:1141:4: (lv_plugin_1_0= rulePluginWithVersionAndStartLevel )
            {
            // InternalLcDsl.g:1141:4: (lv_plugin_1_0= rulePluginWithVersionAndStartLevel )
            // InternalLcDsl.g:1142:5: lv_plugin_1_0= rulePluginWithVersionAndStartLevel
            {

            					newCompositeNode(grammarAccess.getAddPluginAccess().getPluginPluginWithVersionAndStartLevelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_plugin_1_0=rulePluginWithVersionAndStartLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddPluginRule());
            					}
            					set(
            						current,
            						"plugin",
            						lv_plugin_1_0,
            						"com.wamas.ide.launching.LcDsl.PluginWithVersionAndStartLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAddPluginAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddPlugin"


    // $ANTLR start "entryRuleIgnorePlugin"
    // InternalLcDsl.g:1167:1: entryRuleIgnorePlugin returns [EObject current=null] : iv_ruleIgnorePlugin= ruleIgnorePlugin EOF ;
    public final EObject entryRuleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnorePlugin = null;


        try {
            // InternalLcDsl.g:1167:53: (iv_ruleIgnorePlugin= ruleIgnorePlugin EOF )
            // InternalLcDsl.g:1168:2: iv_ruleIgnorePlugin= ruleIgnorePlugin EOF
            {
             newCompositeNode(grammarAccess.getIgnorePluginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIgnorePlugin=ruleIgnorePlugin();

            state._fsp--;

             current =iv_ruleIgnorePlugin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIgnorePlugin"


    // $ANTLR start "ruleIgnorePlugin"
    // InternalLcDsl.g:1174:1: ruleIgnorePlugin returns [EObject current=null] : (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) ;
    public final EObject ruleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1180:2: ( (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1181:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1181:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1182:3: otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIgnorePluginAccess().getIgnoreKeyword_0());
            		
            // InternalLcDsl.g:1186:3: ( (lv_plugin_1_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:1187:4: (lv_plugin_1_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:1187:4: (lv_plugin_1_0= rulePluginWithVersion )
            // InternalLcDsl.g:1188:5: lv_plugin_1_0= rulePluginWithVersion
            {

            					newCompositeNode(grammarAccess.getIgnorePluginAccess().getPluginPluginWithVersionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_plugin_1_0=rulePluginWithVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIgnorePluginRule());
            					}
            					set(
            						current,
            						"plugin",
            						lv_plugin_1_0,
            						"com.wamas.ide.launching.LcDsl.PluginWithVersion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIgnorePluginAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIgnorePlugin"


    // $ANTLR start "entryRuleVmArgument"
    // InternalLcDsl.g:1213:1: entryRuleVmArgument returns [EObject current=null] : iv_ruleVmArgument= ruleVmArgument EOF ;
    public final EObject entryRuleVmArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVmArgument = null;


        try {
            // InternalLcDsl.g:1213:51: (iv_ruleVmArgument= ruleVmArgument EOF )
            // InternalLcDsl.g:1214:2: iv_ruleVmArgument= ruleVmArgument EOF
            {
             newCompositeNode(grammarAccess.getVmArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVmArgument=ruleVmArgument();

            state._fsp--;

             current =iv_ruleVmArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVmArgument"


    // $ANTLR start "ruleVmArgument"
    // InternalLcDsl.g:1220:1: ruleVmArgument returns [EObject current=null] : ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) ;
    public final EObject ruleVmArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1226:2: ( ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1227:2: ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1227:2: ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1228:3: () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1228:3: ()
            // InternalLcDsl.g:1229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVmArgumentAccess().getVmArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVmArgumentAccess().getVmArgKeyword_1());
            		
            // InternalLcDsl.g:1239:3: ( (lv_arguments_2_0= ruleStringWithVariables ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLcDsl.g:1240:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    {
            	    // InternalLcDsl.g:1240:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    // InternalLcDsl.g:1241:5: lv_arguments_2_0= ruleStringWithVariables
            	    {

            	    					newCompositeNode(grammarAccess.getVmArgumentAccess().getArgumentsStringWithVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_arguments_2_0=ruleStringWithVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVmArgumentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arguments",
            	    						lv_arguments_2_0,
            	    						"com.wamas.ide.launching.LcDsl.StringWithVariables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getVmArgumentAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVmArgument"


    // $ANTLR start "entryRuleProgramArgument"
    // InternalLcDsl.g:1266:1: entryRuleProgramArgument returns [EObject current=null] : iv_ruleProgramArgument= ruleProgramArgument EOF ;
    public final EObject entryRuleProgramArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramArgument = null;


        try {
            // InternalLcDsl.g:1266:56: (iv_ruleProgramArgument= ruleProgramArgument EOF )
            // InternalLcDsl.g:1267:2: iv_ruleProgramArgument= ruleProgramArgument EOF
            {
             newCompositeNode(grammarAccess.getProgramArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramArgument=ruleProgramArgument();

            state._fsp--;

             current =iv_ruleProgramArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgramArgument"


    // $ANTLR start "ruleProgramArgument"
    // InternalLcDsl.g:1273:1: ruleProgramArgument returns [EObject current=null] : ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) ;
    public final EObject ruleProgramArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1279:2: ( ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1280:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1280:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1281:3: () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1281:3: ()
            // InternalLcDsl.g:1282:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramArgumentAccess().getProgramArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramArgumentAccess().getArgumentKeyword_1());
            		
            // InternalLcDsl.g:1292:3: ( (lv_arguments_2_0= ruleStringWithVariables ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLcDsl.g:1293:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    {
            	    // InternalLcDsl.g:1293:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    // InternalLcDsl.g:1294:5: lv_arguments_2_0= ruleStringWithVariables
            	    {

            	    					newCompositeNode(grammarAccess.getProgramArgumentAccess().getArgumentsStringWithVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_arguments_2_0=ruleStringWithVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramArgumentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arguments",
            	    						lv_arguments_2_0,
            	    						"com.wamas.ide.launching.LcDsl.StringWithVariables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramArgumentAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgramArgument"


    // $ANTLR start "entryRuleEnvironmentVariable"
    // InternalLcDsl.g:1319:1: entryRuleEnvironmentVariable returns [EObject current=null] : iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF ;
    public final EObject entryRuleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariable = null;


        try {
            // InternalLcDsl.g:1319:60: (iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF )
            // InternalLcDsl.g:1320:2: iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentVariable=ruleEnvironmentVariable();

            state._fsp--;

             current =iv_ruleEnvironmentVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironmentVariable"


    // $ANTLR start "ruleEnvironmentVariable"
    // InternalLcDsl.g:1326:1: ruleEnvironmentVariable returns [EObject current=null] : ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' ) ;
    public final EObject ruleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_EQ_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1332:2: ( ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:1333:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:1333:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' )
            // InternalLcDsl.g:1334:3: () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:1334:3: ()
            // InternalLcDsl.g:1335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentVariableAccess().getEnvironmentVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentVariableAccess().getEnvironmentKeyword_1());
            		
            // InternalLcDsl.g:1345:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLcDsl.g:1346:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLcDsl.g:1346:4: (lv_name_2_0= RULE_ID )
            // InternalLcDsl.g:1347:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnvironmentVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.wamas.ide.launching.LcDsl.ID");
            				

            }


            }

            this_EQ_3=(Token)match(input,RULE_EQ,FOLLOW_11); 

            			newLeafNode(this_EQ_3, grammarAccess.getEnvironmentVariableAccess().getEQTerminalRuleCall_3());
            		
            // InternalLcDsl.g:1367:3: ( (lv_value_4_0= ruleStringWithVariables ) )
            // InternalLcDsl.g:1368:4: (lv_value_4_0= ruleStringWithVariables )
            {
            // InternalLcDsl.g:1368:4: (lv_value_4_0= ruleStringWithVariables )
            // InternalLcDsl.g:1369:5: lv_value_4_0= ruleStringWithVariables
            {

            					newCompositeNode(grammarAccess.getEnvironmentVariableAccess().getValueStringWithVariablesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_value_4_0=ruleStringWithVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentVariableRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"com.wamas.ide.launching.LcDsl.StringWithVariables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEnvironmentVariableAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironmentVariable"


    // $ANTLR start "entryRuleApplicationExtPoint"
    // InternalLcDsl.g:1394:1: entryRuleApplicationExtPoint returns [EObject current=null] : iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF ;
    public final EObject entryRuleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationExtPoint = null;


        try {
            // InternalLcDsl.g:1394:60: (iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF )
            // InternalLcDsl.g:1395:2: iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF
            {
             newCompositeNode(grammarAccess.getApplicationExtPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationExtPoint=ruleApplicationExtPoint();

            state._fsp--;

             current =iv_ruleApplicationExtPoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationExtPoint"


    // $ANTLR start "ruleApplicationExtPoint"
    // InternalLcDsl.g:1401:1: ruleApplicationExtPoint returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1407:2: ( (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1408:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1408:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1409:3: otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationExtPointAccess().getApplicationKeyword_0());
            		
            // InternalLcDsl.g:1413:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1414:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1414:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1415:5: lv_name_1_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getApplicationExtPointAccess().getNameFQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleFQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationExtPointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.wamas.ide.launching.LcDsl.FQName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationExtPointAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationExtPoint"


    // $ANTLR start "entryRuleProductExtPoint"
    // InternalLcDsl.g:1440:1: entryRuleProductExtPoint returns [EObject current=null] : iv_ruleProductExtPoint= ruleProductExtPoint EOF ;
    public final EObject entryRuleProductExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductExtPoint = null;


        try {
            // InternalLcDsl.g:1440:56: (iv_ruleProductExtPoint= ruleProductExtPoint EOF )
            // InternalLcDsl.g:1441:2: iv_ruleProductExtPoint= ruleProductExtPoint EOF
            {
             newCompositeNode(grammarAccess.getProductExtPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductExtPoint=ruleProductExtPoint();

            state._fsp--;

             current =iv_ruleProductExtPoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductExtPoint"


    // $ANTLR start "ruleProductExtPoint"
    // InternalLcDsl.g:1447:1: ruleProductExtPoint returns [EObject current=null] : (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleProductExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1453:2: ( (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1454:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1454:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1455:3: otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProductExtPointAccess().getProductKeyword_0());
            		
            // InternalLcDsl.g:1459:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1460:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1460:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1461:5: lv_name_1_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getProductExtPointAccess().getNameFQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleFQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductExtPointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.wamas.ide.launching.LcDsl.FQName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProductExtPointAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductExtPoint"


    // $ANTLR start "entryRuleFavorites"
    // InternalLcDsl.g:1486:1: entryRuleFavorites returns [EObject current=null] : iv_ruleFavorites= ruleFavorites EOF ;
    public final EObject entryRuleFavorites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFavorites = null;


        try {
            // InternalLcDsl.g:1486:50: (iv_ruleFavorites= ruleFavorites EOF )
            // InternalLcDsl.g:1487:2: iv_ruleFavorites= ruleFavorites EOF
            {
             newCompositeNode(grammarAccess.getFavoritesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFavorites=ruleFavorites();

            state._fsp--;

             current =iv_ruleFavorites; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFavorites"


    // $ANTLR start "ruleFavorites"
    // InternalLcDsl.g:1493:1: ruleFavorites returns [EObject current=null] : ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' ) ;
    public final EObject ruleFavorites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1499:2: ( ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1500:2: ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1500:2: ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1501:3: () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1501:3: ()
            // InternalLcDsl.g:1502:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFavoritesAccess().getFavoritesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFavoritesAccess().getFavoriteKeyword_1());
            		
            // InternalLcDsl.g:1512:3: ( (lv_types_2_0= ruleLaunchModeType ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=79 && LA8_0<=83)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLcDsl.g:1513:4: (lv_types_2_0= ruleLaunchModeType )
            	    {
            	    // InternalLcDsl.g:1513:4: (lv_types_2_0= ruleLaunchModeType )
            	    // InternalLcDsl.g:1514:5: lv_types_2_0= ruleLaunchModeType
            	    {

            	    					newCompositeNode(grammarAccess.getFavoritesAccess().getTypesLaunchModeTypeEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_types_2_0=ruleLaunchModeType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFavoritesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_2_0,
            	    						"com.wamas.ide.launching.LcDsl.LaunchModeType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFavoritesAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFavorites"


    // $ANTLR start "entryRuleRedirect"
    // InternalLcDsl.g:1539:1: entryRuleRedirect returns [EObject current=null] : iv_ruleRedirect= ruleRedirect EOF ;
    public final EObject entryRuleRedirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirect = null;


        try {
            // InternalLcDsl.g:1539:49: (iv_ruleRedirect= ruleRedirect EOF )
            // InternalLcDsl.g:1540:2: iv_ruleRedirect= ruleRedirect EOF
            {
             newCompositeNode(grammarAccess.getRedirectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedirect=ruleRedirect();

            state._fsp--;

             current =iv_ruleRedirect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRedirect"


    // $ANTLR start "ruleRedirect"
    // InternalLcDsl.g:1546:1: ruleRedirect returns [EObject current=null] : ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' ) ;
    public final EObject ruleRedirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_outWhich_3_0 = null;

        EObject lv_outFile_5_0 = null;

        Enumerator lv_inWhich_6_0 = null;

        EObject lv_inFile_8_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1552:2: ( ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' ) )
            // InternalLcDsl.g:1553:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' )
            {
            // InternalLcDsl.g:1553:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' )
            // InternalLcDsl.g:1554:3: () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';'
            {
            // InternalLcDsl.g:1554:3: ()
            // InternalLcDsl.g:1555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRedirectAccess().getRedirectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRedirectAccess().getRedirectKeyword_1());
            		
            // InternalLcDsl.g:1565:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1566:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1566:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1567:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1570:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* )
            // InternalLcDsl.g:1571:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1571:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( LA9_0 >= 92 && LA9_0 <= 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLcDsl.g:1572:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1572:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) )
            	    // InternalLcDsl.g:1573:5: {...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1573:105: ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) )
            	    // InternalLcDsl.g:1574:6: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1577:9: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) )
            	    // InternalLcDsl.g:1577:10: {...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:1577:19: ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) )
            	    // InternalLcDsl.g:1577:20: ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) )
            	    {
            	    // InternalLcDsl.g:1577:20: ( (lv_outWhich_3_0= ruleOutputStream ) )
            	    // InternalLcDsl.g:1578:10: (lv_outWhich_3_0= ruleOutputStream )
            	    {
            	    // InternalLcDsl.g:1578:10: (lv_outWhich_3_0= ruleOutputStream )
            	    // InternalLcDsl.g:1579:11: lv_outWhich_3_0= ruleOutputStream
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getOutWhichOutputStreamEnumRuleCall_2_0_0_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_outWhich_3_0=ruleOutputStream();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRedirectRule());
            	    											}
            	    											set(
            	    												current,
            	    												"outWhich",
            	    												lv_outWhich_3_0,
            	    												"com.wamas.ide.launching.LcDsl.OutputStream");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_4=(Token)match(input,41,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getRedirectAccess().getToKeyword_2_0_1());
            	    								
            	    // InternalLcDsl.g:1600:9: ( (lv_outFile_5_0= ruleAnyPath ) )
            	    // InternalLcDsl.g:1601:10: (lv_outFile_5_0= ruleAnyPath )
            	    {
            	    // InternalLcDsl.g:1601:10: (lv_outFile_5_0= ruleAnyPath )
            	    // InternalLcDsl.g:1602:11: lv_outFile_5_0= ruleAnyPath
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getOutFileAnyPathParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
            	    lv_outFile_5_0=ruleAnyPath();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRedirectRule());
            	    											}
            	    											set(
            	    												current,
            	    												"outFile",
            	    												lv_outFile_5_0,
            	    												"com.wamas.ide.launching.LcDsl.AnyPath");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:1625:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1625:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) )
            	    // InternalLcDsl.g:1626:5: {...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:1626:105: ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) )
            	    // InternalLcDsl.g:1627:6: ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:1630:9: ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) )
            	    // InternalLcDsl.g:1630:10: {...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:1630:19: ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) )
            	    // InternalLcDsl.g:1630:20: ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) )
            	    {
            	    // InternalLcDsl.g:1630:20: ( (lv_inWhich_6_0= ruleInputStream ) )
            	    // InternalLcDsl.g:1631:10: (lv_inWhich_6_0= ruleInputStream )
            	    {
            	    // InternalLcDsl.g:1631:10: (lv_inWhich_6_0= ruleInputStream )
            	    // InternalLcDsl.g:1632:11: lv_inWhich_6_0= ruleInputStream
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getInWhichInputStreamEnumRuleCall_2_1_0_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_inWhich_6_0=ruleInputStream();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRedirectRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inWhich",
            	    												lv_inWhich_6_0,
            	    												"com.wamas.ide.launching.LcDsl.InputStream");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_7=(Token)match(input,42,FOLLOW_11); 

            	    									newLeafNode(otherlv_7, grammarAccess.getRedirectAccess().getFromKeyword_2_1_1());
            	    								
            	    // InternalLcDsl.g:1653:9: ( (lv_inFile_8_0= ruleExistingPath ) )
            	    // InternalLcDsl.g:1654:10: (lv_inFile_8_0= ruleExistingPath )
            	    {
            	    // InternalLcDsl.g:1654:10: (lv_inFile_8_0= ruleExistingPath )
            	    // InternalLcDsl.g:1655:11: lv_inFile_8_0= ruleExistingPath
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getInFileExistingPathParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
            	    lv_inFile_8_0=ruleExistingPath();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRedirectRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inFile",
            	    												lv_inFile_8_0,
            	    												"com.wamas.ide.launching.LcDsl.ExistingPath");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            				

            }

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRedirectAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRedirect"


    // $ANTLR start "entryRuleExecutionEnvironment"
    // InternalLcDsl.g:1693:1: entryRuleExecutionEnvironment returns [EObject current=null] : iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF ;
    public final EObject entryRuleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionEnvironment = null;


        try {
            // InternalLcDsl.g:1693:61: (iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF )
            // InternalLcDsl.g:1694:2: iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF
            {
             newCompositeNode(grammarAccess.getExecutionEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutionEnvironment=ruleExecutionEnvironment();

            state._fsp--;

             current =iv_ruleExecutionEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExecutionEnvironment"


    // $ANTLR start "ruleExecutionEnvironment"
    // InternalLcDsl.g:1700:1: ruleExecutionEnvironment returns [EObject current=null] : (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1706:2: ( (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1707:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1707:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1708:3: otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExecutionEnvironmentAccess().getExecutionEnvironmentKeyword_0());
            		
            // InternalLcDsl.g:1712:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLcDsl.g:1713:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLcDsl.g:1713:4: (lv_name_1_0= RULE_ID )
            // InternalLcDsl.g:1714:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExecutionEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionEnvironmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.wamas.ide.launching.LcDsl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExecutionEnvironmentAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecutionEnvironment"


    // $ANTLR start "entryRuleConfigIniTemplate"
    // InternalLcDsl.g:1738:1: entryRuleConfigIniTemplate returns [EObject current=null] : iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF ;
    public final EObject entryRuleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigIniTemplate = null;


        try {
            // InternalLcDsl.g:1738:58: (iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF )
            // InternalLcDsl.g:1739:2: iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF
            {
             newCompositeNode(grammarAccess.getConfigIniTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigIniTemplate=ruleConfigIniTemplate();

            state._fsp--;

             current =iv_ruleConfigIniTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigIniTemplate"


    // $ANTLR start "ruleConfigIniTemplate"
    // InternalLcDsl.g:1745:1: ruleConfigIniTemplate returns [EObject current=null] : (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1751:2: ( (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1752:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1752:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1753:3: otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigIniTemplateAccess().getConfigIniTemplateKeyword_0());
            		
            // InternalLcDsl.g:1757:3: ( (lv_path_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:1758:4: (lv_path_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:1758:4: (lv_path_1_0= ruleExistingPath )
            // InternalLcDsl.g:1759:5: lv_path_1_0= ruleExistingPath
            {

            					newCompositeNode(grammarAccess.getConfigIniTemplateAccess().getPathExistingPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_path_1_0=ruleExistingPath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigIniTemplateRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_1_0,
            						"com.wamas.ide.launching.LcDsl.ExistingPath");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigIniTemplateAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigIniTemplate"


    // $ANTLR start "entryRuleTraceEnablement"
    // InternalLcDsl.g:1784:1: entryRuleTraceEnablement returns [EObject current=null] : iv_ruleTraceEnablement= ruleTraceEnablement EOF ;
    public final EObject entryRuleTraceEnablement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceEnablement = null;


        try {
            // InternalLcDsl.g:1784:56: (iv_ruleTraceEnablement= ruleTraceEnablement EOF )
            // InternalLcDsl.g:1785:2: iv_ruleTraceEnablement= ruleTraceEnablement EOF
            {
             newCompositeNode(grammarAccess.getTraceEnablementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraceEnablement=ruleTraceEnablement();

            state._fsp--;

             current =iv_ruleTraceEnablement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceEnablement"


    // $ANTLR start "ruleTraceEnablement"
    // InternalLcDsl.g:1791:1: ruleTraceEnablement returns [EObject current=null] : (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' ) ;
    public final EObject ruleTraceEnablement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_what_2_0=null;
        Token otherlv_3=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1797:2: ( (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1798:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1798:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1799:3: otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceEnablementAccess().getTraceKeyword_0());
            		
            // InternalLcDsl.g:1803:3: ( (lv_plugin_1_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:1804:4: (lv_plugin_1_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:1804:4: (lv_plugin_1_0= rulePluginWithVersion )
            // InternalLcDsl.g:1805:5: lv_plugin_1_0= rulePluginWithVersion
            {

            					newCompositeNode(grammarAccess.getTraceEnablementAccess().getPluginPluginWithVersionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_plugin_1_0=rulePluginWithVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceEnablementRule());
            					}
            					set(
            						current,
            						"plugin",
            						lv_plugin_1_0,
            						"com.wamas.ide.launching.LcDsl.PluginWithVersion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:1822:3: ( (lv_what_2_0= RULE_ID ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLcDsl.g:1823:4: (lv_what_2_0= RULE_ID )
            	    {
            	    // InternalLcDsl.g:1823:4: (lv_what_2_0= RULE_ID )
            	    // InternalLcDsl.g:1824:5: lv_what_2_0= RULE_ID
            	    {
            	    lv_what_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    					newLeafNode(lv_what_2_0, grammarAccess.getTraceEnablementAccess().getWhatIDTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTraceEnablementRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"what",
            	    						lv_what_2_0,
            	    						"com.wamas.ide.launching.LcDsl.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTraceEnablementAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceEnablement"


    // $ANTLR start "entryRuleJavaMainSearch"
    // InternalLcDsl.g:1848:1: entryRuleJavaMainSearch returns [EObject current=null] : iv_ruleJavaMainSearch= ruleJavaMainSearch EOF ;
    public final EObject entryRuleJavaMainSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaMainSearch = null;


        try {
            // InternalLcDsl.g:1848:55: (iv_ruleJavaMainSearch= ruleJavaMainSearch EOF )
            // InternalLcDsl.g:1849:2: iv_ruleJavaMainSearch= ruleJavaMainSearch EOF
            {
             newCompositeNode(grammarAccess.getJavaMainSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaMainSearch=ruleJavaMainSearch();

            state._fsp--;

             current =iv_ruleJavaMainSearch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaMainSearch"


    // $ANTLR start "ruleJavaMainSearch"
    // InternalLcDsl.g:1855:1: ruleJavaMainSearch returns [EObject current=null] : ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleJavaMainSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_system_3_0=null;
        Token lv_inherited_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1861:2: ( ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:1862:2: ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:1862:2: ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            // InternalLcDsl.g:1863:3: () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:1863:3: ()
            // InternalLcDsl.g:1864:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaMainSearchAccess().getJavaMainSearchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaMainSearchAccess().getSearchMainKeyword_1());
            		
            // InternalLcDsl.g:1874:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1875:4: ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1875:4: ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1876:5: ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1879:5: ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* )
            // InternalLcDsl.g:1880:6: ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1880:6: ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLcDsl.g:1881:4: ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1881:4: ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) )
            	    // InternalLcDsl.g:1882:5: {...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1882:111: ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) )
            	    // InternalLcDsl.g:1883:6: ({...}? => ( (lv_system_3_0= 'system' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1886:9: ({...}? => ( (lv_system_3_0= 'system' ) ) )
            	    // InternalLcDsl.g:1886:10: {...}? => ( (lv_system_3_0= 'system' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "true");
            	    }
            	    // InternalLcDsl.g:1886:19: ( (lv_system_3_0= 'system' ) )
            	    // InternalLcDsl.g:1886:20: (lv_system_3_0= 'system' )
            	    {
            	    // InternalLcDsl.g:1886:20: (lv_system_3_0= 'system' )
            	    // InternalLcDsl.g:1887:10: lv_system_3_0= 'system'
            	    {
            	    lv_system_3_0=(Token)match(input,47,FOLLOW_20); 

            	    										newLeafNode(lv_system_3_0, grammarAccess.getJavaMainSearchAccess().getSystemSystemKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getJavaMainSearchRule());
            	    										}
            	    										setWithLastConsumed(current, "system", true, "system");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:1904:4: ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1904:4: ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) )
            	    // InternalLcDsl.g:1905:5: {...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:1905:111: ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) )
            	    // InternalLcDsl.g:1906:6: ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:1909:9: ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) )
            	    // InternalLcDsl.g:1909:10: {...}? => ( (lv_inherited_4_0= 'inherited' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "true");
            	    }
            	    // InternalLcDsl.g:1909:19: ( (lv_inherited_4_0= 'inherited' ) )
            	    // InternalLcDsl.g:1909:20: (lv_inherited_4_0= 'inherited' )
            	    {
            	    // InternalLcDsl.g:1909:20: (lv_inherited_4_0= 'inherited' )
            	    // InternalLcDsl.g:1910:10: lv_inherited_4_0= 'inherited'
            	    {
            	    lv_inherited_4_0=(Token)match(input,48,FOLLOW_20); 

            	    										newLeafNode(lv_inherited_4_0, grammarAccess.getJavaMainSearchAccess().getInheritedInheritedKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getJavaMainSearchRule());
            	    										}
            	    										setWithLastConsumed(current, "inherited", true, "inherited");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            				

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJavaMainSearchAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaMainSearch"


    // $ANTLR start "entryRuleRapServletConfig"
    // InternalLcDsl.g:1942:1: entryRuleRapServletConfig returns [EObject current=null] : iv_ruleRapServletConfig= ruleRapServletConfig EOF ;
    public final EObject entryRuleRapServletConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRapServletConfig = null;


        try {
            // InternalLcDsl.g:1942:57: (iv_ruleRapServletConfig= ruleRapServletConfig EOF )
            // InternalLcDsl.g:1943:2: iv_ruleRapServletConfig= ruleRapServletConfig EOF
            {
             newCompositeNode(grammarAccess.getRapServletConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRapServletConfig=ruleRapServletConfig();

            state._fsp--;

             current =iv_ruleRapServletConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRapServletConfig"


    // $ANTLR start "ruleRapServletConfig"
    // InternalLcDsl.g:1949:1: ruleRapServletConfig returns [EObject current=null] : (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END ) ;
    public final EObject ruleRapServletConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BLOCK_BEGIN_1=null;
        Token otherlv_3=null;
        Token lv_servletPath_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_serverPort_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_sessionTimeout_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_contextPath_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_devMode_19_0=null;
        Token otherlv_20=null;
        Token this_BLOCK_END_21=null;
        Enumerator lv_browserMode_7_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1955:2: ( (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END ) )
            // InternalLcDsl.g:1956:2: (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END )
            {
            // InternalLcDsl.g:1956:2: (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END )
            // InternalLcDsl.g:1957:3: otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END
            {
            otherlv_0=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRapServletConfigAccess().getServletKeyword_0());
            		
            this_BLOCK_BEGIN_1=(Token)match(input,RULE_BLOCK_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BLOCK_BEGIN_1, grammarAccess.getRapServletConfigAccess().getBLOCK_BEGINTerminalRuleCall_1());
            		
            // InternalLcDsl.g:1965:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // InternalLcDsl.g:1966:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalLcDsl.g:1966:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // InternalLcDsl.g:1967:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1970:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            // InternalLcDsl.g:1971:6: ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // InternalLcDsl.g:1971:6: ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=7;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3) ) {
                    alt12=4;
                }
                else if ( LA12_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4) ) {
                    alt12=5;
                }
                else if ( LA12_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5) ) {
                    alt12=6;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLcDsl.g:1972:4: ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:1972:4: ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    // InternalLcDsl.g:1973:5: {...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1973:113: ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    // InternalLcDsl.g:1974:6: ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1977:9: ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    // InternalLcDsl.g:1977:10: {...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:1977:19: (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    // InternalLcDsl.g:1977:20: otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,50,FOLLOW_11); 

            	    									newLeafNode(otherlv_3, grammarAccess.getRapServletConfigAccess().getPathKeyword_2_0_0());
            	    								
            	    // InternalLcDsl.g:1981:9: ( (lv_servletPath_4_0= RULE_STRING ) )
            	    // InternalLcDsl.g:1982:10: (lv_servletPath_4_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:1982:10: (lv_servletPath_4_0= RULE_STRING )
            	    // InternalLcDsl.g:1983:11: lv_servletPath_4_0= RULE_STRING
            	    {
            	    lv_servletPath_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    											newLeafNode(lv_servletPath_4_0, grammarAccess.getRapServletConfigAccess().getServletPathSTRINGTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getRapServletConfigRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"servletPath",
            	    												lv_servletPath_4_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_5=(Token)match(input,28,FOLLOW_22); 

            	    									newLeafNode(otherlv_5, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2009:4: ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2009:4: ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) )
            	    // InternalLcDsl.g:2010:5: {...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2010:113: ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) )
            	    // InternalLcDsl.g:2011:6: ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2014:9: ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) )
            	    // InternalLcDsl.g:2014:10: {...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2014:19: (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' )
            	    // InternalLcDsl.g:2014:20: otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';'
            	    {
            	    otherlv_6=(Token)match(input,51,FOLLOW_23); 

            	    									newLeafNode(otherlv_6, grammarAccess.getRapServletConfigAccess().getBrowserKeyword_2_1_0());
            	    								
            	    // InternalLcDsl.g:2018:9: ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) )
            	    // InternalLcDsl.g:2019:10: (lv_browserMode_7_0= ruleBrowserLaunchMode )
            	    {
            	    // InternalLcDsl.g:2019:10: (lv_browserMode_7_0= ruleBrowserLaunchMode )
            	    // InternalLcDsl.g:2020:11: lv_browserMode_7_0= ruleBrowserLaunchMode
            	    {

            	    											newCompositeNode(grammarAccess.getRapServletConfigAccess().getBrowserModeBrowserLaunchModeEnumRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_browserMode_7_0=ruleBrowserLaunchMode();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRapServletConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"browserMode",
            	    												lv_browserMode_7_0,
            	    												"com.wamas.ide.launching.LcDsl.BrowserLaunchMode");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,28,FOLLOW_22); 

            	    									newLeafNode(otherlv_8, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:2047:4: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2047:4: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // InternalLcDsl.g:2048:5: {...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLcDsl.g:2048:113: ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // InternalLcDsl.g:2049:6: ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLcDsl.g:2052:9: ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // InternalLcDsl.g:2052:10: {...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2052:19: (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // InternalLcDsl.g:2052:20: otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_9=(Token)match(input,52,FOLLOW_24); 

            	    									newLeafNode(otherlv_9, grammarAccess.getRapServletConfigAccess().getPortKeyword_2_2_0());
            	    								
            	    // InternalLcDsl.g:2056:9: ( (lv_serverPort_10_0= RULE_INT ) )
            	    // InternalLcDsl.g:2057:10: (lv_serverPort_10_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2057:10: (lv_serverPort_10_0= RULE_INT )
            	    // InternalLcDsl.g:2058:11: lv_serverPort_10_0= RULE_INT
            	    {
            	    lv_serverPort_10_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            	    											newLeafNode(lv_serverPort_10_0, grammarAccess.getRapServletConfigAccess().getServerPortINTTerminalRuleCall_2_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getRapServletConfigRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"serverPort",
            	    												lv_serverPort_10_0,
            	    												"com.wamas.ide.launching.LcDsl.INT");
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,28,FOLLOW_22); 

            	    									newLeafNode(otherlv_11, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:2084:4: ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2084:4: ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    // InternalLcDsl.g:2085:5: {...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalLcDsl.g:2085:113: ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    // InternalLcDsl.g:2086:6: ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalLcDsl.g:2089:9: ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    // InternalLcDsl.g:2089:10: {...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2089:19: (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    // InternalLcDsl.g:2089:20: otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';'
            	    {
            	    otherlv_12=(Token)match(input,53,FOLLOW_24); 

            	    									newLeafNode(otherlv_12, grammarAccess.getRapServletConfigAccess().getSessionTimeoutKeyword_2_3_0());
            	    								
            	    // InternalLcDsl.g:2093:9: ( (lv_sessionTimeout_13_0= RULE_INT ) )
            	    // InternalLcDsl.g:2094:10: (lv_sessionTimeout_13_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2094:10: (lv_sessionTimeout_13_0= RULE_INT )
            	    // InternalLcDsl.g:2095:11: lv_sessionTimeout_13_0= RULE_INT
            	    {
            	    lv_sessionTimeout_13_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            	    											newLeafNode(lv_sessionTimeout_13_0, grammarAccess.getRapServletConfigAccess().getSessionTimeoutINTTerminalRuleCall_2_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getRapServletConfigRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"sessionTimeout",
            	    												lv_sessionTimeout_13_0,
            	    												"com.wamas.ide.launching.LcDsl.INT");
            	    										

            	    }


            	    }

            	    otherlv_14=(Token)match(input,28,FOLLOW_22); 

            	    									newLeafNode(otherlv_14, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:2121:4: ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2121:4: ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    // InternalLcDsl.g:2122:5: {...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalLcDsl.g:2122:113: ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    // InternalLcDsl.g:2123:6: ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalLcDsl.g:2126:9: ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    // InternalLcDsl.g:2126:10: {...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2126:19: (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    // InternalLcDsl.g:2126:20: otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';'
            	    {
            	    otherlv_15=(Token)match(input,54,FOLLOW_11); 

            	    									newLeafNode(otherlv_15, grammarAccess.getRapServletConfigAccess().getContextPathKeyword_2_4_0());
            	    								
            	    // InternalLcDsl.g:2130:9: ( (lv_contextPath_16_0= RULE_STRING ) )
            	    // InternalLcDsl.g:2131:10: (lv_contextPath_16_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:2131:10: (lv_contextPath_16_0= RULE_STRING )
            	    // InternalLcDsl.g:2132:11: lv_contextPath_16_0= RULE_STRING
            	    {
            	    lv_contextPath_16_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    											newLeafNode(lv_contextPath_16_0, grammarAccess.getRapServletConfigAccess().getContextPathSTRINGTerminalRuleCall_2_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getRapServletConfigRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"contextPath",
            	    												lv_contextPath_16_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_17=(Token)match(input,28,FOLLOW_22); 

            	    									newLeafNode(otherlv_17, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:2158:4: ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2158:4: ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) )
            	    // InternalLcDsl.g:2159:5: {...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalLcDsl.g:2159:113: ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) )
            	    // InternalLcDsl.g:2160:6: ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalLcDsl.g:2163:9: ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) )
            	    // InternalLcDsl.g:2163:10: {...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2163:19: (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' )
            	    // InternalLcDsl.g:2163:20: otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';'
            	    {
            	    otherlv_18=(Token)match(input,55,FOLLOW_25); 

            	    									newLeafNode(otherlv_18, grammarAccess.getRapServletConfigAccess().getDevModeKeyword_2_5_0());
            	    								
            	    // InternalLcDsl.g:2167:9: ( (lv_devMode_19_0= RULE_BOOLEAN ) )
            	    // InternalLcDsl.g:2168:10: (lv_devMode_19_0= RULE_BOOLEAN )
            	    {
            	    // InternalLcDsl.g:2168:10: (lv_devMode_19_0= RULE_BOOLEAN )
            	    // InternalLcDsl.g:2169:11: lv_devMode_19_0= RULE_BOOLEAN
            	    {
            	    lv_devMode_19_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_12); 

            	    											newLeafNode(lv_devMode_19_0, grammarAccess.getRapServletConfigAccess().getDevModeBOOLEANTerminalRuleCall_2_5_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getRapServletConfigRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"devMode",
            	    												lv_devMode_19_0,
            	    												"com.wamas.ide.launching.LcDsl.BOOLEAN");
            	    										

            	    }


            	    }

            	    otherlv_20=(Token)match(input,28,FOLLOW_22); 

            	    									newLeafNode(otherlv_20, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_5_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canLeave(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            				

            }

            this_BLOCK_END_21=(Token)match(input,RULE_BLOCK_END,FOLLOW_2); 

            			newLeafNode(this_BLOCK_END_21, grammarAccess.getRapServletConfigAccess().getBLOCK_ENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRapServletConfig"


    // $ANTLR start "entryRuleExistingPath"
    // InternalLcDsl.g:2211:1: entryRuleExistingPath returns [EObject current=null] : iv_ruleExistingPath= ruleExistingPath EOF ;
    public final EObject entryRuleExistingPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingPath = null;


        try {
            // InternalLcDsl.g:2211:53: (iv_ruleExistingPath= ruleExistingPath EOF )
            // InternalLcDsl.g:2212:2: iv_ruleExistingPath= ruleExistingPath EOF
            {
             newCompositeNode(grammarAccess.getExistingPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistingPath=ruleExistingPath();

            state._fsp--;

             current =iv_ruleExistingPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistingPath"


    // $ANTLR start "ruleExistingPath"
    // InternalLcDsl.g:2218:1: ruleExistingPath returns [EObject current=null] : ( (lv_name_0_0= ruleStringWithVariables ) ) ;
    public final EObject ruleExistingPath() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2224:2: ( ( (lv_name_0_0= ruleStringWithVariables ) ) )
            // InternalLcDsl.g:2225:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            {
            // InternalLcDsl.g:2225:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            // InternalLcDsl.g:2226:3: (lv_name_0_0= ruleStringWithVariables )
            {
            // InternalLcDsl.g:2226:3: (lv_name_0_0= ruleStringWithVariables )
            // InternalLcDsl.g:2227:4: lv_name_0_0= ruleStringWithVariables
            {

            				newCompositeNode(grammarAccess.getExistingPathAccess().getNameStringWithVariablesParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleStringWithVariables();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExistingPathRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"com.wamas.ide.launching.LcDsl.StringWithVariables");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistingPath"


    // $ANTLR start "entryRuleAnyPath"
    // InternalLcDsl.g:2247:1: entryRuleAnyPath returns [EObject current=null] : iv_ruleAnyPath= ruleAnyPath EOF ;
    public final EObject entryRuleAnyPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyPath = null;


        try {
            // InternalLcDsl.g:2247:48: (iv_ruleAnyPath= ruleAnyPath EOF )
            // InternalLcDsl.g:2248:2: iv_ruleAnyPath= ruleAnyPath EOF
            {
             newCompositeNode(grammarAccess.getAnyPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyPath=ruleAnyPath();

            state._fsp--;

             current =iv_ruleAnyPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyPath"


    // $ANTLR start "ruleAnyPath"
    // InternalLcDsl.g:2254:1: ruleAnyPath returns [EObject current=null] : ( (lv_name_0_0= ruleStringWithVariables ) ) ;
    public final EObject ruleAnyPath() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2260:2: ( ( (lv_name_0_0= ruleStringWithVariables ) ) )
            // InternalLcDsl.g:2261:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            {
            // InternalLcDsl.g:2261:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            // InternalLcDsl.g:2262:3: (lv_name_0_0= ruleStringWithVariables )
            {
            // InternalLcDsl.g:2262:3: (lv_name_0_0= ruleStringWithVariables )
            // InternalLcDsl.g:2263:4: lv_name_0_0= ruleStringWithVariables
            {

            				newCompositeNode(grammarAccess.getAnyPathAccess().getNameStringWithVariablesParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleStringWithVariables();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAnyPathRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"com.wamas.ide.launching.LcDsl.StringWithVariables");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyPath"


    // $ANTLR start "entryRulePluginWithVersionAndStartLevel"
    // InternalLcDsl.g:2283:1: entryRulePluginWithVersionAndStartLevel returns [EObject current=null] : iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF ;
    public final EObject entryRulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersionAndStartLevel = null;


        try {
            // InternalLcDsl.g:2283:71: (iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF )
            // InternalLcDsl.g:2284:2: iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF
            {
             newCompositeNode(grammarAccess.getPluginWithVersionAndStartLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePluginWithVersionAndStartLevel=rulePluginWithVersionAndStartLevel();

            state._fsp--;

             current =iv_rulePluginWithVersionAndStartLevel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginWithVersionAndStartLevel"


    // $ANTLR start "rulePluginWithVersionAndStartLevel"
    // InternalLcDsl.g:2290:1: rulePluginWithVersionAndStartLevel returns [EObject current=null] : ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject rulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        Token lv_autoStart_2_0=null;
        Token otherlv_3=null;
        Token lv_startLevel_4_0=null;
        EObject lv_plugin_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2296:2: ( ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalLcDsl.g:2297:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalLcDsl.g:2297:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalLcDsl.g:2298:3: ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            // InternalLcDsl.g:2298:3: ( (lv_plugin_0_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:2299:4: (lv_plugin_0_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:2299:4: (lv_plugin_0_0= rulePluginWithVersion )
            // InternalLcDsl.g:2300:5: lv_plugin_0_0= rulePluginWithVersion
            {

            					newCompositeNode(grammarAccess.getPluginWithVersionAndStartLevelAccess().getPluginPluginWithVersionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_plugin_0_0=rulePluginWithVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPluginWithVersionAndStartLevelRule());
            					}
            					set(
            						current,
            						"plugin",
            						lv_plugin_0_0,
            						"com.wamas.ide.launching.LcDsl.PluginWithVersion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:2317:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2318:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2318:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2319:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            				
            // InternalLcDsl.g:2322:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalLcDsl.g:2323:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2323:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLcDsl.g:2324:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2324:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    // InternalLcDsl.g:2325:5: {...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalLcDsl.g:2325:127: ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    // InternalLcDsl.g:2326:6: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalLcDsl.g:2329:9: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    // InternalLcDsl.g:2329:10: {...}? => ( (lv_autoStart_2_0= 'autostart' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:2329:19: ( (lv_autoStart_2_0= 'autostart' ) )
            	    // InternalLcDsl.g:2329:20: (lv_autoStart_2_0= 'autostart' )
            	    {
            	    // InternalLcDsl.g:2329:20: (lv_autoStart_2_0= 'autostart' )
            	    // InternalLcDsl.g:2330:10: lv_autoStart_2_0= 'autostart'
            	    {
            	    lv_autoStart_2_0=(Token)match(input,56,FOLLOW_26); 

            	    										newLeafNode(lv_autoStart_2_0, grammarAccess.getPluginWithVersionAndStartLevelAccess().getAutoStartAutostartKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPluginWithVersionAndStartLevelRule());
            	    										}
            	    										setWithLastConsumed(current, "autoStart", true, "autostart");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2347:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2347:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalLcDsl.g:2348:5: {...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalLcDsl.g:2348:127: ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    // InternalLcDsl.g:2349:6: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalLcDsl.g:2352:9: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    // InternalLcDsl.g:2352:10: {...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:2352:19: (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    // InternalLcDsl.g:2352:20: otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,57,FOLLOW_24); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartlevelKeyword_1_1_0());
            	    								
            	    // InternalLcDsl.g:2356:9: ( (lv_startLevel_4_0= RULE_INT ) )
            	    // InternalLcDsl.g:2357:10: (lv_startLevel_4_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2357:10: (lv_startLevel_4_0= RULE_INT )
            	    // InternalLcDsl.g:2358:11: lv_startLevel_4_0= RULE_INT
            	    {
            	    lv_startLevel_4_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            	    											newLeafNode(lv_startLevel_4_0, grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartLevelINTTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPluginWithVersionAndStartLevelRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"startLevel",
            	    												lv_startLevel_4_0,
            	    												"com.wamas.ide.launching.LcDsl.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginWithVersionAndStartLevel"


    // $ANTLR start "entryRulePluginWithVersion"
    // InternalLcDsl.g:2391:1: entryRulePluginWithVersion returns [EObject current=null] : iv_rulePluginWithVersion= rulePluginWithVersion EOF ;
    public final EObject entryRulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersion = null;


        try {
            // InternalLcDsl.g:2391:58: (iv_rulePluginWithVersion= rulePluginWithVersion EOF )
            // InternalLcDsl.g:2392:2: iv_rulePluginWithVersion= rulePluginWithVersion EOF
            {
             newCompositeNode(grammarAccess.getPluginWithVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePluginWithVersion=rulePluginWithVersion();

            state._fsp--;

             current =iv_rulePluginWithVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginWithVersion"


    // $ANTLR start "rulePluginWithVersion"
    // InternalLcDsl.g:2398:1: rulePluginWithVersion returns [EObject current=null] : ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) ;
    public final EObject rulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2404:2: ( ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) )
            // InternalLcDsl.g:2405:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            {
            // InternalLcDsl.g:2405:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            // InternalLcDsl.g:2406:3: ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )?
            {
            // InternalLcDsl.g:2406:3: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2407:4: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2407:4: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2408:5: lv_name_0_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getPluginWithVersionAccess().getNameFQNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_0_0=ruleFQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPluginWithVersionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"com.wamas.ide.launching.LcDsl.FQName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:2425:3: ( (lv_version_1_0= RULE_VERSION ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_VERSION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLcDsl.g:2426:4: (lv_version_1_0= RULE_VERSION )
                    {
                    // InternalLcDsl.g:2426:4: (lv_version_1_0= RULE_VERSION )
                    // InternalLcDsl.g:2427:5: lv_version_1_0= RULE_VERSION
                    {
                    lv_version_1_0=(Token)match(input,RULE_VERSION,FOLLOW_2); 

                    					newLeafNode(lv_version_1_0, grammarAccess.getPluginWithVersionAccess().getVersionVERSIONTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPluginWithVersionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"version",
                    						lv_version_1_0,
                    						"com.wamas.ide.launching.LcDsl.VERSION");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginWithVersion"


    // $ANTLR start "entryRuleProject"
    // InternalLcDsl.g:2447:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalLcDsl.g:2447:48: (iv_ruleProject= ruleProject EOF )
            // InternalLcDsl.g:2448:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalLcDsl.g:2454:1: ruleProject returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2460:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:2461:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:2461:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2462:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2462:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2463:4: lv_name_0_0= ruleFQName
            {

            				newCompositeNode(grammarAccess.getProjectAccess().getNameFQNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleFQName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getProjectRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"com.wamas.ide.launching.LcDsl.FQName");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleJavaMainType"
    // InternalLcDsl.g:2483:1: entryRuleJavaMainType returns [EObject current=null] : iv_ruleJavaMainType= ruleJavaMainType EOF ;
    public final EObject entryRuleJavaMainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaMainType = null;


        try {
            // InternalLcDsl.g:2483:53: (iv_ruleJavaMainType= ruleJavaMainType EOF )
            // InternalLcDsl.g:2484:2: iv_ruleJavaMainType= ruleJavaMainType EOF
            {
             newCompositeNode(grammarAccess.getJavaMainTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaMainType=ruleJavaMainType();

            state._fsp--;

             current =iv_ruleJavaMainType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaMainType"


    // $ANTLR start "ruleJavaMainType"
    // InternalLcDsl.g:2490:1: ruleJavaMainType returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleJavaMainType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2496:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:2497:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:2497:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2498:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2498:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2499:4: lv_name_0_0= ruleFQName
            {

            				newCompositeNode(grammarAccess.getJavaMainTypeAccess().getNameFQNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleFQName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJavaMainTypeRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"com.wamas.ide.launching.LcDsl.FQName");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaMainType"


    // $ANTLR start "entryRuleClearOption"
    // InternalLcDsl.g:2519:1: entryRuleClearOption returns [EObject current=null] : iv_ruleClearOption= ruleClearOption EOF ;
    public final EObject entryRuleClearOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearOption = null;


        try {
            // InternalLcDsl.g:2519:52: (iv_ruleClearOption= ruleClearOption EOF )
            // InternalLcDsl.g:2520:2: iv_ruleClearOption= ruleClearOption EOF
            {
             newCompositeNode(grammarAccess.getClearOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClearOption=ruleClearOption();

            state._fsp--;

             current =iv_ruleClearOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClearOption"


    // $ANTLR start "ruleClearOption"
    // InternalLcDsl.g:2526:1: ruleClearOption returns [EObject current=null] : ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' ) ;
    public final EObject ruleClearOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_workspace_3_0=null;
        Token lv_log_4_0=null;
        Token lv_noAskClear_5_0=null;
        Token lv_config_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2532:2: ( ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' ) )
            // InternalLcDsl.g:2533:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' )
            {
            // InternalLcDsl.g:2533:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' )
            // InternalLcDsl.g:2534:3: () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';'
            {
            // InternalLcDsl.g:2534:3: ()
            // InternalLcDsl.g:2535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearOptionAccess().getClearOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getClearOptionAccess().getClearKeyword_1());
            		
            // InternalLcDsl.g:2545:3: ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2546:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2546:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2547:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2550:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            // InternalLcDsl.g:2551:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2551:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( ( LA17_0 == 27 || LA17_0 == 59 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLcDsl.g:2552:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    {
            	    // InternalLcDsl.g:2552:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    // InternalLcDsl.g:2553:5: {...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2553:108: ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    // InternalLcDsl.g:2554:6: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2557:9: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    // InternalLcDsl.g:2557:10: {...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:2557:19: ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    // InternalLcDsl.g:2557:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )?
            	    {
            	    // InternalLcDsl.g:2557:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==27) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==59) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalLcDsl.g:2558:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            {
            	            // InternalLcDsl.g:2558:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            // InternalLcDsl.g:2559:11: (lv_workspace_3_0= 'workspace' )
            	            {
            	            // InternalLcDsl.g:2559:11: (lv_workspace_3_0= 'workspace' )
            	            // InternalLcDsl.g:2560:12: lv_workspace_3_0= 'workspace'
            	            {
            	            lv_workspace_3_0=(Token)match(input,27,FOLLOW_29); 

            	            												newLeafNode(lv_workspace_3_0, grammarAccess.getClearOptionAccess().getWorkspaceWorkspaceKeyword_2_0_0_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getClearOptionRule());
            	            												}
            	            												setWithLastConsumed(current, "workspace", true, "workspace");
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLcDsl.g:2573:10: ( (lv_log_4_0= 'log' ) )
            	            {
            	            // InternalLcDsl.g:2573:10: ( (lv_log_4_0= 'log' ) )
            	            // InternalLcDsl.g:2574:11: (lv_log_4_0= 'log' )
            	            {
            	            // InternalLcDsl.g:2574:11: (lv_log_4_0= 'log' )
            	            // InternalLcDsl.g:2575:12: lv_log_4_0= 'log'
            	            {
            	            lv_log_4_0=(Token)match(input,59,FOLLOW_29); 

            	            												newLeafNode(lv_log_4_0, grammarAccess.getClearOptionAccess().getLogLogKeyword_2_0_0_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getClearOptionRule());
            	            												}
            	            												setWithLastConsumed(current, "log", true, "log");
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalLcDsl.g:2588:9: ( (lv_noAskClear_5_0= '!' ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==60) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalLcDsl.g:2589:10: (lv_noAskClear_5_0= '!' )
            	            {
            	            // InternalLcDsl.g:2589:10: (lv_noAskClear_5_0= '!' )
            	            // InternalLcDsl.g:2590:11: lv_noAskClear_5_0= '!'
            	            {
            	            lv_noAskClear_5_0=(Token)match(input,60,FOLLOW_28); 

            	            											newLeafNode(lv_noAskClear_5_0, grammarAccess.getClearOptionAccess().getNoAskClearExclamationMarkKeyword_2_0_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getClearOptionRule());
            	            											}
            	            											setWithLastConsumed(current, "noAskClear", true, "!");
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2608:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2608:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    // InternalLcDsl.g:2609:5: {...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2609:108: ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    // InternalLcDsl.g:2610:6: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2613:9: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    // InternalLcDsl.g:2613:10: {...}? => ( (lv_config_6_0= 'config' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:2613:19: ( (lv_config_6_0= 'config' ) )
            	    // InternalLcDsl.g:2613:20: (lv_config_6_0= 'config' )
            	    {
            	    // InternalLcDsl.g:2613:20: (lv_config_6_0= 'config' )
            	    // InternalLcDsl.g:2614:10: lv_config_6_0= 'config'
            	    {
            	    lv_config_6_0=(Token)match(input,61,FOLLOW_28); 

            	    										newLeafNode(lv_config_6_0, grammarAccess.getClearOptionAccess().getConfigConfigKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getClearOptionRule());
            	    										}
            	    										setWithLastConsumed(current, "config", true, "config");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            				

            }

            otherlv_7=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getClearOptionAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClearOption"


    // $ANTLR start "entryRuleMemoryOption"
    // InternalLcDsl.g:2646:1: entryRuleMemoryOption returns [EObject current=null] : iv_ruleMemoryOption= ruleMemoryOption EOF ;
    public final EObject entryRuleMemoryOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryOption = null;


        try {
            // InternalLcDsl.g:2646:53: (iv_ruleMemoryOption= ruleMemoryOption EOF )
            // InternalLcDsl.g:2647:2: iv_ruleMemoryOption= ruleMemoryOption EOF
            {
             newCompositeNode(grammarAccess.getMemoryOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoryOption=ruleMemoryOption();

            state._fsp--;

             current =iv_ruleMemoryOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemoryOption"


    // $ANTLR start "ruleMemoryOption"
    // InternalLcDsl.g:2653:1: ruleMemoryOption returns [EObject current=null] : ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' ) ;
    public final EObject ruleMemoryOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_EQ_4=null;
        Token lv_min_5_0=null;
        Token otherlv_7=null;
        Token this_EQ_8=null;
        Token lv_max_9_0=null;
        Token otherlv_11=null;
        Token this_EQ_12=null;
        Token lv_perm_13_0=null;
        Token otherlv_15=null;
        Enumerator lv_minUnit_6_0 = null;

        Enumerator lv_maxUnit_10_0 = null;

        Enumerator lv_permUnit_14_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2659:2: ( ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' ) )
            // InternalLcDsl.g:2660:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' )
            {
            // InternalLcDsl.g:2660:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' )
            // InternalLcDsl.g:2661:3: () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';'
            {
            // InternalLcDsl.g:2661:3: ()
            // InternalLcDsl.g:2662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryOptionAccess().getMemoryOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryOptionAccess().getMemoryKeyword_1());
            		
            // InternalLcDsl.g:2672:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2673:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2673:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2674:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2677:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            // InternalLcDsl.g:2678:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2678:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            loop18:
            do {
                int alt18=4;
                int LA18_0 = input.LA(1);

                if ( LA18_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                    alt18=3;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLcDsl.g:2679:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2679:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2680:5: {...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2680:109: ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2681:6: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2684:9: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2684:10: {...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2684:19: (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2684:20: otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_3=(Token)match(input,63,FOLLOW_14); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMemoryOptionAccess().getMinKeyword_2_0_0());
            	    								
            	    this_EQ_4=(Token)match(input,RULE_EQ,FOLLOW_24); 

            	    									newLeafNode(this_EQ_4, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_0_1());
            	    								
            	    // InternalLcDsl.g:2692:9: ( (lv_min_5_0= RULE_INT ) )
            	    // InternalLcDsl.g:2693:10: (lv_min_5_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2693:10: (lv_min_5_0= RULE_INT )
            	    // InternalLcDsl.g:2694:11: lv_min_5_0= RULE_INT
            	    {
            	    lv_min_5_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            	    											newLeafNode(lv_min_5_0, grammarAccess.getMemoryOptionAccess().getMinINTTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMemoryOptionRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"min",
            	    												lv_min_5_0,
            	    												"com.wamas.ide.launching.LcDsl.INT");
            	    										

            	    }


            	    }

            	    // InternalLcDsl.g:2710:9: ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2711:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2711:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2712:11: lv_minUnit_6_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getMinUnitMemoryUnitEnumRuleCall_2_0_3_0());
            	    										
            	    pushFollow(FOLLOW_30);
            	    lv_minUnit_6_0=ruleMemoryUnit();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMemoryOptionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"minUnit",
            	    												lv_minUnit_6_0,
            	    												"com.wamas.ide.launching.LcDsl.MemoryUnit");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2735:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2735:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2736:5: {...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2736:109: ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2737:6: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2740:9: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2740:10: {...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2740:19: (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2740:20: otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_7=(Token)match(input,64,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMemoryOptionAccess().getMaxKeyword_2_1_0());
            	    								
            	    this_EQ_8=(Token)match(input,RULE_EQ,FOLLOW_24); 

            	    									newLeafNode(this_EQ_8, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_1_1());
            	    								
            	    // InternalLcDsl.g:2748:9: ( (lv_max_9_0= RULE_INT ) )
            	    // InternalLcDsl.g:2749:10: (lv_max_9_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2749:10: (lv_max_9_0= RULE_INT )
            	    // InternalLcDsl.g:2750:11: lv_max_9_0= RULE_INT
            	    {
            	    lv_max_9_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            	    											newLeafNode(lv_max_9_0, grammarAccess.getMemoryOptionAccess().getMaxINTTerminalRuleCall_2_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMemoryOptionRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"max",
            	    												lv_max_9_0,
            	    												"com.wamas.ide.launching.LcDsl.INT");
            	    										

            	    }


            	    }

            	    // InternalLcDsl.g:2766:9: ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2767:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2767:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2768:11: lv_maxUnit_10_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getMaxUnitMemoryUnitEnumRuleCall_2_1_3_0());
            	    										
            	    pushFollow(FOLLOW_30);
            	    lv_maxUnit_10_0=ruleMemoryUnit();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMemoryOptionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"maxUnit",
            	    												lv_maxUnit_10_0,
            	    												"com.wamas.ide.launching.LcDsl.MemoryUnit");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:2791:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2791:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2792:5: {...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLcDsl.g:2792:109: ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2793:6: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLcDsl.g:2796:9: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2796:10: {...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2796:19: (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2796:20: otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_11=(Token)match(input,65,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMemoryOptionAccess().getPermKeyword_2_2_0());
            	    								
            	    this_EQ_12=(Token)match(input,RULE_EQ,FOLLOW_24); 

            	    									newLeafNode(this_EQ_12, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_2_1());
            	    								
            	    // InternalLcDsl.g:2804:9: ( (lv_perm_13_0= RULE_INT ) )
            	    // InternalLcDsl.g:2805:10: (lv_perm_13_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2805:10: (lv_perm_13_0= RULE_INT )
            	    // InternalLcDsl.g:2806:11: lv_perm_13_0= RULE_INT
            	    {
            	    lv_perm_13_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            	    											newLeafNode(lv_perm_13_0, grammarAccess.getMemoryOptionAccess().getPermINTTerminalRuleCall_2_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMemoryOptionRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"perm",
            	    												lv_perm_13_0,
            	    												"com.wamas.ide.launching.LcDsl.INT");
            	    										

            	    }


            	    }

            	    // InternalLcDsl.g:2822:9: ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2823:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2823:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2824:11: lv_permUnit_14_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getPermUnitMemoryUnitEnumRuleCall_2_2_3_0());
            	    										
            	    pushFollow(FOLLOW_30);
            	    lv_permUnit_14_0=ruleMemoryUnit();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMemoryOptionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"permUnit",
            	    												lv_permUnit_14_0,
            	    												"com.wamas.ide.launching.LcDsl.MemoryUnit");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getMemoryOptionAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemoryOption"


    // $ANTLR start "entryRuleGroupMember"
    // InternalLcDsl.g:2862:1: entryRuleGroupMember returns [EObject current=null] : iv_ruleGroupMember= ruleGroupMember EOF ;
    public final EObject entryRuleGroupMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupMember = null;


        try {
            // InternalLcDsl.g:2862:52: (iv_ruleGroupMember= ruleGroupMember EOF )
            // InternalLcDsl.g:2863:2: iv_ruleGroupMember= ruleGroupMember EOF
            {
             newCompositeNode(grammarAccess.getGroupMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupMember=ruleGroupMember();

            state._fsp--;

             current =iv_ruleGroupMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupMember"


    // $ANTLR start "ruleGroupMember"
    // InternalLcDsl.g:2869:1: ruleGroupMember returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) ;
    public final EObject ruleGroupMember() throws RecognitionException {
        EObject current = null;

        Token lv_adopt_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_postAction_5_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2875:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) )
            // InternalLcDsl.g:2876:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            {
            // InternalLcDsl.g:2876:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            // InternalLcDsl.g:2877:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';'
            {
            // InternalLcDsl.g:2877:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2878:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2878:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2879:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            				
            // InternalLcDsl.g:2882:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            // InternalLcDsl.g:2883:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2883:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( LA19_0 >= 79 && LA19_0 <= 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLcDsl.g:2884:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2884:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    // InternalLcDsl.g:2885:5: {...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalLcDsl.g:2885:108: ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    // InternalLcDsl.g:2886:6: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalLcDsl.g:2889:9: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    // InternalLcDsl.g:2889:10: {...}? => ( (lv_type_1_0= ruleLaunchModeType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:2889:19: ( (lv_type_1_0= ruleLaunchModeType ) )
            	    // InternalLcDsl.g:2889:20: (lv_type_1_0= ruleLaunchModeType )
            	    {
            	    // InternalLcDsl.g:2889:20: (lv_type_1_0= ruleLaunchModeType )
            	    // InternalLcDsl.g:2890:10: lv_type_1_0= ruleLaunchModeType
            	    {

            	    										newCompositeNode(grammarAccess.getGroupMemberAccess().getTypeLaunchModeTypeEnumRuleCall_0_0_0());
            	    									
            	    pushFollow(FOLLOW_32);
            	    lv_type_1_0=ruleLaunchModeType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGroupMemberRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_1_0,
            	    											"com.wamas.ide.launching.LcDsl.LaunchModeType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2912:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2912:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    // InternalLcDsl.g:2913:5: {...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalLcDsl.g:2913:108: ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    // InternalLcDsl.g:2914:6: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalLcDsl.g:2917:9: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    // InternalLcDsl.g:2917:10: {...}? => ( (lv_adopt_2_0= 'adopt' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:2917:19: ( (lv_adopt_2_0= 'adopt' ) )
            	    // InternalLcDsl.g:2917:20: (lv_adopt_2_0= 'adopt' )
            	    {
            	    // InternalLcDsl.g:2917:20: (lv_adopt_2_0= 'adopt' )
            	    // InternalLcDsl.g:2918:10: lv_adopt_2_0= 'adopt'
            	    {
            	    lv_adopt_2_0=(Token)match(input,66,FOLLOW_32); 

            	    										newLeafNode(lv_adopt_2_0, grammarAccess.getGroupMemberAccess().getAdoptAdoptKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGroupMemberRule());
            	    										}
            	    										setWithLastConsumed(current, "adopt", true, "adopt");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            				

            }

            otherlv_3=(Token)match(input,67,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupMemberAccess().getMemberKeyword_1());
            		
            // InternalLcDsl.g:2946:3: ( ( ruleFQName ) )
            // InternalLcDsl.g:2947:4: ( ruleFQName )
            {
            // InternalLcDsl.g:2947:4: ( ruleFQName )
            // InternalLcDsl.g:2948:5: ruleFQName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGroupMemberAccess().getMemberLaunchConfigCrossReference_2_0());
            				
            pushFollow(FOLLOW_33);
            ruleFQName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:2962:3: ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=68 && LA20_0<=70)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLcDsl.g:2963:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    {
                    // InternalLcDsl.g:2963:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    // InternalLcDsl.g:2964:5: lv_postAction_5_0= ruleGroupPostLaunchAction
                    {

                    					newCompositeNode(grammarAccess.getGroupMemberAccess().getPostActionGroupPostLaunchActionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_postAction_5_0=ruleGroupPostLaunchAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGroupMemberRule());
                    					}
                    					set(
                    						current,
                    						"postAction",
                    						lv_postAction_5_0,
                    						"com.wamas.ide.launching.LcDsl.GroupPostLaunchAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupMemberAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupMember"


    // $ANTLR start "entryRuleGroupPostLaunchAction"
    // InternalLcDsl.g:2989:1: entryRuleGroupPostLaunchAction returns [EObject current=null] : iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF ;
    public final EObject entryRuleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchAction = null;


        try {
            // InternalLcDsl.g:2989:62: (iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF )
            // InternalLcDsl.g:2990:2: iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF
            {
             newCompositeNode(grammarAccess.getGroupPostLaunchActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupPostLaunchAction=ruleGroupPostLaunchAction();

            state._fsp--;

             current =iv_ruleGroupPostLaunchAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupPostLaunchAction"


    // $ANTLR start "ruleGroupPostLaunchAction"
    // InternalLcDsl.g:2996:1: ruleGroupPostLaunchAction returns [EObject current=null] : (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) ;
    public final EObject ruleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject this_GroupPostLaunchDelay_0 = null;

        EObject this_GroupPostLaunchRegex_1 = null;

        EObject this_GroupPostLaunchWait_2 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:3002:2: ( (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) )
            // InternalLcDsl.g:3003:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            {
            // InternalLcDsl.g:3003:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt21=1;
                }
                break;
            case 69:
                {
                alt21=2;
                }
                break;
            case 70:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalLcDsl.g:3004:3: this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay
                    {

                    			newCompositeNode(grammarAccess.getGroupPostLaunchActionAccess().getGroupPostLaunchDelayParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupPostLaunchDelay_0=ruleGroupPostLaunchDelay();

                    state._fsp--;


                    			current = this_GroupPostLaunchDelay_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3013:3: this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex
                    {

                    			newCompositeNode(grammarAccess.getGroupPostLaunchActionAccess().getGroupPostLaunchRegexParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupPostLaunchRegex_1=ruleGroupPostLaunchRegex();

                    state._fsp--;


                    			current = this_GroupPostLaunchRegex_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3022:3: this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait
                    {

                    			newCompositeNode(grammarAccess.getGroupPostLaunchActionAccess().getGroupPostLaunchWaitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupPostLaunchWait_2=ruleGroupPostLaunchWait();

                    state._fsp--;


                    			current = this_GroupPostLaunchWait_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupPostLaunchAction"


    // $ANTLR start "entryRuleGroupPostLaunchDelay"
    // InternalLcDsl.g:3034:1: entryRuleGroupPostLaunchDelay returns [EObject current=null] : iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF ;
    public final EObject entryRuleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchDelay = null;


        try {
            // InternalLcDsl.g:3034:61: (iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF )
            // InternalLcDsl.g:3035:2: iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF
            {
             newCompositeNode(grammarAccess.getGroupPostLaunchDelayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupPostLaunchDelay=ruleGroupPostLaunchDelay();

            state._fsp--;

             current =iv_ruleGroupPostLaunchDelay; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupPostLaunchDelay"


    // $ANTLR start "ruleGroupPostLaunchDelay"
    // InternalLcDsl.g:3041:1: ruleGroupPostLaunchDelay returns [EObject current=null] : (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_delay_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3047:2: ( (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) )
            // InternalLcDsl.g:3048:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            {
            // InternalLcDsl.g:3048:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            // InternalLcDsl.g:3049:3: otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchDelayAccess().getDelayKeyword_0());
            		
            // InternalLcDsl.g:3053:3: ( (lv_delay_1_0= RULE_INT ) )
            // InternalLcDsl.g:3054:4: (lv_delay_1_0= RULE_INT )
            {
            // InternalLcDsl.g:3054:4: (lv_delay_1_0= RULE_INT )
            // InternalLcDsl.g:3055:5: lv_delay_1_0= RULE_INT
            {
            lv_delay_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_delay_1_0, grammarAccess.getGroupPostLaunchDelayAccess().getDelayINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupPostLaunchDelayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"delay",
            						lv_delay_1_0,
            						"com.wamas.ide.launching.LcDsl.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupPostLaunchDelay"


    // $ANTLR start "entryRuleGroupPostLaunchRegex"
    // InternalLcDsl.g:3075:1: entryRuleGroupPostLaunchRegex returns [EObject current=null] : iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF ;
    public final EObject entryRuleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchRegex = null;


        try {
            // InternalLcDsl.g:3075:61: (iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF )
            // InternalLcDsl.g:3076:2: iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF
            {
             newCompositeNode(grammarAccess.getGroupPostLaunchRegexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupPostLaunchRegex=ruleGroupPostLaunchRegex();

            state._fsp--;

             current =iv_ruleGroupPostLaunchRegex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupPostLaunchRegex"


    // $ANTLR start "ruleGroupPostLaunchRegex"
    // InternalLcDsl.g:3082:1: ruleGroupPostLaunchRegex returns [EObject current=null] : (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_regex_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3088:2: ( (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) )
            // InternalLcDsl.g:3089:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            {
            // InternalLcDsl.g:3089:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            // InternalLcDsl.g:3090:3: otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchRegexAccess().getRegexKeyword_0());
            		
            // InternalLcDsl.g:3094:3: ( (lv_regex_1_0= RULE_STRING ) )
            // InternalLcDsl.g:3095:4: (lv_regex_1_0= RULE_STRING )
            {
            // InternalLcDsl.g:3095:4: (lv_regex_1_0= RULE_STRING )
            // InternalLcDsl.g:3096:5: lv_regex_1_0= RULE_STRING
            {
            lv_regex_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_regex_1_0, grammarAccess.getGroupPostLaunchRegexAccess().getRegexSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupPostLaunchRegexRule());
            					}
            					setWithLastConsumed(
            						current,
            						"regex",
            						lv_regex_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupPostLaunchRegex"


    // $ANTLR start "entryRuleGroupPostLaunchWait"
    // InternalLcDsl.g:3116:1: entryRuleGroupPostLaunchWait returns [EObject current=null] : iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF ;
    public final EObject entryRuleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchWait = null;


        try {
            // InternalLcDsl.g:3116:60: (iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF )
            // InternalLcDsl.g:3117:2: iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF
            {
             newCompositeNode(grammarAccess.getGroupPostLaunchWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupPostLaunchWait=ruleGroupPostLaunchWait();

            state._fsp--;

             current =iv_ruleGroupPostLaunchWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupPostLaunchWait"


    // $ANTLR start "ruleGroupPostLaunchWait"
    // InternalLcDsl.g:3123:1: ruleGroupPostLaunchWait returns [EObject current=null] : ( () otherlv_1= 'wait' ) ;
    public final EObject ruleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3129:2: ( ( () otherlv_1= 'wait' ) )
            // InternalLcDsl.g:3130:2: ( () otherlv_1= 'wait' )
            {
            // InternalLcDsl.g:3130:2: ( () otherlv_1= 'wait' )
            // InternalLcDsl.g:3131:3: () otherlv_1= 'wait'
            {
            // InternalLcDsl.g:3131:3: ()
            // InternalLcDsl.g:3132:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupPostLaunchWaitAccess().getGroupPostLaunchWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupPostLaunchWaitAccess().getWaitKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupPostLaunchWait"


    // $ANTLR start "entryRuleStringWithVariables"
    // InternalLcDsl.g:3146:1: entryRuleStringWithVariables returns [EObject current=null] : iv_ruleStringWithVariables= ruleStringWithVariables EOF ;
    public final EObject entryRuleStringWithVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringWithVariables = null;


        try {
            // InternalLcDsl.g:3146:60: (iv_ruleStringWithVariables= ruleStringWithVariables EOF )
            // InternalLcDsl.g:3147:2: iv_ruleStringWithVariables= ruleStringWithVariables EOF
            {
             newCompositeNode(grammarAccess.getStringWithVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringWithVariables=ruleStringWithVariables();

            state._fsp--;

             current =iv_ruleStringWithVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringWithVariables"


    // $ANTLR start "ruleStringWithVariables"
    // InternalLcDsl.g:3153:1: ruleStringWithVariables returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringWithVariables() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3159:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLcDsl.g:3160:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLcDsl.g:3160:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLcDsl.g:3161:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLcDsl.g:3161:3: (lv_value_0_0= RULE_STRING )
            // InternalLcDsl.g:3162:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringWithVariablesAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringWithVariablesRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringWithVariables"


    // $ANTLR start "entryRuleFQName"
    // InternalLcDsl.g:3181:1: entryRuleFQName returns [String current=null] : iv_ruleFQName= ruleFQName EOF ;
    public final String entryRuleFQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQName = null;


        try {
            // InternalLcDsl.g:3181:46: (iv_ruleFQName= ruleFQName EOF )
            // InternalLcDsl.g:3182:2: iv_ruleFQName= ruleFQName EOF
            {
             newCompositeNode(grammarAccess.getFQNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQName=ruleFQName();

            state._fsp--;

             current =iv_ruleFQName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQName"


    // $ANTLR start "ruleFQName"
    // InternalLcDsl.g:3188:1: ruleFQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3194:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLcDsl.g:3195:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLcDsl.g:3195:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLcDsl.g:3196:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLcDsl.g:3203:3: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==71) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLcDsl.g:3204:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,71,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQName"


    // $ANTLR start "ruleBrowserLaunchMode"
    // InternalLcDsl.g:3221:1: ruleBrowserLaunchMode returns [Enumerator current=null] : ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) ) ;
    public final Enumerator ruleBrowserLaunchMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3227:2: ( ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) ) )
            // InternalLcDsl.g:3228:2: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) )
            {
            // InternalLcDsl.g:3228:2: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt23=1;
                }
                break;
            case 73:
                {
                alt23=2;
                }
                break;
            case 74:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalLcDsl.g:3229:3: (enumLiteral_0= 'internal' )
                    {
                    // InternalLcDsl.g:3229:3: (enumLiteral_0= 'internal' )
                    // InternalLcDsl.g:3230:4: enumLiteral_0= 'internal'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBrowserLaunchModeAccess().getINTERNALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrowserLaunchModeAccess().getINTERNALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3237:3: (enumLiteral_1= 'external' )
                    {
                    // InternalLcDsl.g:3237:3: (enumLiteral_1= 'external' )
                    // InternalLcDsl.g:3238:4: enumLiteral_1= 'external'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBrowserLaunchModeAccess().getEXTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrowserLaunchModeAccess().getEXTERNALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3245:3: (enumLiteral_2= 'none' )
                    {
                    // InternalLcDsl.g:3245:3: (enumLiteral_2= 'none' )
                    // InternalLcDsl.g:3246:4: enumLiteral_2= 'none'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBrowserLaunchModeAccess().getNONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBrowserLaunchModeAccess().getNONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrowserLaunchMode"


    // $ANTLR start "ruleLaunchConfigType"
    // InternalLcDsl.g:3256:1: ruleLaunchConfigType returns [Enumerator current=null] : ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) ) ;
    public final Enumerator ruleLaunchConfigType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3262:2: ( ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) ) )
            // InternalLcDsl.g:3263:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) )
            {
            // InternalLcDsl.g:3263:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt24=1;
                }
                break;
            case 76:
                {
                alt24=2;
                }
                break;
            case 77:
                {
                alt24=3;
                }
                break;
            case 78:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalLcDsl.g:3264:3: (enumLiteral_0= 'java' )
                    {
                    // InternalLcDsl.g:3264:3: (enumLiteral_0= 'java' )
                    // InternalLcDsl.g:3265:4: enumLiteral_0= 'java'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3272:3: (enumLiteral_1= 'eclipse' )
                    {
                    // InternalLcDsl.g:3272:3: (enumLiteral_1= 'eclipse' )
                    // InternalLcDsl.g:3273:4: enumLiteral_1= 'eclipse'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3280:3: (enumLiteral_2= 'rap' )
                    {
                    // InternalLcDsl.g:3280:3: (enumLiteral_2= 'rap' )
                    // InternalLcDsl.g:3281:4: enumLiteral_2= 'rap'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3288:3: (enumLiteral_3= 'group' )
                    {
                    // InternalLcDsl.g:3288:3: (enumLiteral_3= 'group' )
                    // InternalLcDsl.g:3289:4: enumLiteral_3= 'group'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getGROUPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLaunchConfigTypeAccess().getGROUPEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLaunchConfigType"


    // $ANTLR start "ruleLaunchModeType"
    // InternalLcDsl.g:3299:1: ruleLaunchModeType returns [Enumerator current=null] : ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) ) ;
    public final Enumerator ruleLaunchModeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3305:2: ( ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) ) )
            // InternalLcDsl.g:3306:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) )
            {
            // InternalLcDsl.g:3306:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt25=1;
                }
                break;
            case 80:
                {
                alt25=2;
                }
                break;
            case 81:
                {
                alt25=3;
                }
                break;
            case 82:
                {
                alt25=4;
                }
                break;
            case 83:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalLcDsl.g:3307:3: (enumLiteral_0= 'run' )
                    {
                    // InternalLcDsl.g:3307:3: (enumLiteral_0= 'run' )
                    // InternalLcDsl.g:3308:4: enumLiteral_0= 'run'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3315:3: (enumLiteral_1= 'debug' )
                    {
                    // InternalLcDsl.g:3315:3: (enumLiteral_1= 'debug' )
                    // InternalLcDsl.g:3316:4: enumLiteral_1= 'debug'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3323:3: (enumLiteral_2= 'profile' )
                    {
                    // InternalLcDsl.g:3323:3: (enumLiteral_2= 'profile' )
                    // InternalLcDsl.g:3324:4: enumLiteral_2= 'profile'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3331:3: (enumLiteral_3= 'coverage' )
                    {
                    // InternalLcDsl.g:3331:3: (enumLiteral_3= 'coverage' )
                    // InternalLcDsl.g:3332:4: enumLiteral_3= 'coverage'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:3339:3: (enumLiteral_4= 'inherit' )
                    {
                    // InternalLcDsl.g:3339:3: (enumLiteral_4= 'inherit' )
                    // InternalLcDsl.g:3340:4: enumLiteral_4= 'inherit'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getINHERITEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLaunchModeTypeAccess().getINHERITEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLaunchModeType"


    // $ANTLR start "ruleMemoryUnit"
    // InternalLcDsl.g:3350:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) ) ;
    public final Enumerator ruleMemoryUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3356:2: ( ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) ) )
            // InternalLcDsl.g:3357:2: ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) )
            {
            // InternalLcDsl.g:3357:2: ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) )
            int alt26=8;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt26=1;
                }
                break;
            case 85:
                {
                alt26=2;
                }
                break;
            case 86:
                {
                alt26=3;
                }
                break;
            case 87:
                {
                alt26=4;
                }
                break;
            case 88:
                {
                alt26=5;
                }
                break;
            case 89:
                {
                alt26=6;
                }
                break;
            case 90:
                {
                alt26=7;
                }
                break;
            case 91:
                {
                alt26=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalLcDsl.g:3358:3: (enumLiteral_0= 'MB' )
                    {
                    // InternalLcDsl.g:3358:3: (enumLiteral_0= 'MB' )
                    // InternalLcDsl.g:3359:4: enumLiteral_0= 'MB'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3366:3: (enumLiteral_1= 'mb' )
                    {
                    // InternalLcDsl.g:3366:3: (enumLiteral_1= 'mb' )
                    // InternalLcDsl.g:3367:4: enumLiteral_1= 'mb'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3374:3: (enumLiteral_2= 'M' )
                    {
                    // InternalLcDsl.g:3374:3: (enumLiteral_2= 'M' )
                    // InternalLcDsl.g:3375:4: enumLiteral_2= 'M'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3382:3: (enumLiteral_3= 'm' )
                    {
                    // InternalLcDsl.g:3382:3: (enumLiteral_3= 'm' )
                    // InternalLcDsl.g:3383:4: enumLiteral_3= 'm'
                    {
                    enumLiteral_3=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:3390:3: (enumLiteral_4= 'GB' )
                    {
                    // InternalLcDsl.g:3390:3: (enumLiteral_4= 'GB' )
                    // InternalLcDsl.g:3391:4: enumLiteral_4= 'GB'
                    {
                    enumLiteral_4=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:3398:3: (enumLiteral_5= 'gb' )
                    {
                    // InternalLcDsl.g:3398:3: (enumLiteral_5= 'gb' )
                    // InternalLcDsl.g:3399:4: enumLiteral_5= 'gb'
                    {
                    enumLiteral_5=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:3406:3: (enumLiteral_6= 'G' )
                    {
                    // InternalLcDsl.g:3406:3: (enumLiteral_6= 'G' )
                    // InternalLcDsl.g:3407:4: enumLiteral_6= 'G'
                    {
                    enumLiteral_6=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalLcDsl.g:3414:3: (enumLiteral_7= 'g' )
                    {
                    // InternalLcDsl.g:3414:3: (enumLiteral_7= 'g' )
                    // InternalLcDsl.g:3415:4: enumLiteral_7= 'g'
                    {
                    enumLiteral_7=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemoryUnit"


    // $ANTLR start "ruleOutputStream"
    // InternalLcDsl.g:3425:1: ruleOutputStream returns [Enumerator current=null] : ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) ;
    public final Enumerator ruleOutputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3431:2: ( ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) )
            // InternalLcDsl.g:3432:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
            {
            // InternalLcDsl.g:3432:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt27=1;
                }
                break;
            case 93:
                {
                alt27=2;
                }
                break;
            case 94:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalLcDsl.g:3433:3: (enumLiteral_0= 'stdout' )
                    {
                    // InternalLcDsl.g:3433:3: (enumLiteral_0= 'stdout' )
                    // InternalLcDsl.g:3434:4: enumLiteral_0= 'stdout'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3441:3: (enumLiteral_1= 'stderr' )
                    {
                    // InternalLcDsl.g:3441:3: (enumLiteral_1= 'stderr' )
                    // InternalLcDsl.g:3442:4: enumLiteral_1= 'stderr'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3449:3: (enumLiteral_2= 'both-out' )
                    {
                    // InternalLcDsl.g:3449:3: (enumLiteral_2= 'both-out' )
                    // InternalLcDsl.g:3450:4: enumLiteral_2= 'both-out'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getBOTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOutputStreamAccess().getBOTHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputStream"


    // $ANTLR start "ruleInputStream"
    // InternalLcDsl.g:3460:1: ruleInputStream returns [Enumerator current=null] : (enumLiteral_0= 'stdin' ) ;
    public final Enumerator ruleInputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3466:2: ( (enumLiteral_0= 'stdin' ) )
            // InternalLcDsl.g:3467:2: (enumLiteral_0= 'stdin' )
            {
            // InternalLcDsl.g:3467:2: (enumLiteral_0= 'stdin' )
            // InternalLcDsl.g:3468:3: enumLiteral_0= 'stdin'
            {
            enumLiteral_0=(Token)match(input,95,FOLLOW_2); 

            			current = grammarAccess.getInputStreamAccess().getSTDINEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getInputStreamAccess().getSTDINEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputStream"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\21\11\uffff";
    static final String dfa_3s = "\1\116\11\uffff";
    static final String dfa_4s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\62\uffff\4\1",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA2_0>=75 && LA2_0<=78)) ) {s = 1;}

                        else if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {s = 2;}

                        else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {s = 3;}

                        else if ( LA2_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {s = 4;}

                        else if ( LA2_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {s = 5;}

                        else if ( LA2_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {s = 6;}

                        else if ( LA2_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {s = 7;}

                        else if ( LA2_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {s = 8;}

                        else if ( LA2_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 7) ) {s = 9;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\20\uffff";
    static final String dfa_8s = "\1\5\17\uffff";
    static final String dfa_9s = "\1\123\17\uffff";
    static final String dfa_10s = "\1\uffff\1\17\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16";
    static final String dfa_11s = "\1\0\17\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\25\uffff\1\3\1\uffff\1\4\1\6\1\7\5\1\1\10\1\11\1\12\1\13\2\uffff\1\14\1\15\1\1\1\16\2\uffff\1\17\10\uffff\1\2\3\uffff\1\5\3\uffff\2\1\13\uffff\5\1",
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
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 388:6: ( ({...}? => ( ({...}? => ( (lv_clears_16_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_17_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_18_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_19_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_20_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_21_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_22_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_23_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_24_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_25_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_26_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_27_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_28_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_29_0= ruleRapServletConfig ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_0==RULE_BLOCK_END||(LA4_0>=32 && LA4_0<=36)||LA4_0==45||(LA4_0>=66 && LA4_0<=67)||(LA4_0>=79 && LA4_0<=83)) ) {s = 1;}

                        else if ( LA4_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 2;}

                        else if ( LA4_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 3;}

                        else if ( LA4_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 4;}

                        else if ( LA4_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 5;}

                        else if ( LA4_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 6;}

                        else if ( LA4_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 7;}

                        else if ( LA4_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 8;}

                        else if ( LA4_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 9;}

                        else if ( LA4_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 10;}

                        else if ( LA4_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 11;}

                        else if ( LA4_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 12;}

                        else if ( LA4_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 13;}

                        else if ( LA4_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12) ) {s = 14;}

                        else if ( LA4_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13) ) {s = 15;}

                         
                        input.seek(index4_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001FE0002L,0x0000000000007800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003FE0000L,0x0000000000007800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x440279FFE8000020L,0x00000000000F800CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000201F00000020L,0x00000000000F800CL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L,0x00000000F0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001800010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00FC000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00FC000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2800000018000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3800000018000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8000000010000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x000000000FF00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F800CL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});

}
