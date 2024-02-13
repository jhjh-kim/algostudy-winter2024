# have to study more..
A=input()
S=[]
VAL=[[]]
for a in A:
  if a in"([":S+=[a];VAL+=[[]]
  elif a==')':
    if not S or S[-1]=='[':print(0);quit()
    S.pop()
    t=max(1,sum(VAL.pop()))
    VAL[-1].append(t*2)
  else:
    if not S or S[-1]=='(':print(0);quit()
    S.pop()
    t=max(1,sum(VAL.pop()))
    VAL[-1].append(t*3)
  #print(a,S,VAL)
if len(S):print(0)
else:print(sum(VAL[0]))