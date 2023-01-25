
/* 
#   Write a function that takes in a string made up of brackets ((,[,{,),] and }) and other optional characters. The function should return a
#   boolean representing whether the string is balanced with regards to brackets.


# Time Complexity: O(n) - n is length of string
# Space Complexity: O(n)
*/

import java.util.*;

class Program {
  public static boolean balancedBrackets(String str) {
    List<Character> openingBrackets = Arrays.asList('(','{','[');
    List<Character>  closingBrackets = Arrays.asList(')','}',']');
    Stack<Character> bracketStack = new Stack<>();
    for(char ch:str.toCharArray()) {
      if(openingBrackets.contains(ch)) {
        bracketStack.push(ch);
      }
      else if(closingBrackets.contains(ch)) {
        if(bracketStack.size() == 0) {
          return false;
        }
        if(openingBrackets.indexOf(bracketStack.lastElement()) == closingBrackets.indexOf(ch)) {
          bracketStack.pop();
        }
        else return false;
      }
    }
    return bracketStack.isEmpty();
  }
}
