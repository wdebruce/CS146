import re
'''/**Lab2
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 * Hint: There are 2 well-known ways to solve this problem!
 */
'''
def anagram(s, t):
    s = re.sub(r'[^a-zA-Z0-9]', '', s.lower())  # Convert to lowercase and remove non-alphanumeric characters
    t = re.sub(r'[^a-zA-Z0-9]', '', t.lower())  # Convert to lowercase and remove non-alphanumeric characters

    if len(s) != len(t):  # Check if strings have different lengths
        return False

    arrayS = [0] * len(s)  # array to hold characters of String s
    countS = [0] * 26      # alphabet count for String s
    for i in range(0, len(arrayS), 1):  # fills arrayS with char from String s
        arrayS[i] = ord(s[i]) - ord('a')  # decomposing each letter into #'s (0-25)
        countS[arrayS[i]] += 1            # stores into countS array

    arrayT = [0] * len(t)  # array to hold characters of String t
    countT = [0] * 26      # alphabet count for String t
    for j in range(0, len(arrayT), 1):  # fills arrayT with char from String t
        arrayT[j] = ord(t[j]) - ord('a')  # decomposing each letter into #'s (0-25)
        countT[arrayT[j]] += 1            # stores into countT array

    # compare countS & countT
    for k in range(0, len(arrayS), 1):
        if countS[k] != countT[k]:
            return False
    return True

#Test Cases
print("hello", "-->", "ohell", "-->",anagram("hello", "ohell")) #Expected: True
print("listen", "-->", "silent", "-->", anagram("listen", "silent")) #Expected: True
print("Extra", "-->", "Extraa", "-->", anagram("Extra", "Extraa")) #Expected: False
print("a gentleman", "-->", "elegant man", "-->", anagram("a gentleman", "elegant man")) #Expected: True
print("Clint Eastwood", "-->", "old west action", "-->", anagram("Clint Eastwood", "old west action")) #Expected: True
print("William Shakespeare", "-->", "I'll make a wise phrase", "-->", anagram("William Shakespeare", "I'll make a wise phrase")) #Expected: True
print("a decimal point", "-->", "I'm a dot in place", "-->", anagram("a decimal point", "I'm a dot in place")) #Expected: True