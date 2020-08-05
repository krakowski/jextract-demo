A simple Hello World application using the [`gradle-jextract`](https://github.com/krakowski/gradle-jextract) Gradle plugin and Project Panama's [Foreign Function Interface](https://openjdk.java.net/jeps/191) as well as the [Foreign-Memory Access API](https://openjdk.java.net/jeps/383).

## :warning: &nbsp; Known issues

  - Gradle (currently at 6.5.1) does not yet support OpenJDK 16 ([#13481](https://github.com/gradle/gradle/issues/13481)). The [`gradle-jextract`](https://github.com/krakowski/gradle-jextract) plugin can work around this by using a different JDK for compiling the sources. To enable this feature the `javaHome` property has to be set within your global `gradle.properties` usually located inside `${HOME}/.gradle`.
  
    ```
    javaHome=/path/to/your/panama/java/home
    ```

## :rocket: &nbsp; Running the application

Since this project uses Gradle's [`application`](https://docs.gradle.org/current/userguide/application_plugin.html) Plugin, the application can be started using one simple command.

```
./gradlew run
```

