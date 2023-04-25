A simple Hello World application using the [`gradle-jextract`](https://github.com/krakowski/gradle-jextract) Gradle plugin and Project Panama's [Foreign Function Interface](https://openjdk.java.net/jeps/191) as well as the [Foreign-Memory Access API](https://openjdk.java.net/jeps/383).

## :warning: &nbsp; Known issues

  - If your JDK is not installed in one of the default locations, Gradle can be instructed to look in a custom location. To enable this feature the `org.gradle.java.installations.paths` property has to be set within your global `gradle.properties` file usually located inside `${HOME}/.gradle`.
    
    ```
    org.gradle.java.installations.paths=/custom/path/jdk20
    ```
## :rocket: &nbsp; Running the application

Since this project uses Gradle's [`application`](https://docs.gradle.org/current/userguide/application_plugin.html) Plugin, the application can be started using one simple command.

```
./gradlew run
```

