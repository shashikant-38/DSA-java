# Encapsulation in Java

## Definition

Encapsulation means **wrapping data (variables) and methods together inside a class** and restricting direct access to the data.

It is implemented using:

* `private` variables
* `public` getter and setter methods

---

## Why Encapsulation?

Encapsulation helps to:

* Protect data
* Control access
* Improve security
* Improve maintainability

---

## Example

```java
class Account {

    private double balance;

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
}

public class Main {

    public static void main(String[] args){

        Account a = new Account();

        a.setBalance(5000);
        System.out.println(a.getBalance());
    }
}
```

---

## Key Points

* Variables should be **private**
* Access should be through **getter/setter**
* Prevents unauthorized modification

---

## Real World Example

ATM machine:

You **cannot directly change bank balance**.
You access it through **ATM interface**.
