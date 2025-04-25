class DSA { // Parent class
    void giveOrder() {
        System.out.println("DSA gave an order");
    }
}

class Chairman extends DSA { // Middle class
    void relayOrder() {
        System.out.println("Chairman relayed DSA's order");
    }
}

class HallRep extends Chairman { // Child class
    void reRelayOrder() {
        System.out.println("Hall Rep relayed Chairman's order");
    }
}

// Main class
public class MultilevelInherit {
    public static void main(String[] args) {
        HallRep rep = new HallRep();
        rep.giveOrder();   // From DSA
        rep.relayOrder();    // From Chairman
        rep.reRelayOrder(); // From HallRep
    }
}
