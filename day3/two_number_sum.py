# Time Complexity: O(n)
# Space Complexity: O(n)
def twoNumberSum(array, targetSum):
    values = {}
    for item in array:
        targetValue = targetSum - item
        if targetValue in values:
            return [targetValue, item]
        else:
            values[item] = True
    return []