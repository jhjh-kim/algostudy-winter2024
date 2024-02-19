from collections import deque
import sys
input = sys.stdin.readline

xlmt, ylmt = map(int, input().split())
dx, dy = [0, 0, 1, -1], [1, -1, 0, 0]
box = [[*map(int, input().split())] for _ in range(ylmt)]
cnt = 0
Q = deque()

for y in range(ylmt):
    for x in range(xlmt):
        if box[y][x] == 1:
            Q.append((y, x))
while Q:
    y, x = Q.popleft()
    for i in range(4):
        ny, nx = y + dy[i], x + dx[i]
        if 0 <= ny < ylmt and 0 <= nx < xlmt and not box[ny][nx]:
            box[ny][nx] = box[y][x] + 1
            Q.append((ny, nx))

for y in range(ylmt):
    if 0 in box[y]:
        print(-1); exit()
    cnt = max(cnt, max(box[y]))
    
print(cnt - 1)