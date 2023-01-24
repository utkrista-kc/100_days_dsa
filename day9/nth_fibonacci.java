/* 
The Fibonacci sequence is defined as follows: the first number of the sequence
is, the second number is , and the nth number is the sum of the (n - 1)th
and (n - 2)th numbers. Write a function that takes in an integer
and returns the nth Fibonacci number.
*/

/* 
# Solution 3: Iterative
# Time Complexity: O(n)
# Space Complexity: O(1)
*/
import java.util.*;

class Program {
  public static int getNthFib(int n) {
    int [] last_two_nums = {0, 1};
    int counter = 3;
    while (counter <= n) {
      int next_fibo = last_two_nums[1] + last_two_nums[0];
      last_two_nums[0] = last_two_nums[1];
      last_two_nums[1] =  next_fibo;
      counter++;
    }
    if(n > 1) {
      return last_two_nums[1];
    }
    else{
      return last_two_nums[0];
    }
  }
}
