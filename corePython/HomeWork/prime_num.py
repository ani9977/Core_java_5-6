a=44
count=0
i=1
for i in range(i,a+1):
    if(a%i==0):
        count=count+1
if(count==2):
    print("it is prime number")
else:
    print("Not a prime number")