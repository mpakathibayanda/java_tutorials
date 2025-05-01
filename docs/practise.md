## 1) Bank & Account classes

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit increases the balance
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Withdraw decreases the balance if sufficient funds exist
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Account[%s] %s: $%.2f",
                accountNumber, customerName, balance);
    }
}

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    // Add a new account
    public void addAccount(Account acct) {
        accounts.add(acct);
    }

    // Remove an account by account number
    public boolean removeAccount(String acctNumber) {
        Iterator<Account> it = accounts.iterator();
        while (it.hasNext()) {
            if (it.next().getAccountNumber().equals(acctNumber)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    // Find account helper
    private Account findAccount(String acctNumber) {
        for (Account acct : accounts) {
            if (acct.getAccountNumber().equals(acctNumber)) {
                return acct;
            }
        }
        return null;
    }

    // Deposit into a specific account
    public void deposit(String acctNumber, double amount) {
        Account acct = findAccount(acctNumber);
        if (acct == null) {
            throw new IllegalArgumentException("Account not found.");
        }
        acct.deposit(amount);
    }

    // Withdraw from a specific account
    public void withdraw(String acctNumber, double amount) {
        Account acct = findAccount(acctNumber);
        if (acct == null) {
            throw new IllegalArgumentException("Account not found.");
        }
        acct.withdraw(amount);
    }

    public void printAllAccounts() {
        System.out.println("=== Bank Accounts ===");
        for (Account acct : accounts) {
            System.out.println(acct);
        }
    }

    // Simple demo in main
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(new Account("001", "Alice", 500.0));
        bank.addAccount(new Account("002", "Bob", 300.0));

        bank.deposit("001", 150.0);
        bank.withdraw("002", 50.0);

        bank.printAllAccounts();

        bank.removeAccount("002");
        System.out.println("\nAfter removing Bob's account:");
        bank.printAllAccounts();
    }
}
```

### Explanation

1. **Account class**  
   - Encapsulates customer data (`accountNumber`, `customerName`, `balance`).  
   - Provides `deposit(...)` and `withdraw(...)` with validation (no negative amounts, no overdraft).  
   - `toString()` for easy printing.

2. **Bank class**  
   - Manages a `List<Account>`.  
   - `addAccount(...)` / `removeAccount(...)` for account lifecycle.  
   - `deposit(...)` / `withdraw(...)` locate the right `Account` and delegate operations.  
   - Uses an `Iterator` for safe removal while iterating.

---

## 2) Abstract Bird class with Eagle and Hawk

```java
public abstract class Bird {
    // Abstract methods to be implemented by subclasses
    public abstract void fly();
    public abstract void makeSound();
}

public class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high with broad wings.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle screeches sharply.");
    }
}

public class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("Hawk glides swiftly in search of prey.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk emits a high-pitched whistle.");
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        Bird[] birds = { new Eagle(), new Hawk() };
        for (Bird b : birds) {
            b.fly();
            b.makeSound();
            System.out.println();
        }
    }
}
```

### Explanation

- **`abstract class Bird`** defines a template: *every* Bird must be able to `fly()` and `makeSound()`, but the details vary.  
- **Subclasses (`Eagle`, `Hawk`)** each provide their own behaviors.  
- In `BirdDemo.main(...)`, polymorphism lets us treat all birds uniformly but get distinct output.

---

## 3) MusicLibrary with random play

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<String> songs = new ArrayList<>();
    private Random rnd = new Random();

    // Add a song title
    public void addSong(String title) {
        songs.add(title);
    }

    // Remove a song by title
    public boolean removeSong(String title) {
        return songs.remove(title);
    }

    // Play a random song
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
            return;
        }
        int idx = rnd.nextInt(songs.size());
        System.out.println("Now playing: " + songs.get(idx));
    }

    public static void main(String[] args) {
        MusicLibrary lib = new MusicLibrary();
        lib.addSong("Bohemian Rhapsody");
        lib.addSong("Hotel California");
        lib.addSong("Stairway to Heaven");

        lib.playRandomSong();
        lib.removeSong("Hotel California");
        lib.playRandomSong();
    }
}
```

### Explanation

- Internally holds a `List<String>` of song titles.  
- `addSong(...)` and `removeSong(...)` manage the list.  
- `playRandomSong()` checks for emptiness, then picks a random index with `Random.nextInt(...)`.

---

## 4) Movie class with actors & reviews

```java
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private List<String> actors = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        if (actors != null) {
            this.actors.addAll(actors);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return new ArrayList<>(actors);
    }

    // Add a review
    public void addReview(String review) {
        reviews.add(review);
    }

    // Retrieve all reviews
    public List<String> getReviews() {
        return new ArrayList<>(reviews);
    }

    @Override
    public String toString() {
        return String.format("%s (dir. %s) starring %s",
                title, director, String.join(", ", actors));
    }

    // Demo
    public static void main(String[] args) {
        List<String> cast = List.of("Alice", "Bob", "Charlie");
        Movie m = new Movie("The Great Adventure", "Jane Doe", cast);

        System.out.println(m);
        m.addReview("Amazing visuals!");
        m.addReview("Compelling story.");

        System.out.println("Reviews:");
        for (String r : m.getReviews()) {
            System.out.println("- " + r);
        }
    }
}
```

### Explanation

- **Fields**:  
  - `title`, `director` are simple strings.  
  - `actors` and `reviews` are `List<String>` so we can hold any number of entries.  
- **Constructor** copies in the initial actors list.  
- `addReview(...)` appends to the reviews; `getReviews()` returns a copy to preserve encapsulation.  
- `toString()` gives a quick summary of the movie metadata.

---

### Key OOP concepts practiced here

1. **Encapsulation**: keeping fields `private` and exposing only controlled methods.  
2. **Abstraction & Polymorphism**: using an abstract `Bird` class and calling methods via the base type.  
3. **Composition**: `Bank` contains many `Account`s; `Movie` contains lists of actors and reviews.  
4. **Validation**: guarding against invalid operations (e.g., negative deposits, overdrafts).  
