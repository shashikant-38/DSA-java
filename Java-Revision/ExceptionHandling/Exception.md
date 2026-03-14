# Java Exception Handling

## 1. What is Exception?

An **Exception** is an unexpected event that occurs during program execution and stops the normal flow of the program.

Example:

* Dividing a number by zero
* Accessing an invalid array index
* Opening a file that does not exist

Example code:

```java
public class Example {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int result = a / b; // Exception occurs here
        System.out.println(result);
    }
}
```

Output:

```
ArithmeticException: / by zero
```

---

# 2. Why Exception Handling is Needed

Without exception handling:

* Program crashes
* Remaining code will not execute

With exception handling:

* Program continues execution
* Errors can be handled properly

---

# 3. Types of Exceptions in Java

## 1. Checked Exception

Checked at **compile time**.

Examples:

* IOException
* SQLException
* FileNotFoundException

Example:

```java
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("test.txt");
    }
}
```

---

## 2. Unchecked Exception

Checked at **runtime**.

Examples:

* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException

Example:

```java
int a = 10;
int b = 0;

System.out.println(a/b);
```

---

# 4. try and catch

The **try block** contains code that may cause an exception.

The **catch block** handles the exception.

Syntax:

```java
try {
    // risky code
}
catch(Exception e) {
    // handling code
}
```

Example:

```java
public class Test {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int c = a / b;
            System.out.println(c);
        }

        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }
}
```

Output:

```
Cannot divide by zero
```

---

# 5. finally Block

The **finally block always executes** whether an exception occurs or not.

Syntax:

```java
try {
    // code
}
catch(Exception e) {
    // handle exception
}
finally {
    // always executes
}
```

Example:

```java
try {
    int a = 10/0;
}
catch(Exception e) {
    System.out.println("Exception occurred");
}
finally {
    System.out.println("Program finished");
}
```

Output:

```
Exception occurred
Program finished
```

---

# 6. throw Keyword

The **throw keyword is used to manually throw an exception**.

Example:

```java
public class Test {

    static void checkAge(int age) {

        if(age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        }

        else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
```

Output:

```
Exception in thread "main" java.lang.ArithmeticException
Not eligible for voting
```

---

# 7. throws Keyword

The **throws keyword declares exceptions** that a method might throw.

Example:

```java
import java.io.*;

class Test {

    static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}
```

---

# 8. Custom Exception

You can create your own exception class.

Example:

```java
class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

}

public class Test {

    static void checkNumber(int num) throws MyException {

        if(num < 0) {
            throw new MyException("Number cannot be negative");
        }

        else {
            System.out.println("Valid number");
        }
    }

    public static void main(String[] args) throws MyException {
        checkNumber(-5);
    }
}
```

---

# 9. Common Exceptions in Java

| Exception                      | Description               |
| ------------------------------ | ------------------------- |
| ArithmeticException            | Division by zero          |
| NullPointerException           | Accessing null object     |
| ArrayIndexOutOfBoundsException | Invalid array index       |
| NumberFormatException          | Invalid number conversion |
| FileNotFoundException          | File not found            |

---

# 10. Advantages of Exception Handling

* Prevents program crash
* Maintains normal program flow
* Makes debugging easier
* Improves program reliability

---

# short:=

* **try** → risky code
* **catch** → handle exception
* **finally** → always executes
* **throw** → manually throw exception
* **throws** → declare exception
