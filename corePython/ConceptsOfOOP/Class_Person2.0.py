class Person:
    def __init__(hi,name,age):
        hi.name = name
        hi.age = age
    def myFunc(bye):
        print("Hello my name is "+bye.name)
        print("And my age is "+bye.age)
p=Person("Ram",'36')
p.myFunc()