# Two Pointers

## Definition

Two Pointers is a technique where two indices move through an array or string to solve problems efficiently, usually reducing O(n²) solutions to O(n).

---

## Recognition Pattern

Use Two Pointers when:

* Array is sorted
* Need to find pairs
* Need to remove duplicates
* Need to reverse an array/string
* Need to compare elements from both ends

Keywords:

* Pair Sum
* Sorted Array
* Closest Pair
* Remove Duplicates
* Reverse

---

## Intuition

Instead of checking every pair:

```text
O(n²)
```

Use two pointers:

```text
left --------> <-------- right
```

Move only the pointer that helps reach the answer.

This avoids unnecessary comparisons.

---

## Basic Template

```java
int left = 0;
int right = nums.length - 1;

while(left < right){

    if(condition){
        return answer;
    }
    else if(needsLargerValue){
        left++;
    }
    else{
        right--;
    }
}
```

---

## Complexity

Time: O(n)

Space: O(1)

---

## Common Variations

### 1. Opposite Direction

```text
left → ← right
```

Examples:

* Two Sum II
* Container With Most Water
* Valid Palindrome

---

### 2. Same Direction

```text
slow → → → 
fast → → → →
```

Examples:

* Remove Duplicates from Sorted Array
* Move Zeroes

---

## Common Problems

### Easy

* LeetCode 167 – Two Sum II
* LeetCode 125 – Valid Palindrome
* LeetCode 344 – Reverse String
* LeetCode 283 – Move Zeroes
* LeetCode 26 – Remove Duplicates from Sorted Array

### Medium

* LeetCode 11 – Container With Most Water
* LeetCode 15 – 3Sum
* LeetCode 18 – 4Sum

---

## Interview Clues

If you see:

* Sorted Array
* Pair Search
* Reverse
* Remove Duplicates
* Compare Ends

Think:

```text
Two Pointers
```

---

