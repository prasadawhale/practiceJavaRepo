class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}

public class CallbyvalueReference {
    static void changeValue(int x) {
        x = 10;
        System.out.println("Inside changeValue: " + x); // Output: 10
        System.out.println("HashCode of x: " + System.identityHashCode(x)); // Different hash code
    }

    static void modifyObject(Person p) {
        p.name = "Prasad"; // Modifies the original object
    }

    static void modifyReference(Person p) {
        p = new Person("Bob"); // Creates a new object but only inside this method
        System.out.println("\nInside modifyReference:");
        System.out.println("Name in new object: " + p.name);
        System.out.println("HashCode of new p: " + System.identityHashCode(p));
    }

    public static void main(String[] args) {
        System.out.println("Call by value and reference in Java\n");

        // int a = 5;
        // System.out.println("Original value of a: " + a);
        // System.out.println("HashCode of a: " + System.identityHashCode(a)); //
        // Different hash code
        // changeValue(a);
        // System.out.println("Value of a after changeValue() function : " + a); //
        // Output: 5

        Person p1 = new Person("John");
        System.out.println("p1 name: " + p1.name);
        System.out.println("p1 hashCode: " + System.identityHashCode(p1));

        Person p2 = p1;
        System.out.println("p2 name: " + p2.name); // John
        System.out.println("p2 hashCode: " + System.identityHashCode(p2)); // Same hash code as p1

        // modifyObject(p1);
        // System.out.println("\nAfter modifyObject:");
        // System.out.println("p1 Name: " + person.name); // Alice
        // System.out.println("p1 HashCode (should be same): " +
        // System.identityHashCode(p1));

        modifyObject(p2);
        System.out.println("\nAfter modifyObject on p2:");
        System.out.println("p2 Name: " + p2.name); // Prasad
        System.out.println("p2 HashCode (should be same): " + System.identityHashCode(p2) + "and object in heap " + p2); // Same hash code as p1

        p2 = null;// p2 is now null, but p1 still points to the original object
        System.out.println("p2 is now null, but p1 still points to the original object.");
        // System.out.println("p1 name: " + p2.name); // Alice
        System.out.println("p2 hashCode: " + System.identityHashCode(p2) + "and object in heap " + p2); // Same hash code as before

        modifyReference(p1);
        System.out.println("\nAfter modifyReference:");
        System.out.println("Name: " + p1.name); // Still Alice
        System.out.println("HashCode (should be same): " + System.identityHashCode(p1)+ "and object in heap " + p1);

        p1 = new Person("Sidd"); // Reassigning p1 to a new object
        System.out.println("\nAfter reassigning p1:");
        System.out.println("p1 name: " + p1.name); // Sidd
        System.out.println("p1 hashCode: " + System.identityHashCode(p1) + "and object in heap " + p1); // Different hash code
    }
}
