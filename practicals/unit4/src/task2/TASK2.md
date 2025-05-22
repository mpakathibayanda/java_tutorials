## ✅ **Task 2a: GucciShirt class**

**Summary:** A shirt has order number, size, color, and price. Big sizes cost more.

```java
public class GucciShirt {
    private int orderNumber;
    private String shirtSize;
    private String shirtColor;
    private double shirtPrice;

    public void setOrderNumber(int number) {
        orderNumber = number;
    }

    public void setShirtSize(String size) {
        shirtSize = size;
        if (size.equals("XXL") || size.equals("XXXL")) {
            shirtPrice = 299.99;
        } else {
            shirtPrice = 199.99;
        }
    }

    public void setShirtColor(String color) {
        shirtColor = color;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getShirtSize() {
        return shirtSize;
    }

    public String getShirtColor() {
        return shirtColor;
    }

    public double getShirtPrice() {
        return shirtPrice;
    }
}
```

---

## ✅ **Task 2b: PersonalizedShirt class (child class)**

**Summary:** This shirt also has a slogan.

```java
public class PersonalizedShirt extends GucciShirt {
    private String shirtSlogan;

    public void setShirtSlogan(String slogan) {
        shirtSlogan = slogan;
    }

    public String getShirtSlogan() {
        return shirtSlogan;
    }
}
```

---

## ✅ **Task 2c: GucciDemo.java – Use both classes**

```java
import java.util.Scanner;

public class GucciDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First GucciShirt
        GucciShirt shirt1 = new GucciShirt();
        System.out.print("Enter order number for shirt 1: ");
        shirt1.setOrderNumber(input.nextInt());
        input.nextLine();

        System.out.print("Enter size for shirt 1: ");
        shirt1.setShirtSize(input.nextLine());

        System.out.print("Enter color for shirt 1: ");
        shirt1.setShirtColor(input.nextLine());

        // Second GucciShirt (Personalized)
        PersonalizedShirt shirt2 = new PersonalizedShirt();
        System.out.print("\nEnter order number for shirt 2: ");
        shirt2.setOrderNumber(input.nextInt());
        input.nextLine();

        System.out.print("Enter size for shirt 2: ");
        shirt2.setShirtSize(input.nextLine());

        System.out.print("Enter color for shirt 2: ");
        shirt2.setShirtColor(input.nextLine());

        System.out.print("Enter slogan for shirt 2: ");
        shirt2.setShirtSlogan(input.nextLine());

        // Show Shirt 1
        System.out.println("\n--- Shirt 1 Details ---");
        System.out.println("Order #: " + shirt1.getOrderNumber());
        System.out.println("Size: " + shirt1.getShirtSize());
        System.out.println("Color: " + shirt1.getShirtColor());
        System.out.println("Price: R" + shirt1.getShirtPrice());

        // Show Shirt 2
        System.out.println("\n--- Shirt 2 Details ---");
        System.out.println("Order #: " + shirt2.getOrderNumber());
        System.out.println("Size: " + shirt2.getShirtSize());
        System.out.println("Color: " + shirt2.getShirtColor());
        System.out.println("Price: R" + shirt2.getShirtPrice());
        System.out.println("Slogan: " + shirt2.getShirtSlogan());

        input.close();
    }
}
```