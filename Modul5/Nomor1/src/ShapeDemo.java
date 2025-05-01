public class ShapeDemo {
    public static void main(String[] args) {
        // Polymorphic array of different shapes
        Shape[] shapes = new Shape[3];
        shapes[1] = new Circle("Circle", 5.0);
        shapes[0] = new Rectangle("Rectangle", 4.0, 6.0);
        shapes[2] = new Triangle("Triangle", 3.0, 4.0);
        
        // Demonstrating polymorphism
        System.out.println("Calculating areas of different shapes:");
        for (Shape shape : shapes) {
            shape.display();
        }
    }
}