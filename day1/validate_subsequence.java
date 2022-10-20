/* Time Complexity : O(n) - In worst case loops through the entire array of length n
Space Complexity: O(1)- Storing only indexes */
import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int arrayIndex = 0, seqIndex = 0;
    while(arrayIndex < array.size() && seqIndex < sequence.size()) {
      if(array.get(arrayIndex) == sequence.get(seqIndex)) {
        seqIndex++;
      }
      arrayIndex++;
    }
    if(seqIndex == sequence.size()) return true;
    return false;
  }
}