
/*
# Write a function that takes in a string of lowercase English-alphabet letters
# and returns the index of the string's first non-repeating character.


# Time Complexity: O(n)
# Space Complexity: O(1)
 */

 import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    HashMap <Character, Integer> charFrequency = new HashMap<>();
    for(int i=0; i<string.length(); i++) {
      if(charFrequency.containsKey(string.charAt(i))) {
        int count = charFrequency.get(string.charAt(i));
        charFrequency.put(string.charAt(i), count + 1);
      }
      else {
        charFrequency.put(string.charAt(i), 1);
      }
    }
    for(int i=0; i<string.length(); i++) {
      if(charFrequency.get(string.charAt(i)) == 1) {
        return i;
      }

    }
    return -1;
  }
}
