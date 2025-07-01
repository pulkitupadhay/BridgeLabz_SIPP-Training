package Inheritence;

interface Worker {
    void performDuties();
}

class Person_P {
    String name;
    int id;

    Person_P(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person_P implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Chef " + name + " cooks " + specialty + " dishes.");
    }
}

class Waiter extends Person_P implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    public void performDuties() {
        System.out.println("Waiter " + name + " serves " + tableCount + " tables.");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Worker chef = new Chef("Rakesh", 101, "Italian");
        Worker waiter = new Waiter("Amit", 102, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}
