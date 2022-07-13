import itertools

def getSolution(s):
    chars = []
    for i in range(0, len(s)):
        if s[i] != ' ':
            if s[i] not in chars :
                chars.append(s[i])
    letters = ('s', 'e', 'n', 'd', 'm', 'o', 'r', 'y')

    print(letters)
    digits = range(10)
    for perm in itertools.permutations(digits, len(letters)):
        sol = dict(zip(letters, perm))
        if sol['s'] == 0 or sol['m'] == 0:
            continue
        send = 1000 * sol['s'] + 100 * sol['e'] + 10 * sol['n'] + sol['d']
        more = 1000 * sol['m'] + 100 * sol['o'] + 10 * sol['r'] + sol['e']
        money = 10000 * sol['m'] + 1000 * sol['o'] + 100 * sol['n'] + 10 * sol['e'] + sol['y']
        if send + more == money:
            return send, more, money


print("Enter the equation : ")
s = input()

chars = []
for i in range(0, len(s)):
    if s[i] != ' ':
        if s[i] not in chars :
            chars.append(s[i])


if(len(chars) > 10) :
    print("No Solution!!")
print(getSolution(s))
