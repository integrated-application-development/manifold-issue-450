This project illustrates a bug where a usage of java 16+ instanceof pattern matching fails to compile properly when used together with manifold.

Requires JDK 16+, maven.

The project pom has been set up to use manifold exception 2022.1.5. Simply compiling the project with maven and java 16+ will trigger the following error
```
[ERROR] [...]instanceof/src/main/java/instance/of/Main.java:[6,42] cannot find symbol
  symbol:   variable child
  location: class instance.of.Main
```

Compiling with the following section of the pom commented out will compiles correctly without any errors.
https://github.com/Integrated-Application-Development/instanceof/blob/984f5e2ce3a72dfaee82a06e908969d67c6618c9/pom.xml#L19-L21
