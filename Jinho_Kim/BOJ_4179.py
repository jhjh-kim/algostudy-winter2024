import sys
from collections import deque
input = sys.stdin.readline

dy, dx = [0, 0, 1, -1], [1, -1, 0, 0]
Q = deque()
ylmt, xlmt = map(int, input().split())
maze = [[*input().rstrip()] for _ in range(ylmt)]
visit = [[0] * xlmt for _ in range(ylmt)]

for y in range(ylmt):
    for x in range(xlmt):
        if maze[y][x] == 'J':
            visit[y][x] = 1
            Q.append((y, x, 'J'))
        elif maze[y][x] == 'F':
            visit[y][x] = 1
            Q.appendleft((y, x, 'F')) #Fire goes first

while Q:
    y, x, s = Q.popleft()
    for i in range(4):
        ny, nx = y + dy[i], x + dx[i]
        if 0 <= ny < ylmt and 0 <= nx < xlmt:
            if not visit[ny][nx] and maze[ny][nx] == '.':
                visit[ny][nx] = visit[y][x] + 1
                Q.append((ny, nx, s))
        elif s == 'J':
            print(visit[y][x])
            exit()

print("IMPOSSIBLE")