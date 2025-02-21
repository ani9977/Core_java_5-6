class parent:
    def __init__(self,name):
        self.name = name
        self._health = "Good"
        self.__age = 46

    def get_age(self):
        return self.__age

class Child(parent):
    def __init__(self,name,age):
        super().__init__(name)
        self.__age = age

C = Child("anant",19)
print(C.name)
print(C._Child__age)