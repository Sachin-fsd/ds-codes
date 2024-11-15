import java.util.HashMap;

public class StringOperations {

  // Method for concatenating two strings
  public String concatenate(String str1, String str2) {
    return str1 + str2;
  }

  // Method for getting a substring from a string
  public String substring(String str, int start, int end) {
    if (start < 0 || end > str.length() || start > end) {
      throw new IllegalArgumentException("Invalid start or end index.");
    }
    return str.substring(start, end);
  }

  // Method for comparing two strings
  public boolean compare(String str1, String str2) {
    return str1.equals(str2);
  }

  // Function to calculate character frequency in a string
  public HashMap<Character, Integer> characterFrequency(String str) {
    HashMap<Character, Integer> frequencyMap = new HashMap<>();

    for (char ch : str.toCharArray()) {
      frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }

    return frequencyMap;
  }

  // Main method to test the class
  public static void main(String[] args) {
    StringOperations operations = new StringOperations();

    // Test concatenation
    String concatResult = operations.concatenate("hello", "world");
    System.out.println("Concatenated String: " + concatResult);

    // Test substring
    String substringResult = operations.substring("helloworld", 3, 5);
    System.out.println("Substring: " + substringResult);

    // Test comparison
    boolean compareResult = operations.compare("helloworld", "lo");
    System.out.println("Strings are equal: " + compareResult);

    // Test character frequency
    HashMap<Character, Integer> frequency = operations.characterFrequency("hello");
    System.out.println("Character Frequency: " + frequency);
  }
}
