public class StringAlgorithms {
  // Knuth-Morris-Pratt (KMP) Pattern Matching Algorithm
  public static int[] computeLPSArray(String pattern) {
    int m = pattern.length();
    int[] lps = new int[m];
    int len = 0;
    int i = 1;

    while (i < m) {
      if (pattern.charAt(i) == pattern.charAt(len)) {
        len++;
        lps[i] = len;
        i++;
      } else {
        if (len != 0) {
          len = lps[len - 1];
        } else {
          lps[i] = 0;
          i++;
        }
      }
    }
    return lps;
  }

  public static int KMPSearch(String text, String pattern) {
    int n = text.length();
    int m = pattern.length();

    int[] lps = computeLPSArray(pattern);
    int i = 0; // index for text
    int j = 0; // index for pattern

    while (i < n) {
      if (pattern.charAt(j) == text.charAt(i)) {
        i++;
        j++;
      }

      if (j == m) {
        // Pattern found at index (i - j)
        return i - j;
      } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
        if (j != 0) {
          j = lps[j - 1];
        } else {
          i++;
        }
      }
    }
    return -1; // Pattern not found
  }

  // Run-Length Encoding (RLE) Compression
  public static String runLengthEncoding(String input) {
    if (input == null || input.isEmpty()) {
      return "";
    }

    StringBuilder encodedString = new StringBuilder();
    int count = 1;

    for (int i = 1; i < input.length(); i++) {
      if (input.charAt(i) == input.charAt(i - 1)) {
        count++;
      } else {
        encodedString.append(count);
        encodedString.append(input.charAt(i - 1));
        count = 1;
      }
    }

    // Append the last character and its count
    encodedString.append(count);
    encodedString.append(input.charAt(input.length() - 1));

    return encodedString.toString();
  }

  // Test main method
  public static void main(String[] args) {
    // Example usage of KMP pattern matching
    String text = "abxabcabcaby";
    String pattern = "abcaby";
    int result = KMPSearch(text, pattern);
    if (result != -1) {
      System.out.println("Pattern found at index: " + result);
    } else {
      System.out.println("Pattern not found");
    }

    // Example usage of Run-Length Encoding
    String inputString = "aaabbbcccaaa";
    String encoded = runLengthEncoding(inputString);
    System.out.println("Run-Length Encoded: " + encoded);
  }
}
