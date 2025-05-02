[](https://www.microsoft.com/en-za/microsoft-teams/join-a-meeting)
Meeting ID: 931 826 816 585 9
Passcode: 5uF7At
[Teams](https://teams.microsoft.com/v2/)
# Java Inheritance Tutorial 🌱➡️🌳

Welcome to this simple guide on **inheritance** in Java! Learn how classes can share properties and methods, just like kids inherit traits from parents. Let's dive in! 🏊♂️

## Table of Contents
1. [What is Inheritance?](#what-is-inheritance-)
2. [Basic Example: 🐾 Animal & Dog](#basic-example--animal--dog)
3. [Method Overriding](#method-overriding-)
4. [The `super` Keyword](#the-super-keyword-)
5. [Protected Access](#protected-access-)
6. [Types of Inheritance](#types-of-inheritance-)
7. [Important Notes](#important-notes-)

---

## What is Inheritance? 🧐

**Inheritance** lets one class (child/subclass) inherit fields and methods from another class (parent/superclass).  
✅ **Benefits**: Reuse code, avoid repetition, and organize code better!

---

## Basic Example: 🐾 Animal & Dog

```java
// Superclass (Parent)
class Animal {
    void eat() {
        System.out.println("Nom nom! 🍖");
    }
}

// Subclass (Child)
class Dog extends Animal {  // "extends" means inheritance
    void bark() {
        System.out.println("Woof! 🐾");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Inherited from Animal
        myDog.bark();  // Own method
    }
}
```

**Output**:  
```
Nom nom! 🍖
Woof! 🐾
```

---

## Method Overriding 🔄

Override a parent's method in the child class using `@Override`.

```java
class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {  // Override parent's method
        System.out.println("Woof! 🦴");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();  // Uses Dog's version
    }
}
```

**Output**:  
```
Woof! 🦴
```

---

## The `super` Keyword 🔑

Use `super` to:  
1. Call parent's methods.  
2. Call parent's constructor.

```java
class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);  // Calls Animal's constructor
    }
    
    void display() {
        System.out.println("Name: " + super.name);  // Access parent's field
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.display();
    }
}
```

**Output**:  
```
Name: Buddy
```

---

## Protected Access 🛡️

- **`protected`** fields/methods are accessible in subclasses (even outside the package).

```java
class Animal {
    protected String diet = "Omnivore";  // Accessible in subclasses
}

class Dog extends Animal {
    void showDiet() {
        System.out.println("Diet: " + diet);  // Direct access
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.showDiet();
    }
}
```

**Output**:  
```
Diet: Omnivore
```

---

## Types of Inheritance 📚

1. **Single**: One subclass → one superclass.  
   (Example: `Dog` → `Animal`)

2. **Multilevel**: Chain of inheritance.  
   ```java
   class Animal { }
   class Dog extends Animal { }
   class Puppy extends Dog { }  // Inherits from Dog AND Animal
   ```

3. **Hierarchical**: Multiple subclasses → one superclass.  
   ```java
   class Animal { }
   class Dog extends Animal { }
   class Cat extends Animal { }  // Both Dog and Cat inherit Animal
   ```

⚠️ **Java doesn’t support Multiple Inheritance** (one subclass → multiple superclasses). Use **interfaces** instead!

---

## Important Notes ⚠️

- A subclass **cannot inherit private members** of the superclass.
- Use `super()` to call the parent’s constructor (it must be the first line in the child’s constructor).
- All classes implicitly inherit from `Object` class (Java's ultimate superclass).

---

Happy coding! 🎉 Now go create your own class hierarchies! 🚀