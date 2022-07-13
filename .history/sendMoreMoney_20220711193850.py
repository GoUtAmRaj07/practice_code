import itertools

def getSolution():
    letters = ('s', 'e', 'n', 'd', 'm', 'o', 'r', 'y')
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
#st = [s.split(' ')]
#print(st)

charSet = set()
for i in range(0, len(s)):
    if s[i] != ' ':
        charSet.add(s[i])

print(charSet)

# for word in st:
#     for i in range(0, len(word)):
#         charSet.add(word[i])

# print(charSet)


print(getSolution())
