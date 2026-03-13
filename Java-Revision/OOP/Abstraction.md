# Abstraction in Java

## Definition

Abstraction means **hiding implementation details and showing only essential features**.

It is achieved using:

* Abstract class
* Interface

---

# Abstract Class

An abstract class **cannot be instantiated** and may contain abstract methods.

### Example

```java
abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw(){
        System.out.println("Drawing circle");
    }
}
```

---

# Interface

An interface contains **method declarations only**.

### Example

```java
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start(){
        System.out.println("Car starting");
    }
}
```

---

## Advantages

* Reduces complexity
* Improves maintainability
* Hides unnecessary details

