### ✅ Task 1: `RemoveNumber.java`

**Goal:** Create a list of numbers, show them, let the user remove a number if it exists, and show the updated list.

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add 5 numbers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display numbers using an iterator
        System.out.println("Numbers in the list:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Ask user which number to remove
        System.out.print("Enter a number to remove: ");
        int toRemove = scanner.nextInt();

        if (numbers.contains(toRemove)) {
            numbers.remove(Integer.valueOf(toRemove));
            System.out.println("Number removed.");
        } else {
            System.out.println("Number not found.");
        }

        // Show updated list
        System.out.println("Updated numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```
