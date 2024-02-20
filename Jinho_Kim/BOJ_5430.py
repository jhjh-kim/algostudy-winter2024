from collections import deque
import sys
input = sys.stdin.readline

T = int(input())
for _ in range(T):
    funcs = [*input().rstrip()]
    n = int(input())
    arr = deque(eval(input()))
    r_flag = 0
    if funcs.count('D') > n:
         print("error")
         continue
    else:
        for f in funcs:
            if f == 'R':
                r_flag ^= 1
            elif r_flag:
                arr.pop()
            else:
                arr.popleft()
    if r_flag:
         arr = reversed(arr)
    print('[' + ','.join(map(str, arr)) + ']')
