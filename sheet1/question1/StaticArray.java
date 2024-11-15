public class StaticArray {
    int count = 0; // Variable to keep track of the number of elements in the array

    public static void main(String[] args) {
        // Creating an instance of StaticArray
        StaticArray o = new StaticArray();
        // Initializing an integer array of size 5
        int a[] = new int[5];
        // test cases
        o.insertAtStart(a, 1);
        o.insertAtStart(a, 2);
        o.deleteAtIndex(a, 1);
        o.print(a);
    }

    // Method to insert a value at a specific position
    public void insertAtPosition(int arr[], int position, int val) {
        if (position < 0 || position > count || count >= arr.length) { // Validate position and check if array has space
            System.out.println("Invalid position or array is full");
            return;
        }
        // Shift elements to the right to make space at the desired position
        for (int i = count; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = val; // Insert the value at the specified position
        count++; // Increment count
    }

    // Method to insert a value at the end of the array
    public void insertAtEnd(int arr[], int val) {
        if (count >= arr.length) { // Check if array has space
            System.out.println("Array is full");
            return;
        }
        arr[count++] = val; // Add the value to the end and increment count
    }

    // Method to insert a value at the start of the array
    public void insertAtStart(int arr[], int val) {
        if (count >= arr.length) { // Check if array has space
            System.out.println("Array is full");
            return;
        }
        // Shift elements to the right to make space at the start
        for (int i = count; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val; // Insert the value at the start position
        count++; // Increment count
    }

    // Method to delete the first element of the array
    public void deleteAtStart(int arr[]) {
        if (count <= 0) { // Check if the array is empty
            System.out.println("Empty array");
            return;
        }
        // Shift elements to the left to remove the first element
        for (int i = 0; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[count - 1] = 0; // Clear the last position
        count--; // Decrease the count
    }

    // Method to delete an element at a specific index
    public void deleteAtIndex(int arr[], int index) {
        if (count <= 0) { // Check if the array is empty
            System.out.println("Empty array");
            return;
        }
        if (index < 0 || index >= count) { // Validate the index
            System.out.println("Invalid index");
            return;
        }
        // Shift elements to the left to fill the gap at the specified index
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[count - 1] = 0; // Clear the last position
        count--; // Decrease the count
    }

    // Method to delete the last element of the array
    public void deleteAtEnd(int arr[]) {
        if (count <= 0) { // Check if the array is empty
            System.out.println("Empty array");
            return;
        }
        arr[count - 1] = 0; // Clear the last element
        count--; // Decrease the count
    }

    // Method to print all elements in the array up to the current count
    public void print(int arr[]) {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " "); // Print each element
        }
    }
}
