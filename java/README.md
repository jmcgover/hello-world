# Java

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

## Gradle
TODO?

## Style Guides
- [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)

## Documentation
- [The Java™ Tutorials](https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html)
- [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

## Vim
- [/r/vim | Do you use Java or C# on vim?](https://www.reddit.com/r/vim/comments/w2fy54/do_you_use_java_or_c_on_vim/)
- [/r/vim | Plugins and Settings for Java programming?](https://www.reddit.com/r/vim/comments/ww61eh/plugins_and_settings_for_java_programming/)
- [artur-shaik/vim-javacomplete2](https://github.com/artur-shaik/vim-javacomplete2)
- [simonhicks/stacktrace.vim](https://github.com/simonhicks/stacktrace.vim)
- [/r/vim | Which Plugins should i install for using vim as a java ide?](https://www.reddit.com/r/vim/comments/8q7vpa/which_plugins_should_i_install_for_using_vim_as_a/)
- [Microsoft/language-server-protocol](https://github.com/Microsoft/language-server-protocol)
- [prabirshrestha/vim-lsp](https://github.com/prabirshrestha/vim-lsp)
- [mattn/vim-lsp-settings](https://github.com/mattn/vim-lsp-settings)
- [Eclim](https://eclim.org/)
- [puremourning/vimspector](https://github.com/puremourning/vimspector)
- [google/vim-codefmt](https://github.com/google/vim-codefmt)
