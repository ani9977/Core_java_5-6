'''name = "Ram"
age = 16
amount = 99.99
print(type(name))
print(age)
print(amount)
list1 = [10, 20, 30, 40, 50, 60, 70]
list2 = [1, 2, 3, 4, 5, 6, 7]
print(len(list1))
a = max(list1)
print(a)
b = min(list2)
print(b)'''
from filecmp import cmp

#DICTIONARY

d={'name':'Anant','surname':'Agrawal','age':19}
k=d.keys()
v=d.values()
print (k)
print (v)

#DATA TYPES

'''x=19
y=29.54
z=2j

print(x,"is",type(x))
print(y,"is",type(y))
print(z,"is",type(z))'''

#CONVERSION

'''x=19
y=29.54
z=2j
a=float(x)
b=complex(z)
c=complex(y)
print(a)
print(b)
print(c)'''

#RANDOM NUMBER

#1.)Choice()Method

'''import random
list=[1,2,3,4,5,6,7]
print("choice(list):",random.choice(list))'''

#2.)Randrange()Method

'''import random
print("RandRange(100,1000,2):",random.randrange(100,1000,2))'''

#3.)random()Method

'''import random
print("Random number:",random.random())'''

#4.)seed()Method

'''import random
random.seed(10)
print("random number with seed 10:",random.random())'''

#5.)shuffle()Method

'''import random
list=[10,20,30,40,50,60,70]
random.shuffle(list)
print("Reshuffled list:",list)'''

#6.)Uniform()Method

'''import random
x=5
y=15
print("Random float uniform(",x,",",y,"):",random.uniform(x,y))'''

#STRINGS

'''str1='Anant '
str2='Agrawal'
print(str1[0:2])
print(str1[4])
print(str2*2)
print(str1+str2)'''

#LIST

'''list=[1,2,3,4,5,6,7,8,9]
list.append([10,11])
print("List after append:",list)
print("list[3]:",list][3])'''

