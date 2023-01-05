# Time Complexity: O(n^2)
# Space Complexity: O(n)

def threeNumberSum(array, targetSum):
    array.sort()
    result = []
    for i in range(len(array) - 2):
        leftCounter = i + 1
        rightCounter = len(array) - 1
        while leftCounter < rightCounter:
            sum = array[i] + array[leftCounter] + array[rightCounter]
            if sum > targetSum:
                rightCounter -= 1
            elif sum < targetSum:
                leftCounter += 1
            elif sum == targetSum:
                result.append(
                    [array[i], array[leftCounter], array[rightCounter]])
                leftCounter += 1
                rightCounter -= 1

    return result
