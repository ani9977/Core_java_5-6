for i in range(1,3):
    a=153
    f=a
    s=0
    while(f!=0):
        r=a%10
        s=s+r**i
        f=(f-r)/10
        if(s==a):
            print("Yes it is an armstrong number.")