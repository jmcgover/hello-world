# Maven

## Install and Run
### macOS

```bash
brew install maven
```
### Windows

## Run
### Maven
See [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) for more detail.

#### Creating a Project
```bash
mvn archetype:generate -DgroupId=com.jdmcg.app -DartifactId=hello-world -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

- Update the `App` class to `HelloWorldApp`
- Update the `AppTest` class to `HelloWorldAppTest`
- Change the filenames accordingly:
```bash
mv -v hello-world/src/main/java/com/jdmcg/helloworld/App.java hello-world/src/main/java/com/jdmcg/helloworld/HelloWorldApp.java
mv -v hello-world/src/test/java/com/jdmcg/helloworld/AppTest.java hello-world/src/test/java/com/jdmcg/helloworld/HelloWorldAppTest.java
```

#### Build and Run
```bash
cd hello-world
```

```bash
mvn package
```

```bash
java -cp java -cp target/hello-world-1.0-SNAPSHOT.jar com.jdmcg.helloworld.HelloWorldApp
```
#### Test
```bash
mvn test
```
