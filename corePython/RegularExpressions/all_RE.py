import re
txt = "the rain in Spain"

#findall()
# a = re.findall('ai',txt)
# print(a)


#search()
# b = re.search('world',txt)
# if b:
#     print("found in txt")
# else:
#     print("Not found")



#split()
# c = re.split('\\s',txt)
# print(c)


#sub()
d= re.sub("\\s",",",txt)
print(d)