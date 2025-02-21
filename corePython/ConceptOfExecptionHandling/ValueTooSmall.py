try:
    number = int(input("Enter your number:"))
    if number<10:
        raise Exception("ValueTooSmallError")
    else:
        print(number)
except Exception as e:
    print(e)