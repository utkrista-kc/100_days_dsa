/* Resumed from 01/01/2023
Time Complexity: O(nlogn) -> As it involves sorting the array too.
Space Complexity: O(1) -> As same coins array is sorted. */

import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    Arrays.sort(coins);
    int coinChange = 0;
    for (int i=0;i < coins.length; i++) {
      if(coins[i] > coinChange + 1) {
        break;
      }
      coinChange += coins[i];
    }
    return coinChange + 1;
  }
}
