// Animal class
class Animal {
    void sleep() {
        System.out.println("Sleeping");
    }
}

// Parent class
class Cat extends Animal {
    void eat() {
        System.out.println("Eating");
    }
}

// Child class
class Lion extends Cat {
    void run() {
        System.out.println("Running");
    }
}

// Main class
public class Multilevel {
    public static void main(String[] args) {
        Lion var = new Lion();
        var.sleep(); // From Animal
        var.eat(); // From Cat
        var.run();
    }
}