public class Main {
    // Main method to test the class
    public static void main(String[] args) {
        Person person = new Person();
        
        // Using setters
        person.setName("John Doe");
        person.setAge(25);
        
        // Using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        
        // Testing invalid age
        person.setAge(-5);
    }
}
