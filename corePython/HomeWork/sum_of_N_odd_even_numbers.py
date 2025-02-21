N = int(input("Enter value of N:"))
s=0
o=0
for i in range (1,N+1):
    if(i%2==0):
        s=s+i
    else:
        o=o+i;
print("Sum of even numbers till",N,"is:",s)
print("Sum of odd numbers till",N,"is:",o)