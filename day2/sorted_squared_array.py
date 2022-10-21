# Time Complexity: O(n)
# Space Complexity: O(n)
def sortedSquaredArray(array):
    resultList = [0] * len(array)
    leftPointer = 0
    rightPointer = len(array) - 1
    for i in reversed(range(len(array))):
        if abs(array[leftPointer]) < abs(array[rightPointer]):
            resultList[i] = array[rightPointer]**2
            rightPointer -= 1
        else:
            resultList[i] = array[leftPointer]**2
            leftPointer += 1
    return resultList
