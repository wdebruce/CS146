#Homework 6
'''Now that we're done discussing math-heavy stuff, here's another algorithmic problem! Here's the problem statement:

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

This time, your problem has additional details:

Constraints:

The solution set must not contain duplicate triplets.
The order of the output and the order of the triplets does not matter.
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
'''
def three_sum(self, nums):
    mainList = []
        
    if 3 <= len(nums) <= 105:
        for i in range(len(nums) - 2):
            for j in range(i + 1, len(nums) - 1):
                for k in range(j + 1, len(nums)):
                    sum_ = nums[i] + nums[j] + nums[k]
                    if sum_ == 0:
                        elementList = [nums[i], nums[j], nums[k]]
                        mainList.append(elementList)
        return mainList

nums1 = [0, 1, 1]
print("Input:", nums1)
print("Output: Expected: [], Actual:", three_sum(nums1))
    
nums2 = [-5, 0, 5, 10, -10, 0]
print("Input:", nums2)
print("Output: Expected: [[-5, 0, 5], [-10, 0, 10]], Actual:", three_sum(nums2))

