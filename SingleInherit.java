class DSA { // Parent class
    void giveOrder() {
        System.out.println("Gave an order");
    }
}

class Chairman extends DSA { // Child class
    void relayOrder() {
        System.out.println("Relayed DSA's order");
    }
}

public class SingleInherit { // Main class
    public static void main(String[] args) {
        Chairman student = new Chairman();
        student.relayOrder();
        student.giveOrder();
    }
}
