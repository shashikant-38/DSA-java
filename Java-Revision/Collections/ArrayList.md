# ArrayList in Java

## Definition

ArrayList is a **dynamic array implementation** in Java.

It belongs to the `List` interface in the Java Collections Framework.

---

## Features

* Ordered collection
* Allows duplicates
* Dynamic size
* Fast random access

---

## Example

```java
import java.util.*;

public class Main {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}
```

---

## Important Methods

| Method   | Purpose            |
| -------- | ------------------ |
| add()    | insert element     |
| get()    | access element     |
| remove() | delete element     |
| size()   | number of elements |

---

## When to Use

Use ArrayList when you need:

* frequent reading
* dynamic array
