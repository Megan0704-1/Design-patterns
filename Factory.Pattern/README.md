It is imperative to understand the difference between `interface` and `implementation` before really dig into the world of Design pattern and Object-oriented programming.

# Interface
1. definition:
    Interface is a class that defines some not-implemented methods.
2. Effect:
    Since no specific implementation is programmed in an interface, it can be viewed as a contract that defines specific operations. Different classes can be handled in similar ways through interfaces, even if they are implemented totally different.

# Implementation
1. definition:
    An implementation is a piece of code specifically programed how a method should be executed. When a class implements an interface, it provides the implemented code for this interface.
2. Effect:
    Implementation provides concrete functionality of interfaces.

# Examples
    See Example.java in the directory.

## How to executue
```bash
mkdir bin
javac Example.java -d bin
java -cp bin Example # This runs from the bin directory (-cp: class path)
```
