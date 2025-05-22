### ✅ Task 2: `StringArrayList.java`

**Goal:** Keep asking for words until the user types "stop", then show all words separated by commas.

```java
import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word (or type 'stop' to finish): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            words.add(input);
        }

        System.out.println("You entered:");
        System.out.println(String.join(", ", words));
    }
}
```