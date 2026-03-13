# HashMap in Java

## Definition

HashMap stores **key-value pairs**.

It is part of the Java Collections Framework.

---

## Features

* Fast lookup
* Unique keys
* Allows one null key
* Unordered

---

## Example

```java
import java.util.*;

public class Main {

    public static void main(String[] args){

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Apple");
        map.put(2,"Banana");

        System.out.println(map.get(1));
    }
}
```

---

## Important Methods

| Method        | Purpose        |
| ------------- | -------------- |
| put()         | insert data    |
| get()         | retrieve value |
| remove()      | delete key     |
| containsKey() | check key      |

---

## Usage in DSA

HashMap is used for:

* Two Sum
* Frequency counting
* Sliding window problems
