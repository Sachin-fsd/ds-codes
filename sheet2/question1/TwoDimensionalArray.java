public class TwoDimensionalArray {
  // Private 2D array to store the matrix data
  private int[][] matrix;

  // Track current position for row and column insertions
  private int currentRow = 0;
  private int currentCol = 0;

  // Constructor: Initializes a 3x2 matrix filled with default values
  TwoDimensionalArray() {
    this.matrix = new int[3][2];
  }

  // Method to insert an entire row at the current row position
  public void insertRow(int[] row) {
    // Assigns the input row array to the current row in the matrix
    matrix[currentRow] = row;
    // Moves to the next row for any subsequent insertion
    currentRow += 1;
  }

  // Method to insert an entire column, filling the column sequentially in the
  // matrix
  public void insertColumn(int[] col) {
    for (int data : col) {
      // Adds each element of the input column array to the current matrix position
      matrix[currentRow][currentCol] = data;
      // Moves to the next row for each element in the column
      currentRow += 1;
    }
  }

  // Method to delete (clear) all elements in a specified row by setting them to 0
  public void deleteRow(int index) {
    for (int i = 0; i < matrix[index].length; i++) {
      // Sets each element in the specified row to 0
      matrix[index][i] = 0;
    }
  }

  // Method to display the entire matrix, printing each element with a space
  public void display() {
    for (int[] row : matrix) {
      for (int data : row) {
        System.out.print(data + " ");
      }
      System.out.println(); // New line for each row
    }
  }

  // Method to traverse and print all non-zero elements in the matrix
  public void traverse() {
    for (int[] row : matrix) {
      for (int data : row) {
        if (data != 0) {
          System.out.print(data + " ");
        }
      }
    }
  }

  // Main method to test the class functionality
  public static void main(String[] args) {
    // Create a new 3x2 matrix
    TwoDimensionalArray matrix = new TwoDimensionalArray();

    // Define a row to insert and add it to the matrix
    int[] row1 = { 1, 2 };
    matrix.insertRow(row1);

    // Define a column to insert and add it to the matrix
    int[] col1 = { 3, 4 };
    matrix.insertColumn(col1);

    // Delete the first row
    matrix.deleteRow(0);

    // Traverse and print all non-zero elements in the matrix
    matrix.traverse();
  }
}
