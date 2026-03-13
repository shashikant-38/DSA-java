
# Inheritance in Java

## Definition

Inheritance allows one class to **acquire properties and methods of another class**.

It promotes **code reuse**.

---

## Syntax

```java
class Child extends Parent
```

---

## Example

```java
class Animal {

    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark(){
        System.out.println("Dog is barking");
    }
}

public class Main {

    public static void main(String[] args){

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
```

---

## Types of Inheritance

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance

Java **does not support multiple inheritance with classes**.

---

## Advantages

* Code reuse
* Less redundancy
* Easy maintenance
