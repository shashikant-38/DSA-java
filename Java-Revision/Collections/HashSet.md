# HashSet in Java

## Definition

HashSet stores **unique elements only**.

It implements the `Set` interface.

---

## Features

* No duplicate elements
* Unordered collection
* Fast operations

---

## Example

```java
import java.util.*;

public class Main {

    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);
    }
}
```

---

## Output

```
[10,20]
```

Duplicate element is automatically removed.

---

## Important Methods

| Method     | Purpose        |
| ---------- | -------------- |
| add()      | insert element |
| remove()   | delete element |
| contains() | check element  |

---

## Usage in DSA

HashSet is useful for:

* removing duplicates
* checking existence in O(1)
