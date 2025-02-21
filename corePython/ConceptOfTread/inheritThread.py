import threading
class hi(Thread):
    def run(self):
        for i in range(5):
            print("hi",i)

t1 = hi()
t1.start()