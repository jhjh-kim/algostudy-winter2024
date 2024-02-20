import sys
from collections import deque
input = sys.stdin.readline

xlmt, ylmt = map(int, input().split())
maze = [[*map(int, *input().split())] for _ in range(xlmt)]
dx, dy = [0, 0, 1, -1], [1, -1, 0, 0]
Q = deque()
Q.append((0, 0))
while Q:
    x, y = Q.popleft()
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if nx in range(0, xlmt) and ny in range(0, ylmt) and maze[nx][ny] == 1:
            Q.append((nx, ny)); maze[nx][ny] += maze[x][y]
print(maze[xlmt - 1][ylmt - 1])