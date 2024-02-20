import sys
from collections import deque
input = sys.stdin.readline

r, c = map(int, input().split())
p_cnt = max_area = 0
paper = [[*map(int, input().split())] for _ in range(r)]
dx, dy = [0, 0, -1, 1], [1, -1, 0, 0]
Q = deque()

for y in range(r):
    for x in range(c):
        if not paper[y][x]:
            continue
        Q.append((y, x)); paper[y][x] = 0 # mark it as visited
        p_cnt += 1
        p_area = 0
        while Q:
            qy, qx = Q.popleft()
            p_area += 1
            for i in range(4):
                ny, nx = (qy + dy[i], qx + dx[i])
                if nx < 0 or nx >= c or ny < 0 or ny >= r or not paper[ny][nx]:
                    continue
                Q.append((ny, nx)); paper[ny][nx] = 0
        max_area = max(max_area, p_area)
        
print(f'{p_cnt}\n{max_area}')
