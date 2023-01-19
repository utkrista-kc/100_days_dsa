/* Write a function that takes in a non-empty string and that returns a boolean
representing whether the string is a palindrome. */


// Time Complexity: O(n)
//Space Complexity: O(1)
import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    // Write your code here.
    int leftPointer = 0;
    int rightPointer = str.length() - 1;
    while(leftPointer < rightPointer) {
      if(str.charAt(leftPointer++) != str.charAt(rightPointer--)) {
        return false;
      }
    }
    return true;
  }
}
