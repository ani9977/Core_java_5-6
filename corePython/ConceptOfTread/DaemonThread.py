import threading
import time
def first_thread():
    print("hello Ram")
    time.sleep(1)
    print('Bye Ram')

def second_thread():
    print("Hello Shayam")
    print("Bye Shayam")

t1 = threading.Thread(target=first_thread)
t2 = threading.Thread(target=second_thread,daemon=True)

t1.start()
t2.start()