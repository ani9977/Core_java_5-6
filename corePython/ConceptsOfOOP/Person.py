class person:

    def __init__(self, name, address, city):
        self.name = name
        self.address = address
        self.city = city

    def getName(self):
        return self.name

    def getAddress(self):
        return self.address

    def getCity(self):
        return self.city

    # def __del__(self):
    #     print("deleting")

    def __str__(self):
        return "%s"%(self.name)

name = input("Enter name:")
address = input("Enter address:")
city = input("Enter city:")


p = person(name,address,city)
print(id(p))
print(p.getName(), p.getAddress(), p.getCity(),p.__str__())

