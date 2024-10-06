# lcdsl
Eclipse Launch Configuration DSL (Xtext based)

[![unstable](http://badges.github.io/stability-badges/dist/unstable.svg)](http://github.com/badges/stability-badges)

LcDsl provides a way of defining Eclipse launch configurations in a textual way. The file extension used is '.lc' It provides some obvious and some non-obvious advantages over the Eclipse launch configuration solution:

 * Merge-able text representation
 * Compatible - LcDsl translates to "normal" Eclipse launch configurations
 * Stable format (i.e. sometimes Eclipse launch configurations change when just opening them in the editor for no obvious reasons - .lc files don't)
 * Flexibility:
    * Define launch configurations using plugins **and** features **and** .product files. In a single configuration.
    * Let LcDsl calculate dependencies automatically for you. Or don't, and define everything statically.
    * Influence the dependency calculation that LcDsl can do by telling it to ignore dependency subtrees.
    * Use *abstract* launch configurations as templates, allowing for very slick configuration definitions.
 * Support for plain Java, Eclipse, RAP, JUnit Plug-in, SWTBot and Launch Group configurations - more on demand.

Currently, the LcDsl repository also provides the `Launch Configuration View` feature. See below for documentation on that.

## Installation

Currently, the latest update site is hosted here: `https://mduft.github.io/lcdsl-latest/` (P2 repository)

Zipped P2 repositories are provided for releases.

## Demo

See these videos for a quick glance on what it is all about:

[![IMAGE ALT TEXT](http://img.youtube.com/vi/62pVrZAqw7c/0.jpg)](http://www.youtube.com/watch?v=62pVrZAqw7c "Plain Java Demo")

[![IMAGE ALT TEXT](http://img.youtube.com/vi/TrbjY9ltKTI/0.jpg)](http://www.youtube.com/watch?v=TrbjY9ltKTI "Eclipse RCP Demo")

 * https://youtu.be/62pVrZAqw7c
 * https://youtu.be/TrbjY9ltKTI

##  General

All launch configurations are built up the same way:

    [modifiers..] [type] configuration [name] {
        [single-properties..] // properties that appear at most once
        [multi-properties..] // properties that can appear 0..N times
    }

All kinds of launch configurations can define certain attributes the same. These are:

 * modifiers:
    * `manual`: launch configuration is not generated on save, but only explicitly by right clicking the configuration in the editor or the outline view.
    * `abstract`: defines an abstract configuration which can be used to define certain things in a reusable way. An abstract configuration can be used by adding a `:` and its name after the name of the inheriting configuration.
    * `foreground`: launches the launch configuration in foreground.
    * `no-console` (not for type 'group'): don't allocate a console for the launch.
    * `replace-env` (not for type 'group'): don't append to the environment when defining new variables, but replace it as a whole.
    * `qualified`: qualifies the name of the launch configuration with the project name the file is contained in. This allows to copy the project and have all copied launch configurations automatically receive the project name as prefix (means that the now two launch configurations don't collide).
    * `qualified("NAME")`: qualifies the launch configuration by prefixing it with NAME.
 * single-valued properties:
	* `working-dir`: specifies the working directory for the launch
	* `memory`: allows to specify various memory aspects (min, max, maxPermSize) without the need to wring `vm-arg`s.
	* `favorite`: allows to specify launch groups where this launch should appear as favorite (`run`, `debug`, `profile`, ...)
	* `redirect` (not for type 'group'): allows to redirect stdin, stdout/stderr to/from files.
	* `execution-environment` (not for type 'group'): specifies the execution environment to use for the launch
 * multi-valued properties:
	* `vm-argument` (not for type 'group'): allows to specify one or more (on the same line) vm arguments
	* `argument` (not for type 'group'): allows to specify command line arguments for the program to launch
	* `environment` (not for type 'group'): allows to specify an environment variable to place into the launches environment.

Multiple Arguments have to be quoted each, key and value separately, but may be written in one line:
`vm-argument '-os' '${target.os}'`

For all the above, check content assist to get an idea of the supported values and the exact syntax.

Note that variable expansion is supported throughout most string values in LcDsl (exceptions: regular expression for group post-launch action, RAP servlet/context path, trace specifications). Variables are defined in the Eclipse standard way (Window > Preferences > String Substitutions).

## Java

The configuration type `java` has these attributes on top:

 * modifiers:
     * `stop-in-main`: when debugging stop execution on the first line of the main method
 * single-properties:
     * `project`: specifies the project that contains the main class of the program to run
     * `main-class`: specifies the class in `project` that contains the `main` method to execute. Content assist for this attribute is available once `project` is set for the launch.
     * `search-main`: allows to extend the search path for the main class to inherited methods and system libraries that the `project` depends on.

A typical `java` configuration looks like this:

    java configuration LcJavaMain {
        project com.wamas.test;
        main-class com.wamas.test.JavaMain;

        memory min=64m max=256m;

        vm-argument '-Dmy.arg=value';
        argument 'cmdArg';
    }

## Eclipse, RAP, JUnit Plug-in, SWTBot

Eclipse, RAP, JUnit Plug-in and SWTBot launch configurations share a lot of configuration options, that is why they are described in the same chapter. The following attributes are added for these types:

 * modifiers:
     * `explicit`: usually LcDsl will automatically add required dependencies of the specifies plugins to the launch. This modifier tells it to not do so.
     * `no-validate`: don't validate (check for missing/invalid) plugins before launching
     * `sw-install-allowed` (not for type 'rap'): allow software installation via P2 in the launch
     * `keep-running` (only for type 'junit-plugin' and 'swtbot'): keep JUnit running after a test run when debugging
     * `run-in-ui-thread` (only for type 'junit-plugin'): run JUnit test in UI thread
 * single-properties:
     * `clear`: allows to clear (and force clear without confirmation) workspace/log and configuration area
     * `workspace`: specifies the workspace directory to use.
     * `application`: id of the application to launch. Only valid if no `product` is set
     * `product`: id of the product to launch. Only valid if no `application` is set
     * `config-ini-template`: use the given file as config.ini template.
     * `content-provider`: allows to specify the absolute path to a *.product* file (Hint: you can use variables like `${workspace_loc}`). This file is read and all declared dependencies (features, plugins) are expanded as if they were declared using `plugin` and `feature` directives. There is no way to apply `ignore` to any of the features/pluings originating from the *.product*. Additionally, arguments and VM arguments are applied as well, as if written directly in the launch configuration.
     * `servlet {}` (only for type 'rap'):
         * `path`: servlet path
         * `browser`: use internal, external or no browser at all on launch
         * `port`: port to use for the web server
         * `session-timeout`: session timeout to use
         * `context-path`: use this as additional context path
         * `dev-mode`: enable RAP developer mode
     * `test {}` (only for types 'junit-plugin' and 'swtbot'):
         * `runner`: test runner (JUnit3, JUnit4 or JUnit5 (default))
         * `container`: project, package or source folder which contains tests (the project containing the .lc file if not specified). If the container points to a plugin project, the plugin will be added to the dependency list as well.
         * `class`: If specified only tests within this class will be executed, otherwise all tests of the container will be executed.
         * `method`: If specified only this test will be executed, otherwise all tests of the class will executed.
         * `exclude-tags` (only for runner 'junit5'): tags which are used to exclude certain tests
         * `include-tags` (only for runner 'junit5'): tags which are used to include certain tests
 * multi-properties
     * `plugin`: adds a plugin to the launch configuration. may specify also version, startlevel and autostart property. Dependencies of the given plugin are added automatically to the launch unless `explcit` modifier is given.
     * `feature`: same as `plugin` but for features - no startlevel support though.
     * `ignore`: specify a plugin symbolic name to ignore during automatic dependency resolution. this plugin will not be taken into account, and thus also it's direct and indirect dependencies will not be added (unless some other plugin requires the same ones).
     * `trace`: allows to specify trace options per plugin.

Examples for typical `eclipse`, `rap`, `junit-plugin` and `swtbot` launch configurations:

    eclipse configuration LcEclipseMain {
        workspace "${workspace_loc}/../runtime-MyWorkspace";
        application com.wamas.test.demo;

        clear workspace! config;
        memory min=64M max=256M;

        plugin com.wamas.test;

        environment DISPLAY=":0";
    }

    rap configuration LcRapMain {
        servlet {
            path '/test';
            port 8081;
        }

        plugin com.wamas.test;
    }

    junit-plugin configuration LcSWTBotMain {
        application com.wamas.test.demo;
        feature com.wamas.test.demo.feature;
        test {
            runner junit5;
            container '/com.wamas.test.demo.tests';
            exclude-tags long-running,ui-required;
        }
    }

    swtbot configuration LcSWTBotMain {
        application com.wamas.test.demo;
        plugin com.wamas.test.demo.plugin;
        test {
            runner junit4;
            container '/com.wamas.test.demo.swtbottests';
            class com.wamas.test.demo.swtbottests.MainTest;
            method 'testMain';
        }
    }

## Launch Groups

LcDsl allows to create Launch groups by using the `group` type and the `member` multi-property.
Example:

    group configuration MyGroup1 {
        adopt run member MyLaunchConfig1; // Launch Mode "Run" is used
        adopt inherit member MyLaunchConfig2; // Launch Mode "inherit" is used
        adopt run member MyLaunchConfig3 delay 2; // Two seconds post launch action
        adopt run member MyLaunchConfig4 wait; // Wait until terminated
        adopt run member MyLaunchConfig4 regex "Started"; // Wait until regular expression is found in console output
        adopt run member MyGroup2; // launch another group
    }

## Launch Configuration View

The launch configuration view is something that is actually independent of LcDsl itself. It depends on Eclipse platform.debug ONLY. It allows to hook (via OSGi services) launch configuration providers into it. It comes along with a default provider that allows it to handle "normal" Eclipse launch configurations. LcDsl brings along another provider for the view, that allows it to also handle LcDsl specifics.

# Development

To set up a development environment, run the standard Eclipse Oomph installer, and select *GitHub Projects > Launch Config DSL* on the second page.