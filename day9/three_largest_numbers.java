/*
  Write a function that takes in an array of at least three integers and,
  without sorting the input array, returns a sorted array of the three largest
  integers in the input array.
 */


/* Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    int[] largest_nums = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    for(int i = 0; i< array.length; i++) {
      if(largest_nums[2] == Integer.MIN_VALUE || array[i] > largest_nums[2]) {
        updateLargestNums(largest_nums, array[i], 2);
      }
      else if(largest_nums[1] == Integer.MIN_VALUE || array[i] > largest_nums[1]) {
        updateLargestNums(largest_nums, array[i], 1);
      }
       else if(largest_nums[0] == Integer.MIN_VALUE || array[i] > largest_nums[0]) {
        updateLargestNums(largest_nums, array[i], 0);
      }
    }
    return largest_nums;
  }

  public static void updateLargestNums(int[] array, int num, int position) {
    int index = 0;
    while(index <= position) {
      if(index == position) {
        array[position] = num;
      }
      else{
        array[index] = array[index + 1];
      }
      index++;
    }
  }
}
