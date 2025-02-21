from abc import ABC, abstractmethod
class shape:
    def __init__(self,color):
        self.color = color

    @abstractmethod
    def area(self):
        pass
class Rectangle(shape):
    def __init__(self,l,b):
        self.l = l
        self.b = b

    def area(self):
        return self.l*self.b

R=Rectangle(10,20)
print(R.area())