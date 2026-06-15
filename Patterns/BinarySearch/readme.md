# Binary Search - Quick Revision Guide 🚀

## When to Use Binary Search?

Use Binary Search when:

* Array is **sorted**
* Need to find an element efficiently
* Need **minimum/maximum possible answer**
* Search space is monotonic (True/False pattern)

Time Complexity: **O(log n)**

Space Complexity: **O(1)**

---

# Binary Search Template

```java
public int binarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] < target)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;
}
```

---

# Binary Search Patterns

## 1. Classic Binary Search

Find exact target.

Problems:

* Leetcode 704
* Search Insert Position (35)

---

## 2. Lower Bound

First index where:

```text
arr[i] >= target
```

Template:

```java
int ans = arr.length;

while (low <= high) {
    int mid = low + (high - low) / 2;

    if (arr[mid] >= target) {
        ans = mid;
        high = mid - 1;
    } else {
        low = mid + 1;
    }
}
```

---

## 3. Upper Bound

First index where:

```text
arr[i] > target
```

---

## 4. First Occurrence

Move left after finding target.

Problems:

* First and Last Position (34)

---

## 5. Last Occurrence

Move right after finding target.

Problems:

* First and Last Position (34)

---

## 6. Rotated Sorted Array

Identify sorted half.

Problems:

* Leetcode 33
* Leetcode 81

Logic:

```text
Left half sorted?
Yes -> Check target inside it

Otherwise search right half
```

---

## 7. Single Element in Sorted Array

Problems:

* Leetcode 540

Key Observation:

```text
Before single:
Even index -> pair starts

After single:
Odd index -> pair starts
```

---

## 8. Find Peak Element

Problems:

* Leetcode 162

Logic:

```text
If nums[mid] < nums[mid+1]
Go right

Else
Go left
```

---

## 9. Minimum in Rotated Sorted Array

Problems:

* Leetcode 153

Track minimum while searching.

---

# Binary Search on Answers

## Pattern

```text
Can we achieve answer X?

YES -> Try smaller/larger

NO -> Opposite direction
```

---

# Important Problems

## Easy

* 704. Binary Search
* 35. Search Insert Position
* 69. Sqrt(x)

---

## Medium

* 33. Search in Rotated Sorted Array
* 34. First and Last Position
* 153. Find Minimum in Rotated Array
* 162. Find Peak Element
* 540. Single Element in Sorted Array

---

## Binary Search on Answers

* 875. Koko Eating Bananas
* 1283. Smallest Divisor Given Threshold
* 1011. Capacity To Ship Packages
* 1482. Minimum Days to Make Bouquets
* 1552. Magnetic Force Between Balls
* 2226. Maximum Candies Allocated

---

# BS on Answer Template

```java
while (low <= high) {
    int mid = low + (high - low) / 2;

    if (possible(mid)) {
        ans = mid;
        high = mid - 1;
    } else {
        low = mid + 1;
    }
}
```

---

# Common Mistakes

❌ mid = (low + high) / 2

✅ mid = low + (high - low) / 2

---

❌ while(low < high)

Use only when pattern requires.

---

❌ Forgetting answer variable.

---

❌ Wrong search space.

Always identify:

```text
Minimum possible answer
Maximum possible answer
```

---

# Leetcode prblms 

1. 704
2. 35
3. 69
4. 34
5. 33
6. 153
7. 162
8. 540
9. 875
10. 1283
11. 1011
12. 1482

Master these → Most Binary Search interview questions become straightforward.
