package Constructor;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person original = new Person("Alice", 25);
        Person clone = new Person(original);

        original.displayPerson();
        clone.displayPerson();
    }
}
