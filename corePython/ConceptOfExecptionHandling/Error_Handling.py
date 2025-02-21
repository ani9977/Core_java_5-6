try:
    d=int(input("Enter value:"))
    a='10'
    b='a'
    c=a/b
    print(c)
    print(d)
except TypeError as t:
    print("type error")
except ValueError as v:
    print("value error")
except ModuleNotFoundError as m:
    print("module not found")