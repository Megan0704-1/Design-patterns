interface Shape {
    // an interface called Shape, defined a method called draw.
    // the implementation of draw is invisible.
    void draw();
}

// Circle class implementes Shape interface
class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

// Square class implements Shape interface
class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

// main class
public class Example {
    public static void main(String[] args){
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw();
        square.draw();
    }
}
