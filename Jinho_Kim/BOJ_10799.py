import sys
input = sys.stdin.readline

total_cnt = stck_cnt = l_flag = 0

for p in input().rstrip():
    if p == '(':
        stck_cnt += 1
        l_flag = 1
    else:
        stck_cnt -= 1
        if l_flag:
            l_flag = 0
            total_cnt += stck_cnt
        else:
            total_cnt += 1
print(total_cnt)