### ✅ Task 3a: `Apartment.java`

**Goal:** Create an Apartment class with basic info and sorting support.

```java
public class Apartment implements Comparable<Apartment> {
    String address;
    String number;
    double rent;
    int bedrooms;

    public Apartment(String address, String number, double rent, int bedrooms) {
        this.address = address;
        this.number = number;
        this.rent = rent;
        this.bedrooms = bedrooms;
    }

    public String toString() {
        return "Address: " + address +
               ", Apt#: " + number +
               ", Rent: $" + rent +
               ", Bedrooms: " + bedrooms;
    }

    public int compareTo(Apartment other) {
        return Double.compare(this.rent, other.rent); // Sort by rent
    }
}
```

---

### ✅ Task 3b: `ApartmentsArray.java`

**Goal:** Ask the user to enter 10 apartments, store them in an array, then show them.

```java
import java.util.Scanner;

public class ApartmentsArray {
    public static void main(String[] args) {
        Apartment[] apartments = new Apartment[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < apartments.length; i++) {
            System.out.println("Enter info for apartment " + (i + 1));

            System.out.print("Street address: ");
            String address = scanner.nextLine();

            System.out.print("Apartment number: ");
            String number = scanner.nextLine();

            System.out.print("Monthly rent: ");
            double rent = Double.parseDouble(scanner.nextLine());

            System.out.print("Number of bedrooms: ");
            int bedrooms = Integer.parseInt(scanner.nextLine());

            apartments[i] = new Apartment(address, number, rent, bedrooms);
        }

        System.out.println("\nApartments entered:");
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }
    }
}
```

---

### ✅ Task 3c: `ApartmentsArrayList.java`

**Goal:** Use an `ArrayList` to store apartments until the user types "stop", then sort and show them.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ApartmentsArrayList {
    public static void main(String[] args) {
        ArrayList<Apartment> apartments = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Street address (or 'stop' to finish): ");
            String address = scanner.nextLine();
            if (address.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Apartment number: ");
            String number = scanner.nextLine();

            System.out.print("Monthly rent: ");
            double rent = Double.parseDouble(scanner.nextLine());

            System.out.print("Number of bedrooms: ");
            int bedrooms = Integer.parseInt(scanner.nextLine());

            apartments.add(new Apartment(address, number, rent, bedrooms));
        }

        Collections.sort(apartments); // Sort by rent (uses compareTo)

        System.out.println("\nSorted apartments (by rent):");
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }
    }
}
```

---

### ✅ Task 3d: `ApartmentsLinkedList.java`

**Goal:** Use a `LinkedList`, sort by number of rooms (not rent), and show the list.

```java
import java.util.LinkedList;
import java.util.Scanner;

public class ApartmentsLinkedList {
    public static void main(String[] args) {
        LinkedList<Apartment> apartments = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Street address (or 'stop' to finish): ");
            String address = scanner.nextLine();
            if (address.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Apartment number: ");
            String number = scanner.nextLine();

            System.out.print("Monthly rent: ");
            double rent = Double.parseDouble(scanner.nextLine());

            System.out.print("Number of bedrooms: ");
            int bedrooms = Integer.parseInt(scanner.nextLine());

            apartments.add(new Apartment(address, number, rent, bedrooms));
        }

        apartments.sort((a1, a2) -> Integer.compare(a1.bedrooms, a2.bedrooms)); // Sort by rooms

        System.out.println("\nSorted apartments (by bedrooms):");
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }
    }
}
```

---

### ✅ Task 3e: `ApartmentsLinkedListMod.java`

**Goal:** Same as Task 3d but remove all apartments on a given street.

```java
import java.util.LinkedList;
import java.util.Scanner;

public class ApartmentsLinkedListMod {
    public static void main(String[] args) {
        LinkedList<Apartment> apartments = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Street address (or 'stop' to finish): ");
            String address = scanner.nextLine();
            if (address.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Apartment number: ");
            String number = scanner.nextLine();

            System.out.print("Monthly rent: ");
            double rent = Double.parseDouble(scanner.nextLine());

            System.out.print("Number of bedrooms: ");
            int bedrooms = Integer.parseInt(scanner.nextLine());

            apartments.add(new Apartment(address, number, rent, bedrooms));
        }

        // Show all apartments
        System.out.println("\nApartments before removal:");
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }

        // Ask for address to remove
        System.out.print("\nEnter the street address to remove: ");
        String toRemove = scanner.nextLine();

        apartments.removeIf(apt -> apt.address.equalsIgnoreCase(toRemove));

        // Show list again
        System.out.println("\nApartments after removal:");
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }
    }
}
```