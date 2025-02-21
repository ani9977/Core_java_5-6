try:
    a = int(input("Enter value of first number:"))
    b = int(input("Enter value of second number:"))
    c=a/b
    print(c)
except ZeroDivisionError:
    print("Division by zero error")
except ValueError:
    print("Non-numeric inputs provided")