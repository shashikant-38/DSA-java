# Binary Search

## Definition

Binary Search is used to search an element in a sorted array by repeatedly dividing the search space into two halves.

---

## Recognition Pattern

Use Binary Search when:

* Array is sorted
* Need to search an element
* Need first/last occurrence
* Need insertion position
* Need minimum/maximum valid answer

Keywords:

* Sorted
* Search
* Find Position
* Minimize / Maximize

---

## Intuition

Instead of checking every element:

n → n/2 → n/4 → n/8

The search space is halved every iteration.

Therefore:

Time Complexity = O(log n)

---

## Template

```java
int low = 0;
int high = nums.length - 1;

while(low <= high){

    int mid = low + (high - low) / 2;

    if(nums[mid] == target){
        return mid;
    }
    else if(nums[mid] < target){
        low = mid + 1;
    }
    else{
        high = mid - 1;
    }
}

return -1;
```

## Complexity

Time: O(log n)

Space: O(1)

---

## Common Variations

### 1. Binary Search

LeetCode 704

### 2. Search Insert Position

LeetCode 35

### 3. First and Last Occurrence

LeetCode 34

### 4. Search in Rotated Sorted Array

LeetCode 33

### 5. Search in 2D Matrix

LeetCode 74

---

## Personal Notes

* Always calculate mid using:
  int mid = low + (high - low) / 2;

* If target not found:

  * Binary Search → return -1
  * Search Insert Position → return low

* Whenever search space halves, think O(log n).
