public class countNumberOfWords {
// This program counts the number of words in a given string
// It uses the split method to divide the string into words based on whitespace
// and then counts the resulting array's length.
// The split method uses a regular expression to match whitespace characters.
// The output will be the number of words in the string.

  public static void main(String[] args) {
    String words = "Hi There Datta Panchal is Here";
    int countWords = words.split("\\s").length;
    System.out.println(countWords);
  }
}
