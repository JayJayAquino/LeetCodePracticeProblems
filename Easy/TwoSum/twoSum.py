# Given an array of integers, return indices of the two numbers such that they add up to a specific target.

# You may assume that each input would have exactly one solution, and you may not use the same element twice.

def twoSum(a, target):
    d = dict()

    for i in range(len(a)):
        d.update({a[i]:i})
    
    for i in range(len(a)):
        compliment = target - a[i]
        if compliment in d and d[compliment] != i:
            return [i, d[compliment]]
    
    return "no solution"

myArray = [2, 7, 11, 15]
target = 9
print(twoSum(myArray, target))

# TODO: probably a better way to do this, currently at O(n), but possible to do this in one pass instead of 2.