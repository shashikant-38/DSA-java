# Java File Handling

## 1. What is File Handling?

File handling allows a program to **create, read, write, and delete files**.

It is useful for:

* Storing data permanently
* Reading configuration files
* Saving application data

Java provides the **java.io package** for file handling.

---

# 2. Important Classes in File Handling

| Class          | Description                  |
| -------------- | ---------------------------- |
| File           | Represents file or directory |
| FileReader     | Reads file                   |
| FileWriter     | Writes file                  |
| BufferedReader | Reads text efficiently       |
| BufferedWriter | Writes text efficiently      |

---

# 3. Creating a File

Example:

```java
import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        try {

            File file = new File("test.txt");

            if(file.createNewFile()) {
                System.out.println("File created");
            }

            else {
                System.out.println("File already exists");
            }

        }

        catch(IOException e) {
            System.out.println("Error occurred");
        }

    }

}
```

---

# 4. Writing to a File

Example:

```java
import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("test.txt");

            writer.write("Hello Java File Handling");

            writer.close();

            System.out.println("Data written successfully");

        }

        catch(IOException e) {
            System.out.println("Error occurred");
        }

    }

}
```

---

# 5. Reading a File

Example:

```java
import java.io.File;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        try {

            File file = new File("test.txt");

            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();

        }

        catch(Exception e) {
            System.out.println("Error reading file");
        }

    }

}
```

---

# 6. Deleting a File

Example:

```java
import java.io.File;

public class Test {

    public static void main(String[] args) {

        File file = new File("test.txt");

        if(file.delete()) {
            System.out.println("File deleted");
        }

        else {
            System.out.println("Failed to delete file");
        }

    }

}
```

---

# 7. Advantages of File Handling

* Permanent data storage
* Data sharing between programs
* Useful for logs and reports
* Used in real-world applications

---

# Quick Revision

* **File** → create file
* **FileWriter** → write file
* **FileReader / Scanner** → read file
* **delete()** → delete file
