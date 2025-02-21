class Rectangle:
    def __init__(self,length,breadth):
        self.length = length
        self.breadth = breadth

    def getLength(self):
        return self.length
    def getBreadth(self):
        return self.breadth
    def area(self):
        return self.length*self.breadth

R=Rectangle(10,20)
print(R.area())