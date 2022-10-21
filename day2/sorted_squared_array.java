/* Time Complexity: O(n)
Space Complexity: O(n) */ 
import java.util.*;

class Program {
  public int[] sortedSquaredArray(int[] array) {
    int[] resultArray = new int[array.length];
    int leftPointer = 0, rightPointer = array.length - 1;
    int indexPointer = array.length - 1;
    for(int i=0;i<array.length;i++) {
      if(Math.abs(array[leftPointer]) < Math.abs(array[rightPointer])) {
        resultArray[indexPointer - i] = array[rightPointer] * array[rightPointer];
        rightPointer--;
      }
      else{
        resultArray[indexPointer - i] = array[leftPointer] * array[leftPointer];
        leftPointer++;
      }
    }
    return resultArray;
  }
}
