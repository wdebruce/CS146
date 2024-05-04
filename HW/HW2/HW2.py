#HW2
'''You are a product manager and currently leading a team to develop a new product. 
Unfortunately, the latest version of your product fails the quality check. 
Since each version is developed based on the previous version,
all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. 
Implement a function to find the first bad version. 
You should minimize the number of calls to the API.

Hint: There are 2 well-known ways to solve this problem!
'''

def isBadVersion(version):
    return version >= 4

def firstBadVersion(n):
    low = 1
    high = n

    while low < high:
        mid = low + (high - low) // 2 
        if(isBadVersion(mid)):
            high = mid #Search left side
            firstBadIndex = high
        else:
            low = mid + 1 #Search right side
    return firstBadIndex

n = 8
print("Expected: 4, Actual: ", firstBadVersion(n))
n = 100
print("Expected: 4, Actual: ", firstBadVersion(n))