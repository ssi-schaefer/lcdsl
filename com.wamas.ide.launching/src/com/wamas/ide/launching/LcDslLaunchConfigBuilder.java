/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.wamas.ide.launching.lcDsl.AddFeature;
import com.wamas.ide.launching.lcDsl.AddPlugin;
import com.wamas.ide.launching.lcDsl.AnyPath;
import com.wamas.ide.launching.lcDsl.ApplicationExtPoint;
import com.wamas.ide.launching.lcDsl.BrowserLaunchMode;
import com.wamas.ide.launching.lcDsl.ClearOption;
import com.wamas.ide.launching.lcDsl.ConfigIniTemplate;
import com.wamas.ide.launching.lcDsl.ContentProviderProduct;
import com.wamas.ide.launching.lcDsl.EnvironmentVariable;
import com.wamas.ide.launching.lcDsl.ExecutionEnvironment;
import com.wamas.ide.launching.lcDsl.ExistingPath;
import com.wamas.ide.launching.lcDsl.Favorites;
import com.wamas.ide.launching.lcDsl.FeatureWithVersion;
import com.wamas.ide.launching.lcDsl.GroupMember;
import com.wamas.ide.launching.lcDsl.GroupPostLaunchAction;
import com.wamas.ide.launching.lcDsl.GroupPostLaunchDelay;
import com.wamas.ide.launching.lcDsl.GroupPostLaunchRegex;
import com.wamas.ide.launching.lcDsl.IgnorePlugin;
import com.wamas.ide.launching.lcDsl.InputStream;
import com.wamas.ide.launching.lcDsl.JavaMainSearch;
import com.wamas.ide.launching.lcDsl.JavaMainType;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.LaunchConfigType;
import com.wamas.ide.launching.lcDsl.LaunchModeType;
import com.wamas.ide.launching.lcDsl.LcDslFactory;
import com.wamas.ide.launching.lcDsl.MainProject;
import com.wamas.ide.launching.lcDsl.MainType;
import com.wamas.ide.launching.lcDsl.MemoryOption;
import com.wamas.ide.launching.lcDsl.MemoryUnit;
import com.wamas.ide.launching.lcDsl.OutputStream;
import com.wamas.ide.launching.lcDsl.PluginWithVersion;
import com.wamas.ide.launching.lcDsl.PluginWithVersionAndStartLevel;
import com.wamas.ide.launching.lcDsl.ProductExtPoint;
import com.wamas.ide.launching.lcDsl.ProgramArgument;
import com.wamas.ide.launching.lcDsl.Project;
import com.wamas.ide.launching.lcDsl.RapServletConfig;
import com.wamas.ide.launching.lcDsl.Redirect;
import com.wamas.ide.launching.lcDsl.StringWithVariables;
import com.wamas.ide.launching.lcDsl.TraceEnablement;
import com.wamas.ide.launching.lcDsl.VmArgument;
import com.wamas.ide.launching.lcDsl.WorkingDir;
import com.wamas.ide.launching.lcDsl.Workspace;

public class LcDslLaunchConfigBuilder {

    private final LaunchConfig config;

    public LcDslLaunchConfigBuilder(LaunchConfigType type, String name) {
        this.config = LcDslFactory.eINSTANCE.createLaunchConfig();
        this.config.setName(name);
        this.config.setType(type);
    }

    public LcDslLaunchConfigBuilder(LaunchConfig template) {
        this.config = EcoreUtil.copy(template);
    }

    public LaunchConfig build() {
        return config;
    }

    public LaunchConfig buildAndValidate() {
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(config);
        if (diagnostic.getSeverity() > Diagnostic.WARNING) {
            throw new RuntimeException("Launch configuration contains errors");
        }
        return config;
    }

    public LcDslLaunchConfigBuilder setName(String name) {
        config.setName(name);
        return this;
    }

    public LcDslLaunchConfigBuilder setExplicit(boolean v) {
        config.setExplicit(v);
        return this;
    }

    public LcDslLaunchConfigBuilder setManual(boolean v) {
        config.setManual(v);
        return this;
    }

    public LcDslLaunchConfigBuilder setAbstract(boolean v) {
        config.setAbstract(v);
        return this;
    }

    public LcDslLaunchConfigBuilder setForeground(boolean v) {
        config.setForeground(v);
        return this;
    }

    public LcDslLaunchConfigBuilder setNoConsole(boolean v) {
        config.setNoConsole(v);
        return this;
    }

    public LcDslLaunchConfigBuilder setNoValidate(boolean v) {
        config.setNoValidate(v);
        return this;
    }

    public LcDslLaunchConfigBuilder setSwInstallSupport(boolean v) {
        config.setSwInstallSupport(v);
        return this;
    }

    public LcDslLaunchConfigBuilder setReplaceEnv(boolean v) {
        config.setReplaceEnv(v);
        return this;
    }

    public LcDslLaunchConfigBuilder setStopInMain(boolean v) {
        config.setStopInMain(v);
        return this;
    }

    public LcDslLaunchConfigBuilder setSuperConfig(LaunchConfig s) {
        config.setSuperConfig(s);
        return this;
    }

    public LcDslLaunchConfigBuilder setClearWorkspace(boolean workspace, boolean log, boolean force) {
        ClearOption c = config.getClears();
        if (c == null) {
            c = LcDslFactory.eINSTANCE.createClearOption();
            config.setClears(c);
        }
        c.setWorkspace(workspace);
        c.setLog(log);
        c.setNoAskClear(force);
        return this;
    }

    public LcDslLaunchConfigBuilder setClearConfig(boolean clear) {
        ClearOption c = config.getClears();
        if (c == null) {
            c = LcDslFactory.eINSTANCE.createClearOption();
            config.setClears(c);
        }
        c.setConfig(clear);
        return this;
    }

    public LcDslLaunchConfigBuilder setMemory(int minMb, int maxMb) {
        return setMemory(minMb, maxMb, 0);
    }

    public LcDslLaunchConfigBuilder setMemory(int minMb, int maxMb, int permMb) {
        MemoryOption o = config.getMemory();
        if (o == null) {
            o = LcDslFactory.eINSTANCE.createMemoryOption();
            config.setMemory(o);
        }

        if (minMb > 0) {
            o.setMin(minMb);
            o.setMinUnit(MemoryUnit.MB);
        }
        if (maxMb > 0) {
            o.setMax(maxMb);
            o.setMaxUnit(MemoryUnit.MB);
        }
        if (permMb > 0) {
            o.setPerm(permMb);
            o.setPermUnit(MemoryUnit.MB);
        }
        return this;
    }

    public LcDslLaunchConfigBuilder setWorkspace(String pathWithVariables) {
        Workspace ws = LcDslFactory.eINSTANCE.createWorkspace();
        ws.setWorkspace(anyPath(pathWithVariables));
        config.setWorkspace(ws);
        return this;
    }

    public LcDslLaunchConfigBuilder setWorkingDir(String pathWithVariables) {
        WorkingDir dir = LcDslFactory.eINSTANCE.createWorkingDir();
        dir.setWorkingDir(existingPath(pathWithVariables));
        config.setWorkingDir(dir);
        return this;
    }

    public LcDslLaunchConfigBuilder setMainProject(String name) {
        MainProject prj = LcDslFactory.eINSTANCE.createMainProject();
        Project p = LcDslFactory.eINSTANCE.createProject();
        p.setName(name);
        prj.setProject(p);
        config.setMainProject(prj);
        return this;
    }

    public LcDslLaunchConfigBuilder setMainType(String mainType) {
        MainType mt = LcDslFactory.eINSTANCE.createMainType();
        JavaMainType jt = LcDslFactory.eINSTANCE.createJavaMainType();
        jt.setName(mainType);
        mt.setMainClass(jt);
        config.setMainType(mt);
        return this;
    }

    public LcDslLaunchConfigBuilder setApplication(String extPointId) {
        ApplicationExtPoint o = LcDslFactory.eINSTANCE.createApplicationExtPoint();
        o.setName(extPointId);
        config.setApplication(o);
        return this;
    }

    public LcDslLaunchConfigBuilder setProduct(String extPointId) {
        ProductExtPoint o = LcDslFactory.eINSTANCE.createProductExtPoint();
        o.setName(extPointId);
        config.setProduct(o);
        return this;
    }

    public LcDslLaunchConfigBuilder setFavorites(Set<LaunchModeType> types) {
        Favorites o = LcDslFactory.eINSTANCE.createFavorites();
        o.getTypes().addAll(types);
        config.setFavorites(o);
        return this;
    }

    public LcDslLaunchConfigBuilder setRedirectOutput(OutputStream what, String where) {
        Redirect r = config.getRedirect();
        if (r == null) {
            r = LcDslFactory.eINSTANCE.createRedirect();
            config.setRedirect(r);
        }
        r.setOutWhich(what);
        r.setOutFile(anyPath(where));
        return this;
    }

    public LcDslLaunchConfigBuilder setRedirectInput(InputStream what, String where) {
        Redirect r = config.getRedirect();
        if (r == null) {
            r = LcDslFactory.eINSTANCE.createRedirect();
            config.setRedirect(r);
        }
        r.setInWhich(what);
        r.setInFile(existingPath(where));
        return this;
    }

    public LcDslLaunchConfigBuilder setExecutionEnvironment(String exe) {
        ExecutionEnvironment o = LcDslFactory.eINSTANCE.createExecutionEnvironment();
        o.setName(exe);
        config.setExecEnv(o);
        return this;
    }

    public LcDslLaunchConfigBuilder setConfigIniTemplate(String file) {
        ConfigIniTemplate o = LcDslFactory.eINSTANCE.createConfigIniTemplate();
        o.setPath(existingPath(file));
        config.setConfigIniTemplate(o);
        return this;
    }

    public LcDslLaunchConfigBuilder setJavaMainSearch(boolean system, boolean inherit) {
        JavaMainSearch o = LcDslFactory.eINSTANCE.createJavaMainSearch();
        o.setInherited(inherit);
        o.setSystem(system);
        config.setJavaMainSearch(o);
        return this;
    }

    public LcDslLaunchConfigBuilder setContentProviderProduct(String file) {
        ContentProviderProduct o = LcDslFactory.eINSTANCE.createContentProviderProduct();
        o.setProduct(existingPath(file));
        config.setContentProviderProduct(o);
        return this;
    }

    public LcDslLaunchConfigBuilder setRAPServletPath(String path) {
        RapServletConfig r = config.getServletConfig();
        if (r == null) {
            r = LcDslFactory.eINSTANCE.createRapServletConfig();
            config.setServletConfig(r);
        }
        r.setServletPath(path);
        return this;
    }

    public LcDslLaunchConfigBuilder setRAPServerPort(int port) {
        RapServletConfig r = config.getServletConfig();
        if (r == null) {
            r = LcDslFactory.eINSTANCE.createRapServletConfig();
            config.setServletConfig(r);
        }
        r.setServerPort(port);
        return this;
    }

    public LcDslLaunchConfigBuilder setRAPServletContestPath(String path) {
        RapServletConfig r = config.getServletConfig();
        if (r == null) {
            r = LcDslFactory.eINSTANCE.createRapServletConfig();
            config.setServletConfig(r);
        }
        r.setContextPath(path);
        return this;
    }

    public LcDslLaunchConfigBuilder setRAPBrowserMode(BrowserLaunchMode mode) {
        RapServletConfig r = config.getServletConfig();
        if (r == null) {
            r = LcDslFactory.eINSTANCE.createRapServletConfig();
            config.setServletConfig(r);
        }
        r.setBrowserMode(mode);
        return this;
    }

    public LcDslLaunchConfigBuilder setRAPSessionTimeout(int timeout) {
        RapServletConfig r = config.getServletConfig();
        if (r == null) {
            r = LcDslFactory.eINSTANCE.createRapServletConfig();
            config.setServletConfig(r);
        }
        r.setSessionTimeout(timeout);
        return this;
    }

    public LcDslLaunchConfigBuilder setRAPDeveloperMode(boolean dev) {
        RapServletConfig r = config.getServletConfig();
        if (r == null) {
            r = LcDslFactory.eINSTANCE.createRapServletConfig();
            config.setServletConfig(r);
        }
        r.setDevMode(dev);
        return this;
    }

    public LcDslLaunchConfigBuilder addPlugin(String name) {
        return addPlugin(name, null);
    }

    public LcDslLaunchConfigBuilder addPlugin(String name, String version) {
        return addPlugin(name, version, false, 0, false);
    }

    public LcDslLaunchConfigBuilder addPlugin(String name, String version, boolean optional) {
        return addPlugin(name, version, optional, 0, false);
    }

    public LcDslLaunchConfigBuilder addPlugin(String name, String version, boolean optional, int lvl, boolean autostart) {
        AddPlugin o = LcDslFactory.eINSTANCE.createAddPlugin();
        o.setOptional(optional);
        PluginWithVersionAndStartLevel pvs = LcDslFactory.eINSTANCE.createPluginWithVersionAndStartLevel();
        pvs.setAutoStart(autostart);
        pvs.setStartLevel(lvl);
        PluginWithVersion pv = LcDslFactory.eINSTANCE.createPluginWithVersion();
        pv.setName(name);
        pv.setVersion(version);
        pvs.setPlugin(pv);
        o.setPlugin(pvs);
        config.getPlugins().add(o);
        return this;
    }

    public LcDslLaunchConfigBuilder addFeature(String name) {
        return addFeature(name, null, false);
    }

    public LcDslLaunchConfigBuilder addFeature(String name, String version, boolean optional) {
        AddFeature o = LcDslFactory.eINSTANCE.createAddFeature();
        o.setOptional(optional);

        FeatureWithVersion fv = LcDslFactory.eINSTANCE.createFeatureWithVersion();
        fv.setName(name);
        fv.setVersion(version);

        o.setFeature(fv);
        config.getFeatures().add(o);
        return this;
    }

    public LcDslLaunchConfigBuilder ignorePlugin(String name) {
        return ignorePlugin(name, null);
    }

    public LcDslLaunchConfigBuilder ignorePlugin(String name, String version) {
        IgnorePlugin o = LcDslFactory.eINSTANCE.createIgnorePlugin();

        PluginWithVersion pv = LcDslFactory.eINSTANCE.createPluginWithVersion();
        pv.setName(name);
        pv.setVersion(version);

        o.setPlugin(pv);
        config.getIgnore().add(o);
        return this;
    }

    public LcDslLaunchConfigBuilder addGroupMember(LaunchConfig config) {
        return addGroupMember(config, LaunchModeType.INHERIT, false, null);
    }

    public LcDslLaunchConfigBuilder addGroupMember(LaunchConfig config, LaunchModeType type, boolean adopt) {
        return addGroupMember(config, type, adopt, null);
    }

    public LcDslLaunchConfigBuilder addGroupMemberWithWait(LaunchConfig config, LaunchModeType type, boolean adopt) {
        return addGroupMember(config, type, adopt, LcDslFactory.eINSTANCE.createGroupPostLaunchWait());
    }

    public LcDslLaunchConfigBuilder addGroupMemberWithDelay(LaunchConfig config, LaunchModeType type, boolean adopt,
            int seconds) {
        GroupPostLaunchDelay post = LcDslFactory.eINSTANCE.createGroupPostLaunchDelay();
        post.setDelay(seconds);
        return addGroupMember(config, type, adopt, post);
    }

    public LcDslLaunchConfigBuilder addGroupMemberWithRegex(LaunchConfig config, LaunchModeType type, boolean adopt,
            String regex) {
        GroupPostLaunchRegex post = LcDslFactory.eINSTANCE.createGroupPostLaunchRegex();
        post.setRegex(regex);
        return addGroupMember(config, type, adopt, post);
    }

    private LcDslLaunchConfigBuilder addGroupMember(LaunchConfig config, LaunchModeType type, boolean adopt,
            GroupPostLaunchAction action) {
        GroupMember o = LcDslFactory.eINSTANCE.createGroupMember();
        o.setPostAction(action);
        o.setMember(config);
        o.setAdopt(adopt);
        o.setType(type);
        config.getGroupMembers().add(o);
        return this;
    }

    public LcDslLaunchConfigBuilder addArgument(String arg) {
        ProgramArgument o = LcDslFactory.eINSTANCE.createProgramArgument();
        o.getArguments().add(stringWithVariables(arg));
        config.getProgArgs().add(o);
        return this;
    }

    public LcDslLaunchConfigBuilder addVmArgument(String arg) {
        VmArgument o = LcDslFactory.eINSTANCE.createVmArgument();
        o.getArguments().add(stringWithVariables(arg));
        config.getVmArgs().add(o);
        return this;
    }

    public LcDslLaunchConfigBuilder addEnvironment(String variable, String value) {
        EnvironmentVariable o = LcDslFactory.eINSTANCE.createEnvironmentVariable();
        o.setName(variable);
        o.setValue(stringWithVariables(value));
        config.getEnvVars().add(o);
        return this;
    }

    public LcDslLaunchConfigBuilder addTrace(String plugin, List<String> enable) {
        TraceEnablement e = LcDslFactory.eINSTANCE.createTraceEnablement();
        e.setPlugin(plugin);
        e.getWhat().addAll(enable);
        config.getTraces().add(e);
        return this;
    }

    private AnyPath anyPath(String v) {
        AnyPath a = LcDslFactory.eINSTANCE.createAnyPath();
        a.setName(stringWithVariables(v));
        return a;
    }

    private ExistingPath existingPath(String v) {
        ExistingPath p = LcDslFactory.eINSTANCE.createExistingPath();
        p.setName(stringWithVariables(v));
        return p;
    }

    private StringWithVariables stringWithVariables(String v) {
        StringWithVariables r = LcDslFactory.eINSTANCE.createStringWithVariables();
        r.setValue(v);
        return r;
    }

}
