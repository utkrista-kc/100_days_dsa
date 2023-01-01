# Resumed from 01/01/2023
# Time Complexity: O(nlogn) -> As it involves sorting the array too.
# Space Complexity: O(1) -> As same coins array is sorted.
def nonConstructibleChange(coins):
    coins.sort()
    coinChange = 0
    for coin in coins:
        if coin > coinChange + 1:
            return coinChange + 1
        coinChange += coin
    return coinChange + 1
