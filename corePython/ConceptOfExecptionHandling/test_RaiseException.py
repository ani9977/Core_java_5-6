try:
    number = int(input("Enter your number:"))
    if number>10:
        raise Exception("invalid number")
except Exception as e:
    print(e)