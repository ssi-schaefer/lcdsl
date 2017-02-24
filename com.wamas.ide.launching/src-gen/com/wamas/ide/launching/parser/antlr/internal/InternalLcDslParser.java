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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_EQ", "RULE_INT", "RULE_VERSION", "RULE_QUALIFIER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'explicit'", "'manual'", "'foreground'", "'no-console'", "'no-validate'", "'sw-install-allowed'", "'replace-env'", "'configuration'", "':'", "'{'", "';'", "'workspace'", "'working-dir'", "'project'", "'main-class'", "'}'", "'plugin'", "'ignore'", "'vm-arg'", "'argument'", "'environment'", "'application'", "'product'", "'favorite'", "'run'", "'debug'", "'redirect'", "'to'", "'from'", "'execution-environment'", "'config-ini-template'", "'trace'", "'autostart'", "'startlevel'", "'clear'", "'log'", "'!'", "'config'", "'memory'", "'min'", "'max'", "'perm'", "'adopt'", "'member'", "'delay'", "'regex'", "'wait'", "'.'", "'java'", "'eclipse'", "'rap'", "'group'", "'profile'", "'coverage'", "'inherit'", "'MB'", "'mb'", "'M'", "'m'", "'GB'", "'gb'", "'G'", "'g'", "'stdout'", "'stderr'", "'both-out'", "'stdin'"
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_EQ=6;
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

                if ( ((LA1_0>=14 && LA1_0<=20)||(LA1_0>=62 && LA1_0<=65)) ) {
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
    // InternalLcDsl.g:108:1: ruleLaunchConfig returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* ) ) ) ( (lv_type_8_0= ruleLaunchConfigType ) ) otherlv_9= 'configuration' ( (lv_name_10_0= ruleFQName ) ) (otherlv_11= ':' ( ( ruleFQName ) ) )? otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_37_0= ruleAddPlugin ) ) | ( (lv_ignore_38_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_39_0= ruleGroupMember ) ) | ( (lv_vmArgs_40_0= ruleVmArgument ) ) | ( (lv_progArgs_41_0= ruleProgramArgument ) ) | ( (lv_envVars_42_0= ruleEnvironmentVariable ) ) | ( (lv_traces_43_0= ruleTraceEnablement ) ) )* otherlv_44= '}' ) ;
    public final EObject ruleLaunchConfig() throws RecognitionException {
        EObject current = null;

        Token lv_explicit_1_0=null;
        Token lv_manual_2_0=null;
        Token lv_foreground_3_0=null;
        Token lv_noConsole_4_0=null;
        Token lv_noValidate_5_0=null;
        Token lv_swInstallSupport_6_0=null;
        Token lv_replaceEnv_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_44=null;
        Enumerator lv_type_8_0 = null;

        AntlrDatatypeRuleToken lv_name_10_0 = null;

        EObject lv_clears_15_0 = null;

        EObject lv_workspace_18_0 = null;

        EObject lv_workingDir_21_0 = null;

        EObject lv_memory_23_0 = null;

        EObject lv_project_26_0 = null;

        EObject lv_mainClass_29_0 = null;

        EObject lv_application_31_0 = null;

        EObject lv_product_32_0 = null;

        EObject lv_favorites_33_0 = null;

        EObject lv_redirect_34_0 = null;

        EObject lv_execEnv_35_0 = null;

        EObject lv_configIniTemplate_36_0 = null;

        EObject lv_plugins_37_0 = null;

        EObject lv_ignore_38_0 = null;

        EObject lv_groupMembers_39_0 = null;

        EObject lv_vmArgs_40_0 = null;

        EObject lv_progArgs_41_0 = null;

        EObject lv_envVars_42_0 = null;

        EObject lv_traces_43_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:114:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* ) ) ) ( (lv_type_8_0= ruleLaunchConfigType ) ) otherlv_9= 'configuration' ( (lv_name_10_0= ruleFQName ) ) (otherlv_11= ':' ( ( ruleFQName ) ) )? otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_37_0= ruleAddPlugin ) ) | ( (lv_ignore_38_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_39_0= ruleGroupMember ) ) | ( (lv_vmArgs_40_0= ruleVmArgument ) ) | ( (lv_progArgs_41_0= ruleProgramArgument ) ) | ( (lv_envVars_42_0= ruleEnvironmentVariable ) ) | ( (lv_traces_43_0= ruleTraceEnablement ) ) )* otherlv_44= '}' ) )
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* ) ) ) ( (lv_type_8_0= ruleLaunchConfigType ) ) otherlv_9= 'configuration' ( (lv_name_10_0= ruleFQName ) ) (otherlv_11= ':' ( ( ruleFQName ) ) )? otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_37_0= ruleAddPlugin ) ) | ( (lv_ignore_38_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_39_0= ruleGroupMember ) ) | ( (lv_vmArgs_40_0= ruleVmArgument ) ) | ( (lv_progArgs_41_0= ruleProgramArgument ) ) | ( (lv_envVars_42_0= ruleEnvironmentVariable ) ) | ( (lv_traces_43_0= ruleTraceEnablement ) ) )* otherlv_44= '}' )
            {
            // InternalLcDsl.g:115:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* ) ) ) ( (lv_type_8_0= ruleLaunchConfigType ) ) otherlv_9= 'configuration' ( (lv_name_10_0= ruleFQName ) ) (otherlv_11= ':' ( ( ruleFQName ) ) )? otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_37_0= ruleAddPlugin ) ) | ( (lv_ignore_38_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_39_0= ruleGroupMember ) ) | ( (lv_vmArgs_40_0= ruleVmArgument ) ) | ( (lv_progArgs_41_0= ruleProgramArgument ) ) | ( (lv_envVars_42_0= ruleEnvironmentVariable ) ) | ( (lv_traces_43_0= ruleTraceEnablement ) ) )* otherlv_44= '}' )
            // InternalLcDsl.g:116:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* ) ) ) ( (lv_type_8_0= ruleLaunchConfigType ) ) otherlv_9= 'configuration' ( (lv_name_10_0= ruleFQName ) ) (otherlv_11= ':' ( ( ruleFQName ) ) )? otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* ) ) ) ( ( (lv_plugins_37_0= ruleAddPlugin ) ) | ( (lv_ignore_38_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_39_0= ruleGroupMember ) ) | ( (lv_vmArgs_40_0= ruleVmArgument ) ) | ( (lv_progArgs_41_0= ruleProgramArgument ) ) | ( (lv_envVars_42_0= ruleEnvironmentVariable ) ) | ( (lv_traces_43_0= ruleTraceEnablement ) ) )* otherlv_44= '}'
            {
            // InternalLcDsl.g:116:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:117:4: ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:117:4: ( ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:118:5: ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            				
            // InternalLcDsl.g:121:5: ( ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )* )
            // InternalLcDsl.g:122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:122:6: ( ({...}? => ( ({...}? => ( (lv_explicit_1_0= 'explicit' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manual_2_0= 'manual' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_foreground_3_0= 'foreground' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noConsole_4_0= 'no-console' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noValidate_5_0= 'no-validate' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_swInstallSupport_6_0= 'sw-install-allowed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_replaceEnv_7_0= 'replace-env' ) ) ) ) ) )*
            loop2:
            do {
                int alt2=8;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 3) ) {
                    alt2=4;
                }
                else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 4) ) {
                    alt2=5;
                }
                else if ( LA2_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 5) ) {
                    alt2=6;
                }
                else if ( LA2_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0(), 6) ) {
                    alt2=7;
                }


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
            	    lv_explicit_1_0=(Token)match(input,14,FOLLOW_4); 

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
            	    lv_manual_2_0=(Token)match(input,15,FOLLOW_4); 

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
            	    lv_foreground_3_0=(Token)match(input,16,FOLLOW_4); 

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
            	    lv_noConsole_4_0=(Token)match(input,17,FOLLOW_4); 

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
            	    lv_noValidate_5_0=(Token)match(input,18,FOLLOW_4); 

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
            	    lv_swInstallSupport_6_0=(Token)match(input,19,FOLLOW_4); 

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
            	    lv_replaceEnv_7_0=(Token)match(input,20,FOLLOW_4); 

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

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_0());
            				

            }

            // InternalLcDsl.g:291:3: ( (lv_type_8_0= ruleLaunchConfigType ) )
            // InternalLcDsl.g:292:4: (lv_type_8_0= ruleLaunchConfigType )
            {
            // InternalLcDsl.g:292:4: (lv_type_8_0= ruleLaunchConfigType )
            // InternalLcDsl.g:293:5: lv_type_8_0= ruleLaunchConfigType
            {

            					newCompositeNode(grammarAccess.getLaunchConfigAccess().getTypeLaunchConfigTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_8_0=ruleLaunchConfigType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"com.wamas.ide.launching.LcDsl.LaunchConfigType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getLaunchConfigAccess().getConfigurationKeyword_2());
            		
            // InternalLcDsl.g:314:3: ( (lv_name_10_0= ruleFQName ) )
            // InternalLcDsl.g:315:4: (lv_name_10_0= ruleFQName )
            {
            // InternalLcDsl.g:315:4: (lv_name_10_0= ruleFQName )
            // InternalLcDsl.g:316:5: lv_name_10_0= ruleFQName
            {

            					newCompositeNode(grammarAccess.getLaunchConfigAccess().getNameFQNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_10_0=ruleFQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_10_0,
            						"com.wamas.ide.launching.LcDsl.FQName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:333:3: (otherlv_11= ':' ( ( ruleFQName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLcDsl.g:334:4: otherlv_11= ':' ( ( ruleFQName ) )
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getLaunchConfigAccess().getColonKeyword_4_0());
                    			
                    // InternalLcDsl.g:338:4: ( ( ruleFQName ) )
                    // InternalLcDsl.g:339:5: ( ruleFQName )
                    {
                    // InternalLcDsl.g:339:5: ( ruleFQName )
                    // InternalLcDsl.g:340:6: ruleFQName
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

            otherlv_13=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getLaunchConfigAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalLcDsl.g:359:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:360:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:360:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* ) )
            // InternalLcDsl.g:361:5: ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            				
            // InternalLcDsl.g:364:5: ( ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )* )
            // InternalLcDsl.g:365:6: ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )*
            {
            // InternalLcDsl.g:365:6: ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )*
            loop4:
            do {
                int alt4=13;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalLcDsl.g:366:4: ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:366:4: ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) )
            	    // InternalLcDsl.g:367:5: {...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalLcDsl.g:367:109: ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) )
            	    // InternalLcDsl.g:368:6: ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0);
            	    					
            	    // InternalLcDsl.g:371:9: ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) )
            	    // InternalLcDsl.g:371:10: {...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:371:19: ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' )
            	    // InternalLcDsl.g:371:20: ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';'
            	    {
            	    // InternalLcDsl.g:371:20: ( (lv_clears_15_0= ruleClearOption ) )
            	    // InternalLcDsl.g:372:10: (lv_clears_15_0= ruleClearOption )
            	    {
            	    // InternalLcDsl.g:372:10: (lv_clears_15_0= ruleClearOption )
            	    // InternalLcDsl.g:373:11: lv_clears_15_0= ruleClearOption
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getClearsClearOptionParserRuleCall_6_0_0_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_clears_15_0=ruleClearOption();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"clears",
            	    												lv_clears_15_0,
            	    												"com.wamas.ide.launching.LcDsl.ClearOption");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_16=(Token)match(input,24,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_0_1());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:400:4: ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:400:4: ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) )
            	    // InternalLcDsl.g:401:5: {...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalLcDsl.g:401:109: ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) )
            	    // InternalLcDsl.g:402:6: ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1);
            	    					
            	    // InternalLcDsl.g:405:9: ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) )
            	    // InternalLcDsl.g:405:10: {...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:405:19: (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' )
            	    // InternalLcDsl.g:405:20: otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';'
            	    {
            	    otherlv_17=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_17, grammarAccess.getLaunchConfigAccess().getWorkspaceKeyword_6_1_0());
            	    								
            	    // InternalLcDsl.g:409:9: ( (lv_workspace_18_0= ruleAnyPath ) )
            	    // InternalLcDsl.g:410:10: (lv_workspace_18_0= ruleAnyPath )
            	    {
            	    // InternalLcDsl.g:410:10: (lv_workspace_18_0= ruleAnyPath )
            	    // InternalLcDsl.g:411:11: lv_workspace_18_0= ruleAnyPath
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkspaceAnyPathParserRuleCall_6_1_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_workspace_18_0=ruleAnyPath();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"workspace",
            	    												lv_workspace_18_0,
            	    												"com.wamas.ide.launching.LcDsl.AnyPath");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_19=(Token)match(input,24,FOLLOW_9); 

            	    									newLeafNode(otherlv_19, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:438:4: ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:438:4: ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) )
            	    // InternalLcDsl.g:439:5: {...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalLcDsl.g:439:109: ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) )
            	    // InternalLcDsl.g:440:6: ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2);
            	    					
            	    // InternalLcDsl.g:443:9: ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) )
            	    // InternalLcDsl.g:443:10: {...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:443:19: (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' )
            	    // InternalLcDsl.g:443:20: otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';'
            	    {
            	    otherlv_20=(Token)match(input,26,FOLLOW_11); 

            	    									newLeafNode(otherlv_20, grammarAccess.getLaunchConfigAccess().getWorkingDirKeyword_6_2_0());
            	    								
            	    // InternalLcDsl.g:447:9: ( (lv_workingDir_21_0= ruleExistingPath ) )
            	    // InternalLcDsl.g:448:10: (lv_workingDir_21_0= ruleExistingPath )
            	    {
            	    // InternalLcDsl.g:448:10: (lv_workingDir_21_0= ruleExistingPath )
            	    // InternalLcDsl.g:449:11: lv_workingDir_21_0= ruleExistingPath
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getWorkingDirExistingPathParserRuleCall_6_2_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_workingDir_21_0=ruleExistingPath();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"workingDir",
            	    												lv_workingDir_21_0,
            	    												"com.wamas.ide.launching.LcDsl.ExistingPath");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_22=(Token)match(input,24,FOLLOW_9); 

            	    									newLeafNode(otherlv_22, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:476:4: ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:476:4: ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) )
            	    // InternalLcDsl.g:477:5: {...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalLcDsl.g:477:109: ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) )
            	    // InternalLcDsl.g:478:6: ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3);
            	    					
            	    // InternalLcDsl.g:481:9: ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) )
            	    // InternalLcDsl.g:481:10: {...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:481:19: ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' )
            	    // InternalLcDsl.g:481:20: ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';'
            	    {
            	    // InternalLcDsl.g:481:20: ( (lv_memory_23_0= ruleMemoryOption ) )
            	    // InternalLcDsl.g:482:10: (lv_memory_23_0= ruleMemoryOption )
            	    {
            	    // InternalLcDsl.g:482:10: (lv_memory_23_0= ruleMemoryOption )
            	    // InternalLcDsl.g:483:11: lv_memory_23_0= ruleMemoryOption
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getMemoryMemoryOptionParserRuleCall_6_3_0_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_memory_23_0=ruleMemoryOption();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"memory",
            	    												lv_memory_23_0,
            	    												"com.wamas.ide.launching.LcDsl.MemoryOption");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_24=(Token)match(input,24,FOLLOW_9); 

            	    									newLeafNode(otherlv_24, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_3_1());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:510:4: ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:510:4: ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) )
            	    // InternalLcDsl.g:511:5: {...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalLcDsl.g:511:109: ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) )
            	    // InternalLcDsl.g:512:6: ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4);
            	    					
            	    // InternalLcDsl.g:515:9: ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) )
            	    // InternalLcDsl.g:515:10: {...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:515:19: (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' )
            	    // InternalLcDsl.g:515:20: otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';'
            	    {
            	    otherlv_25=(Token)match(input,27,FOLLOW_6); 

            	    									newLeafNode(otherlv_25, grammarAccess.getLaunchConfigAccess().getProjectKeyword_6_4_0());
            	    								
            	    // InternalLcDsl.g:519:9: ( (lv_project_26_0= ruleProject ) )
            	    // InternalLcDsl.g:520:10: (lv_project_26_0= ruleProject )
            	    {
            	    // InternalLcDsl.g:520:10: (lv_project_26_0= ruleProject )
            	    // InternalLcDsl.g:521:11: lv_project_26_0= ruleProject
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getProjectProjectParserRuleCall_6_4_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_project_26_0=ruleProject();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"project",
            	    												lv_project_26_0,
            	    												"com.wamas.ide.launching.LcDsl.Project");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_27=(Token)match(input,24,FOLLOW_9); 

            	    									newLeafNode(otherlv_27, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:548:4: ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) )
            	    {
            	    // InternalLcDsl.g:548:4: ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) )
            	    // InternalLcDsl.g:549:5: {...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalLcDsl.g:549:109: ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) )
            	    // InternalLcDsl.g:550:6: ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5);
            	    					
            	    // InternalLcDsl.g:553:9: ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) )
            	    // InternalLcDsl.g:553:10: {...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:553:19: (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' )
            	    // InternalLcDsl.g:553:20: otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';'
            	    {
            	    otherlv_28=(Token)match(input,28,FOLLOW_6); 

            	    									newLeafNode(otherlv_28, grammarAccess.getLaunchConfigAccess().getMainClassKeyword_6_5_0());
            	    								
            	    // InternalLcDsl.g:557:9: ( (lv_mainClass_29_0= ruleJavaType ) )
            	    // InternalLcDsl.g:558:10: (lv_mainClass_29_0= ruleJavaType )
            	    {
            	    // InternalLcDsl.g:558:10: (lv_mainClass_29_0= ruleJavaType )
            	    // InternalLcDsl.g:559:11: lv_mainClass_29_0= ruleJavaType
            	    {

            	    											newCompositeNode(grammarAccess.getLaunchConfigAccess().getMainClassJavaTypeParserRuleCall_6_5_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_mainClass_29_0=ruleJavaType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"mainClass",
            	    												lv_mainClass_29_0,
            	    												"com.wamas.ide.launching.LcDsl.JavaType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_30=(Token)match(input,24,FOLLOW_9); 

            	    									newLeafNode(otherlv_30, grammarAccess.getLaunchConfigAccess().getSemicolonKeyword_6_5_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLcDsl.g:586:4: ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:586:4: ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:587:5: {...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // InternalLcDsl.g:587:109: ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) )
            	    // InternalLcDsl.g:588:6: ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6);
            	    					
            	    // InternalLcDsl.g:591:9: ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) )
            	    // InternalLcDsl.g:591:10: {...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:591:19: ( (lv_application_31_0= ruleApplicationExtPoint ) )
            	    // InternalLcDsl.g:591:20: (lv_application_31_0= ruleApplicationExtPoint )
            	    {
            	    // InternalLcDsl.g:591:20: (lv_application_31_0= ruleApplicationExtPoint )
            	    // InternalLcDsl.g:592:10: lv_application_31_0= ruleApplicationExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getApplicationApplicationExtPointParserRuleCall_6_6_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_application_31_0=ruleApplicationExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"application",
            	    											lv_application_31_0,
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
            	    // InternalLcDsl.g:614:4: ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:614:4: ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) )
            	    // InternalLcDsl.g:615:5: {...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7)");
            	    }
            	    // InternalLcDsl.g:615:109: ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) )
            	    // InternalLcDsl.g:616:6: ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7);
            	    					
            	    // InternalLcDsl.g:619:9: ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) )
            	    // InternalLcDsl.g:619:10: {...}? => ( (lv_product_32_0= ruleProductExtPoint ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:619:19: ( (lv_product_32_0= ruleProductExtPoint ) )
            	    // InternalLcDsl.g:619:20: (lv_product_32_0= ruleProductExtPoint )
            	    {
            	    // InternalLcDsl.g:619:20: (lv_product_32_0= ruleProductExtPoint )
            	    // InternalLcDsl.g:620:10: lv_product_32_0= ruleProductExtPoint
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getProductProductExtPointParserRuleCall_6_7_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_product_32_0=ruleProductExtPoint();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"product",
            	    											lv_product_32_0,
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
            	    // InternalLcDsl.g:642:4: ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:642:4: ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) )
            	    // InternalLcDsl.g:643:5: {...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8)");
            	    }
            	    // InternalLcDsl.g:643:109: ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) )
            	    // InternalLcDsl.g:644:6: ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8);
            	    					
            	    // InternalLcDsl.g:647:9: ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) )
            	    // InternalLcDsl.g:647:10: {...}? => ( (lv_favorites_33_0= ruleFavorites ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:647:19: ( (lv_favorites_33_0= ruleFavorites ) )
            	    // InternalLcDsl.g:647:20: (lv_favorites_33_0= ruleFavorites )
            	    {
            	    // InternalLcDsl.g:647:20: (lv_favorites_33_0= ruleFavorites )
            	    // InternalLcDsl.g:648:10: lv_favorites_33_0= ruleFavorites
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getFavoritesFavoritesParserRuleCall_6_8_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_favorites_33_0=ruleFavorites();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"favorites",
            	    											lv_favorites_33_0,
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
            	    // InternalLcDsl.g:670:4: ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:670:4: ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) )
            	    // InternalLcDsl.g:671:5: {...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9)");
            	    }
            	    // InternalLcDsl.g:671:109: ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) )
            	    // InternalLcDsl.g:672:6: ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9);
            	    					
            	    // InternalLcDsl.g:675:9: ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) )
            	    // InternalLcDsl.g:675:10: {...}? => ( (lv_redirect_34_0= ruleRedirect ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:675:19: ( (lv_redirect_34_0= ruleRedirect ) )
            	    // InternalLcDsl.g:675:20: (lv_redirect_34_0= ruleRedirect )
            	    {
            	    // InternalLcDsl.g:675:20: (lv_redirect_34_0= ruleRedirect )
            	    // InternalLcDsl.g:676:10: lv_redirect_34_0= ruleRedirect
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getRedirectRedirectParserRuleCall_6_9_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_redirect_34_0=ruleRedirect();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"redirect",
            	    											lv_redirect_34_0,
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
            	    // InternalLcDsl.g:698:4: ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:698:4: ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) )
            	    // InternalLcDsl.g:699:5: {...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10)");
            	    }
            	    // InternalLcDsl.g:699:110: ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) )
            	    // InternalLcDsl.g:700:6: ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10);
            	    					
            	    // InternalLcDsl.g:703:9: ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) )
            	    // InternalLcDsl.g:703:10: {...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:703:19: ( (lv_execEnv_35_0= ruleExecutionEnvironment ) )
            	    // InternalLcDsl.g:703:20: (lv_execEnv_35_0= ruleExecutionEnvironment )
            	    {
            	    // InternalLcDsl.g:703:20: (lv_execEnv_35_0= ruleExecutionEnvironment )
            	    // InternalLcDsl.g:704:10: lv_execEnv_35_0= ruleExecutionEnvironment
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getExecEnvExecutionEnvironmentParserRuleCall_6_10_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_execEnv_35_0=ruleExecutionEnvironment();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"execEnv",
            	    											lv_execEnv_35_0,
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
            	    // InternalLcDsl.g:726:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:726:4: ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) )
            	    // InternalLcDsl.g:727:5: {...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11)");
            	    }
            	    // InternalLcDsl.g:727:110: ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) )
            	    // InternalLcDsl.g:728:6: ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11);
            	    					
            	    // InternalLcDsl.g:731:9: ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) )
            	    // InternalLcDsl.g:731:10: {...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLaunchConfig", "true");
            	    }
            	    // InternalLcDsl.g:731:19: ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) )
            	    // InternalLcDsl.g:731:20: (lv_configIniTemplate_36_0= ruleConfigIniTemplate )
            	    {
            	    // InternalLcDsl.g:731:20: (lv_configIniTemplate_36_0= ruleConfigIniTemplate )
            	    // InternalLcDsl.g:732:10: lv_configIniTemplate_36_0= ruleConfigIniTemplate
            	    {

            	    										newCompositeNode(grammarAccess.getLaunchConfigAccess().getConfigIniTemplateConfigIniTemplateParserRuleCall_6_11_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_configIniTemplate_36_0=ruleConfigIniTemplate();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"configIniTemplate",
            	    											lv_configIniTemplate_36_0,
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

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6());
            				

            }

            // InternalLcDsl.g:761:3: ( ( (lv_plugins_37_0= ruleAddPlugin ) ) | ( (lv_ignore_38_0= ruleIgnorePlugin ) ) | ( (lv_groupMembers_39_0= ruleGroupMember ) ) | ( (lv_vmArgs_40_0= ruleVmArgument ) ) | ( (lv_progArgs_41_0= ruleProgramArgument ) ) | ( (lv_envVars_42_0= ruleEnvironmentVariable ) ) | ( (lv_traces_43_0= ruleTraceEnablement ) ) )*
            loop5:
            do {
                int alt5=8;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt5=1;
                    }
                    break;
                case 31:
                    {
                    alt5=2;
                    }
                    break;
                case 38:
                case 39:
                case 56:
                case 57:
                case 66:
                case 67:
                case 68:
                    {
                    alt5=3;
                    }
                    break;
                case 32:
                    {
                    alt5=4;
                    }
                    break;
                case 33:
                    {
                    alt5=5;
                    }
                    break;
                case 34:
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
            	    // InternalLcDsl.g:762:4: ( (lv_plugins_37_0= ruleAddPlugin ) )
            	    {
            	    // InternalLcDsl.g:762:4: ( (lv_plugins_37_0= ruleAddPlugin ) )
            	    // InternalLcDsl.g:763:5: (lv_plugins_37_0= ruleAddPlugin )
            	    {
            	    // InternalLcDsl.g:763:5: (lv_plugins_37_0= ruleAddPlugin )
            	    // InternalLcDsl.g:764:6: lv_plugins_37_0= ruleAddPlugin
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getPluginsAddPluginParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_plugins_37_0=ruleAddPlugin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"plugins",
            	    							lv_plugins_37_0,
            	    							"com.wamas.ide.launching.LcDsl.AddPlugin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLcDsl.g:782:4: ( (lv_ignore_38_0= ruleIgnorePlugin ) )
            	    {
            	    // InternalLcDsl.g:782:4: ( (lv_ignore_38_0= ruleIgnorePlugin ) )
            	    // InternalLcDsl.g:783:5: (lv_ignore_38_0= ruleIgnorePlugin )
            	    {
            	    // InternalLcDsl.g:783:5: (lv_ignore_38_0= ruleIgnorePlugin )
            	    // InternalLcDsl.g:784:6: lv_ignore_38_0= ruleIgnorePlugin
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getIgnoreIgnorePluginParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_ignore_38_0=ruleIgnorePlugin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ignore",
            	    							lv_ignore_38_0,
            	    							"com.wamas.ide.launching.LcDsl.IgnorePlugin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLcDsl.g:802:4: ( (lv_groupMembers_39_0= ruleGroupMember ) )
            	    {
            	    // InternalLcDsl.g:802:4: ( (lv_groupMembers_39_0= ruleGroupMember ) )
            	    // InternalLcDsl.g:803:5: (lv_groupMembers_39_0= ruleGroupMember )
            	    {
            	    // InternalLcDsl.g:803:5: (lv_groupMembers_39_0= ruleGroupMember )
            	    // InternalLcDsl.g:804:6: lv_groupMembers_39_0= ruleGroupMember
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getGroupMembersGroupMemberParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_groupMembers_39_0=ruleGroupMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"groupMembers",
            	    							lv_groupMembers_39_0,
            	    							"com.wamas.ide.launching.LcDsl.GroupMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLcDsl.g:822:4: ( (lv_vmArgs_40_0= ruleVmArgument ) )
            	    {
            	    // InternalLcDsl.g:822:4: ( (lv_vmArgs_40_0= ruleVmArgument ) )
            	    // InternalLcDsl.g:823:5: (lv_vmArgs_40_0= ruleVmArgument )
            	    {
            	    // InternalLcDsl.g:823:5: (lv_vmArgs_40_0= ruleVmArgument )
            	    // InternalLcDsl.g:824:6: lv_vmArgs_40_0= ruleVmArgument
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getVmArgsVmArgumentParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_vmArgs_40_0=ruleVmArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vmArgs",
            	    							lv_vmArgs_40_0,
            	    							"com.wamas.ide.launching.LcDsl.VmArgument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLcDsl.g:842:4: ( (lv_progArgs_41_0= ruleProgramArgument ) )
            	    {
            	    // InternalLcDsl.g:842:4: ( (lv_progArgs_41_0= ruleProgramArgument ) )
            	    // InternalLcDsl.g:843:5: (lv_progArgs_41_0= ruleProgramArgument )
            	    {
            	    // InternalLcDsl.g:843:5: (lv_progArgs_41_0= ruleProgramArgument )
            	    // InternalLcDsl.g:844:6: lv_progArgs_41_0= ruleProgramArgument
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getProgArgsProgramArgumentParserRuleCall_7_4_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_progArgs_41_0=ruleProgramArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"progArgs",
            	    							lv_progArgs_41_0,
            	    							"com.wamas.ide.launching.LcDsl.ProgramArgument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLcDsl.g:862:4: ( (lv_envVars_42_0= ruleEnvironmentVariable ) )
            	    {
            	    // InternalLcDsl.g:862:4: ( (lv_envVars_42_0= ruleEnvironmentVariable ) )
            	    // InternalLcDsl.g:863:5: (lv_envVars_42_0= ruleEnvironmentVariable )
            	    {
            	    // InternalLcDsl.g:863:5: (lv_envVars_42_0= ruleEnvironmentVariable )
            	    // InternalLcDsl.g:864:6: lv_envVars_42_0= ruleEnvironmentVariable
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getEnvVarsEnvironmentVariableParserRuleCall_7_5_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_envVars_42_0=ruleEnvironmentVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"envVars",
            	    							lv_envVars_42_0,
            	    							"com.wamas.ide.launching.LcDsl.EnvironmentVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLcDsl.g:882:4: ( (lv_traces_43_0= ruleTraceEnablement ) )
            	    {
            	    // InternalLcDsl.g:882:4: ( (lv_traces_43_0= ruleTraceEnablement ) )
            	    // InternalLcDsl.g:883:5: (lv_traces_43_0= ruleTraceEnablement )
            	    {
            	    // InternalLcDsl.g:883:5: (lv_traces_43_0= ruleTraceEnablement )
            	    // InternalLcDsl.g:884:6: lv_traces_43_0= ruleTraceEnablement
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchConfigAccess().getTracesTraceEnablementParserRuleCall_7_6_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_traces_43_0=ruleTraceEnablement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"traces",
            	    							lv_traces_43_0,
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

            otherlv_44=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_44, grammarAccess.getLaunchConfigAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalLcDsl.g:910:1: entryRuleAddPlugin returns [EObject current=null] : iv_ruleAddPlugin= ruleAddPlugin EOF ;
    public final EObject entryRuleAddPlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPlugin = null;


        try {
            // InternalLcDsl.g:910:50: (iv_ruleAddPlugin= ruleAddPlugin EOF )
            // InternalLcDsl.g:911:2: iv_ruleAddPlugin= ruleAddPlugin EOF
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
    // InternalLcDsl.g:917:1: ruleAddPlugin returns [EObject current=null] : (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' ) ;
    public final EObject ruleAddPlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:923:2: ( (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:924:2: (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:924:2: (otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';' )
            // InternalLcDsl.g:925:3: otherlv_0= 'plugin' ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAddPluginAccess().getPluginKeyword_0());
            		
            // InternalLcDsl.g:929:3: ( (lv_plugin_1_0= rulePluginWithVersionAndStartLevel ) )
            // InternalLcDsl.g:930:4: (lv_plugin_1_0= rulePluginWithVersionAndStartLevel )
            {
            // InternalLcDsl.g:930:4: (lv_plugin_1_0= rulePluginWithVersionAndStartLevel )
            // InternalLcDsl.g:931:5: lv_plugin_1_0= rulePluginWithVersionAndStartLevel
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

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:956:1: entryRuleIgnorePlugin returns [EObject current=null] : iv_ruleIgnorePlugin= ruleIgnorePlugin EOF ;
    public final EObject entryRuleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnorePlugin = null;


        try {
            // InternalLcDsl.g:956:53: (iv_ruleIgnorePlugin= ruleIgnorePlugin EOF )
            // InternalLcDsl.g:957:2: iv_ruleIgnorePlugin= ruleIgnorePlugin EOF
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
    // InternalLcDsl.g:963:1: ruleIgnorePlugin returns [EObject current=null] : (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) ;
    public final EObject ruleIgnorePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:969:2: ( (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:970:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:970:2: (otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';' )
            // InternalLcDsl.g:971:3: otherlv_0= 'ignore' ( (lv_plugin_1_0= rulePluginWithVersion ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIgnorePluginAccess().getIgnoreKeyword_0());
            		
            // InternalLcDsl.g:975:3: ( (lv_plugin_1_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:976:4: (lv_plugin_1_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:976:4: (lv_plugin_1_0= rulePluginWithVersion )
            // InternalLcDsl.g:977:5: lv_plugin_1_0= rulePluginWithVersion
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

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1002:1: entryRuleVmArgument returns [EObject current=null] : iv_ruleVmArgument= ruleVmArgument EOF ;
    public final EObject entryRuleVmArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVmArgument = null;


        try {
            // InternalLcDsl.g:1002:51: (iv_ruleVmArgument= ruleVmArgument EOF )
            // InternalLcDsl.g:1003:2: iv_ruleVmArgument= ruleVmArgument EOF
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
    // InternalLcDsl.g:1009:1: ruleVmArgument returns [EObject current=null] : ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' ) ;
    public final EObject ruleVmArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_arguments_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1015:2: ( ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1016:2: ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1016:2: ( () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1017:3: () otherlv_1= 'vm-arg' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1017:3: ()
            // InternalLcDsl.g:1018:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVmArgumentAccess().getVmArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVmArgumentAccess().getVmArgKeyword_1());
            		
            // InternalLcDsl.g:1028:3: ( (lv_arguments_2_0= RULE_STRING ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLcDsl.g:1029:4: (lv_arguments_2_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:1029:4: (lv_arguments_2_0= RULE_STRING )
            	    // InternalLcDsl.g:1030:5: lv_arguments_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1054:1: entryRuleProgramArgument returns [EObject current=null] : iv_ruleProgramArgument= ruleProgramArgument EOF ;
    public final EObject entryRuleProgramArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramArgument = null;


        try {
            // InternalLcDsl.g:1054:56: (iv_ruleProgramArgument= ruleProgramArgument EOF )
            // InternalLcDsl.g:1055:2: iv_ruleProgramArgument= ruleProgramArgument EOF
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
    // InternalLcDsl.g:1061:1: ruleProgramArgument returns [EObject current=null] : ( () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' ) ;
    public final EObject ruleProgramArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_arguments_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1067:2: ( ( () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1068:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1068:2: ( () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1069:3: () otherlv_1= 'argument' ( (lv_arguments_2_0= RULE_STRING ) )* otherlv_3= ';'
            {
            // InternalLcDsl.g:1069:3: ()
            // InternalLcDsl.g:1070:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramArgumentAccess().getProgramArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramArgumentAccess().getArgumentKeyword_1());
            		
            // InternalLcDsl.g:1080:3: ( (lv_arguments_2_0= RULE_STRING ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLcDsl.g:1081:4: (lv_arguments_2_0= RULE_STRING )
            	    {
            	    // InternalLcDsl.g:1081:4: (lv_arguments_2_0= RULE_STRING )
            	    // InternalLcDsl.g:1082:5: lv_arguments_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1106:1: entryRuleEnvironmentVariable returns [EObject current=null] : iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF ;
    public final EObject entryRuleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariable = null;


        try {
            // InternalLcDsl.g:1106:60: (iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF )
            // InternalLcDsl.g:1107:2: iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF
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
    // InternalLcDsl.g:1113:1: ruleEnvironmentVariable returns [EObject current=null] : ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ) ;
    public final EObject ruleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_EQ_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1119:2: ( ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:1120:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:1120:2: ( () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' )
            // InternalLcDsl.g:1121:3: () otherlv_1= 'environment' ( (lv_name_2_0= RULE_ID ) ) this_EQ_3= RULE_EQ ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:1121:3: ()
            // InternalLcDsl.g:1122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentVariableAccess().getEnvironmentVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentVariableAccess().getEnvironmentKeyword_1());
            		
            // InternalLcDsl.g:1132:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLcDsl.g:1133:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLcDsl.g:1133:4: (lv_name_2_0= RULE_ID )
            // InternalLcDsl.g:1134:5: lv_name_2_0= RULE_ID
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
            		
            // InternalLcDsl.g:1154:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalLcDsl.g:1155:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalLcDsl.g:1155:4: (lv_value_4_0= RULE_STRING )
            // InternalLcDsl.g:1156:5: lv_value_4_0= RULE_STRING
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

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1180:1: entryRuleApplicationExtPoint returns [EObject current=null] : iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF ;
    public final EObject entryRuleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationExtPoint = null;


        try {
            // InternalLcDsl.g:1180:60: (iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF )
            // InternalLcDsl.g:1181:2: iv_ruleApplicationExtPoint= ruleApplicationExtPoint EOF
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
    // InternalLcDsl.g:1187:1: ruleApplicationExtPoint returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleApplicationExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1193:2: ( (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1194:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1194:2: (otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1195:3: otherlv_0= 'application' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationExtPointAccess().getApplicationKeyword_0());
            		
            // InternalLcDsl.g:1199:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1200:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1200:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1201:5: lv_name_1_0= ruleFQName
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

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1226:1: entryRuleProductExtPoint returns [EObject current=null] : iv_ruleProductExtPoint= ruleProductExtPoint EOF ;
    public final EObject entryRuleProductExtPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductExtPoint = null;


        try {
            // InternalLcDsl.g:1226:56: (iv_ruleProductExtPoint= ruleProductExtPoint EOF )
            // InternalLcDsl.g:1227:2: iv_ruleProductExtPoint= ruleProductExtPoint EOF
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
    // InternalLcDsl.g:1233:1: ruleProductExtPoint returns [EObject current=null] : (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) ;
    public final EObject ruleProductExtPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1239:2: ( (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1240:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1240:2: (otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1241:3: otherlv_0= 'product' ( (lv_name_1_0= ruleFQName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProductExtPointAccess().getProductKeyword_0());
            		
            // InternalLcDsl.g:1245:3: ( (lv_name_1_0= ruleFQName ) )
            // InternalLcDsl.g:1246:4: (lv_name_1_0= ruleFQName )
            {
            // InternalLcDsl.g:1246:4: (lv_name_1_0= ruleFQName )
            // InternalLcDsl.g:1247:5: lv_name_1_0= ruleFQName
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

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1272:1: entryRuleFavorites returns [EObject current=null] : iv_ruleFavorites= ruleFavorites EOF ;
    public final EObject entryRuleFavorites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFavorites = null;


        try {
            // InternalLcDsl.g:1272:50: (iv_ruleFavorites= ruleFavorites EOF )
            // InternalLcDsl.g:1273:2: iv_ruleFavorites= ruleFavorites EOF
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
    // InternalLcDsl.g:1279:1: ruleFavorites returns [EObject current=null] : ( () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleFavorites() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_run_3_0=null;
        Token lv_debug_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1285:2: ( ( () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';' ) )
            // InternalLcDsl.g:1286:2: ( () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            {
            // InternalLcDsl.g:1286:2: ( () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';' )
            // InternalLcDsl.g:1287:3: () otherlv_1= 'favorite' ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) ) otherlv_5= ';'
            {
            // InternalLcDsl.g:1287:3: ()
            // InternalLcDsl.g:1288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFavoritesAccess().getFavoritesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFavoritesAccess().getFavoriteKeyword_1());
            		
            // InternalLcDsl.g:1298:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1299:4: ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1299:4: ( ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1300:5: ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFavoritesAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1303:5: ( ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )* )
            // InternalLcDsl.g:1304:6: ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1304:6: ( ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLcDsl.g:1305:4: ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1305:4: ({...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) ) )
            	    // InternalLcDsl.g:1306:5: {...}? => ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFavorites", "getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1306:106: ( ({...}? => ( (lv_run_3_0= 'run' ) ) ) )
            	    // InternalLcDsl.g:1307:6: ({...}? => ( (lv_run_3_0= 'run' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1310:9: ({...}? => ( (lv_run_3_0= 'run' ) ) )
            	    // InternalLcDsl.g:1310:10: {...}? => ( (lv_run_3_0= 'run' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFavorites", "true");
            	    }
            	    // InternalLcDsl.g:1310:19: ( (lv_run_3_0= 'run' ) )
            	    // InternalLcDsl.g:1310:20: (lv_run_3_0= 'run' )
            	    {
            	    // InternalLcDsl.g:1310:20: (lv_run_3_0= 'run' )
            	    // InternalLcDsl.g:1311:10: lv_run_3_0= 'run'
            	    {
            	    lv_run_3_0=(Token)match(input,38,FOLLOW_15); 

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
            	    // InternalLcDsl.g:1328:4: ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1328:4: ({...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) ) )
            	    // InternalLcDsl.g:1329:5: {...}? => ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFavorites", "getUnorderedGroupHelper().canSelect(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:1329:106: ( ({...}? => ( (lv_debug_4_0= 'debug' ) ) ) )
            	    // InternalLcDsl.g:1330:6: ({...}? => ( (lv_debug_4_0= 'debug' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFavoritesAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:1333:9: ({...}? => ( (lv_debug_4_0= 'debug' ) ) )
            	    // InternalLcDsl.g:1333:10: {...}? => ( (lv_debug_4_0= 'debug' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFavorites", "true");
            	    }
            	    // InternalLcDsl.g:1333:19: ( (lv_debug_4_0= 'debug' ) )
            	    // InternalLcDsl.g:1333:20: (lv_debug_4_0= 'debug' )
            	    {
            	    // InternalLcDsl.g:1333:20: (lv_debug_4_0= 'debug' )
            	    // InternalLcDsl.g:1334:10: lv_debug_4_0= 'debug'
            	    {
            	    lv_debug_4_0=(Token)match(input,39,FOLLOW_15); 

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

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1366:1: entryRuleRedirect returns [EObject current=null] : iv_ruleRedirect= ruleRedirect EOF ;
    public final EObject entryRuleRedirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirect = null;


        try {
            // InternalLcDsl.g:1366:49: (iv_ruleRedirect= ruleRedirect EOF )
            // InternalLcDsl.g:1367:2: iv_ruleRedirect= ruleRedirect EOF
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
    // InternalLcDsl.g:1373:1: ruleRedirect returns [EObject current=null] : ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' ) ;
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
            // InternalLcDsl.g:1379:2: ( ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' ) )
            // InternalLcDsl.g:1380:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' )
            {
            // InternalLcDsl.g:1380:2: ( () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';' )
            // InternalLcDsl.g:1381:3: () otherlv_1= 'redirect' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) ) otherlv_9= ';'
            {
            // InternalLcDsl.g:1381:3: ()
            // InternalLcDsl.g:1382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRedirectAccess().getRedirectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRedirectAccess().getRedirectKeyword_1());
            		
            // InternalLcDsl.g:1392:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1393:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1393:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1394:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRedirectAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:1397:5: ( ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )* )
            // InternalLcDsl.g:1398:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1398:6: ( ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( LA9_0 >= 77 && LA9_0 <= 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLcDsl.g:1399:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1399:4: ({...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) ) )
            	    // InternalLcDsl.g:1400:5: {...}? => ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:1400:105: ( ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) ) )
            	    // InternalLcDsl.g:1401:6: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:1404:9: ({...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) ) )
            	    // InternalLcDsl.g:1404:10: {...}? => ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:1404:19: ( ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) ) )
            	    // InternalLcDsl.g:1404:20: ( (lv_outWhich_3_0= ruleOutputStream ) ) otherlv_4= 'to' ( (lv_outFile_5_0= ruleAnyPath ) )
            	    {
            	    // InternalLcDsl.g:1404:20: ( (lv_outWhich_3_0= ruleOutputStream ) )
            	    // InternalLcDsl.g:1405:10: (lv_outWhich_3_0= ruleOutputStream )
            	    {
            	    // InternalLcDsl.g:1405:10: (lv_outWhich_3_0= ruleOutputStream )
            	    // InternalLcDsl.g:1406:11: lv_outWhich_3_0= ruleOutputStream
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
            	    								
            	    // InternalLcDsl.g:1427:9: ( (lv_outFile_5_0= ruleAnyPath ) )
            	    // InternalLcDsl.g:1428:10: (lv_outFile_5_0= ruleAnyPath )
            	    {
            	    // InternalLcDsl.g:1428:10: (lv_outFile_5_0= ruleAnyPath )
            	    // InternalLcDsl.g:1429:11: lv_outFile_5_0= ruleAnyPath
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
            	    // InternalLcDsl.g:1452:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1452:4: ({...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) ) )
            	    // InternalLcDsl.g:1453:5: {...}? => ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "getUnorderedGroupHelper().canSelect(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:1453:105: ( ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) ) )
            	    // InternalLcDsl.g:1454:6: ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRedirectAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:1457:9: ({...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) ) )
            	    // InternalLcDsl.g:1457:10: {...}? => ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRedirect", "true");
            	    }
            	    // InternalLcDsl.g:1457:19: ( ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) ) )
            	    // InternalLcDsl.g:1457:20: ( (lv_inWhich_6_0= ruleInputStream ) ) otherlv_7= 'from' ( (lv_inFile_8_0= ruleExistingPath ) )
            	    {
            	    // InternalLcDsl.g:1457:20: ( (lv_inWhich_6_0= ruleInputStream ) )
            	    // InternalLcDsl.g:1458:10: (lv_inWhich_6_0= ruleInputStream )
            	    {
            	    // InternalLcDsl.g:1458:10: (lv_inWhich_6_0= ruleInputStream )
            	    // InternalLcDsl.g:1459:11: lv_inWhich_6_0= ruleInputStream
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
            	    								
            	    // InternalLcDsl.g:1480:9: ( (lv_inFile_8_0= ruleExistingPath ) )
            	    // InternalLcDsl.g:1481:10: (lv_inFile_8_0= ruleExistingPath )
            	    {
            	    // InternalLcDsl.g:1481:10: (lv_inFile_8_0= ruleExistingPath )
            	    // InternalLcDsl.g:1482:11: lv_inFile_8_0= ruleExistingPath
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

            otherlv_9=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1520:1: entryRuleExecutionEnvironment returns [EObject current=null] : iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF ;
    public final EObject entryRuleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionEnvironment = null;


        try {
            // InternalLcDsl.g:1520:61: (iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF )
            // InternalLcDsl.g:1521:2: iv_ruleExecutionEnvironment= ruleExecutionEnvironment EOF
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
    // InternalLcDsl.g:1527:1: ruleExecutionEnvironment returns [EObject current=null] : (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleExecutionEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1533:2: ( (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1534:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1534:2: (otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1535:3: otherlv_0= 'execution-environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExecutionEnvironmentAccess().getExecutionEnvironmentKeyword_0());
            		
            // InternalLcDsl.g:1539:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLcDsl.g:1540:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLcDsl.g:1540:4: (lv_name_1_0= RULE_ID )
            // InternalLcDsl.g:1541:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1565:1: entryRuleConfigIniTemplate returns [EObject current=null] : iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF ;
    public final EObject entryRuleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigIniTemplate = null;


        try {
            // InternalLcDsl.g:1565:58: (iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF )
            // InternalLcDsl.g:1566:2: iv_ruleConfigIniTemplate= ruleConfigIniTemplate EOF
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
    // InternalLcDsl.g:1572:1: ruleConfigIniTemplate returns [EObject current=null] : (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) ;
    public final EObject ruleConfigIniTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1578:2: ( (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' ) )
            // InternalLcDsl.g:1579:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            {
            // InternalLcDsl.g:1579:2: (otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';' )
            // InternalLcDsl.g:1580:3: otherlv_0= 'config-ini-template' ( (lv_path_1_0= ruleExistingPath ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigIniTemplateAccess().getConfigIniTemplateKeyword_0());
            		
            // InternalLcDsl.g:1584:3: ( (lv_path_1_0= ruleExistingPath ) )
            // InternalLcDsl.g:1585:4: (lv_path_1_0= ruleExistingPath )
            {
            // InternalLcDsl.g:1585:4: (lv_path_1_0= ruleExistingPath )
            // InternalLcDsl.g:1586:5: lv_path_1_0= ruleExistingPath
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

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:1611:1: entryRuleTraceEnablement returns [EObject current=null] : iv_ruleTraceEnablement= ruleTraceEnablement EOF ;
    public final EObject entryRuleTraceEnablement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceEnablement = null;


        try {
            // InternalLcDsl.g:1611:56: (iv_ruleTraceEnablement= ruleTraceEnablement EOF )
            // InternalLcDsl.g:1612:2: iv_ruleTraceEnablement= ruleTraceEnablement EOF
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
    // InternalLcDsl.g:1618:1: ruleTraceEnablement returns [EObject current=null] : (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' ) ;
    public final EObject ruleTraceEnablement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_what_2_0=null;
        Token otherlv_3=null;
        EObject lv_plugin_1_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1624:2: ( (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' ) )
            // InternalLcDsl.g:1625:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' )
            {
            // InternalLcDsl.g:1625:2: (otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';' )
            // InternalLcDsl.g:1626:3: otherlv_0= 'trace' ( (lv_plugin_1_0= rulePluginWithVersion ) ) ( (lv_what_2_0= RULE_ID ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceEnablementAccess().getTraceKeyword_0());
            		
            // InternalLcDsl.g:1630:3: ( (lv_plugin_1_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:1631:4: (lv_plugin_1_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:1631:4: (lv_plugin_1_0= rulePluginWithVersion )
            // InternalLcDsl.g:1632:5: lv_plugin_1_0= rulePluginWithVersion
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

            // InternalLcDsl.g:1649:3: ( (lv_what_2_0= RULE_ID ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLcDsl.g:1650:4: (lv_what_2_0= RULE_ID )
            	    {
            	    // InternalLcDsl.g:1650:4: (lv_what_2_0= RULE_ID )
            	    // InternalLcDsl.g:1651:5: lv_what_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExistingPath"
    // InternalLcDsl.g:1675:1: entryRuleExistingPath returns [EObject current=null] : iv_ruleExistingPath= ruleExistingPath EOF ;
    public final EObject entryRuleExistingPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingPath = null;


        try {
            // InternalLcDsl.g:1675:53: (iv_ruleExistingPath= ruleExistingPath EOF )
            // InternalLcDsl.g:1676:2: iv_ruleExistingPath= ruleExistingPath EOF
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
    // InternalLcDsl.g:1682:1: ruleExistingPath returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleExistingPath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1688:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalLcDsl.g:1689:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalLcDsl.g:1689:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalLcDsl.g:1690:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalLcDsl.g:1690:3: (lv_name_0_0= RULE_STRING )
            // InternalLcDsl.g:1691:4: lv_name_0_0= RULE_STRING
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
    // InternalLcDsl.g:1710:1: entryRuleAnyPath returns [EObject current=null] : iv_ruleAnyPath= ruleAnyPath EOF ;
    public final EObject entryRuleAnyPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyPath = null;


        try {
            // InternalLcDsl.g:1710:48: (iv_ruleAnyPath= ruleAnyPath EOF )
            // InternalLcDsl.g:1711:2: iv_ruleAnyPath= ruleAnyPath EOF
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
    // InternalLcDsl.g:1717:1: ruleAnyPath returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleAnyPath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:1723:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalLcDsl.g:1724:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalLcDsl.g:1724:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalLcDsl.g:1725:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalLcDsl.g:1725:3: (lv_name_0_0= RULE_STRING )
            // InternalLcDsl.g:1726:4: lv_name_0_0= RULE_STRING
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
    // InternalLcDsl.g:1745:1: entryRulePluginWithVersionAndStartLevel returns [EObject current=null] : iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF ;
    public final EObject entryRulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersionAndStartLevel = null;


        try {
            // InternalLcDsl.g:1745:71: (iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF )
            // InternalLcDsl.g:1746:2: iv_rulePluginWithVersionAndStartLevel= rulePluginWithVersionAndStartLevel EOF
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
    // InternalLcDsl.g:1752:1: rulePluginWithVersionAndStartLevel returns [EObject current=null] : ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject rulePluginWithVersionAndStartLevel() throws RecognitionException {
        EObject current = null;

        Token lv_autoStart_2_0=null;
        Token otherlv_3=null;
        Token lv_startLevel_4_0=null;
        EObject lv_plugin_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1758:2: ( ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalLcDsl.g:1759:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalLcDsl.g:1759:2: ( ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalLcDsl.g:1760:3: ( (lv_plugin_0_0= rulePluginWithVersion ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            // InternalLcDsl.g:1760:3: ( (lv_plugin_0_0= rulePluginWithVersion ) )
            // InternalLcDsl.g:1761:4: (lv_plugin_0_0= rulePluginWithVersion )
            {
            // InternalLcDsl.g:1761:4: (lv_plugin_0_0= rulePluginWithVersion )
            // InternalLcDsl.g:1762:5: lv_plugin_0_0= rulePluginWithVersion
            {

            					newCompositeNode(grammarAccess.getPluginWithVersionAndStartLevelAccess().getPluginPluginWithVersionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalLcDsl.g:1779:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:1780:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:1780:4: ( ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:1781:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1());
            				
            // InternalLcDsl.g:1784:5: ( ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalLcDsl.g:1785:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:1785:6: ( ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLcDsl.g:1786:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1786:4: ({...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) ) )
            	    // InternalLcDsl.g:1787:5: {...}? => ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalLcDsl.g:1787:127: ( ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) ) )
            	    // InternalLcDsl.g:1788:6: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalLcDsl.g:1791:9: ({...}? => ( (lv_autoStart_2_0= 'autostart' ) ) )
            	    // InternalLcDsl.g:1791:10: {...}? => ( (lv_autoStart_2_0= 'autostart' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:1791:19: ( (lv_autoStart_2_0= 'autostart' ) )
            	    // InternalLcDsl.g:1791:20: (lv_autoStart_2_0= 'autostart' )
            	    {
            	    // InternalLcDsl.g:1791:20: (lv_autoStart_2_0= 'autostart' )
            	    // InternalLcDsl.g:1792:10: lv_autoStart_2_0= 'autostart'
            	    {
            	    lv_autoStart_2_0=(Token)match(input,46,FOLLOW_20); 

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
            	    // InternalLcDsl.g:1809:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:1809:4: ({...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalLcDsl.g:1810:5: {...}? => ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalLcDsl.g:1810:127: ( ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) ) )
            	    // InternalLcDsl.g:1811:6: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPluginWithVersionAndStartLevelAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalLcDsl.g:1814:9: ({...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) ) )
            	    // InternalLcDsl.g:1814:10: {...}? => (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePluginWithVersionAndStartLevel", "true");
            	    }
            	    // InternalLcDsl.g:1814:19: (otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) ) )
            	    // InternalLcDsl.g:1814:20: otherlv_3= 'startlevel' ( (lv_startLevel_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,47,FOLLOW_21); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPluginWithVersionAndStartLevelAccess().getStartlevelKeyword_1_1_0());
            	    								
            	    // InternalLcDsl.g:1818:9: ( (lv_startLevel_4_0= RULE_INT ) )
            	    // InternalLcDsl.g:1819:10: (lv_startLevel_4_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:1819:10: (lv_startLevel_4_0= RULE_INT )
            	    // InternalLcDsl.g:1820:11: lv_startLevel_4_0= RULE_INT
            	    {
            	    lv_startLevel_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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
            	    break loop11;
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
    // InternalLcDsl.g:1853:1: entryRulePluginWithVersion returns [EObject current=null] : iv_rulePluginWithVersion= rulePluginWithVersion EOF ;
    public final EObject entryRulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginWithVersion = null;


        try {
            // InternalLcDsl.g:1853:58: (iv_rulePluginWithVersion= rulePluginWithVersion EOF )
            // InternalLcDsl.g:1854:2: iv_rulePluginWithVersion= rulePluginWithVersion EOF
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
    // InternalLcDsl.g:1860:1: rulePluginWithVersion returns [EObject current=null] : (this_Plugin_0= rulePlugin ( (lv_version_1_0= RULE_VERSION ) )? ) ;
    public final EObject rulePluginWithVersion() throws RecognitionException {
        EObject current = null;

        Token lv_version_1_0=null;
        EObject this_Plugin_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1866:2: ( (this_Plugin_0= rulePlugin ( (lv_version_1_0= RULE_VERSION ) )? ) )
            // InternalLcDsl.g:1867:2: (this_Plugin_0= rulePlugin ( (lv_version_1_0= RULE_VERSION ) )? )
            {
            // InternalLcDsl.g:1867:2: (this_Plugin_0= rulePlugin ( (lv_version_1_0= RULE_VERSION ) )? )
            // InternalLcDsl.g:1868:3: this_Plugin_0= rulePlugin ( (lv_version_1_0= RULE_VERSION ) )?
            {

            			newCompositeNode(grammarAccess.getPluginWithVersionAccess().getPluginParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Plugin_0=rulePlugin();

            state._fsp--;


            			current = this_Plugin_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLcDsl.g:1876:3: ( (lv_version_1_0= RULE_VERSION ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_VERSION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLcDsl.g:1877:4: (lv_version_1_0= RULE_VERSION )
                    {
                    // InternalLcDsl.g:1877:4: (lv_version_1_0= RULE_VERSION )
                    // InternalLcDsl.g:1878:5: lv_version_1_0= RULE_VERSION
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


    // $ANTLR start "entryRulePlugin"
    // InternalLcDsl.g:1898:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // InternalLcDsl.g:1898:47: (iv_rulePlugin= rulePlugin EOF )
            // InternalLcDsl.g:1899:2: iv_rulePlugin= rulePlugin EOF
            {
             newCompositeNode(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlugin=rulePlugin();

            state._fsp--;

             current =iv_rulePlugin; 
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
    // $ANTLR end "entryRulePlugin"


    // $ANTLR start "rulePlugin"
    // InternalLcDsl.g:1905:1: rulePlugin returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject rulePlugin() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1911:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:1912:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:1912:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:1913:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:1913:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:1914:4: lv_name_0_0= ruleFQName
            {

            				newCompositeNode(grammarAccess.getPluginAccess().getNameFQNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleFQName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPluginRule());
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
    // $ANTLR end "rulePlugin"


    // $ANTLR start "entryRuleProject"
    // InternalLcDsl.g:1934:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalLcDsl.g:1934:48: (iv_ruleProject= ruleProject EOF )
            // InternalLcDsl.g:1935:2: iv_ruleProject= ruleProject EOF
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
    // InternalLcDsl.g:1941:1: ruleProject returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1947:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:1948:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:1948:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:1949:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:1949:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:1950:4: lv_name_0_0= ruleFQName
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
    // InternalLcDsl.g:1970:1: entryRuleJavaType returns [EObject current=null] : iv_ruleJavaType= ruleJavaType EOF ;
    public final EObject entryRuleJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaType = null;


        try {
            // InternalLcDsl.g:1970:49: (iv_ruleJavaType= ruleJavaType EOF )
            // InternalLcDsl.g:1971:2: iv_ruleJavaType= ruleJavaType EOF
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
    // InternalLcDsl.g:1977:1: ruleJavaType returns [EObject current=null] : ( (lv_name_0_0= ruleFQName ) ) ;
    public final EObject ruleJavaType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:1983:2: ( ( (lv_name_0_0= ruleFQName ) ) )
            // InternalLcDsl.g:1984:2: ( (lv_name_0_0= ruleFQName ) )
            {
            // InternalLcDsl.g:1984:2: ( (lv_name_0_0= ruleFQName ) )
            // InternalLcDsl.g:1985:3: (lv_name_0_0= ruleFQName )
            {
            // InternalLcDsl.g:1985:3: (lv_name_0_0= ruleFQName )
            // InternalLcDsl.g:1986:4: lv_name_0_0= ruleFQName
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
    // InternalLcDsl.g:2006:1: entryRuleClearOption returns [EObject current=null] : iv_ruleClearOption= ruleClearOption EOF ;
    public final EObject entryRuleClearOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearOption = null;


        try {
            // InternalLcDsl.g:2006:52: (iv_ruleClearOption= ruleClearOption EOF )
            // InternalLcDsl.g:2007:2: iv_ruleClearOption= ruleClearOption EOF
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
    // InternalLcDsl.g:2013:1: ruleClearOption returns [EObject current=null] : ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleClearOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_workspace_3_0=null;
        Token lv_log_4_0=null;
        Token lv_noAskClear_5_0=null;
        Token lv_config_6_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2019:2: ( ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) ) )
            // InternalLcDsl.g:2020:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) )
            {
            // InternalLcDsl.g:2020:2: ( () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) ) )
            // InternalLcDsl.g:2021:3: () otherlv_1= 'clear' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) )
            {
            // InternalLcDsl.g:2021:3: ()
            // InternalLcDsl.g:2022:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearOptionAccess().getClearOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getClearOptionAccess().getClearKeyword_1());
            		
            // InternalLcDsl.g:2032:3: ( ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2033:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2033:4: ( ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2034:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getClearOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2037:5: ( ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )* )
            // InternalLcDsl.g:2038:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2038:6: ( ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( ( LA15_0 == 25 || LA15_0 == 49 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLcDsl.g:2039:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    {
            	    // InternalLcDsl.g:2039:4: ({...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) ) )
            	    // InternalLcDsl.g:2040:5: {...}? => ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2040:108: ( ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) ) )
            	    // InternalLcDsl.g:2041:6: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2044:9: ({...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? ) )
            	    // InternalLcDsl.g:2044:10: {...}? => ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:2044:19: ( ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )? )
            	    // InternalLcDsl.g:2044:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) ) ( (lv_noAskClear_5_0= '!' ) )?
            	    {
            	    // InternalLcDsl.g:2044:20: ( ( (lv_workspace_3_0= 'workspace' ) ) | ( (lv_log_4_0= 'log' ) ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==25) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==49) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalLcDsl.g:2045:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            {
            	            // InternalLcDsl.g:2045:10: ( (lv_workspace_3_0= 'workspace' ) )
            	            // InternalLcDsl.g:2046:11: (lv_workspace_3_0= 'workspace' )
            	            {
            	            // InternalLcDsl.g:2046:11: (lv_workspace_3_0= 'workspace' )
            	            // InternalLcDsl.g:2047:12: lv_workspace_3_0= 'workspace'
            	            {
            	            lv_workspace_3_0=(Token)match(input,25,FOLLOW_24); 

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
            	            // InternalLcDsl.g:2060:10: ( (lv_log_4_0= 'log' ) )
            	            {
            	            // InternalLcDsl.g:2060:10: ( (lv_log_4_0= 'log' ) )
            	            // InternalLcDsl.g:2061:11: (lv_log_4_0= 'log' )
            	            {
            	            // InternalLcDsl.g:2061:11: (lv_log_4_0= 'log' )
            	            // InternalLcDsl.g:2062:12: lv_log_4_0= 'log'
            	            {
            	            lv_log_4_0=(Token)match(input,49,FOLLOW_24); 

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

            	    // InternalLcDsl.g:2075:9: ( (lv_noAskClear_5_0= '!' ) )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==50) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalLcDsl.g:2076:10: (lv_noAskClear_5_0= '!' )
            	            {
            	            // InternalLcDsl.g:2076:10: (lv_noAskClear_5_0= '!' )
            	            // InternalLcDsl.g:2077:11: lv_noAskClear_5_0= '!'
            	            {
            	            lv_noAskClear_5_0=(Token)match(input,50,FOLLOW_23); 

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
            	    // InternalLcDsl.g:2095:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2095:4: ({...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) ) )
            	    // InternalLcDsl.g:2096:5: {...}? => ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2096:108: ( ({...}? => ( (lv_config_6_0= 'config' ) ) ) )
            	    // InternalLcDsl.g:2097:6: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClearOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2100:9: ({...}? => ( (lv_config_6_0= 'config' ) ) )
            	    // InternalLcDsl.g:2100:10: {...}? => ( (lv_config_6_0= 'config' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClearOption", "true");
            	    }
            	    // InternalLcDsl.g:2100:19: ( (lv_config_6_0= 'config' ) )
            	    // InternalLcDsl.g:2100:20: (lv_config_6_0= 'config' )
            	    {
            	    // InternalLcDsl.g:2100:20: (lv_config_6_0= 'config' )
            	    // InternalLcDsl.g:2101:10: lv_config_6_0= 'config'
            	    {
            	    lv_config_6_0=(Token)match(input,51,FOLLOW_23); 

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
            	    break loop15;
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
    // InternalLcDsl.g:2129:1: entryRuleMemoryOption returns [EObject current=null] : iv_ruleMemoryOption= ruleMemoryOption EOF ;
    public final EObject entryRuleMemoryOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryOption = null;


        try {
            // InternalLcDsl.g:2129:53: (iv_ruleMemoryOption= ruleMemoryOption EOF )
            // InternalLcDsl.g:2130:2: iv_ruleMemoryOption= ruleMemoryOption EOF
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
    // InternalLcDsl.g:2136:1: ruleMemoryOption returns [EObject current=null] : ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalLcDsl.g:2142:2: ( ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) ) )
            // InternalLcDsl.g:2143:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalLcDsl.g:2143:2: ( () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) ) )
            // InternalLcDsl.g:2144:3: () otherlv_1= 'memory' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) )
            {
            // InternalLcDsl.g:2144:3: ()
            // InternalLcDsl.g:2145:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryOptionAccess().getMemoryOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryOptionAccess().getMemoryKeyword_1());
            		
            // InternalLcDsl.g:2155:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2156:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2156:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2157:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2());
            				
            // InternalLcDsl.g:2160:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )* )
            // InternalLcDsl.g:2161:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2161:6: ( ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) ) )*
            loop16:
            do {
                int alt16=4;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
                    alt16=3;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLcDsl.g:2162:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2162:4: ({...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2163:5: {...}? => ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLcDsl.g:2163:109: ( ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2164:6: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLcDsl.g:2167:9: ({...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2167:10: {...}? => (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2167:19: (otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2167:20: otherlv_3= 'min' this_EQ_4= RULE_EQ ( (lv_min_5_0= RULE_INT ) ) ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_3=(Token)match(input,53,FOLLOW_14); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMemoryOptionAccess().getMinKeyword_2_0_0());
            	    								
            	    this_EQ_4=(Token)match(input,RULE_EQ,FOLLOW_21); 

            	    									newLeafNode(this_EQ_4, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_0_1());
            	    								
            	    // InternalLcDsl.g:2175:9: ( (lv_min_5_0= RULE_INT ) )
            	    // InternalLcDsl.g:2176:10: (lv_min_5_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2176:10: (lv_min_5_0= RULE_INT )
            	    // InternalLcDsl.g:2177:11: lv_min_5_0= RULE_INT
            	    {
            	    lv_min_5_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            	    // InternalLcDsl.g:2193:9: ( (lv_minUnit_6_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2194:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2194:10: (lv_minUnit_6_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2195:11: lv_minUnit_6_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getMinUnitMemoryUnitEnumRuleCall_2_0_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
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
            	    // InternalLcDsl.g:2218:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2218:4: ({...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2219:5: {...}? => ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLcDsl.g:2219:109: ( ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2220:6: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLcDsl.g:2223:9: ({...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2223:10: {...}? => (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2223:19: (otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2223:20: otherlv_7= 'max' this_EQ_8= RULE_EQ ( (lv_max_9_0= RULE_INT ) ) ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_7=(Token)match(input,54,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMemoryOptionAccess().getMaxKeyword_2_1_0());
            	    								
            	    this_EQ_8=(Token)match(input,RULE_EQ,FOLLOW_21); 

            	    									newLeafNode(this_EQ_8, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_1_1());
            	    								
            	    // InternalLcDsl.g:2231:9: ( (lv_max_9_0= RULE_INT ) )
            	    // InternalLcDsl.g:2232:10: (lv_max_9_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2232:10: (lv_max_9_0= RULE_INT )
            	    // InternalLcDsl.g:2233:11: lv_max_9_0= RULE_INT
            	    {
            	    lv_max_9_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            	    // InternalLcDsl.g:2249:9: ( (lv_maxUnit_10_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2250:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2250:10: (lv_maxUnit_10_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2251:11: lv_maxUnit_10_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getMaxUnitMemoryUnitEnumRuleCall_2_1_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
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
            	    // InternalLcDsl.g:2274:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2274:4: ({...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) ) )
            	    // InternalLcDsl.g:2275:5: {...}? => ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "getUnorderedGroupHelper().canSelect(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLcDsl.g:2275:109: ( ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) ) )
            	    // InternalLcDsl.g:2276:6: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMemoryOptionAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLcDsl.g:2279:9: ({...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) ) )
            	    // InternalLcDsl.g:2279:10: {...}? => (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMemoryOption", "true");
            	    }
            	    // InternalLcDsl.g:2279:19: (otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) ) )
            	    // InternalLcDsl.g:2279:20: otherlv_11= 'perm' this_EQ_12= RULE_EQ ( (lv_perm_13_0= RULE_INT ) ) ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    {
            	    otherlv_11=(Token)match(input,55,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMemoryOptionAccess().getPermKeyword_2_2_0());
            	    								
            	    this_EQ_12=(Token)match(input,RULE_EQ,FOLLOW_21); 

            	    									newLeafNode(this_EQ_12, grammarAccess.getMemoryOptionAccess().getEQTerminalRuleCall_2_2_1());
            	    								
            	    // InternalLcDsl.g:2287:9: ( (lv_perm_13_0= RULE_INT ) )
            	    // InternalLcDsl.g:2288:10: (lv_perm_13_0= RULE_INT )
            	    {
            	    // InternalLcDsl.g:2288:10: (lv_perm_13_0= RULE_INT )
            	    // InternalLcDsl.g:2289:11: lv_perm_13_0= RULE_INT
            	    {
            	    lv_perm_13_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            	    // InternalLcDsl.g:2305:9: ( (lv_permUnit_14_0= ruleMemoryUnit ) )
            	    // InternalLcDsl.g:2306:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    {
            	    // InternalLcDsl.g:2306:10: (lv_permUnit_14_0= ruleMemoryUnit )
            	    // InternalLcDsl.g:2307:11: lv_permUnit_14_0= ruleMemoryUnit
            	    {

            	    											newCompositeNode(grammarAccess.getMemoryOptionAccess().getPermUnitMemoryUnitEnumRuleCall_2_2_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
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
            	    break loop16;
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
    // InternalLcDsl.g:2341:1: entryRuleGroupMember returns [EObject current=null] : iv_ruleGroupMember= ruleGroupMember EOF ;
    public final EObject entryRuleGroupMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupMember = null;


        try {
            // InternalLcDsl.g:2341:52: (iv_ruleGroupMember= ruleGroupMember EOF )
            // InternalLcDsl.g:2342:2: iv_ruleGroupMember= ruleGroupMember EOF
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
    // InternalLcDsl.g:2348:1: ruleGroupMember returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) ;
    public final EObject ruleGroupMember() throws RecognitionException {
        EObject current = null;

        Token lv_adopt_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_postAction_5_0 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2354:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' ) )
            // InternalLcDsl.g:2355:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            {
            // InternalLcDsl.g:2355:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';' )
            // InternalLcDsl.g:2356:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) ) otherlv_3= 'member' ( ( ruleFQName ) ) ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )? otherlv_6= ';'
            {
            // InternalLcDsl.g:2356:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) ) )
            // InternalLcDsl.g:2357:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            {
            // InternalLcDsl.g:2357:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* ) )
            // InternalLcDsl.g:2358:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            				
            // InternalLcDsl.g:2361:5: ( ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )* )
            // InternalLcDsl.g:2362:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            {
            // InternalLcDsl.g:2362:6: ( ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( ( LA17_0 >= 38 && LA17_0 <= 39 || LA17_0 >= 66 && LA17_0 <= 68 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLcDsl.g:2363:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2363:4: ({...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) ) )
            	    // InternalLcDsl.g:2364:5: {...}? => ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalLcDsl.g:2364:108: ( ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) ) )
            	    // InternalLcDsl.g:2365:6: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalLcDsl.g:2368:9: ({...}? => ( (lv_type_1_0= ruleLaunchModeType ) ) )
            	    // InternalLcDsl.g:2368:10: {...}? => ( (lv_type_1_0= ruleLaunchModeType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:2368:19: ( (lv_type_1_0= ruleLaunchModeType ) )
            	    // InternalLcDsl.g:2368:20: (lv_type_1_0= ruleLaunchModeType )
            	    {
            	    // InternalLcDsl.g:2368:20: (lv_type_1_0= ruleLaunchModeType )
            	    // InternalLcDsl.g:2369:10: lv_type_1_0= ruleLaunchModeType
            	    {

            	    										newCompositeNode(grammarAccess.getGroupMemberAccess().getTypeLaunchModeTypeEnumRuleCall_0_0_0());
            	    									
            	    pushFollow(FOLLOW_27);
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
            	    // InternalLcDsl.g:2391:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    {
            	    // InternalLcDsl.g:2391:4: ({...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) ) )
            	    // InternalLcDsl.g:2392:5: {...}? => ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalLcDsl.g:2392:108: ( ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) ) )
            	    // InternalLcDsl.g:2393:6: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalLcDsl.g:2396:9: ({...}? => ( (lv_adopt_2_0= 'adopt' ) ) )
            	    // InternalLcDsl.g:2396:10: {...}? => ( (lv_adopt_2_0= 'adopt' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroupMember", "true");
            	    }
            	    // InternalLcDsl.g:2396:19: ( (lv_adopt_2_0= 'adopt' ) )
            	    // InternalLcDsl.g:2396:20: (lv_adopt_2_0= 'adopt' )
            	    {
            	    // InternalLcDsl.g:2396:20: (lv_adopt_2_0= 'adopt' )
            	    // InternalLcDsl.g:2397:10: lv_adopt_2_0= 'adopt'
            	    {
            	    lv_adopt_2_0=(Token)match(input,56,FOLLOW_27); 

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
            	    break loop17;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGroupMemberAccess().getUnorderedGroup_0());
            				

            }

            otherlv_3=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupMemberAccess().getMemberKeyword_1());
            		
            // InternalLcDsl.g:2425:3: ( ( ruleFQName ) )
            // InternalLcDsl.g:2426:4: ( ruleFQName )
            {
            // InternalLcDsl.g:2426:4: ( ruleFQName )
            // InternalLcDsl.g:2427:5: ruleFQName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGroupMemberAccess().getMemberLaunchConfigCrossReference_2_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLcDsl.g:2441:3: ( (lv_postAction_5_0= ruleGroupPostLaunchAction ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=58 && LA18_0<=60)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLcDsl.g:2442:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    {
                    // InternalLcDsl.g:2442:4: (lv_postAction_5_0= ruleGroupPostLaunchAction )
                    // InternalLcDsl.g:2443:5: lv_postAction_5_0= ruleGroupPostLaunchAction
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

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

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
    // InternalLcDsl.g:2468:1: entryRuleGroupPostLaunchAction returns [EObject current=null] : iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF ;
    public final EObject entryRuleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchAction = null;


        try {
            // InternalLcDsl.g:2468:62: (iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF )
            // InternalLcDsl.g:2469:2: iv_ruleGroupPostLaunchAction= ruleGroupPostLaunchAction EOF
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
    // InternalLcDsl.g:2475:1: ruleGroupPostLaunchAction returns [EObject current=null] : (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) ;
    public final EObject ruleGroupPostLaunchAction() throws RecognitionException {
        EObject current = null;

        EObject this_GroupPostLaunchDelay_0 = null;

        EObject this_GroupPostLaunchRegex_1 = null;

        EObject this_GroupPostLaunchWait_2 = null;



        	enterRule();

        try {
            // InternalLcDsl.g:2481:2: ( (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait ) )
            // InternalLcDsl.g:2482:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            {
            // InternalLcDsl.g:2482:2: (this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay | this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex | this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt19=1;
                }
                break;
            case 59:
                {
                alt19=2;
                }
                break;
            case 60:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalLcDsl.g:2483:3: this_GroupPostLaunchDelay_0= ruleGroupPostLaunchDelay
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
                    // InternalLcDsl.g:2492:3: this_GroupPostLaunchRegex_1= ruleGroupPostLaunchRegex
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
                    // InternalLcDsl.g:2501:3: this_GroupPostLaunchWait_2= ruleGroupPostLaunchWait
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
    // InternalLcDsl.g:2513:1: entryRuleGroupPostLaunchDelay returns [EObject current=null] : iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF ;
    public final EObject entryRuleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchDelay = null;


        try {
            // InternalLcDsl.g:2513:61: (iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF )
            // InternalLcDsl.g:2514:2: iv_ruleGroupPostLaunchDelay= ruleGroupPostLaunchDelay EOF
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
    // InternalLcDsl.g:2520:1: ruleGroupPostLaunchDelay returns [EObject current=null] : (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGroupPostLaunchDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_delay_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2526:2: ( (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) ) )
            // InternalLcDsl.g:2527:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            {
            // InternalLcDsl.g:2527:2: (otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) ) )
            // InternalLcDsl.g:2528:3: otherlv_0= 'delay' ( (lv_delay_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchDelayAccess().getDelayKeyword_0());
            		
            // InternalLcDsl.g:2532:3: ( (lv_delay_1_0= RULE_INT ) )
            // InternalLcDsl.g:2533:4: (lv_delay_1_0= RULE_INT )
            {
            // InternalLcDsl.g:2533:4: (lv_delay_1_0= RULE_INT )
            // InternalLcDsl.g:2534:5: lv_delay_1_0= RULE_INT
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
    // InternalLcDsl.g:2554:1: entryRuleGroupPostLaunchRegex returns [EObject current=null] : iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF ;
    public final EObject entryRuleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchRegex = null;


        try {
            // InternalLcDsl.g:2554:61: (iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF )
            // InternalLcDsl.g:2555:2: iv_ruleGroupPostLaunchRegex= ruleGroupPostLaunchRegex EOF
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
    // InternalLcDsl.g:2561:1: ruleGroupPostLaunchRegex returns [EObject current=null] : (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupPostLaunchRegex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_regex_1_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2567:2: ( (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) ) )
            // InternalLcDsl.g:2568:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            {
            // InternalLcDsl.g:2568:2: (otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) ) )
            // InternalLcDsl.g:2569:3: otherlv_0= 'regex' ( (lv_regex_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupPostLaunchRegexAccess().getRegexKeyword_0());
            		
            // InternalLcDsl.g:2573:3: ( (lv_regex_1_0= RULE_STRING ) )
            // InternalLcDsl.g:2574:4: (lv_regex_1_0= RULE_STRING )
            {
            // InternalLcDsl.g:2574:4: (lv_regex_1_0= RULE_STRING )
            // InternalLcDsl.g:2575:5: lv_regex_1_0= RULE_STRING
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
    // InternalLcDsl.g:2595:1: entryRuleGroupPostLaunchWait returns [EObject current=null] : iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF ;
    public final EObject entryRuleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupPostLaunchWait = null;


        try {
            // InternalLcDsl.g:2595:60: (iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF )
            // InternalLcDsl.g:2596:2: iv_ruleGroupPostLaunchWait= ruleGroupPostLaunchWait EOF
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
    // InternalLcDsl.g:2602:1: ruleGroupPostLaunchWait returns [EObject current=null] : ( () otherlv_1= 'wait' ) ;
    public final EObject ruleGroupPostLaunchWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2608:2: ( ( () otherlv_1= 'wait' ) )
            // InternalLcDsl.g:2609:2: ( () otherlv_1= 'wait' )
            {
            // InternalLcDsl.g:2609:2: ( () otherlv_1= 'wait' )
            // InternalLcDsl.g:2610:3: () otherlv_1= 'wait'
            {
            // InternalLcDsl.g:2610:3: ()
            // InternalLcDsl.g:2611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupPostLaunchWaitAccess().getGroupPostLaunchWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

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
    // InternalLcDsl.g:2625:1: entryRuleFQName returns [String current=null] : iv_ruleFQName= ruleFQName EOF ;
    public final String entryRuleFQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQName = null;


        try {
            // InternalLcDsl.g:2625:46: (iv_ruleFQName= ruleFQName EOF )
            // InternalLcDsl.g:2626:2: iv_ruleFQName= ruleFQName EOF
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
    // InternalLcDsl.g:2632:1: ruleFQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2638:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLcDsl.g:2639:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLcDsl.g:2639:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLcDsl.g:2640:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLcDsl.g:2647:3: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==61) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLcDsl.g:2648:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,61,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "ruleLaunchConfigType"
    // InternalLcDsl.g:2665:1: ruleLaunchConfigType returns [Enumerator current=null] : ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) ) ;
    public final Enumerator ruleLaunchConfigType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2671:2: ( ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) ) )
            // InternalLcDsl.g:2672:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) )
            {
            // InternalLcDsl.g:2672:2: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'eclipse' ) | (enumLiteral_2= 'rap' ) | (enumLiteral_3= 'group' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt21=1;
                }
                break;
            case 63:
                {
                alt21=2;
                }
                break;
            case 64:
                {
                alt21=3;
                }
                break;
            case 65:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalLcDsl.g:2673:3: (enumLiteral_0= 'java' )
                    {
                    // InternalLcDsl.g:2673:3: (enumLiteral_0= 'java' )
                    // InternalLcDsl.g:2674:4: enumLiteral_0= 'java'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchConfigTypeAccess().getJAVAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:2681:3: (enumLiteral_1= 'eclipse' )
                    {
                    // InternalLcDsl.g:2681:3: (enumLiteral_1= 'eclipse' )
                    // InternalLcDsl.g:2682:4: enumLiteral_1= 'eclipse'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchConfigTypeAccess().getECLIPSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:2689:3: (enumLiteral_2= 'rap' )
                    {
                    // InternalLcDsl.g:2689:3: (enumLiteral_2= 'rap' )
                    // InternalLcDsl.g:2690:4: enumLiteral_2= 'rap'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchConfigTypeAccess().getRAPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:2697:3: (enumLiteral_3= 'group' )
                    {
                    // InternalLcDsl.g:2697:3: (enumLiteral_3= 'group' )
                    // InternalLcDsl.g:2698:4: enumLiteral_3= 'group'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

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
    // InternalLcDsl.g:2708:1: ruleLaunchModeType returns [Enumerator current=null] : ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) ) ;
    public final Enumerator ruleLaunchModeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2714:2: ( ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) ) )
            // InternalLcDsl.g:2715:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) )
            {
            // InternalLcDsl.g:2715:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'debug' ) | (enumLiteral_2= 'profile' ) | (enumLiteral_3= 'coverage' ) | (enumLiteral_4= 'inherit' ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt22=1;
                }
                break;
            case 39:
                {
                alt22=2;
                }
                break;
            case 66:
                {
                alt22=3;
                }
                break;
            case 67:
                {
                alt22=4;
                }
                break;
            case 68:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalLcDsl.g:2716:3: (enumLiteral_0= 'run' )
                    {
                    // InternalLcDsl.g:2716:3: (enumLiteral_0= 'run' )
                    // InternalLcDsl.g:2717:4: enumLiteral_0= 'run'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLaunchModeTypeAccess().getRUNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:2724:3: (enumLiteral_1= 'debug' )
                    {
                    // InternalLcDsl.g:2724:3: (enumLiteral_1= 'debug' )
                    // InternalLcDsl.g:2725:4: enumLiteral_1= 'debug'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLaunchModeTypeAccess().getDEBUGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:2732:3: (enumLiteral_2= 'profile' )
                    {
                    // InternalLcDsl.g:2732:3: (enumLiteral_2= 'profile' )
                    // InternalLcDsl.g:2733:4: enumLiteral_2= 'profile'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLaunchModeTypeAccess().getPROFILEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:2740:3: (enumLiteral_3= 'coverage' )
                    {
                    // InternalLcDsl.g:2740:3: (enumLiteral_3= 'coverage' )
                    // InternalLcDsl.g:2741:4: enumLiteral_3= 'coverage'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLaunchModeTypeAccess().getCOVERAGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:2748:3: (enumLiteral_4= 'inherit' )
                    {
                    // InternalLcDsl.g:2748:3: (enumLiteral_4= 'inherit' )
                    // InternalLcDsl.g:2749:4: enumLiteral_4= 'inherit'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

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
    // InternalLcDsl.g:2759:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) ) ;
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
            // InternalLcDsl.g:2765:2: ( ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) ) )
            // InternalLcDsl.g:2766:2: ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) )
            {
            // InternalLcDsl.g:2766:2: ( (enumLiteral_0= 'MB' ) | (enumLiteral_1= 'mb' ) | (enumLiteral_2= 'M' ) | (enumLiteral_3= 'm' ) | (enumLiteral_4= 'GB' ) | (enumLiteral_5= 'gb' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'g' ) )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt23=1;
                }
                break;
            case 70:
                {
                alt23=2;
                }
                break;
            case 71:
                {
                alt23=3;
                }
                break;
            case 72:
                {
                alt23=4;
                }
                break;
            case 73:
                {
                alt23=5;
                }
                break;
            case 74:
                {
                alt23=6;
                }
                break;
            case 75:
                {
                alt23=7;
                }
                break;
            case 76:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalLcDsl.g:2767:3: (enumLiteral_0= 'MB' )
                    {
                    // InternalLcDsl.g:2767:3: (enumLiteral_0= 'MB' )
                    // InternalLcDsl.g:2768:4: enumLiteral_0= 'MB'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:2775:3: (enumLiteral_1= 'mb' )
                    {
                    // InternalLcDsl.g:2775:3: (enumLiteral_1= 'mb' )
                    // InternalLcDsl.g:2776:4: enumLiteral_1= 'mb'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:2783:3: (enumLiteral_2= 'M' )
                    {
                    // InternalLcDsl.g:2783:3: (enumLiteral_2= 'M' )
                    // InternalLcDsl.g:2784:4: enumLiteral_2= 'M'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLcDsl.g:2791:3: (enumLiteral_3= 'm' )
                    {
                    // InternalLcDsl.g:2791:3: (enumLiteral_3= 'm' )
                    // InternalLcDsl.g:2792:4: enumLiteral_3= 'm'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLcDsl.g:2799:3: (enumLiteral_4= 'GB' )
                    {
                    // InternalLcDsl.g:2799:3: (enumLiteral_4= 'GB' )
                    // InternalLcDsl.g:2800:4: enumLiteral_4= 'GB'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLcDsl.g:2807:3: (enumLiteral_5= 'gb' )
                    {
                    // InternalLcDsl.g:2807:3: (enumLiteral_5= 'gb' )
                    // InternalLcDsl.g:2808:4: enumLiteral_5= 'gb'
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLcDsl.g:2815:3: (enumLiteral_6= 'G' )
                    {
                    // InternalLcDsl.g:2815:3: (enumLiteral_6= 'G' )
                    // InternalLcDsl.g:2816:4: enumLiteral_6= 'G'
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalLcDsl.g:2823:3: (enumLiteral_7= 'g' )
                    {
                    // InternalLcDsl.g:2823:3: (enumLiteral_7= 'g' )
                    // InternalLcDsl.g:2824:4: enumLiteral_7= 'g'
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_2); 

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
    // InternalLcDsl.g:2834:1: ruleOutputStream returns [Enumerator current=null] : ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) ;
    public final Enumerator ruleOutputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2840:2: ( ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) ) )
            // InternalLcDsl.g:2841:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
            {
            // InternalLcDsl.g:2841:2: ( (enumLiteral_0= 'stdout' ) | (enumLiteral_1= 'stderr' ) | (enumLiteral_2= 'both-out' ) )
            int alt24=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalLcDsl.g:2842:3: (enumLiteral_0= 'stdout' )
                    {
                    // InternalLcDsl.g:2842:3: (enumLiteral_0= 'stdout' )
                    // InternalLcDsl.g:2843:4: enumLiteral_0= 'stdout'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOutputStreamAccess().getSTDOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:2850:3: (enumLiteral_1= 'stderr' )
                    {
                    // InternalLcDsl.g:2850:3: (enumLiteral_1= 'stderr' )
                    // InternalLcDsl.g:2851:4: enumLiteral_1= 'stderr'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOutputStreamAccess().getSTDERREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLcDsl.g:2858:3: (enumLiteral_2= 'both-out' )
                    {
                    // InternalLcDsl.g:2858:3: (enumLiteral_2= 'both-out' )
                    // InternalLcDsl.g:2859:4: enumLiteral_2= 'both-out'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

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
    // InternalLcDsl.g:2869:1: ruleInputStream returns [Enumerator current=null] : (enumLiteral_0= 'stdin' ) ;
    public final Enumerator ruleInputStream() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalLcDsl.g:2875:2: ( (enumLiteral_0= 'stdin' ) )
            // InternalLcDsl.g:2876:2: (enumLiteral_0= 'stdin' )
            {
            // InternalLcDsl.g:2876:2: (enumLiteral_0= 'stdin' )
            // InternalLcDsl.g:2877:3: enumLiteral_0= 'stdin'
            {
            enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\31\15\uffff";
    static final String dfa_3s = "\1\104\15\uffff";
    static final String dfa_4s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_5s = "\1\0\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\1\6\1\7\6\1\1\10\1\11\1\12\2\1\1\13\2\uffff\1\14\1\15\1\1\2\uffff\1\2\3\uffff\1\5\3\uffff\2\1\10\uffff\3\1",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 365:6: ( ({...}? => ( ({...}? => ( ( (lv_clears_15_0= ruleClearOption ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workspace' ( (lv_workspace_18_0= ruleAnyPath ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'working-dir' ( (lv_workingDir_21_0= ruleExistingPath ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_memory_23_0= ruleMemoryOption ) ) otherlv_24= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'project' ( (lv_project_26_0= ruleProject ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'main-class' ( (lv_mainClass_29_0= ruleJavaType ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_application_31_0= ruleApplicationExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_product_32_0= ruleProductExtPoint ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_favorites_33_0= ruleFavorites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_redirect_34_0= ruleRedirect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_execEnv_35_0= ruleExecutionEnvironment ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_configIniTemplate_36_0= ruleConfigIniTemplate ) ) ) ) ) )*";
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
                        if ( ((LA4_0>=29 && LA4_0<=34)||(LA4_0>=38 && LA4_0<=39)||LA4_0==45||(LA4_0>=56 && LA4_0<=57)||(LA4_0>=66 && LA4_0<=68)) ) {s = 1;}

                        else if ( LA4_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 0) ) {s = 2;}

                        else if ( LA4_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 1) ) {s = 3;}

                        else if ( LA4_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 2) ) {s = 4;}

                        else if ( LA4_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 3) ) {s = 5;}

                        else if ( LA4_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 4) ) {s = 6;}

                        else if ( LA4_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 5) ) {s = 7;}

                        else if ( LA4_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 6) ) {s = 8;}

                        else if ( LA4_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 7) ) {s = 9;}

                        else if ( LA4_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 8) ) {s = 10;}

                        else if ( LA4_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 9) ) {s = 11;}

                        else if ( LA4_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 10) ) {s = 12;}

                        else if ( LA4_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getLaunchConfigAccess().getUnorderedGroup_6(), 11) ) {s = 13;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xC0000000001FC002L,0x0000000000000003L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xC0000000003FC000L,0x0000000000000003L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x031139FFFE000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x030020C7E0000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000A000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000E000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x030000C000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1C00000001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2000000000000002L});

}
