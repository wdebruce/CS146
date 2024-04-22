#Lab1
"""
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
"""
#parameters: int array nums, int target
#returns array of the two indices whose values equal target
def twoIndicesTarget(nums, target):
    sum = 0
    for i in range(len(nums)):
        for j in range(1, len(nums),1):
            if(nums[i] != nums[j] and target == nums[i] + nums[j]):
                    return print("Indices of values that equal", target, ":", [i, j])
    return print("No two unique values add up to target")
        
#TEST CASES----------------------------------
print("---Test Case 1----------------------")        
arrayA = [1, 2, 3, 4, 5, 6, 7, 8, 9]
target = 10
print("Array:",arrayA)
print("Target: ", target)
twoIndicesTarget(arrayA, target)

print("\n---Test Case 2----------------------")
arrayA = [1, 2, 3, 4, 5, 6, 7, 8, 9]
target = 100
print("Array:",arrayA)
print("Target: ", target)
twoIndicesTarget(arrayA, target)

print("\n---Test Case 3----------------------")
arrayA = [-1, -2, -3, -4, -5, -6, -10]
target = -5
print("Array:",arrayA)
print("Target: ", target)
twoIndicesTarget(arrayA, target)

print("\n---Test Case 4----------------------")
arrayA = [10, -5, 2, -7, -8, 3]
target = 5
print("Array:",arrayA)
print("Target: ", target)
twoIndicesTarget(arrayA, target)

print("\n---Test Case 5----------------------")
arrayA = [0, 0, 0, 0, 0, 0, 0]
target = 0
print("Array:",arrayA)
print("Target: ", target)
twoIndicesTarget(arrayA, target) 