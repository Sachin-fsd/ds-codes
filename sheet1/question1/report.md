# Comparative Analysis of Time Complexity in Static vs. Dynamic Arrays

## Static Array:

### Time Complexity

1. Insert Method ```insert(int value)```:
    - Description: Accepts an integer value and appends it to the end of the array.
    - Best Case: ```O(1)```
    - Worst Case: ```O(n)```

2. Delete Method ```delete(int value)```:
    - Description: Accepts an integer value and removes its first occurrence from the array.
    - Best Case: ```O(1)```
    - Worst Case: ```O(n)```

3. Traversal ```traverse()```:
    - Description: Iterates through the array and returns each element.
    - Worst Case: ```O(n)```

## Dynamic Array:

### Time Complexity

1. Insert Method ```insert(int value)```:
    - Description: Accepts an integer value and appends it to the end of the array. If the array has reached capacity, it uses the ```resize()``` method to expand, thereby making it dynamic.
    - Best Case: ```O(1)```
    - Worst Case: ```O(n)```

2. Delete Method ```delete(int value)```:
    - Description: Accepts an integer value and removes its first occurrence from the array.
    - Best Case: ```O(1)```
    - Worst Case: ```O(n)```

3. Traversal ```traverse()```:
    - Description: Iterates through the array and returns each element.
    - Worst Case: ```O(n)```

## Comparison
### 1. Insertion:

| Operation           | Static Array Insertion (Worst Case)                                          | Dynamic Array Insertion (Worst Case)                                                   |
| ------------------- | ---------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| **Time Complexity** | O(1) (If array is at capacity, insertion fails)                              | O(n)                                                                                   |
| **Reason**          | No resizing occurs; insertion fails or raises an error if the array is full. | When full, the array resizes, involving copying all elements to a larger array (O(n)). |

While both static and dynamic arrays reach an O(n) time complexity, each achieves it differently based on its structure.

### 2. Deletion:

| Operation           | Static Array Deletion (Worst Case)                                                              | Dynamic Array Deletion (Worst Case)                                                             |
| ------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| **Time Complexity** | O(n)                                                                                            | O(n)                                                                                            |
| **Reason**          | If the element is at the end or not found, a full traversal and shifting of elements is needed. | If the element is at the end or not found, a full traversal and shifting of elements is needed. |

### 3. Traversal

| Operation           | Static Array Traversal (Worst Case)                                              | Dynamic Array Traversal (Worst Case)                                             |
| ------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| **Time Complexity** | O(n)                                                                             | O(n)                                                                             |
| **Reason**          | Each element in the array must be accessed, resulting in linear time complexity. | Each element in the array must be accessed, resulting in linear time complexity. |
