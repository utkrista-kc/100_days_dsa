
# Write a function that takes in a string of lowercase English-alphabet letters
# and returns the index of the string's first non-repeating character.


# Time Complexity: O(n)
# Space Complexity: O(1)
def firstNonRepeatingCharacter(string):
    charCountDict = {}
    for value in string:
        charCountDict[value] = charCountDict.get(value, 0) + 1

    for index, value in enumerate(string):
        if charCountDict[value] == 1:
            return index
    return -1
