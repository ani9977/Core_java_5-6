class shape:
    def __init__(self, color, borderWidth):
        self.color = color
        self.borderWidth = borderWidth

    # def setColor(self,color):
    #     self.color = color
    #
    # def setBorderWidth(self,borderWidth):
    #     self.borderWidth = borderWidth

    def getColor(self):
        return self.color

    def getBorderWidth(self):
        return self.borderWidth


class Rectangle(shape):
    def __init__(self, length, width, color, borderWidth):
        super(Rectangle,self).__init__(color, borderWidth)
        self.length = length
        self.width = width

    def Area(self):
        return self.length * self.width
class Triangle(shape):
    def __init__(self,base,height,color,borderWidth):
        super(Triangle,self).__init__(color,borderWidth)
        self.base = base
        self.height = height
    def Area(self):
        return 0.5*self.base*self.height

class Circle(shape):
    def __init__(self,radius,color,borderWidth):
        super(Circle,self).__init__(color,borderWidth)
        self.radius=radius
    def Area(self):
        return 3.14*self.radius*self.radius

r = Rectangle(10, 20,"red",13)
t=Triangle(10,10,"green",6)
c=Circle(20,"blue",23)
# r.setColor("red")
# r.setBorderWidth(20)
print("RECTANGLE:")
print(r.Area())
print(r.getColor(),r.getBorderWidth())
print("\nTRIANGLE:")
print(t.Area())
print(t.getColor(),t.getBorderWidth())
print("\nCIRCLE:")
print(c.Area())
print(c.getColor(),c.getBorderWidth())
