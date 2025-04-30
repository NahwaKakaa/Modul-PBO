public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        Animal bird = new Bird("Tweety");
        
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}