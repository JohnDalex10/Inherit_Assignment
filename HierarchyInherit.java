class Animal { // Parent class
    void eat() {
        System.out.println("Eating");
    }
}

class Chicken extends Animal {  // Child Class 1
    void layEggs() {
        System.out.println("Laying eggs");
    }
}

class Bird extends Animal { // Child Class 2
    void fly() {
        System.out.println("Flying");
    }
}

public class HierarchyInherit { // Main class
    public static void main(String[] args) {
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        bird.eat();
        chicken.eat();
        System.out.println();

        bird.fly();
        chicken.layEggs();

        System.out.println();
    }
}
