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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BLOCK_BEGIN", "RULE_BLOCK_END", "RULE_STRING", "RULE_ID", "RULE_EQ", "RULE_INT", "RULE_BOOLEAN", "RULE_VERSION", "RULE_QUALIFIER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'explicit'", "'manual'", "'foreground'", "'no-console'", "'no-validate'", "'sw-install-allowed'", "'replace-env'", "'stop-in-main'", "'configuration'", "':'", "';'", "'workspace'", "'working-dir'", "'project'", "'main-class'", "'plugin'", "'ignore'", "'vm-arg'", "'argument'", "'environment'", "'application'", "'product'", "'favorite'", "'run'", "'debug'", "'redirect'", "'to'", "'from'", "'execution-environment'", "'config-ini-template'", "'trace'", "'search-main'", "'system'", "'inherited'", "'servlet'", "'path'", "'open'", "'port'", "'session-timeout'", "'context-path'", "'dev-mode'", "'autostart'", "'startlevel'", "'clear'", "'log'", "'!'", "'config'", "'memory'", "'min'", "'max'", "'perm'", "'adopt'", "'member'", "'delay'", "'regex'", "'wait'", "'.'", "'internal'", "'external'", "'none'", "'java'", "'eclipse'", "'rap'", "'group'", "'profile'", "'coverage'", "'inherit'", "'MB'", "'mb'", "'M'", "'m'", "'GB'", "'gb'", "'G'", "'g'", "'stdout'", "'stderr'", "'both-out'", "'stdin'"
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
    public static final int RULE_ID=7;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_EQ=8;
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

                if ( ((LA1_0>=17 && LA1_0<=24)||(LA1_0>=77 && LA1_0<=80)) ) {
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
    // InternalLcDsl.g:108:1: ruleLaunchConfig returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_40_0= ruleAddPlugin ) ) | ( (lv_ignore_41_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_42_0= ruleGroupMember ) ) | ( (lv_vmArgs_43_0= ruleVmArgument ) ) | ( (lv_progArgs_44_0= ruleProgramArgument ) ) | ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) | ( (lv_traces_46_0= ruleTraceEnablement ) ) )* this_BLOCK_END_47= RULE_BLOCK_END ) ;
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
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token this_BLOCK_END_47=null;
        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_name_11_0 = null;

        EObject lv_clears_16_0 = null;

        EObject lv_workspace_19_0 = null;

        EObject lv_workingDir_22_0 = null;

        EObject lv_memory_24_0 = null;

        EObject lv_project_27_0 = null;

        EObject lv_mainClass_30_0 = null;

        EObject lv_application_32_0 = null;

        EObject lv_product_33_0 = null;

        EObject lv_favorites_34_0 = null;

        EObject lv_redirect_35_0 = null;

        EObject lv_execEnv_36_0 = null;

        EObject lv_configIniTemplate_37_0 = null;

        EObject lv_javaMainSearch_38_0 = null;

        EObject lv_servletConfig_39_0 = null;

        EObject lv_plugins_40_0 = null;

        EObject lv_ignore_41_0 = null;

        EObject lv_groupMembers_42_0 = null;

        EObject lv_vmArgs_43_0 = null;

        EObject lv_progArgs_44_0 = null;

        EObject lv_envVars_45_0 = null;

        EObject lv_traces_46_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:114:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_40_0= ruleAddPlugin ) ) | ( (lv_ignore_41_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_42_0= ruleGroupMember ) ) | ( (lv_vmArgs_43_0= ruleVmArgument ) ) | ( (lv_progArgs_44_0= ruleProgramArgument ) ) | ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) | ( (lv_traces_46_0= ruleTraceEnablement ) ) )* this_BLOCK_END_47= RULE_BLOCK_END ) )
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_40_0= ruleAddPlugin ) ) | ( (lv_ignore_41_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_42_0= ruleGroupMember ) ) | ( (lv_vmArgs_43_0= ruleVmArgument ) ) | ( (lv_progArgs_44_0= ruleProgramArgument ) ) | ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) | ( (lv_traces_46_0= ruleTraceEnablement ) ) )* this_BLOCK_END_47= RULE_BLOCK_END )
            {
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_40_0= ruleAddPlugin ) ) | ( (lv_ignore_41_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_42_0= ruleGroupMember ) ) | ( (lv_vmArgs_43_0= ruleVmArgument ) ) | ( (lv_progArgs_44_0= ruleProgramArgument ) ) | ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) | ( (lv_traces_46_0= ruleTraceEnablement ) ) )* this_BLOCK_END_47= RULE_BLOCK_END )
            // InternalLcDsl.g:116:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_stopInMain_8_0= 'stop-in-main' ) ) ) ) ) )* ) ) ) ( (lv_type_9_0= ruleLaunchConfigType ) ) otherlv_10= 'configuration' ( (lv_name_11_0= ruleFQName ) ) (otherlv_12= ':' ( ( ruleFQName ) ) )? this_BLOCK_BEGIN_14= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_40_0= ruleAddPlugin ) ) | ( (lv_ignore_41_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_42_0= ruleGroupMember ) ) | ( (lv_vmArgs_43_0= ruleVmArgument ) ) | ( (lv_progArgs_44_0= ruleProgramArgument ) ) | ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) | ( (lv_traces_46_0= ruleTraceEnablement ) ) )* this_BLOCK_END_47= RULE_BLOCK_END
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
            		
            // InternalLcDsl.g:382:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:383:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:383:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* ) )
            // InternalLcDsl.g:384:5: ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            				
            // InternalLcDsl.g:387:5: ( ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )* )
            // InternalLcDsl.g:388:6: ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )*
            {
            // InternalLcDsl.g:388:6: ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )*
            loop4:
            do {
                int alt4=15;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalLcDsl.g:389:4: ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:389:4: ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) )
            	    // InternalLcDsl.g:390:5: {...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalLcDsl.g:390:109: ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) )
            	    // InternalLcDsl.g:391:6: ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0);
            	    					
            	    // InternalLcDsl.g:394:9: ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) )
            	    // InternalLcDsl.g:394:10: {...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:394:19: ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' )
            	    // InternalLcDsl.g:394:20: ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';'
            	    {
            	    // InternalLcDsl.g:394:20: ( (lv_clears_16_0= ruleClearOption ) )
            	    // InternalLcDsl.g:395:10: (lv_clears_16_0= ruleClearOption )
            	    {
            	    // InternalLcDsl.g:395:10: (lv_clears_16_0= ruleClearOption )
            	    // InternalLcDsl.g:396:11: lv_clears_16_0= ruleClearOption
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getClearsClearOptionParserRuleCall_6_0_0_0());
            	    										
            	    pushFollow(FOLLOW_10);
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

            	    otherlv_17=(Token)match(input,27,FOLLOW_9); 

            	    									newLeafNode(otherlv_17, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_0_1());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:423:4: ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:423:4: ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) )
            	    // InternalLcDsl.g:424:5: {...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalLcDsl.g:424:109: ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) )
            	    // InternalLcDsl.g:425:6: ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1);
            	    					
            	    // InternalLcDsl.g:428:9: ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) )
            	    // InternalLcDsl.g:428:10: {...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:428:19: (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' )
            	    // InternalLcDsl.g:428:20: otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';'
            	    {
            	    otherlv_18=(Token)match(input,28,FOLLOW_11); 

            	    									newLeafNode(otherlv_18, grammarAccess.getLaunchConfigAccess().getWorkspaceKeyword_6_1_0());
            	    								
            	    // InternalLcDsl.g:432:9: ( (lv_workspace_19_0= ruleAnyPath ) )
            	    // InternalLcDsl.g:433:10: (lv_workspace_19_0= ruleAnyPath )
            	    {
            	    // InternalLcDsl.g:433:10: (lv_workspace_19_0= ruleAnyPath )
            	    // InternalLcDsl.g:434:11: lv_workspace_19_0= ruleAnyPath
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkspaceAnyPathParserRuleCall_6_1_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_workspace_19_0=ruleAnyPath();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"workspace",
            	    												lv_workspace_19_0,
            	    												"com.wamas.ide.launching.LcDsl.AnyPath");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_20=(Token)match(input,27,FOLLOW_9); 

            	    									newLeafNode(otherlv_20, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:461:4: ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:461:4: ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) )
            	    // InternalLcDsl.g:462:5: {...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalLcDsl.g:462:109: ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) )
            	    // InternalLcDsl.g:463:6: ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2);
            	    					
            	    // InternalLcDsl.g:466:9: ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) )
            	    // InternalLcDsl.g:466:10: {...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:466:19: (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' )
            	    // InternalLcDsl.g:466:20: otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';'
            	    {
            	    otherlv_21=(Token)match(input,29,FOLLOW_11); 

            	    									newLeafNode(otherlv_21, grammarAccess.getLaunchConfigAccess().getWorkingDirKeyword_6_2_0());
            	    								
            	    // InternalLcDsl.g:470:9: ( (lv_workingDir_22_0= ruleExistingPath ) )
            	    // InternalLcDsl.g:471:10: (lv_workingDir_22_0= ruleExistingPath )
            	    {
            	    // InternalLcDsl.g:471:10: (lv_workingDir_22_0= ruleExistingPath )
            	    // InternalLcDsl.g:472:11: lv_workingDir_22_0= ruleExistingPath
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkingDirExistingPathParserRuleCall_6_2_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_workingDir_22_0=ruleExistingPath();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"workingDir",
            	    												lv_workingDir_22_0,
            	    												"com.wamas.ide.launching.LcDsl.ExistingPath");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_23=(Token)match(input,27,FOLLOW_9); 

            	    									newLeafNode(otherlv_23, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:499:4: ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:499:4: ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) )
            	    // InternalLcDsl.g:500:5: {...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalLcDsl.g:500:109: ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) )
            	    // InternalLcDsl.g:501:6: ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3);
            	    					
            	    // InternalLcDsl.g:504:9: ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) )
            	    // InternalLcDsl.g:504:10: {...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:504:19: ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' )
            	    // InternalLcDsl.g:504:20: ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';'
            	    {
            	    // InternalLcDsl.g:504:20: ( (lv_memory_24_0= ruleMemoryOption ) )
            	    // InternalLcDsl.g:505:10: (lv_memory_24_0= ruleMemoryOption )
            	    {
            	    // InternalLcDsl.g:505:10: (lv_memory_24_0= ruleMemoryOption )
            	    // InternalLcDsl.g:506:11: lv_memory_24_0= ruleMemoryOption
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getMemoryMemoryOptionParserRuleCall_6_3_0_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_memory_24_0=ruleMemoryOption();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"memory",
            	    												lv_memory_24_0,
            	    												"com.wamas.ide.launching.LcDsl.MemoryOption");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_25=(Token)match(input,27,FOLLOW_9); 

            	    									newLeafNode(otherlv_25, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_3_1());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:533:4: ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:533:4: ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) )
            	    // InternalLcDsl.g:534:5: {...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalLcDsl.g:534:109: ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) )
            	    // InternalLcDsl.g:535:6: ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4);
            	    					
            	    // InternalLcDsl.g:538:9: ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) )
            	    // InternalLcDsl.g:538:10: {...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:538:19: (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' )
            	    // InternalLcDsl.g:538:20: otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';'
            	    {
            	    otherlv_26=(Token)match(input,30,FOLLOW_6); 

            	    									newLeafNode(otherlv_26, grammarAccess.getLaunchConfigAccess().getProjectKeyword_6_4_0());
            	    								
            	    // InternalLcDsl.g:542:9: ( (lv_project_27_0= ruleProject ) )
            	    // InternalLcDsl.g:543:10: (lv_project_27_0= ruleProject )
            	    {
            	    // InternalLcDsl.g:543:10: (lv_project_27_0= ruleProject )
            	    // InternalLcDsl.g:544:11: lv_project_27_0= ruleProject
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getProjectProjectParserRuleCall_6_4_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_project_27_0=ruleProject();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"project",
            	    												lv_project_27_0,
            	    												"com.wamas.ide.launching.LcDsl.Project");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_28=(Token)match(input,27,FOLLOW_9); 

            	    									newLeafNode(otherlv_28, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:571:4: ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:571:4: ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) )
            	    // InternalLcDsl.g:572:5: {...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalLcDsl.g:572:109: ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) )
            	    // InternalLcDsl.g:573:6: ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5);
            	    					
            	    // InternalLcDsl.g:576:9: ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) )
            	    // InternalLcDsl.g:576:10: {...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:576:19: (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' )
            	    // InternalLcDsl.g:576:20: otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';'
            	    {
            	    otherlv_29=(Token)match(input,31,FOLLOW_6); 

            	    									newLeafNode(otherlv_29, grammarAccess.getLaunchConfigAccess().getMainClassKeyword_6_5_0());
            	    								
            	    // InternalLcDsl.g:580:9: ( (lv_mainClass_30_0= ruleJavaType ) )
            	    // InternalLcDsl.g:581:10: (lv_mainClass_30_0= ruleJavaType )
            	    {
            	    // InternalLcDsl.g:581:10: (lv_mainClass_30_0= ruleJavaType )
            	    // InternalLcDsl.g:582:11: lv_mainClass_30_0= ruleJavaType
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getMainClassJavaTypeParserRuleCall_6_5_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_mainClass_30_0=ruleJavaType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"mainClass",
            	    												lv_mainClass_30_0,
            	    												"com.wamas.ide.launching.LcDsl.JavaType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_31=(Token)match(input,27,FOLLOW_9); 

            	    									newLeafNode(otherlv_31, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_5_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLcDsl.g:609:4: ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:609:4: ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:610:5: {...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // InternalLcDsl.g:610:109: ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) )
            	    // InternalLcDsl.g:611:6: ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6);
            	    					
            	    // InternalLcDsl.g:614:9: ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) )
            	    // InternalLcDsl.g:614:10: {...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:614:19: ( (lv_application_32_0= ruleApplicationExtPoint ) )
            	    // InternalLcDsl.g:614:20: (lv_application_32_0= ruleApplicationExtPoint )
            	    {
            	    // InternalLcDsl.g:614:20: (lv_application_32_0= ruleApplicationExtPoint )
            	    // InternalLcDsl.g:615:10: lv_application_32_0= ruleApplicationExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getApplicationApplicationExtPointParserRuleCall_6_6_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_application_32_0=ruleApplicationExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"application",
            	    											lv_application_32_0,
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
            	    // InternalLcDsl.g:637:4: ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:637:4: ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:638:5: {...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7)");
            	    }
            	    // InternalLcDsl.g:638:109: ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) )
            	    // InternalLcDsl.g:639:6: ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7);
            	    					
            	    // InternalLcDsl.g:642:9: ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) )
            	    // InternalLcDsl.g:642:10: {...}? => ( (lv_product_33_0= ruleProductExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:642:19: ( (lv_product_33_0= ruleProductExtPoint ) )
            	    // InternalLcDsl.g:642:20: (lv_product_33_0= ruleProductExtPoint )
            	    {
            	    // InternalLcDsl.g:642:20: (lv_product_33_0= ruleProductExtPoint )
            	    // InternalLcDsl.g:643:10: lv_product_33_0= ruleProductExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getProductProductExtPointParserRuleCall_6_7_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_product_33_0=ruleProductExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"product",
            	    											lv_product_33_0,
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
            	    // InternalLcDsl.g:665:4: ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:665:4: ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) )
            	    // InternalLcDsl.g:666:5: {...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8)");
            	    }
            	    // InternalLcDsl.g:666:109: ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) )
            	    // InternalLcDsl.g:667:6: ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8);
            	    					
            	    // InternalLcDsl.g:670:9: ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) )
            	    // InternalLcDsl.g:670:10: {...}? => ( (lv_favorites_34_0= ruleFavorites ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:670:19: ( (lv_favorites_34_0= ruleFavorites ) )
            	    // InternalLcDsl.g:670:20: (lv_favorites_34_0= ruleFavorites )
            	    {
            	    // InternalLcDsl.g:670:20: (lv_favorites_34_0= ruleFavorites )
            	    // InternalLcDsl.g:671:10: lv_favorites_34_0= ruleFavorites
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getFavoritesFavoritesParserRuleCall_6_8_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_favorites_34_0=ruleFavorites();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"favorites",
            	    											lv_favorites_34_0,
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
            	    // InternalLcDsl.g:693:4: ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:693:4: ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) )
            	    // InternalLcDsl.g:694:5: {...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9)");
            	    }
            	    // InternalLcDsl.g:694:109: ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) )
            	    // InternalLcDsl.g:695:6: ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9);
            	    					
            	    // InternalLcDsl.g:698:9: ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) )
            	    // InternalLcDsl.g:698:10: {...}? => ( (lv_redirect_35_0= ruleRedirect ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:698:19: ( (lv_redirect_35_0= ruleRedirect ) )
            	    // InternalLcDsl.g:698:20: (lv_redirect_35_0= ruleRedirect )
            	    {
            	    // InternalLcDsl.g:698:20: (lv_redirect_35_0= ruleRedirect )
            	    // InternalLcDsl.g:699:10: lv_redirect_35_0= ruleRedirect
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getRedirectRedirectParserRuleCall_6_9_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_redirect_35_0=ruleRedirect();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"redirect",
            	    											lv_redirect_35_0,
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
            	    // InternalLcDsl.g:721:4: ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:721:4: ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) )
            	    // InternalLcDsl.g:722:5: {...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10)");
            	    }
            	    // InternalLcDsl.g:722:110: ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) )
            	    // InternalLcDsl.g:723:6: ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10);
            	    					
            	    // InternalLcDsl.g:726:9: ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) )
            	    // InternalLcDsl.g:726:10: {...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:726:19: ( (lv_execEnv_36_0= ruleExecutionEnvironment ) )
            	    // InternalLcDsl.g:726:20: (lv_execEnv_36_0= ruleExecutionEnvironment )
            	    {
            	    // InternalLcDsl.g:726:20: (lv_execEnv_36_0= ruleExecutionEnvironment )
            	    // InternalLcDsl.g:727:10: lv_execEnv_36_0= ruleExecutionEnvironment
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getExecEnvExecutionEnvironmentParserRuleCall_6_10_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_execEnv_36_0=ruleExecutionEnvironment();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"execEnv",
            	    											lv_execEnv_36_0,
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
            	    // InternalLcDsl.g:749:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:749:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) )
            	    // InternalLcDsl.g:750:5: {...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11)");
            	    }
            	    // InternalLcDsl.g:750:110: ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) )
            	    // InternalLcDsl.g:751:6: ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11);
            	    					
            	    // InternalLcDsl.g:754:9: ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) )
            	    // InternalLcDsl.g:754:10: {...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:754:19: ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) )
            	    // InternalLcDsl.g:754:20: (lv_configIniTemplate_37_0= ruleConfigIniTemplate )
            	    {
            	    // InternalLcDsl.g:754:20: (lv_configIniTemplate_37_0= ruleConfigIniTemplate )
            	    // InternalLcDsl.g:755:10: lv_configIniTemplate_37_0= ruleConfigIniTemplate
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getConfigIniTemplateConfigIniTemplateParserRuleCall_6_11_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_configIniTemplate_37_0=ruleConfigIniTemplate();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"configIniTemplate",
            	    											lv_configIniTemplate_37_0,
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
            	    // InternalLcDsl.g:777:4: ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:777:4: ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) )
            	    // InternalLcDsl.g:778:5: {...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12)");
            	    }
            	    // InternalLcDsl.g:778:110: ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) )
            	    // InternalLcDsl.g:779:6: ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12);
            	    					
            	    // InternalLcDsl.g:782:9: ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) )
            	    // InternalLcDsl.g:782:10: {...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:782:19: ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) )
            	    // InternalLcDsl.g:782:20: (lv_javaMainSearch_38_0= ruleJavaMainSearch )
            	    {
            	    // InternalLcDsl.g:782:20: (lv_javaMainSearch_38_0= ruleJavaMainSearch )
            	    // InternalLcDsl.g:783:10: lv_javaMainSearch_38_0= ruleJavaMainSearch
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getJavaMainSearchJavaMainSearchParserRuleCall_6_12_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_javaMainSearch_38_0=ruleJavaMainSearch();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"javaMainSearch",
            	    											lv_javaMainSearch_38_0,
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
            	    // InternalLcDsl.g:805:4: ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:805:4: ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) )
            	    // InternalLcDsl.g:806:5: {...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13)");
            	    }
            	    // InternalLcDsl.g:806:110: ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) )
            	    // InternalLcDsl.g:807:6: ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13);
            	    					
            	    // InternalLcDsl.g:810:9: ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) )
            	    // InternalLcDsl.g:810:10: {...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:810:19: ( (lv_servletConfig_39_0= ruleRapServletConfig ) )
            	    // InternalLcDsl.g:810:20: (lv_servletConfig_39_0= ruleRapServletConfig )
            	    {
            	    // InternalLcDsl.g:810:20: (lv_servletConfig_39_0= ruleRapServletConfig )
            	    // InternalLcDsl.g:811:10: lv_servletConfig_39_0= ruleRapServletConfig
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getServletConfigRapServletConfigParserRuleCall_6_13_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_servletConfig_39_0=ruleRapServletConfig();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"servletConfig",
            	    											lv_servletConfig_39_0,
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

            // InternalLcDsl.g:840:3: ( ( (lv_plugins_40_0= ruleAddPlugin ) ) | ( (lv_ignore_41_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_42_0= ruleGroupMember ) ) | ( (lv_vmArgs_43_0= ruleVmArgument ) ) | ( (lv_progArgs_44_0= ruleProgramArgument ) ) | ( (lv_envVars_45_0= ruleEnvironmentVariable ) ) | ( (lv_traces_46_0= ruleTraceEnablement ) ) )*
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
                case 40:
                case 41:
                case 68:
                case 69:
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
                case 47:
                    {
                    alt5=7;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalLcDsl.g:841:4: ( (lv_plugins_40_0= ruleAddPlugin ) )
            	    {
            	    // InternalLcDsl.g:841:4: ( (lv_plugins_40_0= ruleAddPlugin ) )
            	    // InternalLcDsl.g:842:5: (lv_plugins_40_0= ruleAddPlugin )
            	    {
            	    // InternalLcDsl.g:842:5: (lv_plugins_40_0= ruleAddPlugin )
            	    // InternalLcDsl.g:843:6: lv_plugins_40_0= ruleAddPlugin
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getPluginsAddPluginParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_plugins_40_0=ruleAddPlugin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"plugins",
            	    							lv_plugins_40_0,
            	    							"com.wamas.ide.launching.LcDsl.AddPlugin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:861:4: ( (lv_ignore_41_0= ruleIgnorePlugin ) )
            	    {
            	    // InternalLcDsl.g:861:4: ( (lv_ignore_41_0= ruleIgnorePlugin ) )
            	    // InternalLcDsl.g:862:5: (lv_ignore_41_0= ruleIgnorePlugin )
            	    {
            	    // InternalLcDsl.g:862:5: (lv_ignore_41_0= ruleIgnorePlugin )
            	    // InternalLcDsl.g:863:6: lv_ignore_41_0= ruleIgnorePlugin
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getIgnoreIgnorePluginParserRuleCall_7_1_0());
            	    					
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
            	case 3 :
            	    // InternalLcDsl.g:881:4: ( (lv_groupMembers_42_0= ruleGroupMember ) )
            	    {
            	    // InternalLcDsl.g:881:4: ( (lv_groupMembers_42_0= ruleGroupMember ) )
            	    // InternalLcDsl.g:882:5: (lv_groupMembers_42_0= ruleGroupMember )
            	    {
            	    // InternalLcDsl.g:882:5: (lv_groupMembers_42_0= ruleGroupMember )
            	    // InternalLcDsl.g:883:6: lv_groupMembers_42_0= ruleGroupMember
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getGroupMembersGroupMemberParserRuleCall_7_2_0());
            	    					
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
            	case 4 :
            	    // InternalLcDsl.g:901:4: ( (lv_vmArgs_43_0= ruleVmArgument ) )
            	    {
            	    // InternalLcDsl.g:901:4: ( (lv_vmArgs_43_0= ruleVmArgument ) )
            	    // InternalLcDsl.g:902:5: (lv_vmArgs_43_0= ruleVmArgument )
            	    {
            	    // InternalLcDsl.g:902:5: (lv_vmArgs_43_0= ruleVmArgument )
            	    // InternalLcDsl.g:903:6: lv_vmArgs_43_0= ruleVmArgument
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getVmArgsVmArgumentParserRuleCall_7_3_0());
            	    					
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
            	case 5 :
            	    // InternalLcDsl.g:921:4: ( (lv_progArgs_44_0= ruleProgramArgument ) )
            	    {
            	    // InternalLcDsl.g:921:4: ( (lv_progArgs_44_0= ruleProgramArgument ) )
            	    // InternalLcDsl.g:922:5: (lv_progArgs_44_0= ruleProgramArgument )
            	    {
            	    // InternalLcDsl.g:922:5: (lv_progArgs_44_0= ruleProgramArgument )
            	    // InternalLcDsl.g:923:6: lv_progArgs_44_0= ruleProgramArgument
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getProgArgsProgramArgumentParserRuleCall_7_4_0());
            	    					
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
            	case 6 :
            	    // InternalLcDsl.g:941:4: ( (lv_envVars_45_0= ruleEnvironmentVariable ) )
            	    {
            	    // InternalLcDsl.g:941:4: ( (lv_envVars_45_0= ruleEnvironmentVariable ) )
            	    // InternalLcDsl.g:942:5: (lv_envVars_45_0= ruleEnvironmentVariable )
            	    {
            	    // InternalLcDsl.g:942:5: (lv_envVars_45_0= ruleEnvironmentVariable )
            	    // InternalLcDsl.g:943:6: lv_envVars_45_0= ruleEnvironmentVariable
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getEnvVarsEnvironmentVariableParserRuleCall_7_5_0());
            	    					
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
            	case 7 :
            	    // InternalLcDsl.g:961:4: ( (lv_traces_46_0= ruleTraceEnablement ) )
            	    {
            	    // InternalLcDsl.g:961:4: ( (lv_traces_46_0= ruleTraceEnablement ) )
            	    // InternalLcDsl.g:962:5: (lv_traces_46_0= ruleTraceEnablement )
            	    {
            	    // InternalLcDsl.g:962:5: (lv_traces_46_0= ruleTraceEnablement )
            	    // InternalLcDsl.g:963:6: lv_traces_46_0= ruleTraceEnablement
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getTracesTraceEnablementParserRuleCall_7_6_0());
            	    					
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
            	    break loop5;
                }
            } while (true);

            this_BLOCK_END_47=(Token)match(input,RULE_BLOCK_END,FOLLOW_2); 

            			newLeafNode(this_BLOCK_END_47, grammarAccess.getLaunchConfigAccess().getBLOCK_ENDTerminalRuleCall_8());
            		

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


    // $ANTLR start "entryRuleAddPlugin"
    // InternalLcDsl.g:989:1: entryRuleAddPlugin returns [EObject current=null] : iv_ruleAddPlugin= ruleAddPlugin EOF ;
    public final EObject entryRuleAddPlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPlugin = null;


        try {
            // InternalLcDsl.g:989:50: (iv_ruleAddPlugin= ruleAddPlugin EOF )
            // InternalLcDsl.g:990:2: iv_ruleAddPlugin= ruleAddPlugin EOF
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
    // InternalLcDsl.g:996:1: ruleAddPlugin returns [EObject current=null] : (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' ) ;
    public final EObject ruleAddPlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1002:2: ( (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1003:2: (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1003:2: (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1004:3: otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAddPluginAccess().getPluginKeyword_0());
            		
            // InternalLcDsl.g:1008:3: ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) )
            // InternalLcDsl.g:1009:4: (lv_plugin_1_0= rulePluginWithVersionAndStartLevel )
            {
            // InternalLcDsl.g:1009:4: (lv_plugin_1_0= rulePluginWithVersionAndStartLevel )
            // InternalLcDsl.g:1010:5: lv_plugin_1_0= rulePluginWithVersionAndStartLevel
            {

            					newCompositeNode(grammarAccess.getAddPluginAccess().getPluginPluginWithVersionAndStartLevelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1035:1: entryRuleIgnorePlugin returns [EObject current=null] : iv_ruleIgnorePlugin= ruleIgnorePlugin EOF ;
    public final EObject entryRuleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnorePlugin = null;


        try {
            // InternalLcDsl.g:1035:53: (iv_ruleIgnorePlugin= ruleIgnorePlugin EOF )
            // InternalLcDsl.g:1036:2: iv_ruleIgnorePlugin= ruleIgnorePlugin EOF
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
    // InternalLcDsl.g:1042:1: ruleIgnorePlugin returns [EObject current=null] : (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) ;
    public final EObject ruleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1048:2: ( (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1049:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1049:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1050:3: otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIgnorePluginAccess().getIgnoreKeyword_0());
            		
            // InternalLcDsl.g:1054:3: ( (lv_plugin_1_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:1055:4: (lv_plugin_1_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:1055:4: (lv_plugin_1_0= rulePluginWithVersion )
            // InternalLcDsl.g:1056:5: lv_plugin_1_0= rulePluginWithVersion
            {

            					newCompositeNode(grammarAccess.getIgnorePluginAccess().getPluginPluginWithVersionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1081:1: entryRuleVmArgument returns [EObject current=null] : iv_ruleVmArgument= ruleVmArgument EOF ;
    public final EObject entryRuleVmArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVmArgument = null;


        try {
            // InternalLcDsl.g:1081:51: (iv_ruleVmArgument= ruleVmArgument EOF )
            // InternalLcDsl.g:1082:2: iv_ruleVmArgument= ruleVmArgument EOF
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
    // InternalLcDsl.g:1088:1: ruleVmArgument returns [EObject current=null] : ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' ) ;
    public final EObject ruleVmArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_arguments_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1094:2: ( ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1095:2: ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1095:2: ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1096:3: () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1096:3: ()
            // InternalLcDsl.g:1097:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVmArgumentAccess().getVmArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVmArgumentAccess().getVmArgKeyword_1());
            		
            // InternalLcDsl.g:1107:3: ( (lv_arguments_2_0= RULE_STRING ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLcDsl.g:1108:4: (lv_arguments_2_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:1108:4: (lv_arguments_2_0= RULE_STRING )
            	    // InternalLcDsl.g:1109:5: lv_arguments_2_0= RULE_STRING
            	    {
            	    lv_arguments_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    					newLeafNode(lv_arguments_2_0, grammarAccess.getVmArgumentAccess().getArgumentsSTRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVmArgumentRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"arguments",
            	    						lv_arguments_2_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1133:1: entryRuleProgramArgument returns [EObject current=null] : iv_ruleProgramArgument= ruleProgramArgument EOF ;
    public final EObject entryRuleProgramArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramArgument = null;


        try {
            // InternalLcDsl.g:1133:56: (iv_ruleProgramArgument= ruleProgramArgument EOF )
            // InternalLcDsl.g:1134:2: iv_ruleProgramArgument= ruleProgramArgument EOF
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
    // InternalLcDsl.g:1140:1: ruleProgramArgument returns [EObject current=null] : ( () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' ) ;
    public final EObject ruleProgramArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_arguments_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1146:2: ( ( () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1147:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1147:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1148:3: () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1148:3: ()
            // InternalLcDsl.g:1149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramArgumentAccess().getProgramArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramArgumentAccess().getArgumentKeyword_1());
            		
            // InternalLcDsl.g:1159:3: ( (lv_arguments_2_0= RULE_STRING ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLcDsl.g:1160:4: (lv_arguments_2_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:1160:4: (lv_arguments_2_0= RULE_STRING )
            	    // InternalLcDsl.g:1161:5: lv_arguments_2_0= RULE_STRING
            	    {
            	    lv_arguments_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    					newLeafNode(lv_arguments_2_0, grammarAccess.getProgramArgumentAccess().getArgumentsSTRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getProgramArgumentRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"arguments",
            	    						lv_arguments_2_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1185:1: entryRuleEnvironmentVariable returns [EObject current=null] : iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF ;
    public final EObject entryRuleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariable = null;


        try {
            // InternalLcDsl.g:1185:60: (iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF )
            // InternalLcDsl.g:1186:2: iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF
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
    // InternalLcDsl.g:1192:1: ruleEnvironmentVariable returns [EObject current=null] : ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ) ;
    public final EObject ruleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_EQ_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1198:2: ( ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:1199:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:1199:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' )
            // InternalLcDsl.g:1200:3: () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:1200:3: ()
            // InternalLcDsl.g:1201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentVariableAccess().getEnvironmentVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentVariableAccess().getEnvironmentKeyword_1());
            		
            // InternalLcDsl.g:1211:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLcDsl.g:1212:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLcDsl.g:1212:4: (lv_name_2_0= RULE_ID )
            // InternalLcDsl.g:1213:5: lv_name_2_0= RULE_ID
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
            		
            // InternalLcDsl.g:1233:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalLcDsl.g:1234:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalLcDsl.g:1234:4: (lv_value_4_0= RULE_STRING )
            // InternalLcDsl.g:1235:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_value_4_0, grammarAccess.getEnvironmentVariableAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1259:1: entryRuleApplicationExtPoint returns [EObject current=null] : iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF ;
    public final EObject entryRuleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationExtPoint = null;


        try {
            // InternalLcDsl.g:1259:60: (iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF )
            // InternalLcDsl.g:1260:2: iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF
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
    // InternalLcDsl.g:1266:1: ruleApplicationExtPoint returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1272:2: ( (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1273:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1273:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1274:3: otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationExtPointAccess().getApplicationKeyword_0());
            		
            // InternalLcDsl.g:1278:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1279:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1279:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1280:5: lv_name_1_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getApplicationExtPointAccess().getNameFQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1305:1: entryRuleProductExtPoint returns [EObject current=null] : iv_ruleProductExtPoint= ruleProductExtPoint EOF ;
    public final EObject entryRuleProductExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductExtPoint = null;


        try {
            // InternalLcDsl.g:1305:56: (iv_ruleProductExtPoint= ruleProductExtPoint EOF )
            // InternalLcDsl.g:1306:2: iv_ruleProductExtPoint= ruleProductExtPoint EOF
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
    // InternalLcDsl.g:1312:1: ruleProductExtPoint returns [EObject current=null] : (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleProductExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1318:2: ( (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1319:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1319:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1320:3: otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProductExtPointAccess().getProductKeyword_0());
            		
            // InternalLcDsl.g:1324:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1325:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1325:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1326:5: lv_name_1_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getProductExtPointAccess().getNameFQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1351:1: entryRuleFavorites returns [EObject current=null] : iv_ruleFavorites= ruleFavorites EOF ;
    public final EObject entryRuleFavorites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFavorites = null;


        try {
            // InternalLcDsl.g:1351:50: (iv_ruleFavorites= ruleFavorites EOF )
            // InternalLcDsl.g:1352:2: iv_ruleFavorites= ruleFavorites EOF
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
    // InternalLcDsl.g:1358:1: ruleFavorites returns [EObject current=null] : ( () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleFavorites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_run_3_0=null;
        Token lv_debug_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1364:2: ( ( () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:1365:2: ( () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:1365:2: ( () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            // InternalLcDsl.g:1366:3: () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:1366:3: ()
            // InternalLcDsl.g:1367:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFavoritesAccess().getFavoritesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFavoritesAccess().getFavoriteKeyword_1());
            		
            // InternalLcDsl.g:1377:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1378:4: ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1378:4: ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1379:5: ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFavoritesAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1382:5: ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* )
            // InternalLcDsl.g:1383:6: ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1383:6: ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLcDsl.g:1384:4: ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1384:4: ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) )
            	    // InternalLcDsl.g:1385:5: {...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFavorites", "getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1385:106: ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) )
            	    // InternalLcDsl.g:1386:6: ({...}? => ( (lv_run_3_0= 'run' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1389:9: ({...}? => ( (lv_run_3_0= 'run' ) ) )
            	    // InternalLcDsl.g:1389:10: {...}? => ( (lv_run_3_0= 'run' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFavorites", "true");
            	    }
            	    // InternalLcDsl.g:1389:19: ( (lv_run_3_0= 'run' ) )
            	    // InternalLcDsl.g:1389:20: (lv_run_3_0= 'run' )
            	    {
            	    // InternalLcDsl.g:1389:20: (lv_run_3_0= 'run' )
            	    // InternalLcDsl.g:1390:10: lv_run_3_0= 'run'
            	    {
            	    lv_run_3_0=(Token)match(input,40,FOLLOW_15); 

            	    										newLeafNode(lv_run_3_0, grammarAccess.getFavoritesAccess().getRunRunKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getFavoritesRule());
            	    										}
            	    										setWithLastConsumed(current, "run", true, "run");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFavoritesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:1407:4: ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1407:4: ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) )
            	    // InternalLcDsl.g:1408:5: {...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFavorites", "getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:1408:106: ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) )
            	    // InternalLcDsl.g:1409:6: ({...}? => ( (lv_debug_4_0= 'debug' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:1412:9: ({...}? => ( (lv_debug_4_0= 'debug' ) ) )
            	    // InternalLcDsl.g:1412:10: {...}? => ( (lv_debug_4_0= 'debug' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFavorites", "true");
            	    }
            	    // InternalLcDsl.g:1412:19: ( (lv_debug_4_0= 'debug' ) )
            	    // InternalLcDsl.g:1412:20: (lv_debug_4_0= 'debug' )
            	    {
            	    // InternalLcDsl.g:1412:20: (lv_debug_4_0= 'debug' )
            	    // InternalLcDsl.g:1413:10: lv_debug_4_0= 'debug'
            	    {
            	    lv_debug_4_0=(Token)match(input,41,FOLLOW_15); 

            	    										newLeafNode(lv_debug_4_0, grammarAccess.getFavoritesAccess().getDebugDebugKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getFavoritesRule());
            	    										}
            	    										setWithLastConsumed(current, "debug", true, "debug");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFavoritesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFavoritesAccess().getUnorderedGroup_2());
            				

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFavoritesAccess().getSemicolonKeyword_3());
            		

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
    // InternalLcDsl.g:1445:1: entryRuleRedirect returns [EObject current=null] : iv_ruleRedirect= ruleRedirect EOF ;
    public final EObject entryRuleRedirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirect = null;


        try {
            // InternalLcDsl.g:1445:49: (iv_ruleRedirect= ruleRedirect EOF )
            // InternalLcDsl.g:1446:2: iv_ruleRedirect= ruleRedirect EOF
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
    // InternalLcDsl.g:1452:1: ruleRedirect returns [EObject current=null] : ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' ) ;
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
            // InternalLcDsl.g:1458:2: ( ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' ) )
            // InternalLcDsl.g:1459:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' )
            {
            // InternalLcDsl.g:1459:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' )
            // InternalLcDsl.g:1460:3: () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';'
            {
            // InternalLcDsl.g:1460:3: ()
            // InternalLcDsl.g:1461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRedirectAccess().getRedirectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRedirectAccess().getRedirectKeyword_1());
            		
            // InternalLcDsl.g:1471:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1472:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1472:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1473:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1476:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* )
            // InternalLcDsl.g:1477:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1477:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )*
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
            	    // InternalLcDsl.g:1478:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1478:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) )
            	    // InternalLcDsl.g:1479:5: {...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1479:105: ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) )
            	    // InternalLcDsl.g:1480:6: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1483:9: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) )
            	    // InternalLcDsl.g:1483:10: {...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:1483:19: ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) )
            	    // InternalLcDsl.g:1483:20: ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) )
            	    {
            	    // InternalLcDsl.g:1483:20: ( (lv_outWhich_3_0= ruleOutputStream ) )
            	    // InternalLcDsl.g:1484:10: (lv_outWhich_3_0= ruleOutputStream )
            	    {
            	    // InternalLcDsl.g:1484:10: (lv_outWhich_3_0= ruleOutputStream )
            	    // InternalLcDsl.g:1485:11: lv_outWhich_3_0= ruleOutputStream
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

            	    otherlv_4=(Token)match(input,43,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getRedirectAccess().getToKeyword_2_0_1());
            	    								
            	    // InternalLcDsl.g:1506:9: ( (lv_outFile_5_0= ruleAnyPath ) )
            	    // InternalLcDsl.g:1507:10: (lv_outFile_5_0= ruleAnyPath )
            	    {
            	    // InternalLcDsl.g:1507:10: (lv_outFile_5_0= ruleAnyPath )
            	    // InternalLcDsl.g:1508:11: lv_outFile_5_0= ruleAnyPath
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
            	    // InternalLcDsl.g:1531:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1531:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) )
            	    // InternalLcDsl.g:1532:5: {...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:1532:105: ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) )
            	    // InternalLcDsl.g:1533:6: ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:1536:9: ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) )
            	    // InternalLcDsl.g:1536:10: {...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:1536:19: ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) )
            	    // InternalLcDsl.g:1536:20: ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) )
            	    {
            	    // InternalLcDsl.g:1536:20: ( (lv_inWhich_6_0= ruleInputStream ) )
            	    // InternalLcDsl.g:1537:10: (lv_inWhich_6_0= ruleInputStream )
            	    {
            	    // InternalLcDsl.g:1537:10: (lv_inWhich_6_0= ruleInputStream )
            	    // InternalLcDsl.g:1538:11: lv_inWhich_6_0= ruleInputStream
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

            	    otherlv_7=(Token)match(input,44,FOLLOW_11); 

            	    									newLeafNode(otherlv_7, grammarAccess.getRedirectAccess().getFromKeyword_2_1_1());
            	    								
            	    // InternalLcDsl.g:1559:9: ( (lv_inFile_8_0= ruleExistingPath ) )
            	    // InternalLcDsl.g:1560:10: (lv_inFile_8_0= ruleExistingPath )
            	    {
            	    // InternalLcDsl.g:1560:10: (lv_inFile_8_0= ruleExistingPath )
            	    // InternalLcDsl.g:1561:11: lv_inFile_8_0= ruleExistingPath
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

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1599:1: entryRuleExecutionEnvironment returns [EObject current=null] : iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF ;
    public final EObject entryRuleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionEnvironment = null;


        try {
            // InternalLcDsl.g:1599:61: (iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF )
            // InternalLcDsl.g:1600:2: iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF
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
    // InternalLcDsl.g:1606:1: ruleExecutionEnvironment returns [EObject current=null] : (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1612:2: ( (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1613:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1613:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1614:3: otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExecutionEnvironmentAccess().getExecutionEnvironmentKeyword_0());
            		
            // InternalLcDsl.g:1618:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLcDsl.g:1619:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLcDsl.g:1619:4: (lv_name_1_0= RULE_ID )
            // InternalLcDsl.g:1620:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1644:1: entryRuleConfigIniTemplate returns [EObject current=null] : iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF ;
    public final EObject entryRuleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigIniTemplate = null;


        try {
            // InternalLcDsl.g:1644:58: (iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF )
            // InternalLcDsl.g:1645:2: iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF
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
    // InternalLcDsl.g:1651:1: ruleConfigIniTemplate returns [EObject current=null] : (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1657:2: ( (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1658:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1658:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1659:3: otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigIniTemplateAccess().getConfigIniTemplateKeyword_0());
            		
            // InternalLcDsl.g:1663:3: ( (lv_path_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:1664:4: (lv_path_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:1664:4: (lv_path_1_0= ruleExistingPath )
            // InternalLcDsl.g:1665:5: lv_path_1_0= ruleExistingPath
            {

            					newCompositeNode(grammarAccess.getConfigIniTemplateAccess().getPathExistingPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1690:1: entryRuleTraceEnablement returns [EObject current=null] : iv_ruleTraceEnablement= ruleTraceEnablement EOF ;
    public final EObject entryRuleTraceEnablement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceEnablement = null;


        try {
            // InternalLcDsl.g:1690:56: (iv_ruleTraceEnablement= ruleTraceEnablement EOF )
            // InternalLcDsl.g:1691:2: iv_ruleTraceEnablement= ruleTraceEnablement EOF
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
    // InternalLcDsl.g:1697:1: ruleTraceEnablement returns [EObject current=null] : (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' ) ;
    public final EObject ruleTraceEnablement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_what_2_0=null;
        Token otherlv_3=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1703:2: ( (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1704:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1704:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1705:3: otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceEnablementAccess().getTraceKeyword_0());
            		
            // InternalLcDsl.g:1709:3: ( (lv_plugin_1_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:1710:4: (lv_plugin_1_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:1710:4: (lv_plugin_1_0= rulePluginWithVersion )
            // InternalLcDsl.g:1711:5: lv_plugin_1_0= rulePluginWithVersion
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

            // InternalLcDsl.g:1728:3: ( (lv_what_2_0= RULE_ID ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLcDsl.g:1729:4: (lv_what_2_0= RULE_ID )
            	    {
            	    // InternalLcDsl.g:1729:4: (lv_what_2_0= RULE_ID )
            	    // InternalLcDsl.g:1730:5: lv_what_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1754:1: entryRuleJavaMainSearch returns [EObject current=null] : iv_ruleJavaMainSearch= ruleJavaMainSearch EOF ;
    public final EObject entryRuleJavaMainSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaMainSearch = null;


        try {
            // InternalLcDsl.g:1754:55: (iv_ruleJavaMainSearch= ruleJavaMainSearch EOF )
            // InternalLcDsl.g:1755:2: iv_ruleJavaMainSearch= ruleJavaMainSearch EOF
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
    // InternalLcDsl.g:1761:1: ruleJavaMainSearch returns [EObject current=null] : ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleJavaMainSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_system_3_0=null;
        Token lv_inherited_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1767:2: ( ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:1768:2: ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:1768:2: ( () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            // InternalLcDsl.g:1769:3: () otherlv_1= 'search-main' ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:1769:3: ()
            // InternalLcDsl.g:1770:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaMainSearchAccess().getJavaMainSearchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaMainSearchAccess().getSearchMainKeyword_1());
            		
            // InternalLcDsl.g:1780:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1781:4: ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1781:4: ( ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1782:5: ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1785:5: ( ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )* )
            // InternalLcDsl.g:1786:6: ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1786:6: ( ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLcDsl.g:1787:4: ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1787:4: ({...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) ) )
            	    // InternalLcDsl.g:1788:5: {...}? => ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1788:111: ( ({...}? => ( (lv_system_3_0= 'system' ) ) ) )
            	    // InternalLcDsl.g:1789:6: ({...}? => ( (lv_system_3_0= 'system' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1792:9: ({...}? => ( (lv_system_3_0= 'system' ) ) )
            	    // InternalLcDsl.g:1792:10: {...}? => ( (lv_system_3_0= 'system' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "true");
            	    }
            	    // InternalLcDsl.g:1792:19: ( (lv_system_3_0= 'system' ) )
            	    // InternalLcDsl.g:1792:20: (lv_system_3_0= 'system' )
            	    {
            	    // InternalLcDsl.g:1792:20: (lv_system_3_0= 'system' )
            	    // InternalLcDsl.g:1793:10: lv_system_3_0= 'system'
            	    {
            	    lv_system_3_0=(Token)match(input,49,FOLLOW_20); 

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
            	    // InternalLcDsl.g:1810:4: ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1810:4: ({...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) ) )
            	    // InternalLcDsl.g:1811:5: {...}? => ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:1811:111: ( ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) ) )
            	    // InternalLcDsl.g:1812:6: ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaMainSearchAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:1815:9: ({...}? => ( (lv_inherited_4_0= 'inherited' ) ) )
            	    // InternalLcDsl.g:1815:10: {...}? => ( (lv_inherited_4_0= 'inherited' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaMainSearch", "true");
            	    }
            	    // InternalLcDsl.g:1815:19: ( (lv_inherited_4_0= 'inherited' ) )
            	    // InternalLcDsl.g:1815:20: (lv_inherited_4_0= 'inherited' )
            	    {
            	    // InternalLcDsl.g:1815:20: (lv_inherited_4_0= 'inherited' )
            	    // InternalLcDsl.g:1816:10: lv_inherited_4_0= 'inherited'
            	    {
            	    lv_inherited_4_0=(Token)match(input,50,FOLLOW_20); 

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

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:1848:1: entryRuleRapServletConfig returns [EObject current=null] : iv_ruleRapServletConfig= ruleRapServletConfig EOF ;
    public final EObject entryRuleRapServletConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRapServletConfig = null;


        try {
            // InternalLcDsl.g:1848:57: (iv_ruleRapServletConfig= ruleRapServletConfig EOF )
            // InternalLcDsl.g:1849:2: iv_ruleRapServletConfig= ruleRapServletConfig EOF
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
    // InternalLcDsl.g:1855:1: ruleRapServletConfig returns [EObject current=null] : (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END ) ;
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
            // InternalLcDsl.g:1861:2: ( (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END ) )
            // InternalLcDsl.g:1862:2: (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END )
            {
            // InternalLcDsl.g:1862:2: (otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END )
            // InternalLcDsl.g:1863:3: otherlv_0= 'servlet' this_BLOCK_BEGIN_1= RULE_BLOCK_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) this_BLOCK_END_21= RULE_BLOCK_END
            {
            otherlv_0=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRapServletConfigAccess().getServletKeyword_0());
            		
            this_BLOCK_BEGIN_1=(Token)match(input,RULE_BLOCK_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BLOCK_BEGIN_1, grammarAccess.getRapServletConfigAccess().getBLOCK_BEGINTerminalRuleCall_1());
            		
            // InternalLcDsl.g:1871:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // InternalLcDsl.g:1872:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalLcDsl.g:1872:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // InternalLcDsl.g:1873:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1876:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            // InternalLcDsl.g:1877:6: ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // InternalLcDsl.g:1877:6: ( ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=7;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3) ) {
                    alt12=4;
                }
                else if ( LA12_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4) ) {
                    alt12=5;
                }
                else if ( LA12_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5) ) {
                    alt12=6;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLcDsl.g:1878:4: ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:1878:4: ({...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    // InternalLcDsl.g:1879:5: {...}? => ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1879:113: ( ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    // InternalLcDsl.g:1880:6: ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1883:9: ({...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    // InternalLcDsl.g:1883:10: {...}? => (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:1883:19: (otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    // InternalLcDsl.g:1883:20: otherlv_3= 'path' ( (lv_servletPath_4_0= RULE_STRING ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,52,FOLLOW_11); 

            	    									newLeafNode(otherlv_3, grammarAccess.getRapServletConfigAccess().getPathKeyword_2_0_0());
            	    								
            	    // InternalLcDsl.g:1887:9: ( (lv_servletPath_4_0= RULE_STRING ) )
            	    // InternalLcDsl.g:1888:10: (lv_servletPath_4_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:1888:10: (lv_servletPath_4_0= RULE_STRING )
            	    // InternalLcDsl.g:1889:11: lv_servletPath_4_0= RULE_STRING
            	    {
            	    lv_servletPath_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            	    otherlv_5=(Token)match(input,27,FOLLOW_22); 

            	    									newLeafNode(otherlv_5, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:1915:4: ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:1915:4: ({...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) ) )
            	    // InternalLcDsl.g:1916:5: {...}? => ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:1916:113: ( ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) ) )
            	    // InternalLcDsl.g:1917:6: ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:1920:9: ({...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' ) )
            	    // InternalLcDsl.g:1920:10: {...}? => (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:1920:19: (otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';' )
            	    // InternalLcDsl.g:1920:20: otherlv_6= 'open' ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) ) otherlv_8= ';'
            	    {
            	    otherlv_6=(Token)match(input,53,FOLLOW_23); 

            	    									newLeafNode(otherlv_6, grammarAccess.getRapServletConfigAccess().getOpenKeyword_2_1_0());
            	    								
            	    // InternalLcDsl.g:1924:9: ( (lv_browserMode_7_0= ruleBrowserLaunchMode ) )
            	    // InternalLcDsl.g:1925:10: (lv_browserMode_7_0= ruleBrowserLaunchMode )
            	    {
            	    // InternalLcDsl.g:1925:10: (lv_browserMode_7_0= ruleBrowserLaunchMode )
            	    // InternalLcDsl.g:1926:11: lv_browserMode_7_0= ruleBrowserLaunchMode
            	    {

            	    											newCompositeNode(grammarAccess.getRapServletConfigAccess().getBrowserModeBrowserLaunchModeEnumRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
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

            	    otherlv_8=(Token)match(input,27,FOLLOW_22); 

            	    									newLeafNode(otherlv_8, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:1953:4: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:1953:4: ({...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // InternalLcDsl.g:1954:5: {...}? => ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLcDsl.g:1954:113: ( ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // InternalLcDsl.g:1955:6: ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLcDsl.g:1958:9: ({...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // InternalLcDsl.g:1958:10: {...}? => (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:1958:19: (otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // InternalLcDsl.g:1958:20: otherlv_9= 'port' ( (lv_serverPort_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_9=(Token)match(input,54,FOLLOW_24); 

            	    									newLeafNode(otherlv_9, grammarAccess.getRapServletConfigAccess().getPortKeyword_2_2_0());
            	    								
            	    // InternalLcDsl.g:1962:9: ( (lv_serverPort_10_0= RULE_INT ) )
            	    // InternalLcDsl.g:1963:10: (lv_serverPort_10_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:1963:10: (lv_serverPort_10_0= RULE_INT )
            	    // InternalLcDsl.g:1964:11: lv_serverPort_10_0= RULE_INT
            	    {
            	    lv_serverPort_10_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            	    otherlv_11=(Token)match(input,27,FOLLOW_22); 

            	    									newLeafNode(otherlv_11, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:1990:4: ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:1990:4: ({...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    // InternalLcDsl.g:1991:5: {...}? => ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalLcDsl.g:1991:113: ( ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    // InternalLcDsl.g:1992:6: ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalLcDsl.g:1995:9: ({...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    // InternalLcDsl.g:1995:10: {...}? => (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:1995:19: (otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    // InternalLcDsl.g:1995:20: otherlv_12= 'session-timeout' ( (lv_sessionTimeout_13_0= RULE_INT ) ) otherlv_14= ';'
            	    {
            	    otherlv_12=(Token)match(input,55,FOLLOW_24); 

            	    									newLeafNode(otherlv_12, grammarAccess.getRapServletConfigAccess().getSessionTimeoutKeyword_2_3_0());
            	    								
            	    // InternalLcDsl.g:1999:9: ( (lv_sessionTimeout_13_0= RULE_INT ) )
            	    // InternalLcDsl.g:2000:10: (lv_sessionTimeout_13_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2000:10: (lv_sessionTimeout_13_0= RULE_INT )
            	    // InternalLcDsl.g:2001:11: lv_sessionTimeout_13_0= RULE_INT
            	    {
            	    lv_sessionTimeout_13_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            	    otherlv_14=(Token)match(input,27,FOLLOW_22); 

            	    									newLeafNode(otherlv_14, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:2027:4: ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2027:4: ({...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
            	    // InternalLcDsl.g:2028:5: {...}? => ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalLcDsl.g:2028:113: ( ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
            	    // InternalLcDsl.g:2029:6: ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalLcDsl.g:2032:9: ({...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
            	    // InternalLcDsl.g:2032:10: {...}? => (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2032:19: (otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    // InternalLcDsl.g:2032:20: otherlv_15= 'context-path' ( (lv_contextPath_16_0= RULE_STRING ) ) otherlv_17= ';'
            	    {
            	    otherlv_15=(Token)match(input,56,FOLLOW_11); 

            	    									newLeafNode(otherlv_15, grammarAccess.getRapServletConfigAccess().getContextPathKeyword_2_4_0());
            	    								
            	    // InternalLcDsl.g:2036:9: ( (lv_contextPath_16_0= RULE_STRING ) )
            	    // InternalLcDsl.g:2037:10: (lv_contextPath_16_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:2037:10: (lv_contextPath_16_0= RULE_STRING )
            	    // InternalLcDsl.g:2038:11: lv_contextPath_16_0= RULE_STRING
            	    {
            	    lv_contextPath_16_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            	    otherlv_17=(Token)match(input,27,FOLLOW_22); 

            	    									newLeafNode(otherlv_17, grammarAccess.getRapServletConfigAccess().getSemicolonKeyword_2_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:2064:4: ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:2064:4: ({...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) ) )
            	    // InternalLcDsl.g:2065:5: {...}? => ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalLcDsl.g:2065:113: ( ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) ) )
            	    // InternalLcDsl.g:2066:6: ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRapServletConfigAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalLcDsl.g:2069:9: ({...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' ) )
            	    // InternalLcDsl.g:2069:10: {...}? => (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRapServletConfig", "true");
            	    }
            	    // InternalLcDsl.g:2069:19: (otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';' )
            	    // InternalLcDsl.g:2069:20: otherlv_18= 'dev-mode' ( (lv_devMode_19_0= RULE_BOOLEAN ) ) otherlv_20= ';'
            	    {
            	    otherlv_18=(Token)match(input,57,FOLLOW_25); 

            	    									newLeafNode(otherlv_18, grammarAccess.getRapServletConfigAccess().getDevModeKeyword_2_5_0());
            	    								
            	    // InternalLcDsl.g:2073:9: ( (lv_devMode_19_0= RULE_BOOLEAN ) )
            	    // InternalLcDsl.g:2074:10: (lv_devMode_19_0= RULE_BOOLEAN )
            	    {
            	    // InternalLcDsl.g:2074:10: (lv_devMode_19_0= RULE_BOOLEAN )
            	    // InternalLcDsl.g:2075:11: lv_devMode_19_0= RULE_BOOLEAN
            	    {
            	    lv_devMode_19_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_10); 

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

            	    otherlv_20=(Token)match(input,27,FOLLOW_22); 

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
    // InternalLcDsl.g:2117:1: entryRuleExistingPath returns [EObject current=null] : iv_ruleExistingPath= ruleExistingPath EOF ;
    public final EObject entryRuleExistingPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingPath = null;


        try {
            // InternalLcDsl.g:2117:53: (iv_ruleExistingPath= ruleExistingPath EOF )
            // InternalLcDsl.g:2118:2: iv_ruleExistingPath= ruleExistingPath EOF
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
    // InternalLcDsl.g:2124:1: ruleExistingPath returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleExistingPath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2130:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalLcDsl.g:2131:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalLcDsl.g:2131:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalLcDsl.g:2132:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalLcDsl.g:2132:3: (lv_name_0_0= RULE_STRING )
            // InternalLcDsl.g:2133:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExistingPathAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExistingPathRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleExistingPath"


    // $ANTLR start "entryRuleAnyPath"
    // InternalLcDsl.g:2152:1: entryRuleAnyPath returns [EObject current=null] : iv_ruleAnyPath= ruleAnyPath EOF ;
    public final EObject entryRuleAnyPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyPath = null;


        try {
            // InternalLcDsl.g:2152:48: (iv_ruleAnyPath= ruleAnyPath EOF )
            // InternalLcDsl.g:2153:2: iv_ruleAnyPath= ruleAnyPath EOF
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
    // InternalLcDsl.g:2159:1: ruleAnyPath returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleAnyPath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2165:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalLcDsl.g:2166:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalLcDsl.g:2166:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalLcDsl.g:2167:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalLcDsl.g:2167:3: (lv_name_0_0= RULE_STRING )
            // InternalLcDsl.g:2168:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAnyPathAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAnyPathRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleAnyPath"


    // $ANTLR start "entryRulePluginWithVersionAndStartLevel"
    // InternalLcDsl.g:2187:1: entryRulePluginWithVersionAndStartLevel returns [EObject current=null] : iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF ;
    public final EObject entryRulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersionAndStartLevel = null;


        try {
            // InternalLcDsl.g:2187:71: (iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF )
            // InternalLcDsl.g:2188:2: iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF
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
    // InternalLcDsl.g:2194:1: rulePluginWithVersionAndStartLevel returns [EObject current=null] : ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject rulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        Token lv_autoStart_2_0=null;
        Token otherlv_3=null;
        Token lv_startLevel_4_0=null;
        EObject lv_plugin_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2200:2: ( ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalLcDsl.g:2201:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalLcDsl.g:2201:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalLcDsl.g:2202:3: ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            // InternalLcDsl.g:2202:3: ( (lv_plugin_0_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:2203:4: (lv_plugin_0_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:2203:4: (lv_plugin_0_0= rulePluginWithVersion )
            // InternalLcDsl.g:2204:5: lv_plugin_0_0= rulePluginWithVersion
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

            // InternalLcDsl.g:2221:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2222:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2222:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2223:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            				
            // InternalLcDsl.g:2226:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalLcDsl.g:2227:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2227:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLcDsl.g:2228:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2228:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    // InternalLcDsl.g:2229:5: {...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalLcDsl.g:2229:127: ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    // InternalLcDsl.g:2230:6: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalLcDsl.g:2233:9: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    // InternalLcDsl.g:2233:10: {...}? => ( (lv_autoStart_2_0= 'autostart' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:2233:19: ( (lv_autoStart_2_0= 'autostart' ) )
            	    // InternalLcDsl.g:2233:20: (lv_autoStart_2_0= 'autostart' )
            	    {
            	    // InternalLcDsl.g:2233:20: (lv_autoStart_2_0= 'autostart' )
            	    // InternalLcDsl.g:2234:10: lv_autoStart_2_0= 'autostart'
            	    {
            	    lv_autoStart_2_0=(Token)match(input,58,FOLLOW_26); 

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
            	    // InternalLcDsl.g:2251:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2251:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalLcDsl.g:2252:5: {...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalLcDsl.g:2252:127: ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    // InternalLcDsl.g:2253:6: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalLcDsl.g:2256:9: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    // InternalLcDsl.g:2256:10: {...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:2256:19: (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    // InternalLcDsl.g:2256:20: otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,59,FOLLOW_24); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartlevelKeyword_1_1_0());
            	    								
            	    // InternalLcDsl.g:2260:9: ( (lv_startLevel_4_0= RULE_INT ) )
            	    // InternalLcDsl.g:2261:10: (lv_startLevel_4_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2261:10: (lv_startLevel_4_0= RULE_INT )
            	    // InternalLcDsl.g:2262:11: lv_startLevel_4_0= RULE_INT
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
    // InternalLcDsl.g:2295:1: entryRulePluginWithVersion returns [EObject current=null] : iv_rulePluginWithVersion= rulePluginWithVersion EOF ;
    public final EObject entryRulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersion = null;


        try {
            // InternalLcDsl.g:2295:58: (iv_rulePluginWithVersion= rulePluginWithVersion EOF )
            // InternalLcDsl.g:2296:2: iv_rulePluginWithVersion= rulePluginWithVersion EOF
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
    // InternalLcDsl.g:2302:1: rulePluginWithVersion returns [EObject current=null] : ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) ;
    public final EObject rulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2308:2: ( ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? ) )
            // InternalLcDsl.g:2309:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            {
            // InternalLcDsl.g:2309:2: ( ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )? )
            // InternalLcDsl.g:2310:3: ( (lv_name_0_0= ruleFQName ) ) ( (lv_version_1_0= RULE_VERSION ) )?
            {
            // InternalLcDsl.g:2310:3: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2311:4: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2311:4: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2312:5: lv_name_0_0= ruleFQName
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

            // InternalLcDsl.g:2329:3: ( (lv_version_1_0= RULE_VERSION ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_VERSION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLcDsl.g:2330:4: (lv_version_1_0= RULE_VERSION )
                    {
                    // InternalLcDsl.g:2330:4: (lv_version_1_0= RULE_VERSION )
                    // InternalLcDsl.g:2331:5: lv_version_1_0= RULE_VERSION
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
    // InternalLcDsl.g:2351:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalLcDsl.g:2351:48: (iv_ruleProject= ruleProject EOF )
            // InternalLcDsl.g:2352:2: iv_ruleProject= ruleProject EOF
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
    // InternalLcDsl.g:2358:1: ruleProject returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2364:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:2365:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:2365:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2366:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2366:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2367:4: lv_name_0_0= ruleFQName
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


    // $ANTLR start "entryRuleJavaType"
    // InternalLcDsl.g:2387:1: entryRuleJavaType returns [EObject current=null] : iv_ruleJavaType= ruleJavaType EOF ;
    public final EObject entryRuleJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaType = null;


        try {
            // InternalLcDsl.g:2387:49: (iv_ruleJavaType= ruleJavaType EOF )
            // InternalLcDsl.g:2388:2: iv_ruleJavaType= ruleJavaType EOF
            {
             newCompositeNode(grammarAccess.getJavaTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaType=ruleJavaType();

            state._fsp--;

             current =iv_ruleJavaType; 
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
    // $ANTLR end "entryRuleJavaType"


    // $ANTLR start "ruleJavaType"
    // InternalLcDsl.g:2394:1: ruleJavaType returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleJavaType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2400:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:2401:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:2401:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:2402:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:2402:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:2403:4: lv_name_0_0= ruleFQName
            {

            				newCompositeNode(grammarAccess.getJavaTypeAccess().getNameFQNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleFQName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJavaTypeRule());
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
    // $ANTLR end "ruleJavaType"


    // $ANTLR start "entryRuleClearOption"
    // InternalLcDsl.g:2423:1: entryRuleClearOption returns [EObject current=null] : iv_ruleClearOption= ruleClearOption EOF ;
    public final EObject entryRuleClearOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearOption = null;


        try {
            // InternalLcDsl.g:2423:52: (iv_ruleClearOption= ruleClearOption EOF )
            // InternalLcDsl.g:2424:2: iv_ruleClearOption= ruleClearOption EOF
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
    // InternalLcDsl.g:2430:1: ruleClearOption returns [EObject current=null] : ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleClearOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_workspace_3_0=null;
        Token lv_log_4_0=null;
        Token lv_noAskClear_5_0=null;
        Token lv_config_6_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2436:2: ( ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) ) )
            // InternalLcDsl.g:2437:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) )
            {
            // InternalLcDsl.g:2437:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) )
            // InternalLcDsl.g:2438:3: () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) )
            {
            // InternalLcDsl.g:2438:3: ()
            // InternalLcDsl.g:2439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearOptionAccess().getClearOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getClearOptionAccess().getClearKeyword_1());
            		
            // InternalLcDsl.g:2449:3: ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2450:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2450:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2451:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2454:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            // InternalLcDsl.g:2455:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2455:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( ( LA17_0 == 28 || LA17_0 == 61 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLcDsl.g:2456:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    {
            	    // InternalLcDsl.g:2456:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    // InternalLcDsl.g:2457:5: {...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2457:108: ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    // InternalLcDsl.g:2458:6: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2461:9: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    // InternalLcDsl.g:2461:10: {...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:2461:19: ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    // InternalLcDsl.g:2461:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )?
            	    {
            	    // InternalLcDsl.g:2461:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==28) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==61) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalLcDsl.g:2462:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            {
            	            // InternalLcDsl.g:2462:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            // InternalLcDsl.g:2463:11: (lv_workspace_3_0= 'workspace' )
            	            {
            	            // InternalLcDsl.g:2463:11: (lv_workspace_3_0= 'workspace' )
            	            // InternalLcDsl.g:2464:12: lv_workspace_3_0= 'workspace'
            	            {
            	            lv_workspace_3_0=(Token)match(input,28,FOLLOW_29); 

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
            	            // InternalLcDsl.g:2477:10: ( (lv_log_4_0= 'log' ) )
            	            {
            	            // InternalLcDsl.g:2477:10: ( (lv_log_4_0= 'log' ) )
            	            // InternalLcDsl.g:2478:11: (lv_log_4_0= 'log' )
            	            {
            	            // InternalLcDsl.g:2478:11: (lv_log_4_0= 'log' )
            	            // InternalLcDsl.g:2479:12: lv_log_4_0= 'log'
            	            {
            	            lv_log_4_0=(Token)match(input,61,FOLLOW_29); 

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

            	    // InternalLcDsl.g:2492:9: ( (lv_noAskClear_5_0= '!' ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==62) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalLcDsl.g:2493:10: (lv_noAskClear_5_0= '!' )
            	            {
            	            // InternalLcDsl.g:2493:10: (lv_noAskClear_5_0= '!' )
            	            // InternalLcDsl.g:2494:11: lv_noAskClear_5_0= '!'
            	            {
            	            lv_noAskClear_5_0=(Token)match(input,62,FOLLOW_28); 

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
            	    // InternalLcDsl.g:2512:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2512:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    // InternalLcDsl.g:2513:5: {...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2513:108: ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    // InternalLcDsl.g:2514:6: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2517:9: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    // InternalLcDsl.g:2517:10: {...}? => ( (lv_config_6_0= 'config' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:2517:19: ( (lv_config_6_0= 'config' ) )
            	    // InternalLcDsl.g:2517:20: (lv_config_6_0= 'config' )
            	    {
            	    // InternalLcDsl.g:2517:20: (lv_config_6_0= 'config' )
            	    // InternalLcDsl.g:2518:10: lv_config_6_0= 'config'
            	    {
            	    lv_config_6_0=(Token)match(input,63,FOLLOW_28); 

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
    // InternalLcDsl.g:2546:1: entryRuleMemoryOption returns [EObject current=null] : iv_ruleMemoryOption= ruleMemoryOption EOF ;
    public final EObject entryRuleMemoryOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryOption = null;


        try {
            // InternalLcDsl.g:2546:53: (iv_ruleMemoryOption= ruleMemoryOption EOF )
            // InternalLcDsl.g:2547:2: iv_ruleMemoryOption= ruleMemoryOption EOF
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
    // InternalLcDsl.g:2553:1: ruleMemoryOption returns [EObject current=null] : ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) ) ;
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
        Enumerator lv_minUnit_6_0 = null;

        Enumerator lv_maxUnit_10_0 = null;

        Enumerator lv_permUnit_14_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2559:2: ( ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) ) )
            // InternalLcDsl.g:2560:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalLcDsl.g:2560:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) )
            // InternalLcDsl.g:2561:3: () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) )
            {
            // InternalLcDsl.g:2561:3: ()
            // InternalLcDsl.g:2562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryOptionAccess().getMemoryOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryOptionAccess().getMemoryKeyword_1());
            		
            // InternalLcDsl.g:2572:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2573:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2573:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2574:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2577:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            // InternalLcDsl.g:2578:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2578:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            loop18:
            do {
                int alt18=4;
                int LA18_0 = input.LA(1);

                if ( LA18_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                    alt18=3;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLcDsl.g:2579:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2579:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2580:5: {...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2580:109: ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2581:6: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2584:9: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2584:10: {...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2584:19: (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2584:20: otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_3=(Token)match(input,65,FOLLOW_14); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMemoryOptionAccess().getMinKeyword_2_0_0());
            	    								
            	    this_EQ_4=(Token)match(input,RULE_EQ,FOLLOW_24); 

            	    									newLeafNode(this_EQ_4, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_0_1());
            	    								
            	    // InternalLcDsl.g:2592:9: ( (lv_min_5_0= RULE_INT ) )
            	    // InternalLcDsl.g:2593:10: (lv_min_5_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2593:10: (lv_min_5_0= RULE_INT )
            	    // InternalLcDsl.g:2594:11: lv_min_5_0= RULE_INT
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

            	    // InternalLcDsl.g:2610:9: ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2611:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2611:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2612:11: lv_minUnit_6_0= ruleMemoryUnit
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
            	    // InternalLcDsl.g:2635:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2635:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2636:5: {...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2636:109: ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2637:6: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2640:9: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2640:10: {...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2640:19: (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2640:20: otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_7=(Token)match(input,66,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMemoryOptionAccess().getMaxKeyword_2_1_0());
            	    								
            	    this_EQ_8=(Token)match(input,RULE_EQ,FOLLOW_24); 

            	    									newLeafNode(this_EQ_8, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_1_1());
            	    								
            	    // InternalLcDsl.g:2648:9: ( (lv_max_9_0= RULE_INT ) )
            	    // InternalLcDsl.g:2649:10: (lv_max_9_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2649:10: (lv_max_9_0= RULE_INT )
            	    // InternalLcDsl.g:2650:11: lv_max_9_0= RULE_INT
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

            	    // InternalLcDsl.g:2666:9: ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2667:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2667:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2668:11: lv_maxUnit_10_0= ruleMemoryUnit
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
            	    // InternalLcDsl.g:2691:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2691:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2692:5: {...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLcDsl.g:2692:109: ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2693:6: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLcDsl.g:2696:9: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2696:10: {...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2696:19: (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2696:20: otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_11=(Token)match(input,67,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMemoryOptionAccess().getPermKeyword_2_2_0());
            	    								
            	    this_EQ_12=(Token)match(input,RULE_EQ,FOLLOW_24); 

            	    									newLeafNode(this_EQ_12, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_2_1());
            	    								
            	    // InternalLcDsl.g:2704:9: ( (lv_perm_13_0= RULE_INT ) )
            	    // InternalLcDsl.g:2705:10: (lv_perm_13_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2705:10: (lv_perm_13_0= RULE_INT )
            	    // InternalLcDsl.g:2706:11: lv_perm_13_0= RULE_INT
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

            	    // InternalLcDsl.g:2722:9: ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2723:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2723:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2724:11: lv_permUnit_14_0= ruleMemoryUnit
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
    // InternalLcDsl.g:2758:1: entryRuleGroupMember returns [EObject current=null] : iv_ruleGroupMember= ruleGroupMember EOF ;
    public final EObject entryRuleGroupMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupMember = null;


        try {
            // InternalLcDsl.g:2758:52: (iv_ruleGroupMember= ruleGroupMember EOF )
            // InternalLcDsl.g:2759:2: iv_ruleGroupMember= ruleGroupMember EOF
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
    // InternalLcDsl.g:2765:1: ruleGroupMember returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) ;
    public final EObject ruleGroupMember() throws RecognitionException {
        EObject current = null;

        Token lv_adopt_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_postAction_5_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2771:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) )
            // InternalLcDsl.g:2772:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            {
            // InternalLcDsl.g:2772:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            // InternalLcDsl.g:2773:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';'
            {
            // InternalLcDsl.g:2773:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2774:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2774:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2775:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            				
            // InternalLcDsl.g:2778:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            // InternalLcDsl.g:2779:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2779:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( ( LA19_0 >= 40 && LA19_0 <= 41 || LA19_0 >= 81 && LA19_0 <= 83 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLcDsl.g:2780:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2780:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    // InternalLcDsl.g:2781:5: {...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalLcDsl.g:2781:108: ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    // InternalLcDsl.g:2782:6: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalLcDsl.g:2785:9: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    // InternalLcDsl.g:2785:10: {...}? => ( (lv_type_1_0= ruleLaunchModeType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:2785:19: ( (lv_type_1_0= ruleLaunchModeType ) )
            	    // InternalLcDsl.g:2785:20: (lv_type_1_0= ruleLaunchModeType )
            	    {
            	    // InternalLcDsl.g:2785:20: (lv_type_1_0= ruleLaunchModeType )
            	    // InternalLcDsl.g:2786:10: lv_type_1_0= ruleLaunchModeType
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
            	    											true,
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
            	    // InternalLcDsl.g:2808:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2808:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    // InternalLcDsl.g:2809:5: {...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalLcDsl.g:2809:108: ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    // InternalLcDsl.g:2810:6: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalLcDsl.g:2813:9: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    // InternalLcDsl.g:2813:10: {...}? => ( (lv_adopt_2_0= 'adopt' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:2813:19: ( (lv_adopt_2_0= 'adopt' ) )
            	    // InternalLcDsl.g:2813:20: (lv_adopt_2_0= 'adopt' )
            	    {
            	    // InternalLcDsl.g:2813:20: (lv_adopt_2_0= 'adopt' )
            	    // InternalLcDsl.g:2814:10: lv_adopt_2_0= 'adopt'
            	    {
            	    lv_adopt_2_0=(Token)match(input,68,FOLLOW_32); 

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

            otherlv_3=(Token)match(input,69,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupMemberAccess().getMemberKeyword_1());
            		
            // InternalLcDsl.g:2842:3: ( ( ruleFQName ) )
            // InternalLcDsl.g:2843:4: ( ruleFQName )
            {
            // InternalLcDsl.g:2843:4: ( ruleFQName )
            // InternalLcDsl.g:2844:5: ruleFQName
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

            // InternalLcDsl.g:2858:3: ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=70 && LA20_0<=72)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLcDsl.g:2859:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    {
                    // InternalLcDsl.g:2859:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    // InternalLcDsl.g:2860:5: lv_postAction_5_0= ruleGroupPostLaunchAction
                    {

                    					newCompositeNode(grammarAccess.getGroupMemberAccess().getPostActionGroupPostLaunchActionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_postAction_5_0=ruleGroupPostLaunchAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGroupMemberRule());
                    					}
                    					set(
                    						current,
                    						"postAction",
                    						true,
                    						"com.wamas.ide.launching.LcDsl.GroupPostLaunchAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLcDsl.g:2885:1: entryRuleGroupPostLaunchAction returns [EObject current=null] : iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF ;
    public final EObject entryRuleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchAction = null;


        try {
            // InternalLcDsl.g:2885:62: (iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF )
            // InternalLcDsl.g:2886:2: iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF
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
    // InternalLcDsl.g:2892:1: ruleGroupPostLaunchAction returns [EObject current=null] : (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) ;
    public final EObject ruleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject this_GroupPostLaunchDelay_0 = null;

        EObject this_GroupPostLaunchRegex_1 = null;

        EObject this_GroupPostLaunchWait_2 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2898:2: ( (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) )
            // InternalLcDsl.g:2899:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            {
            // InternalLcDsl.g:2899:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt21=1;
                }
                break;
            case 71:
                {
                alt21=2;
                }
                break;
            case 72:
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
                    // InternalLcDsl.g:2900:3: this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay
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
                    // InternalLcDsl.g:2909:3: this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex
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
                    // InternalLcDsl.g:2918:3: this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait
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
    // InternalLcDsl.g:2930:1: entryRuleGroupPostLaunchDelay returns [EObject current=null] : iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF ;
    public final EObject entryRuleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchDelay = null;


        try {
            // InternalLcDsl.g:2930:61: (iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF )
            // InternalLcDsl.g:2931:2: iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF
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
    // InternalLcDsl.g:2937:1: ruleGroupPostLaunchDelay returns [EObject current=null] : (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_delay_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2943:2: ( (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) )
            // InternalLcDsl.g:2944:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            {
            // InternalLcDsl.g:2944:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            // InternalLcDsl.g:2945:3: otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchDelayAccess().getDelayKeyword_0());
            		
            // InternalLcDsl.g:2949:3: ( (lv_delay_1_0= RULE_INT ) )
            // InternalLcDsl.g:2950:4: (lv_delay_1_0= RULE_INT )
            {
            // InternalLcDsl.g:2950:4: (lv_delay_1_0= RULE_INT )
            // InternalLcDsl.g:2951:5: lv_delay_1_0= RULE_INT
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
    // InternalLcDsl.g:2971:1: entryRuleGroupPostLaunchRegex returns [EObject current=null] : iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF ;
    public final EObject entryRuleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchRegex = null;


        try {
            // InternalLcDsl.g:2971:61: (iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF )
            // InternalLcDsl.g:2972:2: iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF
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
    // InternalLcDsl.g:2978:1: ruleGroupPostLaunchRegex returns [EObject current=null] : (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_regex_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2984:2: ( (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) )
            // InternalLcDsl.g:2985:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            {
            // InternalLcDsl.g:2985:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            // InternalLcDsl.g:2986:3: otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchRegexAccess().getRegexKeyword_0());
            		
            // InternalLcDsl.g:2990:3: ( (lv_regex_1_0= RULE_STRING ) )
            // InternalLcDsl.g:2991:4: (lv_regex_1_0= RULE_STRING )
            {
            // InternalLcDsl.g:2991:4: (lv_regex_1_0= RULE_STRING )
            // InternalLcDsl.g:2992:5: lv_regex_1_0= RULE_STRING
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
    // InternalLcDsl.g:3012:1: entryRuleGroupPostLaunchWait returns [EObject current=null] : iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF ;
    public final EObject entryRuleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchWait = null;


        try {
            // InternalLcDsl.g:3012:60: (iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF )
            // InternalLcDsl.g:3013:2: iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF
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
    // InternalLcDsl.g:3019:1: ruleGroupPostLaunchWait returns [EObject current=null] : ( () otherlv_1= 'wait' ) ;
    public final EObject ruleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3025:2: ( ( () otherlv_1= 'wait' ) )
            // InternalLcDsl.g:3026:2: ( () otherlv_1= 'wait' )
            {
            // InternalLcDsl.g:3026:2: ( () otherlv_1= 'wait' )
            // InternalLcDsl.g:3027:3: () otherlv_1= 'wait'
            {
            // InternalLcDsl.g:3027:3: ()
            // InternalLcDsl.g:3028:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupPostLaunchWaitAccess().getGroupPostLaunchWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFQName"
    // InternalLcDsl.g:3042:1: entryRuleFQName returns [String current=null] : iv_ruleFQName= ruleFQName EOF ;
    public final String entryRuleFQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQName = null;


        try {
            // InternalLcDsl.g:3042:46: (iv_ruleFQName= ruleFQName EOF )
            // InternalLcDsl.g:3043:2: iv_ruleFQName= ruleFQName EOF
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
    // InternalLcDsl.g:3049:1: ruleFQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3055:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLcDsl.g:3056:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLcDsl.g:3056:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLcDsl.g:3057:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLcDsl.g:3064:3: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==73) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLcDsl.g:3065:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,73,FOLLOW_6); 

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
    // InternalLcDsl.g:3082:1: ruleBrowserLaunchMode returns [Enumerator current=null] : ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) ) ;
    public final Enumerator ruleBrowserLaunchMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3088:2: ( ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) ) )
            // InternalLcDsl.g:3089:2: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) )
            {
            // InternalLcDsl.g:3089:2: ( (enumLiteral_0= 'internal' ) | (enumLiteral_1= 'external' ) | (enumLiteral_2= 'none' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt23=1;
                }
                break;
            case 75:
                {
                alt23=2;
                }
                break;
            case 76:
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
                    // InternalLcDsl.g:3090:3: (enumLiteral_0= 'internal' )
                    {
                    // InternalLcDsl.g:3090:3: (enumLiteral_0= 'internal' )
                    // InternalLcDsl.g:3091:4: enumLiteral_0= 'internal'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBrowserLaunchModeAccess().getINTERNALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrowserLaunchModeAccess().getINTERNALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3098:3: (enumLiteral_1= 'external' )
                    {
                    // InternalLcDsl.g:3098:3: (enumLiteral_1= 'external' )
                    // InternalLcDsl.g:3099:4: enumLiteral_1= 'external'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getBrowserLaunchModeAccess().getEXTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrowserLaunchModeAccess().getEXTERNALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3106:3: (enumLiteral_2= 'none' )
                    {
                    // InternalLcDsl.g:3106:3: (enumLiteral_2= 'none' )
                    // InternalLcDsl.g:3107:4: enumLiteral_2= 'none'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

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
    // InternalLcDsl.g:3117:1: ruleLaunchConfigType returns [Enumerator current=null] : ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) ) ;
    public final Enumerator ruleLaunchConfigType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3123:2: ( ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) ) )
            // InternalLcDsl.g:3124:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) )
            {
            // InternalLcDsl.g:3124:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt24=1;
                }
                break;
            case 78:
                {
                alt24=2;
                }
                break;
            case 79:
                {
                alt24=3;
                }
                break;
            case 80:
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
                    // InternalLcDsl.g:3125:3: (enumLiteral_0= 'java' )
                    {
                    // InternalLcDsl.g:3125:3: (enumLiteral_0= 'java' )
                    // InternalLcDsl.g:3126:4: enumLiteral_0= 'java'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3133:3: (enumLiteral_1= 'eclipse' )
                    {
                    // InternalLcDsl.g:3133:3: (enumLiteral_1= 'eclipse' )
                    // InternalLcDsl.g:3134:4: enumLiteral_1= 'eclipse'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3141:3: (enumLiteral_2= 'rap' )
                    {
                    // InternalLcDsl.g:3141:3: (enumLiteral_2= 'rap' )
                    // InternalLcDsl.g:3142:4: enumLiteral_2= 'rap'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3149:3: (enumLiteral_3= 'group' )
                    {
                    // InternalLcDsl.g:3149:3: (enumLiteral_3= 'group' )
                    // InternalLcDsl.g:3150:4: enumLiteral_3= 'group'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); 

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
    // InternalLcDsl.g:3160:1: ruleLaunchModeType returns [Enumerator current=null] : ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) ) ;
    public final Enumerator ruleLaunchModeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3166:2: ( ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) ) )
            // InternalLcDsl.g:3167:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) )
            {
            // InternalLcDsl.g:3167:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt25=1;
                }
                break;
            case 41:
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
                    // InternalLcDsl.g:3168:3: (enumLiteral_0= 'run' )
                    {
                    // InternalLcDsl.g:3168:3: (enumLiteral_0= 'run' )
                    // InternalLcDsl.g:3169:4: enumLiteral_0= 'run'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3176:3: (enumLiteral_1= 'debug' )
                    {
                    // InternalLcDsl.g:3176:3: (enumLiteral_1= 'debug' )
                    // InternalLcDsl.g:3177:4: enumLiteral_1= 'debug'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3184:3: (enumLiteral_2= 'profile' )
                    {
                    // InternalLcDsl.g:3184:3: (enumLiteral_2= 'profile' )
                    // InternalLcDsl.g:3185:4: enumLiteral_2= 'profile'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3192:3: (enumLiteral_3= 'coverage' )
                    {
                    // InternalLcDsl.g:3192:3: (enumLiteral_3= 'coverage' )
                    // InternalLcDsl.g:3193:4: enumLiteral_3= 'coverage'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:3200:3: (enumLiteral_4= 'inherit' )
                    {
                    // InternalLcDsl.g:3200:3: (enumLiteral_4= 'inherit' )
                    // InternalLcDsl.g:3201:4: enumLiteral_4= 'inherit'
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
    // InternalLcDsl.g:3211:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) ) ;
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
            // InternalLcDsl.g:3217:2: ( ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) ) )
            // InternalLcDsl.g:3218:2: ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) )
            {
            // InternalLcDsl.g:3218:2: ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) )
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
                    // InternalLcDsl.g:3219:3: (enumLiteral_0= 'MB' )
                    {
                    // InternalLcDsl.g:3219:3: (enumLiteral_0= 'MB' )
                    // InternalLcDsl.g:3220:4: enumLiteral_0= 'MB'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3227:3: (enumLiteral_1= 'mb' )
                    {
                    // InternalLcDsl.g:3227:3: (enumLiteral_1= 'mb' )
                    // InternalLcDsl.g:3228:4: enumLiteral_1= 'mb'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3235:3: (enumLiteral_2= 'M' )
                    {
                    // InternalLcDsl.g:3235:3: (enumLiteral_2= 'M' )
                    // InternalLcDsl.g:3236:4: enumLiteral_2= 'M'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:3243:3: (enumLiteral_3= 'm' )
                    {
                    // InternalLcDsl.g:3243:3: (enumLiteral_3= 'm' )
                    // InternalLcDsl.g:3244:4: enumLiteral_3= 'm'
                    {
                    enumLiteral_3=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:3251:3: (enumLiteral_4= 'GB' )
                    {
                    // InternalLcDsl.g:3251:3: (enumLiteral_4= 'GB' )
                    // InternalLcDsl.g:3252:4: enumLiteral_4= 'GB'
                    {
                    enumLiteral_4=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:3259:3: (enumLiteral_5= 'gb' )
                    {
                    // InternalLcDsl.g:3259:3: (enumLiteral_5= 'gb' )
                    // InternalLcDsl.g:3260:4: enumLiteral_5= 'gb'
                    {
                    enumLiteral_5=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:3267:3: (enumLiteral_6= 'G' )
                    {
                    // InternalLcDsl.g:3267:3: (enumLiteral_6= 'G' )
                    // InternalLcDsl.g:3268:4: enumLiteral_6= 'G'
                    {
                    enumLiteral_6=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalLcDsl.g:3275:3: (enumLiteral_7= 'g' )
                    {
                    // InternalLcDsl.g:3275:3: (enumLiteral_7= 'g' )
                    // InternalLcDsl.g:3276:4: enumLiteral_7= 'g'
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
    // InternalLcDsl.g:3286:1: ruleOutputStream returns [Enumerator current=null] : ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) ;
    public final Enumerator ruleOutputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3292:2: ( ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) )
            // InternalLcDsl.g:3293:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
            {
            // InternalLcDsl.g:3293:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
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
                    // InternalLcDsl.g:3294:3: (enumLiteral_0= 'stdout' )
                    {
                    // InternalLcDsl.g:3294:3: (enumLiteral_0= 'stdout' )
                    // InternalLcDsl.g:3295:4: enumLiteral_0= 'stdout'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:3302:3: (enumLiteral_1= 'stderr' )
                    {
                    // InternalLcDsl.g:3302:3: (enumLiteral_1= 'stderr' )
                    // InternalLcDsl.g:3303:4: enumLiteral_1= 'stderr'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:3310:3: (enumLiteral_2= 'both-out' )
                    {
                    // InternalLcDsl.g:3310:3: (enumLiteral_2= 'both-out' )
                    // InternalLcDsl.g:3311:4: enumLiteral_2= 'both-out'
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
    // InternalLcDsl.g:3321:1: ruleInputStream returns [Enumerator current=null] : (enumLiteral_0= 'stdin' ) ;
    public final Enumerator ruleInputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:3327:2: ( (enumLiteral_0= 'stdin' ) )
            // InternalLcDsl.g:3328:2: (enumLiteral_0= 'stdin' )
            {
            // InternalLcDsl.g:3328:2: (enumLiteral_0= 'stdin' )
            // InternalLcDsl.g:3329:3: enumLiteral_0= 'stdin'
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
    static final String dfa_3s = "\1\120\11\uffff";
    static final String dfa_4s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\64\uffff\4\1",
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
                        if ( ((LA2_0>=77 && LA2_0<=80)) ) {s = 1;}

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
            "\1\1\26\uffff\1\3\1\4\1\6\1\7\5\1\1\10\1\11\1\12\2\1\1\13\2\uffff\1\14\1\15\1\1\1\16\2\uffff\1\17\10\uffff\1\2\3\uffff\1\5\3\uffff\2\1\13\uffff\3\1",
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
            return "()* loopback of 388:6: ( ({...}? => ( ({...}? => ( ( (lv_clears_16_0= ruleClearOption ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'workspace' ( (lv_workspace_19_0= ruleAnyPath ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'working-dir' ( (lv_workingDir_22_0= ruleExistingPath ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_24_0= ruleMemoryOption ) ) otherlv_25= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'project' ( (lv_project_27_0= ruleProject ) ) otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'main-class' ( (lv_mainClass_30_0= ruleJavaType ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_32_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_33_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_34_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_35_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_36_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_37_0= ruleConfigIniTemplate ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_javaMainSearch_38_0= ruleJavaMainSearch ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_servletConfig_39_0= ruleRapServletConfig ) ) ) ) ) )*";
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
                        if ( (LA4_0==RULE_BLOCK_END||(LA4_0>=32 && LA4_0<=36)||(LA4_0>=40 && LA4_0<=41)||LA4_0==47||(LA4_0>=68 && LA4_0<=69)||(LA4_0>=81 && LA4_0<=83)) ) {s = 1;}

                        else if ( LA4_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 2;}

                        else if ( LA4_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 3;}

                        else if ( LA4_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 4;}

                        else if ( LA4_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 5;}

                        else if ( LA4_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 6;}

                        else if ( LA4_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 7;}

                        else if ( LA4_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 8;}

                        else if ( LA4_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 9;}

                        else if ( LA4_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 10;}

                        else if ( LA4_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 11;}

                        else if ( LA4_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 12;}

                        else if ( LA4_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 13;}

                        else if ( LA4_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 12) ) {s = 14;}

                        else if ( LA4_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 13) ) {s = 15;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001FE0002L,0x000000000001E000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003FE0000L,0x000000000001E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1009E7FFF0000020L,0x00000000000E0031L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000831F00000020L,0x00000000000E0030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000030008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L,0x00000000F0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0006000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x03F0000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xA000000010000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xE000000010000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x000000000FF00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030000000000L,0x00000000000E0030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});

}
