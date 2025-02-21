class shape:
    name = "circle"

    def change_name(self, new_name):
        self.name = new_name


shape = shape()
print(shape.name)
shape.change_name("triangle")
print(shape.name)
