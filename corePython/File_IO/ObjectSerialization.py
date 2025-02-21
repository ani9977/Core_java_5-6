import pickle


class Employee:
    def __init__(self, eno, ename,id):
        self.eno = eno
        self.ename = ename
        self.id = id


e = Employee('abiket', 'anant',4)
f = open('C:/Users/Dell/OneDrive/Desktop/Test/serialization.txt','wb')
pickle.dump(e, f)
print('done')
f.close()

f = open('C:/Users/Dell/OneDrive/Desktop/Test/serialization.txt','rb')
e=pickle.load(f)
print(e.eno,e.ename,e.id)
f.close()