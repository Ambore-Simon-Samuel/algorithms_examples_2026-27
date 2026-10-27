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