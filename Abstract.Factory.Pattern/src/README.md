There are four folders in ./src/

1. **nativepizza**
This is a dependent version of pizza store, no pattern is applied. 
> Classes are dependent to each other

2. **ext_nativepizza**
This is an advance version of pizza store, Simple Factory pattern is applied.
> Separate object creation with main pizza store logic. One factory responsible for all pizza product instantiation.

3. **factorypizza**
This folder implements Factory method pizza store, Extend the flexibility from ext_nativepizza.
> To make simple factory pattern more flexible, I create multiple factories to eliminate dependencies of instantiations on one factory.

4. **finalpizza**
This is the final version of pizza store, the pattern combines abstract factory pattern and factory method pattern.
