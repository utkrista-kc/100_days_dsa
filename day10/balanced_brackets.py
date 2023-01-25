
#   Write a function that takes in a string made up of brackets ((,[,{,),] and }) and other optional characters. The function should return a
#   boolean representing whether the string is balanced with regards to brackets.


# Time Complexity: O(n) - n is length of string
# Space Complexity: O(n)
def balancedBrackets(string):
    openingBrackets = '{(['
    closingBrackets = '})]'
    matchingBrackets = {'}': '{', ')': '(', ']': '['}
    bracketStack = []
    for char in string:
        if char in openingBrackets:
            bracketStack.append(char)
        elif char in closingBrackets:
            if len(bracketStack) == 0:
                return False
            if bracketStack[-1] == matchingBrackets[char]:
                bracketStack.pop()
            else:
                return False

    return True if len(bracketStack) == 0 else False
