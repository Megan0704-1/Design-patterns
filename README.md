# Design-patterns

To replicate the result, run the following command in shell
```bash
git clone https://github.com/Megan0704-1/Design-patterns.git
cd Design-patterns
export ROOT_PATH=${PWD}
```

- Abstract.Factory.Pattern (Pizza Store)
    ```bash
    # automated build process
    cd Abstract.Factory.Pattern/scripts
    source build-linux.sh
    ./build-linux.sh

    # Run compiled programs
    ./run-native.sh
    ./run-ext.sh
    ./run-factory.sh
    ./run-final.sh
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
