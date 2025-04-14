// Parent class
class Family {
    void sleep() {
        System.out.println("Sleeping");
    }
}

// Man child class
class Man extends Family {
    void eat() {
        System.out.println("Eating");
    }
}

// Woman child class
class Woman extends Family {
    void talk() {
        System.out.println("Talking");
    }
}

// Literally Child class
class Child extends Family {
    void walk() {
        System.out.println("Walking");
    }
}

// Main class
public class Hierarchical {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        Child child = new Child();

        man.sleep();  // From Family
        man.eat();

        System.out.println();

        woman.sleep();  // From Family
        woman.talk();

        System.out.println();

        child.sleep(); // From Family
        child.walk();
    }
}