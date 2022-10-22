/* Time Complexity: O(n)
Space Complexity: O(n) */ 
import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    HashMap<Integer, Boolean> values = new HashMap<Integer, Boolean>();
    for(int i = 0; i< array.length; i++) {
      int targetValue = targetSum - array[i];
      if(values.get(targetValue) != null) {
        return new int[] {targetValue, array[i]};
      }
      else {
        values.put(array[i], true);
      }
    }
    return new int[] {};
  }
}
