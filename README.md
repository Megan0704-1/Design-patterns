# Design-patterns

To replicate the result, run the following command in shell
```bash
git clone https://github.com/Megan0704-1/Design-patterns.git
```

- Abstract.Factory.Pattern (Native Pizza Store)
    ```bash
    cd Abstract.Factory.Pattern
    # Simple Factory Pattern
    javac -d bin src/nativepizza/*.java src/nativepizza/**/*.java
    java -cp bin nativepizza.Main
    # Extended ver of Simple Factory Pattern
    javac -d bin src/ext_nativepizza/*.java src/ext_nativepizza/**/*.java
    java -cp bin ext_nativepizza.Main
    # Factory Method Pattern
    javac -d bin src/factorypizza/*.java src/factorypizza/**/*.java
    java -cp bin factorypizza.Main

    # prompt: tonight, I would like to have some...
    # options: cheese, clam, pepperoni
    ```
- Decorator.pattern (CoffeShop)
    ```bash
    cd Decorator.Pattern/public
    java CoffeShop
    ```

# Prerequsite
```bash
# Ubuntu Environment
apt update && apt upgrade -y
# install jdk
apt install -y openjdk-11-jdk

# verify installation
java --version
javac --version

```
