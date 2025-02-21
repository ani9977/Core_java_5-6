def sumNum(a,*vrag):
    t=a
    for n in vrag:
        t+=n
    return t
total=sumNum(6,2,3,4,5)
print("Total:",total)