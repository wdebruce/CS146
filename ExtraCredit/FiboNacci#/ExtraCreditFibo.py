import math

def calculateFibonacci(n):
    if n > 0:
        sqrt5 = math.sqrt(5)
        plusSqrt5 = (1 + sqrt5) / 2
        minusSqrt5 = (1 - sqrt5) / 2
        
        fib_num = (math.pow(plusSqrt5, n) - math.pow(minusSqrt5, n)) / sqrt5
        return round(fib_num)
    return 0

print("n=1, expected: 1, actual:",calculateFibonacci(1))
print("n=2, expected: 1, actual:",calculateFibonacci(2))
print("n=3, expected: 2, actual:",calculateFibonacci(3))
print("n=4, expected: 3, actual:",calculateFibonacci(4))
print("n=5, expected: 5, actual:",calculateFibonacci(5))
print("n=10, expected: 89, actual:",calculateFibonacci(10))
print("n=20, expected: 6765, actual:",calculateFibonacci(20))
print("n=100, expected: 218,922,995,834,555,169,026, actual:",calculateFibonacci(100))