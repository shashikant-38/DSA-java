# HashMap in Java

## Definition

HashMap is a class in Java that stores data in key-value pairs.

It belongs to the Map interface in the Java Collections Framework.

## Features

* Stores data as Key → Value
* Keys must be unique
* Values can be duplicate
* Fast insertion and retrieval
* Does not maintain insertion order
* Allows one null key and multiple null values

## Example

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(3, "Mango");

        System.out.println(map);
    }
}
```

### Output

```text
{1=Apple, 2=Orange, 3=Mango}
```

## Important Methods

| Method          | Purpose                |
| --------------- | ---------------------- |
| put()           | Insert key-value pair  |
| get()           | Access value using key |
| remove()        | Delete entry           |
| containsKey()   | Check if key exists    |
| containsValue() | Check if value exists  |
| size()          | Number of entries      |
| keySet()        | Get all keys           |
| values()        | Get all values         |

## Example of get()

```java
System.out.println(map.get(2));
```

### Output

```text
Orange
```

## When to Use

Use HashMap when you need:

* Fast searching by key
* Key-value storage
* Frequent insertions and retrievals
* Unique keys

## Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| put()     | O(1)       |
| get()     | O(1)       |
| remove()  | O(1)       |

## Viva Points

* HashMap implements the Map interface.
* Stores data in key-value pairs.
* Keys are unique.
* Allows one null key.
* Does not maintain insertion order.
* Average time complexity of put() and get() is O(1).
