N=int(input("Enter the number:"))
count = 0
for i in range(1,N):
    if(N%i==0):
        count=count+1

if(count==1):
    print("Yes it is a prime number")
else:
    print("not a prime number")