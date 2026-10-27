# Algorithms Assignment - Trace Tables

## Problem 1: Array Equality

### Brute-Force Method

Input:
- first = [1, 2, 3]
- second = [3, 2, 1]

|i| first[i] | j values checked | Match at j | matched array after iteration | found |
|---|---|---|---|---|---|
| 0 | 1 | 0, 1, 2 | 2| [false, false, true] | true |
| 1 | 2 | 0, 1 | 1 | [false, true, true] | true |
| 2 | 3 | 0 | 0 | [true, true, true] | true |

Final result: true.

### Two-Pointer Method

Input:
- first = [1,2,3]
- second = [3,2,1]

After sorting:
- sortedFirst = [1,2,3]
- sortedSecond = [1,2,3]

| Iteration | left | right | sortedFirst[left] | sortedSecond[right] | Equal? |
|---|---|---|---|---|---|
| 1 | 0 | 0 | 1 | 1 | Yes |
| 2 | 1 | 1 | 2 | 2 | Yes |
| 3 | 2 | 2 | 3 | 3 | Yes |

Both pointers advanced to 3. The loop ends.

Final result: true.

## Problem 2: Palindrome Checker

### Brute-Force Method

Input: "Racecar"

After cleaning and converting to lowercase:

- cleaned = "racecar"
After reversing:
- reversed = 'racecar'

|---|---|---|---|---|
| 1 | 0 | r | r | Yes |
| 2 | 1 | a | a | Yes |
| 3 | 2 | c | c | Yes |
| 4 | 3 | e | e | Yes |
| 5 | 4 | c | c | Yes |
| 6 | 5 | a | a | Yes |
| 7 | 6 | r | r | Yes |

All characters match.

Final result: true.

### Two-Pointer Method

Input: "Racecar"

| Iteration | left | right | leftChar | rightChar | Match? |
|---|---|---|---|---|---|
| 1 | 0 | 6 | R | r | Yes (case-insensitive) |
| 2 | 1 | 5 | a | a | Yes |
| 3 | 2 | 4 | c | c | Yes |

Both pointers reach index 3. The loop ends

Final results: true.

## Problem 3: Shortest Subarray

Input:
- numbers = [2, 3, 1, 2, 4, 3]
- target = 7

### Brute-Force Method

The outer loop chooses a starting index. The inner loop adds elements untill the sum reaches the target or the array ends.

| start | end values checked | Running sums | Shortest length after iteration | Best indices |
|---|---|---|---|---|
| 0 | 0, 1, 2, 3 | 2, 5, 6, 8 | 4 | [0, 3]|
| 1 | 1, 2, 3, 4 | 3, 4, 6, 10 | 4 | [0, 3] |
| 2 | 2, 3, 4 | 1, 3, 7 | 3 | [2, 4] |
| 3 | 3, 4, 5 | 2, 6, 9 | 3 | [2, 4] |
| 4 | 4, 5 | 4, 7 | 2 | [4, 5] |
| 5 | 5 | 3 | 2 | [4, 5] |

Final result: [4, 5].

### Sliding-Window Method

The right pointer expands the window. when the sum rehces the target, the left pointer shrinks it.
|---|---|---|---|---|---|---|
| 1 | 0 | 0 | 2 | Add 2 | 7 (initial) | None |
| 2 | 1 | 0 | 5 | Add 3 | 7 | None |
| 3 | 2 | 0 | 6 | Add 1 | 7 | None |
| 4 | 3 | 0 | 8 | Add 2 | 7 | None |
| 5 | 3 | 0 | 6 | Record [0,3], remove 2 | 4 | [0,3] |
| 6 | 4 | 1 | 10 | Add 4 | 4 | [0,3] |
| 7 | 4 | 1 | 7 | Record [1,4], remove 3 | 4 | [0,3] |
| 7 | 4 | 1 | 7 | Record [2,4], remove 1 | 3 | [2,4] |
| 9 | 5 | 3 | 9 | Add 3 | 3 | [2,4] |
| 10 | 5 | 3 | 7 | Record[3,5], remove 2 | 3 | [2,4] |
| 11 | 5 | 4 | 3 | Record [4,5],remove 4 | 2 | [4,5] |

Final result: [4, 5].