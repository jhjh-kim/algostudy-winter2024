import sys
input = sys.stdin.readline
cnt = 0

for _ in range(int(input())):
    word = [*input().rstrip()]
    stck = []
    for w in word[::-1]:
        if stck and w == stck[-1]:
            stck.pop()
        else:
            stck.append(w)
    if not stck:
        cnt += 1
print(cnt)