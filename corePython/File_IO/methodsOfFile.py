file = open("Hello.txt")
str = file.read(10)
position = file.tell()
position = file.seek(0,0)
print(position)
print(str)