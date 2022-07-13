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

    print("original string : "+s)
    letters = tuple(chars)
    #print("used for loop :  " , charTuple)
    #letters = ('s', 'e', 'n', 'd', 'm', 'o', 'r', 'y')

    print("calculated :  ",letters)
    digits = range(10)
    for perm in itertools.permutations(digits, len(letters)):
        sol = dict(zip(letters, perm))
        if sol['s'] == 0 or sol['m'] == 0:
            continue
        sol1 = 1000 * sol[s[0]] + 100 * sol[s[1]] + 10 * sol[s[2]] + sol[s[3]]
        sol2 = 1000 * sol[s[5]] + 100 * sol[s[6]] + 10 * sol[s[7]] + sol[s[8]]
        sol3 = 10000 * sol[s[10]] + 1000 * sol[s[11]] + 100 * sol[s[12]] + 10 * sol[s[13]] + sol[s[14]]
        if sol1 + sol2 == sol3:
            return sol1, sol2, sol3


print("Enter the equation : ")
s = input()

chars = []
for i in range(0, len(s)):
    if s[i] != ' ':
        if s[i] not in chars :
            chars.append(s[i])


if(len(chars) > 10) :
    print("No Solution!!")
else :
    sol1, sol2, sol3 = getSolution1(s);
    print(getSolution1(s))
    

ques_str = ""+sol1+sol2+sol3
print(ques_str)
for c,n in zip(chars,ques_str):
    print(f"{c}={n}")