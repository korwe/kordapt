Kordapt
=======

[What's Kordapt](https://github.com/korwe/kordapt#whats-kordapt "What is Kordapt")<br/>
[Quick Start](https://github.com/korwe/kordapt#quick-start "Setup and configure")<br/>
[Usage](https://github.com/korwe/kordapt#usage "Using generators")<br/>

What's Kordapt
--------------

Kordapt is an opensource java framework for easily building in a consistent and modular manner, services that exist on [The Core](https://github.com/korwe/the-core-java "The Core on Github").
The framework makes extensive use of leading technologies such as [Gradle](https://gradle.org/) and [Spring](http://projects.spring.io/spring-framework/). It makes development easy by providing gradle scripts(generators) that utilize [Antlr](http://www.antlr.org/) and [String template](http://www.stringtemplate.org/) for generating plumbing code of a service and its models. It further promotes modularization by providing various plugins
to help with plumbing that suits the requirements of your project such as hibernate.

Kordapt exposes an api-definition for the services and models created in a language agnostic manner by utilizing a set of [yaml](http://yaml.org/) files. This allows any alternative language to java to consume
and understand the api-definition by mapping that language to the api-definition.

Kordapt aims at simplifying the development process by aiding your choice of middleware technologies, libraries and frameworks, so that you are able to 
focus solely on your business logic.

Quick Start
-----

The following is all done via build.gradle
### Add dependencies

Add maven repositories and the kordapt gradle plugin dependency, then apply it
```gradle
buildscript{
    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        classpath 'com.korwe:kordapt-gradle-plugin:1.1.1'
    }
}

apply plugin: 'kordapt'

repositories {
    jcenter()
    mavenLocal()
    mavenCentral()
}


dependencies {
    compile 'com.korwe:kordapt-core:1.1.1'
}
```

### Configure
```gradle
kordapt{
    defaultPackage = "my.company.projectName"
}
```

Full set of [Configuration options](https://github.com/korwe/kordapt/wiki/Configuration-Options "Full set of configuration options")

### Initialize project
On the command-line, now run
```
gradle kinit
```

You will now have a kordapt project with the standard [Structure](https://github.com/korwe/kordapt/wiki/Project-Structure "Standard kordapt project structure")


Usage
-----

### Generators

#### Generate Service
Generate the full plumbing for a service:
```bash
gradle kgenerate -Pinput="<ServiceName> <ReturnType>:<functionName>(<params>)"
```
Example:
```bash
gradle kgenerate -Pinput="HelloWorldService ArbitraryType:firstFunction() void:secondFunction(Integer inputNumber)"

```

[Full Documentation](https://github.com/korwe/kordapt/wiki/Service-Generation "Full service generation documentation")

#### Generate Model
Generate the full plumbing for a model:
```bash
gradle kgenerate -Pinput="<ModelName> <AttributeType>:<attributeName>"
```
Example:
```bash
gradle kgenerate -Pinput="MyModel ArbitraryType:firstAttribute String:secondAttribute"

```

[Full Documentation](https://github.com/korwe/kordapt/wiki/Model-Generation "Full model generation documentation")

