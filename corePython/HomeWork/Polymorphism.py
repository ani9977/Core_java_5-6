class shape:
    def __init__(self,color):
        self.color = color

    def area(self):
        pass

class Rectangle(shape):
    def __init__(self,l,b):
        self.l = l
        self.b = b

    def area(self):
        return self.l*self.b

class Triangle(shape):
    def __init__(self,base,h):
        self.base = base
        self.h = h

    def area(self):
        return 0.5*self.base*self.h

R=Rectangle(10,20)
T=Triangle(10,20)
print(R.area())
print(T.area())