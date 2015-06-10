Kordapt
=======

[What's Kordapt](https://github.com/korwe/kordapt#whats-kordapt "What is Kordapt")<br/>
[Quick Start](https://github.com/korwe/kordapt#quick-start "Setup and configure")<br/>
[Usage](https://github.com/korwe/kordapt#usage "Using generators")<br/>

What's Kordapt
--------------

Kordapt is an opensource java framework for easily building in a consistent and modular manner, services that exist on [The Core](https://github.com/korwe/the-core-java "The Core on Github").
The framework makes extensive use of leading technologies such as Gradle and Spring. It makes development easy by providing gradle scripts(generators) and modular by providing various plugins
such as hibernate.


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
        classpath 'com.korwe:kordapt-gradle-plugin:1.0.0'
    }
}

repositories {
    mavenLocal()
    mavenCentral()
}

apply plugin: 'kordapt'
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

