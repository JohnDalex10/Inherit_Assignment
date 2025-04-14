// First interface
interface Mammal {
    void sleep();
}

// Second interface
interface Human {
    void read();
}

class Student implements Mammal, Human {
    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public void read() {
        System.out.println("I'm reading");
    }

    void study() {
        System.out.println("I'm studying COS202");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Student john = new Student();
        john.sleep();  // From Mammal interface
        john.read();  // From Human interface
        john.sleep(); // From Student class
    }
}