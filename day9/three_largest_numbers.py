
#   Write a function that takes in an array of at least three integers and,
#   without sorting the input array, returns a sorted array of the three largest
#   integers in the input array.


# Approach 1
# Time Complexity: O(n)
# Space Complexity: O(1)
def findThreeLargestNumbers(array):
    largest_nums = [None] * 3
    for i in reversed(range(len(largest_nums))):
        max_num = max(array)
        largest_nums[i] = max_num
        array.remove(max_num)
    return largest_nums


# Approach 2: Better One
# Time Complexity: O(n)
# Space Complexity: O(1)
def findThreeLargestNumbers(array):
    largest_nums = [None]*3
    for num in array:
        if largest_nums[2] is None or largest_nums[2] < num:
            updateLargestNums(largest_nums, num, 2)
        elif largest_nums[1] is None or largest_nums[1] < num:
            updateLargestNums(largest_nums, num, 1)
        elif largest_nums[0] is None or largest_nums[0] < num:
            updateLargestNums(largest_nums, num, 0)
    return largest_nums


def updateLargestNums(largest_nums, num, position):
    index = 0
    while (index <= position):
        if index == position:
            largest_nums[position] = num
        else:
            largest_nums[index] = largest_nums[index + 1]
        index += 1
