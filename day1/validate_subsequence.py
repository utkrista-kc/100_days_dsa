# Time Complexity : O(n) - In worst case loops through the entire array of length n
# Space Complexity: O(1)- Storing only indexes
def isValidSubsequence(array, sequence):
    arrayIndex = 0
    seqIndex = 0
    while arrayIndex < len(array) and seqIndex < len(sequence):
        if(array[arrayIndex] == sequence[seqIndex]):
            seqIndex += 1
        arrayIndex += 1

    return len(sequence) == seqIndex
