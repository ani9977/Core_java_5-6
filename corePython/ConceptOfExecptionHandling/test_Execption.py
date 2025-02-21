a = 10
b = 4

try:
    c = a / b
    print("C:",c)
except ZeroDivisionError:
    print("check your division is zero")
finally:
    print("hi")


print("hello")