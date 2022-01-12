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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BRACKET_OPEN", "RULE_STRING", "RULE_BRACKET_CLOSE", "RULE_BLOCK_BEGIN", "RULE_BLOCK_END", "RULE_ID", "RULE_EQ", "RULE_INT", "RULE_BOOLEAN", "RULE_VERSION", "RULE_QUALIFIER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'explicit'", "'manual'", "'abstract'", "'foreground'", "'no-console'", "'no-validate'", "'sw-install-allowed'", "'replace-env'", "'stop-in-main'", "'keep-running'", "'run-in-ui-thread'", "'qualified'", "'configuration'", "':'", "'workspace'", "';'", "'working-dir'", "'project'", "'self'", "'main-class'", "'optional'", "'plugin'", "'feature'", "'content-provider'", "'ignore'", "'vm-argument'", "'argument'", "'environment'", "'application'", "'product'", "'favorite'", "'redirect'", "'to'", "'!'", "'from'", "'execution-environment'", "'config-ini-template'", "'trace'", "'search-main'", "'system'", "'inherited'", "'servlet'", "'path'", "'browser'", "'port'", "'session-timeout'", "'context-path'", "'dev-mode'", "'autostart'", "'startlevel'", "'clear'", "'log'", "'config'", "'memory'", "'min'", "'max'", "'perm'", "'adopt'", "'member'", "'delay'", "'regex'", "'wait'", "'test'", "'runner'", "'container'", "'class'", "'method'", "'exclude-tags'", "'include-tags'", "'.'", "','", "'internal'", "'external'", "'none'", "'java'", "'eclipse'", "'rap'", "'group'", "'swtbot'", "'junit-plugin'", "'inherit'", "'run'", "'debug'", "'profile'", "'coverage'", "'M'", "'mb'", "'MB'", "'m'", "'G'", "'gb'", "'GB'", "'g'", "'stdout'", "'stderr'", "'both-out'", "'stdin'", "'junit5'", "'junit4'", "'junit3'"
    };
    public static final int T__50=50;
    public static final int RULE_VERSION=13;
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
    public static final int RULE_ID=9;
    public static final int RULE_INT=11;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int RULE_BLOCK_END=8;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_BRACKET_CLOSE=6;
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=12;
    public static final int T__19=19;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    public static final int RULE_BRACKET_OPEN=4;
    public static final int RULE_BLOCK_BEGIN=7;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_EQ=10;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_QUALIFIER=14;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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

                if ( ((LA1_0>=19 && LA1_0<=30)||(LA1_0>=93 && LA1_0<=98)) ) {
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
    // InternalLcDsl.g:108:1: ruleLaunchConfig returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* ) ) ) ( (lv_type_16_0= ruleLaunchConfigType ) ) otherlv_17= 'configuration' ( (lv_name_18_0= ruleFQName ) ) (otherlv_19= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_21= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* ) ) ) this_BLOCK_END_47= RULE_BLOCK_END ) ;
    public final EObject ruleLaunchConfig() throws RecognitionException {
        EObject current = null;

        Token lv_explicit_1_0=null;
        Token lv_manual_2_0=null;
        Token lv_abstract_3_0=null;
        Token lv_foreground_4_0=null;
        Token lv_noConsole_5_0=null;
        Token lv_noValidate_6_0=null;
        Token lv_swInstallSupport_7_0=null;
        Token lv_replaceEnv_8_0=null;
        Token lv_stopInMain_9_0=null;
        Token lv_keepRunning_10_0=null;
        Token lv_runInUiThread_11_0=null;
        Token lv_qualify_12_0=null;
        Token this_BRACKET_OPEN_13=null;
        Token lv_qualifierId_14_0=null;
        Token this_BRACKET_CLOSE_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token this_BLOCK_BEGIN_21=null;
        Token this_BLOCK_END_47=null;
        Enumerator lv_type_16_0 = null;

        AntlrDatatypeRuleToken lv_name_18_0 = null;

        EObject lv_clears_23_0 = null;

        EObject lv_workspace_24_0 = null;

        EObject lv_workingDir_25_0 = null;

        EObject lv_memory_26_0 = null;

        EObject lv_mainProject_27_0 = null;

        EObject lv_mainType_28_0 = null;

        EObject lv_application_29_0 = null;

        EObject lv_product_30_0 = null;

        EObject lv_favorites_31_0 = null;

        EObject lv_redirect_32_0 = null;

        EObject lv_execEnv_33_0 = null;

        EObject lv_configIniTemplate_34_0 = null;

        EObject lv_javaMainSearch_35_0 = null;

        EObject lv_servletConfig_36_0 = null;

        EObject lv_contentProviderProduct_37_0 = null;

        EObject lv_test_38_0 = null;

        EObject lv_plugins_39_0 = null;

        EObject lv_features_40_0 = null;

        EObject lv_ignore_41_0 = null;

        EObject lv_groupMembers_42_0 = null;

        EObject lv_vmArgs_43_0 = null;

        EObject lv_progArgs_44_0 = null;

        EObject lv_envVars_45_0 = null;

        EObject lv_traces_46_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:114:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* ) ) ) ( (lv_type_16_0= ruleLaunchConfigType ) ) otherlv_17= 'configuration' ( (lv_name_18_0= ruleFQName ) ) (otherlv_19= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_21= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* ) ) ) this_BLOCK_END_47= RULE_BLOCK_END ) )
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* ) ) ) ( (lv_type_16_0= ruleLaunchConfigType ) ) otherlv_17= 'configuration' ( (lv_name_18_0= ruleFQName ) ) (otherlv_19= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_21= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* ) ) ) this_BLOCK_END_47= RULE_BLOCK_END )
            {
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* ) ) ) ( (lv_type_16_0= ruleLaunchConfigType ) ) otherlv_17= 'configuration' ( (lv_name_18_0= ruleFQName ) ) (otherlv_19= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_21= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* ) ) ) this_BLOCK_END_47= RULE_BLOCK_END )
            // InternalLcDsl.g:116:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* ) ) ) ( (lv_type_16_0= ruleLaunchConfigType ) ) otherlv_17= 'configuration' ( (lv_name_18_0= ruleFQName ) ) (otherlv_19= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_21= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* ) ) ) this_BLOCK_END_47= RULE_BLOCK_END
            {
            // InternalLcDsl.g:116:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* ) ) )
            // InternalLcDsl.g:117:4: ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:117:4: ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* ) )
            // InternalLcDsl.g:118:5: ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            				
            // InternalLcDsl.g:121:5: ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )* )
            // InternalLcDsl.g:122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )*
            {
            // InternalLcDsl.g:122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) ) )*
            loop3:
            do {
                int alt3=13;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                    alt3=5;
                }
                else if ( LA3_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                    alt3=6;
                }
                else if ( LA3_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                    alt3=7;
                }
                else if ( LA3_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 7) ) {
                    alt3=8;
                }
                else if ( LA3_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 8) ) {
                    alt3=9;
                }
                else if ( LA3_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 9) ) {
                    alt3=10;
                }
                else if ( LA3_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 10) ) {
                    alt3=11;
                }
                else if ( LA3_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 11) ) {
                    alt3=12;
                }


                switch (alt3) {
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
            	    lv_explicit_1_0=(Token)match(input,19,FOLLOW_4); 

            	    										newLeafNode(lv_explicit_1_0, grammarAccess.getLaunchConfigAccess().getExplicitExplicitKeyword_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "explicit", lv_explicit_1_0 != null, "explicit");
            	    									

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
            	    lv_manual_2_0=(Token)match(input,20,FOLLOW_4); 

            	    										newLeafNode(lv_manual_2_0, grammarAccess.getLaunchConfigAccess().getManualManualKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "manual", lv_manual_2_0 != null, "manual");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:169:4: ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:169:4: ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) )
            	    // InternalLcDsl.g:170:5: {...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalLcDsl.g:170:109: ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) )
            	    // InternalLcDsl.g:171:6: ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalLcDsl.g:174:9: ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) )
            	    // InternalLcDsl.g:174:10: {...}? => ( (lv_abstract_3_0= 'abstract' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:174:19: ( (lv_abstract_3_0= 'abstract' ) )
            	    // InternalLcDsl.g:174:20: (lv_abstract_3_0= 'abstract' )
            	    {
            	    // InternalLcDsl.g:174:20: (lv_abstract_3_0= 'abstract' )
            	    // InternalLcDsl.g:175:10: lv_abstract_3_0= 'abstract'
            	    {
            	    lv_abstract_3_0=(Token)match(input,21,FOLLOW_4); 

            	    										newLeafNode(lv_abstract_3_0, grammarAccess.getLaunchConfigAccess().getAbstractAbstractKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "abstract", lv_abstract_3_0 != null, "abstract");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:192:4: ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:192:4: ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) )
            	    // InternalLcDsl.g:193:5: {...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalLcDsl.g:193:109: ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) )
            	    // InternalLcDsl.g:194:6: ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalLcDsl.g:197:9: ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) )
            	    // InternalLcDsl.g:197:10: {...}? => ( (lv_foreground_4_0= 'foreground' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:197:19: ( (lv_foreground_4_0= 'foreground' ) )
            	    // InternalLcDsl.g:197:20: (lv_foreground_4_0= 'foreground' )
            	    {
            	    // InternalLcDsl.g:197:20: (lv_foreground_4_0= 'foreground' )
            	    // InternalLcDsl.g:198:10: lv_foreground_4_0= 'foreground'
            	    {
            	    lv_foreground_4_0=(Token)match(input,22,FOLLOW_4); 

            	    										newLeafNode(lv_foreground_4_0, grammarAccess.getLaunchConfigAccess().getForegroundForegroundKeyword_0_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "foreground", lv_foreground_4_0 != null, "foreground");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:215:4: ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:215:4: ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) )
            	    // InternalLcDsl.g:216:5: {...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4)");
            	    }
            	    // InternalLcDsl.g:216:109: ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) )
            	    // InternalLcDsl.g:217:6: ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4);
            	    					
            	    // InternalLcDsl.g:220:9: ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) )
            	    // InternalLcDsl.g:220:10: {...}? => ( (lv_noConsole_5_0= 'no-console' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:220:19: ( (lv_noConsole_5_0= 'no-console' ) )
            	    // InternalLcDsl.g:220:20: (lv_noConsole_5_0= 'no-console' )
            	    {
            	    // InternalLcDsl.g:220:20: (lv_noConsole_5_0= 'no-console' )
            	    // InternalLcDsl.g:221:10: lv_noConsole_5_0= 'no-console'
            	    {
            	    lv_noConsole_5_0=(Token)match(input,23,FOLLOW_4); 

            	    										newLeafNode(lv_noConsole_5_0, grammarAccess.getLaunchConfigAccess().getNoConsoleNoConsoleKeyword_0_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "noConsole", lv_noConsole_5_0 != null, "no-console");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:238:4: ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:238:4: ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) )
            	    // InternalLcDsl.g:239:5: {...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5)");
            	    }
            	    // InternalLcDsl.g:239:109: ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) )
            	    // InternalLcDsl.g:240:6: ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5);
            	    					
            	    // InternalLcDsl.g:243:9: ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) )
            	    // InternalLcDsl.g:243:10: {...}? => ( (lv_noValidate_6_0= 'no-validate' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:243:19: ( (lv_noValidate_6_0= 'no-validate' ) )
            	    // InternalLcDsl.g:243:20: (lv_noValidate_6_0= 'no-validate' )
            	    {
            	    // InternalLcDsl.g:243:20: (lv_noValidate_6_0= 'no-validate' )
            	    // InternalLcDsl.g:244:10: lv_noValidate_6_0= 'no-validate'
            	    {
            	    lv_noValidate_6_0=(Token)match(input,24,FOLLOW_4); 

            	    										newLeafNode(lv_noValidate_6_0, grammarAccess.getLaunchConfigAccess().getNoValidateNoValidateKeyword_0_5_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "noValidate", lv_noValidate_6_0 != null, "no-validate");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLcDsl.g:261:4: ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:261:4: ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) )
            	    // InternalLcDsl.g:262:5: {...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6)");
            	    }
            	    // InternalLcDsl.g:262:109: ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) )
            	    // InternalLcDsl.g:263:6: ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6);
            	    					
            	    // InternalLcDsl.g:266:9: ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) )
            	    // InternalLcDsl.g:266:10: {...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:266:19: ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) )
            	    // InternalLcDsl.g:266:20: (lv_swInstallSupport_7_0= 'sw-install-allowed' )
            	    {
            	    // InternalLcDsl.g:266:20: (lv_swInstallSupport_7_0= 'sw-install-allowed' )
            	    // InternalLcDsl.g:267:10: lv_swInstallSupport_7_0= 'sw-install-allowed'
            	    {
            	    lv_swInstallSupport_7_0=(Token)match(input,25,FOLLOW_4); 

            	    										newLeafNode(lv_swInstallSupport_7_0, grammarAccess.getLaunchConfigAccess().getSwInstallSupportSwInstallAllowedKeyword_0_6_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "swInstallSupport", lv_swInstallSupport_7_0 != null, "sw-install-allowed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalLcDsl.g:284:4: ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:284:4: ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) )
            	    // InternalLcDsl.g:285:5: {...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 7)");
            	    }
            	    // InternalLcDsl.g:285:109: ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) )
            	    // InternalLcDsl.g:286:6: ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 7);
            	    					
            	    // InternalLcDsl.g:289:9: ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) )
            	    // InternalLcDsl.g:289:10: {...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:289:19: ( (lv_replaceEnv_8_0= 'replace-env' ) )
            	    // InternalLcDsl.g:289:20: (lv_replaceEnv_8_0= 'replace-env' )
            	    {
            	    // InternalLcDsl.g:289:20: (lv_replaceEnv_8_0= 'replace-env' )
            	    // InternalLcDsl.g:290:10: lv_replaceEnv_8_0= 'replace-env'
            	    {
            	    lv_replaceEnv_8_0=(Token)match(input,26,FOLLOW_4); 

            	    										newLeafNode(lv_replaceEnv_8_0, grammarAccess.getLaunchConfigAccess().getReplaceEnvReplaceEnvKeyword_0_7_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "replaceEnv", lv_replaceEnv_8_0 != null, "replace-env");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalLcDsl.g:307:4: ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:307:4: ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) )
            	    // InternalLcDsl.g:308:5: {...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 8)");
            	    }
            	    // InternalLcDsl.g:308:109: ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) )
            	    // InternalLcDsl.g:309:6: ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 8);
            	    					
            	    // InternalLcDsl.g:312:9: ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) )
            	    // InternalLcDsl.g:312:10: {...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:312:19: ( (lv_stopInMain_9_0= 'stop-in-main' ) )
            	    // InternalLcDsl.g:312:20: (lv_stopInMain_9_0= 'stop-in-main' )
            	    {
            	    // InternalLcDsl.g:312:20: (lv_stopInMain_9_0= 'stop-in-main' )
            	    // InternalLcDsl.g:313:10: lv_stopInMain_9_0= 'stop-in-main'
            	    {
            	    lv_stopInMain_9_0=(Token)match(input,27,FOLLOW_4); 

            	    										newLeafNode(lv_stopInMain_9_0, grammarAccess.getLaunchConfigAccess().getStopInMainStopInMainKeyword_0_8_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "stopInMain", lv_stopInMain_9_0 != null, "stop-in-main");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalLcDsl.g:330:4: ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:330:4: ({...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) ) )
            	    // InternalLcDsl.g:331:5: {...}? => ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 9)");
            	    }
            	    // InternalLcDsl.g:331:109: ( ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) ) )
            	    // InternalLcDsl.g:332:6: ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 9);
            	    					
            	    // InternalLcDsl.g:335:9: ({...}? => ( (lv_keepRunning_10_0= 'keep-running' ) ) )
            	    // InternalLcDsl.g:335:10: {...}? => ( (lv_keepRunning_10_0= 'keep-running' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:335:19: ( (lv_keepRunning_10_0= 'keep-running' ) )
            	    // InternalLcDsl.g:335:20: (lv_keepRunning_10_0= 'keep-running' )
            	    {
            	    // InternalLcDsl.g:335:20: (lv_keepRunning_10_0= 'keep-running' )
            	    // InternalLcDsl.g:336:10: lv_keepRunning_10_0= 'keep-running'
            	    {
            	    lv_keepRunning_10_0=(Token)match(input,28,FOLLOW_4); 

            	    										newLeafNode(lv_keepRunning_10_0, grammarAccess.getLaunchConfigAccess().getKeepRunningKeepRunningKeyword_0_9_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "keepRunning", lv_keepRunning_10_0 != null, "keep-running");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalLcDsl.g:353:4: ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:353:4: ({...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) ) )
            	    // InternalLcDsl.g:354:5: {...}? => ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 10)");
            	    }
            	    // InternalLcDsl.g:354:110: ( ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) ) )
            	    // InternalLcDsl.g:355:6: ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 10);
            	    					
            	    // InternalLcDsl.g:358:9: ({...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) ) )
            	    // InternalLcDsl.g:358:10: {...}? => ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:358:19: ( (lv_runInUiThread_11_0= 'run-in-ui-thread' ) )
            	    // InternalLcDsl.g:358:20: (lv_runInUiThread_11_0= 'run-in-ui-thread' )
            	    {
            	    // InternalLcDsl.g:358:20: (lv_runInUiThread_11_0= 'run-in-ui-thread' )
            	    // InternalLcDsl.g:359:10: lv_runInUiThread_11_0= 'run-in-ui-thread'
            	    {
            	    lv_runInUiThread_11_0=(Token)match(input,29,FOLLOW_4); 

            	    										newLeafNode(lv_runInUiThread_11_0, grammarAccess.getLaunchConfigAccess().getRunInUiThreadRunInUiThreadKeyword_0_10_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "runInUiThread", lv_runInUiThread_11_0 != null, "run-in-ui-thread");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalLcDsl.g:376:4: ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) )
            	    {
            	    // InternalLcDsl.g:376:4: ({...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) ) )
            	    // InternalLcDsl.g:377:5: {...}? => ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 11)");
            	    }
            	    // InternalLcDsl.g:377:110: ( ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) ) )
            	    // InternalLcDsl.g:378:6: ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 11);
            	    					
            	    // InternalLcDsl.g:381:9: ({...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? ) )
            	    // InternalLcDsl.g:381:10: {...}? => ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:381:19: ( ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )? )
            	    // InternalLcDsl.g:381:20: ( (lv_qualify_12_0= 'qualified' ) ) (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )?
            	    {
            	    // InternalLcDsl.g:381:20: ( (lv_qualify_12_0= 'qualified' ) )
            	    // InternalLcDsl.g:382:10: (lv_qualify_12_0= 'qualified' )
            	    {
            	    // InternalLcDsl.g:382:10: (lv_qualify_12_0= 'qualified' )
            	    // InternalLcDsl.g:383:11: lv_qualify_12_0= 'qualified'
            	    {
            	    lv_qualify_12_0=(Token)match(input,30,FOLLOW_5); 

            	    											newLeafNode(lv_qualify_12_0, grammarAccess.getLaunchConfigAccess().getQualifyQualifiedKeyword_0_11_0_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											setWithLastConsumed(current, "qualify", lv_qualify_12_0 != null, "qualified");
            	    										

            	    }


            	    }

            	    // InternalLcDsl.g:395:9: (this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==RULE_BRACKET_OPEN) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalLcDsl.g:396:10: this_BRACKET_OPEN_13= RULE_BRACKET_OPEN ( (lv_qualifierId_14_0= RULE_STRING ) ) this_BRACKET_CLOSE_15= RULE_BRACKET_CLOSE
            	            {
            	            this_BRACKET_OPEN_13=(Token)match(input,RULE_BRACKET_OPEN,FOLLOW_6); 

            	            										newLeafNode(this_BRACKET_OPEN_13, grammarAccess.getLaunchConfigAccess().getBRACKET_OPENTerminalRuleCall_0_11_1_0());
            	            									
            	            // InternalLcDsl.g:400:10: ( (lv_qualifierId_14_0= RULE_STRING ) )
            	            // InternalLcDsl.g:401:11: (lv_qualifierId_14_0= RULE_STRING )
            	            {
            	            // InternalLcDsl.g:401:11: (lv_qualifierId_14_0= RULE_STRING )
            	            // InternalLcDsl.g:402:12: lv_qualifierId_14_0= RULE_STRING
            	            {
            	            lv_qualifierId_14_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            												newLeafNode(lv_qualifierId_14_0, grammarAccess.getLaunchConfigAccess().getQualifierIdSTRINGTerminalRuleCall_0_11_1_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getLaunchConfigRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"qualifierId",
            	            													lv_qualifierId_14_0,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }


            	            }

            	            this_BRACKET_CLOSE_15=(Token)match(input,RULE_BRACKET_CLOSE,FOLLOW_4); 

            	            										newLeafNode(this_BRACKET_CLOSE_15, grammarAccess.getLaunchConfigAccess().getBRACKET_CLOSETerminalRuleCall_0_11_1_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            				

            }

            // InternalLcDsl.g:436:3: ( (lv_type_16_0= ruleLaunchConfigType ) )
            // InternalLcDsl.g:437:4: (lv_type_16_0= ruleLaunchConfigType )
            {
            // InternalLcDsl.g:437:4: (lv_type_16_0= ruleLaunchConfigType )
            // InternalLcDsl.g:438:5: lv_type_16_0= ruleLaunchConfigType
            {

            					newCompositeNode(grammarAccess.getLaunchConfigAccess().getTypeLaunchConfigTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_16_0=ruleLaunchConfigType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_16_0,
            						"com.wamas.ide.launching.LcDsl.LaunchConfigType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getLaunchConfigAccess().getConfigurationKeyword_2());
            		
            // InternalLcDsl.g:459:3: ( (lv_name_18_0= ruleFQName ) )
            // InternalLcDsl.g:460:4: (lv_name_18_0= ruleFQName )
            {
            // InternalLcDsl.g:460:4: (lv_name_18_0= ruleFQName )
            // InternalLcDsl.g:461:5: lv_name_18_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getLaunchConfigAccess().getNameFQNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_18_0=ruleFQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_18_0,
            						"com.wamas.ide.launching.LcDsl.FQName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:478:3: (otherlv_19= ':' ( ( ruleFQName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLcDsl.g:479:4: otherlv_19= ':' ( ( ruleFQName ) )
                    {
                    otherlv_19=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_19, grammarAccess.getLaunchConfigAccess().getColonKeyword_4_0());
                    			
                    // InternalLcDsl.g:483:4: ( ( ruleFQName ) )
                    // InternalLcDsl.g:484:5: ( ruleFQName )
                    {
                    // InternalLcDsl.g:484:5: ( ruleFQName )
                    // InternalLcDsl.g:485:6: ruleFQName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLaunchConfigRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getSuperConfigLaunchConfigCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BLOCK_BEGIN_21=(Token)match(input,RULE_BLOCK_BEGIN,FOLLOW_12); 

            			newLeafNode(this_BLOCK_BEGIN_21, grammarAccess.getLaunchConfigAccess().getBLOCK_BEGINTerminalRuleCall_5());
            		
            // InternalLcDsl.g:504:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* ) ) )
            // InternalLcDsl.g:505:4: ( ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* ) )
            {
            // InternalLcDsl.g:505:4: ( ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* ) )
            // InternalLcDsl.g:506:5: ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            				
            // InternalLcDsl.g:509:5: ( ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )* )
            // InternalLcDsl.g:510:6: ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )*
            {
            // InternalLcDsl.g:510:6: ( ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) ) )*
            loop13:
            do {
                int alt13=25;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {
                    alt13=5;
                }
                else if ( LA13_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {
                    alt13=6;
                }
                else if ( LA13_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {
                    alt13=7;
                }
                else if ( LA13_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {
                    alt13=8;
                }
                else if ( LA13_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {
                    alt13=9;
                }
                else if ( LA13_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {
                    alt13=10;
                }
                else if ( LA13_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {
                    alt13=11;
                }
                else if ( LA13_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {
                    alt13=12;
                }
                else if ( LA13_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12) ) {
                    alt13=13;
                }
                else if ( LA13_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13) ) {
                    alt13=14;
                }
                else if ( LA13_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 14) ) {
                    alt13=15;
                }
                else if ( LA13_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 15) ) {
                    alt13=16;
                }
                else if ( LA13_0 == 39 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 17) || getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 16) ) ) {
                    int LA13_18 = input.LA(2);

                    if ( LA13_18 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 17) ) {
                        alt13=18;
                    }
                    else if ( LA13_18 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 16) ) {
                        alt13=17;
                    }


                }
                else if ( LA13_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 16) ) {
                    alt13=17;
                }
                else if ( LA13_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 17) ) {
                    alt13=18;
                }
                else if ( LA13_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 18) ) {
                    alt13=19;
                }
                else if ( ( LA13_0 >= 76 && LA13_0 <= 77 || LA13_0 >= 99 && LA13_0 <= 103 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 19) ) {
                    alt13=20;
                }
                else if ( LA13_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 20) ) {
                    alt13=21;
                }
                else if ( LA13_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 21) ) {
                    alt13=22;
                }
                else if ( LA13_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 22) ) {
                    alt13=23;
                }
                else if ( LA13_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 23) ) {
                    alt13=24;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLcDsl.g:511:4: ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:511:4: ({...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) ) )
            	    // InternalLcDsl.g:512:5: {...}? => ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalLcDsl.g:512:109: ( ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) ) )
            	    // InternalLcDsl.g:513:6: ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0);
            	    					
            	    // InternalLcDsl.g:516:9: ({...}? => ( (lv_clears_23_0= ruleClearOption ) ) )
            	    // InternalLcDsl.g:516:10: {...}? => ( (lv_clears_23_0= ruleClearOption ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:516:19: ( (lv_clears_23_0= ruleClearOption ) )
            	    // InternalLcDsl.g:516:20: (lv_clears_23_0= ruleClearOption )
            	    {
            	    // InternalLcDsl.g:516:20: (lv_clears_23_0= ruleClearOption )
            	    // InternalLcDsl.g:517:10: lv_clears_23_0= ruleClearOption
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getClearsClearOptionParserRuleCall_6_0_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_clears_23_0=ruleClearOption();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"clears",
            	    											lv_clears_23_0,
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
            	    // InternalLcDsl.g:539:4: ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:539:4: ({...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) ) )
            	    // InternalLcDsl.g:540:5: {...}? => ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalLcDsl.g:540:109: ( ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) ) )
            	    // InternalLcDsl.g:541:6: ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1);
            	    					
            	    // InternalLcDsl.g:544:9: ({...}? => ( (lv_workspace_24_0= ruleWorkspace ) ) )
            	    // InternalLcDsl.g:544:10: {...}? => ( (lv_workspace_24_0= ruleWorkspace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:544:19: ( (lv_workspace_24_0= ruleWorkspace ) )
            	    // InternalLcDsl.g:544:20: (lv_workspace_24_0= ruleWorkspace )
            	    {
            	    // InternalLcDsl.g:544:20: (lv_workspace_24_0= ruleWorkspace )
            	    // InternalLcDsl.g:545:10: lv_workspace_24_0= ruleWorkspace
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkspaceWorkspaceParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_workspace_24_0=ruleWorkspace();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"workspace",
            	    											lv_workspace_24_0,
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
            	    // InternalLcDsl.g:567:4: ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:567:4: ({...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) ) )
            	    // InternalLcDsl.g:568:5: {...}? => ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalLcDsl.g:568:109: ( ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) ) )
            	    // InternalLcDsl.g:569:6: ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2);
            	    					
            	    // InternalLcDsl.g:572:9: ({...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) ) )
            	    // InternalLcDsl.g:572:10: {...}? => ( (lv_workingDir_25_0= ruleWorkingDir ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:572:19: ( (lv_workingDir_25_0= ruleWorkingDir ) )
            	    // InternalLcDsl.g:572:20: (lv_workingDir_25_0= ruleWorkingDir )
            	    {
            	    // InternalLcDsl.g:572:20: (lv_workingDir_25_0= ruleWorkingDir )
            	    // InternalLcDsl.g:573:10: lv_workingDir_25_0= ruleWorkingDir
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkingDirWorkingDirParserRuleCall_6_2_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_workingDir_25_0=ruleWorkingDir();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"workingDir",
            	    											lv_workingDir_25_0,
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
            	    // InternalLcDsl.g:595:4: ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:595:4: ({...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) ) )
            	    // InternalLcDsl.g:596:5: {...}? => ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalLcDsl.g:596:109: ( ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) ) )
            	    // InternalLcDsl.g:597:6: ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3);
            	    					
            	    // InternalLcDsl.g:600:9: ({...}? => ( (lv_memory_26_0= ruleMemoryOption ) ) )
            	    // InternalLcDsl.g:600:10: {...}? => ( (lv_memory_26_0= ruleMemoryOption ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:600:19: ( (lv_memory_26_0= ruleMemoryOption ) )
            	    // InternalLcDsl.g:600:20: (lv_memory_26_0= ruleMemoryOption )
            	    {
            	    // InternalLcDsl.g:600:20: (lv_memory_26_0= ruleMemoryOption )
            	    // InternalLcDsl.g:601:10: lv_memory_26_0= ruleMemoryOption
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getMemoryMemoryOptionParserRuleCall_6_3_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_memory_26_0=ruleMemoryOption();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"memory",
            	    											lv_memory_26_0,
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
            	    // InternalLcDsl.g:623:4: ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:623:4: ({...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) ) )
            	    // InternalLcDsl.g:624:5: {...}? => ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalLcDsl.g:624:109: ( ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) ) )
            	    // InternalLcDsl.g:625:6: ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4);
            	    					
            	    // InternalLcDsl.g:628:9: ({...}? => ( (lv_mainProject_27_0= ruleMainProject ) ) )
            	    // InternalLcDsl.g:628:10: {...}? => ( (lv_mainProject_27_0= ruleMainProject ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:628:19: ( (lv_mainProject_27_0= ruleMainProject ) )
            	    // InternalLcDsl.g:628:20: (lv_mainProject_27_0= ruleMainProject )
            	    {
            	    // InternalLcDsl.g:628:20: (lv_mainProject_27_0= ruleMainProject )
            	    // InternalLcDsl.g:629:10: lv_mainProject_27_0= ruleMainProject
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getMainProjectMainProjectParserRuleCall_6_4_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_mainProject_27_0=ruleMainProject();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"mainProject",
            	    											lv_mainProject_27_0,
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
            	    // InternalLcDsl.g:651:4: ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:651:4: ({...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) ) )
            	    // InternalLcDsl.g:652:5: {...}? => ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalLcDsl.g:652:109: ( ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) ) )
            	    // InternalLcDsl.g:653:6: ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5);
            	    					
            	    // InternalLcDsl.g:656:9: ({...}? => ( (lv_mainType_28_0= ruleMainType ) ) )
            	    // InternalLcDsl.g:656:10: {...}? => ( (lv_mainType_28_0= ruleMainType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:656:19: ( (lv_mainType_28_0= ruleMainType ) )
            	    // InternalLcDsl.g:656:20: (lv_mainType_28_0= ruleMainType )
            	    {
            	    // InternalLcDsl.g:656:20: (lv_mainType_28_0= ruleMainType )
            	    // InternalLcDsl.g:657:10: lv_mainType_28_0= ruleMainType
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getMainTypeMainTypeParserRuleCall_6_5_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_mainType_28_0=ruleMainType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"mainType",
            	    											lv_mainType_28_0,
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
            	    // InternalLcDsl.g:679:4: ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:679:4: ({...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:680:5: {...}? => ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // InternalLcDsl.g:680:109: ( ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) ) )
            	    // InternalLcDsl.g:681:6: ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6);
            	    					
            	    // InternalLcDsl.g:684:9: ({...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) ) )
            	    // InternalLcDsl.g:684:10: {...}? => ( (lv_application_29_0= ruleApplicationExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:684:19: ( (lv_application_29_0= ruleApplicationExtPoint ) )
            	    // InternalLcDsl.g:684:20: (lv_application_29_0= ruleApplicationExtPoint )
            	    {
            	    // InternalLcDsl.g:684:20: (lv_application_29_0= ruleApplicationExtPoint )
            	    // InternalLcDsl.g:685:10: lv_application_29_0= ruleApplicationExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getApplicationApplicationExtPointParserRuleCall_6_6_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_application_29_0=ruleApplicationExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"application",
            	    											lv_application_29_0,
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
            	    // InternalLcDsl.g:707:4: ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:707:4: ({...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:708:5: {...}? => ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7)");
            	    }
            	    // InternalLcDsl.g:708:109: ( ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) ) )
            	    // InternalLcDsl.g:709:6: ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7);
            	    					
            	    // InternalLcDsl.g:712:9: ({...}? => ( (lv_product_30_0= ruleProductExtPoint ) ) )
            	    // InternalLcDsl.g:712:10: {...}? => ( (lv_product_30_0= ruleProductExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:712:19: ( (lv_product_30_0= ruleProductExtPoint ) )
            	    // InternalLcDsl.g:712:20: (lv_product_30_0= ruleProductExtPoint )
            	    {
            	    // InternalLcDsl.g:712:20: (lv_product_30_0= ruleProductExtPoint )
            	    // InternalLcDsl.g:713:10: lv_product_30_0= ruleProductExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getProductProductExtPointParserRuleCall_6_7_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_product_30_0=ruleProductExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"product",
            	    											lv_product_30_0,
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
            	    // InternalLcDsl.g:735:4: ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:735:4: ({...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) ) )
            	    // InternalLcDsl.g:736:5: {...}? => ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8)");
            	    }
            	    // InternalLcDsl.g:736:109: ( ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) ) )
            	    // InternalLcDsl.g:737:6: ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8);
            	    					
            	    // InternalLcDsl.g:740:9: ({...}? => ( (lv_favorites_31_0= ruleFavorites ) ) )
            	    // InternalLcDsl.g:740:10: {...}? => ( (lv_favorites_31_0= ruleFavorites ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:740:19: ( (lv_favorites_31_0= ruleFavorites ) )
            	    // InternalLcDsl.g:740:20: (lv_favorites_31_0= ruleFavorites )
            	    {
            	    // InternalLcDsl.g:740:20: (lv_favorites_31_0= ruleFavorites )
            	    // InternalLcDsl.g:741:10: lv_favorites_31_0= ruleFavorites
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getFavoritesFavoritesParserRuleCall_6_8_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_favorites_31_0=ruleFavorites();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"favorites",
            	    											lv_favorites_31_0,
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
            	    // InternalLcDsl.g:763:4: ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:763:4: ({...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) ) )
            	    // InternalLcDsl.g:764:5: {...}? => ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9)");
            	    }
            	    // InternalLcDsl.g:764:109: ( ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) ) )
            	    // InternalLcDsl.g:765:6: ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9);
            	    					
            	    // InternalLcDsl.g:768:9: ({...}? => ( (lv_redirect_32_0= ruleRedirect ) ) )
            	    // InternalLcDsl.g:768:10: {...}? => ( (lv_redirect_32_0= ruleRedirect ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:768:19: ( (lv_redirect_32_0= ruleRedirect ) )
            	    // InternalLcDsl.g:768:20: (lv_redirect_32_0= ruleRedirect )
            	    {
            	    // InternalLcDsl.g:768:20: (lv_redirect_32_0= ruleRedirect )
            	    // InternalLcDsl.g:769:10: lv_redirect_32_0= ruleRedirect
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getRedirectRedirectParserRuleCall_6_9_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_redirect_32_0=ruleRedirect();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"redirect",
            	    											lv_redirect_32_0,
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
            	    // InternalLcDsl.g:791:4: ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:791:4: ({...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) ) )
            	    // InternalLcDsl.g:792:5: {...}? => ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10)");
            	    }
            	    // InternalLcDsl.g:792:110: ( ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) ) )
            	    // InternalLcDsl.g:793:6: ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10);
            	    					
            	    // InternalLcDsl.g:796:9: ({...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) ) )
            	    // InternalLcDsl.g:796:10: {...}? => ( (lv_execEnv_33_0= ruleExecutionEnvironment ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:796:19: ( (lv_execEnv_33_0= ruleExecutionEnvironment ) )
            	    // InternalLcDsl.g:796:20: (lv_execEnv_33_0= ruleExecutionEnvironment )
            	    {
            	    // InternalLcDsl.g:796:20: (lv_execEnv_33_0= ruleExecutionEnvironment )
            	    // InternalLcDsl.g:797:10: lv_execEnv_33_0= ruleExecutionEnvironment
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getExecEnvExecutionEnvironmentParserRuleCall_6_10_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_execEnv_33_0=ruleExecutionEnvironment();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"execEnv",
            	    											lv_execEnv_33_0,
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
            	    // InternalLcDsl.g:819:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:819:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) ) )
            	    // InternalLcDsl.g:820:5: {...}? => ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11)");
            	    }
            	    // InternalLcDsl.g:820:110: ( ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) ) )
            	    // InternalLcDsl.g:821:6: ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11);
            	    					
            	    // InternalLcDsl.g:824:9: ({...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) ) )
            	    // InternalLcDsl.g:824:10: {...}? => ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:824:19: ( (lv_configIniTemplate_34_0= ruleConfigIniTemplate ) )
            	    // InternalLcDsl.g:824:20: (lv_configIniTemplate_34_0= ruleConfigIniTemplate )
            	    {
            	    // InternalLcDsl.g:824:20: (lv_configIniTemplate_34_0= ruleConfigIniTemplate )
            	    // InternalLcDsl.g:825:10: lv_configIniTemplate_34_0= ruleConfigIniTemplate
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getConfigIniTemplateConfigIniTemplateParserRuleCall_6_11_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_configIniTemplate_34_0=ruleConfigIniTemplate();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"configIniTemplate",
            	    											lv_configIniTemplate_34_0,
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
            	    // InternalLcDsl.g:847:4: ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:847:4: ({...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) ) )
            	    // InternalLcDsl.g:848:5: {...}? => ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12)");
            	    }
            	    // InternalLcDsl.g:848:110: ( ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) ) )
            	    // InternalLcDsl.g:849:6: ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12);
            	    					
            	    // InternalLcDsl.g:852:9: ({...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) ) )
            	    // InternalLcDsl.g:852:10: {...}? => ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:852:19: ( (lv_javaMainSearch_35_0= ruleJavaMainSearch ) )
            	    // InternalLcDsl.g:852:20: (lv_javaMainSearch_35_0= ruleJavaMainSearch )
            	    {
            	    // InternalLcDsl.g:852:20: (lv_javaMainSearch_35_0= ruleJavaMainSearch )
            	    // InternalLcDsl.g:853:10: lv_javaMainSearch_35_0= ruleJavaMainSearch
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getJavaMainSearchJavaMainSearchParserRuleCall_6_12_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_javaMainSearch_35_0=ruleJavaMainSearch();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"javaMainSearch",
            	    											lv_javaMainSearch_35_0,
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
            	    // InternalLcDsl.g:875:4: ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:875:4: ({...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) ) )
            	    // InternalLcDsl.g:876:5: {...}? => ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13)");
            	    }
            	    // InternalLcDsl.g:876:110: ( ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) ) )
            	    // InternalLcDsl.g:877:6: ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13);
            	    					
            	    // InternalLcDsl.g:880:9: ({...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) ) )
            	    // InternalLcDsl.g:880:10: {...}? => ( (lv_servletConfig_36_0= ruleRapServletConfig ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:880:19: ( (lv_servletConfig_36_0= ruleRapServletConfig ) )
            	    // InternalLcDsl.g:880:20: (lv_servletConfig_36_0= ruleRapServletConfig )
            	    {
            	    // InternalLcDsl.g:880:20: (lv_servletConfig_36_0= ruleRapServletConfig )
            	    // InternalLcDsl.g:881:10: lv_servletConfig_36_0= ruleRapServletConfig
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getServletConfigRapServletConfigParserRuleCall_6_13_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_servletConfig_36_0=ruleRapServletConfig();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"servletConfig",
            	    											lv_servletConfig_36_0,
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
            	case 15 :
            	    // InternalLcDsl.g:903:4: ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:903:4: ({...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) ) )
            	    // InternalLcDsl.g:904:5: {...}? => ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 14)");
            	    }
            	    // InternalLcDsl.g:904:110: ( ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) ) )
            	    // InternalLcDsl.g:905:6: ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 14);
            	    					
            	    // InternalLcDsl.g:908:9: ({...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) ) )
            	    // InternalLcDsl.g:908:10: {...}? => ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:908:19: ( (lv_contentProviderProduct_37_0= ruleContentProviderProduct ) )
            	    // InternalLcDsl.g:908:20: (lv_contentProviderProduct_37_0= ruleContentProviderProduct )
            	    {
            	    // InternalLcDsl.g:908:20: (lv_contentProviderProduct_37_0= ruleContentProviderProduct )
            	    // InternalLcDsl.g:909:10: lv_contentProviderProduct_37_0= ruleContentProviderProduct
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getContentProviderProductContentProviderProductParserRuleCall_6_14_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_contentProviderProduct_37_0=ruleContentProviderProduct();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"contentProviderProduct",
            	    											lv_contentProviderProduct_37_0,
            	    											"com.wamas.ide.launching.LcDsl.ContentProviderProduct");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalLcDsl.g:931:4: ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:931:4: ({...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) ) )
            	    // InternalLcDsl.g:932:5: {...}? => ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 15)");
            	    }
            	    // InternalLcDsl.g:932:110: ( ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) ) )
            	    // InternalLcDsl.g:933:6: ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 15);
            	    					
            	    // InternalLcDsl.g:936:9: ({...}? => ( (lv_test_38_0= ruleTestConfig ) ) )
            	    // InternalLcDsl.g:936:10: {...}? => ( (lv_test_38_0= ruleTestConfig ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:936:19: ( (lv_test_38_0= ruleTestConfig ) )
            	    // InternalLcDsl.g:936:20: (lv_test_38_0= ruleTestConfig )
            	    {
            	    // InternalLcDsl.g:936:20: (lv_test_38_0= ruleTestConfig )
            	    // InternalLcDsl.g:937:10: lv_test_38_0= ruleTestConfig
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getTestTestConfigParserRuleCall_6_15_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_test_38_0=ruleTestConfig();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"test",
            	    											lv_test_38_0,
            	    											"com.wamas.ide.launching.LcDsl.TestConfig");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalLcDsl.g:959:4: ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) )
            	    {
            	    // InternalLcDsl.g:959:4: ({...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ ) )
            	    // InternalLcDsl.g:960:5: {...}? => ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 16)");
            	    }
            	    // InternalLcDsl.g:960:110: ( ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+ )
            	    // InternalLcDsl.g:961:6: ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 16);
            	    					
            	    // InternalLcDsl.g:964:9: ({...}? => ( (lv_plugins_39_0= ruleAddPlugin ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==39) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }
            	        else if ( (LA5_0==40) ) {
            	            int LA5_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalLcDsl.g:964:10: {...}? => ( (lv_plugins_39_0= ruleAddPlugin ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    	    }
            	    	    // InternalLcDsl.g:964:19: ( (lv_plugins_39_0= ruleAddPlugin ) )
            	    	    // InternalLcDsl.g:964:20: (lv_plugins_39_0= ruleAddPlugin )
            	    	    {
            	    	    // InternalLcDsl.g:964:20: (lv_plugins_39_0= ruleAddPlugin )
            	    	    // InternalLcDsl.g:965:10: lv_plugins_39_0= ruleAddPlugin
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getPluginsAddPluginParserRuleCall_6_16_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_plugins_39_0=ruleAddPlugin();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"plugins",
            	    	    											lv_plugins_39_0,
            	    	    											"com.wamas.ide.launching.LcDsl.AddPlugin");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalLcDsl.g:987:4: ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) )
            	    {
            	    // InternalLcDsl.g:987:4: ({...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ ) )
            	    // InternalLcDsl.g:988:5: {...}? => ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 17)");
            	    }
            	    // InternalLcDsl.g:988:110: ( ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+ )
            	    // InternalLcDsl.g:989:6: ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 17);
            	    					
            	    // InternalLcDsl.g:992:9: ({...}? => ( (lv_features_40_0= ruleAddFeature ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==39) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }
            	        else if ( (LA6_0==41) ) {
            	            int LA6_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalLcDsl.g:992:10: {...}? => ( (lv_features_40_0= ruleAddFeature ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    	    }
            	    	    // InternalLcDsl.g:992:19: ( (lv_features_40_0= ruleAddFeature ) )
            	    	    // InternalLcDsl.g:992:20: (lv_features_40_0= ruleAddFeature )
            	    	    {
            	    	    // InternalLcDsl.g:992:20: (lv_features_40_0= ruleAddFeature )
            	    	    // InternalLcDsl.g:993:10: lv_features_40_0= ruleAddFeature
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getFeaturesAddFeatureParserRuleCall_6_17_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_features_40_0=ruleAddFeature();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"features",
            	    	    											lv_features_40_0,
            	    	    											"com.wamas.ide.launching.LcDsl.AddFeature");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalLcDsl.g:1015:4: ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) )
            	    {
            	    // InternalLcDsl.g:1015:4: ({...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ ) )
            	    // InternalLcDsl.g:1016:5: {...}? => ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 18)");
            	    }
            	    // InternalLcDsl.g:1016:110: ( ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+ )
            	    // InternalLcDsl.g:1017:6: ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 18);
            	    					
            	    // InternalLcDsl.g:1020:9: ({...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==43) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalLcDsl.g:1020:10: {...}? => ( (lv_ignore_41_0= ruleIgnorePlugin ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    	    }
            	    	    // InternalLcDsl.g:1020:19: ( (lv_ignore_41_0= ruleIgnorePlugin ) )
            	    	    // InternalLcDsl.g:1020:20: (lv_ignore_41_0= ruleIgnorePlugin )
            	    	    {
            	    	    // InternalLcDsl.g:1020:20: (lv_ignore_41_0= ruleIgnorePlugin )
            	    	    // InternalLcDsl.g:1021:10: lv_ignore_41_0= ruleIgnorePlugin
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getIgnoreIgnorePluginParserRuleCall_6_18_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_ignore_41_0=ruleIgnorePlugin();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"ignore",
            	    	    											lv_ignore_41_0,
            	    	    											"com.wamas.ide.launching.LcDsl.IgnorePlugin");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalLcDsl.g:1043:4: ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) )
            	    {
            	    // InternalLcDsl.g:1043:4: ({...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ ) )
            	    // InternalLcDsl.g:1044:5: {...}? => ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 19) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 19)");
            	    }
            	    // InternalLcDsl.g:1044:110: ( ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+ )
            	    // InternalLcDsl.g:1045:6: ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 19);
            	    					
            	    // InternalLcDsl.g:1048:9: ({...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        switch ( input.LA(1) ) {
            	        case 99:
            	            {
            	            int LA8_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	            }
            	            break;
            	        case 100:
            	            {
            	            int LA8_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	            }
            	            break;
            	        case 101:
            	            {
            	            int LA8_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	            }
            	            break;
            	        case 102:
            	            {
            	            int LA8_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	            }
            	            break;
            	        case 103:
            	            {
            	            int LA8_6 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	            }
            	            break;
            	        case 76:
            	            {
            	            int LA8_7 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	            }
            	            break;
            	        case 77:
            	            {
            	            int LA8_8 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalLcDsl.g:1048:10: {...}? => ( (lv_groupMembers_42_0= ruleGroupMember ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    	    }
            	    	    // InternalLcDsl.g:1048:19: ( (lv_groupMembers_42_0= ruleGroupMember ) )
            	    	    // InternalLcDsl.g:1048:20: (lv_groupMembers_42_0= ruleGroupMember )
            	    	    {
            	    	    // InternalLcDsl.g:1048:20: (lv_groupMembers_42_0= ruleGroupMember )
            	    	    // InternalLcDsl.g:1049:10: lv_groupMembers_42_0= ruleGroupMember
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getGroupMembersGroupMemberParserRuleCall_6_19_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_groupMembers_42_0=ruleGroupMember();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"groupMembers",
            	    	    											lv_groupMembers_42_0,
            	    	    											"com.wamas.ide.launching.LcDsl.GroupMember");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // InternalLcDsl.g:1071:4: ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) )
            	    {
            	    // InternalLcDsl.g:1071:4: ({...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ ) )
            	    // InternalLcDsl.g:1072:5: {...}? => ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 20) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 20)");
            	    }
            	    // InternalLcDsl.g:1072:110: ( ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+ )
            	    // InternalLcDsl.g:1073:6: ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 20);
            	    					
            	    // InternalLcDsl.g:1076:9: ({...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==44) ) {
            	            int LA9_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalLcDsl.g:1076:10: {...}? => ( (lv_vmArgs_43_0= ruleVmArgument ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    	    }
            	    	    // InternalLcDsl.g:1076:19: ( (lv_vmArgs_43_0= ruleVmArgument ) )
            	    	    // InternalLcDsl.g:1076:20: (lv_vmArgs_43_0= ruleVmArgument )
            	    	    {
            	    	    // InternalLcDsl.g:1076:20: (lv_vmArgs_43_0= ruleVmArgument )
            	    	    // InternalLcDsl.g:1077:10: lv_vmArgs_43_0= ruleVmArgument
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getVmArgsVmArgumentParserRuleCall_6_20_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_vmArgs_43_0=ruleVmArgument();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"vmArgs",
            	    	    											lv_vmArgs_43_0,
            	    	    											"com.wamas.ide.launching.LcDsl.VmArgument");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // InternalLcDsl.g:1099:4: ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) )
            	    {
            	    // InternalLcDsl.g:1099:4: ({...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ ) )
            	    // InternalLcDsl.g:1100:5: {...}? => ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 21) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 21)");
            	    }
            	    // InternalLcDsl.g:1100:110: ( ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+ )
            	    // InternalLcDsl.g:1101:6: ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 21);
            	    					
            	    // InternalLcDsl.g:1104:9: ({...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==45) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalLcDsl.g:1104:10: {...}? => ( (lv_progArgs_44_0= ruleProgramArgument ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    	    }
            	    	    // InternalLcDsl.g:1104:19: ( (lv_progArgs_44_0= ruleProgramArgument ) )
            	    	    // InternalLcDsl.g:1104:20: (lv_progArgs_44_0= ruleProgramArgument )
            	    	    {
            	    	    // InternalLcDsl.g:1104:20: (lv_progArgs_44_0= ruleProgramArgument )
            	    	    // InternalLcDsl.g:1105:10: lv_progArgs_44_0= ruleProgramArgument
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getProgArgsProgramArgumentParserRuleCall_6_21_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_progArgs_44_0=ruleProgramArgument();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"progArgs",
            	    	    											lv_progArgs_44_0,
            	    	    											"com.wamas.ide.launching.LcDsl.ProgramArgument");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 23 :
            	    // InternalLcDsl.g:1127:4: ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) )
            	    {
            	    // InternalLcDsl.g:1127:4: ({...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ ) )
            	    // InternalLcDsl.g:1128:5: {...}? => ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 22) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 22)");
            	    }
            	    // InternalLcDsl.g:1128:110: ( ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+ )
            	    // InternalLcDsl.g:1129:6: ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 22);
            	    					
            	    // InternalLcDsl.g:1132:9: ({...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==46) ) {
            	            int LA11_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt11=1;
            	            }


            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalLcDsl.g:1132:10: {...}? => ( (lv_envVars_45_0= ruleEnvironmentVariable ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    	    }
            	    	    // InternalLcDsl.g:1132:19: ( (lv_envVars_45_0= ruleEnvironmentVariable ) )
            	    	    // InternalLcDsl.g:1132:20: (lv_envVars_45_0= ruleEnvironmentVariable )
            	    	    {
            	    	    // InternalLcDsl.g:1132:20: (lv_envVars_45_0= ruleEnvironmentVariable )
            	    	    // InternalLcDsl.g:1133:10: lv_envVars_45_0= ruleEnvironmentVariable
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getEnvVarsEnvironmentVariableParserRuleCall_6_22_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_envVars_45_0=ruleEnvironmentVariable();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"envVars",
            	    	    											lv_envVars_45_0,
            	    	    											"com.wamas.ide.launching.LcDsl.EnvironmentVariable");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // InternalLcDsl.g:1155:4: ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) )
            	    {
            	    // InternalLcDsl.g:1155:4: ({...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ ) )
            	    // InternalLcDsl.g:1156:5: {...}? => ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 23) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 23)");
            	    }
            	    // InternalLcDsl.g:1156:110: ( ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+ )
            	    // InternalLcDsl.g:1157:6: ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 23);
            	    					
            	    // InternalLcDsl.g:1160:9: ({...}? => ( (lv_traces_46_0= ruleTraceEnablement ) ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==56) ) {
            	            int LA12_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt12=1;
            	            }


            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalLcDsl.g:1160:10: {...}? => ( (lv_traces_46_0= ruleTraceEnablement ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    	    }
            	    	    // InternalLcDsl.g:1160:19: ( (lv_traces_46_0= ruleTraceEnablement ) )
            	    	    // InternalLcDsl.g:1160:20: (lv_traces_46_0= ruleTraceEnablement )
            	    	    {
            	    	    // InternalLcDsl.g:1160:20: (lv_traces_46_0= ruleTraceEnablement )
            	    	    // InternalLcDsl.g:1161:10: lv_traces_46_0= ruleTraceEnablement
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getTracesTraceEnablementParserRuleCall_6_23_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_traces_46_0=ruleTraceEnablement();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"traces",
            	    	    											lv_traces_46_0,
            	    	    											"com.wamas.ide.launching.LcDsl.TraceEnablement");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            				

            }

            this_BLOCK_END_47=(Token)match(input,RULE_BLOCK_END,FOLLOW_2); 

            			newLeafNode(this_BLOCK_END_47, grammarAccess.getLaunchConfigAccess().getBLOCK_ENDTerminalRuleCall_7());
            		

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
    // InternalLcDsl.g:1198:1: entryRuleWorkspace returns [EObject current=null] : iv_ruleWorkspace= ruleWorkspace EOF ;
    public final EObject entryRuleWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkspace = null;


        try {
            // InternalLcDsl.g:1198:50: (iv_ruleWorkspace= ruleWorkspace EOF )
            // InternalLcDsl.g:1199:2: iv_ruleWorkspace= ruleWorkspace EOF
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
    // InternalLcDsl.g:1205:1: ruleWorkspace returns [EObject current=null] : (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleWorkspace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_workspace_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1211:2: ( (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1212:2: (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1212:2: (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1213:3: otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkspaceAccess().getWorkspaceKeyword_0());
            		
            // InternalLcDsl.g:1217:3: ( (lv_workspace_1_0= ruleAnyPath ) )
            // InternalLcDsl.g:1218:4: (lv_workspace_1_0= ruleAnyPath )
            {
            // InternalLcDsl.g:1218:4: (lv_workspace_1_0= ruleAnyPath )
            // InternalLcDsl.g:1219:5: lv_workspace_1_0= ruleAnyPath
            {

            					newCompositeNode(grammarAccess.getWorkspaceAccess().getWorkspaceAnyPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1244:1: entryRuleWorkingDir returns [EObject current=null] : iv_ruleWorkingDir= ruleWorkingDir EOF ;
    public final EObject entryRuleWorkingDir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingDir = null;


        try {
            // InternalLcDsl.g:1244:51: (iv_ruleWorkingDir= ruleWorkingDir EOF )
            // InternalLcDsl.g:1245:2: iv_ruleWorkingDir= ruleWorkingDir EOF
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
    // InternalLcDsl.g:1251:1: ruleWorkingDir returns [EObject current=null] : (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleWorkingDir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_workingDir_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1257:2: ( (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1258:2: (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1258:2: (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1259:3: otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkingDirAccess().getWorkingDirKeyword_0());
            		
            // InternalLcDsl.g:1263:3: ( (lv_workingDir_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:1264:4: (lv_workingDir_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:1264:4: (lv_workingDir_1_0= ruleExistingPath )
            // InternalLcDsl.g:1265:5: lv_workingDir_1_0= ruleExistingPath
            {

            					newCompositeNode(grammarAccess.getWorkingDirAccess().getWorkingDirExistingPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1290:1: entryRuleMainProject returns [EObject current=null] : iv_ruleMainProject= ruleMainProject EOF ;
    public final EObject entryRuleMainProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainProject = null;


        try {
            // InternalLcDsl.g:1290:52: (iv_ruleMainProject= ruleMainProject EOF )
            // InternalLcDsl.g:1291:2: iv_ruleMainProject= ruleMainProject EOF
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
    // InternalLcDsl.g:1297:1: ruleMainProject returns [EObject current=null] : (otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleMainProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_self_1_0=null;
        Token otherlv_3=null;
        EObject lv_project_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1303:2: ( (otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';' ) )
            // InternalLcDsl.g:1304:2: (otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';' )
            {
            // InternalLcDsl.g:1304:2: (otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';' )
            // InternalLcDsl.g:1305:3: otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMainProjectAccess().getProjectKeyword_0());
            		
            // InternalLcDsl.g:1309:3: ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLcDsl.g:1310:4: ( (lv_self_1_0= 'self' ) )
                    {
                    // InternalLcDsl.g:1310:4: ( (lv_self_1_0= 'self' ) )
                    // InternalLcDsl.g:1311:5: (lv_self_1_0= 'self' )
                    {
                    // InternalLcDsl.g:1311:5: (lv_self_1_0= 'self' )
                    // InternalLcDsl.g:1312:6: lv_self_1_0= 'self'
                    {
                    lv_self_1_0=(Token)match(input,37,FOLLOW_13); 

                    						newLeafNode(lv_self_1_0, grammarAccess.getMainProjectAccess().getSelfSelfKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainProjectRule());
                    						}
                    						setWithLastConsumed(current, "self", lv_self_1_0 != null, "self");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:1325:4: ( (lv_project_2_0= ruleProject ) )
                    {
                    // InternalLcDsl.g:1325:4: ( (lv_project_2_0= ruleProject ) )
                    // InternalLcDsl.g:1326:5: (lv_project_2_0= ruleProject )
                    {
                    // InternalLcDsl.g:1326:5: (lv_project_2_0= ruleProject )
                    // InternalLcDsl.g:1327:6: lv_project_2_0= ruleProject
                    {

                    						newCompositeNode(grammarAccess.getMainProjectAccess().getProjectProjectParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_project_2_0=ruleProject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMainProjectRule());
                    						}
                    						set(
                    							current,
                    							"project",
                    							lv_project_2_0,
                    							"com.wamas.ide.launching.LcDsl.Project");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMainProjectAccess().getSemicolonKeyword_2());
            		

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
    // InternalLcDsl.g:1353:1: entryRuleMainType returns [EObject current=null] : iv_ruleMainType= ruleMainType EOF ;
    public final EObject entryRuleMainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainType = null;


        try {
            // InternalLcDsl.g:1353:49: (iv_ruleMainType= ruleMainType EOF )
            // InternalLcDsl.g:1354:2: iv_ruleMainType= ruleMainType EOF
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
    // InternalLcDsl.g:1360:1: ruleMainType returns [EObject current=null] : (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' ) ;
    public final EObject ruleMainType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_mainClass_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1366:2: ( (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1367:2: (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1367:2: (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1368:3: otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMainTypeAccess().getMainClassKeyword_0());
            		
            // InternalLcDsl.g:1372:3: ( (lv_mainClass_1_0= ruleJavaMainType ) )
            // InternalLcDsl.g:1373:4: (lv_mainClass_1_0= ruleJavaMainType )
            {
            // InternalLcDsl.g:1373:4: (lv_mainClass_1_0= ruleJavaMainType )
            // InternalLcDsl.g:1374:5: lv_mainClass_1_0= ruleJavaMainType
            {

            					newCompositeNode(grammarAccess.getMainTypeAccess().getMainClassJavaMainTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1399:1: entryRuleAddPlugin returns [EObject current=null] : iv_ruleAddPlugin= ruleAddPlugin EOF ;
    public final EObject entryRuleAddPlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPlugin = null;


        try {
            // InternalLcDsl.g:1399:50: (iv_ruleAddPlugin= ruleAddPlugin EOF )
            // InternalLcDsl.g:1400:2: iv_ruleAddPlugin= ruleAddPlugin EOF
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
    // InternalLcDsl.g:1406:1: ruleAddPlugin returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';' ) ;
    public final EObject ruleAddPlugin() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_plugin_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1412:2: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';' ) )
            // InternalLcDsl.g:1413:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';' )
            {
            // InternalLcDsl.g:1413:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';' )
            // InternalLcDsl.g:1414:3: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';'
            {
            // InternalLcDsl.g:1414:3: ( (lv_optional_0_0= 'optional' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLcDsl.g:1415:4: (lv_optional_0_0= 'optional' )
                    {
                    // InternalLcDsl.g:1415:4: (lv_optional_0_0= 'optional' )
                    // InternalLcDsl.g:1416:5: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,39,FOLLOW_15); 

                    					newLeafNode(lv_optional_0_0, grammarAccess.getAddPluginAccess().getOptionalOptionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddPluginRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_0_0 != null, "optional");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddPluginAccess().getPluginKeyword_1());
            		
            // InternalLcDsl.g:1432:3: ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) )
            // InternalLcDsl.g:1433:4: (lv_plugin_2_0= rulePluginWithVersionAndStartLevel )
            {
            // InternalLcDsl.g:1433:4: (lv_plugin_2_0= rulePluginWithVersionAndStartLevel )
            // InternalLcDsl.g:1434:5: lv_plugin_2_0= rulePluginWithVersionAndStartLevel
            {

            					newCompositeNode(grammarAccess.getAddPluginAccess().getPluginPluginWithVersionAndStartLevelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_plugin_2_0=rulePluginWithVersionAndStartLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddPluginRule());
            					}
            					set(
            						current,
            						"plugin",
            						lv_plugin_2_0,
            						"com.wamas.ide.launching.LcDsl.PluginWithVersionAndStartLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAddPluginAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleAddFeature"
    // InternalLcDsl.g:1459:1: entryRuleAddFeature returns [EObject current=null] : iv_ruleAddFeature= ruleAddFeature EOF ;
    public final EObject entryRuleAddFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddFeature = null;


        try {
            // InternalLcDsl.g:1459:51: (iv_ruleAddFeature= ruleAddFeature EOF )
            // InternalLcDsl.g:1460:2: iv_ruleAddFeature= ruleAddFeature EOF
            {
             newCompositeNode(grammarAccess.getAddFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddFeature=ruleAddFeature();

            state._fsp--;

             current =iv_ruleAddFeature; 
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
    // $ANTLR end "entryRuleAddFeature"


    // $ANTLR start "ruleAddFeature"
    // InternalLcDsl.g:1466:1: ruleAddFeature returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';' ) ;
    public final EObject ruleAddFeature() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_feature_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1472:2: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';' ) )
            // InternalLcDsl.g:1473:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';' )
            {
            // InternalLcDsl.g:1473:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';' )
            // InternalLcDsl.g:1474:3: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';'
            {
            // InternalLcDsl.g:1474:3: ( (lv_optional_0_0= 'optional' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLcDsl.g:1475:4: (lv_optional_0_0= 'optional' )
                    {
                    // InternalLcDsl.g:1475:4: (lv_optional_0_0= 'optional' )
                    // InternalLcDsl.g:1476:5: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,39,FOLLOW_16); 

                    					newLeafNode(lv_optional_0_0, grammarAccess.getAddFeatureAccess().getOptionalOptionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddFeatureRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_0_0 != null, "optional");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddFeatureAccess().getFeatureKeyword_1());
            		
            // InternalLcDsl.g:1492:3: ( (lv_feature_2_0= ruleFeatureWithVersion ) )
            // InternalLcDsl.g:1493:4: (lv_feature_2_0= ruleFeatureWithVersion )
            {
            // InternalLcDsl.g:1493:4: (lv_feature_2_0= ruleFeatureWithVersion )
            // InternalLcDsl.g:1494:5: lv_feature_2_0= ruleFeatureWithVersion
            {

            					newCompositeNode(grammarAccess.getAddFeatureAccess().getFeatureFeatureWithVersionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_feature_2_0=ruleFeatureWithVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddFeatureRule());
            					}
            					set(
            						current,
            						"feature",
            						lv_feature_2_0,
            						"com.wamas.ide.launching.LcDsl.FeatureWithVersion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAddFeatureAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAddFeature"


    // $ANTLR start "entryRuleContentProviderProduct"
    // InternalLcDsl.g:1519:1: entryRuleContentProviderProduct returns [EObject current=null] : iv_ruleContentProviderProduct= ruleContentProviderProduct EOF ;
    public final EObject entryRuleContentProviderProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProviderProduct = null;


        try {
            // InternalLcDsl.g:1519:63: (iv_ruleContentProviderProduct= ruleContentProviderProduct EOF )
            // InternalLcDsl.g:1520:2: iv_ruleContentProviderProduct= ruleContentProviderProduct EOF
            {
             newCompositeNode(grammarAccess.getContentProviderProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentProviderProduct=ruleContentProviderProduct();

            state._fsp--;

             current =iv_ruleContentProviderProduct; 
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
    // $ANTLR end "entryRuleContentProviderProduct"


    // $ANTLR start "ruleContentProviderProduct"
    // InternalLcDsl.g:1526:1: ruleContentProviderProduct returns [EObject current=null] : (otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleContentProviderProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_product_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1532:2: ( (otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1533:2: (otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1533:2: (otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1534:3: otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContentProviderProductAccess().getContentProviderKeyword_0());
            		
            // InternalLcDsl.g:1538:3: ( (lv_product_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:1539:4: (lv_product_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:1539:4: (lv_product_1_0= ruleExistingPath )
            // InternalLcDsl.g:1540:5: lv_product_1_0= ruleExistingPath
            {

            					newCompositeNode(grammarAccess.getContentProviderProductAccess().getProductExistingPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_product_1_0=ruleExistingPath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentProviderProductRule());
            					}
            					set(
            						current,
            						"product",
            						lv_product_1_0,
            						"com.wamas.ide.launching.LcDsl.ExistingPath");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getContentProviderProductAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleContentProviderProduct"


    // $ANTLR start "entryRuleIgnorePlugin"
    // InternalLcDsl.g:1565:1: entryRuleIgnorePlugin returns [EObject current=null] : iv_ruleIgnorePlugin= ruleIgnorePlugin EOF ;
    public final EObject entryRuleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnorePlugin = null;


        try {
            // InternalLcDsl.g:1565:53: (iv_ruleIgnorePlugin= ruleIgnorePlugin EOF )
            // InternalLcDsl.g:1566:2: iv_ruleIgnorePlugin= ruleIgnorePlugin EOF
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
    // InternalLcDsl.g:1572:1: ruleIgnorePlugin returns [EObject current=null] : (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) ;
    public final EObject ruleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1578:2: ( (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1579:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1579:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1580:3: otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIgnorePluginAccess().getIgnoreKeyword_0());
            		
            // InternalLcDsl.g:1584:3: ( (lv_plugin_1_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:1585:4: (lv_plugin_1_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:1585:4: (lv_plugin_1_0= rulePluginWithVersion )
            // InternalLcDsl.g:1586:5: lv_plugin_1_0= rulePluginWithVersion
            {

            					newCompositeNode(grammarAccess.getIgnorePluginAccess().getPluginPluginWithVersionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1611:1: entryRuleVmArgument returns [EObject current=null] : iv_ruleVmArgument= ruleVmArgument EOF ;
    public final EObject entryRuleVmArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVmArgument = null;


        try {
            // InternalLcDsl.g:1611:51: (iv_ruleVmArgument= ruleVmArgument EOF )
            // InternalLcDsl.g:1612:2: iv_ruleVmArgument= ruleVmArgument EOF
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
    // InternalLcDsl.g:1618:1: ruleVmArgument returns [EObject current=null] : ( () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) ;
    public final EObject ruleVmArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1624:2: ( ( () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1625:2: ( () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1625:2: ( () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1626:3: () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1626:3: ()
            // InternalLcDsl.g:1627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVmArgumentAccess().getVmArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getVmArgumentAccess().getVmArgumentKeyword_1());
            		
            // InternalLcDsl.g:1637:3: ( (lv_arguments_2_0= ruleStringWithVariables ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLcDsl.g:1638:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    {
            	    // InternalLcDsl.g:1638:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    // InternalLcDsl.g:1639:5: lv_arguments_2_0= ruleStringWithVariables
            	    {

            	    					newCompositeNode(grammarAccess.getVmArgumentAccess().getArgumentsStringWithVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1664:1: entryRuleProgramArgument returns [EObject current=null] : iv_ruleProgramArgument= ruleProgramArgument EOF ;
    public final EObject entryRuleProgramArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramArgument = null;


        try {
            // InternalLcDsl.g:1664:56: (iv_ruleProgramArgument= ruleProgramArgument EOF )
            // InternalLcDsl.g:1665:2: iv_ruleProgramArgument= ruleProgramArgument EOF
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
    // InternalLcDsl.g:1671:1: ruleProgramArgument returns [EObject current=null] : ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) ;
    public final EObject ruleProgramArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1677:2: ( ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1678:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1678:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1679:3: () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1679:3: ()
            // InternalLcDsl.g:1680:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramArgumentAccess().getProgramArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramArgumentAccess().getArgumentKeyword_1());
            		
            // InternalLcDsl.g:1690:3: ( (lv_arguments_2_0= ruleStringWithVariables ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLcDsl.g:1691:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    {
            	    // InternalLcDsl.g:1691:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    // InternalLcDsl.g:1692:5: lv_arguments_2_0= ruleStringWithVariables
            	    {

            	    					newCompositeNode(grammarAccess.getProgramArgumentAccess().getArgumentsStringWithVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1717:1: entryRuleEnvironmentVariable returns [EObject current=null] : iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF ;
    public final EObject entryRuleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariable = null;


        try {
            // InternalLcDsl.g:1717:60: (iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF )
            // InternalLcDsl.g:1718:2: iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF
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
    // InternalLcDsl.g:1724:1: ruleEnvironmentVariable returns [EObject current=null] : ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' ) ;
    public final EObject ruleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_EQ_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1730:2: ( ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:1731:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:1731:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' )
            // InternalLcDsl.g:1732:3: () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:1732:3: ()
            // InternalLcDsl.g:1733:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentVariableAccess().getEnvironmentVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentVariableAccess().getEnvironmentKeyword_1());
            		
            // InternalLcDsl.g:1743:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLcDsl.g:1744:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLcDsl.g:1744:4: (lv_name_2_0= RULE_ID )
            // InternalLcDsl.g:1745:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            this_EQ_3=(Token)match(input,RULE_EQ,FOLLOW_6); 

            			newLeafNode(this_EQ_3, grammarAccess.getEnvironmentVariableAccess().getEQTerminalRuleCall_3());
            		
            // InternalLcDsl.g:1765:3: ( (lv_value_4_0= ruleStringWithVariables ) )
            // InternalLcDsl.g:1766:4: (lv_value_4_0= ruleStringWithVariables )
            {
            // InternalLcDsl.g:1766:4: (lv_value_4_0= ruleStringWithVariables )
            // InternalLcDsl.g:1767:5: lv_value_4_0= ruleStringWithVariables
            {

            					newCompositeNode(grammarAccess.getEnvironmentVariableAccess().getValueStringWithVariablesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1792:1: entryRuleApplicationExtPoint returns [EObject current=null] : iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF ;
    public final EObject entryRuleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationExtPoint = null;


        try {
            // InternalLcDsl.g:1792:60: (iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF )
            // InternalLcDsl.g:1793:2: iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF
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
    // InternalLcDsl.g:1799:1: ruleApplicationExtPoint returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1805:2: ( (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1806:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1806:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1807:3: otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationExtPointAccess().getApplicationKeyword_0());
            		
            // InternalLcDsl.g:1811:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1812:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1812:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1813:5: lv_name_1_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getApplicationExtPointAccess().getNameFQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1838:1: entryRuleProductExtPoint returns [EObject current=null] : iv_ruleProductExtPoint= ruleProductExtPoint EOF ;
    public final EObject entryRuleProductExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductExtPoint = null;


        try {
            // InternalLcDsl.g:1838:56: (iv_ruleProductExtPoint= ruleProductExtPoint EOF )
            // InternalLcDsl.g:1839:2: iv_ruleProductExtPoint= ruleProductExtPoint EOF
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
    // InternalLcDsl.g:1845:1: ruleProductExtPoint returns [EObject current=null] : (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleProductExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1851:2: ( (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1852:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1852:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1853:3: otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProductExtPointAccess().getProductKeyword_0());
            		
            // InternalLcDsl.g:1857:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1858:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1858:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1859:5: lv_name_1_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getProductExtPointAccess().getNameFQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1884:1: entryRuleFavorites returns [EObject current=null] : iv_ruleFavorites= ruleFavorites EOF ;
    public final EObject entryRuleFavorites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFavorites = null;


        try {
            // InternalLcDsl.g:1884:50: (iv_ruleFavorites= ruleFavorites EOF )
            // InternalLcDsl.g:1885:2: iv_ruleFavorites= ruleFavorites EOF
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
    // InternalLcDsl.g:1891:1: ruleFavorites returns [EObject current=null] : ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' ) ;
    public final EObject ruleFavorites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1897:2: ( ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1898:2: ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1898:2: ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1899:3: () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1899:3: ()
            // InternalLcDsl.g:1900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFavoritesAccess().getFavoritesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getFavoritesAccess().getFavoriteKeyword_1());
            		
            // InternalLcDsl.g:1910:3: ( (lv_types_2_0= ruleLaunchModeType ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=99 && LA19_0<=103)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLcDsl.g:1911:4: (lv_types_2_0= ruleLaunchModeType )
            	    {
            	    // InternalLcDsl.g:1911:4: (lv_types_2_0= ruleLaunchModeType )
            	    // InternalLcDsl.g:1912:5: lv_types_2_0= ruleLaunchModeType
            	    {

            	    					newCompositeNode(grammarAccess.getFavoritesAccess().getTypesLaunchModeTypeEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:1937:1: entryRuleRedirect returns [EObject current=null] : iv_ruleRedirect= ruleRedirect EOF ;
    public final EObject entryRuleRedirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirect = null;


        try {
            // InternalLcDsl.g:1937:49: (iv_ruleRedirect= ruleRedirect EOF )
            // InternalLcDsl.g:1938:2: iv_ruleRedirect= ruleRedirect EOF
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
    // InternalLcDsl.g:1944:1: ruleRedirect returns [EObject current=null] : ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';' ) ;
    public final EObject ruleRedirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_noAppend_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_outWhich_3_0 = null;

        EObject lv_outFile_5_0 = null;

        Enumerator lv_inWhich_7_0 = null;

        EObject lv_inFile_9_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1950:2: ( ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';' ) )
            // InternalLcDsl.g:1951:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';' )
            {
            // InternalLcDsl.g:1951:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';' )
            // InternalLcDsl.g:1952:3: () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';'
            {
            // InternalLcDsl.g:1952:3: ()
            // InternalLcDsl.g:1953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRedirectAccess().getRedirectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRedirectAccess().getRedirectKeyword_1());
            		
            // InternalLcDsl.g:1963:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1964:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1964:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1965:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1968:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* )
            // InternalLcDsl.g:1969:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1969:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( LA21_0 >= 112 && LA21_0 <= 114 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 == 115 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLcDsl.g:1970:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) )
            	    {
            	    // InternalLcDsl.g:1970:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) )
            	    // InternalLcDsl.g:1971:5: {...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1971:105: ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) )
            	    // InternalLcDsl.g:1972:6: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1975:9: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) )
            	    // InternalLcDsl.g:1975:10: {...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:1975:19: ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? )
            	    // InternalLcDsl.g:1975:20: ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )?
            	    {
            	    // InternalLcDsl.g:1975:20: ( (lv_outWhich_3_0= ruleOutputStream ) )
            	    // InternalLcDsl.g:1976:10: (lv_outWhich_3_0= ruleOutputStream )
            	    {
            	    // InternalLcDsl.g:1976:10: (lv_outWhich_3_0= ruleOutputStream )
            	    // InternalLcDsl.g:1977:11: lv_outWhich_3_0= ruleOutputStream
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getOutWhichOutputStreamEnumRuleCall_2_0_0_0());
            	    										
            	    pushFollow(FOLLOW_21);
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

            	    otherlv_4=(Token)match(input,51,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getRedirectAccess().getToKeyword_2_0_1());
            	    								
            	    // InternalLcDsl.g:1998:9: ( (lv_outFile_5_0= ruleAnyPath ) )
            	    // InternalLcDsl.g:1999:10: (lv_outFile_5_0= ruleAnyPath )
            	    {
            	    // InternalLcDsl.g:1999:10: (lv_outFile_5_0= ruleAnyPath )
            	    // InternalLcDsl.g:2000:11: lv_outFile_5_0= ruleAnyPath
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getOutFileAnyPathParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_22);
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

            	    // InternalLcDsl.g:2017:9: ( (lv_noAppend_6_0= '!' ) )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==52) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalLcDsl.g:2018:10: (lv_noAppend_6_0= '!' )
            	            {
            	            // InternalLcDsl.g:2018:10: (lv_noAppend_6_0= '!' )
            	            // InternalLcDsl.g:2019:11: lv_noAppend_6_0= '!'
            	            {
            	            lv_noAppend_6_0=(Token)match(input,52,FOLLOW_20); 

            	            											newLeafNode(lv_noAppend_6_0, grammarAccess.getRedirectAccess().getNoAppendExclamationMarkKeyword_2_0_3_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getRedirectRule());
            	            											}
            	            											setWithLastConsumed(current, "noAppend", lv_noAppend_6_0 != null, "!");
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2037:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2037:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) )
            	    // InternalLcDsl.g:2038:5: {...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2038:105: ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) )
            	    // InternalLcDsl.g:2039:6: ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2042:9: ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) )
            	    // InternalLcDsl.g:2042:10: {...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:2042:19: ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) )
            	    // InternalLcDsl.g:2042:20: ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) )
            	    {
            	    // InternalLcDsl.g:2042:20: ( (lv_inWhich_7_0= ruleInputStream ) )
            	    // InternalLcDsl.g:2043:10: (lv_inWhich_7_0= ruleInputStream )
            	    {
            	    // InternalLcDsl.g:2043:10: (lv_inWhich_7_0= ruleInputStream )
            	    // InternalLcDsl.g:2044:11: lv_inWhich_7_0= ruleInputStream
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getInWhichInputStreamEnumRuleCall_2_1_0_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_inWhich_7_0=ruleInputStream();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRedirectRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inWhich",
            	    												lv_inWhich_7_0,
            	    												"com.wamas.ide.launching.LcDsl.InputStream");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,53,FOLLOW_6); 

            	    									newLeafNode(otherlv_8, grammarAccess.getRedirectAccess().getFromKeyword_2_1_1());
            	    								
            	    // InternalLcDsl.g:2065:9: ( (lv_inFile_9_0= ruleExistingPath ) )
            	    // InternalLcDsl.g:2066:10: (lv_inFile_9_0= ruleExistingPath )
            	    {
            	    // InternalLcDsl.g:2066:10: (lv_inFile_9_0= ruleExistingPath )
            	    // InternalLcDsl.g:2067:11: lv_inFile_9_0= ruleExistingPath
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getInFileExistingPathParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_20);
            	    lv_inFile_9_0=ruleExistingPath();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRedirectRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inFile",
            	    												lv_inFile_9_0,
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
            	    break loop21;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            				

            }

            otherlv_10=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRedirectAccess().getSemicolonKeyword_3());
            		

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
    // InternalLcDsl.g:2105:1: entryRuleExecutionEnvironment returns [EObject current=null] : iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF ;
    public final EObject entryRuleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionEnvironment = null;


        try {
            // InternalLcDsl.g:2105:61: (iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF )
            // InternalLcDsl.g:2106:2: iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF
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
    // InternalLcDsl.g:2112:1: ruleExecutionEnvironment returns [EObject current=null] : (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2118:2: ( (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:2119:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:2119:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalLcDsl.g:2120:3: otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExecutionEnvironmentAccess().getExecutionEnvironmentKeyword_0());
            		
            // InternalLcDsl.g:2124:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalLcDsl.g:2125:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalLcDsl.g:2125:4: (lv_name_1_0= RULE_STRING )
            // InternalLcDsl.g:2126:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExecutionEnvironmentAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutionEnvironmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:2150:1: entryRuleConfigIniTemplate returns [EObject current=null] : iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF ;
    public final EObject entryRuleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigIniTemplate = null;


        try {
            // InternalLcDsl.g:2150:58: (iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF )
            // InternalLcDsl.g:2151:2: iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF
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
    // InternalLcDsl.g:2157:1: ruleConfigIniTemplate returns [EObject current=null] : (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2163:2: ( (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:2164:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:2164:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:2165:3: otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigIniTemplateAccess().getConfigIniTemplateKeyword_0());
            		
            // InternalLcDsl.g:2169:3: ( (lv_path_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:2170:4: (lv_path_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:2170:4: (lv_path_1_0= ruleExistingPath )
            // InternalLcDsl.g:2171:5: lv_path_1_0= ruleExistingPath
            {

            					newCompositeNode(grammarAccess.getConfigIniTemplateAccess().getPathExistingPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:2196:1: entryRuleTraceEnablement returns [EObject current=null] : iv_ruleTraceEnablement= ruleTraceEnablement EOF ;
    public final EObject entryRuleTraceEnablement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceEnablement = null;


        try {
            // InternalLcDsl.g:2196:56: (iv_ruleTraceEnablement= ruleTraceEnablement EOF )
            // InternalLcDsl.g:2197:2: iv_ruleTraceEnablement= ruleTraceEnablement EOF
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
    // InternalLcDsl.g:2203:1: ruleTraceEnablement returns [EObject current=null] : (otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';' ) ;
    public final EObject ruleTraceEnablement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_what_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2209:2: ( (otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:2210:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:2210:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';' )
            // InternalLcDsl.g:2211:3: otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceEnablementAccess().getTraceKeyword_0());
            		
            // InternalLcDsl.g:2215:3: ( (lv_plugin_1_0= ruleFQName ) )
            // InternalLcDsl.g:2216:4: (lv_plugin_1_0= ruleFQName )
            {
            // InternalLcDsl.g:2216:4: (lv_plugin_1_0= ruleFQName )
            // InternalLcDsl.g:2217:5: lv_plugin_1_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getTraceEnablementAccess().getPluginFQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_plugin_1_0=ruleFQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceEnablementRule());
            					}
            					set(
            						current,
            						"plugin",
            						lv_plugin_1_0,
            						"com.wamas.ide.launching.LcDsl.FQName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:2234:3: ( (lv_what_2_0= RULE_STRING ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLcDsl.g:2235:4: (lv_what_2_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:2235:4: (lv_what_2_0= RULE_STRING )
            	    // InternalLcDsl.g:2236:5: lv_what_2_0= RULE_STRING
            	    {
            	    lv_what_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    					newLeafNode(lv_what_2_0, grammarAccess.getTraceEnablementAccess().getWhatSTRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTraceEnablementRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"what",
            	    						lv_what_2_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:2260:1: entryRuleJavaMainSearch returns [EObject current=null] : iv_ruleJavaMainSearch= ruleJavaMainSearch EOF ;
    public final EObject entryRuleJavaMainSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaMainSearch = null;


        try {
            // InternalLcDsl.g:2260:55: (iv_ruleJavaMainSearch= ruleJavaMainSearch EOF )
            // InternalLcDsl.g:2261:2: iv_ruleJavaMainSearch= ruleJavaMainSearch EOF
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
    // InternalLcDsl.g:2267:1: ruleJavaMainSearch returns [EObject current=null] : ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleJavaMainSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_system_3_0=null;
        Token lv_inherited_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2273:2: ( ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:2274:2: ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:2274:2: ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            // InternalLcDsl.g:2275:3: () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:2275:3: ()
            // InternalLcDsl.g:2276:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaMainSearchAccess().getJavaMainSearchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaMainSearchAccess().getSearchMainKeyword_1());
            		
            // InternalLcDsl.g:2286:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2287:4: ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2287:4: ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2288:5: ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2291:5: ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* )
            // InternalLcDsl.g:2292:6: ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2292:6: ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLcDsl.g:2293:4: ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2293:4: ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) )
            	    // InternalLcDsl.g:2294:5: {...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2294:111: ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) )
            	    // InternalLcDsl.g:2295:6: ({...}? => ( (lv_system_3_0= 'system' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2298:9: ({...}? => ( (lv_system_3_0= 'system' ) ) )
            	    // InternalLcDsl.g:2298:10: {...}? => ( (lv_system_3_0= 'system' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "true");
            	    }
            	    // InternalLcDsl.g:2298:19: ( (lv_system_3_0= 'system' ) )
            	    // InternalLcDsl.g:2298:20: (lv_system_3_0= 'system' )
            	    {
            	    // InternalLcDsl.g:2298:20: (lv_system_3_0= 'system' )
            	    // InternalLcDsl.g:2299:10: lv_system_3_0= 'system'
            	    {
            	    lv_system_3_0=(Token)match(input,58,FOLLOW_24); 

            	    										newLeafNode(lv_system_3_0, grammarAccess.getJavaMainSearchAccess().getSystemSystemKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getJavaMainSearchRule());
            	    										}
            	    										setWithLastConsumed(current, "system", lv_system_3_0 != null, "system");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2316:4: ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2316:4: ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) )
            	    // InternalLcDsl.g:2317:5: {...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2317:111: ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) )
            	    // InternalLcDsl.g:2318:6: ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2321:9: ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) )
            	    // InternalLcDsl.g:2321:10: {...}? => ( (lv_inherited_4_0= 'inherited' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "true");
            	    }
            	    // InternalLcDsl.g:2321:19: ( (lv_inherited_4_0= 'inherited' ) )
            	    // InternalLcDsl.g:2321:20: (lv_inherited_4_0= 'inherited' )
            	    {
            	    // InternalLcDsl.g:2321:20: (lv_inherited_4_0= 'inherited' )
            	    // InternalLcDsl.g:2322:10: lv_inherited_4_0= 'inherited'
            	    {
            	    lv_inherited_4_0=(Token)match(input,59,FOLLOW_24); 

            	    										newLeafNode(lv_inherited_4_0, grammarAccess.getJavaMainSearchAccess().getInheritedInheritedKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getJavaMainSearchRule());
            	    										}
            	    										setWithLastConsumed(current, "inherited", lv_inherited_4_0 != null, "inherited");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            				

            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:2354:1: entryRuleRapServletConfig returns [EObject current=null] : iv_ruleRapServletConfig= ruleRapServletConfig EOF ;
    public final EObject entryRuleRapServletConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRapServletConfig = null;


        try {
            // InternalLcDsl.g:2354:57: (iv_ruleRapServletConfig= ruleRapServletConfig EOF )
            // InternalLcDsl.g:2355:2: iv_ruleRapServletConfig= ruleRapServletConfig EOF
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
    // InternalLcDsl.g:2361:1: ruleRapServletConfig returns [EObject current=null] : (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END ) ;
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
            // InternalLcDsl.g:2367:2: ( (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END ) )
            // InternalLcDsl.g:2368:2: (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END )
            {
            // InternalLcDsl.g:2368:2: (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END )
            // InternalLcDsl.g:2369:3: otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END
            {
            otherlv_0=(Token)match(input,60,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRapServletConfigAccess().getServletKeyword_0());
            		
            this_BLOCK_BEGIN_1=(Token)match(input,RULE_BLOCK_BEGIN,FOLLOW_25); 

            			newLeafNode(this_BLOCK_BEGIN_1, grammarAccess.getRapServletConfigAccess().getBLOCK_BEGINTerminalRuleCall_1());
            		
            // InternalLcDsl.g:2377:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // InternalLcDsl.g:2378:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalLcDsl.g:2378:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // InternalLcDsl.g:2379:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2382:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            // InternalLcDsl.g:2383:6: ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // InternalLcDsl.g:2383:6: ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=7;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2) ) {
                    alt24=3;
                }
                else if ( LA24_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3) ) {
                    alt24=4;
                }
                else if ( LA24_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4) ) {
                    alt24=5;
                }
                else if ( LA24_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5) ) {
                    alt24=6;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLcDsl.g:2384:4: ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2384:4: ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    // InternalLcDsl.g:2385:5: {...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2385:113: ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    // InternalLcDsl.g:2386:6: ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2389:9: ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    // InternalLcDsl.g:2389:10: {...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2389:19: (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    // InternalLcDsl.g:2389:20: otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,61,FOLLOW_6); 

            	    									newLeafNode(otherlv_3, grammarAccess.getRapServletConfigAccess().getPathKeyword_2_0_0());
            	    								
            	    // InternalLcDsl.g:2393:9: ( (lv_servletPath_4_0= RULE_STRING ) )
            	    // InternalLcDsl.g:2394:10: (lv_servletPath_4_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:2394:10: (lv_servletPath_4_0= RULE_STRING )
            	    // InternalLcDsl.g:2395:11: lv_servletPath_4_0= RULE_STRING
            	    {
            	    lv_servletPath_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            	    otherlv_5=(Token)match(input,34,FOLLOW_26); 

            	    									newLeafNode(otherlv_5, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2421:4: ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2421:4: ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) )
            	    // InternalLcDsl.g:2422:5: {...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2422:113: ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) )
            	    // InternalLcDsl.g:2423:6: ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2426:9: ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) )
            	    // InternalLcDsl.g:2426:10: {...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2426:19: (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' )
            	    // InternalLcDsl.g:2426:20: otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';'
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_27); 

            	    									newLeafNode(otherlv_6, grammarAccess.getRapServletConfigAccess().getBrowserKeyword_2_1_0());
            	    								
            	    // InternalLcDsl.g:2430:9: ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) )
            	    // InternalLcDsl.g:2431:10: (lv_browserMode_7_0= ruleBrowserLaunchMode )
            	    {
            	    // InternalLcDsl.g:2431:10: (lv_browserMode_7_0= ruleBrowserLaunchMode )
            	    // InternalLcDsl.g:2432:11: lv_browserMode_7_0= ruleBrowserLaunchMode
            	    {

            	    											newCompositeNode(grammarAccess.getRapServletConfigAccess().getBrowserModeBrowserLaunchModeEnumRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
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

            	    otherlv_8=(Token)match(input,34,FOLLOW_26); 

            	    									newLeafNode(otherlv_8, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:2459:4: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2459:4: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // InternalLcDsl.g:2460:5: {...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLcDsl.g:2460:113: ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // InternalLcDsl.g:2461:6: ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLcDsl.g:2464:9: ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // InternalLcDsl.g:2464:10: {...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2464:19: (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // InternalLcDsl.g:2464:20: otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_9=(Token)match(input,63,FOLLOW_28); 

            	    									newLeafNode(otherlv_9, grammarAccess.getRapServletConfigAccess().getPortKeyword_2_2_0());
            	    								
            	    // InternalLcDsl.g:2468:9: ( (lv_serverPort_10_0= RULE_INT ) )
            	    // InternalLcDsl.g:2469:10: (lv_serverPort_10_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2469:10: (lv_serverPort_10_0= RULE_INT )
            	    // InternalLcDsl.g:2470:11: lv_serverPort_10_0= RULE_INT
            	    {
            	    lv_serverPort_10_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            	    otherlv_11=(Token)match(input,34,FOLLOW_26); 

            	    									newLeafNode(otherlv_11, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:2496:4: ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2496:4: ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    // InternalLcDsl.g:2497:5: {...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalLcDsl.g:2497:113: ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    // InternalLcDsl.g:2498:6: ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalLcDsl.g:2501:9: ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    // InternalLcDsl.g:2501:10: {...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2501:19: (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    // InternalLcDsl.g:2501:20: otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';'
            	    {
            	    otherlv_12=(Token)match(input,64,FOLLOW_28); 

            	    									newLeafNode(otherlv_12, grammarAccess.getRapServletConfigAccess().getSessionTimeoutKeyword_2_3_0());
            	    								
            	    // InternalLcDsl.g:2505:9: ( (lv_sessionTimeout_13_0= RULE_INT ) )
            	    // InternalLcDsl.g:2506:10: (lv_sessionTimeout_13_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2506:10: (lv_sessionTimeout_13_0= RULE_INT )
            	    // InternalLcDsl.g:2507:11: lv_sessionTimeout_13_0= RULE_INT
            	    {
            	    lv_sessionTimeout_13_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            	    otherlv_14=(Token)match(input,34,FOLLOW_26); 

            	    									newLeafNode(otherlv_14, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:2533:4: ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2533:4: ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    // InternalLcDsl.g:2534:5: {...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalLcDsl.g:2534:113: ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    // InternalLcDsl.g:2535:6: ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalLcDsl.g:2538:9: ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    // InternalLcDsl.g:2538:10: {...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2538:19: (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    // InternalLcDsl.g:2538:20: otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';'
            	    {
            	    otherlv_15=(Token)match(input,65,FOLLOW_6); 

            	    									newLeafNode(otherlv_15, grammarAccess.getRapServletConfigAccess().getContextPathKeyword_2_4_0());
            	    								
            	    // InternalLcDsl.g:2542:9: ( (lv_contextPath_16_0= RULE_STRING ) )
            	    // InternalLcDsl.g:2543:10: (lv_contextPath_16_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:2543:10: (lv_contextPath_16_0= RULE_STRING )
            	    // InternalLcDsl.g:2544:11: lv_contextPath_16_0= RULE_STRING
            	    {
            	    lv_contextPath_16_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            	    otherlv_17=(Token)match(input,34,FOLLOW_26); 

            	    									newLeafNode(otherlv_17, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:2570:4: ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2570:4: ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) )
            	    // InternalLcDsl.g:2571:5: {...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalLcDsl.g:2571:113: ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) )
            	    // InternalLcDsl.g:2572:6: ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalLcDsl.g:2575:9: ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) )
            	    // InternalLcDsl.g:2575:10: {...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2575:19: (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' )
            	    // InternalLcDsl.g:2575:20: otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';'
            	    {
            	    otherlv_18=(Token)match(input,66,FOLLOW_29); 

            	    									newLeafNode(otherlv_18, grammarAccess.getRapServletConfigAccess().getDevModeKeyword_2_5_0());
            	    								
            	    // InternalLcDsl.g:2579:9: ( (lv_devMode_19_0= RULE_BOOLEAN ) )
            	    // InternalLcDsl.g:2580:10: (lv_devMode_19_0= RULE_BOOLEAN )
            	    {
            	    // InternalLcDsl.g:2580:10: (lv_devMode_19_0= RULE_BOOLEAN )
            	    // InternalLcDsl.g:2581:11: lv_devMode_19_0= RULE_BOOLEAN
            	    {
            	    lv_devMode_19_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_13); 

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

            	    otherlv_20=(Token)match(input,34,FOLLOW_26); 

            	    									newLeafNode(otherlv_20, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_5_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // InternalLcDsl.g:2623:1: entryRuleExistingPath returns [EObject current=null] : iv_ruleExistingPath= ruleExistingPath EOF ;
    public final EObject entryRuleExistingPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingPath = null;


        try {
            // InternalLcDsl.g:2623:53: (iv_ruleExistingPath= ruleExistingPath EOF )
            // InternalLcDsl.g:2624:2: iv_ruleExistingPath= ruleExistingPath EOF
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
    // InternalLcDsl.g:2630:1: ruleExistingPath returns [EObject current=null] : ( (lv_name_0_0= ruleStringWithVariables ) ) ;
    public final EObject ruleExistingPath() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2636:2: ( ( (lv_name_0_0= ruleStringWithVariables ) ) )
            // InternalLcDsl.g:2637:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            {
            // InternalLcDsl.g:2637:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            // InternalLcDsl.g:2638:3: (lv_name_0_0= ruleStringWithVariables )
            {
            // InternalLcDsl.g:2638:3: (lv_name_0_0= ruleStringWithVariables )
            // InternalLcDsl.g:2639:4: lv_name_0_0= ruleStringWithVariables
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
    // InternalLcDsl.g:2659:1: entryRuleAnyPath returns [EObject current=null] : iv_ruleAnyPath= ruleAnyPath EOF ;
    public final EObject entryRuleAnyPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyPath = null;


        try {
            // InternalLcDsl.g:2659:48: (iv_ruleAnyPath= ruleAnyPath EOF )
            // InternalLcDsl.g:2660:2: iv_ruleAnyPath= ruleAnyPath EOF
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
    // InternalLcDsl.g:2666:1: ruleAnyPath returns [EObject current=null] : ( (lv_name_0_0= ruleStringWithVariables ) ) ;
    public final EObject ruleAnyPath() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2672:2: ( ( (lv_name_0_0= ruleStringWithVariables ) ) )
            // InternalLcDsl.g:2673:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            {
            // InternalLcDsl.g:2673:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            // InternalLcDsl.g:2674:3: (lv_name_0_0= ruleStringWithVariables )
            {
            // InternalLcDsl.g:2674:3: (lv_name_0_0= ruleStringWithVariables )
            // InternalLcDsl.g:2675:4: lv_name_0_0= ruleStringWithVariables
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
    // InternalLcDsl.g:2695:1: entryRulePluginWithVersionAndStartLevel returns [EObject current=null] : iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF ;
    public final EObject entryRulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersionAndStartLevel = null;


        try {
            // InternalLcDsl.g:2695:71: (iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF )
            // InternalLcDsl.g:2696:2: iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF
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
    // InternalLcDsl.g:2702:1: rulePluginWithVersionAndStartLevel returns [EObject current=null] : ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject rulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        Token lv_autoStart_2_0=null;
        Token otherlv_3=null;
        Token lv_startLevel_4_0=null;
        EObject lv_plugin_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2708:2: ( ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalLcDsl.g:2709:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalLcDsl.g:2709:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalLcDsl.g:2710:3: ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            // InternalLcDsl.g:2710:3: ( (lv_plugin_0_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:2711:4: (lv_plugin_0_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:2711:4: (lv_plugin_0_0= rulePluginWithVersion )
            // InternalLcDsl.g:2712:5: lv_plugin_0_0= rulePluginWithVersion
            {

            					newCompositeNode(grammarAccess.getPluginWithVersionAndStartLevelAccess().getPluginPluginWithVersionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalLcDsl.g:2729:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2730:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2730:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2731:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            				
            // InternalLcDsl.g:2734:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalLcDsl.g:2735:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2735:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalLcDsl.g:2736:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2736:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    // InternalLcDsl.g:2737:5: {...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalLcDsl.g:2737:127: ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    // InternalLcDsl.g:2738:6: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalLcDsl.g:2741:9: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    // InternalLcDsl.g:2741:10: {...}? => ( (lv_autoStart_2_0= 'autostart' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:2741:19: ( (lv_autoStart_2_0= 'autostart' ) )
            	    // InternalLcDsl.g:2741:20: (lv_autoStart_2_0= 'autostart' )
            	    {
            	    // InternalLcDsl.g:2741:20: (lv_autoStart_2_0= 'autostart' )
            	    // InternalLcDsl.g:2742:10: lv_autoStart_2_0= 'autostart'
            	    {
            	    lv_autoStart_2_0=(Token)match(input,67,FOLLOW_30); 

            	    										newLeafNode(lv_autoStart_2_0, grammarAccess.getPluginWithVersionAndStartLevelAccess().getAutoStartAutostartKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPluginWithVersionAndStartLevelRule());
            	    										}
            	    										setWithLastConsumed(current, "autoStart", lv_autoStart_2_0 != null, "autostart");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2759:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2759:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalLcDsl.g:2760:5: {...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalLcDsl.g:2760:127: ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    // InternalLcDsl.g:2761:6: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalLcDsl.g:2764:9: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    // InternalLcDsl.g:2764:10: {...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:2764:19: (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    // InternalLcDsl.g:2764:20: otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,68,FOLLOW_28); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartlevelKeyword_1_1_0());
            	    								
            	    // InternalLcDsl.g:2768:9: ( (lv_startLevel_4_0= RULE_INT ) )
            	    // InternalLcDsl.g:2769:10: (lv_startLevel_4_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2769:10: (lv_startLevel_4_0= RULE_INT )
            	    // InternalLcDsl.g:2770:11: lv_startLevel_4_0= RULE_INT
            	    {
            	    lv_startLevel_4_0=(Token)match(input,RULE_INT,FOLLOW_30); 

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
            	    break loop25;
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
    // InternalLcDsl.g:2803:1: entryRulePluginWithVersion returns [EObject current=null] : iv_rulePluginWithVersion= rulePluginWithVersion EOF ;
    public final EObject entryRulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersion = null;


        try {
            // InternalLcDsl.g:2803:58: (iv_rulePluginWithVersion= rulePluginWithVersion EOF )
            // InternalLcDsl.g:2804:2: iv_rulePluginWithVersion= rulePluginWithVersion EOF
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
    // InternalLcDsl.g:2810:1: rulePluginWithVersion returns [EObject current=null] : ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) ;
    public final EObject rulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2816:2: ( ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) )
            // InternalLcDsl.g:2817:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            {
            // InternalLcDsl.g:2817:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            // InternalLcDsl.g:2818:3: ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )?
            {
            // InternalLcDsl.g:2818:3: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2819:4: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2819:4: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2820:5: lv_name_0_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getPluginWithVersionAccess().getNameFQNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalLcDsl.g:2837:3: ( (lv_version_1_0= RULE_VERSION ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_VERSION) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLcDsl.g:2838:4: (lv_version_1_0= RULE_VERSION )
                    {
                    // InternalLcDsl.g:2838:4: (lv_version_1_0= RULE_VERSION )
                    // InternalLcDsl.g:2839:5: lv_version_1_0= RULE_VERSION
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


    // $ANTLR start "entryRuleFeatureWithVersion"
    // InternalLcDsl.g:2859:1: entryRuleFeatureWithVersion returns [EObject current=null] : iv_ruleFeatureWithVersion= ruleFeatureWithVersion EOF ;
    public final EObject entryRuleFeatureWithVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureWithVersion = null;


        try {
            // InternalLcDsl.g:2859:59: (iv_ruleFeatureWithVersion= ruleFeatureWithVersion EOF )
            // InternalLcDsl.g:2860:2: iv_ruleFeatureWithVersion= ruleFeatureWithVersion EOF
            {
             newCompositeNode(grammarAccess.getFeatureWithVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureWithVersion=ruleFeatureWithVersion();

            state._fsp--;

             current =iv_ruleFeatureWithVersion; 
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
    // $ANTLR end "entryRuleFeatureWithVersion"


    // $ANTLR start "ruleFeatureWithVersion"
    // InternalLcDsl.g:2866:1: ruleFeatureWithVersion returns [EObject current=null] : ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) ;
    public final EObject ruleFeatureWithVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2872:2: ( ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) )
            // InternalLcDsl.g:2873:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            {
            // InternalLcDsl.g:2873:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            // InternalLcDsl.g:2874:3: ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )?
            {
            // InternalLcDsl.g:2874:3: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2875:4: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2875:4: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2876:5: lv_name_0_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getFeatureWithVersionAccess().getNameFQNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_0_0=ruleFQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureWithVersionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"com.wamas.ide.launching.LcDsl.FQName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:2893:3: ( (lv_version_1_0= RULE_VERSION ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_VERSION) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLcDsl.g:2894:4: (lv_version_1_0= RULE_VERSION )
                    {
                    // InternalLcDsl.g:2894:4: (lv_version_1_0= RULE_VERSION )
                    // InternalLcDsl.g:2895:5: lv_version_1_0= RULE_VERSION
                    {
                    lv_version_1_0=(Token)match(input,RULE_VERSION,FOLLOW_2); 

                    					newLeafNode(lv_version_1_0, grammarAccess.getFeatureWithVersionAccess().getVersionVERSIONTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureWithVersionRule());
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
    // $ANTLR end "ruleFeatureWithVersion"


    // $ANTLR start "entryRuleProject"
    // InternalLcDsl.g:2915:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalLcDsl.g:2915:48: (iv_ruleProject= ruleProject EOF )
            // InternalLcDsl.g:2916:2: iv_ruleProject= ruleProject EOF
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
    // InternalLcDsl.g:2922:1: ruleProject returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2928:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:2929:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:2929:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2930:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2930:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2931:4: lv_name_0_0= ruleFQName
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
    // InternalLcDsl.g:2951:1: entryRuleJavaMainType returns [EObject current=null] : iv_ruleJavaMainType= ruleJavaMainType EOF ;
    public final EObject entryRuleJavaMainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaMainType = null;


        try {
            // InternalLcDsl.g:2951:53: (iv_ruleJavaMainType= ruleJavaMainType EOF )
            // InternalLcDsl.g:2952:2: iv_ruleJavaMainType= ruleJavaMainType EOF
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
    // InternalLcDsl.g:2958:1: ruleJavaMainType returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleJavaMainType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2964:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:2965:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:2965:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2966:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2966:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2967:4: lv_name_0_0= ruleFQName
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
    // InternalLcDsl.g:2987:1: entryRuleClearOption returns [EObject current=null] : iv_ruleClearOption= ruleClearOption EOF ;
    public final EObject entryRuleClearOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearOption = null;


        try {
            // InternalLcDsl.g:2987:52: (iv_ruleClearOption= ruleClearOption EOF )
            // InternalLcDsl.g:2988:2: iv_ruleClearOption= ruleClearOption EOF
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
    // InternalLcDsl.g:2994:1: ruleClearOption returns [EObject current=null] : ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' ) ;
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
            // InternalLcDsl.g:3000:2: ( ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' ) )
            // InternalLcDsl.g:3001:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' )
            {
            // InternalLcDsl.g:3001:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' )
            // InternalLcDsl.g:3002:3: () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';'
            {
            // InternalLcDsl.g:3002:3: ()
            // InternalLcDsl.g:3003:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearOptionAccess().getClearOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getClearOptionAccess().getClearKeyword_1());
            		
            // InternalLcDsl.g:3013:3: ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:3014:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:3014:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:3015:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:3018:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            // InternalLcDsl.g:3019:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:3019:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( ( LA30_0 == 33 || LA30_0 == 70 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalLcDsl.g:3020:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    {
            	    // InternalLcDsl.g:3020:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    // InternalLcDsl.g:3021:5: {...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:3021:108: ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    // InternalLcDsl.g:3022:6: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:3025:9: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    // InternalLcDsl.g:3025:10: {...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:3025:19: ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    // InternalLcDsl.g:3025:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )?
            	    {
            	    // InternalLcDsl.g:3025:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==33) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==70) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalLcDsl.g:3026:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            {
            	            // InternalLcDsl.g:3026:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            // InternalLcDsl.g:3027:11: (lv_workspace_3_0= 'workspace' )
            	            {
            	            // InternalLcDsl.g:3027:11: (lv_workspace_3_0= 'workspace' )
            	            // InternalLcDsl.g:3028:12: lv_workspace_3_0= 'workspace'
            	            {
            	            lv_workspace_3_0=(Token)match(input,33,FOLLOW_33); 

            	            												newLeafNode(lv_workspace_3_0, grammarAccess.getClearOptionAccess().getWorkspaceWorkspaceKeyword_2_0_0_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getClearOptionRule());
            	            												}
            	            												setWithLastConsumed(current, "workspace", lv_workspace_3_0 != null, "workspace");
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLcDsl.g:3041:10: ( (lv_log_4_0= 'log' ) )
            	            {
            	            // InternalLcDsl.g:3041:10: ( (lv_log_4_0= 'log' ) )
            	            // InternalLcDsl.g:3042:11: (lv_log_4_0= 'log' )
            	            {
            	            // InternalLcDsl.g:3042:11: (lv_log_4_0= 'log' )
            	            // InternalLcDsl.g:3043:12: lv_log_4_0= 'log'
            	            {
            	            lv_log_4_0=(Token)match(input,70,FOLLOW_33); 

            	            												newLeafNode(lv_log_4_0, grammarAccess.getClearOptionAccess().getLogLogKeyword_2_0_0_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getClearOptionRule());
            	            												}
            	            												setWithLastConsumed(current, "log", lv_log_4_0 != null, "log");
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalLcDsl.g:3056:9: ( (lv_noAskClear_5_0= '!' ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==52) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalLcDsl.g:3057:10: (lv_noAskClear_5_0= '!' )
            	            {
            	            // InternalLcDsl.g:3057:10: (lv_noAskClear_5_0= '!' )
            	            // InternalLcDsl.g:3058:11: lv_noAskClear_5_0= '!'
            	            {
            	            lv_noAskClear_5_0=(Token)match(input,52,FOLLOW_32); 

            	            											newLeafNode(lv_noAskClear_5_0, grammarAccess.getClearOptionAccess().getNoAskClearExclamationMarkKeyword_2_0_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getClearOptionRule());
            	            											}
            	            											setWithLastConsumed(current, "noAskClear", lv_noAskClear_5_0 != null, "!");
            	            										

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
            	    // InternalLcDsl.g:3076:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3076:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    // InternalLcDsl.g:3077:5: {...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:3077:108: ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    // InternalLcDsl.g:3078:6: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:3081:9: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    // InternalLcDsl.g:3081:10: {...}? => ( (lv_config_6_0= 'config' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:3081:19: ( (lv_config_6_0= 'config' ) )
            	    // InternalLcDsl.g:3081:20: (lv_config_6_0= 'config' )
            	    {
            	    // InternalLcDsl.g:3081:20: (lv_config_6_0= 'config' )
            	    // InternalLcDsl.g:3082:10: lv_config_6_0= 'config'
            	    {
            	    lv_config_6_0=(Token)match(input,71,FOLLOW_32); 

            	    										newLeafNode(lv_config_6_0, grammarAccess.getClearOptionAccess().getConfigConfigKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getClearOptionRule());
            	    										}
            	    										setWithLastConsumed(current, "config", lv_config_6_0 != null, "config");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            				

            }

            otherlv_7=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:3114:1: entryRuleMemoryOption returns [EObject current=null] : iv_ruleMemoryOption= ruleMemoryOption EOF ;
    public final EObject entryRuleMemoryOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryOption = null;


        try {
            // InternalLcDsl.g:3114:53: (iv_ruleMemoryOption= ruleMemoryOption EOF )
            // InternalLcDsl.g:3115:2: iv_ruleMemoryOption= ruleMemoryOption EOF
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
    // InternalLcDsl.g:3121:1: ruleMemoryOption returns [EObject current=null] : ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' ) ;
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
            // InternalLcDsl.g:3127:2: ( ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' ) )
            // InternalLcDsl.g:3128:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' )
            {
            // InternalLcDsl.g:3128:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' )
            // InternalLcDsl.g:3129:3: () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';'
            {
            // InternalLcDsl.g:3129:3: ()
            // InternalLcDsl.g:3130:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryOptionAccess().getMemoryOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryOptionAccess().getMemoryKeyword_1());
            		
            // InternalLcDsl.g:3140:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:3141:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:3141:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:3142:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:3145:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            // InternalLcDsl.g:3146:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:3146:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            loop31:
            do {
                int alt31=4;
                int LA31_0 = input.LA(1);

                if ( LA31_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt31=2;
                }
                else if ( LA31_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                    alt31=3;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLcDsl.g:3147:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3147:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:3148:5: {...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:3148:109: ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:3149:6: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:3152:9: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:3152:10: {...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:3152:19: (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:3152:20: otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_3=(Token)match(input,73,FOLLOW_18); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMemoryOptionAccess().getMinKeyword_2_0_0());
            	    								
            	    this_EQ_4=(Token)match(input,RULE_EQ,FOLLOW_28); 

            	    									newLeafNode(this_EQ_4, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_0_1());
            	    								
            	    // InternalLcDsl.g:3160:9: ( (lv_min_5_0= RULE_INT ) )
            	    // InternalLcDsl.g:3161:10: (lv_min_5_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:3161:10: (lv_min_5_0= RULE_INT )
            	    // InternalLcDsl.g:3162:11: lv_min_5_0= RULE_INT
            	    {
            	    lv_min_5_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            	    // InternalLcDsl.g:3178:9: ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:3179:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:3179:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:3180:11: lv_minUnit_6_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getMinUnitMemoryUnitEnumRuleCall_2_0_3_0());
            	    										
            	    pushFollow(FOLLOW_34);
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
            	    // InternalLcDsl.g:3203:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3203:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:3204:5: {...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:3204:109: ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:3205:6: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:3208:9: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:3208:10: {...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:3208:19: (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:3208:20: otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_7=(Token)match(input,74,FOLLOW_18); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMemoryOptionAccess().getMaxKeyword_2_1_0());
            	    								
            	    this_EQ_8=(Token)match(input,RULE_EQ,FOLLOW_28); 

            	    									newLeafNode(this_EQ_8, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_1_1());
            	    								
            	    // InternalLcDsl.g:3216:9: ( (lv_max_9_0= RULE_INT ) )
            	    // InternalLcDsl.g:3217:10: (lv_max_9_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:3217:10: (lv_max_9_0= RULE_INT )
            	    // InternalLcDsl.g:3218:11: lv_max_9_0= RULE_INT
            	    {
            	    lv_max_9_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            	    // InternalLcDsl.g:3234:9: ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:3235:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:3235:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:3236:11: lv_maxUnit_10_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getMaxUnitMemoryUnitEnumRuleCall_2_1_3_0());
            	    										
            	    pushFollow(FOLLOW_34);
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
            	    // InternalLcDsl.g:3259:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3259:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:3260:5: {...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLcDsl.g:3260:109: ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:3261:6: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLcDsl.g:3264:9: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:3264:10: {...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:3264:19: (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:3264:20: otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_11=(Token)match(input,75,FOLLOW_18); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMemoryOptionAccess().getPermKeyword_2_2_0());
            	    								
            	    this_EQ_12=(Token)match(input,RULE_EQ,FOLLOW_28); 

            	    									newLeafNode(this_EQ_12, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_2_1());
            	    								
            	    // InternalLcDsl.g:3272:9: ( (lv_perm_13_0= RULE_INT ) )
            	    // InternalLcDsl.g:3273:10: (lv_perm_13_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:3273:10: (lv_perm_13_0= RULE_INT )
            	    // InternalLcDsl.g:3274:11: lv_perm_13_0= RULE_INT
            	    {
            	    lv_perm_13_0=(Token)match(input,RULE_INT,FOLLOW_35); 

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

            	    // InternalLcDsl.g:3290:9: ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:3291:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:3291:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:3292:11: lv_permUnit_14_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getPermUnitMemoryUnitEnumRuleCall_2_2_3_0());
            	    										
            	    pushFollow(FOLLOW_34);
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
            	    break loop31;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:3330:1: entryRuleGroupMember returns [EObject current=null] : iv_ruleGroupMember= ruleGroupMember EOF ;
    public final EObject entryRuleGroupMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupMember = null;


        try {
            // InternalLcDsl.g:3330:52: (iv_ruleGroupMember= ruleGroupMember EOF )
            // InternalLcDsl.g:3331:2: iv_ruleGroupMember= ruleGroupMember EOF
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
    // InternalLcDsl.g:3337:1: ruleGroupMember returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) ;
    public final EObject ruleGroupMember() throws RecognitionException {
        EObject current = null;

        Token lv_adopt_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_postAction_5_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:3343:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) )
            // InternalLcDsl.g:3344:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            {
            // InternalLcDsl.g:3344:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            // InternalLcDsl.g:3345:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';'
            {
            // InternalLcDsl.g:3345:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:3346:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:3346:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:3347:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            				
            // InternalLcDsl.g:3350:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            // InternalLcDsl.g:3351:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:3351:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( LA32_0 >= 99 && LA32_0 <= 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalLcDsl.g:3352:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3352:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    // InternalLcDsl.g:3353:5: {...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalLcDsl.g:3353:108: ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    // InternalLcDsl.g:3354:6: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalLcDsl.g:3357:9: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    // InternalLcDsl.g:3357:10: {...}? => ( (lv_type_1_0= ruleLaunchModeType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:3357:19: ( (lv_type_1_0= ruleLaunchModeType ) )
            	    // InternalLcDsl.g:3357:20: (lv_type_1_0= ruleLaunchModeType )
            	    {
            	    // InternalLcDsl.g:3357:20: (lv_type_1_0= ruleLaunchModeType )
            	    // InternalLcDsl.g:3358:10: lv_type_1_0= ruleLaunchModeType
            	    {

            	    										newCompositeNode(grammarAccess.getGroupMemberAccess().getTypeLaunchModeTypeEnumRuleCall_0_0_0());
            	    									
            	    pushFollow(FOLLOW_36);
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
            	    // InternalLcDsl.g:3380:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3380:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    // InternalLcDsl.g:3381:5: {...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalLcDsl.g:3381:108: ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    // InternalLcDsl.g:3382:6: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalLcDsl.g:3385:9: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    // InternalLcDsl.g:3385:10: {...}? => ( (lv_adopt_2_0= 'adopt' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:3385:19: ( (lv_adopt_2_0= 'adopt' ) )
            	    // InternalLcDsl.g:3385:20: (lv_adopt_2_0= 'adopt' )
            	    {
            	    // InternalLcDsl.g:3385:20: (lv_adopt_2_0= 'adopt' )
            	    // InternalLcDsl.g:3386:10: lv_adopt_2_0= 'adopt'
            	    {
            	    lv_adopt_2_0=(Token)match(input,76,FOLLOW_36); 

            	    										newLeafNode(lv_adopt_2_0, grammarAccess.getGroupMemberAccess().getAdoptAdoptKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGroupMemberRule());
            	    										}
            	    										setWithLastConsumed(current, "adopt", lv_adopt_2_0 != null, "adopt");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            				

            }

            otherlv_3=(Token)match(input,77,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupMemberAccess().getMemberKeyword_1());
            		
            // InternalLcDsl.g:3414:3: ( ( ruleFQName ) )
            // InternalLcDsl.g:3415:4: ( ruleFQName )
            {
            // InternalLcDsl.g:3415:4: ( ruleFQName )
            // InternalLcDsl.g:3416:5: ruleFQName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGroupMemberAccess().getMemberLaunchConfigCrossReference_2_0());
            				
            pushFollow(FOLLOW_37);
            ruleFQName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:3430:3: ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=78 && LA33_0<=80)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalLcDsl.g:3431:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    {
                    // InternalLcDsl.g:3431:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    // InternalLcDsl.g:3432:5: lv_postAction_5_0= ruleGroupPostLaunchAction
                    {

                    					newCompositeNode(grammarAccess.getGroupMemberAccess().getPostActionGroupPostLaunchActionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_13);
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

            otherlv_6=(Token)match(input,34,FOLLOW_2); 

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
    // InternalLcDsl.g:3457:1: entryRuleGroupPostLaunchAction returns [EObject current=null] : iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF ;
    public final EObject entryRuleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchAction = null;


        try {
            // InternalLcDsl.g:3457:62: (iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF )
            // InternalLcDsl.g:3458:2: iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF
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
    // InternalLcDsl.g:3464:1: ruleGroupPostLaunchAction returns [EObject current=null] : (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) ;
    public final EObject ruleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject this_GroupPostLaunchDelay_0 = null;

        EObject this_GroupPostLaunchRegex_1 = null;

        EObject this_GroupPostLaunchWait_2 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:3470:2: ( (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) )
            // InternalLcDsl.g:3471:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            {
            // InternalLcDsl.g:3471:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt34=1;
                }
                break;
            case 79:
                {
                alt34=2;
                }
                break;
            case 80:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalLcDsl.g:3472:3: this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay
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
                    // InternalLcDsl.g:3481:3: this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex
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
                    // InternalLcDsl.g:3490:3: this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait
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
    // InternalLcDsl.g:3502:1: entryRuleGroupPostLaunchDelay returns [EObject current=null] : iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF ;
    public final EObject entryRuleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchDelay = null;


        try {
            // InternalLcDsl.g:3502:61: (iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF )
            // InternalLcDsl.g:3503:2: iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF
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
    // InternalLcDsl.g:3509:1: ruleGroupPostLaunchDelay returns [EObject current=null] : (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_delay_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3515:2: ( (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) )
            // InternalLcDsl.g:3516:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            {
            // InternalLcDsl.g:3516:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            // InternalLcDsl.g:3517:3: otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchDelayAccess().getDelayKeyword_0());
            		
            // InternalLcDsl.g:3521:3: ( (lv_delay_1_0= RULE_INT ) )
            // InternalLcDsl.g:3522:4: (lv_delay_1_0= RULE_INT )
            {
            // InternalLcDsl.g:3522:4: (lv_delay_1_0= RULE_INT )
            // InternalLcDsl.g:3523:5: lv_delay_1_0= RULE_INT
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
    // InternalLcDsl.g:3543:1: entryRuleGroupPostLaunchRegex returns [EObject current=null] : iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF ;
    public final EObject entryRuleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchRegex = null;


        try {
            // InternalLcDsl.g:3543:61: (iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF )
            // InternalLcDsl.g:3544:2: iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF
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
    // InternalLcDsl.g:3550:1: ruleGroupPostLaunchRegex returns [EObject current=null] : (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_regex_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3556:2: ( (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) )
            // InternalLcDsl.g:3557:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            {
            // InternalLcDsl.g:3557:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            // InternalLcDsl.g:3558:3: otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchRegexAccess().getRegexKeyword_0());
            		
            // InternalLcDsl.g:3562:3: ( (lv_regex_1_0= RULE_STRING ) )
            // InternalLcDsl.g:3563:4: (lv_regex_1_0= RULE_STRING )
            {
            // InternalLcDsl.g:3563:4: (lv_regex_1_0= RULE_STRING )
            // InternalLcDsl.g:3564:5: lv_regex_1_0= RULE_STRING
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
    // InternalLcDsl.g:3584:1: entryRuleGroupPostLaunchWait returns [EObject current=null] : iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF ;
    public final EObject entryRuleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchWait = null;


        try {
            // InternalLcDsl.g:3584:60: (iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF )
            // InternalLcDsl.g:3585:2: iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF
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
    // InternalLcDsl.g:3591:1: ruleGroupPostLaunchWait returns [EObject current=null] : ( () otherlv_1= 'wait' ) ;
    public final EObject ruleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3597:2: ( ( () otherlv_1= 'wait' ) )
            // InternalLcDsl.g:3598:2: ( () otherlv_1= 'wait' )
            {
            // InternalLcDsl.g:3598:2: ( () otherlv_1= 'wait' )
            // InternalLcDsl.g:3599:3: () otherlv_1= 'wait'
            {
            // InternalLcDsl.g:3599:3: ()
            // InternalLcDsl.g:3600:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupPostLaunchWaitAccess().getGroupPostLaunchWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_2); 

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
    // InternalLcDsl.g:3614:1: entryRuleStringWithVariables returns [EObject current=null] : iv_ruleStringWithVariables= ruleStringWithVariables EOF ;
    public final EObject entryRuleStringWithVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringWithVariables = null;


        try {
            // InternalLcDsl.g:3614:60: (iv_ruleStringWithVariables= ruleStringWithVariables EOF )
            // InternalLcDsl.g:3615:2: iv_ruleStringWithVariables= ruleStringWithVariables EOF
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
    // InternalLcDsl.g:3621:1: ruleStringWithVariables returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringWithVariables() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3627:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLcDsl.g:3628:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLcDsl.g:3628:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLcDsl.g:3629:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLcDsl.g:3629:3: (lv_value_0_0= RULE_STRING )
            // InternalLcDsl.g:3630:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleTestConfig"
    // InternalLcDsl.g:3649:1: entryRuleTestConfig returns [EObject current=null] : iv_ruleTestConfig= ruleTestConfig EOF ;
    public final EObject entryRuleTestConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestConfig = null;


        try {
            // InternalLcDsl.g:3649:51: (iv_ruleTestConfig= ruleTestConfig EOF )
            // InternalLcDsl.g:3650:2: iv_ruleTestConfig= ruleTestConfig EOF
            {
             newCompositeNode(grammarAccess.getTestConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestConfig=ruleTestConfig();

            state._fsp--;

             current =iv_ruleTestConfig; 
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
    // $ANTLR end "entryRuleTestConfig"


    // $ANTLR start "ruleTestConfig"
    // InternalLcDsl.g:3656:1: ruleTestConfig returns [EObject current=null] : ( () otherlv_1= 'test' this_BLOCK_BEGIN_2= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* ) ) ) this_BLOCK_END_22= RULE_BLOCK_END ) ;
    public final EObject ruleTestConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BLOCK_BEGIN_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_container_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_method_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token this_BLOCK_END_22=null;
        Enumerator lv_runner_5_0 = null;

        AntlrDatatypeRuleToken lv_class_11_0 = null;

        AntlrDatatypeRuleToken lv_excludeTags_17_0 = null;

        AntlrDatatypeRuleToken lv_includeTags_20_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:3662:2: ( ( () otherlv_1= 'test' this_BLOCK_BEGIN_2= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* ) ) ) this_BLOCK_END_22= RULE_BLOCK_END ) )
            // InternalLcDsl.g:3663:2: ( () otherlv_1= 'test' this_BLOCK_BEGIN_2= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* ) ) ) this_BLOCK_END_22= RULE_BLOCK_END )
            {
            // InternalLcDsl.g:3663:2: ( () otherlv_1= 'test' this_BLOCK_BEGIN_2= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* ) ) ) this_BLOCK_END_22= RULE_BLOCK_END )
            // InternalLcDsl.g:3664:3: () otherlv_1= 'test' this_BLOCK_BEGIN_2= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* ) ) ) this_BLOCK_END_22= RULE_BLOCK_END
            {
            // InternalLcDsl.g:3664:3: ()
            // InternalLcDsl.g:3665:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestConfigAccess().getTestConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTestConfigAccess().getTestKeyword_1());
            		
            this_BLOCK_BEGIN_2=(Token)match(input,RULE_BLOCK_BEGIN,FOLLOW_38); 

            			newLeafNode(this_BLOCK_BEGIN_2, grammarAccess.getTestConfigAccess().getBLOCK_BEGINTerminalRuleCall_2());
            		
            // InternalLcDsl.g:3679:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* ) ) )
            // InternalLcDsl.g:3680:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:3680:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* ) )
            // InternalLcDsl.g:3681:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTestConfigAccess().getUnorderedGroup_3());
            				
            // InternalLcDsl.g:3684:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )* )
            // InternalLcDsl.g:3685:6: ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )*
            {
            // InternalLcDsl.g:3685:6: ( ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) ) )*
            loop35:
            do {
                int alt35=7;
                int LA35_0 = input.LA(1);

                if ( LA35_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt35=2;
                }
                else if ( LA35_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt35=3;
                }
                else if ( LA35_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 3) ) {
                    alt35=4;
                }
                else if ( LA35_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 4) ) {
                    alt35=5;
                }
                else if ( LA35_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 5) ) {
                    alt35=6;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLcDsl.g:3686:4: ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:3686:4: ({...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) ) )
            	    // InternalLcDsl.g:3687:5: {...}? => ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalLcDsl.g:3687:107: ( ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) ) )
            	    // InternalLcDsl.g:3688:6: ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalLcDsl.g:3691:9: ({...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' ) )
            	    // InternalLcDsl.g:3691:10: {...}? => (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "true");
            	    }
            	    // InternalLcDsl.g:3691:19: (otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';' )
            	    // InternalLcDsl.g:3691:20: otherlv_4= 'runner' ( (lv_runner_5_0= ruleTestRunnerType ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,82,FOLLOW_39); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTestConfigAccess().getRunnerKeyword_3_0_0());
            	    								
            	    // InternalLcDsl.g:3695:9: ( (lv_runner_5_0= ruleTestRunnerType ) )
            	    // InternalLcDsl.g:3696:10: (lv_runner_5_0= ruleTestRunnerType )
            	    {
            	    // InternalLcDsl.g:3696:10: (lv_runner_5_0= ruleTestRunnerType )
            	    // InternalLcDsl.g:3697:11: lv_runner_5_0= ruleTestRunnerType
            	    {

            	    											newCompositeNode(grammarAccess.getTestConfigAccess().getRunnerTestRunnerTypeEnumRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_runner_5_0=ruleTestRunnerType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTestConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"runner",
            	    												lv_runner_5_0,
            	    												"com.wamas.ide.launching.LcDsl.TestRunnerType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_6=(Token)match(input,34,FOLLOW_38); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTestConfigAccess().getSemicolonKeyword_3_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestConfigAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:3724:4: ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:3724:4: ({...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) )
            	    // InternalLcDsl.g:3725:5: {...}? => ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalLcDsl.g:3725:107: ( ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) )
            	    // InternalLcDsl.g:3726:6: ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalLcDsl.g:3729:9: ({...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' ) )
            	    // InternalLcDsl.g:3729:10: {...}? => (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "true");
            	    }
            	    // InternalLcDsl.g:3729:19: (otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    // InternalLcDsl.g:3729:20: otherlv_7= 'container' ( (lv_container_8_0= RULE_STRING ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,83,FOLLOW_6); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTestConfigAccess().getContainerKeyword_3_1_0());
            	    								
            	    // InternalLcDsl.g:3733:9: ( (lv_container_8_0= RULE_STRING ) )
            	    // InternalLcDsl.g:3734:10: (lv_container_8_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:3734:10: (lv_container_8_0= RULE_STRING )
            	    // InternalLcDsl.g:3735:11: lv_container_8_0= RULE_STRING
            	    {
            	    lv_container_8_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_container_8_0, grammarAccess.getTestConfigAccess().getContainerSTRINGTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestConfigRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"container",
            	    												lv_container_8_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_9=(Token)match(input,34,FOLLOW_38); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTestConfigAccess().getSemicolonKeyword_3_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestConfigAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:3761:4: ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:3761:4: ({...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) ) )
            	    // InternalLcDsl.g:3762:5: {...}? => ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalLcDsl.g:3762:107: ( ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) ) )
            	    // InternalLcDsl.g:3763:6: ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalLcDsl.g:3766:9: ({...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' ) )
            	    // InternalLcDsl.g:3766:10: {...}? => (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "true");
            	    }
            	    // InternalLcDsl.g:3766:19: (otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';' )
            	    // InternalLcDsl.g:3766:20: otherlv_10= 'class' ( (lv_class_11_0= ruleFQName ) ) otherlv_12= ';'
            	    {
            	    otherlv_10=(Token)match(input,84,FOLLOW_9); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTestConfigAccess().getClassKeyword_3_2_0());
            	    								
            	    // InternalLcDsl.g:3770:9: ( (lv_class_11_0= ruleFQName ) )
            	    // InternalLcDsl.g:3771:10: (lv_class_11_0= ruleFQName )
            	    {
            	    // InternalLcDsl.g:3771:10: (lv_class_11_0= ruleFQName )
            	    // InternalLcDsl.g:3772:11: lv_class_11_0= ruleFQName
            	    {

            	    											newCompositeNode(grammarAccess.getTestConfigAccess().getClassFQNameParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_class_11_0=ruleFQName();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTestConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"class",
            	    												lv_class_11_0,
            	    												"com.wamas.ide.launching.LcDsl.FQName");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_12=(Token)match(input,34,FOLLOW_38); 

            	    									newLeafNode(otherlv_12, grammarAccess.getTestConfigAccess().getSemicolonKeyword_3_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestConfigAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:3799:4: ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:3799:4: ({...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // InternalLcDsl.g:3800:5: {...}? => ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalLcDsl.g:3800:107: ( ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // InternalLcDsl.g:3801:6: ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalLcDsl.g:3804:9: ({...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // InternalLcDsl.g:3804:10: {...}? => (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "true");
            	    }
            	    // InternalLcDsl.g:3804:19: (otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // InternalLcDsl.g:3804:20: otherlv_13= 'method' ( (lv_method_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_13=(Token)match(input,85,FOLLOW_6); 

            	    									newLeafNode(otherlv_13, grammarAccess.getTestConfigAccess().getMethodKeyword_3_3_0());
            	    								
            	    // InternalLcDsl.g:3808:9: ( (lv_method_14_0= RULE_STRING ) )
            	    // InternalLcDsl.g:3809:10: (lv_method_14_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:3809:10: (lv_method_14_0= RULE_STRING )
            	    // InternalLcDsl.g:3810:11: lv_method_14_0= RULE_STRING
            	    {
            	    lv_method_14_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_method_14_0, grammarAccess.getTestConfigAccess().getMethodSTRINGTerminalRuleCall_3_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestConfigRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"method",
            	    												lv_method_14_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_15=(Token)match(input,34,FOLLOW_38); 

            	    									newLeafNode(otherlv_15, grammarAccess.getTestConfigAccess().getSemicolonKeyword_3_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestConfigAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:3836:4: ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:3836:4: ({...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) ) )
            	    // InternalLcDsl.g:3837:5: {...}? => ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalLcDsl.g:3837:107: ( ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) ) )
            	    // InternalLcDsl.g:3838:6: ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalLcDsl.g:3841:9: ({...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' ) )
            	    // InternalLcDsl.g:3841:10: {...}? => (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "true");
            	    }
            	    // InternalLcDsl.g:3841:19: (otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';' )
            	    // InternalLcDsl.g:3841:20: otherlv_16= 'exclude-tags' ( (lv_excludeTags_17_0= ruleTags ) ) otherlv_18= ';'
            	    {
            	    otherlv_16=(Token)match(input,86,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getTestConfigAccess().getExcludeTagsKeyword_3_4_0());
            	    								
            	    // InternalLcDsl.g:3845:9: ( (lv_excludeTags_17_0= ruleTags ) )
            	    // InternalLcDsl.g:3846:10: (lv_excludeTags_17_0= ruleTags )
            	    {
            	    // InternalLcDsl.g:3846:10: (lv_excludeTags_17_0= ruleTags )
            	    // InternalLcDsl.g:3847:11: lv_excludeTags_17_0= ruleTags
            	    {

            	    											newCompositeNode(grammarAccess.getTestConfigAccess().getExcludeTagsTagsParserRuleCall_3_4_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_excludeTags_17_0=ruleTags();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTestConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"excludeTags",
            	    												lv_excludeTags_17_0,
            	    												"com.wamas.ide.launching.LcDsl.Tags");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_18=(Token)match(input,34,FOLLOW_38); 

            	    									newLeafNode(otherlv_18, grammarAccess.getTestConfigAccess().getSemicolonKeyword_3_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestConfigAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:3874:4: ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:3874:4: ({...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) ) )
            	    // InternalLcDsl.g:3875:5: {...}? => ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalLcDsl.g:3875:107: ( ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) ) )
            	    // InternalLcDsl.g:3876:6: ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestConfigAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalLcDsl.g:3879:9: ({...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' ) )
            	    // InternalLcDsl.g:3879:10: {...}? => (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestConfig", "true");
            	    }
            	    // InternalLcDsl.g:3879:19: (otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';' )
            	    // InternalLcDsl.g:3879:20: otherlv_19= 'include-tags' ( (lv_includeTags_20_0= ruleTags ) ) otherlv_21= ';'
            	    {
            	    otherlv_19=(Token)match(input,87,FOLLOW_9); 

            	    									newLeafNode(otherlv_19, grammarAccess.getTestConfigAccess().getIncludeTagsKeyword_3_5_0());
            	    								
            	    // InternalLcDsl.g:3883:9: ( (lv_includeTags_20_0= ruleTags ) )
            	    // InternalLcDsl.g:3884:10: (lv_includeTags_20_0= ruleTags )
            	    {
            	    // InternalLcDsl.g:3884:10: (lv_includeTags_20_0= ruleTags )
            	    // InternalLcDsl.g:3885:11: lv_includeTags_20_0= ruleTags
            	    {

            	    											newCompositeNode(grammarAccess.getTestConfigAccess().getIncludeTagsTagsParserRuleCall_3_5_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_includeTags_20_0=ruleTags();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTestConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"includeTags",
            	    												lv_includeTags_20_0,
            	    												"com.wamas.ide.launching.LcDsl.Tags");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_21=(Token)match(input,34,FOLLOW_38); 

            	    									newLeafNode(otherlv_21, grammarAccess.getTestConfigAccess().getSemicolonKeyword_3_5_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestConfigAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTestConfigAccess().getUnorderedGroup_3());
            				

            }

            this_BLOCK_END_22=(Token)match(input,RULE_BLOCK_END,FOLLOW_2); 

            			newLeafNode(this_BLOCK_END_22, grammarAccess.getTestConfigAccess().getBLOCK_ENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleTestConfig"


    // $ANTLR start "entryRuleFQName"
    // InternalLcDsl.g:3927:1: entryRuleFQName returns [String current=null] : iv_ruleFQName= ruleFQName EOF ;
    public final String entryRuleFQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQName = null;


        try {
            // InternalLcDsl.g:3927:46: (iv_ruleFQName= ruleFQName EOF )
            // InternalLcDsl.g:3928:2: iv_ruleFQName= ruleFQName EOF
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
    // InternalLcDsl.g:3934:1: ruleFQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3940:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLcDsl.g:3941:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLcDsl.g:3941:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLcDsl.g:3942:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLcDsl.g:3949:3: (kw= '.' this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==88) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalLcDsl.g:3950:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,88,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_40); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop36;
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


    // $ANTLR start "entryRuleTags"
    // InternalLcDsl.g:3967:1: entryRuleTags returns [String current=null] : iv_ruleTags= ruleTags EOF ;
    public final String entryRuleTags() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTags = null;


        try {
            // InternalLcDsl.g:3967:44: (iv_ruleTags= ruleTags EOF )
            // InternalLcDsl.g:3968:2: iv_ruleTags= ruleTags EOF
            {
             newCompositeNode(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTags=ruleTags();

            state._fsp--;

             current =iv_ruleTags.getText(); 
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
    // $ANTLR end "entryRuleTags"


    // $ANTLR start "ruleTags"
    // InternalLcDsl.g:3974:1: ruleTags returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleTags() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3980:2: ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) )
            // InternalLcDsl.g:3981:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
            {
            // InternalLcDsl.g:3981:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
            // InternalLcDsl.g:3982:3: this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getTagsAccess().getIDTerminalRuleCall_0());
            		
            // InternalLcDsl.g:3989:3: (kw= ',' this_ID_2= RULE_ID )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==89) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalLcDsl.g:3990:4: kw= ',' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,89,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getTagsAccess().getCommaKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getTagsAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleTags"


    // $ANTLR start "ruleBrowserLaunchMode"
    // InternalLcDsl.g:4007:1: ruleBrowserLaunchMode returns [Enumerator current=null] : ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) ) ;
    public final Enumerator ruleBrowserLaunchMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:4013:2: ( ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) ) )
            // InternalLcDsl.g:4014:2: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) )
            {
            // InternalLcDsl.g:4014:2: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt38=1;
                }
                break;
            case 91:
                {
                alt38=2;
                }
                break;
            case 92:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalLcDsl.g:4015:3: (enumLiteral_0= 'internal' )
                    {
                    // InternalLcDsl.g:4015:3: (enumLiteral_0= 'internal' )
                    // InternalLcDsl.g:4016:4: enumLiteral_0= 'internal'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getBrowserLaunchModeAccess().getINTERNALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrowserLaunchModeAccess().getINTERNALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4023:3: (enumLiteral_1= 'external' )
                    {
                    // InternalLcDsl.g:4023:3: (enumLiteral_1= 'external' )
                    // InternalLcDsl.g:4024:4: enumLiteral_1= 'external'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getBrowserLaunchModeAccess().getEXTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrowserLaunchModeAccess().getEXTERNALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:4031:3: (enumLiteral_2= 'none' )
                    {
                    // InternalLcDsl.g:4031:3: (enumLiteral_2= 'none' )
                    // InternalLcDsl.g:4032:4: enumLiteral_2= 'none'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_2); 

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
    // InternalLcDsl.g:4042:1: ruleLaunchConfigType returns [Enumerator current=null] : ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) | (enumLiteral_4= 'swtbot' ) | (enumLiteral_5= 'junit-plugin' ) ) ;
    public final Enumerator ruleLaunchConfigType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalLcDsl.g:4048:2: ( ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) | (enumLiteral_4= 'swtbot' ) | (enumLiteral_5= 'junit-plugin' ) ) )
            // InternalLcDsl.g:4049:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) | (enumLiteral_4= 'swtbot' ) | (enumLiteral_5= 'junit-plugin' ) )
            {
            // InternalLcDsl.g:4049:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) | (enumLiteral_4= 'swtbot' ) | (enumLiteral_5= 'junit-plugin' ) )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt39=1;
                }
                break;
            case 94:
                {
                alt39=2;
                }
                break;
            case 95:
                {
                alt39=3;
                }
                break;
            case 96:
                {
                alt39=4;
                }
                break;
            case 97:
                {
                alt39=5;
                }
                break;
            case 98:
                {
                alt39=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalLcDsl.g:4050:3: (enumLiteral_0= 'java' )
                    {
                    // InternalLcDsl.g:4050:3: (enumLiteral_0= 'java' )
                    // InternalLcDsl.g:4051:4: enumLiteral_0= 'java'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4058:3: (enumLiteral_1= 'eclipse' )
                    {
                    // InternalLcDsl.g:4058:3: (enumLiteral_1= 'eclipse' )
                    // InternalLcDsl.g:4059:4: enumLiteral_1= 'eclipse'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:4066:3: (enumLiteral_2= 'rap' )
                    {
                    // InternalLcDsl.g:4066:3: (enumLiteral_2= 'rap' )
                    // InternalLcDsl.g:4067:4: enumLiteral_2= 'rap'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:4074:3: (enumLiteral_3= 'group' )
                    {
                    // InternalLcDsl.g:4074:3: (enumLiteral_3= 'group' )
                    // InternalLcDsl.g:4075:4: enumLiteral_3= 'group'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getGROUPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLaunchConfigTypeAccess().getGROUPEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:4082:3: (enumLiteral_4= 'swtbot' )
                    {
                    // InternalLcDsl.g:4082:3: (enumLiteral_4= 'swtbot' )
                    // InternalLcDsl.g:4083:4: enumLiteral_4= 'swtbot'
                    {
                    enumLiteral_4=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getSWTBOTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLaunchConfigTypeAccess().getSWTBOTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:4090:3: (enumLiteral_5= 'junit-plugin' )
                    {
                    // InternalLcDsl.g:4090:3: (enumLiteral_5= 'junit-plugin' )
                    // InternalLcDsl.g:4091:4: enumLiteral_5= 'junit-plugin'
                    {
                    enumLiteral_5=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getJUNIT_PLUGINEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLaunchConfigTypeAccess().getJUNIT_PLUGINEnumLiteralDeclaration_5());
                    			

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
    // InternalLcDsl.g:4101:1: ruleLaunchModeType returns [Enumerator current=null] : ( (enumLiteral_0= 'inherit' ) | (enumLiteral_1= 'run' ) | (enumLiteral_2= 'debug' ) | (enumLiteral_3= 'profile' ) | (enumLiteral_4= 'coverage' ) ) ;
    public final Enumerator ruleLaunchModeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLcDsl.g:4107:2: ( ( (enumLiteral_0= 'inherit' ) | (enumLiteral_1= 'run' ) | (enumLiteral_2= 'debug' ) | (enumLiteral_3= 'profile' ) | (enumLiteral_4= 'coverage' ) ) )
            // InternalLcDsl.g:4108:2: ( (enumLiteral_0= 'inherit' ) | (enumLiteral_1= 'run' ) | (enumLiteral_2= 'debug' ) | (enumLiteral_3= 'profile' ) | (enumLiteral_4= 'coverage' ) )
            {
            // InternalLcDsl.g:4108:2: ( (enumLiteral_0= 'inherit' ) | (enumLiteral_1= 'run' ) | (enumLiteral_2= 'debug' ) | (enumLiteral_3= 'profile' ) | (enumLiteral_4= 'coverage' ) )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt40=1;
                }
                break;
            case 100:
                {
                alt40=2;
                }
                break;
            case 101:
                {
                alt40=3;
                }
                break;
            case 102:
                {
                alt40=4;
                }
                break;
            case 103:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalLcDsl.g:4109:3: (enumLiteral_0= 'inherit' )
                    {
                    // InternalLcDsl.g:4109:3: (enumLiteral_0= 'inherit' )
                    // InternalLcDsl.g:4110:4: enumLiteral_0= 'inherit'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getINHERITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchModeTypeAccess().getINHERITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4117:3: (enumLiteral_1= 'run' )
                    {
                    // InternalLcDsl.g:4117:3: (enumLiteral_1= 'run' )
                    // InternalLcDsl.g:4118:4: enumLiteral_1= 'run'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:4125:3: (enumLiteral_2= 'debug' )
                    {
                    // InternalLcDsl.g:4125:3: (enumLiteral_2= 'debug' )
                    // InternalLcDsl.g:4126:4: enumLiteral_2= 'debug'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:4133:3: (enumLiteral_3= 'profile' )
                    {
                    // InternalLcDsl.g:4133:3: (enumLiteral_3= 'profile' )
                    // InternalLcDsl.g:4134:4: enumLiteral_3= 'profile'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:4141:3: (enumLiteral_4= 'coverage' )
                    {
                    // InternalLcDsl.g:4141:3: (enumLiteral_4= 'coverage' )
                    // InternalLcDsl.g:4142:4: enumLiteral_4= 'coverage'
                    {
                    enumLiteral_4=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_4());
                    			

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
    // InternalLcDsl.g:4152:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'MB' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'GB' ) | (enumLiteral_7= 'g' ) ) ;
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
            // InternalLcDsl.g:4158:2: ( ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'MB' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'GB' ) | (enumLiteral_7= 'g' ) ) )
            // InternalLcDsl.g:4159:2: ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'MB' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'GB' ) | (enumLiteral_7= 'g' ) )
            {
            // InternalLcDsl.g:4159:2: ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'MB' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'GB' ) | (enumLiteral_7= 'g' ) )
            int alt41=8;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt41=1;
                }
                break;
            case 105:
                {
                alt41=2;
                }
                break;
            case 106:
                {
                alt41=3;
                }
                break;
            case 107:
                {
                alt41=4;
                }
                break;
            case 108:
                {
                alt41=5;
                }
                break;
            case 109:
                {
                alt41=6;
                }
                break;
            case 110:
                {
                alt41=7;
                }
                break;
            case 111:
                {
                alt41=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalLcDsl.g:4160:3: (enumLiteral_0= 'M' )
                    {
                    // InternalLcDsl.g:4160:3: (enumLiteral_0= 'M' )
                    // InternalLcDsl.g:4161:4: enumLiteral_0= 'M'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4168:3: (enumLiteral_1= 'mb' )
                    {
                    // InternalLcDsl.g:4168:3: (enumLiteral_1= 'mb' )
                    // InternalLcDsl.g:4169:4: enumLiteral_1= 'mb'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:4176:3: (enumLiteral_2= 'MB' )
                    {
                    // InternalLcDsl.g:4176:3: (enumLiteral_2= 'MB' )
                    // InternalLcDsl.g:4177:4: enumLiteral_2= 'MB'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:4184:3: (enumLiteral_3= 'm' )
                    {
                    // InternalLcDsl.g:4184:3: (enumLiteral_3= 'm' )
                    // InternalLcDsl.g:4185:4: enumLiteral_3= 'm'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:4192:3: (enumLiteral_4= 'G' )
                    {
                    // InternalLcDsl.g:4192:3: (enumLiteral_4= 'G' )
                    // InternalLcDsl.g:4193:4: enumLiteral_4= 'G'
                    {
                    enumLiteral_4=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:4200:3: (enumLiteral_5= 'gb' )
                    {
                    // InternalLcDsl.g:4200:3: (enumLiteral_5= 'gb' )
                    // InternalLcDsl.g:4201:4: enumLiteral_5= 'gb'
                    {
                    enumLiteral_5=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:4208:3: (enumLiteral_6= 'GB' )
                    {
                    // InternalLcDsl.g:4208:3: (enumLiteral_6= 'GB' )
                    // InternalLcDsl.g:4209:4: enumLiteral_6= 'GB'
                    {
                    enumLiteral_6=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalLcDsl.g:4216:3: (enumLiteral_7= 'g' )
                    {
                    // InternalLcDsl.g:4216:3: (enumLiteral_7= 'g' )
                    // InternalLcDsl.g:4217:4: enumLiteral_7= 'g'
                    {
                    enumLiteral_7=(Token)match(input,111,FOLLOW_2); 

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
    // InternalLcDsl.g:4227:1: ruleOutputStream returns [Enumerator current=null] : ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) ;
    public final Enumerator ruleOutputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:4233:2: ( ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) )
            // InternalLcDsl.g:4234:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
            {
            // InternalLcDsl.g:4234:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt42=1;
                }
                break;
            case 113:
                {
                alt42=2;
                }
                break;
            case 114:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalLcDsl.g:4235:3: (enumLiteral_0= 'stdout' )
                    {
                    // InternalLcDsl.g:4235:3: (enumLiteral_0= 'stdout' )
                    // InternalLcDsl.g:4236:4: enumLiteral_0= 'stdout'
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4243:3: (enumLiteral_1= 'stderr' )
                    {
                    // InternalLcDsl.g:4243:3: (enumLiteral_1= 'stderr' )
                    // InternalLcDsl.g:4244:4: enumLiteral_1= 'stderr'
                    {
                    enumLiteral_1=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:4251:3: (enumLiteral_2= 'both-out' )
                    {
                    // InternalLcDsl.g:4251:3: (enumLiteral_2= 'both-out' )
                    // InternalLcDsl.g:4252:4: enumLiteral_2= 'both-out'
                    {
                    enumLiteral_2=(Token)match(input,114,FOLLOW_2); 

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
    // InternalLcDsl.g:4262:1: ruleInputStream returns [Enumerator current=null] : (enumLiteral_0= 'stdin' ) ;
    public final Enumerator ruleInputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:4268:2: ( (enumLiteral_0= 'stdin' ) )
            // InternalLcDsl.g:4269:2: (enumLiteral_0= 'stdin' )
            {
            // InternalLcDsl.g:4269:2: (enumLiteral_0= 'stdin' )
            // InternalLcDsl.g:4270:3: enumLiteral_0= 'stdin'
            {
            enumLiteral_0=(Token)match(input,115,FOLLOW_2); 

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


    // $ANTLR start "ruleTestRunnerType"
    // InternalLcDsl.g:4279:1: ruleTestRunnerType returns [Enumerator current=null] : ( (enumLiteral_0= 'junit5' ) | (enumLiteral_1= 'junit4' ) | (enumLiteral_2= 'junit3' ) ) ;
    public final Enumerator ruleTestRunnerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:4285:2: ( ( (enumLiteral_0= 'junit5' ) | (enumLiteral_1= 'junit4' ) | (enumLiteral_2= 'junit3' ) ) )
            // InternalLcDsl.g:4286:2: ( (enumLiteral_0= 'junit5' ) | (enumLiteral_1= 'junit4' ) | (enumLiteral_2= 'junit3' ) )
            {
            // InternalLcDsl.g:4286:2: ( (enumLiteral_0= 'junit5' ) | (enumLiteral_1= 'junit4' ) | (enumLiteral_2= 'junit3' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt43=1;
                }
                break;
            case 117:
                {
                alt43=2;
                }
                break;
            case 118:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalLcDsl.g:4287:3: (enumLiteral_0= 'junit5' )
                    {
                    // InternalLcDsl.g:4287:3: (enumLiteral_0= 'junit5' )
                    // InternalLcDsl.g:4288:4: enumLiteral_0= 'junit5'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getTestRunnerTypeAccess().getJUNIT5EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTestRunnerTypeAccess().getJUNIT5EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:4295:3: (enumLiteral_1= 'junit4' )
                    {
                    // InternalLcDsl.g:4295:3: (enumLiteral_1= 'junit4' )
                    // InternalLcDsl.g:4296:4: enumLiteral_1= 'junit4'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getTestRunnerTypeAccess().getJUNIT4EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTestRunnerTypeAccess().getJUNIT4EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:4303:3: (enumLiteral_2= 'junit3' )
                    {
                    // InternalLcDsl.g:4303:3: (enumLiteral_2= 'junit3' )
                    // InternalLcDsl.g:4304:4: enumLiteral_2= 'junit3'
                    {
                    enumLiteral_2=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getTestRunnerTypeAccess().getJUNIT3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTestRunnerTypeAccess().getJUNIT3EnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTestRunnerType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000007FF80002L,0x00000007E0000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000FFF80000L,0x00000007E0000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000FFF80010L,0x00000007E0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x13C7FFDA00000100L,0x000000F800023120L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L,0x000000F800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0010000400000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0C00000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xE000000000000100L,0x0000000000000007L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000600000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000600000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000FF0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x000000F800003000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000100L,0x0000000000FC0000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});

}
