# Polymorphism in Java

## Definition

Polymorphism means **one method behaving differently in different situations**.

Two types:

* Compile Time Polymorphism
* Runtime Polymorphism

---

# 1. Method Overloading (Compile Time)

Same method name but **different parameters**.

### Example

```java
class MathOperation {

    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}
```

---

# 2. Method Overriding (Runtime)

Child class **changes implementation of parent method**.

### Example

```java
class Animal{

    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog barks");
    }
}
```

---

## Advantages

* Flexibility
* Code reusability
* Improves readability
