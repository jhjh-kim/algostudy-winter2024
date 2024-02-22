from collections import deque
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
MAX = 100001
Q = deque()
v = [0]*MAX
Q.append(N)
v[N] = 1
while Q:
    x = Q.popleft()
    if x == M:
        print(v[x] - 1); exit()
    for nx in [x + 1, x - 1, 2*x]:
        if 0 <= nx < MAX and not v[nx]:
            v[nx] = v[x] + 1
            Q.append(nx)
