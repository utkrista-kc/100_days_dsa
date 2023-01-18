
# Write a function that takes in a Binary Search Tree (BST) and a target integer
# value and returns the closest value to that target value contained in the BST.
# You can assume that there will only be one closest value.


# Solution 1: Recursive
# Average Time Complexity: O(log(n)), Worst: O(n)
# Space Complexity: O(n)
def findClosestValueInBst(tree, target):
    return findClosestValueInBstHelper(tree, target, None)


def findClosestValueInBstHelper(tree, target, closestValue):
    if tree is None:
        return closestValue
    if closestValue is None or abs(target - closestValue) > abs(target - tree.value):
        closestValue = tree.value
    if target > tree.value:
        return findClosestValueInBstHelper(tree.right, target, closestValue)
    elif target < tree.value:
        return findClosestValueInBstHelper(tree.left, target, closestValue)
    else:
        return closestValue


# This is the class of the input tree. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

# Solution 2: Iterative
# Average Time Complexity: O(log(n)), Worst: O(n)
# Space Complexity: O(1)


def findClosestValueInBst(tree, target):
    return findClosestValueInBstHelper(tree, target, None)


def findClosestValueInBstHelper(tree, target, closestValue):
    currentNode = tree
    while currentNode is not None:
        if closestValue is None or abs(target - closestValue) > abs(target - currentNode.value):
            closestValue = currentNode.value
        if target > currentNode.value:
            currentNode = currentNode.right
        elif target < currentNode.value:
            currentNode = currentNode.left
        else:
            break
    return closestValue


# This is the class of the input tree. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
