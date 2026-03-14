# Java Multithreading

## 1. What is Multithreading?

Multithreading means **executing multiple threads (tasks) simultaneously within a program**.

A **Thread** is a small unit of a process.

Example:

* Downloading a file while playing music
* Running background tasks in applications

---

# 2. Advantages of Multithreading

* Better CPU utilization
* Faster program execution
* Multiple tasks can run simultaneously
* Used in games, servers, and real-time applications

---

# 3. Thread Life Cycle

A thread goes through several states:

1. **New** → Thread object created
2. **Runnable** → Ready to run
3. **Running** → Thread executing
4. **Blocked / Waiting** → Waiting for resources
5. **Terminated** → Thread finished

---

# 4. Creating a Thread in Java

There are **two ways** to create a thread.

---

# Method 1: Extending Thread Class

Example:

```java
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }

}

public class Test {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

    }

}
```

Output:

```
Thread is running
```

---

# Method 2: Implementing Runnable Interface

Example:

```java
class MyThread implements Runnable {

    public void run() {
        System.out.println("Thread running using Runnable");
    }

}

public class Test {

    public static void main(String[] args) {

        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);

        t1.start();

    }

}
```

---

# 5. start() vs run()

| Method  | Description                        |
| ------- | ---------------------------------- |
| start() | Creates new thread and calls run() |
| run()   | Contains thread logic              |

Example:

```java
t1.start();  // Correct
t1.run();    // Just a normal method call
```

---

# 6. Thread Methods

Common thread methods:

| Method    | Description                |
| --------- | -------------------------- |
| start()   | Starts thread              |
| sleep()   | Pauses thread              |
| join()    | Waits for thread to finish |
| getName() | Gets thread name           |
| setName() | Sets thread name           |

Example:

```java
Thread.sleep(1000);
```

This pauses the thread for **1 second**.

---

# 7. Example of Multiple Threads

```java
class MyThread extends Thread {

    public void run() {

        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }

    }

}

public class Test {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

    }

}
```

Both threads run **simultaneously**.

---

# Quick Revision

* **Thread** → small unit of process
* **start()** → starts thread
* **run()** → thread logic
* **sleep()** → pause thread
* **Two ways** → Thread class / Runnable interface
