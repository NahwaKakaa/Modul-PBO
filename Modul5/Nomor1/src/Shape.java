abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    // Abstract method to be implemented by subclasses
    public abstract double calculateArea();
    
    public void display() {
        System.out.println("Shape: " + name + ", Area: " + calculateArea());
    }
}