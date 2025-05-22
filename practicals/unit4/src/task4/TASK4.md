## ✅ **Task 4a: Abstract Book class**

**Summary:** A book has a title and a price. Price is set by the child classes.

```java
public abstract class Book {
    protected String bookTitle;
    protected double bookPrice;

    public Book(String title) {
        bookTitle = title;
    }

    public String getTitle() {
        return bookTitle;
    }

    public double getPrice() {
        return bookPrice;
    }

    public abstract void setPrice();
}
```

---

## ✅ **Task 4b: Fiction and NonFiction books**

**Summary:** Fiction books cost R240.99 and NonFiction books cost R370.99.

```java
public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    public void setPrice() {
        bookPrice = 240.99;
    }
}

public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    public void setPrice() {
        bookPrice = 370.99;
    }
}
```

---

## ✅ **Task 4c: BookDemo.java – Make one Fiction and one NonFiction**

```java
import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fiction Book
        System.out.print("Enter title for Fiction book: ");
        String fictionTitle = input.nextLine();
        Fiction fictionBook = new Fiction(fictionTitle);

        // NonFiction Book
        System.out.print("Enter title for NonFiction book: ");
        String nonFictionTitle = input.nextLine();
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle);

        // Show both books
        System.out.println("\n--- Book Details ---");
        System.out.println("Fiction: " + fictionBook.getTitle() + " - R" + fictionBook.getPrice());
        System.out.println("NonFiction: " + nonFictionBook.getTitle() + " - R" + nonFictionBook.getPrice());

        input.close();
    }
}
```

---

## ✅ **Task 4d: BookArray.java – Add 10 books (F or N)**

**Summary:** User adds 10 books. Each can be Fiction or NonFiction.

```java
import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] allBooks = new Book[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter title for book " + (i + 1) + ": ");
            String title = input.nextLine();

            String type = "";
            while (true) {
                System.out.print("Is it Fiction (F) or NonFiction (N)? ");
                type = input.nextLine().toUpperCase();
                if (type.equals("F") || type.equals("N")) {
                    break;
                } else {
                    System.out.println("Please enter F or N.");
                }
            }

            if (type.equals("F")) {
                allBooks[i] = new Fiction(title);
            } else {
                allBooks[i] = new NonFiction(title);
            }
        }

        // Show all 10 books
        System.out.println("\n--- All Books ---");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + allBooks[i].getTitle() + " - R" + allBooks[i].getPrice());
        }

        input.close();
    }
}
```