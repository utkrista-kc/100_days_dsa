/*Time Complexity: O(n^2)
Space Complexity: O(n) */

import java.util.*;
class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
    ArrayList<Integer[]> result = new ArrayList<Integer[]>();
    for(int i=0; i<array.length - 2;i++) {
      int leftCounter = i + 1;
      int rightCounter = array.length -1;
      while(leftCounter < rightCounter) {
        int sum = array[i] + array[leftCounter] + array[rightCounter];
        if(sum < targetSum) {
          leftCounter++;
        }
        else if(sum > targetSum) {
          rightCounter--;
        }
        else if(sum == targetSum) {
          result.add(new Integer[]{array[i], array[leftCounter], array[rightCounter]});
          leftCounter++;
          rightCounter--;
        }
      }
    }
    return result;
  }
}
