# StringAlgorithms Class - Time Complexity Analysis

This document provides the time complexity for each method implemented in the `StringAlgorithms` class.

## Methods and Their Time Complexity

1. **computeLPSArray(String pattern)**
   - **Time Complexity**: O(m)
   - **Explanation**: The computation of the Longest Prefix Suffix (LPS) array involves iterating through each character in the `pattern` string once. The time complexity is O(m), where `m` is the length of the pattern.

2. **KMPSearch(String text, String pattern)**
   - **Time Complexity**: O(n + m)
   - **Explanation**: The KMP pattern matching algorithm searches for a pattern in the text by using the LPS array. The time complexity consists of two parts:
     - Computing the LPS array: O(m)
     - Searching through the text: O(n), where `n` is the length of the text and `m` is the length of the pattern.
   Thus, the total time complexity is O(n + m).

3. **runLengthEncoding(String input)**
   - **Time Complexity**: O(n)
   - **Explanation**: The Run-Length Encoding (RLE) method processes each character in the `input` string exactly once. Therefore, the time complexity is O(n), where `n` is the length of the input string.

## Summary

| Method            | Time Complexity |
| ----------------- | --------------- |
| computeLPSArray   | O(m)            |
| KMPSearch         | O(n + m)        |
| runLengthEncoding | O(n)            |

In this table:
- `n` is the length of the text string.
- `m` is the length of the pattern string.
