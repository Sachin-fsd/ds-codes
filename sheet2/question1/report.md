# TwoDimensionalArray Class - Time Complexity Analysis

## Methods and Their Time Complexity

1. **insertRow(int[] row)**
   - **Time Complexity**: O(m)
   - **Explanation**: Inserting a row involves assigning an entire row (`row`) to one position in `matrix`, which takes O(m), where m is the number of elements in `row`.

2. **insertColumn(int[] col)**
   - **Time Complexity**: O(n)
   - **Explanation**: Inserting a column involves iterating through the elements of `col` and placing each in `matrix`, resulting in O(n), where n is the number of elements in `col`.

3. **deleteRow(int index)**
   - **Time Complexity**: O(m)
   - **Explanation**: Deleting a row requires setting each element in the specified row to 0, which involves O(m) operations, where m is the number of columns in `matrix`.

4. **display()**
   - **Time Complexity**: O(n * m)
   - **Explanation**: Displaying the matrix involves iterating over each element in `matrix`, resulting in O(n * m), where n is the number of rows and m is the number of columns.

5. **traverse()**
   - **Time Complexity**: O(n * m)
   - **Explanation**: Traversing the matrix requires visiting each element to check if it's non-zero, leading to O(n * m), where n is the number of rows and m is the number of columns.

## Summary

| Method          | Time Complexity |
|-----------------|-----------------|
| insertRow       | O(m)            |
| insertColumn    | O(n)            |
| deleteRow       | O(m)            |
| display         | O(n * m)        |
| traverse        | O(n * m)        |

In this table, `n` is the number of rows and `m` is the number of columns in the matrix.
