file = open("Hello.txt",'w')
text="hi"
while(text != "quit"):
    text = input("Enter the text:")
    if(text == "quit"):
        break
    file.write(text)
    file.write("\n")
file.close()

