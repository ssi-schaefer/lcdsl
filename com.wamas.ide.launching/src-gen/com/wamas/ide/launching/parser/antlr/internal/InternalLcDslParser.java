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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BLOCK_BEGIN", "RULE_BLOCK_END", "RULE_ID", "RULE_EQ", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_VERSION", "RULE_QUALIFIER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'explicit'", "'manual'", "'abstract'", "'foreground'", "'no-console'", "'no-validate'", "'sw-install-allowed'", "'replace-env'", "'stop-in-main'", "'configuration'", "':'", "'workspace'", "';'", "'working-dir'", "'project'", "'self'", "'main-class'", "'optional'", "'plugin'", "'feature'", "'content-provider'", "'ignore'", "'vm-argument'", "'argument'", "'environment'", "'application'", "'product'", "'favorite'", "'redirect'", "'to'", "'!'", "'from'", "'execution-environment'", "'config-ini-template'", "'trace'", "'search-main'", "'system'", "'inherited'", "'servlet'", "'path'", "'browser'", "'port'", "'session-timeout'", "'context-path'", "'dev-mode'", "'autostart'", "'startlevel'", "'clear'", "'log'", "'config'", "'memory'", "'min'", "'max'", "'perm'", "'adopt'", "'member'", "'delay'", "'regex'", "'wait'", "'.'", "'internal'", "'external'", "'none'", "'java'", "'eclipse'", "'rap'", "'group'", "'run'", "'debug'", "'profile'", "'coverage'", "'inherit'", "'M'", "'mb'", "'MB'", "'m'", "'G'", "'gb'", "'GB'", "'g'", "'stdout'", "'stderr'", "'both-out'", "'stdin'"
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=10;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
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

                if ( ((LA1_0>=17 && LA1_0<=25)||(LA1_0>=80 && LA1_0<=83)) ) {
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
    // InternalLcDsl.g:108:1: ruleLaunchConfig returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_10_0= ruleLaunchConfigType ) ) otherlv_11= 'configuration' ( (lv_name_12_0= ruleFQName ) ) (otherlv_13= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_15= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_32_0= ruleAddPlugin ) ) | ( (lv_features_33_0= ruleAddFeature ) ) | ( (lv_ignore_34_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_35_0= ruleGroupMember ) ) | ( (lv_vmArgs_36_0= ruleVmArgument ) ) | ( (lv_progArgs_37_0= ruleProgramArgument ) ) | ( (lv_envVars_38_0= ruleEnvironmentVariable ) ) | ( (lv_traces_39_0= ruleTraceEnablement ) ) )* this_BLOCK_END_40= RULE_BLOCK_END ) ;
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
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token this_BLOCK_BEGIN_15=null;
        Token this_BLOCK_END_40=null;
        Enumerator lv_type_10_0 = null;

        AntlrDatatypeRuleToken lv_name_12_0 = null;

        EObject lv_clears_17_0 = null;

        EObject lv_workspace_18_0 = null;

        EObject lv_workingDir_19_0 = null;

        EObject lv_memory_20_0 = null;

        EObject lv_mainProject_21_0 = null;

        EObject lv_mainType_22_0 = null;

        EObject lv_application_23_0 = null;

        EObject lv_product_24_0 = null;

        EObject lv_favorites_25_0 = null;

        EObject lv_redirect_26_0 = null;

        EObject lv_execEnv_27_0 = null;

        EObject lv_configIniTemplate_28_0 = null;

        EObject lv_javaMainSearch_29_0 = null;

        EObject lv_servletConfig_30_0 = null;

        EObject lv_contentProviderProduct_31_0 = null;

        EObject lv_plugins_32_0 = null;

        EObject lv_features_33_0 = null;

        EObject lv_ignore_34_0 = null;

        EObject lv_groupMembers_35_0 = null;

        EObject lv_vmArgs_36_0 = null;

        EObject lv_progArgs_37_0 = null;

        EObject lv_envVars_38_0 = null;

        EObject lv_traces_39_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:114:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_10_0= ruleLaunchConfigType ) ) otherlv_11= 'configuration' ( (lv_name_12_0= ruleFQName ) ) (otherlv_13= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_15= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_32_0= ruleAddPlugin ) ) | ( (lv_features_33_0= ruleAddFeature ) ) | ( (lv_ignore_34_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_35_0= ruleGroupMember ) ) | ( (lv_vmArgs_36_0= ruleVmArgument ) ) | ( (lv_progArgs_37_0= ruleProgramArgument ) ) | ( (lv_envVars_38_0= ruleEnvironmentVariable ) ) | ( (lv_traces_39_0= ruleTraceEnablement ) ) )* this_BLOCK_END_40= RULE_BLOCK_END ) )
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_10_0= ruleLaunchConfigType ) ) otherlv_11= 'configuration' ( (lv_name_12_0= ruleFQName ) ) (otherlv_13= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_15= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_32_0= ruleAddPlugin ) ) | ( (lv_features_33_0= ruleAddFeature ) ) | ( (lv_ignore_34_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_35_0= ruleGroupMember ) ) | ( (lv_vmArgs_36_0= ruleVmArgument ) ) | ( (lv_progArgs_37_0= ruleProgramArgument ) ) | ( (lv_envVars_38_0= ruleEnvironmentVariable ) ) | ( (lv_traces_39_0= ruleTraceEnablement ) ) )* this_BLOCK_END_40= RULE_BLOCK_END )
            {
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_10_0= ruleLaunchConfigType ) ) otherlv_11= 'configuration' ( (lv_name_12_0= ruleFQName ) ) (otherlv_13= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_15= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_32_0= ruleAddPlugin ) ) | ( (lv_features_33_0= ruleAddFeature ) ) | ( (lv_ignore_34_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_35_0= ruleGroupMember ) ) | ( (lv_vmArgs_36_0= ruleVmArgument ) ) | ( (lv_progArgs_37_0= ruleProgramArgument ) ) | ( (lv_envVars_38_0= ruleEnvironmentVariable ) ) | ( (lv_traces_39_0= ruleTraceEnablement ) ) )* this_BLOCK_END_40= RULE_BLOCK_END )
            // InternalLcDsl.g:116:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_10_0= ruleLaunchConfigType ) ) otherlv_11= 'configuration' ( (lv_name_12_0= ruleFQName ) ) (otherlv_13= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_15= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_32_0= ruleAddPlugin ) ) | ( (lv_features_33_0= ruleAddFeature ) ) | ( (lv_ignore_34_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_35_0= ruleGroupMember ) ) | ( (lv_vmArgs_36_0= ruleVmArgument ) ) | ( (lv_progArgs_37_0= ruleProgramArgument ) ) | ( (lv_envVars_38_0= ruleEnvironmentVariable ) ) | ( (lv_traces_39_0= ruleTraceEnablement ) ) )* this_BLOCK_END_40= RULE_BLOCK_END
            {
            // InternalLcDsl.g:116:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:117:4: ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:117:4: ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:118:5: ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            				
            // InternalLcDsl.g:121:5: ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )* )
            // InternalLcDsl.g:122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )*
            loop2:
            do {
                int alt2=10;
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
            	    lv_abstract_3_0=(Token)match(input,19,FOLLOW_4); 

            	    										newLeafNode(lv_abstract_3_0, grammarAccess.getLaunchConfigAccess().getAbstractAbstractKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										setWithLastConsumed(current, "abstract", true, "abstract");
            	    									

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
            	    lv_foreground_4_0=(Token)match(input,20,FOLLOW_4); 

            	    										newLeafNode(lv_foreground_4_0, grammarAccess.getLaunchConfigAccess().getForegroundForegroundKeyword_0_3_0());
            	    									

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
            	    lv_noConsole_5_0=(Token)match(input,21,FOLLOW_4); 

            	    										newLeafNode(lv_noConsole_5_0, grammarAccess.getLaunchConfigAccess().getNoConsoleNoConsoleKeyword_0_4_0());
            	    									

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
            	    lv_noValidate_6_0=(Token)match(input,22,FOLLOW_4); 

            	    										newLeafNode(lv_noValidate_6_0, grammarAccess.getLaunchConfigAccess().getNoValidateNoValidateKeyword_0_5_0());
            	    									

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
            	    lv_swInstallSupport_7_0=(Token)match(input,23,FOLLOW_4); 

            	    										newLeafNode(lv_swInstallSupport_7_0, grammarAccess.getLaunchConfigAccess().getSwInstallSupportSwInstallAllowedKeyword_0_6_0());
            	    									

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
            	    lv_replaceEnv_8_0=(Token)match(input,24,FOLLOW_4); 

            	    										newLeafNode(lv_replaceEnv_8_0, grammarAccess.getLaunchConfigAccess().getReplaceEnvReplaceEnvKeyword_0_7_0());
            	    									

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
            	    lv_stopInMain_9_0=(Token)match(input,25,FOLLOW_4); 

            	    										newLeafNode(lv_stopInMain_9_0, grammarAccess.getLaunchConfigAccess().getStopInMainStopInMainKeyword_0_8_0());
            	    									

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

            // InternalLcDsl.g:337:3: ( (lv_type_10_0= ruleLaunchConfigType ) )
            // InternalLcDsl.g:338:4: (lv_type_10_0= ruleLaunchConfigType )
            {
            // InternalLcDsl.g:338:4: (lv_type_10_0= ruleLaunchConfigType )
            // InternalLcDsl.g:339:5: lv_type_10_0= ruleLaunchConfigType
            {

            					newCompositeNode(grammarAccess.getLaunchConfigAccess().getTypeLaunchConfigTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_10_0=ruleLaunchConfigType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_10_0,
            						"com.wamas.ide.launching.LcDsl.LaunchConfigType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getLaunchConfigAccess().getConfigurationKeyword_2());
            		
            // InternalLcDsl.g:360:3: ( (lv_name_12_0= ruleFQName ) )
            // InternalLcDsl.g:361:4: (lv_name_12_0= ruleFQName )
            {
            // InternalLcDsl.g:361:4: (lv_name_12_0= ruleFQName )
            // InternalLcDsl.g:362:5: lv_name_12_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getLaunchConfigAccess().getNameFQNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_12_0=ruleFQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_12_0,
            						"com.wamas.ide.launching.LcDsl.FQName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:379:3: (otherlv_13= ':' ( ( ruleFQName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLcDsl.g:380:4: otherlv_13= ':' ( ( ruleFQName ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getLaunchConfigAccess().getColonKeyword_4_0());
                    			
                    // InternalLcDsl.g:384:4: ( ( ruleFQName ) )
                    // InternalLcDsl.g:385:5: ( ruleFQName )
                    {
                    // InternalLcDsl.g:385:5: ( ruleFQName )
                    // InternalLcDsl.g:386:6: ruleFQName
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

            this_BLOCK_BEGIN_15=(Token)match(input,RULE_BLOCK_BEGIN,FOLLOW_9); 

            			newLeafNode(this_BLOCK_BEGIN_15, grammarAccess.getLaunchConfigAccess().getBLOCK_BEGINTerminalRuleCall_5());
            		
            // InternalLcDsl.g:405:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:406:4: ( ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:406:4: ( ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* ) )
            // InternalLcDsl.g:407:5: ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            				
            // InternalLcDsl.g:410:5: ( ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )* )
            // InternalLcDsl.g:411:6: ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )*
            {
            // InternalLcDsl.g:411:6: ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )*
            loop4:
            do {
                int alt4=16;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalLcDsl.g:412:4: ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:412:4: ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) )
            	    // InternalLcDsl.g:413:5: {...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalLcDsl.g:413:109: ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) )
            	    // InternalLcDsl.g:414:6: ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0);
            	    					
            	    // InternalLcDsl.g:417:9: ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) )
            	    // InternalLcDsl.g:417:10: {...}? => ( (lv_clears_17_0= ruleClearOption ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:417:19: ( (lv_clears_17_0= ruleClearOption ) )
            	    // InternalLcDsl.g:417:20: (lv_clears_17_0= ruleClearOption )
            	    {
            	    // InternalLcDsl.g:417:20: (lv_clears_17_0= ruleClearOption )
            	    // InternalLcDsl.g:418:10: lv_clears_17_0= ruleClearOption
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getClearsClearOptionParserRuleCall_6_0_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_clears_17_0=ruleClearOption();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"clears",
            	    											lv_clears_17_0,
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
            	    // InternalLcDsl.g:440:4: ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:440:4: ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) )
            	    // InternalLcDsl.g:441:5: {...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalLcDsl.g:441:109: ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) )
            	    // InternalLcDsl.g:442:6: ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1);
            	    					
            	    // InternalLcDsl.g:445:9: ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) )
            	    // InternalLcDsl.g:445:10: {...}? => ( (lv_workspace_18_0= ruleWorkspace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:445:19: ( (lv_workspace_18_0= ruleWorkspace ) )
            	    // InternalLcDsl.g:445:20: (lv_workspace_18_0= ruleWorkspace )
            	    {
            	    // InternalLcDsl.g:445:20: (lv_workspace_18_0= ruleWorkspace )
            	    // InternalLcDsl.g:446:10: lv_workspace_18_0= ruleWorkspace
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkspaceWorkspaceParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_workspace_18_0=ruleWorkspace();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"workspace",
            	    											lv_workspace_18_0,
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
            	    // InternalLcDsl.g:468:4: ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:468:4: ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) )
            	    // InternalLcDsl.g:469:5: {...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalLcDsl.g:469:109: ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) )
            	    // InternalLcDsl.g:470:6: ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2);
            	    					
            	    // InternalLcDsl.g:473:9: ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) )
            	    // InternalLcDsl.g:473:10: {...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:473:19: ( (lv_workingDir_19_0= ruleWorkingDir ) )
            	    // InternalLcDsl.g:473:20: (lv_workingDir_19_0= ruleWorkingDir )
            	    {
            	    // InternalLcDsl.g:473:20: (lv_workingDir_19_0= ruleWorkingDir )
            	    // InternalLcDsl.g:474:10: lv_workingDir_19_0= ruleWorkingDir
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkingDirWorkingDirParserRuleCall_6_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_workingDir_19_0=ruleWorkingDir();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"workingDir",
            	    											lv_workingDir_19_0,
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
            	    // InternalLcDsl.g:496:4: ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:496:4: ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) )
            	    // InternalLcDsl.g:497:5: {...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalLcDsl.g:497:109: ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) )
            	    // InternalLcDsl.g:498:6: ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3);
            	    					
            	    // InternalLcDsl.g:501:9: ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) )
            	    // InternalLcDsl.g:501:10: {...}? => ( (lv_memory_20_0= ruleMemoryOption ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:501:19: ( (lv_memory_20_0= ruleMemoryOption ) )
            	    // InternalLcDsl.g:501:20: (lv_memory_20_0= ruleMemoryOption )
            	    {
            	    // InternalLcDsl.g:501:20: (lv_memory_20_0= ruleMemoryOption )
            	    // InternalLcDsl.g:502:10: lv_memory_20_0= ruleMemoryOption
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getMemoryMemoryOptionParserRuleCall_6_3_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_memory_20_0=ruleMemoryOption();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"memory",
            	    											lv_memory_20_0,
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
            	    // InternalLcDsl.g:524:4: ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:524:4: ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) )
            	    // InternalLcDsl.g:525:5: {...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalLcDsl.g:525:109: ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) )
            	    // InternalLcDsl.g:526:6: ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4);
            	    					
            	    // InternalLcDsl.g:529:9: ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) )
            	    // InternalLcDsl.g:529:10: {...}? => ( (lv_mainProject_21_0= ruleMainProject ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:529:19: ( (lv_mainProject_21_0= ruleMainProject ) )
            	    // InternalLcDsl.g:529:20: (lv_mainProject_21_0= ruleMainProject )
            	    {
            	    // InternalLcDsl.g:529:20: (lv_mainProject_21_0= ruleMainProject )
            	    // InternalLcDsl.g:530:10: lv_mainProject_21_0= ruleMainProject
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getMainProjectMainProjectParserRuleCall_6_4_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_mainProject_21_0=ruleMainProject();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"mainProject",
            	    											lv_mainProject_21_0,
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
            	    // InternalLcDsl.g:552:4: ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:552:4: ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) )
            	    // InternalLcDsl.g:553:5: {...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalLcDsl.g:553:109: ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) )
            	    // InternalLcDsl.g:554:6: ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5);
            	    					
            	    // InternalLcDsl.g:557:9: ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) )
            	    // InternalLcDsl.g:557:10: {...}? => ( (lv_mainType_22_0= ruleMainType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:557:19: ( (lv_mainType_22_0= ruleMainType ) )
            	    // InternalLcDsl.g:557:20: (lv_mainType_22_0= ruleMainType )
            	    {
            	    // InternalLcDsl.g:557:20: (lv_mainType_22_0= ruleMainType )
            	    // InternalLcDsl.g:558:10: lv_mainType_22_0= ruleMainType
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getMainTypeMainTypeParserRuleCall_6_5_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_mainType_22_0=ruleMainType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"mainType",
            	    											lv_mainType_22_0,
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
            	    // InternalLcDsl.g:580:4: ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:580:4: ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:581:5: {...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // InternalLcDsl.g:581:109: ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) )
            	    // InternalLcDsl.g:582:6: ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6);
            	    					
            	    // InternalLcDsl.g:585:9: ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) )
            	    // InternalLcDsl.g:585:10: {...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:585:19: ( (lv_application_23_0= ruleApplicationExtPoint ) )
            	    // InternalLcDsl.g:585:20: (lv_application_23_0= ruleApplicationExtPoint )
            	    {
            	    // InternalLcDsl.g:585:20: (lv_application_23_0= ruleApplicationExtPoint )
            	    // InternalLcDsl.g:586:10: lv_application_23_0= ruleApplicationExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getApplicationApplicationExtPointParserRuleCall_6_6_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_application_23_0=ruleApplicationExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"application",
            	    											lv_application_23_0,
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
            	    // InternalLcDsl.g:608:4: ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:608:4: ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:609:5: {...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7)");
            	    }
            	    // InternalLcDsl.g:609:109: ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) )
            	    // InternalLcDsl.g:610:6: ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7);
            	    					
            	    // InternalLcDsl.g:613:9: ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) )
            	    // InternalLcDsl.g:613:10: {...}? => ( (lv_product_24_0= ruleProductExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:613:19: ( (lv_product_24_0= ruleProductExtPoint ) )
            	    // InternalLcDsl.g:613:20: (lv_product_24_0= ruleProductExtPoint )
            	    {
            	    // InternalLcDsl.g:613:20: (lv_product_24_0= ruleProductExtPoint )
            	    // InternalLcDsl.g:614:10: lv_product_24_0= ruleProductExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getProductProductExtPointParserRuleCall_6_7_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_product_24_0=ruleProductExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"product",
            	    											lv_product_24_0,
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
            	    // InternalLcDsl.g:636:4: ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:636:4: ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) )
            	    // InternalLcDsl.g:637:5: {...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8)");
            	    }
            	    // InternalLcDsl.g:637:109: ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) )
            	    // InternalLcDsl.g:638:6: ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8);
            	    					
            	    // InternalLcDsl.g:641:9: ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) )
            	    // InternalLcDsl.g:641:10: {...}? => ( (lv_favorites_25_0= ruleFavorites ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:641:19: ( (lv_favorites_25_0= ruleFavorites ) )
            	    // InternalLcDsl.g:641:20: (lv_favorites_25_0= ruleFavorites )
            	    {
            	    // InternalLcDsl.g:641:20: (lv_favorites_25_0= ruleFavorites )
            	    // InternalLcDsl.g:642:10: lv_favorites_25_0= ruleFavorites
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getFavoritesFavoritesParserRuleCall_6_8_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_favorites_25_0=ruleFavorites();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"favorites",
            	    											lv_favorites_25_0,
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
            	    // InternalLcDsl.g:664:4: ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:664:4: ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) )
            	    // InternalLcDsl.g:665:5: {...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9)");
            	    }
            	    // InternalLcDsl.g:665:109: ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) )
            	    // InternalLcDsl.g:666:6: ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9);
            	    					
            	    // InternalLcDsl.g:669:9: ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) )
            	    // InternalLcDsl.g:669:10: {...}? => ( (lv_redirect_26_0= ruleRedirect ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:669:19: ( (lv_redirect_26_0= ruleRedirect ) )
            	    // InternalLcDsl.g:669:20: (lv_redirect_26_0= ruleRedirect )
            	    {
            	    // InternalLcDsl.g:669:20: (lv_redirect_26_0= ruleRedirect )
            	    // InternalLcDsl.g:670:10: lv_redirect_26_0= ruleRedirect
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getRedirectRedirectParserRuleCall_6_9_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_redirect_26_0=ruleRedirect();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"redirect",
            	    											lv_redirect_26_0,
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
            	    // InternalLcDsl.g:692:4: ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:692:4: ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) )
            	    // InternalLcDsl.g:693:5: {...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10)");
            	    }
            	    // InternalLcDsl.g:693:110: ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) )
            	    // InternalLcDsl.g:694:6: ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10);
            	    					
            	    // InternalLcDsl.g:697:9: ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) )
            	    // InternalLcDsl.g:697:10: {...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:697:19: ( (lv_execEnv_27_0= ruleExecutionEnvironment ) )
            	    // InternalLcDsl.g:697:20: (lv_execEnv_27_0= ruleExecutionEnvironment )
            	    {
            	    // InternalLcDsl.g:697:20: (lv_execEnv_27_0= ruleExecutionEnvironment )
            	    // InternalLcDsl.g:698:10: lv_execEnv_27_0= ruleExecutionEnvironment
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getExecEnvExecutionEnvironmentParserRuleCall_6_10_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_execEnv_27_0=ruleExecutionEnvironment();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"execEnv",
            	    											lv_execEnv_27_0,
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
            	    // InternalLcDsl.g:720:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:720:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) )
            	    // InternalLcDsl.g:721:5: {...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11)");
            	    }
            	    // InternalLcDsl.g:721:110: ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) )
            	    // InternalLcDsl.g:722:6: ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11);
            	    					
            	    // InternalLcDsl.g:725:9: ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) )
            	    // InternalLcDsl.g:725:10: {...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:725:19: ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) )
            	    // InternalLcDsl.g:725:20: (lv_configIniTemplate_28_0= ruleConfigIniTemplate )
            	    {
            	    // InternalLcDsl.g:725:20: (lv_configIniTemplate_28_0= ruleConfigIniTemplate )
            	    // InternalLcDsl.g:726:10: lv_configIniTemplate_28_0= ruleConfigIniTemplate
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getConfigIniTemplateConfigIniTemplateParserRuleCall_6_11_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_configIniTemplate_28_0=ruleConfigIniTemplate();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"configIniTemplate",
            	    											lv_configIniTemplate_28_0,
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
            	    // InternalLcDsl.g:748:4: ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:748:4: ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) )
            	    // InternalLcDsl.g:749:5: {...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12)");
            	    }
            	    // InternalLcDsl.g:749:110: ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) )
            	    // InternalLcDsl.g:750:6: ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12);
            	    					
            	    // InternalLcDsl.g:753:9: ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) )
            	    // InternalLcDsl.g:753:10: {...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:753:19: ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) )
            	    // InternalLcDsl.g:753:20: (lv_javaMainSearch_29_0= ruleJavaMainSearch )
            	    {
            	    // InternalLcDsl.g:753:20: (lv_javaMainSearch_29_0= ruleJavaMainSearch )
            	    // InternalLcDsl.g:754:10: lv_javaMainSearch_29_0= ruleJavaMainSearch
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getJavaMainSearchJavaMainSearchParserRuleCall_6_12_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_javaMainSearch_29_0=ruleJavaMainSearch();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"javaMainSearch",
            	    											lv_javaMainSearch_29_0,
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
            	    // InternalLcDsl.g:776:4: ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:776:4: ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) )
            	    // InternalLcDsl.g:777:5: {...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13)");
            	    }
            	    // InternalLcDsl.g:777:110: ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) )
            	    // InternalLcDsl.g:778:6: ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13);
            	    					
            	    // InternalLcDsl.g:781:9: ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) )
            	    // InternalLcDsl.g:781:10: {...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:781:19: ( (lv_servletConfig_30_0= ruleRapServletConfig ) )
            	    // InternalLcDsl.g:781:20: (lv_servletConfig_30_0= ruleRapServletConfig )
            	    {
            	    // InternalLcDsl.g:781:20: (lv_servletConfig_30_0= ruleRapServletConfig )
            	    // InternalLcDsl.g:782:10: lv_servletConfig_30_0= ruleRapServletConfig
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getServletConfigRapServletConfigParserRuleCall_6_13_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_servletConfig_30_0=ruleRapServletConfig();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"servletConfig",
            	    											lv_servletConfig_30_0,
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
            	    // InternalLcDsl.g:804:4: ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:804:4: ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) )
            	    // InternalLcDsl.g:805:5: {...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 14)");
            	    }
            	    // InternalLcDsl.g:805:110: ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) )
            	    // InternalLcDsl.g:806:6: ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 14);
            	    					
            	    // InternalLcDsl.g:809:9: ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) )
            	    // InternalLcDsl.g:809:10: {...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:809:19: ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) )
            	    // InternalLcDsl.g:809:20: (lv_contentProviderProduct_31_0= ruleContentProviderProduct )
            	    {
            	    // InternalLcDsl.g:809:20: (lv_contentProviderProduct_31_0= ruleContentProviderProduct )
            	    // InternalLcDsl.g:810:10: lv_contentProviderProduct_31_0= ruleContentProviderProduct
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getContentProviderProductContentProviderProductParserRuleCall_6_14_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_contentProviderProduct_31_0=ruleContentProviderProduct();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"contentProviderProduct",
            	    											lv_contentProviderProduct_31_0,
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

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            				

            }

            // InternalLcDsl.g:839:3: ( ( (lv_plugins_32_0= ruleAddPlugin ) ) | ( (lv_features_33_0= ruleAddFeature ) ) | ( (lv_ignore_34_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_35_0= ruleGroupMember ) ) | ( (lv_vmArgs_36_0= ruleVmArgument ) ) | ( (lv_progArgs_37_0= ruleProgramArgument ) ) | ( (lv_envVars_38_0= ruleEnvironmentVariable ) ) | ( (lv_traces_39_0= ruleTraceEnablement ) ) )*
            loop5:
            do {
                int alt5=9;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalLcDsl.g:840:4: ( (lv_plugins_32_0= ruleAddPlugin ) )
            	    {
            	    // InternalLcDsl.g:840:4: ( (lv_plugins_32_0= ruleAddPlugin ) )
            	    // InternalLcDsl.g:841:5: (lv_plugins_32_0= ruleAddPlugin )
            	    {
            	    // InternalLcDsl.g:841:5: (lv_plugins_32_0= ruleAddPlugin )
            	    // InternalLcDsl.g:842:6: lv_plugins_32_0= ruleAddPlugin
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getPluginsAddPluginParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_plugins_32_0=ruleAddPlugin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"plugins",
            	    							lv_plugins_32_0,
            	    							"com.wamas.ide.launching.LcDsl.AddPlugin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:860:4: ( (lv_features_33_0= ruleAddFeature ) )
            	    {
            	    // InternalLcDsl.g:860:4: ( (lv_features_33_0= ruleAddFeature ) )
            	    // InternalLcDsl.g:861:5: (lv_features_33_0= ruleAddFeature )
            	    {
            	    // InternalLcDsl.g:861:5: (lv_features_33_0= ruleAddFeature )
            	    // InternalLcDsl.g:862:6: lv_features_33_0= ruleAddFeature
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getFeaturesAddFeatureParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_features_33_0=ruleAddFeature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"features",
            	    							lv_features_33_0,
            	    							"com.wamas.ide.launching.LcDsl.AddFeature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:880:4: ( (lv_ignore_34_0= ruleIgnorePlugin ) )
            	    {
            	    // InternalLcDsl.g:880:4: ( (lv_ignore_34_0= ruleIgnorePlugin ) )
            	    // InternalLcDsl.g:881:5: (lv_ignore_34_0= ruleIgnorePlugin )
            	    {
            	    // InternalLcDsl.g:881:5: (lv_ignore_34_0= ruleIgnorePlugin )
            	    // InternalLcDsl.g:882:6: lv_ignore_34_0= ruleIgnorePlugin
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getIgnoreIgnorePluginParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_ignore_34_0=ruleIgnorePlugin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ignore",
            	    							lv_ignore_34_0,
            	    							"com.wamas.ide.launching.LcDsl.IgnorePlugin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:900:4: ( (lv_groupMembers_35_0= ruleGroupMember ) )
            	    {
            	    // InternalLcDsl.g:900:4: ( (lv_groupMembers_35_0= ruleGroupMember ) )
            	    // InternalLcDsl.g:901:5: (lv_groupMembers_35_0= ruleGroupMember )
            	    {
            	    // InternalLcDsl.g:901:5: (lv_groupMembers_35_0= ruleGroupMember )
            	    // InternalLcDsl.g:902:6: lv_groupMembers_35_0= ruleGroupMember
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getGroupMembersGroupMemberParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_groupMembers_35_0=ruleGroupMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"groupMembers",
            	    							lv_groupMembers_35_0,
            	    							"com.wamas.ide.launching.LcDsl.GroupMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:920:4: ( (lv_vmArgs_36_0= ruleVmArgument ) )
            	    {
            	    // InternalLcDsl.g:920:4: ( (lv_vmArgs_36_0= ruleVmArgument ) )
            	    // InternalLcDsl.g:921:5: (lv_vmArgs_36_0= ruleVmArgument )
            	    {
            	    // InternalLcDsl.g:921:5: (lv_vmArgs_36_0= ruleVmArgument )
            	    // InternalLcDsl.g:922:6: lv_vmArgs_36_0= ruleVmArgument
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getVmArgsVmArgumentParserRuleCall_7_4_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_vmArgs_36_0=ruleVmArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vmArgs",
            	    							lv_vmArgs_36_0,
            	    							"com.wamas.ide.launching.LcDsl.VmArgument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:940:4: ( (lv_progArgs_37_0= ruleProgramArgument ) )
            	    {
            	    // InternalLcDsl.g:940:4: ( (lv_progArgs_37_0= ruleProgramArgument ) )
            	    // InternalLcDsl.g:941:5: (lv_progArgs_37_0= ruleProgramArgument )
            	    {
            	    // InternalLcDsl.g:941:5: (lv_progArgs_37_0= ruleProgramArgument )
            	    // InternalLcDsl.g:942:6: lv_progArgs_37_0= ruleProgramArgument
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getProgArgsProgramArgumentParserRuleCall_7_5_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_progArgs_37_0=ruleProgramArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"progArgs",
            	    							lv_progArgs_37_0,
            	    							"com.wamas.ide.launching.LcDsl.ProgramArgument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLcDsl.g:960:4: ( (lv_envVars_38_0= ruleEnvironmentVariable ) )
            	    {
            	    // InternalLcDsl.g:960:4: ( (lv_envVars_38_0= ruleEnvironmentVariable ) )
            	    // InternalLcDsl.g:961:5: (lv_envVars_38_0= ruleEnvironmentVariable )
            	    {
            	    // InternalLcDsl.g:961:5: (lv_envVars_38_0= ruleEnvironmentVariable )
            	    // InternalLcDsl.g:962:6: lv_envVars_38_0= ruleEnvironmentVariable
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getEnvVarsEnvironmentVariableParserRuleCall_7_6_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_envVars_38_0=ruleEnvironmentVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"envVars",
            	    							lv_envVars_38_0,
            	    							"com.wamas.ide.launching.LcDsl.EnvironmentVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalLcDsl.g:980:4: ( (lv_traces_39_0= ruleTraceEnablement ) )
            	    {
            	    // InternalLcDsl.g:980:4: ( (lv_traces_39_0= ruleTraceEnablement ) )
            	    // InternalLcDsl.g:981:5: (lv_traces_39_0= ruleTraceEnablement )
            	    {
            	    // InternalLcDsl.g:981:5: (lv_traces_39_0= ruleTraceEnablement )
            	    // InternalLcDsl.g:982:6: lv_traces_39_0= ruleTraceEnablement
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getTracesTraceEnablementParserRuleCall_7_7_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_traces_39_0=ruleTraceEnablement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"traces",
            	    							lv_traces_39_0,
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

            this_BLOCK_END_40=(Token)match(input,RULE_BLOCK_END,FOLLOW_2); 

            			newLeafNode(this_BLOCK_END_40, grammarAccess.getLaunchConfigAccess().getBLOCK_ENDTerminalRuleCall_8());
            		

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
    // InternalLcDsl.g:1008:1: entryRuleWorkspace returns [EObject current=null] : iv_ruleWorkspace= ruleWorkspace EOF ;
    public final EObject entryRuleWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkspace = null;


        try {
            // InternalLcDsl.g:1008:50: (iv_ruleWorkspace= ruleWorkspace EOF )
            // InternalLcDsl.g:1009:2: iv_ruleWorkspace= ruleWorkspace EOF
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
    // InternalLcDsl.g:1015:1: ruleWorkspace returns [EObject current=null] : (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleWorkspace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_workspace_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1021:2: ( (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1022:2: (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1022:2: (otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1023:3: otherlv_0= 'workspace' ( (lv_workspace_1_0= ruleAnyPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkspaceAccess().getWorkspaceKeyword_0());
            		
            // InternalLcDsl.g:1027:3: ( (lv_workspace_1_0= ruleAnyPath ) )
            // InternalLcDsl.g:1028:4: (lv_workspace_1_0= ruleAnyPath )
            {
            // InternalLcDsl.g:1028:4: (lv_workspace_1_0= ruleAnyPath )
            // InternalLcDsl.g:1029:5: lv_workspace_1_0= ruleAnyPath
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1054:1: entryRuleWorkingDir returns [EObject current=null] : iv_ruleWorkingDir= ruleWorkingDir EOF ;
    public final EObject entryRuleWorkingDir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkingDir = null;


        try {
            // InternalLcDsl.g:1054:51: (iv_ruleWorkingDir= ruleWorkingDir EOF )
            // InternalLcDsl.g:1055:2: iv_ruleWorkingDir= ruleWorkingDir EOF
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
    // InternalLcDsl.g:1061:1: ruleWorkingDir returns [EObject current=null] : (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleWorkingDir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_workingDir_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1067:2: ( (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1068:2: (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1068:2: (otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1069:3: otherlv_0= 'working-dir' ( (lv_workingDir_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkingDirAccess().getWorkingDirKeyword_0());
            		
            // InternalLcDsl.g:1073:3: ( (lv_workingDir_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:1074:4: (lv_workingDir_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:1074:4: (lv_workingDir_1_0= ruleExistingPath )
            // InternalLcDsl.g:1075:5: lv_workingDir_1_0= ruleExistingPath
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1100:1: entryRuleMainProject returns [EObject current=null] : iv_ruleMainProject= ruleMainProject EOF ;
    public final EObject entryRuleMainProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainProject = null;


        try {
            // InternalLcDsl.g:1100:52: (iv_ruleMainProject= ruleMainProject EOF )
            // InternalLcDsl.g:1101:2: iv_ruleMainProject= ruleMainProject EOF
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
    // InternalLcDsl.g:1107:1: ruleMainProject returns [EObject current=null] : (otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleMainProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_self_1_0=null;
        Token otherlv_3=null;
        EObject lv_project_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1113:2: ( (otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';' ) )
            // InternalLcDsl.g:1114:2: (otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';' )
            {
            // InternalLcDsl.g:1114:2: (otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';' )
            // InternalLcDsl.g:1115:3: otherlv_0= 'project' ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMainProjectAccess().getProjectKeyword_0());
            		
            // InternalLcDsl.g:1119:3: ( ( (lv_self_1_0= 'self' ) ) | ( (lv_project_2_0= ruleProject ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLcDsl.g:1120:4: ( (lv_self_1_0= 'self' ) )
                    {
                    // InternalLcDsl.g:1120:4: ( (lv_self_1_0= 'self' ) )
                    // InternalLcDsl.g:1121:5: (lv_self_1_0= 'self' )
                    {
                    // InternalLcDsl.g:1121:5: (lv_self_1_0= 'self' )
                    // InternalLcDsl.g:1122:6: lv_self_1_0= 'self'
                    {
                    lv_self_1_0=(Token)match(input,32,FOLLOW_12); 

                    						newLeafNode(lv_self_1_0, grammarAccess.getMainProjectAccess().getSelfSelfKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainProjectRule());
                    						}
                    						setWithLastConsumed(current, "self", true, "self");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:1135:4: ( (lv_project_2_0= ruleProject ) )
                    {
                    // InternalLcDsl.g:1135:4: ( (lv_project_2_0= ruleProject ) )
                    // InternalLcDsl.g:1136:5: (lv_project_2_0= ruleProject )
                    {
                    // InternalLcDsl.g:1136:5: (lv_project_2_0= ruleProject )
                    // InternalLcDsl.g:1137:6: lv_project_2_0= ruleProject
                    {

                    						newCompositeNode(grammarAccess.getMainProjectAccess().getProjectProjectParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1163:1: entryRuleMainType returns [EObject current=null] : iv_ruleMainType= ruleMainType EOF ;
    public final EObject entryRuleMainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainType = null;


        try {
            // InternalLcDsl.g:1163:49: (iv_ruleMainType= ruleMainType EOF )
            // InternalLcDsl.g:1164:2: iv_ruleMainType= ruleMainType EOF
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
    // InternalLcDsl.g:1170:1: ruleMainType returns [EObject current=null] : (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' ) ;
    public final EObject ruleMainType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_mainClass_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1176:2: ( (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1177:2: (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1177:2: (otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1178:3: otherlv_0= 'main-class' ( (lv_mainClass_1_0= ruleJavaMainType ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMainTypeAccess().getMainClassKeyword_0());
            		
            // InternalLcDsl.g:1182:3: ( (lv_mainClass_1_0= ruleJavaMainType ) )
            // InternalLcDsl.g:1183:4: (lv_mainClass_1_0= ruleJavaMainType )
            {
            // InternalLcDsl.g:1183:4: (lv_mainClass_1_0= ruleJavaMainType )
            // InternalLcDsl.g:1184:5: lv_mainClass_1_0= ruleJavaMainType
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1209:1: entryRuleAddPlugin returns [EObject current=null] : iv_ruleAddPlugin= ruleAddPlugin EOF ;
    public final EObject entryRuleAddPlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPlugin = null;


        try {
            // InternalLcDsl.g:1209:50: (iv_ruleAddPlugin= ruleAddPlugin EOF )
            // InternalLcDsl.g:1210:2: iv_ruleAddPlugin= ruleAddPlugin EOF
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
    // InternalLcDsl.g:1216:1: ruleAddPlugin returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';' ) ;
    public final EObject ruleAddPlugin() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_plugin_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1222:2: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';' ) )
            // InternalLcDsl.g:1223:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';' )
            {
            // InternalLcDsl.g:1223:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';' )
            // InternalLcDsl.g:1224:3: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'plugin' ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) ) otherlv_3= ';'
            {
            // InternalLcDsl.g:1224:3: ( (lv_optional_0_0= 'optional' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLcDsl.g:1225:4: (lv_optional_0_0= 'optional' )
                    {
                    // InternalLcDsl.g:1225:4: (lv_optional_0_0= 'optional' )
                    // InternalLcDsl.g:1226:5: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,34,FOLLOW_14); 

                    					newLeafNode(lv_optional_0_0, grammarAccess.getAddPluginAccess().getOptionalOptionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddPluginRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "optional");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAddPluginAccess().getPluginKeyword_1());
            		
            // InternalLcDsl.g:1242:3: ( (lv_plugin_2_0= rulePluginWithVersionAndStartLevel ) )
            // InternalLcDsl.g:1243:4: (lv_plugin_2_0= rulePluginWithVersionAndStartLevel )
            {
            // InternalLcDsl.g:1243:4: (lv_plugin_2_0= rulePluginWithVersionAndStartLevel )
            // InternalLcDsl.g:1244:5: lv_plugin_2_0= rulePluginWithVersionAndStartLevel
            {

            					newCompositeNode(grammarAccess.getAddPluginAccess().getPluginPluginWithVersionAndStartLevelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1269:1: entryRuleAddFeature returns [EObject current=null] : iv_ruleAddFeature= ruleAddFeature EOF ;
    public final EObject entryRuleAddFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddFeature = null;


        try {
            // InternalLcDsl.g:1269:51: (iv_ruleAddFeature= ruleAddFeature EOF )
            // InternalLcDsl.g:1270:2: iv_ruleAddFeature= ruleAddFeature EOF
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
    // InternalLcDsl.g:1276:1: ruleAddFeature returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';' ) ;
    public final EObject ruleAddFeature() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_feature_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1282:2: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';' ) )
            // InternalLcDsl.g:1283:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';' )
            {
            // InternalLcDsl.g:1283:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';' )
            // InternalLcDsl.g:1284:3: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'feature' ( (lv_feature_2_0= ruleFeatureWithVersion ) ) otherlv_3= ';'
            {
            // InternalLcDsl.g:1284:3: ( (lv_optional_0_0= 'optional' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLcDsl.g:1285:4: (lv_optional_0_0= 'optional' )
                    {
                    // InternalLcDsl.g:1285:4: (lv_optional_0_0= 'optional' )
                    // InternalLcDsl.g:1286:5: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,34,FOLLOW_15); 

                    					newLeafNode(lv_optional_0_0, grammarAccess.getAddFeatureAccess().getOptionalOptionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddFeatureRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "optional");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAddFeatureAccess().getFeatureKeyword_1());
            		
            // InternalLcDsl.g:1302:3: ( (lv_feature_2_0= ruleFeatureWithVersion ) )
            // InternalLcDsl.g:1303:4: (lv_feature_2_0= ruleFeatureWithVersion )
            {
            // InternalLcDsl.g:1303:4: (lv_feature_2_0= ruleFeatureWithVersion )
            // InternalLcDsl.g:1304:5: lv_feature_2_0= ruleFeatureWithVersion
            {

            					newCompositeNode(grammarAccess.getAddFeatureAccess().getFeatureFeatureWithVersionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1329:1: entryRuleContentProviderProduct returns [EObject current=null] : iv_ruleContentProviderProduct= ruleContentProviderProduct EOF ;
    public final EObject entryRuleContentProviderProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProviderProduct = null;


        try {
            // InternalLcDsl.g:1329:63: (iv_ruleContentProviderProduct= ruleContentProviderProduct EOF )
            // InternalLcDsl.g:1330:2: iv_ruleContentProviderProduct= ruleContentProviderProduct EOF
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
    // InternalLcDsl.g:1336:1: ruleContentProviderProduct returns [EObject current=null] : (otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleContentProviderProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_product_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1342:2: ( (otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1343:2: (otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1343:2: (otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1344:3: otherlv_0= 'content-provider' ( (lv_product_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getContentProviderProductAccess().getContentProviderKeyword_0());
            		
            // InternalLcDsl.g:1348:3: ( (lv_product_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:1349:4: (lv_product_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:1349:4: (lv_product_1_0= ruleExistingPath )
            // InternalLcDsl.g:1350:5: lv_product_1_0= ruleExistingPath
            {

            					newCompositeNode(grammarAccess.getContentProviderProductAccess().getProductExistingPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1375:1: entryRuleIgnorePlugin returns [EObject current=null] : iv_ruleIgnorePlugin= ruleIgnorePlugin EOF ;
    public final EObject entryRuleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnorePlugin = null;


        try {
            // InternalLcDsl.g:1375:53: (iv_ruleIgnorePlugin= ruleIgnorePlugin EOF )
            // InternalLcDsl.g:1376:2: iv_ruleIgnorePlugin= ruleIgnorePlugin EOF
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
    // InternalLcDsl.g:1382:1: ruleIgnorePlugin returns [EObject current=null] : (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) ;
    public final EObject ruleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1388:2: ( (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1389:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1389:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1390:3: otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIgnorePluginAccess().getIgnoreKeyword_0());
            		
            // InternalLcDsl.g:1394:3: ( (lv_plugin_1_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:1395:4: (lv_plugin_1_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:1395:4: (lv_plugin_1_0= rulePluginWithVersion )
            // InternalLcDsl.g:1396:5: lv_plugin_1_0= rulePluginWithVersion
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1421:1: entryRuleVmArgument returns [EObject current=null] : iv_ruleVmArgument= ruleVmArgument EOF ;
    public final EObject entryRuleVmArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVmArgument = null;


        try {
            // InternalLcDsl.g:1421:51: (iv_ruleVmArgument= ruleVmArgument EOF )
            // InternalLcDsl.g:1422:2: iv_ruleVmArgument= ruleVmArgument EOF
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
    // InternalLcDsl.g:1428:1: ruleVmArgument returns [EObject current=null] : ( () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) ;
    public final EObject ruleVmArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1434:2: ( ( () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1435:2: ( () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1435:2: ( () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1436:3: () otherlv_1= 'vm-argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1436:3: ()
            // InternalLcDsl.g:1437:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVmArgumentAccess().getVmArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVmArgumentAccess().getVmArgumentKeyword_1());
            		
            // InternalLcDsl.g:1447:3: ( (lv_arguments_2_0= ruleStringWithVariables ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLcDsl.g:1448:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    {
            	    // InternalLcDsl.g:1448:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    // InternalLcDsl.g:1449:5: lv_arguments_2_0= ruleStringWithVariables
            	    {

            	    					newCompositeNode(grammarAccess.getVmArgumentAccess().getArgumentsStringWithVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1474:1: entryRuleProgramArgument returns [EObject current=null] : iv_ruleProgramArgument= ruleProgramArgument EOF ;
    public final EObject entryRuleProgramArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramArgument = null;


        try {
            // InternalLcDsl.g:1474:56: (iv_ruleProgramArgument= ruleProgramArgument EOF )
            // InternalLcDsl.g:1475:2: iv_ruleProgramArgument= ruleProgramArgument EOF
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
    // InternalLcDsl.g:1481:1: ruleProgramArgument returns [EObject current=null] : ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) ;
    public final EObject ruleProgramArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arguments_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1487:2: ( ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1488:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1488:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1489:3: () otherlv_1= 'argument' ( (lv_arguments_2_0= ruleStringWithVariables ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1489:3: ()
            // InternalLcDsl.g:1490:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramArgumentAccess().getProgramArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramArgumentAccess().getArgumentKeyword_1());
            		
            // InternalLcDsl.g:1500:3: ( (lv_arguments_2_0= ruleStringWithVariables ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLcDsl.g:1501:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    {
            	    // InternalLcDsl.g:1501:4: (lv_arguments_2_0= ruleStringWithVariables )
            	    // InternalLcDsl.g:1502:5: lv_arguments_2_0= ruleStringWithVariables
            	    {

            	    					newCompositeNode(grammarAccess.getProgramArgumentAccess().getArgumentsStringWithVariablesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1527:1: entryRuleEnvironmentVariable returns [EObject current=null] : iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF ;
    public final EObject entryRuleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariable = null;


        try {
            // InternalLcDsl.g:1527:60: (iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF )
            // InternalLcDsl.g:1528:2: iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF
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
    // InternalLcDsl.g:1534:1: ruleEnvironmentVariable returns [EObject current=null] : ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' ) ;
    public final EObject ruleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_EQ_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1540:2: ( ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:1541:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:1541:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';' )
            // InternalLcDsl.g:1542:3: () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= ruleStringWithVariables ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:1542:3: ()
            // InternalLcDsl.g:1543:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentVariableAccess().getEnvironmentVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentVariableAccess().getEnvironmentKeyword_1());
            		
            // InternalLcDsl.g:1553:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLcDsl.g:1554:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLcDsl.g:1554:4: (lv_name_2_0= RULE_ID )
            // InternalLcDsl.g:1555:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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
            		
            // InternalLcDsl.g:1575:3: ( (lv_value_4_0= ruleStringWithVariables ) )
            // InternalLcDsl.g:1576:4: (lv_value_4_0= ruleStringWithVariables )
            {
            // InternalLcDsl.g:1576:4: (lv_value_4_0= ruleStringWithVariables )
            // InternalLcDsl.g:1577:5: lv_value_4_0= ruleStringWithVariables
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

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1602:1: entryRuleApplicationExtPoint returns [EObject current=null] : iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF ;
    public final EObject entryRuleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationExtPoint = null;


        try {
            // InternalLcDsl.g:1602:60: (iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF )
            // InternalLcDsl.g:1603:2: iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF
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
    // InternalLcDsl.g:1609:1: ruleApplicationExtPoint returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1615:2: ( (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1616:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1616:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1617:3: otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationExtPointAccess().getApplicationKeyword_0());
            		
            // InternalLcDsl.g:1621:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1622:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1622:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1623:5: lv_name_1_0= ruleFQName
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1648:1: entryRuleProductExtPoint returns [EObject current=null] : iv_ruleProductExtPoint= ruleProductExtPoint EOF ;
    public final EObject entryRuleProductExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductExtPoint = null;


        try {
            // InternalLcDsl.g:1648:56: (iv_ruleProductExtPoint= ruleProductExtPoint EOF )
            // InternalLcDsl.g:1649:2: iv_ruleProductExtPoint= ruleProductExtPoint EOF
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
    // InternalLcDsl.g:1655:1: ruleProductExtPoint returns [EObject current=null] : (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleProductExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1661:2: ( (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1662:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1662:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1663:3: otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProductExtPointAccess().getProductKeyword_0());
            		
            // InternalLcDsl.g:1667:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1668:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1668:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1669:5: lv_name_1_0= ruleFQName
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1694:1: entryRuleFavorites returns [EObject current=null] : iv_ruleFavorites= ruleFavorites EOF ;
    public final EObject entryRuleFavorites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFavorites = null;


        try {
            // InternalLcDsl.g:1694:50: (iv_ruleFavorites= ruleFavorites EOF )
            // InternalLcDsl.g:1695:2: iv_ruleFavorites= ruleFavorites EOF
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
    // InternalLcDsl.g:1701:1: ruleFavorites returns [EObject current=null] : ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' ) ;
    public final EObject ruleFavorites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1707:2: ( ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1708:2: ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1708:2: ( () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1709:3: () otherlv_1= 'favorite' ( (lv_types_2_0= ruleLaunchModeType ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1709:3: ()
            // InternalLcDsl.g:1710:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFavoritesAccess().getFavoritesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getFavoritesAccess().getFavoriteKeyword_1());
            		
            // InternalLcDsl.g:1720:3: ( (lv_types_2_0= ruleLaunchModeType ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=84 && LA11_0<=88)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLcDsl.g:1721:4: (lv_types_2_0= ruleLaunchModeType )
            	    {
            	    // InternalLcDsl.g:1721:4: (lv_types_2_0= ruleLaunchModeType )
            	    // InternalLcDsl.g:1722:5: lv_types_2_0= ruleLaunchModeType
            	    {

            	    					newCompositeNode(grammarAccess.getFavoritesAccess().getTypesLaunchModeTypeEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1747:1: entryRuleRedirect returns [EObject current=null] : iv_ruleRedirect= ruleRedirect EOF ;
    public final EObject entryRuleRedirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirect = null;


        try {
            // InternalLcDsl.g:1747:49: (iv_ruleRedirect= ruleRedirect EOF )
            // InternalLcDsl.g:1748:2: iv_ruleRedirect= ruleRedirect EOF
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
    // InternalLcDsl.g:1754:1: ruleRedirect returns [EObject current=null] : ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';' ) ;
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
            // InternalLcDsl.g:1760:2: ( ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';' ) )
            // InternalLcDsl.g:1761:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';' )
            {
            // InternalLcDsl.g:1761:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';' )
            // InternalLcDsl.g:1762:3: () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_10= ';'
            {
            // InternalLcDsl.g:1762:3: ()
            // InternalLcDsl.g:1763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRedirectAccess().getRedirectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRedirectAccess().getRedirectKeyword_1());
            		
            // InternalLcDsl.g:1773:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1774:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1774:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1775:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1778:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )* )
            // InternalLcDsl.g:1779:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1779:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 >= 97 && LA13_0 <= 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 100 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLcDsl.g:1780:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) )
            	    {
            	    // InternalLcDsl.g:1780:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) ) )
            	    // InternalLcDsl.g:1781:5: {...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1781:105: ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) ) )
            	    // InternalLcDsl.g:1782:6: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1785:9: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? ) )
            	    // InternalLcDsl.g:1785:10: {...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:1785:19: ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )? )
            	    // InternalLcDsl.g:1785:20: ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ( (lv_noAppend_6_0= '!' ) )?
            	    {
            	    // InternalLcDsl.g:1785:20: ( (lv_outWhich_3_0= ruleOutputStream ) )
            	    // InternalLcDsl.g:1786:10: (lv_outWhich_3_0= ruleOutputStream )
            	    {
            	    // InternalLcDsl.g:1786:10: (lv_outWhich_3_0= ruleOutputStream )
            	    // InternalLcDsl.g:1787:11: lv_outWhich_3_0= ruleOutputStream
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getOutWhichOutputStreamEnumRuleCall_2_0_0_0());
            	    										
            	    pushFollow(FOLLOW_20);
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

            	    otherlv_4=(Token)match(input,46,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getRedirectAccess().getToKeyword_2_0_1());
            	    								
            	    // InternalLcDsl.g:1808:9: ( (lv_outFile_5_0= ruleAnyPath ) )
            	    // InternalLcDsl.g:1809:10: (lv_outFile_5_0= ruleAnyPath )
            	    {
            	    // InternalLcDsl.g:1809:10: (lv_outFile_5_0= ruleAnyPath )
            	    // InternalLcDsl.g:1810:11: lv_outFile_5_0= ruleAnyPath
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getOutFileAnyPathParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
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

            	    // InternalLcDsl.g:1827:9: ( (lv_noAppend_6_0= '!' ) )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==47) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalLcDsl.g:1828:10: (lv_noAppend_6_0= '!' )
            	            {
            	            // InternalLcDsl.g:1828:10: (lv_noAppend_6_0= '!' )
            	            // InternalLcDsl.g:1829:11: lv_noAppend_6_0= '!'
            	            {
            	            lv_noAppend_6_0=(Token)match(input,47,FOLLOW_19); 

            	            											newLeafNode(lv_noAppend_6_0, grammarAccess.getRedirectAccess().getNoAppendExclamationMarkKeyword_2_0_3_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getRedirectRule());
            	            											}
            	            											setWithLastConsumed(current, "noAppend", true, "!");
            	            										

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
            	    // InternalLcDsl.g:1847:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1847:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) ) )
            	    // InternalLcDsl.g:1848:5: {...}? => ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:1848:105: ( ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) ) )
            	    // InternalLcDsl.g:1849:6: ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:1852:9: ({...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) ) )
            	    // InternalLcDsl.g:1852:10: {...}? => ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:1852:19: ( ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) ) )
            	    // InternalLcDsl.g:1852:20: ( (lv_inWhich_7_0= ruleInputStream ) ) otherlv_8= 'from' ( (lv_inFile_9_0= ruleExistingPath ) )
            	    {
            	    // InternalLcDsl.g:1852:20: ( (lv_inWhich_7_0= ruleInputStream ) )
            	    // InternalLcDsl.g:1853:10: (lv_inWhich_7_0= ruleInputStream )
            	    {
            	    // InternalLcDsl.g:1853:10: (lv_inWhich_7_0= ruleInputStream )
            	    // InternalLcDsl.g:1854:11: lv_inWhich_7_0= ruleInputStream
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getInWhichInputStreamEnumRuleCall_2_1_0_0());
            	    										
            	    pushFollow(FOLLOW_22);
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

            	    otherlv_8=(Token)match(input,48,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getRedirectAccess().getFromKeyword_2_1_1());
            	    								
            	    // InternalLcDsl.g:1875:9: ( (lv_inFile_9_0= ruleExistingPath ) )
            	    // InternalLcDsl.g:1876:10: (lv_inFile_9_0= ruleExistingPath )
            	    {
            	    // InternalLcDsl.g:1876:10: (lv_inFile_9_0= ruleExistingPath )
            	    // InternalLcDsl.g:1877:11: lv_inFile_9_0= ruleExistingPath
            	    {

            	    											newCompositeNode(grammarAccess.getRedirectAccess().getInFileExistingPathParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
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
            	    break loop13;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            				

            }

            otherlv_10=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1915:1: entryRuleExecutionEnvironment returns [EObject current=null] : iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF ;
    public final EObject entryRuleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionEnvironment = null;


        try {
            // InternalLcDsl.g:1915:61: (iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF )
            // InternalLcDsl.g:1916:2: iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF
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
    // InternalLcDsl.g:1922:1: ruleExecutionEnvironment returns [EObject current=null] : (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1928:2: ( (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1929:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1929:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1930:3: otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getExecutionEnvironmentAccess().getExecutionEnvironmentKeyword_0());
            		
            // InternalLcDsl.g:1934:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalLcDsl.g:1935:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalLcDsl.g:1935:4: (lv_name_1_0= RULE_STRING )
            // InternalLcDsl.g:1936:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:1960:1: entryRuleConfigIniTemplate returns [EObject current=null] : iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF ;
    public final EObject entryRuleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigIniTemplate = null;


        try {
            // InternalLcDsl.g:1960:58: (iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF )
            // InternalLcDsl.g:1961:2: iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF
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
    // InternalLcDsl.g:1967:1: ruleConfigIniTemplate returns [EObject current=null] : (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1973:2: ( (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1974:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1974:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1975:3: otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigIniTemplateAccess().getConfigIniTemplateKeyword_0());
            		
            // InternalLcDsl.g:1979:3: ( (lv_path_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:1980:4: (lv_path_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:1980:4: (lv_path_1_0= ruleExistingPath )
            // InternalLcDsl.g:1981:5: lv_path_1_0= ruleExistingPath
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

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:2006:1: entryRuleTraceEnablement returns [EObject current=null] : iv_ruleTraceEnablement= ruleTraceEnablement EOF ;
    public final EObject entryRuleTraceEnablement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceEnablement = null;


        try {
            // InternalLcDsl.g:2006:56: (iv_ruleTraceEnablement= ruleTraceEnablement EOF )
            // InternalLcDsl.g:2007:2: iv_ruleTraceEnablement= ruleTraceEnablement EOF
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
    // InternalLcDsl.g:2013:1: ruleTraceEnablement returns [EObject current=null] : (otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';' ) ;
    public final EObject ruleTraceEnablement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_what_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2019:2: ( (otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:2020:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:2020:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';' )
            // InternalLcDsl.g:2021:3: otherlv_0= 'trace' ( (lv_plugin_1_0= ruleFQName ) ) ( (lv_what_2_0= RULE_STRING ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceEnablementAccess().getTraceKeyword_0());
            		
            // InternalLcDsl.g:2025:3: ( (lv_plugin_1_0= ruleFQName ) )
            // InternalLcDsl.g:2026:4: (lv_plugin_1_0= ruleFQName )
            {
            // InternalLcDsl.g:2026:4: (lv_plugin_1_0= ruleFQName )
            // InternalLcDsl.g:2027:5: lv_plugin_1_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getTraceEnablementAccess().getPluginFQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalLcDsl.g:2044:3: ( (lv_what_2_0= RULE_STRING ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLcDsl.g:2045:4: (lv_what_2_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:2045:4: (lv_what_2_0= RULE_STRING )
            	    // InternalLcDsl.g:2046:5: lv_what_2_0= RULE_STRING
            	    {
            	    lv_what_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:2070:1: entryRuleJavaMainSearch returns [EObject current=null] : iv_ruleJavaMainSearch= ruleJavaMainSearch EOF ;
    public final EObject entryRuleJavaMainSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaMainSearch = null;


        try {
            // InternalLcDsl.g:2070:55: (iv_ruleJavaMainSearch= ruleJavaMainSearch EOF )
            // InternalLcDsl.g:2071:2: iv_ruleJavaMainSearch= ruleJavaMainSearch EOF
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
    // InternalLcDsl.g:2077:1: ruleJavaMainSearch returns [EObject current=null] : ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleJavaMainSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_system_3_0=null;
        Token lv_inherited_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2083:2: ( ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:2084:2: ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:2084:2: ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            // InternalLcDsl.g:2085:3: () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:2085:3: ()
            // InternalLcDsl.g:2086:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaMainSearchAccess().getJavaMainSearchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaMainSearchAccess().getSearchMainKeyword_1());
            		
            // InternalLcDsl.g:2096:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2097:4: ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2097:4: ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2098:5: ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2101:5: ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* )
            // InternalLcDsl.g:2102:6: ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2102:6: ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLcDsl.g:2103:4: ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2103:4: ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) )
            	    // InternalLcDsl.g:2104:5: {...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2104:111: ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) )
            	    // InternalLcDsl.g:2105:6: ({...}? => ( (lv_system_3_0= 'system' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2108:9: ({...}? => ( (lv_system_3_0= 'system' ) ) )
            	    // InternalLcDsl.g:2108:10: {...}? => ( (lv_system_3_0= 'system' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "true");
            	    }
            	    // InternalLcDsl.g:2108:19: ( (lv_system_3_0= 'system' ) )
            	    // InternalLcDsl.g:2108:20: (lv_system_3_0= 'system' )
            	    {
            	    // InternalLcDsl.g:2108:20: (lv_system_3_0= 'system' )
            	    // InternalLcDsl.g:2109:10: lv_system_3_0= 'system'
            	    {
            	    lv_system_3_0=(Token)match(input,53,FOLLOW_23); 

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
            	    // InternalLcDsl.g:2126:4: ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2126:4: ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) )
            	    // InternalLcDsl.g:2127:5: {...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2127:111: ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) )
            	    // InternalLcDsl.g:2128:6: ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2131:9: ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) )
            	    // InternalLcDsl.g:2131:10: {...}? => ( (lv_inherited_4_0= 'inherited' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "true");
            	    }
            	    // InternalLcDsl.g:2131:19: ( (lv_inherited_4_0= 'inherited' ) )
            	    // InternalLcDsl.g:2131:20: (lv_inherited_4_0= 'inherited' )
            	    {
            	    // InternalLcDsl.g:2131:20: (lv_inherited_4_0= 'inherited' )
            	    // InternalLcDsl.g:2132:10: lv_inherited_4_0= 'inherited'
            	    {
            	    lv_inherited_4_0=(Token)match(input,54,FOLLOW_23); 

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
            	    break loop15;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            				

            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:2164:1: entryRuleRapServletConfig returns [EObject current=null] : iv_ruleRapServletConfig= ruleRapServletConfig EOF ;
    public final EObject entryRuleRapServletConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRapServletConfig = null;


        try {
            // InternalLcDsl.g:2164:57: (iv_ruleRapServletConfig= ruleRapServletConfig EOF )
            // InternalLcDsl.g:2165:2: iv_ruleRapServletConfig= ruleRapServletConfig EOF
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
    // InternalLcDsl.g:2171:1: ruleRapServletConfig returns [EObject current=null] : (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END ) ;
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
            // InternalLcDsl.g:2177:2: ( (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END ) )
            // InternalLcDsl.g:2178:2: (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END )
            {
            // InternalLcDsl.g:2178:2: (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END )
            // InternalLcDsl.g:2179:3: otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END
            {
            otherlv_0=(Token)match(input,55,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRapServletConfigAccess().getServletKeyword_0());
            		
            this_BLOCK_BEGIN_1=(Token)match(input,RULE_BLOCK_BEGIN,FOLLOW_24); 

            			newLeafNode(this_BLOCK_BEGIN_1, grammarAccess.getRapServletConfigAccess().getBLOCK_BEGINTerminalRuleCall_1());
            		
            // InternalLcDsl.g:2187:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // InternalLcDsl.g:2188:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalLcDsl.g:2188:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // InternalLcDsl.g:2189:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2192:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            // InternalLcDsl.g:2193:6: ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // InternalLcDsl.g:2193:6: ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=7;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2) ) {
                    alt16=3;
                }
                else if ( LA16_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3) ) {
                    alt16=4;
                }
                else if ( LA16_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4) ) {
                    alt16=5;
                }
                else if ( LA16_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5) ) {
                    alt16=6;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLcDsl.g:2194:4: ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2194:4: ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    // InternalLcDsl.g:2195:5: {...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2195:113: ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    // InternalLcDsl.g:2196:6: ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2199:9: ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    // InternalLcDsl.g:2199:10: {...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2199:19: (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    // InternalLcDsl.g:2199:20: otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,56,FOLLOW_11); 

            	    									newLeafNode(otherlv_3, grammarAccess.getRapServletConfigAccess().getPathKeyword_2_0_0());
            	    								
            	    // InternalLcDsl.g:2203:9: ( (lv_servletPath_4_0= RULE_STRING ) )
            	    // InternalLcDsl.g:2204:10: (lv_servletPath_4_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:2204:10: (lv_servletPath_4_0= RULE_STRING )
            	    // InternalLcDsl.g:2205:11: lv_servletPath_4_0= RULE_STRING
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

            	    otherlv_5=(Token)match(input,29,FOLLOW_25); 

            	    									newLeafNode(otherlv_5, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:2231:4: ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2231:4: ({...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) )
            	    // InternalLcDsl.g:2232:5: {...}? => ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2232:113: ( ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) )
            	    // InternalLcDsl.g:2233:6: ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2236:9: ({...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) )
            	    // InternalLcDsl.g:2236:10: {...}? => (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2236:19: (otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' )
            	    // InternalLcDsl.g:2236:20: otherlv_6= 'browser' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';'
            	    {
            	    otherlv_6=(Token)match(input,57,FOLLOW_26); 

            	    									newLeafNode(otherlv_6, grammarAccess.getRapServletConfigAccess().getBrowserKeyword_2_1_0());
            	    								
            	    // InternalLcDsl.g:2240:9: ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) )
            	    // InternalLcDsl.g:2241:10: (lv_browserMode_7_0= ruleBrowserLaunchMode )
            	    {
            	    // InternalLcDsl.g:2241:10: (lv_browserMode_7_0= ruleBrowserLaunchMode )
            	    // InternalLcDsl.g:2242:11: lv_browserMode_7_0= ruleBrowserLaunchMode
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

            	    otherlv_8=(Token)match(input,29,FOLLOW_25); 

            	    									newLeafNode(otherlv_8, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:2269:4: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2269:4: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // InternalLcDsl.g:2270:5: {...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLcDsl.g:2270:113: ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // InternalLcDsl.g:2271:6: ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLcDsl.g:2274:9: ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // InternalLcDsl.g:2274:10: {...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2274:19: (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // InternalLcDsl.g:2274:20: otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_9=(Token)match(input,58,FOLLOW_27); 

            	    									newLeafNode(otherlv_9, grammarAccess.getRapServletConfigAccess().getPortKeyword_2_2_0());
            	    								
            	    // InternalLcDsl.g:2278:9: ( (lv_serverPort_10_0= RULE_INT ) )
            	    // InternalLcDsl.g:2279:10: (lv_serverPort_10_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2279:10: (lv_serverPort_10_0= RULE_INT )
            	    // InternalLcDsl.g:2280:11: lv_serverPort_10_0= RULE_INT
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

            	    otherlv_11=(Token)match(input,29,FOLLOW_25); 

            	    									newLeafNode(otherlv_11, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:2306:4: ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2306:4: ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    // InternalLcDsl.g:2307:5: {...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalLcDsl.g:2307:113: ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    // InternalLcDsl.g:2308:6: ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalLcDsl.g:2311:9: ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    // InternalLcDsl.g:2311:10: {...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2311:19: (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    // InternalLcDsl.g:2311:20: otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';'
            	    {
            	    otherlv_12=(Token)match(input,59,FOLLOW_27); 

            	    									newLeafNode(otherlv_12, grammarAccess.getRapServletConfigAccess().getSessionTimeoutKeyword_2_3_0());
            	    								
            	    // InternalLcDsl.g:2315:9: ( (lv_sessionTimeout_13_0= RULE_INT ) )
            	    // InternalLcDsl.g:2316:10: (lv_sessionTimeout_13_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2316:10: (lv_sessionTimeout_13_0= RULE_INT )
            	    // InternalLcDsl.g:2317:11: lv_sessionTimeout_13_0= RULE_INT
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

            	    otherlv_14=(Token)match(input,29,FOLLOW_25); 

            	    									newLeafNode(otherlv_14, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:2343:4: ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2343:4: ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    // InternalLcDsl.g:2344:5: {...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalLcDsl.g:2344:113: ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    // InternalLcDsl.g:2345:6: ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalLcDsl.g:2348:9: ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    // InternalLcDsl.g:2348:10: {...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2348:19: (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    // InternalLcDsl.g:2348:20: otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';'
            	    {
            	    otherlv_15=(Token)match(input,60,FOLLOW_11); 

            	    									newLeafNode(otherlv_15, grammarAccess.getRapServletConfigAccess().getContextPathKeyword_2_4_0());
            	    								
            	    // InternalLcDsl.g:2352:9: ( (lv_contextPath_16_0= RULE_STRING ) )
            	    // InternalLcDsl.g:2353:10: (lv_contextPath_16_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:2353:10: (lv_contextPath_16_0= RULE_STRING )
            	    // InternalLcDsl.g:2354:11: lv_contextPath_16_0= RULE_STRING
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

            	    otherlv_17=(Token)match(input,29,FOLLOW_25); 

            	    									newLeafNode(otherlv_17, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:2380:4: ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2380:4: ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) )
            	    // InternalLcDsl.g:2381:5: {...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalLcDsl.g:2381:113: ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) )
            	    // InternalLcDsl.g:2382:6: ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalLcDsl.g:2385:9: ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) )
            	    // InternalLcDsl.g:2385:10: {...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2385:19: (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' )
            	    // InternalLcDsl.g:2385:20: otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';'
            	    {
            	    otherlv_18=(Token)match(input,61,FOLLOW_28); 

            	    									newLeafNode(otherlv_18, grammarAccess.getRapServletConfigAccess().getDevModeKeyword_2_5_0());
            	    								
            	    // InternalLcDsl.g:2389:9: ( (lv_devMode_19_0= RULE_BOOLEAN ) )
            	    // InternalLcDsl.g:2390:10: (lv_devMode_19_0= RULE_BOOLEAN )
            	    {
            	    // InternalLcDsl.g:2390:10: (lv_devMode_19_0= RULE_BOOLEAN )
            	    // InternalLcDsl.g:2391:11: lv_devMode_19_0= RULE_BOOLEAN
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

            	    otherlv_20=(Token)match(input,29,FOLLOW_25); 

            	    									newLeafNode(otherlv_20, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_5_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


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
    // InternalLcDsl.g:2433:1: entryRuleExistingPath returns [EObject current=null] : iv_ruleExistingPath= ruleExistingPath EOF ;
    public final EObject entryRuleExistingPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingPath = null;


        try {
            // InternalLcDsl.g:2433:53: (iv_ruleExistingPath= ruleExistingPath EOF )
            // InternalLcDsl.g:2434:2: iv_ruleExistingPath= ruleExistingPath EOF
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
    // InternalLcDsl.g:2440:1: ruleExistingPath returns [EObject current=null] : ( (lv_name_0_0= ruleStringWithVariables ) ) ;
    public final EObject ruleExistingPath() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2446:2: ( ( (lv_name_0_0= ruleStringWithVariables ) ) )
            // InternalLcDsl.g:2447:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            {
            // InternalLcDsl.g:2447:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            // InternalLcDsl.g:2448:3: (lv_name_0_0= ruleStringWithVariables )
            {
            // InternalLcDsl.g:2448:3: (lv_name_0_0= ruleStringWithVariables )
            // InternalLcDsl.g:2449:4: lv_name_0_0= ruleStringWithVariables
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
    // InternalLcDsl.g:2469:1: entryRuleAnyPath returns [EObject current=null] : iv_ruleAnyPath= ruleAnyPath EOF ;
    public final EObject entryRuleAnyPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyPath = null;


        try {
            // InternalLcDsl.g:2469:48: (iv_ruleAnyPath= ruleAnyPath EOF )
            // InternalLcDsl.g:2470:2: iv_ruleAnyPath= ruleAnyPath EOF
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
    // InternalLcDsl.g:2476:1: ruleAnyPath returns [EObject current=null] : ( (lv_name_0_0= ruleStringWithVariables ) ) ;
    public final EObject ruleAnyPath() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2482:2: ( ( (lv_name_0_0= ruleStringWithVariables ) ) )
            // InternalLcDsl.g:2483:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            {
            // InternalLcDsl.g:2483:2: ( (lv_name_0_0= ruleStringWithVariables ) )
            // InternalLcDsl.g:2484:3: (lv_name_0_0= ruleStringWithVariables )
            {
            // InternalLcDsl.g:2484:3: (lv_name_0_0= ruleStringWithVariables )
            // InternalLcDsl.g:2485:4: lv_name_0_0= ruleStringWithVariables
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
    // InternalLcDsl.g:2505:1: entryRulePluginWithVersionAndStartLevel returns [EObject current=null] : iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF ;
    public final EObject entryRulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersionAndStartLevel = null;


        try {
            // InternalLcDsl.g:2505:71: (iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF )
            // InternalLcDsl.g:2506:2: iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF
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
    // InternalLcDsl.g:2512:1: rulePluginWithVersionAndStartLevel returns [EObject current=null] : ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject rulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        Token lv_autoStart_2_0=null;
        Token otherlv_3=null;
        Token lv_startLevel_4_0=null;
        EObject lv_plugin_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2518:2: ( ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalLcDsl.g:2519:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalLcDsl.g:2519:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalLcDsl.g:2520:3: ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            // InternalLcDsl.g:2520:3: ( (lv_plugin_0_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:2521:4: (lv_plugin_0_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:2521:4: (lv_plugin_0_0= rulePluginWithVersion )
            // InternalLcDsl.g:2522:5: lv_plugin_0_0= rulePluginWithVersion
            {

            					newCompositeNode(grammarAccess.getPluginWithVersionAndStartLevelAccess().getPluginPluginWithVersionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalLcDsl.g:2539:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2540:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2540:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2541:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            				
            // InternalLcDsl.g:2544:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalLcDsl.g:2545:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2545:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLcDsl.g:2546:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2546:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    // InternalLcDsl.g:2547:5: {...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalLcDsl.g:2547:127: ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    // InternalLcDsl.g:2548:6: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalLcDsl.g:2551:9: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    // InternalLcDsl.g:2551:10: {...}? => ( (lv_autoStart_2_0= 'autostart' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:2551:19: ( (lv_autoStart_2_0= 'autostart' ) )
            	    // InternalLcDsl.g:2551:20: (lv_autoStart_2_0= 'autostart' )
            	    {
            	    // InternalLcDsl.g:2551:20: (lv_autoStart_2_0= 'autostart' )
            	    // InternalLcDsl.g:2552:10: lv_autoStart_2_0= 'autostart'
            	    {
            	    lv_autoStart_2_0=(Token)match(input,62,FOLLOW_29); 

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
            	    // InternalLcDsl.g:2569:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2569:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalLcDsl.g:2570:5: {...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalLcDsl.g:2570:127: ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    // InternalLcDsl.g:2571:6: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalLcDsl.g:2574:9: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    // InternalLcDsl.g:2574:10: {...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:2574:19: (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    // InternalLcDsl.g:2574:20: otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,63,FOLLOW_27); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartlevelKeyword_1_1_0());
            	    								
            	    // InternalLcDsl.g:2578:9: ( (lv_startLevel_4_0= RULE_INT ) )
            	    // InternalLcDsl.g:2579:10: (lv_startLevel_4_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2579:10: (lv_startLevel_4_0= RULE_INT )
            	    // InternalLcDsl.g:2580:11: lv_startLevel_4_0= RULE_INT
            	    {
            	    lv_startLevel_4_0=(Token)match(input,RULE_INT,FOLLOW_29); 

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
            	    break loop17;
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
    // InternalLcDsl.g:2613:1: entryRulePluginWithVersion returns [EObject current=null] : iv_rulePluginWithVersion= rulePluginWithVersion EOF ;
    public final EObject entryRulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersion = null;


        try {
            // InternalLcDsl.g:2613:58: (iv_rulePluginWithVersion= rulePluginWithVersion EOF )
            // InternalLcDsl.g:2614:2: iv_rulePluginWithVersion= rulePluginWithVersion EOF
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
    // InternalLcDsl.g:2620:1: rulePluginWithVersion returns [EObject current=null] : ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) ;
    public final EObject rulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2626:2: ( ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) )
            // InternalLcDsl.g:2627:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            {
            // InternalLcDsl.g:2627:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            // InternalLcDsl.g:2628:3: ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )?
            {
            // InternalLcDsl.g:2628:3: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2629:4: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2629:4: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2630:5: lv_name_0_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getPluginWithVersionAccess().getNameFQNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalLcDsl.g:2647:3: ( (lv_version_1_0= RULE_VERSION ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_VERSION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLcDsl.g:2648:4: (lv_version_1_0= RULE_VERSION )
                    {
                    // InternalLcDsl.g:2648:4: (lv_version_1_0= RULE_VERSION )
                    // InternalLcDsl.g:2649:5: lv_version_1_0= RULE_VERSION
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
    // InternalLcDsl.g:2669:1: entryRuleFeatureWithVersion returns [EObject current=null] : iv_ruleFeatureWithVersion= ruleFeatureWithVersion EOF ;
    public final EObject entryRuleFeatureWithVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureWithVersion = null;


        try {
            // InternalLcDsl.g:2669:59: (iv_ruleFeatureWithVersion= ruleFeatureWithVersion EOF )
            // InternalLcDsl.g:2670:2: iv_ruleFeatureWithVersion= ruleFeatureWithVersion EOF
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
    // InternalLcDsl.g:2676:1: ruleFeatureWithVersion returns [EObject current=null] : ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) ;
    public final EObject ruleFeatureWithVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2682:2: ( ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) )
            // InternalLcDsl.g:2683:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            {
            // InternalLcDsl.g:2683:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            // InternalLcDsl.g:2684:3: ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )?
            {
            // InternalLcDsl.g:2684:3: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2685:4: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2685:4: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2686:5: lv_name_0_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getFeatureWithVersionAccess().getNameFQNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalLcDsl.g:2703:3: ( (lv_version_1_0= RULE_VERSION ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_VERSION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLcDsl.g:2704:4: (lv_version_1_0= RULE_VERSION )
                    {
                    // InternalLcDsl.g:2704:4: (lv_version_1_0= RULE_VERSION )
                    // InternalLcDsl.g:2705:5: lv_version_1_0= RULE_VERSION
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
    // InternalLcDsl.g:2725:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalLcDsl.g:2725:48: (iv_ruleProject= ruleProject EOF )
            // InternalLcDsl.g:2726:2: iv_ruleProject= ruleProject EOF
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
    // InternalLcDsl.g:2732:1: ruleProject returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2738:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:2739:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:2739:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2740:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2740:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2741:4: lv_name_0_0= ruleFQName
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
    // InternalLcDsl.g:2761:1: entryRuleJavaMainType returns [EObject current=null] : iv_ruleJavaMainType= ruleJavaMainType EOF ;
    public final EObject entryRuleJavaMainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaMainType = null;


        try {
            // InternalLcDsl.g:2761:53: (iv_ruleJavaMainType= ruleJavaMainType EOF )
            // InternalLcDsl.g:2762:2: iv_ruleJavaMainType= ruleJavaMainType EOF
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
    // InternalLcDsl.g:2768:1: ruleJavaMainType returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleJavaMainType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2774:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:2775:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:2775:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2776:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2776:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2777:4: lv_name_0_0= ruleFQName
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
    // InternalLcDsl.g:2797:1: entryRuleClearOption returns [EObject current=null] : iv_ruleClearOption= ruleClearOption EOF ;
    public final EObject entryRuleClearOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearOption = null;


        try {
            // InternalLcDsl.g:2797:52: (iv_ruleClearOption= ruleClearOption EOF )
            // InternalLcDsl.g:2798:2: iv_ruleClearOption= ruleClearOption EOF
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
    // InternalLcDsl.g:2804:1: ruleClearOption returns [EObject current=null] : ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' ) ;
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
            // InternalLcDsl.g:2810:2: ( ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' ) )
            // InternalLcDsl.g:2811:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' )
            {
            // InternalLcDsl.g:2811:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';' )
            // InternalLcDsl.g:2812:3: () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) otherlv_7= ';'
            {
            // InternalLcDsl.g:2812:3: ()
            // InternalLcDsl.g:2813:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearOptionAccess().getClearOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getClearOptionAccess().getClearKeyword_1());
            		
            // InternalLcDsl.g:2823:3: ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2824:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2824:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2825:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2828:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            // InternalLcDsl.g:2829:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2829:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( ( LA22_0 == 28 || LA22_0 == 65 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLcDsl.g:2830:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    {
            	    // InternalLcDsl.g:2830:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    // InternalLcDsl.g:2831:5: {...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2831:108: ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    // InternalLcDsl.g:2832:6: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2835:9: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    // InternalLcDsl.g:2835:10: {...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:2835:19: ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    // InternalLcDsl.g:2835:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )?
            	    {
            	    // InternalLcDsl.g:2835:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==28) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==65) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalLcDsl.g:2836:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            {
            	            // InternalLcDsl.g:2836:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            // InternalLcDsl.g:2837:11: (lv_workspace_3_0= 'workspace' )
            	            {
            	            // InternalLcDsl.g:2837:11: (lv_workspace_3_0= 'workspace' )
            	            // InternalLcDsl.g:2838:12: lv_workspace_3_0= 'workspace'
            	            {
            	            lv_workspace_3_0=(Token)match(input,28,FOLLOW_32); 

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
            	            // InternalLcDsl.g:2851:10: ( (lv_log_4_0= 'log' ) )
            	            {
            	            // InternalLcDsl.g:2851:10: ( (lv_log_4_0= 'log' ) )
            	            // InternalLcDsl.g:2852:11: (lv_log_4_0= 'log' )
            	            {
            	            // InternalLcDsl.g:2852:11: (lv_log_4_0= 'log' )
            	            // InternalLcDsl.g:2853:12: lv_log_4_0= 'log'
            	            {
            	            lv_log_4_0=(Token)match(input,65,FOLLOW_32); 

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

            	    // InternalLcDsl.g:2866:9: ( (lv_noAskClear_5_0= '!' ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==47) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalLcDsl.g:2867:10: (lv_noAskClear_5_0= '!' )
            	            {
            	            // InternalLcDsl.g:2867:10: (lv_noAskClear_5_0= '!' )
            	            // InternalLcDsl.g:2868:11: lv_noAskClear_5_0= '!'
            	            {
            	            lv_noAskClear_5_0=(Token)match(input,47,FOLLOW_31); 

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
            	    // InternalLcDsl.g:2886:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2886:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    // InternalLcDsl.g:2887:5: {...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2887:108: ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    // InternalLcDsl.g:2888:6: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2891:9: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    // InternalLcDsl.g:2891:10: {...}? => ( (lv_config_6_0= 'config' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:2891:19: ( (lv_config_6_0= 'config' ) )
            	    // InternalLcDsl.g:2891:20: (lv_config_6_0= 'config' )
            	    {
            	    // InternalLcDsl.g:2891:20: (lv_config_6_0= 'config' )
            	    // InternalLcDsl.g:2892:10: lv_config_6_0= 'config'
            	    {
            	    lv_config_6_0=(Token)match(input,66,FOLLOW_31); 

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
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            				

            }

            otherlv_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:2924:1: entryRuleMemoryOption returns [EObject current=null] : iv_ruleMemoryOption= ruleMemoryOption EOF ;
    public final EObject entryRuleMemoryOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryOption = null;


        try {
            // InternalLcDsl.g:2924:53: (iv_ruleMemoryOption= ruleMemoryOption EOF )
            // InternalLcDsl.g:2925:2: iv_ruleMemoryOption= ruleMemoryOption EOF
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
    // InternalLcDsl.g:2931:1: ruleMemoryOption returns [EObject current=null] : ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' ) ;
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
            // InternalLcDsl.g:2937:2: ( ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' ) )
            // InternalLcDsl.g:2938:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' )
            {
            // InternalLcDsl.g:2938:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';' )
            // InternalLcDsl.g:2939:3: () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) otherlv_15= ';'
            {
            // InternalLcDsl.g:2939:3: ()
            // InternalLcDsl.g:2940:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryOptionAccess().getMemoryOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryOptionAccess().getMemoryKeyword_1());
            		
            // InternalLcDsl.g:2950:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2951:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2951:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2952:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2955:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            // InternalLcDsl.g:2956:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2956:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            loop23:
            do {
                int alt23=4;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                    alt23=3;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLcDsl.g:2957:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2957:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2958:5: {...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2958:109: ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2959:6: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2962:9: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2962:10: {...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2962:19: (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2962:20: otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_3=(Token)match(input,68,FOLLOW_17); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMemoryOptionAccess().getMinKeyword_2_0_0());
            	    								
            	    this_EQ_4=(Token)match(input,RULE_EQ,FOLLOW_27); 

            	    									newLeafNode(this_EQ_4, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_0_1());
            	    								
            	    // InternalLcDsl.g:2970:9: ( (lv_min_5_0= RULE_INT ) )
            	    // InternalLcDsl.g:2971:10: (lv_min_5_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2971:10: (lv_min_5_0= RULE_INT )
            	    // InternalLcDsl.g:2972:11: lv_min_5_0= RULE_INT
            	    {
            	    lv_min_5_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            	    // InternalLcDsl.g:2988:9: ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2989:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2989:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2990:11: lv_minUnit_6_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getMinUnitMemoryUnitEnumRuleCall_2_0_3_0());
            	    										
            	    pushFollow(FOLLOW_33);
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
            	    // InternalLcDsl.g:3013:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3013:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:3014:5: {...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:3014:109: ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:3015:6: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:3018:9: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:3018:10: {...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:3018:19: (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:3018:20: otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_7=(Token)match(input,69,FOLLOW_17); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMemoryOptionAccess().getMaxKeyword_2_1_0());
            	    								
            	    this_EQ_8=(Token)match(input,RULE_EQ,FOLLOW_27); 

            	    									newLeafNode(this_EQ_8, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_1_1());
            	    								
            	    // InternalLcDsl.g:3026:9: ( (lv_max_9_0= RULE_INT ) )
            	    // InternalLcDsl.g:3027:10: (lv_max_9_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:3027:10: (lv_max_9_0= RULE_INT )
            	    // InternalLcDsl.g:3028:11: lv_max_9_0= RULE_INT
            	    {
            	    lv_max_9_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            	    // InternalLcDsl.g:3044:9: ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:3045:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:3045:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:3046:11: lv_maxUnit_10_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getMaxUnitMemoryUnitEnumRuleCall_2_1_3_0());
            	    										
            	    pushFollow(FOLLOW_33);
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
            	    // InternalLcDsl.g:3069:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3069:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:3070:5: {...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLcDsl.g:3070:109: ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:3071:6: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLcDsl.g:3074:9: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:3074:10: {...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:3074:19: (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:3074:20: otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_11=(Token)match(input,70,FOLLOW_17); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMemoryOptionAccess().getPermKeyword_2_2_0());
            	    								
            	    this_EQ_12=(Token)match(input,RULE_EQ,FOLLOW_27); 

            	    									newLeafNode(this_EQ_12, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_2_1());
            	    								
            	    // InternalLcDsl.g:3082:9: ( (lv_perm_13_0= RULE_INT ) )
            	    // InternalLcDsl.g:3083:10: (lv_perm_13_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:3083:10: (lv_perm_13_0= RULE_INT )
            	    // InternalLcDsl.g:3084:11: lv_perm_13_0= RULE_INT
            	    {
            	    lv_perm_13_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            	    // InternalLcDsl.g:3100:9: ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:3101:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:3101:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:3102:11: lv_permUnit_14_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getPermUnitMemoryUnitEnumRuleCall_2_2_3_0());
            	    										
            	    pushFollow(FOLLOW_33);
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
            	    break loop23;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:3140:1: entryRuleGroupMember returns [EObject current=null] : iv_ruleGroupMember= ruleGroupMember EOF ;
    public final EObject entryRuleGroupMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupMember = null;


        try {
            // InternalLcDsl.g:3140:52: (iv_ruleGroupMember= ruleGroupMember EOF )
            // InternalLcDsl.g:3141:2: iv_ruleGroupMember= ruleGroupMember EOF
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
    // InternalLcDsl.g:3147:1: ruleGroupMember returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) ;
    public final EObject ruleGroupMember() throws RecognitionException {
        EObject current = null;

        Token lv_adopt_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_postAction_5_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:3153:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) )
            // InternalLcDsl.g:3154:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            {
            // InternalLcDsl.g:3154:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            // InternalLcDsl.g:3155:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';'
            {
            // InternalLcDsl.g:3155:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:3156:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:3156:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:3157:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            				
            // InternalLcDsl.g:3160:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            // InternalLcDsl.g:3161:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:3161:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( LA24_0 >= 84 && LA24_0 <= 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLcDsl.g:3162:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3162:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    // InternalLcDsl.g:3163:5: {...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalLcDsl.g:3163:108: ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    // InternalLcDsl.g:3164:6: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalLcDsl.g:3167:9: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    // InternalLcDsl.g:3167:10: {...}? => ( (lv_type_1_0= ruleLaunchModeType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:3167:19: ( (lv_type_1_0= ruleLaunchModeType ) )
            	    // InternalLcDsl.g:3167:20: (lv_type_1_0= ruleLaunchModeType )
            	    {
            	    // InternalLcDsl.g:3167:20: (lv_type_1_0= ruleLaunchModeType )
            	    // InternalLcDsl.g:3168:10: lv_type_1_0= ruleLaunchModeType
            	    {

            	    										newCompositeNode(grammarAccess.getGroupMemberAccess().getTypeLaunchModeTypeEnumRuleCall_0_0_0());
            	    									
            	    pushFollow(FOLLOW_35);
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
            	    // InternalLcDsl.g:3190:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:3190:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    // InternalLcDsl.g:3191:5: {...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalLcDsl.g:3191:108: ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    // InternalLcDsl.g:3192:6: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalLcDsl.g:3195:9: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    // InternalLcDsl.g:3195:10: {...}? => ( (lv_adopt_2_0= 'adopt' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:3195:19: ( (lv_adopt_2_0= 'adopt' ) )
            	    // InternalLcDsl.g:3195:20: (lv_adopt_2_0= 'adopt' )
            	    {
            	    // InternalLcDsl.g:3195:20: (lv_adopt_2_0= 'adopt' )
            	    // InternalLcDsl.g:3196:10: lv_adopt_2_0= 'adopt'
            	    {
            	    lv_adopt_2_0=(Token)match(input,71,FOLLOW_35); 

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
            	    break loop24;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            				

            }

            otherlv_3=(Token)match(input,72,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupMemberAccess().getMemberKeyword_1());
            		
            // InternalLcDsl.g:3224:3: ( ( ruleFQName ) )
            // InternalLcDsl.g:3225:4: ( ruleFQName )
            {
            // InternalLcDsl.g:3225:4: ( ruleFQName )
            // InternalLcDsl.g:3226:5: ruleFQName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGroupMemberAccess().getMemberLaunchConfigCrossReference_2_0());
            				
            pushFollow(FOLLOW_36);
            ruleFQName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:3240:3: ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=73 && LA25_0<=75)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLcDsl.g:3241:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    {
                    // InternalLcDsl.g:3241:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    // InternalLcDsl.g:3242:5: lv_postAction_5_0= ruleGroupPostLaunchAction
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

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLcDsl.g:3267:1: entryRuleGroupPostLaunchAction returns [EObject current=null] : iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF ;
    public final EObject entryRuleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchAction = null;


        try {
            // InternalLcDsl.g:3267:62: (iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF )
            // InternalLcDsl.g:3268:2: iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF
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
    // InternalLcDsl.g:3274:1: ruleGroupPostLaunchAction returns [EObject current=null] : (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) ;
    public final EObject ruleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject this_GroupPostLaunchDelay_0 = null;

        EObject this_GroupPostLaunchRegex_1 = null;

        EObject this_GroupPostLaunchWait_2 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:3280:2: ( (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) )
            // InternalLcDsl.g:3281:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            {
            // InternalLcDsl.g:3281:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt26=1;
                }
                break;
            case 74:
                {
                alt26=2;
                }
                break;
            case 75:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalLcDsl.g:3282:3: this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay
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
                    // InternalLcDsl.g:3291:3: this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex
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
                    // InternalLcDsl.g:3300:3: this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait
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
    // InternalLcDsl.g:3312:1: entryRuleGroupPostLaunchDelay returns [EObject current=null] : iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF ;
    public final EObject entryRuleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchDelay = null;


        try {
            // InternalLcDsl.g:3312:61: (iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF )
            // InternalLcDsl.g:3313:2: iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF
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
    // InternalLcDsl.g:3319:1: ruleGroupPostLaunchDelay returns [EObject current=null] : (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_delay_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3325:2: ( (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) )
            // InternalLcDsl.g:3326:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            {
            // InternalLcDsl.g:3326:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            // InternalLcDsl.g:3327:3: otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchDelayAccess().getDelayKeyword_0());
            		
            // InternalLcDsl.g:3331:3: ( (lv_delay_1_0= RULE_INT ) )
            // InternalLcDsl.g:3332:4: (lv_delay_1_0= RULE_INT )
            {
            // InternalLcDsl.g:3332:4: (lv_delay_1_0= RULE_INT )
            // InternalLcDsl.g:3333:5: lv_delay_1_0= RULE_INT
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
    // InternalLcDsl.g:3353:1: entryRuleGroupPostLaunchRegex returns [EObject current=null] : iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF ;
    public final EObject entryRuleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchRegex = null;


        try {
            // InternalLcDsl.g:3353:61: (iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF )
            // InternalLcDsl.g:3354:2: iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF
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
    // InternalLcDsl.g:3360:1: ruleGroupPostLaunchRegex returns [EObject current=null] : (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_regex_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3366:2: ( (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) )
            // InternalLcDsl.g:3367:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            {
            // InternalLcDsl.g:3367:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            // InternalLcDsl.g:3368:3: otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchRegexAccess().getRegexKeyword_0());
            		
            // InternalLcDsl.g:3372:3: ( (lv_regex_1_0= RULE_STRING ) )
            // InternalLcDsl.g:3373:4: (lv_regex_1_0= RULE_STRING )
            {
            // InternalLcDsl.g:3373:4: (lv_regex_1_0= RULE_STRING )
            // InternalLcDsl.g:3374:5: lv_regex_1_0= RULE_STRING
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
    // InternalLcDsl.g:3394:1: entryRuleGroupPostLaunchWait returns [EObject current=null] : iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF ;
    public final EObject entryRuleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchWait = null;


        try {
            // InternalLcDsl.g:3394:60: (iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF )
            // InternalLcDsl.g:3395:2: iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF
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
    // InternalLcDsl.g:3401:1: ruleGroupPostLaunchWait returns [EObject current=null] : ( () otherlv_1= 'wait' ) ;
    public final EObject ruleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3407:2: ( ( () otherlv_1= 'wait' ) )
            // InternalLcDsl.g:3408:2: ( () otherlv_1= 'wait' )
            {
            // InternalLcDsl.g:3408:2: ( () otherlv_1= 'wait' )
            // InternalLcDsl.g:3409:3: () otherlv_1= 'wait'
            {
            // InternalLcDsl.g:3409:3: ()
            // InternalLcDsl.g:3410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupPostLaunchWaitAccess().getGroupPostLaunchWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_2); 

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
    // InternalLcDsl.g:3424:1: entryRuleStringWithVariables returns [EObject current=null] : iv_ruleStringWithVariables= ruleStringWithVariables EOF ;
    public final EObject entryRuleStringWithVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringWithVariables = null;


        try {
            // InternalLcDsl.g:3424:60: (iv_ruleStringWithVariables= ruleStringWithVariables EOF )
            // InternalLcDsl.g:3425:2: iv_ruleStringWithVariables= ruleStringWithVariables EOF
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
    // InternalLcDsl.g:3431:1: ruleStringWithVariables returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringWithVariables() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3437:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLcDsl.g:3438:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLcDsl.g:3438:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLcDsl.g:3439:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLcDsl.g:3439:3: (lv_value_0_0= RULE_STRING )
            // InternalLcDsl.g:3440:4: lv_value_0_0= RULE_STRING
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
    // InternalLcDsl.g:3459:1: entryRuleFQName returns [String current=null] : iv_ruleFQName= ruleFQName EOF ;
    public final String entryRuleFQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQName = null;


        try {
            // InternalLcDsl.g:3459:46: (iv_ruleFQName= ruleFQName EOF )
            // InternalLcDsl.g:3460:2: iv_ruleFQName= ruleFQName EOF
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
    // InternalLcDsl.g:3466:1: ruleFQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3472:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLcDsl.g:3473:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLcDsl.g:3473:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLcDsl.g:3474:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLcDsl.g:3481:3: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==76) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLcDsl.g:3482:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,76,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalLcDsl.g:3499:1: ruleBrowserLaunchMode returns [Enumerator current=null] : ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) ) ;
    public final Enumerator ruleBrowserLaunchMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3505:2: ( ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) ) )
            // InternalLcDsl.g:3506:2: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) )
            {
            // InternalLcDsl.g:3506:2: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt28=1;
                }
                break;
            case 78:
                {
                alt28=2;
                }
                break;
            case 79:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalLcDsl.g:3507:3: (enumLiteral_0= 'internal' )
                    {
                    // InternalLcDsl.g:3507:3: (enumLiteral_0= 'internal' )
                    // InternalLcDsl.g:3508:4: enumLiteral_0= 'internal'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getBrowserLaunchModeAccess().getINTERNALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrowserLaunchModeAccess().getINTERNALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3515:3: (enumLiteral_1= 'external' )
                    {
                    // InternalLcDsl.g:3515:3: (enumLiteral_1= 'external' )
                    // InternalLcDsl.g:3516:4: enumLiteral_1= 'external'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getBrowserLaunchModeAccess().getEXTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrowserLaunchModeAccess().getEXTERNALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3523:3: (enumLiteral_2= 'none' )
                    {
                    // InternalLcDsl.g:3523:3: (enumLiteral_2= 'none' )
                    // InternalLcDsl.g:3524:4: enumLiteral_2= 'none'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

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
    // InternalLcDsl.g:3534:1: ruleLaunchConfigType returns [Enumerator current=null] : ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) ) ;
    public final Enumerator ruleLaunchConfigType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3540:2: ( ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) ) )
            // InternalLcDsl.g:3541:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) )
            {
            // InternalLcDsl.g:3541:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt29=1;
                }
                break;
            case 81:
                {
                alt29=2;
                }
                break;
            case 82:
                {
                alt29=3;
                }
                break;
            case 83:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalLcDsl.g:3542:3: (enumLiteral_0= 'java' )
                    {
                    // InternalLcDsl.g:3542:3: (enumLiteral_0= 'java' )
                    // InternalLcDsl.g:3543:4: enumLiteral_0= 'java'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3550:3: (enumLiteral_1= 'eclipse' )
                    {
                    // InternalLcDsl.g:3550:3: (enumLiteral_1= 'eclipse' )
                    // InternalLcDsl.g:3551:4: enumLiteral_1= 'eclipse'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3558:3: (enumLiteral_2= 'rap' )
                    {
                    // InternalLcDsl.g:3558:3: (enumLiteral_2= 'rap' )
                    // InternalLcDsl.g:3559:4: enumLiteral_2= 'rap'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3566:3: (enumLiteral_3= 'group' )
                    {
                    // InternalLcDsl.g:3566:3: (enumLiteral_3= 'group' )
                    // InternalLcDsl.g:3567:4: enumLiteral_3= 'group'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

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
    // InternalLcDsl.g:3577:1: ruleLaunchModeType returns [Enumerator current=null] : ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) ) ;
    public final Enumerator ruleLaunchModeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3583:2: ( ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) ) )
            // InternalLcDsl.g:3584:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) )
            {
            // InternalLcDsl.g:3584:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt30=1;
                }
                break;
            case 85:
                {
                alt30=2;
                }
                break;
            case 86:
                {
                alt30=3;
                }
                break;
            case 87:
                {
                alt30=4;
                }
                break;
            case 88:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalLcDsl.g:3585:3: (enumLiteral_0= 'run' )
                    {
                    // InternalLcDsl.g:3585:3: (enumLiteral_0= 'run' )
                    // InternalLcDsl.g:3586:4: enumLiteral_0= 'run'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3593:3: (enumLiteral_1= 'debug' )
                    {
                    // InternalLcDsl.g:3593:3: (enumLiteral_1= 'debug' )
                    // InternalLcDsl.g:3594:4: enumLiteral_1= 'debug'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3601:3: (enumLiteral_2= 'profile' )
                    {
                    // InternalLcDsl.g:3601:3: (enumLiteral_2= 'profile' )
                    // InternalLcDsl.g:3602:4: enumLiteral_2= 'profile'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3609:3: (enumLiteral_3= 'coverage' )
                    {
                    // InternalLcDsl.g:3609:3: (enumLiteral_3= 'coverage' )
                    // InternalLcDsl.g:3610:4: enumLiteral_3= 'coverage'
                    {
                    enumLiteral_3=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:3617:3: (enumLiteral_4= 'inherit' )
                    {
                    // InternalLcDsl.g:3617:3: (enumLiteral_4= 'inherit' )
                    // InternalLcDsl.g:3618:4: enumLiteral_4= 'inherit'
                    {
                    enumLiteral_4=(Token)match(input,88,FOLLOW_2); 

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
    // InternalLcDsl.g:3628:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'MB' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'GB' ) | (enumLiteral_7= 'g' ) ) ;
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
            // InternalLcDsl.g:3634:2: ( ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'MB' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'GB' ) | (enumLiteral_7= 'g' ) ) )
            // InternalLcDsl.g:3635:2: ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'MB' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'GB' ) | (enumLiteral_7= 'g' ) )
            {
            // InternalLcDsl.g:3635:2: ( (enumLiteral_0= 'M' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'MB' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'GB' ) | (enumLiteral_7= 'g' ) )
            int alt31=8;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt31=1;
                }
                break;
            case 90:
                {
                alt31=2;
                }
                break;
            case 91:
                {
                alt31=3;
                }
                break;
            case 92:
                {
                alt31=4;
                }
                break;
            case 93:
                {
                alt31=5;
                }
                break;
            case 94:
                {
                alt31=6;
                }
                break;
            case 95:
                {
                alt31=7;
                }
                break;
            case 96:
                {
                alt31=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalLcDsl.g:3636:3: (enumLiteral_0= 'M' )
                    {
                    // InternalLcDsl.g:3636:3: (enumLiteral_0= 'M' )
                    // InternalLcDsl.g:3637:4: enumLiteral_0= 'M'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3644:3: (enumLiteral_1= 'mb' )
                    {
                    // InternalLcDsl.g:3644:3: (enumLiteral_1= 'mb' )
                    // InternalLcDsl.g:3645:4: enumLiteral_1= 'mb'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3652:3: (enumLiteral_2= 'MB' )
                    {
                    // InternalLcDsl.g:3652:3: (enumLiteral_2= 'MB' )
                    // InternalLcDsl.g:3653:4: enumLiteral_2= 'MB'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3660:3: (enumLiteral_3= 'm' )
                    {
                    // InternalLcDsl.g:3660:3: (enumLiteral_3= 'm' )
                    // InternalLcDsl.g:3661:4: enumLiteral_3= 'm'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:3668:3: (enumLiteral_4= 'G' )
                    {
                    // InternalLcDsl.g:3668:3: (enumLiteral_4= 'G' )
                    // InternalLcDsl.g:3669:4: enumLiteral_4= 'G'
                    {
                    enumLiteral_4=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:3676:3: (enumLiteral_5= 'gb' )
                    {
                    // InternalLcDsl.g:3676:3: (enumLiteral_5= 'gb' )
                    // InternalLcDsl.g:3677:4: enumLiteral_5= 'gb'
                    {
                    enumLiteral_5=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:3684:3: (enumLiteral_6= 'GB' )
                    {
                    // InternalLcDsl.g:3684:3: (enumLiteral_6= 'GB' )
                    // InternalLcDsl.g:3685:4: enumLiteral_6= 'GB'
                    {
                    enumLiteral_6=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalLcDsl.g:3692:3: (enumLiteral_7= 'g' )
                    {
                    // InternalLcDsl.g:3692:3: (enumLiteral_7= 'g' )
                    // InternalLcDsl.g:3693:4: enumLiteral_7= 'g'
                    {
                    enumLiteral_7=(Token)match(input,96,FOLLOW_2); 

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
    // InternalLcDsl.g:3703:1: ruleOutputStream returns [Enumerator current=null] : ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) ;
    public final Enumerator ruleOutputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3709:2: ( ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) )
            // InternalLcDsl.g:3710:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
            {
            // InternalLcDsl.g:3710:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt32=1;
                }
                break;
            case 98:
                {
                alt32=2;
                }
                break;
            case 99:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalLcDsl.g:3711:3: (enumLiteral_0= 'stdout' )
                    {
                    // InternalLcDsl.g:3711:3: (enumLiteral_0= 'stdout' )
                    // InternalLcDsl.g:3712:4: enumLiteral_0= 'stdout'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3719:3: (enumLiteral_1= 'stderr' )
                    {
                    // InternalLcDsl.g:3719:3: (enumLiteral_1= 'stderr' )
                    // InternalLcDsl.g:3720:4: enumLiteral_1= 'stderr'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3727:3: (enumLiteral_2= 'both-out' )
                    {
                    // InternalLcDsl.g:3727:3: (enumLiteral_2= 'both-out' )
                    // InternalLcDsl.g:3728:4: enumLiteral_2= 'both-out'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); 

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
    // InternalLcDsl.g:3738:1: ruleInputStream returns [Enumerator current=null] : (enumLiteral_0= 'stdin' ) ;
    public final Enumerator ruleInputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3744:2: ( (enumLiteral_0= 'stdin' ) )
            // InternalLcDsl.g:3745:2: (enumLiteral_0= 'stdin' )
            {
            // InternalLcDsl.g:3745:2: (enumLiteral_0= 'stdin' )
            // InternalLcDsl.g:3746:3: enumLiteral_0= 'stdin'
            {
            enumLiteral_0=(Token)match(input,100,FOLLOW_2); 

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
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\21\12\uffff";
    static final String dfa_3s = "\1\123\12\uffff";
    static final String dfa_4s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\66\uffff\4\1",
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
            return "()* loopback of 122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_4_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_5_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_6_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_7_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_8_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_9_0= 'stop-in-main' ) ) ) ) ) )*";
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
                        if ( ((LA2_0>=80 && LA2_0<=83)) ) {s = 1;}

                        else if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {s = 2;}

                        else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {s = 3;}

                        else if ( LA2_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {s = 4;}

                        else if ( LA2_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {s = 5;}

                        else if ( LA2_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {s = 6;}

                        else if ( LA2_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {s = 7;}

                        else if ( LA2_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {s = 8;}

                        else if ( LA2_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 7) ) {s = 9;}

                        else if ( LA2_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 8) ) {s = 10;}

                         
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
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\5\20\uffff";
    static final String dfa_9s = "\1\130\20\uffff";
    static final String dfa_10s = "\1\uffff\1\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17";
    static final String dfa_11s = "\1\0\20\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\26\uffff\1\3\1\uffff\1\4\1\6\1\uffff\1\7\3\1\1\20\4\1\1\10\1\11\1\12\1\13\3\uffff\1\14\1\15\1\1\1\16\2\uffff\1\17\10\uffff\1\2\2\uffff\1\5\3\uffff\2\1\13\uffff\5\1",
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
            return "()* loopback of 411:6: ( ({...}? => ( ({...}? => ( (lv_clears_17_0= ruleClearOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workspace_18_0= ruleWorkspace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_workingDir_19_0= ruleWorkingDir ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_memory_20_0= ruleMemoryOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainProject_21_0= ruleMainProject ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mainType_22_0= ruleMainType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_23_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_24_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_25_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_26_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_27_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_28_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_29_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_30_0= ruleRapServletConfig ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contentProviderProduct_31_0= ruleContentProviderProduct ) ) ) ) ) )*";
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
                        if ( (LA4_0==RULE_BLOCK_END||(LA4_0>=34 && LA4_0<=36)||(LA4_0>=38 && LA4_0<=41)||LA4_0==51||(LA4_0>=71 && LA4_0<=72)||(LA4_0>=84 && LA4_0<=88)) ) {s = 1;}

                        else if ( LA4_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 2;}

                        else if ( LA4_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 3;}

                        else if ( LA4_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 4;}

                        else if ( LA4_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 5;}

                        else if ( LA4_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 6;}

                        else if ( LA4_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 7;}

                        else if ( LA4_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 8;}

                        else if ( LA4_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 9;}

                        else if ( LA4_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 10;}

                        else if ( LA4_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 11;}

                        else if ( LA4_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 12;}

                        else if ( LA4_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 13;}

                        else if ( LA4_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12) ) {s = 14;}

                        else if ( LA4_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13) ) {s = 15;}

                        else if ( LA4_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 14) ) {s = 16;}

                         
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
    static final String dfa_13s = "\1\5\1\uffff\1\43\10\uffff";
    static final String dfa_14s = "\1\130\1\uffff\1\44\10\uffff";
    static final String dfa_15s = "\1\uffff\1\11\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_16s = "\13\uffff}>";
    static final String[] dfa_17s = {
            "\1\1\34\uffff\1\2\1\3\1\4\1\uffff\1\5\1\7\1\10\1\11\11\uffff\1\12\23\uffff\2\6\13\uffff\5\6",
            "",
            "\1\3\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "()* loopback of 839:3: ( ( (lv_plugins_32_0= ruleAddPlugin ) ) | ( (lv_features_33_0= ruleAddFeature ) ) | ( (lv_ignore_34_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_35_0= ruleGroupMember ) ) | ( (lv_vmArgs_36_0= ruleVmArgument ) ) | ( (lv_progArgs_37_0= ruleProgramArgument ) ) | ( (lv_envVars_38_0= ruleEnvironmentVariable ) ) | ( (lv_traces_39_0= ruleTraceEnablement ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003FE0002L,0x00000000000F0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000007FE0000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x009E3FFED0000020L,0x0000000001F00189L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000803DC00000020L,0x0000000001F00180L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800020000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0060000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x3F00000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x3F00000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000030000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800030000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x00000001FE000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00180L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});

}
