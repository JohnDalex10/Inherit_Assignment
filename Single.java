// Parent class
class Dog {
    void sleep() {
        System.out.println("Sleeping");
    }
}

// Child class
class Wolf extends Dog {
    void eat() {
        System.out.println("Eating");
    }
}

// Main class
public class Single {
    public static void main(String[] args) {
        Wolf var = new Wolf();
        var.sleep();  // Inherited from Animal
        var.eat();
    }
}