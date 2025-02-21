class shape:
    def __init__(self,color):
        self.color = color

    def getColor(self):
        return self.color

class Rectangle(shape):
    def __init__(self,l,b,color):
        super(Rectangle,self).__init__(color)
        self.l = l
        self.b = b

    def area(self):
        return self.l*self.b

R=Rectangle(10,20,"red")
print(R.area())