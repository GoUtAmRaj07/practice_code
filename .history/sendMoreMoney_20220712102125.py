from enum import unique
import itertools

def getSolution(s):
    chars = []
    for i in range(0, len(s)):
        if s[i] != ' ':
            if s[i] not in chars :
                chars.append(s[i])

    #print(chars)
    charTuple = tuple(chars)
    print("used for loop :  " , charTuple)
    letters = ('s', 'e', 'n', 'd', 'm', 'o', 'r', 'y')

    print("predefined :  ",letters)
    digits = range(10)
    for perm in itertools.permutations(digits, len(charTuple)):
        sol = dict(zip(charTuple, perm))
        if sol['s'] == 0 or sol['m'] == 0:
            continue
        sol1 = 1000 * sol['s'] + 100 * sol['e'] + 10 * sol['n'] + sol['d']
        sol2 = 1000 * sol['m'] + 100 * sol['o'] + 10 * sol['r'] + sol['e']
        sol3 = 10000 * sol['m'] + 1000 * sol['o'] + 100 * sol['n'] + 10 * sol['e'] + sol['y']
        if sol1 + sol2 == sol3:
            return sol1, sol2, sol3



def getSolution1(s):
    chars = []
    for i in range(0, len(s)):
        if s[i] != ' ':
            if s[i] not in chars :
                chars.append(s[i])

    #print(chars)
    letters = tuple(chars)
    #print("used for loop :  " , charTuple)
    #letters = ('s', 'e', 'n', 'd', 'm', 'o', 'r', 'y')

    print("calculated :  ",letters)
    digits = range(10)
    for perm in itertools.permutations(digits, len(letters)):
        sol = dict(zip(letters, perm))
        if sol['s'] == 0 or sol['m'] == 0:
            continue
        sol1 = 1000 * sol['s'] + 100 * sol['e'] + 10 * sol['n'] + sol['d']
        sol2 = 1000 * sol['m'] + 100 * sol['o'] + 10 * sol['r'] + sol['e']
        sol3 = 10000 * sol['m'] + 1000 * sol['o'] + 100 * sol['n'] + 10 * sol['e'] + sol['y']
        if sol1 + sol2 == sol3:
            return sol1, sol2, sol3


print("Enter the equation : ")
s = input()

chars = []
for i in range(0, len(s)):
    if s[i] != ' ':
        if s[i] not in chars :
            chars.append(s[i])

charTuple = tuple(chars)
print(charTuple)

if(len(chars) > 10) :
    print("No Solution!!")
else :
    print(getSolution(s))