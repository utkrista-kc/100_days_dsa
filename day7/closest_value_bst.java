/* Write a function that takes in a Binary Search Tree (BST) and a target integer
value and returns the closest value to that target value contained in the BST.
You can assume that there will only be one closest value. */


/* Solution 1: Recursive
Average Time Complexity: O(log(n)), Worst: O(n)
Space Complexity: O(n) */
import java.util.*;

class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBstHelper(tree, target, tree.value);
  }

  public static int findClosestValueInBstHelper(BST tree, int target, int closestValue) {
    if (tree == null) {
      return closestValue;
    }
    if (Math.abs(target - closestValue) > Math.abs(target - tree.value)) {
      closestValue = tree.value;
    }
    if(target > tree.value) {
      return findClosestValueInBstHelper(tree.right, target, closestValue);
    }
      return findClosestValueInBstHelper(tree.left, target, closestValue);
  }


  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}


/* Solution 2: Iterative
Average Time Complexity: O(log(n)), Worst: O(n)
Space Complexity: O(1) */

import java.util.*;

class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBstHelper(tree, target, tree.value);
  }

  public static int findClosestValueInBstHelper(BST tree, int target, int closestValue) {
    while (tree != null) {
      if (Math.abs(target - closestValue) > Math.abs(target - tree.value)) {
        closestValue = tree.value;
      }
      if(target > tree.value) {
        return findClosestValueInBstHelper(tree.right, target, closestValue);
      }
        return findClosestValueInBstHelper(tree.left, target, closestValue);
      }
    return closestValue;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
