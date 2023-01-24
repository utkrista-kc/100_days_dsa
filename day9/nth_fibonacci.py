
# The Fibonacci sequence is defined as follows: the first number of the sequence
# is, the second number is , and the nth number is the sum of the (n - 1)th
# and (n - 2)th numbers. Write a function that takes in an integer
# and returns the nth Fibonacci number.

# Solution 1: Recursive
# Time Complexity: O(2^n)
# Space Complexity: O(n)
def getNthFib(n):
    if n == 1 or n == 2:
        return n - 1
    else:
        return getNthFib(n-1) + getNthFib(n-2)


# Solution 2: Recursive with memoization
# Time Complexity: O(n)
# Space Complexity: O(n)
def getNthFib(n, fibo_nums={1: 0, 2: 1}):
    if n in fibo_nums:
        return fibo_nums[n]
    else:
        fibo_nums[n] = getNthFib(n-1, fibo_nums) + getNthFib(n-2, fibo_nums)
        return fibo_nums[n]


# Solution 3: Iterative
# Time Complexity: O(n)
# Space Complexity: O(1)
def getNthFib(n):
    last_two_nums = [0, 1]
    counter = 3
    while (counter <= n):
        nextFibo = last_two_nums[1] + last_two_nums[0]
        last_two_nums[0] = last_two_nums[1]
        last_two_nums[1] = nextFibo
        counter += 1
    return last_two_nums[1] if n > 1 else last_two_nums[0]
