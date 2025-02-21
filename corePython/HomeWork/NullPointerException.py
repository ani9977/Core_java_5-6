a=4
try:
    if(a==0):
        raise Exception("Null Pointer Exception")
    else:
        print(a)
except Exception as e:
    print(e)