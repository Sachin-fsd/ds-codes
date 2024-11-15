public class DynamicArray {
    private int arr[]; // Underlying array to store elements
    private int size; // Current maximum capacity of the array
    private int count; // Current number of elements in the array

    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create a DynamicArray instance
        DynamicArray d = new DynamicArray();
        // o.insertAtStart(a, 1);
        // o.insertAtStart(a, 2);
        // o.deleteAtIndex(a, 1);
        // o.print(a);
        d.insertAtBegin(1);
        d.insertAtBegin(2);
        d.deleteAtIndex(1);
        d.display();
    }

    // Constructor to initialize the array with a starting size of 1
    public DynamicArray() {
        this.size = 1;
        this.arr = new int[size];
        this.count = 0;
    }

    // Method to check if the array is full; if so, doubles its capacity
    private void checkAndGrow() {
        if (this.size == this.count) { // If array is full
            int tempArr[] = new int[size * 2]; // New array with double the size
            // Copying elements to the new array
            for (int i = 0; i < count; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr; // Reassign the old array reference to the new array
            size *= 2; // Update the size to the new capacity
        }
    }

    // Method to insert a value at the end of the array
    public void insertAtEnd(int value) {
        checkAndGrow(); // Check if resize is needed
        arr[count] = value; // Insert the value at the end
        count++; // Increment the count of elements
    }

    // Method to insert a value at the beginning of the array
    public void insertAtBegin(int value) {
        checkAndGrow(); // Check if resize is needed
        // Shift all elements to the right to make space at the beginning
        for (int i = count; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value; // Insert the new value at the start
        count++; // Increment the count of elements
    }

    // Method to insert a value at a specific index
    public void insertAtIndex(int value, int index) {
        if (index < 0 || index > count) { // Check for valid index range
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        checkAndGrow(); // Check if resize is needed
        // Shift elements to the right to create space at the specified index
        for (int i = count; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value; // Insert the value at the specified index
        count++; // Increment the count of elements
    }

    // Method to delete the first element in the array
    public void deleteAtStart() {
        if (count == 0) { // Check if the array is empty
            throw new IllegalStateException("Array is empty");
        }
        // Shift elements to the left to remove the first element
        for (int i = 0; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        count--; // Decrease the count
        arr[count] = 0; // Clear the last element
    }

    // Method to delete an element at a specific index
    public void deleteAtIndex(int index) {
        if (count == 0) { // Check if the array is empty
            throw new IllegalStateException("Array is empty");
        }
        if (index < 0 || index >= count) { // Validate the index
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        // Shift elements to the left to fill the gap at the specified index
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        count--; // Decrease the count
        arr[count] = 0; // Clear the last position
    }

    // Method to delete the last element of the array
    public void deleteAtEnd() {
        if (count == 0) { // Check if the array is empty
            throw new IllegalStateException("Array is empty");
        }
        count--; // Decrease the count
        arr[count] = 0; // Clear the last element
    }

    // Method to display the elements of the array
    public void display() {
        System.out.print("Array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " "); // Print each element
        }
        System.out.println();
    }
}
