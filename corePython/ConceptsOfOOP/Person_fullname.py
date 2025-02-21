class Person:
    def setFirstnam(self, fname):
        self.firstname = fname

    def setLastname(self, lname):
        self.lastname = lname

    def getFirstname(self):
        return self.firstname

    def getLastname(self):
        return self.lastname


class Fullname(Person):
    def fullname(self):
        f=(self.fname+self.lname)
        print(f)

A=Fullname()
A.setFirstnam("Anant")
A.setLastname(" Agrawal")
print(A.getFirstname() + A.getLastname())