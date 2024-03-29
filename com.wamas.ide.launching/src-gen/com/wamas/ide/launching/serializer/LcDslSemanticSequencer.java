/*
 * generated by Xtext 2.25.0
 */
package com.wamas.ide.launching.serializer;

import com.google.inject.Inject;
import com.wamas.ide.launching.lcDsl.AddFeature;
import com.wamas.ide.launching.lcDsl.AddPlugin;
import com.wamas.ide.launching.lcDsl.AnyPath;
import com.wamas.ide.launching.lcDsl.ApplicationExtPoint;
import com.wamas.ide.launching.lcDsl.ClearOption;
import com.wamas.ide.launching.lcDsl.ConfigIniTemplate;
import com.wamas.ide.launching.lcDsl.ContentProviderProduct;
import com.wamas.ide.launching.lcDsl.EnvironmentVariable;
import com.wamas.ide.launching.lcDsl.ExecutionEnvironment;
import com.wamas.ide.launching.lcDsl.ExistingPath;
import com.wamas.ide.launching.lcDsl.Favorites;
import com.wamas.ide.launching.lcDsl.FeatureWithVersion;
import com.wamas.ide.launching.lcDsl.GroupMember;
import com.wamas.ide.launching.lcDsl.GroupPostLaunchDelay;
import com.wamas.ide.launching.lcDsl.GroupPostLaunchRegex;
import com.wamas.ide.launching.lcDsl.GroupPostLaunchWait;
import com.wamas.ide.launching.lcDsl.IgnorePlugin;
import com.wamas.ide.launching.lcDsl.JavaMainSearch;
import com.wamas.ide.launching.lcDsl.JavaMainType;
import com.wamas.ide.launching.lcDsl.LCModel;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.lcDsl.MainProject;
import com.wamas.ide.launching.lcDsl.MainType;
import com.wamas.ide.launching.lcDsl.MemoryOption;
import com.wamas.ide.launching.lcDsl.PluginWithVersion;
import com.wamas.ide.launching.lcDsl.PluginWithVersionAndStartLevel;
import com.wamas.ide.launching.lcDsl.ProductExtPoint;
import com.wamas.ide.launching.lcDsl.ProgramArgument;
import com.wamas.ide.launching.lcDsl.Project;
import com.wamas.ide.launching.lcDsl.RapServletConfig;
import com.wamas.ide.launching.lcDsl.Redirect;
import com.wamas.ide.launching.lcDsl.StringWithVariables;
import com.wamas.ide.launching.lcDsl.TestConfig;
import com.wamas.ide.launching.lcDsl.TraceEnablement;
import com.wamas.ide.launching.lcDsl.VmArgument;
import com.wamas.ide.launching.lcDsl.WorkingDir;
import com.wamas.ide.launching.lcDsl.Workspace;
import com.wamas.ide.launching.services.LcDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LcDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LcDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LcDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LcDslPackage.ADD_FEATURE:
				sequence_AddFeature(context, (AddFeature) semanticObject); 
				return; 
			case LcDslPackage.ADD_PLUGIN:
				sequence_AddPlugin(context, (AddPlugin) semanticObject); 
				return; 
			case LcDslPackage.ANY_PATH:
				sequence_AnyPath(context, (AnyPath) semanticObject); 
				return; 
			case LcDslPackage.APPLICATION_EXT_POINT:
				sequence_ApplicationExtPoint(context, (ApplicationExtPoint) semanticObject); 
				return; 
			case LcDslPackage.CLEAR_OPTION:
				sequence_ClearOption(context, (ClearOption) semanticObject); 
				return; 
			case LcDslPackage.CONFIG_INI_TEMPLATE:
				sequence_ConfigIniTemplate(context, (ConfigIniTemplate) semanticObject); 
				return; 
			case LcDslPackage.CONTENT_PROVIDER_PRODUCT:
				sequence_ContentProviderProduct(context, (ContentProviderProduct) semanticObject); 
				return; 
			case LcDslPackage.ENVIRONMENT_VARIABLE:
				sequence_EnvironmentVariable(context, (EnvironmentVariable) semanticObject); 
				return; 
			case LcDslPackage.EXECUTION_ENVIRONMENT:
				sequence_ExecutionEnvironment(context, (ExecutionEnvironment) semanticObject); 
				return; 
			case LcDslPackage.EXISTING_PATH:
				sequence_ExistingPath(context, (ExistingPath) semanticObject); 
				return; 
			case LcDslPackage.FAVORITES:
				sequence_Favorites(context, (Favorites) semanticObject); 
				return; 
			case LcDslPackage.FEATURE_WITH_VERSION:
				sequence_FeatureWithVersion(context, (FeatureWithVersion) semanticObject); 
				return; 
			case LcDslPackage.GROUP_MEMBER:
				sequence_GroupMember(context, (GroupMember) semanticObject); 
				return; 
			case LcDslPackage.GROUP_POST_LAUNCH_DELAY:
				sequence_GroupPostLaunchDelay(context, (GroupPostLaunchDelay) semanticObject); 
				return; 
			case LcDslPackage.GROUP_POST_LAUNCH_REGEX:
				sequence_GroupPostLaunchRegex(context, (GroupPostLaunchRegex) semanticObject); 
				return; 
			case LcDslPackage.GROUP_POST_LAUNCH_WAIT:
				sequence_GroupPostLaunchWait(context, (GroupPostLaunchWait) semanticObject); 
				return; 
			case LcDslPackage.IGNORE_PLUGIN:
				sequence_IgnorePlugin(context, (IgnorePlugin) semanticObject); 
				return; 
			case LcDslPackage.JAVA_MAIN_SEARCH:
				sequence_JavaMainSearch(context, (JavaMainSearch) semanticObject); 
				return; 
			case LcDslPackage.JAVA_MAIN_TYPE:
				sequence_JavaMainType(context, (JavaMainType) semanticObject); 
				return; 
			case LcDslPackage.LC_MODEL:
				sequence_LCModel(context, (LCModel) semanticObject); 
				return; 
			case LcDslPackage.LAUNCH_CONFIG:
				sequence_LaunchConfig(context, (LaunchConfig) semanticObject); 
				return; 
			case LcDslPackage.MAIN_PROJECT:
				sequence_MainProject(context, (MainProject) semanticObject); 
				return; 
			case LcDslPackage.MAIN_TYPE:
				sequence_MainType(context, (MainType) semanticObject); 
				return; 
			case LcDslPackage.MEMORY_OPTION:
				sequence_MemoryOption(context, (MemoryOption) semanticObject); 
				return; 
			case LcDslPackage.PLUGIN_WITH_VERSION:
				sequence_PluginWithVersion(context, (PluginWithVersion) semanticObject); 
				return; 
			case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL:
				sequence_PluginWithVersionAndStartLevel(context, (PluginWithVersionAndStartLevel) semanticObject); 
				return; 
			case LcDslPackage.PRODUCT_EXT_POINT:
				sequence_ProductExtPoint(context, (ProductExtPoint) semanticObject); 
				return; 
			case LcDslPackage.PROGRAM_ARGUMENT:
				sequence_ProgramArgument(context, (ProgramArgument) semanticObject); 
				return; 
			case LcDslPackage.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case LcDslPackage.RAP_SERVLET_CONFIG:
				sequence_RapServletConfig(context, (RapServletConfig) semanticObject); 
				return; 
			case LcDslPackage.REDIRECT:
				sequence_Redirect(context, (Redirect) semanticObject); 
				return; 
			case LcDslPackage.STRING_WITH_VARIABLES:
				sequence_StringWithVariables(context, (StringWithVariables) semanticObject); 
				return; 
			case LcDslPackage.TEST_CONFIG:
				sequence_TestConfig(context, (TestConfig) semanticObject); 
				return; 
			case LcDslPackage.TRACE_ENABLEMENT:
				sequence_TraceEnablement(context, (TraceEnablement) semanticObject); 
				return; 
			case LcDslPackage.VM_ARGUMENT:
				sequence_VmArgument(context, (VmArgument) semanticObject); 
				return; 
			case LcDslPackage.WORKING_DIR:
				sequence_WorkingDir(context, (WorkingDir) semanticObject); 
				return; 
			case LcDslPackage.WORKSPACE:
				sequence_Workspace(context, (Workspace) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AddFeature returns AddFeature
	 *
	 * Constraint:
	 *     (optional?='optional'? feature=FeatureWithVersion)
	 */
	protected void sequence_AddFeature(ISerializationContext context, AddFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AddPlugin returns AddPlugin
	 *
	 * Constraint:
	 *     (optional?='optional'? plugin=PluginWithVersionAndStartLevel)
	 */
	protected void sequence_AddPlugin(ISerializationContext context, AddPlugin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Path returns AnyPath
	 *     AnyPath returns AnyPath
	 *
	 * Constraint:
	 *     name=StringWithVariables
	 */
	protected void sequence_AnyPath(ISerializationContext context, AnyPath semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.PATH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.PATH__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnyPathAccess().getNameStringWithVariablesParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ApplicationExtPoint returns ApplicationExtPoint
	 *
	 * Constraint:
	 *     name=FQName
	 */
	protected void sequence_ApplicationExtPoint(ISerializationContext context, ApplicationExtPoint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.APPLICATION_EXT_POINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.APPLICATION_EXT_POINT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getApplicationExtPointAccess().getNameFQNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ClearOption returns ClearOption
	 *
	 * Constraint:
	 *     ((workspace?='workspace' | log?='log') noAskClear?='!'? config?='config'*)*
	 */
	protected void sequence_ClearOption(ISerializationContext context, ClearOption semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigIniTemplate returns ConfigIniTemplate
	 *
	 * Constraint:
	 *     path=ExistingPath
	 */
	protected void sequence_ConfigIniTemplate(ISerializationContext context, ConfigIniTemplate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.CONFIG_INI_TEMPLATE__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.CONFIG_INI_TEMPLATE__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConfigIniTemplateAccess().getPathExistingPathParserRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ContentProviderProduct returns ContentProviderProduct
	 *
	 * Constraint:
	 *     product=ExistingPath
	 */
	protected void sequence_ContentProviderProduct(ISerializationContext context, ContentProviderProduct semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.CONTENT_PROVIDER_PRODUCT__PRODUCT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.CONTENT_PROVIDER_PRODUCT__PRODUCT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContentProviderProductAccess().getProductExistingPathParserRuleCall_1_0(), semanticObject.getProduct());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvironmentVariable returns EnvironmentVariable
	 *
	 * Constraint:
	 *     (name=ID value=StringWithVariables)
	 */
	protected void sequence_EnvironmentVariable(ISerializationContext context, EnvironmentVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.ENVIRONMENT_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.ENVIRONMENT_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.ENVIRONMENT_VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.ENVIRONMENT_VARIABLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvironmentVariableAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnvironmentVariableAccess().getValueStringWithVariablesParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExecutionEnvironment returns ExecutionEnvironment
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_ExecutionEnvironment(ISerializationContext context, ExecutionEnvironment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.EXECUTION_ENVIRONMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.EXECUTION_ENVIRONMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExecutionEnvironmentAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Path returns ExistingPath
	 *     ExistingPath returns ExistingPath
	 *
	 * Constraint:
	 *     name=StringWithVariables
	 */
	protected void sequence_ExistingPath(ISerializationContext context, ExistingPath semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.PATH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.PATH__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExistingPathAccess().getNameStringWithVariablesParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Favorites returns Favorites
	 *
	 * Constraint:
	 *     types+=LaunchModeType*
	 */
	protected void sequence_Favorites(ISerializationContext context, Favorites semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureWithVersion returns FeatureWithVersion
	 *
	 * Constraint:
	 *     (name=FQName version=VERSION?)
	 */
	protected void sequence_FeatureWithVersion(ISerializationContext context, FeatureWithVersion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GroupMember returns GroupMember
	 *
	 * Constraint:
	 *     ((type=LaunchModeType | adopt?='adopt')* member=[LaunchConfig|FQName] postAction=GroupPostLaunchAction?)
	 */
	protected void sequence_GroupMember(ISerializationContext context, GroupMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GroupPostLaunchAction returns GroupPostLaunchDelay
	 *     GroupPostLaunchDelay returns GroupPostLaunchDelay
	 *
	 * Constraint:
	 *     delay=INT
	 */
	protected void sequence_GroupPostLaunchDelay(ISerializationContext context, GroupPostLaunchDelay semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.GROUP_POST_LAUNCH_DELAY__DELAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.GROUP_POST_LAUNCH_DELAY__DELAY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGroupPostLaunchDelayAccess().getDelayINTTerminalRuleCall_1_0(), semanticObject.getDelay());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GroupPostLaunchAction returns GroupPostLaunchRegex
	 *     GroupPostLaunchRegex returns GroupPostLaunchRegex
	 *
	 * Constraint:
	 *     regex=STRING
	 */
	protected void sequence_GroupPostLaunchRegex(ISerializationContext context, GroupPostLaunchRegex semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.GROUP_POST_LAUNCH_REGEX__REGEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.GROUP_POST_LAUNCH_REGEX__REGEX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGroupPostLaunchRegexAccess().getRegexSTRINGTerminalRuleCall_1_0(), semanticObject.getRegex());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GroupPostLaunchAction returns GroupPostLaunchWait
	 *     GroupPostLaunchWait returns GroupPostLaunchWait
	 *
	 * Constraint:
	 *     {GroupPostLaunchWait}
	 */
	protected void sequence_GroupPostLaunchWait(ISerializationContext context, GroupPostLaunchWait semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IgnorePlugin returns IgnorePlugin
	 *
	 * Constraint:
	 *     plugin=PluginWithVersion
	 */
	protected void sequence_IgnorePlugin(ISerializationContext context, IgnorePlugin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.IGNORE_PLUGIN__PLUGIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.IGNORE_PLUGIN__PLUGIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIgnorePluginAccess().getPluginPluginWithVersionParserRuleCall_1_0(), semanticObject.getPlugin());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JavaMainSearch returns JavaMainSearch
	 *
	 * Constraint:
	 *     (system?='system' | inherited?='inherited')*
	 */
	protected void sequence_JavaMainSearch(ISerializationContext context, JavaMainSearch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JavaMainType returns JavaMainType
	 *
	 * Constraint:
	 *     name=FQName
	 */
	protected void sequence_JavaMainType(ISerializationContext context, JavaMainType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.JAVA_MAIN_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.JAVA_MAIN_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJavaMainTypeAccess().getNameFQNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LCModel returns LCModel
	 *
	 * Constraint:
	 *     configurations+=LaunchConfig+
	 */
	protected void sequence_LCModel(ISerializationContext context, LCModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LaunchConfig returns LaunchConfig
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (
	 *                 explicit?='explicit' | 
	 *                 manual?='manual' | 
	 *                 abstract?='abstract' | 
	 *                 foreground?='foreground' | 
	 *                 noConsole?='no-console' | 
	 *                 noValidate?='no-validate' | 
	 *                 swInstallSupport?='sw-install-allowed' | 
	 *                 replaceEnv?='replace-env' | 
	 *                 stopInMain?='stop-in-main' | 
	 *                 keepRunning?='keep-running' | 
	 *                 runInUiThread?='run-in-ui-thread'
	 *             )? 
	 *             (qualify?='qualified' qualifierId=STRING?)?
	 *         )+ 
	 *         type=LaunchConfigType 
	 *         name=FQName 
	 *         superConfig=[LaunchConfig|FQName]? 
	 *         (
	 *             clears=ClearOption | 
	 *             workspace=Workspace | 
	 *             workingDir=WorkingDir | 
	 *             memory=MemoryOption | 
	 *             mainProject=MainProject | 
	 *             mainType=MainType | 
	 *             application=ApplicationExtPoint | 
	 *             product=ProductExtPoint | 
	 *             favorites=Favorites | 
	 *             redirect=Redirect | 
	 *             execEnv=ExecutionEnvironment | 
	 *             configIniTemplate=ConfigIniTemplate | 
	 *             javaMainSearch=JavaMainSearch | 
	 *             servletConfig=RapServletConfig | 
	 *             contentProviderProduct=ContentProviderProduct | 
	 *             test=TestConfig | 
	 *             plugins+=AddPlugin | 
	 *             features+=AddFeature | 
	 *             ignore+=IgnorePlugin | 
	 *             groupMembers+=GroupMember | 
	 *             vmArgs+=VmArgument | 
	 *             progArgs+=ProgramArgument | 
	 *             envVars+=EnvironmentVariable | 
	 *             traces+=TraceEnablement
	 *         )*
	 *     )
	 */
	protected void sequence_LaunchConfig(ISerializationContext context, LaunchConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MainProject returns MainProject
	 *
	 * Constraint:
	 *     (self?='self' | project=Project)
	 */
	protected void sequence_MainProject(ISerializationContext context, MainProject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MainType returns MainType
	 *
	 * Constraint:
	 *     mainClass=JavaMainType
	 */
	protected void sequence_MainType(ISerializationContext context, MainType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.MAIN_TYPE__MAIN_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.MAIN_TYPE__MAIN_CLASS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMainTypeAccess().getMainClassJavaMainTypeParserRuleCall_1_0(), semanticObject.getMainClass());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MemoryOption returns MemoryOption
	 *
	 * Constraint:
	 *     ((min=INT minUnit=MemoryUnit) | (max=INT maxUnit=MemoryUnit) | (perm=INT permUnit=MemoryUnit))*
	 */
	protected void sequence_MemoryOption(ISerializationContext context, MemoryOption semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PluginWithVersionAndStartLevel returns PluginWithVersionAndStartLevel
	 *
	 * Constraint:
	 *     (plugin=PluginWithVersion (autoStart?='autostart' | startLevel=INT)*)
	 */
	protected void sequence_PluginWithVersionAndStartLevel(ISerializationContext context, PluginWithVersionAndStartLevel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PluginWithVersion returns PluginWithVersion
	 *
	 * Constraint:
	 *     (name=FQName version=VERSION?)
	 */
	protected void sequence_PluginWithVersion(ISerializationContext context, PluginWithVersion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProductExtPoint returns ProductExtPoint
	 *
	 * Constraint:
	 *     name=FQName
	 */
	protected void sequence_ProductExtPoint(ISerializationContext context, ProductExtPoint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.PRODUCT_EXT_POINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.PRODUCT_EXT_POINT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductExtPointAccess().getNameFQNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProgramArgument returns ProgramArgument
	 *
	 * Constraint:
	 *     arguments+=StringWithVariables*
	 */
	protected void sequence_ProgramArgument(ISerializationContext context, ProgramArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Project returns Project
	 *
	 * Constraint:
	 *     name=FQName
	 */
	protected void sequence_Project(ISerializationContext context, Project semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.PROJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.PROJECT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProjectAccess().getNameFQNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RapServletConfig returns RapServletConfig
	 *
	 * Constraint:
	 *     (
	 *         servletPath=STRING | 
	 *         browserMode=BrowserLaunchMode | 
	 *         serverPort=INT | 
	 *         sessionTimeout=INT | 
	 *         contextPath=STRING | 
	 *         devMode=BOOLEAN
	 *     )+
	 */
	protected void sequence_RapServletConfig(ISerializationContext context, RapServletConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Redirect returns Redirect
	 *
	 * Constraint:
	 *     ((inWhich=InputStream inFile=ExistingPath)? (outWhich=OutputStream outFile=AnyPath noAppend?='!'?)?)+
	 */
	protected void sequence_Redirect(ISerializationContext context, Redirect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StringWithVariables returns StringWithVariables
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringWithVariables(ISerializationContext context, StringWithVariables semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.STRING_WITH_VARIABLES__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.STRING_WITH_VARIABLES__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringWithVariablesAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TestConfig returns TestConfig
	 *
	 * Constraint:
	 *     (
	 *         runner=TestRunnerType | 
	 *         container=STRING | 
	 *         class=FQName | 
	 *         method=STRING | 
	 *         excludeTags=Tags | 
	 *         includeTags=Tags
	 *     )*
	 */
	protected void sequence_TestConfig(ISerializationContext context, TestConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TraceEnablement returns TraceEnablement
	 *
	 * Constraint:
	 *     (plugin=FQName what+=STRING*)
	 */
	protected void sequence_TraceEnablement(ISerializationContext context, TraceEnablement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VmArgument returns VmArgument
	 *
	 * Constraint:
	 *     arguments+=StringWithVariables*
	 */
	protected void sequence_VmArgument(ISerializationContext context, VmArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WorkingDir returns WorkingDir
	 *
	 * Constraint:
	 *     workingDir=ExistingPath
	 */
	protected void sequence_WorkingDir(ISerializationContext context, WorkingDir semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.WORKING_DIR__WORKING_DIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.WORKING_DIR__WORKING_DIR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkingDirAccess().getWorkingDirExistingPathParserRuleCall_1_0(), semanticObject.getWorkingDir());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Workspace returns Workspace
	 *
	 * Constraint:
	 *     workspace=AnyPath
	 */
	protected void sequence_Workspace(ISerializationContext context, Workspace semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LcDslPackage.Literals.WORKSPACE__WORKSPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LcDslPackage.Literals.WORKSPACE__WORKSPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkspaceAccess().getWorkspaceAnyPathParserRuleCall_1_0(), semanticObject.getWorkspace());
		feeder.finish();
	}
	
	
}
