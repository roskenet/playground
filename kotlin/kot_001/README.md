# Five Ways to say Hello Kotlin

0. Use the kotlin playground

Point your browser to https://play.kotlinlang.org.

0. Use the REPL

```shell
❯ kotlin
Welcome to Kotlin version 1.9.10 (JRE 21+35)
Type :help for help, :quit for quit
>>> println("Hello World!")
Hello World!
>>> :quit
```

0. Run Kotlin as script

```shell
kotlin HelloWorld.kts
```

0. Compile to Java Bytecode

```shell
kotlinc HelloWorld.kt

kotlin HelloWorldkt
```

0. Compile a runnable jar

```shell
kotlinc HelloWorld.kt -include-runtime -d HelloWorld.jar

java -jar HelloWorld.jar
```

