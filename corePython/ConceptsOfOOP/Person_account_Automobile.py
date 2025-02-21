import datetime


class Person:
    def __init__(self, name, dob, address):
        self.name = name
        self.dob = dob
        self.address = address

    def getName(self):
        return self.name

    def getDob(self):
        D = datetime.datetime.now()
        Y = D.year
        return Y - self.dob

    def getAddress(self):
        return self.address


p = Person("anant", 2004, "old palasia")
print("Name:", p.getName(), "\nAge:", p.getDob(), "\nAddress:", p.getAddress())

# class Account:
#     def __init__(self, number, type, balance):
#         self.number = number
#         self.type = type
#         self.balance = balance
#
#     def getNumber(self):
#         return self.number
#
#     def getType(self):
#         return self.type
#
#     def getBalance(self):
#         return self.balance
#
# A=Account(1000001,"saving",10000000)
# print("Acc.No.:",A.getNumber(),"\nAcc.Type:",A.getType(),"\nAcc.Bal.:",A.getBalance())


# class Automobile:
#     def __init__(self,color,speed,make):
#         self.color = color
#         self.speed = speed
#         self.make = make
#
#     def getColor(self):
#         return self.color
#
#     def getSpeed(self):
#         return self.speed
#
#     def getMake(self):
#         return self.make
#
#     def Gear(self):
#         if(self.speed<20):
#             return 1
#         if(20<self.speed<=40):
#             return 2
#         if(40<self.speed<=60):
#             return 3
#         if(60<self.speed<=80):
#             return 4
#         if(self.speed>80):
#             return 5
#
# B=Automobile("red",48,"SUV")
# print("Color:",B.getColor(),"\nSpeed:",B.getSpeed(),"\nMake:",B.getMake(),"\nGear:",B.Gear())
