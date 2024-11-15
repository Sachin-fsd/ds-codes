# MatrixTranspose Class - Time Complexity Analysis

This document provides the time complexity for each operation implemented in the `MatrixTranspose` class.

## Methods and Their Time Complexity

1. **Matrix Transposition**
   - **Time Complexity**: O(n * m)
   - **Explanation**: The transposition involves iterating through every element of the original matrix and swapping its row and column indices. Given a matrix with `n` rows and `m` columns, this results in O(n * m) operations.

2. **Displaying the Original Matrix**
   - **Time Complexity**: O(n * m)
   - **Explanation**: Printing the original matrix requires iterating through every element to display it, which takes O(n * m), where `n` is the number of rows and `m` is the number of columns.

3. **Displaying the Transposed Matrix**
   - **Time Complexity**: O(n * m)
   - **Explanation**: Similarly, displaying the transposed matrix requires iterating through all of its elements, resulting in O(n * m), where `n` is the number of rows and `m` is the number of columns.

## Summary

| Method                           | Time Complexity |
| -------------------------------- | --------------- |
| Matrix Transposition             | O(n * m)        |
| Displaying the Original Matrix   | O(n * m)        |
| Displaying the Transposed Matrix | O(n * m)        |

In this table, `n` is the number of rows and `m` is the number of columns in the matrix.
