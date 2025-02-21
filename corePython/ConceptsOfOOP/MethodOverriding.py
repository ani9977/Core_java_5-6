class Shape:
    def area(self):
        return -1


class Circle(Shape):
    def __init__(self, radius):
        self.__radius = radius

    def area(self):
        return 3.14 * self.__radius ** 2


class Rectangle(Circle):
    def __init__(self, length, breadth):
        super(Rectangle,self).__init__(length,breadth,radius)
        self.__length = length
        self.__breadth = breadth

    def area(self):
        return self.__length * self.__breadth

class test:
    c=Circle(4)
    print(c.area())

